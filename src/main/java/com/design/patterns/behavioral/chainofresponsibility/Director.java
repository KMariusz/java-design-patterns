package com.design.patterns.behavioral.chainofresponsibility;

public class Director extends AbstractHandler {
    public Director() {
        super("Director");
    }

    @Override
    protected boolean canHandle(LeaveRequest request) {
        // Director can handle any request that reaches him/her
        return true;
    }

    @Override
    protected void processRequest(LeaveRequest request) {
        if (request.getLeaveDays() > 30) {
            if (request.getReason().toLowerCase().contains("sabbatical") ||
                request.getReason().toLowerCase().contains("study")) {
                approve(request);
            } else {
                reject(request, "Leave request exceeds policy limits and doesn't qualify for special consideration.");
            }
        } else {
            // Shouldn't reach here as HR should handle up to 30 days
            reject(request, "This request should be handled by HR or lower management.");
        }
    }
}
