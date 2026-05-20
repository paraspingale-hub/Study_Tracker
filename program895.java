

import java.time.LocalDate;
import java.util.*;

class studylog
{
    private LocalDate date;
    private String Subject ;
    private  double duration;
    private String Discription ;

    public studylog(LocalDate a , String b , double c , String d)
    {
        this.date = a ;
        this.Subject = b;
        this.duration = c;
        this.Discription = d; 
    }

    public LocalDate getdDate()
    {
        return this.date;
    }

    public String getsubject()
    {
        return this.Subject;
    }
    public double duration()
    {
        return this.duration;
    }
    public String Discription()
    {
        return this.Discription;
    }


    public String toString()
    {
        return date + " | " + Subject + " | " + duration + " | " + Discription; 
    }

    
    


}

public class program895
{
    public static void main(String A[])
    {

        LocalDate lobj = LocalDate.now();

        studylog.sobj = new studylog(lobj , "cprograming" , 3.2 , "pointers ");
        System.out.println(sobj);




        

        
        
    }
    
}
