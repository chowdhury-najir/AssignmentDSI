/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Thomsunplay
 */
public class Subject {
    boolean bng = false ;
    boolean eng = false ;
    boolean math = false ;
    double bngMarks = 0 ;
    double engMarks = 0 ;
    double mathMarks = 0 ;
    int totalSubjects= 0;
    
    
    public Subject(boolean bng,boolean eng,boolean math)
    {
        this.bng = bng;
        this.eng = eng;
        this.math = math;
        if(this.bng) this.totalSubjects +=1;
        if(this.eng) this.totalSubjects +=1;
        if(this.eng) this.totalSubjects +=1;
    }
    
    public void updateBngMarks(double marks)
    {
        this.bngMarks = marks;
    }
    public void updateEngMarks(double marks)
    {
        this.engMarks =marks ;
    }
    
     public void updateMathMarks(double marks)
    {
        this.mathMarks =  marks;
    }
     
    public double avgMarks()
    {
       double totalMarks = this.bngMarks + this.engMarks + this.mathMarks;
       
       return totalMarks/this.totalSubjects;
    }
    
    
}
