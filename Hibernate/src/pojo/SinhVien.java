/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author HIEU
 */
public class SinhVien implements java.io.Serializable {

    private String MSSV;
    private String HoTen;
    private String GioiTinh;
    private String CMND;

    public SinhVien() {
    }

    public SinhVien(String mSSV) {
        this.MSSV = mSSV;
    }

    public SinhVien(String mSSV, String hoTen, String gioiTinh, String cMND) {
        this.MSSV = mSSV;
        this.HoTen = hoTen;
        this.GioiTinh = gioiTinh;
        this.CMND = cMND;
    }

    public String getMSSV() {
        return this.MSSV;
    }

    public void setMSSV(String mSSV) {
        this.MSSV = mSSV;
    }

    public String getHoTen() {
        return this.HoTen;
    }

    public void setHoTen(String hoTen) {
        this.HoTen = hoTen;
    }

    public String getGioiTinh() {
        return this.GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.GioiTinh = gioiTinh;
    }

    public String getCMND() {
        return this.CMND;
    }

    public void setCMND(String cMND) {
        this.CMND = cMND;
    }
    
}
