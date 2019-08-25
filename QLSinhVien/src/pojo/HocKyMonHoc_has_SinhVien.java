/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author hieu
 */
public class HocKyMonHoc_has_SinhVien {
    private Integer HocKy_MonHoc_Id;
    private Integer SinhVienId;
    private Float DiemGK;
    private Float DiemCK;
    private Float DiemKhac;
    private Float DiemTong;
    private Integer Id;

    public HocKyMonHoc_has_SinhVien() {
    }

    public HocKyMonHoc_has_SinhVien(Integer id) {
        this.Id = id;
    }

    public HocKyMonHoc_has_SinhVien(Integer Id, Integer HocKy_MonHoc_Id, Integer SinhVienId, Float DiemGK, Float DiemCK,Float DiemKhac, Float DiemTong) {
        this.Id = Id;
        this.HocKy_MonHoc_Id = HocKy_MonHoc_Id;
        this.SinhVienId = SinhVienId;
        this.DiemGK = DiemGK;
        this.DiemCK = DiemCK;
        this.DiemKhac = DiemKhac;
        this.DiemTong = DiemTong;
    }
    
    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    
    public Integer getHocKy_MonHoc_Id() {
        return this.HocKy_MonHoc_Id;
    }

    public void setHocKy_MonHoc_Id(Integer HocKy_MonHoc_Id) {
        this.HocKy_MonHoc_Id = HocKy_MonHoc_Id;
    }
    
    public Integer getSinhVienId() {
        return this.SinhVienId;
    }

    public void setSinhVienId(Integer SinhVienId) {
        this.SinhVienId = SinhVienId;
    }
    
    public Float getDiemGK() {
        return this.DiemGK;
    }

    public void setDiemGK(Float DiemGK) {
        this.DiemGK = DiemGK;
    }
    
    public Float getDiemCK() {
        return this.DiemCK;
    }

    public void setDiemCK(Float DiemCK) {
        this.DiemCK = DiemCK;
    }
    
    public Float getDiemKhac() {
        return this.DiemKhac;
    }

    public void setDiemKhac(Float DiemKhac) {
        this.DiemKhac = DiemKhac;
    }
    
    public Float getDiemTong() {
        return this.DiemTong;
    }

    public void setDiemTong(Float DiemTong) {
        this.DiemTong = DiemTong;
    }
}
