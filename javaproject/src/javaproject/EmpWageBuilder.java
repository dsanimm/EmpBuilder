package javaproject;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class EmpWageBuilder {
public static final int IS_PART_TIME=1;
public static final int IS_FULL_TIME=2;
private int numOfCompany=0;
private LinkedList<CompanyEmpWage> companyEmpWageList;
private Map<String,CompanyEmpWage> companyToEmpWageMap;
public EmpWageBuilder() {
	companyEmpWageList = new LinkedList<>();
	companyToEmpWageMap=new HashMap<>();
}
public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
	CompanyEmpWage companyEmpWage = new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
companyEmpWageList.add(companyEmpWage);
companyToEmpWageMap.put(company, companyEmpWage);

}
	
public void computeEmpWage() {	
	for(int i=0;i<companyEmpWageList.size();i++) {
		CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
		companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
		System.out.println(companyEmpWage);
	}
}
public int computeEmpWage(CompanyEmpWage companyEmpWage) {
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
return totalEmpHrs *companyEmpWage.empRatePerHour;
		
}
public int getTotalWage(String company) {
	return companyToEmpWageMap.get(company).totalEmpWage;
}
public static void main(String[] args) {
	EmpWageBuilder empWageBuilder = new EmpWageBuilder();

String company;
int empRatePerHour, numOfWorkingDays,maxHoursPerMonth;
Scanner sc=new Scanner(System.in);
int choice =1;
while(choice!=4) {
System.out.println("Enter your choice:\n1. Enter Company Details\n2. Compute Total Wage for chosen company\n3. Compute Total Wage for all companies\n4. Exit");

	choice = sc.nextInt();


	switch(choice) {
	case 1:
		System.out.println("Enter company:");
		company = sc.next();
		System.out.println("Enter empRatePerHour:");
		empRatePerHour=sc.nextInt();
		System.out.println("Enter numOfWorkingDays:");
		numOfWorkingDays=sc.nextInt();
		System.out.println("Enter maxHoursPerMonth:");
		maxHoursPerMonth=sc.nextInt();
		System.out.println("Record Added");
		empWageBuilder.addCompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		System.out.println("Company added");
		break;
	case 2:
		
		System.out.println("Enter the company name");
		company = sc.next();
		System.out.println("Total Wage for "+company+" "+ empWageBuilder.getTotalWage(company));
		
		break;
	
	case 3:
		empWageBuilder.computeEmpWage();
		break;
	case 4:
		break;
	default: System.out.println("Wrong choice");
		
		

}
}

}

}
