/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wappen
 */
//３．以下の機能を持つクラスを作成してください。
//　　　・パブリックな２つの変数
//　　・２つの変数に値を設定するパブリックなメソッド
//　・２つの変数の中身をprintするパブリックなメソッド

public class object{
    public String name="";
    public int age=0;
    public void setobject(String n,int a){
    this.name=n;
    this.age=a;
    }
    public void showName(){System.out.print(this.name);}
    public void showAge(){System.out.print(this.age);}
    
}