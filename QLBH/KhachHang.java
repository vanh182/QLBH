/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLBH;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author VAN ANH
 */
public class KhachHang extends QLBH{
    protected String MaKH;
    protected String HoTen;
    protected String DChi;
    protected String Sdt;
    protected String NgSinh;
    protected String NgDK;
    protected long DoanhSo;
    //protected String LoaiKH;

    public KhachHang() {
    }

    public KhachHang(String MaKH, String HoTen, String DChi, String Sdt, String NgSinh, String NgDK, long DoanhSo) {
        this.MaKH = MaKH;
        this.HoTen = HoTen;
        this.DChi = DChi;
        this.Sdt = Sdt;
        this.NgSinh = NgSinh;
        this.NgDK = NgDK;
        this.DoanhSo = DoanhSo;
        //this.LoaiKH = LoaiKH;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getDChi() {
        return DChi;
    }

    public void setDChi(String DChi) {
        this.DChi = DChi;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getNgSinh() {
        return NgSinh;
    }

    public void setNgSinh(String NgSinh) {
        this.NgSinh = NgSinh;
    }

    public String getNgDK() {
        return NgDK;
    }

    public void setNgDK(String NgDK) {
        this.NgDK = NgDK;
    }

    public long getDoanhSo() {
        return DoanhSo;
    }

    public void setDoanhSo(long DoanhSo) {
        this.DoanhSo = DoanhSo;
    }

  

    @Override
    public void Nhap() {
//        System.out.println("Nhap MaKH: ");
//        Scanner in = new Scanner(System.in);
//        this.MaKH = in.nextLine();
//        System.out.println("Nhap Ho ten: ");
//        this.HoTen = in.nextLine();
//        System.out.println("Nhap Dia chi: ");
//        this.DChi = in.nextLine();
//        System.out.println("Nhap So dien thoai: ");
//        this.Sdt = in.nextLine();
//         System.out.println("Nhap Ngay sinh: ");
//        this.NgSinh = in.nextLine();
//         System.out.println("Nhap Ngay dang ky: ");
//        this.NgDK = in.nextLine();
//         System.out.println("Nhap Doanh so: ");
//        this.DoanhSo = in.nextDouble();
//         System.out.println("Nhap Loai khach hang: ");
//        this.LoaiKH = in.nextLine();
    }

    @Override
    public void Xuat() {
     System.out.print("MaKH: " + this.MaKH + " |Ho ten: " + this.HoTen + " |Dia chi: "+this.DChi+" |So dien thoai: " + this.Sdt + " |Ngay sinh: " + this.NgSinh+" |Ngay dang ky: ");//+this.NgDK+" |Doanh so: "+this.DoanhSo+" |Loai khach hang: "+this.LoaiKH);
     System.out.printf(" |Doanh so: ", this.DoanhSo);
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
