package edu.metrostate.ics625;

public class Employee {

    private String firstName;

    private String lastName;

    private int dependents;

    private double grossPay;


    public Employee() {}

    public Employee(String firstName, String lastName, int dependents, double grossPay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dependents = dependents;
        this.grossPay = grossPay;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDependents() {
        return dependents;
    }

    public void setDependents(int dependents) {
        this.dependents = dependents;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }




}
