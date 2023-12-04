package edu.metrostate.ics625;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    @GetMapping("/employeeForm")
    public String showForm(Employee employee) {
        return "employeeForm";
    }

    @PostMapping("/employeeForm")
    public String submitForm(Employee employee, Model model) {
        // Calculate tax rate and net pay based on dependents
        double taxRate;
        if (employee.getDependents() <= 1) {
            taxRate = 0.2;
        } else if (employee.getDependents() <= 3) {
            taxRate = 0.15;
        } else {
            taxRate = 0.1;
        }


        double netPay = employee.getGrossPay() * (1 - taxRate);


        // Set attributes to be displayed on the result page
        model.addAttribute("fullName", employee.getFirstName() + " " + employee.getLastName());
        model.addAttribute("dependents", employee.getDependents());
        model.addAttribute("grossPay", employee.getGrossPay());
        model.addAttribute("taxRate", taxRate * 100);
        model.addAttribute("netPay", netPay);

        return "result";
    }
}