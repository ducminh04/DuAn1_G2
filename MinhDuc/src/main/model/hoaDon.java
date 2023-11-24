/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class hoaDon {

    private int id_hoaDon;
    private String maHoaDon;
    private double tongTienHoaDon;
    private String maNhanVien;
    private String tenNhanVien;
    private String maKhachHang;
    private String tenKhachHang;
    private Date ngayTaoHoaDon;
    private String trangThaiHoaDon;
    private String ghiChuHoaDon;
    private String hinhThucThanhToan;
    private int id_khachHang;
    private int id_NhanVien;
    private String sdtKH;

    public hoaDon() {
    }

    public hoaDon(int id_hoaDon, String maHoaDon, double tongTienHoaDon, String maNhanVien, String tenNhanVien, String maKhachHang, String tenKhachHang, Date ngayTaoHoaDon, String trangThaiHoaDon, String ghiChuHoaDon, String hinhThucThanhToan, int id_khachHang, int id_NhanVien, String sdtKH) {
        this.id_hoaDon = id_hoaDon;
        this.maHoaDon = maHoaDon;
        this.tongTienHoaDon = tongTienHoaDon;
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.ngayTaoHoaDon = ngayTaoHoaDon;
        this.trangThaiHoaDon = trangThaiHoaDon;
        this.ghiChuHoaDon = ghiChuHoaDon;
        this.hinhThucThanhToan = hinhThucThanhToan;
        this.id_khachHang = id_khachHang;
        this.id_NhanVien = id_NhanVien;
    }

    public int getId_hoaDon() {
        return id_hoaDon;
    }

    public void setId_hoaDon(int id_hoaDon) {
        this.id_hoaDon = id_hoaDon;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public double getTongTienHoaDon() {
        return tongTienHoaDon;
    }

    public void setTongTienHoaDon(double tongTienHoaDon) {
        this.tongTienHoaDon = tongTienHoaDon;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSdtKH() {
        return sdtKH;
    }

    public void setSdtKH(String sdtKH) {
        this.sdtKH = sdtKH;
    }

    public Date getNgayTaoHoaDon() {
        return ngayTaoHoaDon;
    }

    public void setNgayTaoHoaDon(Date ngayTaoHoaDon) {
        this.ngayTaoHoaDon = ngayTaoHoaDon;
    }

    public String getTrangThaiHoaDon() {
        return trangThaiHoaDon;
    }

    public void setTrangThaiHoaDon(String trangThaiHoaDon) {
        this.trangThaiHoaDon = trangThaiHoaDon;
    }

    public String getGhiChuHoaDon() {
        return ghiChuHoaDon;
    }

    public void setGhiChuHoaDon(String ghiChuHoaDon) {
        this.ghiChuHoaDon = ghiChuHoaDon;
    }

    public String getHinhThucThanhToan() {
        return hinhThucThanhToan;
    }

    public void setHinhThucThanhToan(String hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public int getId_khachHang() {
        return id_khachHang;
    }

    public void setId_khachHang(int id_khachHang) {
        this.id_khachHang = id_khachHang;
    }

    public int getId_NhanVien() {
        return id_NhanVien;
    }

    public void setId_NhanVien(int id_NhanVien) {
        this.id_NhanVien = id_NhanVien;
    }

    @Override
    public String toString() {
        return "hoaDon{" + "id_hoaDon=" + id_hoaDon + ", maHoaDon=" + maHoaDon + ", tongTienHoaDon=" + tongTienHoaDon + ", maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", maKhachHang=" + maKhachHang + ", tenKhachHang=" + tenKhachHang + ", ngayTaoHoaDon=" + ngayTaoHoaDon + ", trangThaiHoaDon=" + trangThaiHoaDon + ", ghiChuHoaDon=" + ghiChuHoaDon + ", hinhThucThanhToan=" + hinhThucThanhToan + ", id_khachHang=" + id_khachHang + ", id_NhanVien=" + id_NhanVien + ", sdtKH=" + sdtKH + '}';
    }


    
}
