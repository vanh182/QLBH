/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLBH;

/**
 *
 * @author VAN ANH
 */
public class ChiTiet {
    protected String SOHD;
    protected String MASP;
    protected String TENSP;
    protected String NUOCSX;
    protected long GIA;
    protected String DVT;
    protected int SL;
    protected long TONGGIA;

    public ChiTiet() {
    }

    public ChiTiet(String SOHD, String MASP, String TENSP, String NUOCSX, long GIA, String DVT, int SL, long TONGGIA) {
        this.SOHD = SOHD;
        this.MASP = MASP;
        this.TENSP = TENSP;
        this.NUOCSX = NUOCSX;
        this.GIA = GIA;
        this.DVT = DVT;
        this.SL = SL;
        this.TONGGIA = TONGGIA;
    }

    public String getSOHD() {
        return SOHD;
    }

    public void setSOHD(String SOHD) {
        this.SOHD = SOHD;
    }

    public String getMASP() {
        return MASP;
    }

    public void setMASP(String MASP) {
        this.MASP = MASP;
    }

    public String getTENSP() {
        return TENSP;
    }

    public void setTENSP(String TENSP) {
        this.TENSP = TENSP;
    }

    public String getNUOCSX() {
        return NUOCSX;
    }

    public void setNUOCSX(String NUOCSX) {
        this.NUOCSX = NUOCSX;
    }

    public double getGIA() {
        return GIA;
    }

    public void setGIA(long GIA) {
        this.GIA = GIA;
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public long getTONGGIA() {
        return TONGGIA;
    }

    public void setTONGGIA(long TONGGIA) {
        this.TONGGIA = TONGGIA;
    }

    

    
}
