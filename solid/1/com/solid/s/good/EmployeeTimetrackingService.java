package com.solid.s.good;

public class EmployeeTimetrackingService {
    public EmployeeTimetrackingService() {
    }

    public String reportHours(GoodEmployee goodEmployee){
        return String.format("%s worked %d hours.\n", goodEmployee.name, goodEmployee.hours);
    }

}
