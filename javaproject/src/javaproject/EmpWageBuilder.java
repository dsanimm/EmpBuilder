package javaproject;


public class EmpWageBuilder {
public static final int IS_PART_TIME=1;
public static final int IS_FULL_TIME=2;

	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage;
public EmpWageBuilder(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
{
	this.company=company;
	this.empRatePerHour=empRatePerHour;
	this.numOfWorkingDays=numOfWorkingDays;
	this.maxHoursPerMonth=maxHoursPerMonth;
	
	}


public void computeEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
	int empHrs =0,totalEmpHrs=0,totalWorkingDays=0;
	while(totalEmpHrs <= companyEmpWage.maxHoursPerMonth &&
		    totalWorkingDays < companyEmpWage.numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck=(int) Math.floor(Math.random()*10)%3;
			switch(empCheck) {
					case IS_FULL_TIME:
						empHrs=8;
						break;
					case IS_PART_TIME:
						empHrs=4;
						break;
					default:
						empHrs=0;
			}
			totalEmpHrs +=empHrs;
			
			System.out.println("Day#: " + totalWorkingDays + " EMpe Hr: " +empHrs);
			//System.out.println("Emp Wage: " +empWage);
		}
int totalEmpWage =  totalEmpHrs *empRatePerHour;
//System.out.println(Total Emp Wage for Company: "+company+" is: "+totalEmpWage  );
		


}

public String toString(){
System.out.println(Total Emp Wage for Company: "+company+" is: "+totalEmpWage  );
}
public static void main(String[] args) {
EmpWageBuilder dMart=new EmpWageBuilder("DMart",20,2,10);
EmpWageBuilder dMart=new EmpWageBuilder("Reliance",10,4,20);
 dMrt.computeEmpWage();
System.out.println(dMart);
reliance.computeWage();
System.out.println(reliance);

}

}
