/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.model;

/**
 *
 * @author HP
 */
public class TaiKhoan_model {

    private int id_taikhoan;
    private String tenDangNhap;
    private String matKhau;
    private boolean vaiTro;

    public TaiKhoan_model() {
    }

    public int getId_taikhoan() {
        return id_taikhoan;
    }

    public void setId_taikhoan(int id_taikhoan) {
        this.id_taikhoan = id_taikhoan;
    }

    public TaiKhoan_model(int id_taikhoan, String tenDangNhap, String matKhau, boolean vaiTro) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.vaiTro = vaiTro;
        this.id_taikhoan = id_taikhoan;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public boolean getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "id_taikhoan=" + id_taikhoan + ", tenDangNhap=" + tenDangNhap + ", matKhau=" + matKhau + ", vaiTro=" + vaiTro + '}';
    }



 
}
