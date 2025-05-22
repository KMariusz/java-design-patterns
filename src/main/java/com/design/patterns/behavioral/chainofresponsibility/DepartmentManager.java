package com.design.patterns.behavioral.chainofresponsibility;

public class DepartmentManager extends AbstractHandler {
    private static final int MAX_DAYS_CAN_APPROVE = 10;

    public DepartmentManager() {
        super("Department Manager");
    }

    @Override
    protected boolean canHandle(LeaveRequest request) {
        return request.getLeaveDays() <= MAX_DAYS_CAN_APPROVE;
    }

    @Override
    protected void processRequest(LeaveRequest request) {
        if (request.getLeaveDays() <= 7) {
            approve(request);
        } else if (request.getReason().toLowerCase().contains("vacation") && 
                  request.getLeaveDays() <= 10) {
            approve(request);
        } else {
            reject(request, "Leave request requires HR approval.");
        }
    }
}
