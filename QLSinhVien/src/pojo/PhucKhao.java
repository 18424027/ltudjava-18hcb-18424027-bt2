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
public class PhucKhao {
    private Integer Id;
    private Date TuNgay;
    private Date DenNgay;
    private Integer HocKyId;

    public PhucKhao() {
    }

    public PhucKhao(Integer id) {
        this.Id = id;
    }

    public PhucKhao(Integer Id, Date TuNgay, Date DenNgay, Integer HocKyId) {
        this.Id = Id;
        this.TuNgay = TuNgay;
        this.DenNgay = DenNgay;
        this.HocKyId = HocKyId;
    }
    
    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
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
    
    public Integer getHocKyId() {
        return this.HocKyId;
    }

    public void setHocKyId(Integer HocKyId) {
        this.HocKyId = HocKyId;
    }
}
