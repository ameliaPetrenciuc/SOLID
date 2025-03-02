package com.solid.s.good;

public class EmployeePaymentService {
    private EmployeeAdditionalPaymentService employeeAdditionalPaymentService;

    public EmployeePaymentService(EmployeeAdditionalPaymentService employeeAdditionalPaymentService) {
        this.employeeAdditionalPaymentService = employeeAdditionalPaymentService;
    }

    public int calculatePay(GoodEmployee goodEmployee){
        switch (goodEmployee.status) {//am schimbat pe protected, as fi putut folosi si getteri si setteri pt a pastra incapsularea
            case "A":
                return 1;
            case "B":
                return 2;
            default:
                return 0;
        }
    }


}
