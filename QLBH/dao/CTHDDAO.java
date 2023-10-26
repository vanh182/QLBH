/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLBH.dao;

import QLBH.CTHD;
import QLBH.ChiTiet;
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
public class CTHDDAO {
     private Connection conn;
    public CTHDDAO(){
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
    public boolean Insert(CTHD n){
        String sql = "INSERT INTO [dbo].[CTHD]([SOHD],[MASP],[SL])"
                +"values(?,?,?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, n.getSoHD());
            ps.setString(2, n.getMaSP()); 
            ps.setInt(3,n.getSL());       
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        return false;
    }
    
    public boolean Update(CTHD n) {
        String sql = "UPDATE dbo.CTHD"
                + " SET [SL]=?"
                + " WHERE SOHD = ? AND MASP = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(2,n.getSoHD());
            ps.setString(3,n.getMaSP());
            ps.setInt(1,n.getSL());
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
        }
        return false;
    }
  
    
    public boolean Delete(String SOHD, String MASP){
        String sql = "DELETE FROM dbo.CTHD"
             + " WHERE SOHD = ? and MASP=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, SOHD);
            ps.setString(2,MASP);
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean DeleteALLbyID(String SOHD){
        String sql = "DELETE FROM dbo.CTHD"
             + " WHERE SOHD = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, SOHD);
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public ChiTiet FindByID(String SOHD) throws Exception {
        String sql = "SELECT * FROM dbo.CHITIET WHERE SOHD =?";
        try ( PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, SOHD);
            try ( ResultSet rs = ps.executeQuery();) {
                if (rs.next()) {
                    ChiTiet n = createCT(rs);
                    return n;
                }
            }
            return null;
        }
    }

    private ChiTiet createCT(final ResultSet rs) throws SQLException {
        ChiTiet n = new ChiTiet();
        n.setSOHD(rs.getString("SOHD"));
        n.setMASP(rs.getString("MASP"));
        n.setTENSP(rs.getString("TENSP"));
        n.setNUOCSX(rs.getString("NUOCSX"));
        n.setGIA(rs.getLong("GIA"));
        n.setDVT(rs.getString("DVT"));
        n.setSL(rs.getInt("SL"));
        n.setTONGGIA(rs.getLong("TONGGIA"));
        return n;
    }
    
    public List<ChiTiet> FindAll() throws Exception {
        String sql = "SELECT * FROM dbo.CHITIET";
        try (PreparedStatement ps = conn.prepareStatement(sql);){
            try ( ResultSet rs = ps.executeQuery();) {
                List<ChiTiet> list = new ArrayList<>();
                while (rs.next()) {
                    ChiTiet nv = createCT(rs);
                    list.add(nv);
                }
                return list;
            }
        }
    }
    
    public ArrayList<ChiTiet> getListCT(){
    ArrayList<ChiTiet> list = new ArrayList<>();
    String sql="select * from CHITIET";
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            ChiTiet n= createCT(rs);
            list.add(n);
            
            }
        } catch (SQLException e) {
        }
    return list;
    }
    
    
    public List<CTHD> FindAllCTHD() throws Exception {
        String sql = "SELECT * FROM dbo.CTHD";
        try (PreparedStatement ps = conn.prepareStatement(sql);){
            try ( ResultSet rs = ps.executeQuery();) {
                List<CTHD> list = new ArrayList<>();
                while (rs.next()) {
                    CTHD n = createCTHD(rs);
                    list.add(n);
                }
                return list;
            }
        }
    }
    
    private CTHD createCTHD(final ResultSet rs) throws SQLException {
        CTHD n = new CTHD();
        n.setSoHD(rs.getString("SOHD"));
        n.setMaSP(rs.getString("MASP"));
        n.setSL(rs.getInt("SL"));
        return n;
    }
    
    public ArrayList<CTHD> getListCTHD() {
        ArrayList<CTHD> list = new ArrayList<>();
        String sql = "select * from CHITIET";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CTHD n = createCTHD(rs);
                list.add(n);
            }
        } catch (SQLException e) {
        }
        return list;
    }

        public static void main(String[] args){
            new ChiTietDao();
        }
}
