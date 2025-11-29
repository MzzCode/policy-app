package policyapp;

import java.util.*;

class PolicyHolder {

    private String policyId;
    private String name;
    private double investmentAmount;
    private int yearsInForce;

    public PolicyHolder(String policyId, String name, double investmentAmount, int yearsInForce) {
        this.policyId = policyId;
        this.name = name;
        this.investmentAmount = investmentAmount;
        this.yearsInForce = yearsInForce;
    }

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getInvestmentAmount() {
		return investmentAmount;
	}

	public void setInvestmentAmount(double investmentAmount) {
		this.investmentAmount = investmentAmount;
	}

	public int getYearsInForce() {
		return yearsInForce;
	}

	public void setYearsInForce(int yearsInForce) {
		this.yearsInForce = yearsInForce;
	}
    
}

//Main

public class PolicyApp {

    // future value calculation
    public static double calculateMaturityValue(double investmentAmount, int yearsInForce ) {
        return investmentAmount * Math.pow(1.08, yearsInForce);
    }

    // find high value policies 
    public static void findHighValuePolicies(List<PolicyHolder> list) {
        System.out.println("High Value Policies (> 1,00,000):\n");
        

        for (PolicyHolder p : list) {
            if (p.getInvestmentAmount() > 100000) {

                double mv = calculateMaturityValue(p.getInvestmentAmount(), p.getYearsInForce());

                System.out.println("Policy ID: " + p.getPolicyId());
                System.out.println("Name: " + p.getName());
                System.out.println("Investment Amount: " + p.getInvestmentAmount());
                System.out.println("Years in Force: " + p.getYearsInForce());
                System.out.println("Maturity Value: " + mv);
                System.out.println();
               
            }
        }
    }

    public static void main(String[] args) {

        List<PolicyHolder> list = new ArrayList<>();

        list.add(new PolicyHolder("P01", "Mohit", 50000, 3));
        list.add(new PolicyHolder("P02", "Mega", 150000, 5));
        list.add(new PolicyHolder("P03", "jhon", 250000, 2));

        System.out.println("------ POLICY HOLDER MANAGEMENT APP -----\n");

        findHighValuePolicies(list);
    }
}
