import java.sql.*;
import java.util.*;
public class purchase_action {
    String sql = "";
    String slc="";
    String sseller="";
    String smerchandise="";
    String sprice = "";
    String scomment = "";
    String sld = "";
    String sbuyer = "";
    String spd="";

    public void purchase(Statement stmt){
        try{
            sql="select * from listing";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                slc = rs.getString("listing_code");
                sseller = rs.getString("seller");
                smerchandise = rs.getString("merchandise");
                sprice = rs.getString("price");
                scomment = rs.getString("comment");
                sld = rs.getString("listing_date");
                sbuyer = rs.getString("buyer");
                spd = rs.getString("purchase_date");
                System.out.println(slc+" "+sseller+" "+smerchandise+" "+sprice+" "+scomment+" "+sld+" "+sbuyer+" "+spd);
            }

            
            e.printStackTrace();
        }
    }
     public void procedure(){
        try{
            System.out.println("�w�����������i�̔ԍ�����͂��Ă��������B�w�����L�����Z������ꍇ�́u!cancel�v�Ɠ��͂��Ă��������B");
            while(true){
                int input = sc.nextInt();
                if(input==0){
                    System.out.println("�w�����L�����Z������܂����B");
                    break;
                }else{

                }
            }
        }catch(InputMismatchExceptuon e){
            System.out.println("���l�ȊO�����͂���܂����B�w�����������i�̔ԍ�����͂��Ă��������B�w�����L�����Z������ꍇ�́u0�v����͂��Ă��������B")
        }catch(Exception e){
            e.printStacktrace();
        }

}
