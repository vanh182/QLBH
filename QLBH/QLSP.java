/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLBH;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author VAN ANH
 */
public class QLSP implements QuanLy{
     static int countSP = 0;
    ArrayList<SanPham> listSP = new ArrayList<>();

    public QLSP() {
    }

    public void Them(SanPham n) {
        listSP.add(n);
        countSP++;
    }

    @Override
    public void Xuat() {
        for (SanPham sp : listSP) {
           sp.Xuat();
        }
    }

    @Override
    public void Xoa() {
        int flag = 0;
        System.out.println("Nhap MaSP can xoa: ");
        Scanner in = new Scanner(System.in);
        String masp = in.nextLine();
        for (SanPham sp : listSP) {
            if (masp.equalsIgnoreCase(sp.MaSP)) {
                listSP.remove(listSP.indexOf(sp));
                flag = 1;
                break; //ko trung ID
            }
        }
        if (flag == 1) {
            System.out.println("Da xoa san pham: " + masp);
        } else {
            System.out.println("MaSP khong ton tai");
        }
    }

    @Override
    public void CapNhat() {
        int flag = 0;
        System.out.println("Nhap MaSP can cap nhat thong tin: ");
        Scanner in = new Scanner(System.in);
        String masp = in.nextLine();
        SanPham spham = null;
        int index = 0;
        for (SanPham sp : listSP) {
            if (masp.equalsIgnoreCase(sp.MaSP)) {
                 spham= sp;
                index = listSP.indexOf(sp);
                break; //ko trung ID
            }
        }
        if (spham != null) {
            System.out.println("Nhap MaSP: ");
            String MaSP = in.nextLine();
            if (MaSP.equals("") || MaSP == null) {
                MaSP = spham.MaSP;
            }
            System.out.println("Nhap Ten san pham: ");
            String tensp = in.nextLine();
            if (tensp.equals("") || tensp == null) {
                tensp = spham.TenSP;
            }
            System.out.println("Nhap Don vi tinh: ");
            String dvt = in.nextLine();
            if (dvt.equals("") || dvt == null) {
                dvt = spham.DVT;
            }
            
            System.out.println("Nhap Nuoc san xuat: ");
            String nuocsx = in.nextLine();
            if (nuocsx.equals("") || nuocsx == null) {
                nuocsx = String.valueOf(spham.NuocSX);
            }
            System.out.println("Nhap Gia san pham: ");
            String gia = in.nextLine();
            if (gia.equals("") || gia == null) {
                gia = String.valueOf(spham.Gia);
            }            
            SanPham spnew = new SanPham(MaSP, tensp, dvt, nuocsx,Long.parseLong(gia));
            listSP.set(index, spnew);
            flag = 1;
        }

        if (flag == 0) {
            System.out.println("MaSP khong ton tai.");
        } else {
            System.out.println("Cap nhat thanh cong.");
        }
    }

    @Override
    public void TimKiem() {
         int flag = 0;
        System.out.println("Nhap MaSP can tim: ");
        Scanner in = new Scanner(System.in);
        String masp = in.nextLine();
        for (SanPham sp : listSP) {
            if (masp.equalsIgnoreCase(sp.MaSP)) {

                sp.Xuat();
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("MaSP khong ton tai.");
        }
        
    }

}
