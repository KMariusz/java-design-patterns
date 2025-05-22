package com.design.patterns.behavioral.chainofresponsibility;

public abstract class AbstractHandler implements Handler {
    protected Handler nextHandler;
    protected String role;

    public AbstractHandler(String role) {
        this.role = role;
    }

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle(LeaveRequest request) {
        if (canHandle(request)) {
            processRequest(request);
        } else if (nextHandler != null) {
            nextHandler.handle(request);
        } else {
            System.out.println("No handler available to process this request: " + request);
        }
    }

    protected abstract boolean canHandle(LeaveRequest request);
    protected abstract void processRequest(LeaveRequest request);
    
    protected void approve(LeaveRequest request) {
        System.out.println(role + " approved leave request for " + 
                         request.getEmployeeName() + " for " + 
                         request.getLeaveDays() + " days. Reason: " + 
                         request.getReason());
    }
    
    protected void reject(LeaveRequest request, String reason) {
        System.out.println(role + " rejected leave request for " + 
                         request.getEmployeeName() + ". Reason: " + reason);
    }
}
