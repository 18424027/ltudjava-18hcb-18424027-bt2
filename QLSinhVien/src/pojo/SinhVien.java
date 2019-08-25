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

    private Integer Id;
    private String MSSV;
    private String HoTen;
    private Integer GioiTinh;
    private String CMND;
//    private Integer LopHocId;
    private LopHoc LopHoc;

    public SinhVien() {
    }

    public SinhVien(Integer id) {
        this.Id = id;
    }

    public SinhVien(Integer id, LopHoc LopHoc) {
        this.Id = id;
        this.LopHoc = LopHoc;
    }

    public SinhVien(Integer id, String mSSV, String hoTen, Integer gioiTinh, String cMND, LopHoc lopHocId) {
        this.Id = id;
        this.MSSV = mSSV;
        this.HoTen = hoTen;
        this.GioiTinh = gioiTinh;
        this.CMND = cMND;
        this.LopHoc = lopHocId;
    }

    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer id) {
        this.Id = id;
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

    public Integer getGioiTinh() {
        return this.GioiTinh;
    }

    public void setGioiTinh(Integer gioiTinh) {
        this.GioiTinh = gioiTinh;
    }

    public String getCMND() {
        return this.CMND;
    }

    public void setCMND(String cMND) {
        this.CMND = cMND;
    }

//    public Integer getLopHocId() {
//        return this.LopHocId;
//    }
//
//    public void setLopHocId(Integer lopHocId) {
//        this.LopHocId = lopHocId;
//    }

    public LopHoc getLopHoc() {
        return this.LopHoc;
    }

    public void setLopHoc(LopHoc LopHoc) {
        this.LopHoc = LopHoc;
    }
}
