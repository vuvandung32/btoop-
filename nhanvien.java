import java.time.LocalDate;

public class nhanvien {
    public String id ;
    public String ten;
    public LocalDate ngaysinh;
    public String gioitinh;
    public double luongthang;

    

    public nhanvien(String id, String ten, LocalDate ngaysinh, String gioitinh, double luongthang) {
        this.id = id;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.luongthang = luongthang;
    }

    public Boolean hasId (String id ){
        boolean result = this.id.equals(id);
        return result;
    }
    public Boolean hasTen (String Ten){
        boolean result =this.ten.contains(Ten);
        return result;
    }



   
   
    
    
}
