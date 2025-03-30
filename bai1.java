/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap2;
import java.util.Scanner;
import java.util.Arrays;
class mangmotchieu{
    private int[] mang;
        
    public mangmotchieu(int n){
        mang=new int[n]; 
    }
//cau a
    public void nhapmang(){
        Scanner kb=new Scanner(System.in);
        for(int i=0;i<mang.length;i++){
            System.out.print("nhap phan tu thu "+(i+1)+" ");
            mang[i]=kb.nextInt();
        }
    }
//cau b
    public void xuatmang(){
        for(int i=0;i<mang.length;i++){
            System.out.print(mang[i]+" ");
        }
    }
//cau c
    public void timvitri(int x){
        for(int i=0;i<mang.length;i++){
            if(mang[i]==x){
                System.out.println("vi tri cua so "+x+" la "+(i+1));
                break;
            }else if(mang[i]!=x){
                System.out.println("khong co");
                break;
            }
        }   
    }
//cau d
    public void giatrilonnhat(){
       int max=mang[0];
       for(int i=1;i<mang.length;i++){
           if(mang[i]>max){
               max=mang[i];
           }
        }
        System.out.println("gia tri lon nhat la "+max);
    }
//cau e
    public void giatrinhonhat(){
        int min=mang[0];
        for(int i=1;i<mang.length;i++){
            if(mang[i]<min){
                min=mang[i];
            }
        }
        System.out.println("gia tri nho nhat la "+min);
    }
//cau f
    public void timvitrigiatrilonnhat(){
       int max=mang[0];
       for(int i=1;i<mang.length;i++){
           if(mang[i]>max){
               max=mang[i];
           }
        }
        for(int i=0;i<mang.length;i++){
            if(mang[i]==max){
                System.out.println("vi tri cua "+max+" la "+(i+1));
                break;
            }
        }
    }
//cau g
    public void sapxep(){
        Arrays.sort(mang);
    }
}

public class bai1{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("nhap kich thuoc mang ");
        int n=kb.nextInt();
        mangmotchieu mangmot= new mangmotchieu(n);
        mangmot.nhapmang();
        mangmot.xuatmang();
        System.out.print("\ntim vi tri cua so ");
        int x=kb.nextInt();
        mangmot.timvitri(x);
        mangmot.giatrilonnhat();
        mangmot.giatrinhonhat();
        mangmot.timvitrigiatrilonnhat();
        mangmot.sapxep();
        System.out.println("sap xep mang theo thu tu tang dan:");
        mangmot.xuatmang();
    }
}

