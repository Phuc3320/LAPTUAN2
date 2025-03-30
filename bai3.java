/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap2;
import java.util.Scanner;
class sinhvien{
    private int masv;
    private String hoten;
    private float diemlt;
    private float diemth;
    
    public sinhvien(){
    masv=0;
    hoten="";
    diemlt=0;
    diemth=0;
    }
    public sinhvien(int ma,String ten,float lt,float th){
        masv=ma;
        hoten=ten;
        diemlt=lt;
        diemth=th;
    }
    public void setmasv(int masv){
        this.masv=masv;
    }
    public int getmasv(){
        return masv;
    }
    public void sethoten(String hoten){
        this.hoten=hoten;
    }
    public int gethoten(){
        return masv;
    }
    public void setdiemlt(float diemlt){
        this.diemlt = diemlt;
    }
    public float getDiemlt() {
        return diemlt;
    }
    public float getDiemth() {
        return diemth;
    }
    public void setdiemth(float diemth) {
        this.diemth = diemth;
    }
    public float diemtrungbinh(){
        return (diemlt+diemth)/2;
    }
    @Override   
    public String toString(){
        return "masv "+masv+"ho ten "+hoten+"diemlt "+diemlt+"diem thuc hanh "+diemth+"diem trung binh "+diemtrungbinh();
    }
}





public class bai3 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        sinhvien sv1=new sinhvien(11111,"Nguyen Gia Phuc",6.5f,8.5f);
        sinhvien sv2=new sinhvien(22222,"Nguyen Phuc Gia",7.0f,7.5f);
        System.out.println("nhap thong tin sv 3");
        System.out.println("nhap ma sv ");
        int ma=kb.nextInt();
        System.out.println("nhap ho ten ");
        kb.nextLine();
        String hoten=kb.nextLine();
        System.out.println("nhap diem ly thuyet ");
        float lt=kb.nextFloat();
        System.out.println("nhap diem Thuc Hanh ");
        float th=kb.nextFloat();
        sinhvien sv3=new sinhvien(ma,hoten,lt,th);
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
        

            
    }
}
