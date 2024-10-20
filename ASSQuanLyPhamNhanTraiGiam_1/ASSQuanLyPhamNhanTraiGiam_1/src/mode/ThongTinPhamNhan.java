/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mode;

/**
 *
 * @author ADMIN
 */
public class ThongTinPhamNhan {
    private String hoTen;
    private String NgaySinh;
    private String queQuan;
    private String id;
    private String toiDanh;
    private String thoiGianThuAn;
    private String thoiHanTu;
    private String quocTich;

    public ThongTinPhamNhan(String hoTen, String NgaySinh, String queQuan, String id, String toiDanh, String thoiGianThuAn, String thoiHanTu, String quocTich, String male) {
        this.hoTen = hoTen;
        this.NgaySinh = NgaySinh;
        this.queQuan = queQuan;
        this.id = id;
        this.toiDanh = toiDanh;
        this.thoiGianThuAn = thoiGianThuAn;
        this.thoiHanTu = thoiHanTu;
        this.quocTich = quocTich;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToiDanh() {
        return toiDanh;
    }

    public void setToiDanh(String toiDanh) {
        this.toiDanh = toiDanh;
    }

    public String getThoiGianThuAn() {
        return thoiGianThuAn;
    }

    public void setThoiGianThuAn(String thoiGianThuAn) {
        this.thoiGianThuAn = thoiGianThuAn;
    }

    public String getThoiHanTu() {
        return thoiHanTu;
    }

    public void setThoiHanTu(String thoiHanTu) {
        this.thoiHanTu = thoiHanTu;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public Object getGioiTinh() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
