

import java.time.LocalDate;
import java.util.*;


class studylog
{

    static studylog sobj;
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

class StudyTracker 
{
    public ArrayList <studylog> database = new ArrayList <studylog> ();
    public void insertlog()
    {   
        Scanner sobj = new Scanner (System.in);

        System.out.println("------------------------------------------------------------------");
        System.out.println("Enter valid details of your study time ");
        System.out.println("------------------------------------------------------------------");

        LocalDate Dateobj = LocalDate.now();
        System.out.println("Please enter the name of the subjects : ");
        String sub = sobj.nextLine();
        System.out.println();
        System.out.println();

        System.out.println("Please enter the duration of the studysession (in hrs): ");
        double duration = sobj.nextDouble();
        System.out.println();
        System.out.println();

        System.out.println("Please enter the discription of the study session : ");
        String discription = sobj.next();
        System.out.println();
        System.out.println();

        studylog studyl = new studylog(Dateobj, sub, duration, discription);
        database.add(studyl);


        System.out.println("------------------------------------------------------------------");
        System.out.println("Study log gets successfully stored ");
        System.out.println("------------------------------------------------------------------");

    }

    public void displaylog()
    {

    }
}

public class program896
{
    public static void main(String A[])
    {

        StudyTracker stobj = new StudyTracker();

        stobj.insertlog();        
        
    }
    
}
