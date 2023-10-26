/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLBH.dao;


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
public class ChiTietDao {
     private Connection conn;
    public ChiTietDao(){
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
//    public boolean Insert(ChiTiet n){
//        String sql = "INSERT INTO [dbo].[CHITIET]([SOHD],[MASP],[TENSP],[NUUOCSX],[GIA],[DVT],[SL],[TONGGIA])"
//                +"values(?,?,?,?,?,?,?,?)";
//        
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, n.getSOHD());
//            ps.setString(2, n.getMASP());
//            ps.setString(3, n.getTENSP());
//            ps.setString(4, n.getNUOCSX());
//            ps.setDouble(5, n.getGIA());
//            ps.setString(6,n.getDVT());   
//            ps.setInt(7,n.getSL());  
//            ps.setDouble(8,n.getTONGGIA());        
//            return ps.executeUpdate()>0;
//        } catch (SQLException e) {
//        }
//        return false;
//    }
//    
//    public boolean Update(ChiTiet n){
//        String sql = "UPDATE dbo.CHITIET"+ 
//                " SET [MASP]=?,[TENSP]=?,[NUUOCSX]=?,[GIA]=?,[DVT]=?,[SL]=?,[TONGGIA]=?"+
//                " WHERE SOHD = ?";
//        
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(8, n.getSOHD());
//            ps.setString(1, n.getMASP());
//            ps.setString(2, n.getTENSP());
//            ps.setString(3, n.getNUOCSX());
//            ps.setDouble(4, n.getGIA()); 
//            ps.setString(5, n.getDVT()); 
//            ps.setInt(4, n.getSL()); 
//            ps.setDouble(4, n.getTONGGIA()); 
//            return ps.executeUpdate()>0;
//        } catch (SQLException e) {
//        }
//        return false;
//    }
//    
//    public boolean Delete(String SOHD){
//        String sql = "DELETE FROM dbo.CHITIET"
//             + " WHERE SOHD = ?";
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, SOHD);
//            return ps.executeUpdate()>0;
//        } catch (SQLException e) {
//        }
//        return false;
//    }
//    
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
    
    public ChiTiet FindByID1(String SOHD, String MASP) throws Exception {
        String sql = "SELECT * FROM dbo.CHITIET WHERE SOHD = ? and MASP =?";
        try ( PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, SOHD);
            ps.setString(2, MASP);

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

        public static void main(String[] args){
            new ChiTietDao();
        }
}
