package com.design.patterns.behavioral.chainofresponsibility;

public class TeamLead extends AbstractHandler {
    private static final int MAX_DAYS_CAN_APPROVE = 3;

    public TeamLead() {
        super("Team Lead");
    }

    @Override
    protected boolean canHandle(LeaveRequest request) {
        return request.getLeaveDays() <= MAX_DAYS_CAN_APPROVE;
    }

    @Override
    protected void processRequest(LeaveRequest request) {
        if (request.getLeaveDays() <= 1) {
            approve(request);
        } else if (request.getReason().toLowerCase().contains("emergency")) {
            approve(request);
        } else {
            reject(request, "Please provide more details about your leave request.");
        }
    }
}
