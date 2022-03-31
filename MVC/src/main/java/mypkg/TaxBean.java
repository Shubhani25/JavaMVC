package mypkg;
import java.io.Serializable;

public class TaxBean implements Serializable{
	private int income, age, tax;
	private boolean govtEmp;
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
		processTax();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public boolean isGovtEmp() {
		return govtEmp;
	}
	public void setGovtEmp(boolean govtEmp) {
		this.govtEmp = govtEmp;
	}
	
	private void processTax() {
		if(income>=500000) {
			tax = income*20/100;
		}
		else if(income>=300000) {
			tax = income*10/100;
		}
	}
	
}
