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
public class MonHoc {
    private Integer Id;
    private String MaMon;
    private String TenMon;

    public MonHoc() {
    }

    public MonHoc(Integer id) {
        this.Id = id;
    }

    public MonHoc(Integer Id, String MaMon, String TenMon) {
        this.Id = Id;
        this.MaMon = MaMon;
        this.TenMon = TenMon;
    }
    
    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    
    public String getMaMon() {
        return this.MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }
    
    public String getTenMon() {
        return this.TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }
}
