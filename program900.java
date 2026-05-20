

import java.io.FileWriter;
import java.time.LocalDate;
import java.util.*;
import javax.naming.NamingException;



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
        System.out.println("------------Enter valid details of your study time---------------- ");
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
        System.out.println();
        System.out.println();

    }

    public void displaylog()
    {   
        System.out.println("------------------------------------------------------------------");
        if(database.isEmpty())
        {
            System.out.println(":::The data base is empty :::");
            System.out.println("------------------------------------------------------------------");
            return;
        }
        System.out.println("Log report of marvellous study tracker");
        System.out.println("------------------------------------------------------------------");
        for( studylog s : database)
        {
           System.out.println(s);
        }
        System.out.println("------------------------------------------------------------------");
        

    }
    public void Exportcsv()
    {
        if(database.isEmpty())
        {
            System.out.println("------------------------------------------------------------------");
            System.out.println("::::::::::::::::::::The data base is empty ::::::::::::::::::::::");
            System.out.println("------------------------------------------------------------------");
            return;
        }
        String filename = "MarvellousStudyTracker.csv";
        try(FileWriter fwobj = new FileWriter(filename))
        {
            fwobj.write("Date , Subject , Duration , Description");
            for (studylog s : database)
            {
                fwobj.write(s.getdDate() + "," + s.getsubject().replace(",", " ") + "," + s.duration() + "," + s.Discription().replace(",", " "));
            }
            System.out.println("Data gets exported in csv file ");
        }
        catch(Exception eobj)
        {
        }
    }

    public void summarybydate()
    {

    }
    public void summarybysubject()
    {
        
    }
}

public class program900
{
    public static void main(String A[])
    {

        Scanner sobj = new Scanner(System.in);
        StudyTracker stobj =new StudyTracker();
        System.out.println("------------------------------------------------------------------");
        System.out.println("-------------------Marvellous Study Tracker-----------------------");
        System.out.println("------------------------------------------------------------------");

        int iChoice = 0 ;
        do
        {
            System.out.println("Please select appropriate option ");
            System.out.println("1 .Insert new study logs ");
            System.out.println("2 .View all teh study logs ");
            System.out.println("3 .Export all to csv file ");
            System.out.println("4 .Summary of the study log  by date");
            System.out.println("5 .summary of study log by subject ");
            System.out.println("6 .Exit");

            iChoice = sobj.nextInt();


            switch(iChoice)
            {
            case 1 :
                stobj.insertlog();
                break;

            case 2 :
                stobj.displaylog();
                break;
            case 3 :
                stobj.Exportcsv();
                break;
            case 4 :               //get the summary by the date 
                stobj.summarybydate();
                break;
            case 5 :                // get the summary by subject 
                stobj.summarybysubject();
                break;
            case 6 :                //exit the application 
                System.out.println(":::Please enter the valid options::::");
                System.out.println("------------------------------------------------------------------");
                System.out.println("---------Thank you for using Marvellous Study Tracker-------------");
                System.out.println("------------------------------------------------------------------");
                break;
            }
        }while(iChoice != 6);
        //end of do while 






        
    } // end of main 
    
} // end of starter class 
