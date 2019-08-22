/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.Date;

/**
 *
 * @author hieu
 */
public class HocKy {
    private Integer Id;
    private String TenKhocKy;
    private Date TuNgay;
    private Date DenNgay;
    private String NienKhoa;

    public HocKy() {
    }

    public HocKy(Integer id) {
        this.Id = id;
    }

    public HocKy(Integer Id, String TenKhocKy, Date TuNgay, Date DenNgay,String NienKhoa) {
        this.Id = Id;
        this.TenKhocKy = TenKhocKy;
        this.TuNgay = TuNgay;
        this.DenNgay = DenNgay;
        this.NienKhoa = NienKhoa;
    }
    
    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    
    public String getTenHocKy() {
        return this.TenKhocKy;
    }

    public void setTenHocKy(String TenKhocKy) {
        this.TenKhocKy = TenKhocKy;
    }
    
    public Date getTuNgay() {
        return this.TuNgay;
    }

    public void setTuNgay(Date TuNgay) {
        this.TuNgay = TuNgay;
    }
    
    public Date getDenNgay() {
        return this.DenNgay;
    }

    public void setDenNgay(Date DenNgay) {
        this.DenNgay = DenNgay;
    }
    
    public String getNienKhoa() {
        return this.NienKhoa;
    }

    public void setNienKhoa(String NienKhoa) {
        this.NienKhoa = NienKhoa;
    }
}
