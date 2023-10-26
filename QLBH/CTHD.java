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
public class CTHD extends QLBH{
    protected String SoHD;
    protected String MaSP;
    protected int SL;

    public CTHD() {
    }

    public CTHD(String SoHD, String MaSP, int SL) {
        this.SoHD = SoHD;
        this.MaSP = MaSP;
        this.SL = SL;
    }

    public String getSoHD() {
        return SoHD;
    }

    public void setSoHD(String SoHD) {
        this.SoHD = SoHD;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }
    
    

    @Override
    public void Nhap() {
        System.out.println("Nhap So hoa don: ");
        Scanner in = new Scanner(System.in);
        this.SoHD = in.nextLine();
        System.out.println("Nhap Ma san pham: ");
        this.MaSP = in.nextLine();
        System.out.println("Nhap So luong: ");
        this.SL = in.nextInt();
    }

    @Override
    public void Xuat() {
        System.out.print("SoHD: " + this.SoHD + " |Ma san pham: " + this.MaSP + " |So luong: " + this.SL);
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
