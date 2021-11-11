package com.bridgelabz.emp;

public interface EmployeeService {

	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfworkingDays, int maxHoursPerMonth);

	public void computeEmpWage();

}
