/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLBH.dao;



import QLBH.SanPham;
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
public class SanPhamDao {
    private Connection conn;
    public SanPhamDao(){
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
    public boolean Insert(SanPham n){
        String sql = "INSERT INTO [dbo].[SANPHAM]([MASP],[TENSP],[DVT],[NUOCSX],[GIA])"
                +"values(?,?,?,?,?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, n.getMaSP());
            ps.setString(2, n.getTenSP());
            ps.setString(3, n.getDVT());
            ps.setString(4, n.getNuocSX());
            ps.setDouble(5,n.getGia());        
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean Update(SanPham n){
        String sql = "UPDATE dbo.SANPHAM"+ 
                " SET TENSP = ?,DVT = ?,NUOCSX = ?,GIA = ?"+
                " WHERE MASP = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(5, n.getMaSP());
            ps.setString(1, n.getTenSP());
            ps.setString(2, n.getDVT());
            ps.setString(3, n.getNuocSX());
            ps.setDouble(4, n.getGia());            
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean Delete(String MASP){
        String sql = "DELETE FROM dbo.SANPHAM"
             + " WHERE MASP = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MASP);
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public SanPham FindByID(String MASP) throws Exception {
        String sql = "SELECT * FROM dbo.SANPHAM WHERE MASP =?";
        try ( PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, MASP);
            try ( ResultSet rs = ps.executeQuery();) {
                if (rs.next()) {
                    SanPham n = createSP(rs);
                    return n;
                }
            }
            return null;
        }
    }
    public List<String> getData() throws Exception {
        String sql = "SELECT * FROM dbo.SANPHAM";
        try (PreparedStatement ps = conn.prepareStatement(sql);){
            try ( ResultSet rs = ps.executeQuery();) {
                List<String> list = new ArrayList<>();
                while (rs.next()) {
                    SanPham nv = createSP(rs);
                    list.add(nv.getMaSP());
                }
                return list;
            }
        }
    }

    private SanPham createSP(final ResultSet rs) throws SQLException {
        SanPham n = new SanPham();
        n.setMaSP(rs.getString("MASP"));
        n.setTenSP(rs.getString("TENSP"));
        n.setDVT(rs.getString("DVT"));
        n.setNuocSX(rs.getString("NUOCSX"));
        n.setGia(rs.getLong("GIA"));
        return n;
    }
    
    public List<SanPham> FindAll() throws Exception {
        String sql = "SELECT * FROM dbo.SANPHAM";
        try (PreparedStatement ps = conn.prepareStatement(sql);){
            try ( ResultSet rs = ps.executeQuery();) {
                List<SanPham> list = new ArrayList<>();
                while (rs.next()) {
                    SanPham nv = createSP(rs);
                    list.add(nv);
                }
                return list;
            }
        }
    }
    
    public ArrayList<SanPham> getListSP(){
    ArrayList<SanPham> list = new ArrayList<>();
    String sql="select * from SanPham";
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            SanPham n= createSP(rs);
            list.add(n);
            
            }
        } catch (SQLException e) {
        }
    return list;
    }

        public static void main(String[] args){
            new SanPhamDao();
        }
    
}
