package com.solid.s.good;

public class GoodEmployee {

    protected String status;
    protected String name;
    protected int hours;

    public GoodEmployee(String status, String name, int hours) {
        this.status = status;
        this.name = name;
        this.hours = hours;
    }

    public int calculatePay() {
        switch (this.status) {
            case "A":
                return 1;
            case "B":
                return 2;
            default:
                return 0;
        }
    }

    public void save() {
        System.out.printf("%s saved to database.\n", this.name);
    }

    public String reportHours() {
        return String.format("%s worked %d hours.\n", this.name, this.hours);
    }

    @Override
    public String toString() {
        return "I am a employee";
    }

}
