/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLBH;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author VAN ANH
 */
public class NhanVien extends QLBH {

    protected String MANV;
    protected String HOTEN;
    protected String SODT;
    protected String NGVL;

    public NhanVien() {
    }
    
    public NhanVien(String MANV, String HOTEN, String SODT, String NGVL) {
        this.MANV = MANV;
        this.HOTEN = HOTEN;
        this.SODT = SODT;
        this.NGVL = NGVL;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getHOTEN() {
        return HOTEN;
    }

    public void setHOTEN(String HOTEN) {
        this.HOTEN = HOTEN;
    }

    public String getSODT() {
        return SODT;
    }

    public void setSODT(String SODT) {
        this.SODT = SODT;
    }

    public String getNGVL() {
        return NGVL;
    }

    public void setNGVL(String NGVL) {
        this.NGVL = NGVL;
    }



    @Override
    public void Nhap() {
        System.out.println("Nhap MANV: ");
        Scanner in = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        this.MANV = in.nextLine();
        System.out.println("Nhap Ho ten: ");
        this.HOTEN = in.nextLine();
        System.out.println("Nhap so dien thoai");
        this.SODT = in.nextLine();
        System.out.println("Nhap ngay vao lam");
        this.NGVL = in.nextLine();
    }

    @Override
    public void Xuat() {
         SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("MSNV: " + this.MANV + " |Ho ten: " + this.HOTEN + " |So dien thoai: " + this.SODT + " |Ngay vao lam: " + df.format(this.NGVL));
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
