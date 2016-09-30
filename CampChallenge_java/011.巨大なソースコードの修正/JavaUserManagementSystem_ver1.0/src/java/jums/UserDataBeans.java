/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jums;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author wappen
 */
public class UserDataBeans {
 //データビーンズ作成
    private String name;
    private String type;
    private String tell;
    private String comment;
    private int year;
    private int month;
    private int day;
    
    
    
 public UserDataBeans(){
     
     name="";
     type="";
     tell="";
     comment="";
     year=0;
     month=0;
     day=0;
 }
 
             
 public void setName(String name){
     this.name=name;
 }
 public String getName(){
     return name;
 }
public void setType(String type){
   this.type=type;
} 
public String getType(){
    return type;
}
public void setTell(String tell){
     this.tell=tell;
 }
 public String getTell(){
     return tell;
 }
public void setComment(String comment){
   this.comment=comment;
} 
public String getComment(){
    return comment;
}    
 public void setYear(int year){
     this.year=year;
 }
 public int getYear(){
     return year;
 }
public void setMonth(int month){
   this.month=month;
} 
public int getMonth(){
    return month;
}    
public void setDay(int day){
   this.day=day;
} 
public int getDay(){
    return day;
}
}

    
     
     
     
     

    
    
    
    
    
    
            
           
                
        
        
                
         
         


