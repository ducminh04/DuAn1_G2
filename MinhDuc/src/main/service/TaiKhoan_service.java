/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.service;

import Repo.DBContext;
import com.sun.org.apache.bcel.internal.generic.RET;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import main.model.TaiKhoan_model;

/**
 *
 * @author HP
 */
public class TaiKhoan_service {

    private final Connection con = DBContext.getConnection();

    public ArrayList<TaiKhoan_model> getAllTaiKhoan() {
        ArrayList<TaiKhoan_model> listTaiKhoan = new ArrayList<>();
        try {
            String sql = "select id_NhanVien, TenDangNhap, MatKhau, VaiTro  from NhanVien";
            PreparedStatement psm = con.prepareStatement(sql);
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {
                TaiKhoan_model tk = new TaiKhoan_model();
                tk.setId_taikhoan(rs.getInt("id_NhanVien"));
                tk.setTenDangNhap(rs.getString("TenDangNhap"));
                tk.setMatKhau(rs.getString("MatKhau"));
                tk.setVaiTro(rs.getBoolean("VaiTro"));

                listTaiKhoan.add(tk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listTaiKhoan;
    }

    public Integer addTK(TaiKhoan_model tk) {
        Integer row = null;
        try {
            String sql = "insert into NhanVien ( TenDangNhap, MatKhau, VaiTro)\n"
                    + "values (?,?,?)";
           PreparedStatement psm = con.prepareStatement(sql);
           psm.setString(1, tk.getTenDangNhap());
           psm.setString(2, tk.getMatKhau());
           psm.setBoolean(3, tk.getVaiTro());
          
           psm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return row;
    }

}
