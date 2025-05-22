package com.design.patterns.behavioral.chainofresponsibility;

public class LeaveRequest {
    private String employeeName;
    private int leaveDays;
    private String reason;

    public LeaveRequest(String employeeName, int leaveDays, String reason) {
        this.employeeName = employeeName;
        this.leaveDays = leaveDays;
        this.reason = reason;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public String getReason() {
        return reason;
    }

    @Override
    public String toString() {
        return "LeaveRequest{" +
                "employeeName='" + employeeName + '\'' +
                ", leaveDays=" + leaveDays +
                ", reason='" + reason + '\'' +
                '}';
    }
}
