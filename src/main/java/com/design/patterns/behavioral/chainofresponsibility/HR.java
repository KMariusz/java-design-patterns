package com.design.patterns.behavioral.chainofresponsibility;

public class HR extends AbstractHandler {
    private static final int MAX_DAYS_CAN_APPROVE = 30;

    public HR() {
        super("HR Department");
    }

    @Override
    protected boolean canHandle(LeaveRequest request) {
        return request.getLeaveDays() <= MAX_DAYS_CAN_APPROVE;
    }

    @Override
    protected void processRequest(LeaveRequest request) {
        if (request.getLeaveDays() <= 20) {
            approve(request);
        } else if (request.getReason().toLowerCase().contains("medical")) {
            approve(request);
        } else {
            reject(request, "Leave request exceeds maximum allowed days or requires special approval.");
        }
    }
}
