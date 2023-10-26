/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLBH.dao;

import QLBH.KhachHang;
import QLBH.NhanVien;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VAN ANH
 */
public class KhachHangDao{
    private Connection conn;
    public KhachHangDao(){
        try {
            String dbURL = "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=QLBHDEMO;user=sa;password=sa";
            conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
                System.out.println("Connected");
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }
        } catch (SQLException ex) {
            System.err.println("Cannot connect database, " + ex);
        }
    }
    public boolean Insert(KhachHang n){
        String sql = "INSERT INTO [dbo].[KHACHHANG]([MAKH],[HOTEN],[DCHI],[SODT],[NGSINH],[NGDK],[DOANHSO])"
                +"values(?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, n.getMaKH());
            ps.setString(2, n.getHoTen());
            ps.setString(3, n.getDChi());
            ps.setString(4, n.getSdt());
            ps.setString(5,n.getNgSinh());
            ps.setString(6,n.getNgDK());
            ps.setDouble(7,n.getDoanhSo());        
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean Update(KhachHang n){
        String sql = "UPDATE dbo.KHACHHANG"+ 
                " SET HOTEN = ?,DCHI = ?,SODT = ?,NGSINH = ?,NGDK = ?,DOANHSO = ?"+
                " WHERE MAKH = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(7, n.getMaKH());
            ps.setString(1, n.getHoTen());
            ps.setString(2, n.getDChi());
            ps.setString(3, n.getSdt());
            ps.setString(4,n.getNgSinh());
            ps.setString(5,n.getNgDK());
            ps.setLong(6, n.getDoanhSo());            
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean Delete(String MAKH){
        String sql = "DELETE FROM dbo.KHACHHANG"
             + " WHERE MAKH = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MAKH);
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public KhachHang FindByID(String MAKH) throws Exception {
        String sql = "SELECT * FROM dbo.KHACHHANG WHERE MAKH =?";
        try ( PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, MAKH);
            try ( ResultSet rs = ps.executeQuery();) {
                if (rs.next()) {
                    KhachHang n = createKH(rs);
                    return n;
                }
            }
            return null;
        }
    }
 public List<String> getData() throws Exception {
        String sql = "SELECT * FROM dbo.KHACHHANG";
        try (PreparedStatement ps = conn.prepareStatement(sql);){
            try ( ResultSet rs = ps.executeQuery();) {
                List<String> list = new ArrayList<>();
                while (rs.next()) {
                    KhachHang nv = createKH(rs);
                    list.add(nv.getMaKH());
                }
                return list;
            }
        }
    }
    private KhachHang createKH(final ResultSet rs) throws SQLException {
        KhachHang n = new KhachHang();
        n.setMaKH(rs.getString("MAKH"));
        n.setHoTen(rs.getString("HOTEN"));
        n.setDChi(rs.getString("DCHI"));
        n.setSdt(rs.getString("SODT"));
        n.setNgSinh(rs.getString("NgSinh"));
        n.setNgDK(rs.getString("NgDK"));
        n.setDoanhSo(rs.getLong("DoanhSo"));
        return n;
    }
    
    public List<KhachHang> FindAll() throws Exception {
        String sql = "SELECT * FROM dbo.KHACHHANG";
        try (PreparedStatement ps = conn.prepareStatement(sql);){
            try ( ResultSet rs = ps.executeQuery();) {
                List<KhachHang> list = new ArrayList<>();
                while (rs.next()) {
                    KhachHang nv = createKH(rs);
                    list.add(nv);
                }
                return list;
            }
        }
    }
    
    public ArrayList<KhachHang> getListKH(){
    ArrayList<KhachHang> list = new ArrayList<>();
    String sql="select * from KhachHang";
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            KhachHang n= createKH(rs);
            list.add(n);
            
            }
        } catch (SQLException e) {
        }
    return list;
    }

        public static void main(String[] args){
            new KhachHangDao();
        }
    
    }
