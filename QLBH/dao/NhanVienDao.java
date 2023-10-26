/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLBH.dao;


import QLBH.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author VAN ANH
 */
public class NhanVienDao{
    private Connection conn;
    public NhanVienDao(){
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
    public boolean Insert(NhanVien nv){
        String sql = "INSERT INTO [dbo].[NHANVIEN]([MANV],[HOTEN],[SODT],[NGVL])"
                +"values(?,?,?,?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMANV());
            ps.setString(2, nv.getHOTEN());
            ps.setString(3, nv.getSODT());
            ps.setString(4,nv.getNGVL());
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean Update(NhanVien nv){
        String sql = "UPDATE dbo.NHANVIEN"+ 
                " SET HOTEN = ?,SODT = ?,NGVL = ?"+
                " WHERE MANV = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(4, nv.getMANV());
            ps.setString(1, nv.getHOTEN());
            ps.setString(2, nv.getSODT());
            ps.setString(3,nv.getNGVL());
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean Delete(String MANV){
        String sql = "DELETE FROM dbo.NHANVIEN"
             + " WHERE MANV = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MANV);
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public NhanVien FindByID(String MANV) throws Exception {
        String sql = "SELECT * FROM dbo.NHANVIEN WHERE MANV =?";
        try ( PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, MANV);
            try ( ResultSet rs = ps.executeQuery();) {
                if (rs.next()) {
                    NhanVien nv = createNV(rs);
                    return nv;
                }
            }
            return null;
        }
    }

    private NhanVien createNV(final ResultSet rs) throws SQLException {
        NhanVien nv = new NhanVien();
        nv.setMANV(rs.getString("MANV"));
        nv.setHOTEN(rs.getString("HOTEN"));
        nv.setSODT(rs.getString("SODT"));
        nv.setNGVL(rs.getString("NGVL"));
        return nv;
    }
    
    public List<NhanVien> FindAll() throws Exception {
        String sql = "SELECT * FROM dbo.NHANVIEN";
        try (PreparedStatement ps = conn.prepareStatement(sql);){
            try ( ResultSet rs = ps.executeQuery();) {
                List<NhanVien> list = new ArrayList<>();
                while (rs.next()) {
                    NhanVien nv = createNV(rs);
                    list.add(nv);
                }
                return list;
            }
        }
    }
    
    public List<String> getData() throws Exception {
        String sql = "SELECT * FROM dbo.NHANVIEN";
        try (PreparedStatement ps = conn.prepareStatement(sql);){
            try ( ResultSet rs = ps.executeQuery();) {
                List<String> list = new ArrayList<>();
                while (rs.next()) {
                    NhanVien nv = createNV(rs);
                    list.add(nv.getMANV());
                }
                return list;
            }
        }
    }
    public String getTenNV(String MANV) throws Exception {
        String sql = "SELECT HOTEN FROM dbo.NHANVIEN"
                + " WHERE MANV = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql);){
             ps.setString(1, MANV);
            try ( ResultSet rs = ps.executeQuery();) {
               String ten = new String();
                while (rs.next()) {
                    NhanVien nv = createNV(rs);
                    ten=nv.getHOTEN();
                }
                return ten;
            }
        }
    }
    public ArrayList<NhanVien> getListNV(){
    ArrayList<NhanVien> list = new ArrayList<>();
    String sql="select * from NhanVien";
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            NhanVien n= createNV(rs);
            list.add(n);
            
            }
        } catch (SQLException e) {
        }
    return list;
    }

        public static void main(String[] args){
            new NhanVienDao();            
        }
    }
    
    
    
    
//    public static boolean them(NhanVien nv)
//            throws Exception {
//
//        String sql = "INSERT INTO [dbo].[NHANVIEN]([MANV],[HOTEN],[SODT],[NGVL],[HINH])"
//                + " value(?,?,?,?,?) ";
//        try (
//                 Connection con = DatabaseHelper.OpConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
//            pstmt.setString(1, nv.getMANV());
//            pstmt.setString(2, nv.getHOTEN());
//            pstmt.setString(3, nv.getSODT());
//
////             String stringday=txtNGVL1.getText();
//            SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
////            nv.setNGVL(formatter1.parse(stringday));
//
////String str=SimpleDateFormat.format(nv.getNGVL());
//// pstmt.setDate(4,Date.valueOf(str));
//            pstmt.setDate(4, new Date(nv.getNGVL().getTime()));
//            // pstmt.setDate(4,  str2);
//            if (nv.getHinh() != null) {
//                Blob hinh = new SerialBlob(nv.getHinh());
//                pstmt.setBlob(5, hinh);
//                return pstmt.executeUpdate() > 0;
//            } else {
//                Blob hinh = null;
//                pstmt.setBlob(5, hinh);
//            }
//
//            return false;
//        }
//
//    }
    
//    private Connection conn;
//    public NhanVienDao(){
//    try {
//            String dbURL = "jdbc:sqlserver://localhost:1433;"
//                    + "databaseName=QLBH;user=sa;password=sa";
//            conn = DriverManager.getConnection(dbURL);
//            if (conn != null) {
//                System.out.println("Connected");
//                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
//                System.out.println("Driver name: " + dm.getDriverName());
//                System.out.println("Driver version: " + dm.getDriverVersion());
//                System.out.println("Product name: " + dm.getDatabaseProductName());
//                System.out.println("Product version: " + dm.getDatabaseProductVersion());
//            }
//         
//        } catch (SQLException ex) {
//            System.err.println("Cannot connect database, " + ex);
//        }
//    }
//    public static boolean them(NhanVien nv) {
//
//        String sql = "INSERT INTO [dbo].[NHANVIEN]([MANV],[HOTEN],[SODT],[NGVL],[HINH])"
//                + " value(?,?,?,?,?) ";
//        try {
//            PreparedStatement pstmt = conn.prepareStatement(sql); 
//            pstmt.setString(1, nv.getMANV());
//            pstmt.setString(2, nv.getHOTEN());
//            pstmt.setString(3, nv.getSODT());
//            pstmt.setDate(4,new Date(nv.getNGVL().getTime()));
//        
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        

//public ArrayList<NhanVien> getListNV(){
//    ArrayList<NhanVien> list = new ArrayList<>();
//    String sql="select * from NhanVien";
//        try {
//            PreparedStatement ps= conn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//            NhanVien n= new NhanVien();
//            n.setMANV(rs.getString("MANV"));
//            n.setHOTEN(rs.getString("HOTEN"));
//            n.setSODT(rs.getString("SODT"));
//            n.setNGVL(rs.getDate("NGVL"));
//            list.add(n);
//            
//            }
//        } catch (SQLException e) {
//        }
//    return list;
//    }