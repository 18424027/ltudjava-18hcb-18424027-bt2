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
public class LopHoc {
    private Integer Id;
    private String MaLop;
    private String TenLop;

    public LopHoc() {
    }

    public LopHoc(Integer id) {
        this.Id = id;
    }

    public LopHoc(Integer Id, String MaLop, String TenLop) {
        this.Id = Id;
        this.MaLop = MaLop;
        this.TenLop = TenLop;
    }
    
    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    public String getMaLop() {
        return this.MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }
    
    public String getTenLop() {
        return this.TenLop;
    }
    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }
}
