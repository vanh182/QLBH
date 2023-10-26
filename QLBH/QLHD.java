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
public class QLHD implements QuanLy {

    static int countHD = 0;
    ArrayList<HoaDon> listHD = new ArrayList<>();

    public QLHD() {
    }

    public void Them(HoaDon n) {
        listHD.add(n);
        countHD++;
    }

    @Override
    public void Xuat() {
        for (HoaDon hd : listHD) {
            hd.Xuat();
        }
    }

    @Override
    public void Xoa() {
        int flag = 0;
        System.out.println("Nhap So hoa don can xoa: ");
        Scanner in = new Scanner(System.in);
        String sohd = in.nextLine();
        for (HoaDon hd : listHD) {
            if (sohd.equalsIgnoreCase(hd.SoHD)) {
                listHD.remove(listHD.indexOf(hd));
                flag = 1;
                break; //ko trung ID
            }
        }
        if (flag == 1) {
            System.out.println("Da xoa hoa don: " + sohd);
        } else {
            System.out.println("SoHD khong ton tai");
        }
    }

    @Override
    public void CapNhat() {
        int flag = 0;
        System.out.println("Nhap So hoa don can cap nhat thong tin: ");
        Scanner in = new Scanner(System.in);
        String sohd = in.nextLine();
        HoaDon hdon = null;
        int index = 0;
        for (HoaDon hd : listHD) {
            if (sohd.equalsIgnoreCase(hd.SoHD)) {
                hdon = hd;
                index = listHD.indexOf(hd);
                break; //ko trung ID
            }
        }
        if (hdon != null) {
            System.out.println("Nhap So hoa don: ");
            String SoHD = in.nextLine();
            if (SoHD.equals("") || SoHD == null) {
                SoHD = hdon.SoHD;
            }
            System.out.println("Nhap Ngay hoa don: ");
            String nghd = in.nextLine();
            if (nghd.equals("") || nghd == null) {
                nghd = hdon.NgHD;
            }
            System.out.println("Nhap Ma khach hang: ");
            String makh = in.nextLine();
            if (makh.equals("") || makh == null) {
                makh = hdon.MaKH;
            }
            System.out.println("Nhap Ma nhan vien: ");
            String manv = in.nextLine();
            if (manv.equals("") || manv == null) {
                manv = String.valueOf(hdon.MaNV);
            }
            System.out.println("Nhap Tri gia: ");
            String trigia = in.nextLine();
            if (trigia.equals("") || trigia == null) {
                trigia = String.valueOf(hdon.TriGia);
            }
            HoaDon hdnew = new HoaDon(SoHD, nghd, makh, manv, Long.parseLong(trigia));
            listHD.set(index, hdnew);
            flag = 1;
        }
        if (flag == 0) {
            System.out.println("SoHD khong ton tai.");
        } else {
            System.out.println("Cap nhat thanh cong.");
        }
    }

    @Override
    public void TimKiem() {
        int flag = 0;
        System.out.println("Nhap So hoa don can tim: ");
        Scanner in = new Scanner(System.in);
        String sohd = in.nextLine();
        for (HoaDon hd : listHD) {
            if (sohd.equalsIgnoreCase(hd.SoHD)) {

                hd.Xuat();
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("SoHD khong ton tai.");
        }
    }

}
