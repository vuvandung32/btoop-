import java.time.LocalDate;
import java.util.Scanner;

public class dichvu {
    public static void main(String[] args) {
    nhanvien[]danhsach= new nhanvien[5];

    danhsach[0]= new nhanvien ("NV113", "phạm văn tuân" ,LocalDate.parse("2001-02-02") , "male", 12.2);
    danhsach[1]= new nhanvien ("NV114", "trần văn kiên" ,LocalDate.parse("2001-12-02") , "male", 34);
    danhsach[2]= new nhanvien ("NV345", "vũ thị thu" , LocalDate.parse("1998-03-08") , "female", 12.9);
    danhsach[3]= new nhanvien ("NV533", "nguyễn công công " , LocalDate.parse("2002-02-23") , "female", 20);
    danhsach[4]= new nhanvien ("NV453", "trịnh công  sơn" , LocalDate.parse("1990-08-23") , "nam", 12.2);
    // for (nhanvien nhanvien1 : danhsach) {
    //     System.out.println(nhanvien1.ten);
    // }
    Scanner scanner = new Scanner(System.in);
    // System.out.println("mời bạn nhập id :");
    // String iD =  scanner.nextLine();

    // for(int index=0; index<danhsach.length; index++){
    //     nhanvien nhanVien = danhsach[index];
    //     if(nhanVien.hasId(iD)){
    //         System.out.println("tên nhân viên: "+nhanVien.ten);

    //     }
        
    // }
    // System.out.println("moi ban nhap ten");
    // String nhapTen = scanner.next();

    // for(int i =0 ;i<danhsach.length ; i++){
    //     nhanvien ten = danhsach[i];
    //     if (ten.hasTen(nhapTen)){
    //         System.out.println("ten la :"+ten.ten);

    //     }

    // }
    // int nam=0 ,nu = 0;
    // for ( int i=0; i<danhsach.length; i++){
    //     if( danhsach[i].gioitinh.equals("male")){
    //         nam++;


    //     }
    //     else {
    //         nu++;
    //     }

    // }
    // System.out.println("nhan vien nam la: "+nam+" nguoi");
    // System.out.println("nhan vien nu la: "+nu+" nguoi");


    // liệt kê những người trên 30 tuổi 
    // LocalDate toDay = LocalDate.now();
    // for(int i =0 ;i<danhsach.length ; i++){

    //         if ((toDay.getYear()-danhsach[i].ngaysinh.getYear())>30){
    //             System.out.println(danhsach[i].ten);
               
    
    //         }
    
    


    //     }
    // sinh nhật nhân viên 
    
    System.out.println("mời bạn nhập  tháng ");
    int  sinhNhat = scanner.nextInt();
    for(int i =0; i<danhsach.length;i++){
       
        if (danhsach[i].ngaysinh.getMonthValue()==(sinhNhat)){
            System.out.println(danhsach[i].ten);

        }

    }

    


    


}

    
}
