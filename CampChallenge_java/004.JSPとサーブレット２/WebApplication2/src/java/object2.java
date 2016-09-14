/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wappen
 */

//　４．３のクラスを継承し、以下の機能を持つクラスを作成してください。
//・２つの変数の中身をクリアするパブリックなメソッド
public class object2{
    public String name="";
    public int age=0;
    public void setobject2(String n,int a){
    this.name=n;
    this.age=a;
    }
    public void showName(){System.out.print(this.name);}
    public void showAge(){System.out.print(this.age);}
    
}

class human extends object2{
    public void sethuman(String n,int a){
    this.name= null;
    this.age=0 ;
    }
}