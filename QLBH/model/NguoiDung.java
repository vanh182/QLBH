/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLBH.model;

/**
 *
 * @author VAN ANH
 */
public class NguoiDung {
    private String TenDN, MatKhau, VaiTro;

    public NguoiDung() {
    }

    public NguoiDung(String TenDN, String MatKhau, String VaiTro) {
        this.TenDN = TenDN;
        this.MatKhau = MatKhau;
        this.VaiTro = VaiTro;
    }

    public String getTenDN() {
        return TenDN;
    }

    public void setTenDN(String TenDN) {
        this.TenDN = TenDN;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }

    
}
