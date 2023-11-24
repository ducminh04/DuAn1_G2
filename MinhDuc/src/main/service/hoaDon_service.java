/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.service;

import Repo.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import main.model.hoaDon;

/**
 *
 * @author HP
 */
public class hoaDon_service {
    private final Connection con = DBContext.getConnection();

    public ArrayList<hoaDon> getListHoaDon() {
        ArrayList<hoaDon> listHoaDon = new ArrayList<>();
        try {
            String sql = "select MaHoaDon, NgayTaoHoaDon, MaNhanVien, NhanVien.HoTen, KhachHang.HoTen, MaKhachHang, KhachHang.SoDienThoai,  HoaDon.TongTienHoaDon  from KhachHang join HoaDon on HoaDon.id_KhachHang = KhachHang.id_KhachHang\n"
                    + "                join NhanVien on HoaDon.id_NhanVien = NhanVien.id_NhanVien\n"
                    + " ";
            PreparedStatement psm = con.prepareStatement(sql);
            ResultSet rs = psm.executeQuery();
            while(rs.next()){
                hoaDon hd = new hoaDon();
                hd.setMaHoaDon(rs.getString(1));
                hd.setNgayTaoHoaDon(rs.getDate(2));
                hd.setMaNhanVien(rs.getString(3));
                hd.setTenNhanVien(rs.getString(4));
                hd.setTenKhachHang(rs.getString(5));
                hd.setMaKhachHang(rs.getString(6));
                hd.setSdtKH(rs.getString(7));
                hd.setTongTienHoaDon(rs.getDouble(8));
                
                listHoaDon.add(hd);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }

}
