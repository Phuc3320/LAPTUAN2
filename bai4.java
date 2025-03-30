/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap2;
import java.util.Scanner;



class xeco{
    private String tenchuxe;
    private String loaixe;
    private int dungtich;
    private double trigia;

    
    public xeco(String ten,String loai,int dt,double gia){
        tenchuxe=ten;
        loaixe=loai;
        dungtich=dt;
        trigia=gia;
        
    }
    public void tinhthue(){
        double thue;
        if(dungtich<100){
            thue=0.01*trigia;
        }else if(dungtich>=100){
            thue=0.03*trigia;
        }else{
            thue=0.05*trigia;
        }
    }
    
}

public class bai4 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap ten chu xe ");
        String ten=kb.nextLine();
        System.out.println("nhap loai xe ");
        String loai=kb.nextLine();
        System.out.println("nhap dung tich xe ");
        int dt=kb.nextInt();
        System.out.println("nhap gia xe ");
        double gia=kb.nextDouble();
        xeco xe1=new xeco(ten,loai,dt,gia);
        System.out.println("nhap ten chu xe ");
        String ten1=kb.nextLine();
        System.out.println("nhap loai xe ");
        String loai1=kb.nextLine();
        System.out.println("nhap dung tich xe ");
        int dt1=kb.nextInt();
        System.out.println("nhap gia xe ");
        double gia1=kb.nextDouble();
        xeco xe2=new xeco(ten1,loai1,dt1,gia1);
        System.out.println("nhap ten chu xe ");
        String ten2=kb.nextLine();
        System.out.println("nhap loai xe ");
        String loai2=kb.nextLine();
        System.out.println("nhap dung tich xe ");
        int dt2=kb.nextInt();
        System.out.println("nhap gia xe ");
        double gia2=kb.nextDouble();
        xeco xe3=new xeco(ten2,loai2,dt2,gia2);
        xe1.tinhthue();
        xe2.tinhthue();
        xe3.tinhthue();
        System.out.println(xe1);
        System.out.println(xe2);
        System.out.println(xe3);
    }
}
