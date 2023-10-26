/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLBH.dao;

import QLBH.HoaDon;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
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
public class HoaDonDao {
    private Connection conn;
    public HoaDonDao(){
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
    public boolean Insert(HoaDon n){
        String sql = "INSERT INTO [dbo].[HoaDon]([SOHD],[NGHD],[MAKH],[MANV],[TRIGIA])"
                +"values(?,?,?,?,?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, n.getSoHD());
            ps.setString(2, n.getNgHD());
            ps.setString(3, n.getMaKH());
            ps.setString(4, n.getMaNV());
            ps.setLong(5,n.getTriGia());        
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean Update(HoaDon n){
        String sql = "UPDATE dbo.HoaDon"+ 
                " SET NGHD = ?,MAKH = ?,MANV = ?,TRIGIA = ?"+
                " WHERE SOHD = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(5, n.getSoHD());
            ps.setString(1, n.getNgHD());
            ps.setString(2, n.getMaKH());
            ps.setString(3, n.getMaNV());
            ps.setLong(4, n.getTriGia());            
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean Delete(String SOHD){
        String sql = "DELETE FROM dbo.HoaDon"
             + " WHERE SOHD = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, SOHD);
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public HoaDon FindByID(String SOHD) throws Exception {
        String sql = "SELECT * FROM dbo.HoaDon WHERE SOHD =?";
        try ( PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, SOHD);
            try ( ResultSet rs = ps.executeQuery();) {
                if (rs.next()) {
                    HoaDon n = createHD(rs);
                    return n;
                }
            }
            return null;
        }
    }
    
    public String FindMaxID() throws Exception {
        String sql = "SELECT MAX(SOHD) SOHD FROM dbo.HoaDon";
        String n="";
        try ( PreparedStatement ps = conn.prepareStatement(sql);) {
            try ( ResultSet rs = ps.executeQuery();) {
                if (rs.next()) {
                     n=rs.getString("SOHD");
                    
                }
                
            }
           
        }
        return n;
    }

    private HoaDon createHD(final ResultSet rs) throws SQLException {
        HoaDon n = new HoaDon();
        n.setSoHD(rs.getString("SOHD"));
        n.setNgHD(rs.getString("NGHD"));
        n.setMaKH(rs.getString("MAKH"));
        n.setMaNV(rs.getString("MANV"));
        n.setTriGia(rs.getLong("TRIGIA"));
        return n;
    }
    
    public List<HoaDon> FindAll() throws Exception {
        String sql = "SELECT * FROM dbo.HoaDon";
        try (PreparedStatement ps = conn.prepareStatement(sql);){
            try ( ResultSet rs = ps.executeQuery();) {
                List<HoaDon> list = new ArrayList<>();
                while (rs.next()) {
                    HoaDon nv = createHD(rs);
                    list.add(nv);
                }
                return list;
            }
        }
    }
    
    public ArrayList<HoaDon> getListHD(){
    ArrayList<HoaDon> list = new ArrayList<>();
    String sql="select * from HoaDon";
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            HoaDon n= createHD(rs);
            list.add(n);
            
            }
        } catch (SQLException e) {
        }
    return list;
    }

        public static void main(String[] args){
            new HoaDonDao();
        }
}
