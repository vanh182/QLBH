/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLBH;

import java.util.Scanner;

/**
 *
 * @author VAN ANH
 */
public class SanPham extends QLBH {

    protected String MaSP;
    protected String TenSP;
    protected String DVT;
    protected String NuocSX;
    protected long Gia;

    public SanPham() {
    }

    public SanPham(String MaSP, String TenSP, String DVT, String NuocSX, long Gia) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.DVT = DVT;
        this.NuocSX = NuocSX;
        this.Gia = Gia;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public String getNuocSX() {
        return NuocSX;
    }

    public void setNuocSX(String NuocSX) {
        this.NuocSX = NuocSX;
    }

    public long getGia() {
        return Gia;
    }

    public void setGia(long Gia) {
        this.Gia = Gia;
    }
    

    @Override
    public void Nhap() {
        System.out.println("Nhap MaSP: ");
        Scanner in = new Scanner(System.in);
        this.MaSP = in.nextLine();
        System.out.println("Nhap Ten san pham: ");
        this.TenSP = in.nextLine();
        System.out.println("Nhap Don vi tinh: ");
        this.DVT = in.nextLine();
        System.out.println("Nhap Nuoc san xuat: ");
        this.NuocSX = in.nextLine();
        System.out.println("Nhap Gia: ");
        this.Gia = in.nextLong();

    }

    @Override
    public void Xuat() {
        System.out.print("MaSP: " + this.MaSP + " |Ten san pham: " + this.TenSP + " |Don vi tinh: " + this.DVT + " |Nuoc san xuat: "+this.NuocSX);
        System.out.printf(" |Gia: %.2f", this.Gia);
        System.out.println("");
    }

    @Override
    public void Xoa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void CapNhat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void TimKiem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
