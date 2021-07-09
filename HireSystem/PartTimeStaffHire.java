
/**
 * Write a description of class asasa here.
 *
 * @author (Anish Sherchan)
 * @version (a version number or a date)
 */
 
import javax.swing.*;
public class PartTimeStaffHire extends StaffHire
{
    private int workHour;
    private int wagePerHour;
    private String staffName;
    private String joinDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    INGNepal oop = new INGNepal();
    //creating a constructor for PartTimeStaffHire
    public PartTimeStaffHire(int vacancyNo, String designation, String jobType,int workHour, int wagePerHour, String shifts)
    {
        super(vacancyNo, designation, jobType);
        this.workHour=workHour;
        this.wagePerHour=wagePerHour;
        this.shifts=shifts;
        staffName="";
        joinDate="";
        qualification="";
        appointedBy="";
        joined= false;
        terminated=false;
    }
    //creating accessor methods for each attribute
    public int getworkHour(){
        return workHour;
    }
    public int getwagePerHour(){
        return wagePerHour;
    }
    public String getstaffName(){
        return staffName;
    }
    public String getjoinDate(){
        return joinDate;
    }
    public String getqualification(){
        return qualification;
    }
    public String getappointedBy(){
        return appointedBy;
    }
    public String getshifts(){
        return shifts;
    }
    public Boolean getjoined(){
        return joined;
    }
    public Boolean getterminated(){
        return terminated;
    }

    /*creating a method to hire a staff
     * if a staff has not been hired the input values will be inserted
     * otherwise a message will be displayed.
     */
    public void partTimehire( String staffName, String joinDate, String qualification, String appointedBy){
        if(joined==false){
            this.staffName=staffName;
            this.joinDate=joinDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
            terminated=false;
        }
        else{
            System.out.println( getstaffName() + " has already been hired on "+ getjoinDate());
        }
    }

    //creating a method to terminate a hired staff
    public void terminate(){
        if( terminated==true){
            JOptionPane.showMessageDialog(oop.frame,"The Staff's record has already been terminated","Info",JOptionPane.ERROR_MESSAGE);
            
        }
        else{
            JOptionPane.showMessageDialog( oop.frame,getstaffName() + " has been terminated","Info",JOptionPane.INFORMATION_MESSAGE);
            staffName="";
            joinDate="";
            qualification="";
            appointedBy="";
            joined=false;
            terminated=true;
           
        }
    }
}