# QLBH
QLBH with Java + Java Swing
Demo video: https://youtu.be/r5ni82h7GaM?si=kGkZ83-hledI-8pe
1. Cơ sở dữ liệu gồm:
   Cơ sở dữ liệu quản lý bán hàng gồm có các quan hệ sau:
   
− KHACHHANG (MAKH, HOTEN, DCHI, SODT, NGSINH, DOANHSO, 
NGDK)

Tân từ: Quan hệ khách hàng sẽ lưu trữ thông tin của khách hàng thành viên 
gồm có các thuộc tính: mã khách àng, họ tên, địa chỉ, số điện thoại, ngày 
sinh, ngày đăng ký và doanh số (tổng trị giá các hóa đơn của khách àng 
thành viên này).

− NHANVIEN (MANV,HOTEN, NGVL, SODT)

Tân từ: Mỗi nhân viên bán hàng cần ghi nhận họ tên, ngày vào làm, điện 
thọai liên lạc, mỗi nhân viên phân iệt với nhau bằng mã nhân viên.

− SANPHAM (MASP,TENSP, DVT, NUOCSX, GIA)

Tân từ: Mỗi sản phẩm có một mã số, một tên gọi, đơn vị tính, nước sản xuất 
và một giá bán.

− HOADON (SOHD, NGHD, MAKH, MANV, TRIGIA)

Tân từ: Khi mua hàng, mỗi khách hàng sẽ nhận một hóa đơn tính tiền, trong 
đó sẽ có số hóa đơn, ngày mua, nhân viên nào bán hàng, trị giá của hóa đơn 
là bao nhiêu và mã số của khách hàng nếu là khách hàng thành viên.

− CTHD (SOHD,MASP,SL)

Tân từ: Diễn giải chi tiết trong mỗi hóa đơn gồm có những sản phẩm gì với 
số lượng là bao nhiêu.
Mô hình ER (thực thể quan hệ) của cơ sở dữ liệu quản lý bán hàng có các chức 
năng:

− Lưu trữ thông tin: nhân viên, khách hàng, sản phẩm

− Lập hóa đơn cho khách hàng mua hàng, trên hóa đơn có thông tin nhân 
viên bán hàng, và khách hàng mua hàng

− Truy xuất thông tin hóa đơn: người bán, người mua, sản phẩm đã mua, số
lượng sản phẩm đã mua

− Lưu trữ lại thông tin trị giá mỗi đơn hàng , ngày mua của mỗi đơn hàng

![image](https://github.com/vanh182/QLBH-Java-Swing/assets/118065256/1f202da7-d6bd-46fd-b822-d9062b6b055c)

2. Sơ đồ các lớp đối tượng:
   
   ![image](https://github.com/vanh182/QLBH-Java-Swing/assets/118065256/e6346fc6-18d8-48c5-bab2-7909ac7a5640)

3. Mô hình ứng dụng:

   ![image](https://github.com/vanh182/QLBH-Java-Swing/assets/118065256/754c9f94-4d3e-4e9d-9eee-3cedef03d9df)

4. Giao diện ứng dụng:

   ![image](https://github.com/vanh182/QLBH-Java-Swing/assets/118065256/86a96216-50ab-45f5-b1a2-775be7d2758d)

   ![image](https://github.com/vanh182/QLBH-Java-Swing/assets/118065256/16dc65bb-3195-4bbe-922b-e02e5c881f82)

   ![image](https://github.com/vanh182/QLBH-Java-Swing/assets/118065256/141e306d-4c50-45db-a226-01e7e850c3fc)

   ![image](https://github.com/vanh182/QLBH-Java-Swing/assets/118065256/356ab9c2-f350-491d-a06c-19c1d4ca9705)

   ![image](https://github.com/vanh182/QLBH-Java-Swing/assets/118065256/bf2c7dc9-6880-4061-8c88-5e222335d92c)

   ![image](https://github.com/vanh182/QLBH-Java-Swing/assets/118065256/ee9f60c0-dc1d-414f-b329-fb98ec98b2b9)

  
   











