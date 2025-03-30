/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap2;
import java.util.Scanner;
class hinhchunhat{
    private int dai;
    private int rong;
    
    public hinhchunhat(int d,int r){
        dai=d;
        rong=r;
    }
    public void setdai(int dai){
        if(dai>0){
            this.dai=dai;
        }else{
            System.out.println("chieu dai phai lon hon 0");
        }
    }
    public int getdai(){
        return dai;
    }
    public void setrong(int rong){
        if(rong>0){
            this.rong=rong;
        }else{
            System.out.println("chieu rong phai lon hon 0");
        }
    }
    public int dientich(){
        return dai*rong;
    }
    public int chuvi(){
        return (dai+rong)*2;
    }
    @Override
    public String toString(){
        return "chieu dai la "+dai+"\n"+
                "chieu rong la "+rong+"\n"+
                "dien tich la "+dientich()+"\n"+
                "chu vi la "+chuvi();
    }
}
public class bai2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("nhap chieu dai ");
        int d=kb.nextInt();
        System.out.print("nhap chieu rong ");
        int r=kb.nextInt();
        hinhchunhat hcn=new hinhchunhat(d,r);
        System.out.println(hcn.toString());       
    }
}
