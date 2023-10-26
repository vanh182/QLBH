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
public class QLKH implements QuanLy {

    static int countKH = 0;
    ArrayList<KhachHang> listKH = new ArrayList<>();

    public QLKH() {
    }

    public void Them(KhachHang n) {
        listKH.add(n);
        countKH++;
    }

    @Override
    public void Xuat() {
        for (KhachHang kh : listKH) {
            kh.Xuat();
        }

    }

    @Override
    public void Xoa() {
        int flag = 0;
        System.out.println("Nhap MaKH can xoa: ");
        Scanner in = new Scanner(System.in);
        String makh = in.nextLine();
        for (KhachHang kh : listKH) {
            if (makh.equalsIgnoreCase(kh.MaKH)) {
                listKH.remove(listKH.indexOf(kh));
                flag = 1;
                break; //ko trung ID
            }
        }
        if (flag == 1) {
            System.out.println("Da xoa khach hang: " + makh);
        } else {
            System.out.println("MaKH khong ton tai");
        }
    }

    @Override
    public void CapNhat() {

    }

    @Override
    public void TimKiem() {
        int flag = 0;
        System.out.println("Nhap MaKH can tim: ");
        Scanner in = new Scanner(System.in);
        String makh = in.nextLine();
        for (KhachHang kh : listKH) {
            if (makh.equalsIgnoreCase(kh.MaKH)) {

                kh.Xuat();
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("MaKH khong ton tai.");
        }
    }
}
