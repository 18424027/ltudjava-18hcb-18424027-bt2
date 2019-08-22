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
public class HocKy_MonHoc {
    private Integer Id;
    private Integer HocKyId;
    private Integer MonHocId;
    private String PhongHoc;

    public HocKy_MonHoc() {
    }

    public HocKy_MonHoc(Integer id) {
        this.Id = id;
    }

    public HocKy_MonHoc(Integer Id, Integer HocKyId, Integer MonHocId, String PhongHoc) {
        this.Id = Id;
        this.HocKyId = HocKyId;
        this.MonHocId = MonHocId;
        this.PhongHoc = PhongHoc;
    }
    
    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    
    public Integer getHocKyId() {
        return this.HocKyId;
    }

    public void setHocKyId(Integer HocKyId) {
        this.HocKyId = HocKyId;
    }
    
    public Integer getMonHocId() {
        return this.MonHocId;
    }

    public void setMonHocId(Integer MonHocId) {
        this.MonHocId = MonHocId;
    }
    
    public String getPhongHoc() {
        return this.PhongHoc;
    }

    public void setPhongHoc(String PhongHoc) {
        this.PhongHoc = PhongHoc;
    }
}
