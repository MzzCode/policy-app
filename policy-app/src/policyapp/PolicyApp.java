package policyapp;

import java.util.*;

class PolicyHolder {

 private String id;
 private String name;
 private double amount;
 private int years;

 public PolicyHolder(String id, String name, double amount, int years) {
     this.id = id;
     this.name = name;
     this.amount = amount;
     this.years = years;
 }

 public String getId() { 
	 return id; 
	 }
 public String getName() { 
	 return name;
	 }
 public double getAmount() { 
	 return amount;
	 }
 public int getYears() { 
	 return years; 
	 }

 public void setId(String id) { 
	 this.id = id;
	 }
 public void setName(String name) { 
	 this.name = name; 
	 }
 public void setAmount(double amount) { 
	 this.amount = amount; 
	 }
 public void setYears(int years) { 
	 this.years = years;
	 }

 public String toString() {
     return "ID: " + id + ", Name: " + name +
            ", Amount: " + amount + ", Years: " + years;
 }
}


// main class
public class PolicyApp {

 public static void main(String[] args) {

     List<PolicyHolder> list = new ArrayList<>();

     list.add(new PolicyHolder("P01", "Rahul", 50000, 3));
     list.add(new PolicyHolder("P02", "Amit", 150000, 5));
     list.add(new PolicyHolder("P03", "Sneha", 250000, 2));

     System.out.println("----- POLICY HOLDER MANAGEMENT APP -----\n");

    
     findHighValuePolicies(list);
 }

 // future value calculation)
 public static double calculateMaturityValue(double amount, int years) {
     return amount * Math.pow(1.08, years);
 }

 // find high value policies
 public static void findHighValuePolicies(List<PolicyHolder> list) {
     System.out.println("High Value Policies (> 1,00,000):\n");

     for (PolicyHolder p : list) {
         if (p.getAmount() > 100000) {
             System.out.println(p);
         }
     }
 }
}


