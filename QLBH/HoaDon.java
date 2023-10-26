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
public class HoaDon extends QLBH {

    protected String SoHD;
    protected String NgHD;
    protected String MaKH;
    protected String MaNV;
    protected long TriGia;

    public HoaDon() {
    }

    public HoaDon(String SoHD, String NgHD, String MaKH, String MaNV, long TriGia) {
        this.SoHD = SoHD;
        this.NgHD = NgHD;
        this.MaKH = MaKH;
        this.MaNV = MaNV;
        this.TriGia = TriGia;
    }

    public String getSoHD() {
        return SoHD;
    }

    public void setSoHD(String SoHD) {
        this.SoHD = SoHD;
    }

    public String getNgHD() {
        return NgHD;
    }

    public void setNgHD(String NgHD) {
        this.NgHD = NgHD;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public long getTriGia() {
        return TriGia;
    }

    public void setTriGia(long TriGia) {
        this.TriGia = TriGia;
    }

    @Override
    public void Nhap() {
        System.out.println("Nhap So hoa don: ");
        Scanner in = new Scanner(System.in);
        this.SoHD = in.nextLine();
        System.out.println("Nhap Ngay hoa don: ");
        this.NgHD = in.nextLine();
        System.out.println("Nhap Ma khach hang: ");
        this.MaKH = in.nextLine();
        System.out.println("Nhap Ma nhan vien: ");
        this.MaNV = in.nextLine();
        System.out.println("Nhap Tri gia: ");
        this.TriGia = in.nextLong();
    }

    @Override
    public void Xuat() {
        System.out.print("SoHD: " + this.SoHD + " |Ngay hoa don: " + this.NgHD + " |Ma khach hang: " + this.MaKH + " |Ma nhan vien: " + this.MaNV);
        System.out.printf(" |Tri gia: %.2f", this.TriGia);
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
