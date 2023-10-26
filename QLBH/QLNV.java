/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLBH;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author VAN ANH
 */
public class QLNV implements QuanLy {

    static int countNV = 0;
    ArrayList<NhanVien> listNV = new ArrayList<>();

    public QLNV() {
    }

    public void Them(NhanVien n) {
        listNV.add(n);
        countNV++;
    }

    @Override
    public void Xuat() {
        for (NhanVien nv : listNV) {
            nv.Xuat();
        }

    }

    @Override
    public void Xoa() {
        int flag = 0;
        System.out.println("Nhap MANV can xoa: ");
        Scanner in = new Scanner(System.in);
        String MANV = in.nextLine();
        for (NhanVien nv : listNV) {
            if (MANV.equalsIgnoreCase(nv.MANV)) {
                listNV.remove(listNV.indexOf(nv));
                flag = 1;
                break; //ko trung ID
            }
        }
        if (flag == 1) {
            System.out.println("Da xoa nhan vien: " + MANV);
        } else {
            System.out.println("MANV khong ton tai");
        }
    }

    @Override
    public void CapNhat() {
        int flag = 0;
        System.out.println("Nhap MANV can cap nhat thong tin: ");
        Scanner in = new Scanner(System.in);
        String MANV = in.nextLine();
        NhanVien nvien = null;
        int index = 0;
        for (NhanVien nv : listNV) {
            if (MANV.equalsIgnoreCase(nv.MANV)) {
                nvien = nv;
                index = listNV.indexOf(nv);
                break; //ko trung ID
            }
        }
        if (nvien != null) {
            System.out.println("Nhap MSNV ");
            String MANV1 = in.nextLine();
            if (MANV1.equals("") || MANV1 == null) {
                MANV1 = nvien.MANV;
            }
            System.out.println("Nhap Ho ten ");
            String HOTEN = in.nextLine();
            if (HOTEN.equals("") || HOTEN == null) {
                HOTEN = nvien.HOTEN;
            }
            System.out.println("Nhap so dien thoai");
            String SODT = in.nextLine();
            if (SODT.equals("") || SODT == null) {
                SODT = String.valueOf(nvien.SODT);
            }
            System.out.println("Nhap ngay vao lam");
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            String NGVL = in.nextLine();
            if (NGVL == null) {
                NGVL = nvien.NGVL;
            }
            NhanVien nvnew = new NhanVien(MANV, HOTEN, SODT, NGVL);
            listNV.set(index, nvnew);
            flag = 1;
        }

        if (flag == 0) {
            System.out.println("MANV khong ton tai.");
        } else {
            System.out.println("Cap nhat thanh cong.");
        }
    }

    @Override
    public void TimKiem() {
        int flag = 0;
        System.out.println("Nhap MANV can tim: ");
        Scanner in = new Scanner(System.in);
        String MANV = in.nextLine();
        for (NhanVien nv : listNV) {
            if (MANV.equalsIgnoreCase(nv.MANV)) {

                nv.Xuat();
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("MANV khong ton tai.");
        }
    }

}
