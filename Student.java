/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
public class Student
{
    private String Class ;
    private String name;
    private  String ID ="1000" ;
    private double avgMarks =0;
    private int  days =0;
    private int earnings = 0 ;
    Subject subjects ;
   // private static final double totalEarning = 0;

    public Student(int uid, String Class,String name,Subject subjects )
    {
        this.name = name;
        this.Class = Class;
        this.avgMarks = 0;
        this.days = 0;
        this.earnings = 0;
        this.ID = Integer.toString(uid) ;
        this.subjects = subjects;
    }
    public String getId()
    {
        return this.ID;
    }
    public String getclass()
    {
        return this.Class;
    }

    public void updateDays(int days)
    {
        this.days += days;
        this.updateEarnings(days);
    }
   
    public void updateEarnings(int days)
    {
        if(this.subjects.bng){
            this.earnings += days;
           // totalEarning += this.earnings;
        }
         if(this.subjects.eng){
            this.earnings += days;
        }
          if(this.subjects.math){
            this.earnings += days;
        }
    }

    public String toString()
    {
        return "StdID " +this.ID + " Name: " + name + " Class: " + Class + 
                 " Earnings : " + this.earnings  + "  Days : " + this.days + " Average marks : " +this.subjects.avgMarks() ;
    }
    
}

