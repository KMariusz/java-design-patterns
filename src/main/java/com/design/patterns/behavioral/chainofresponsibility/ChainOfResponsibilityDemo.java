package com.design.patterns.behavioral.chainofresponsibility;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        // Create the chain of responsibility
        Handler teamLead = new TeamLead();
        Handler deptManager = new DepartmentManager();
        Handler hr = new HR();
        Handler director = new Director();
        
        // Set up the chain
        teamLead.setNext(deptManager);
        deptManager.setNext(hr);
        hr.setNext(director);
        
        System.out.println("=== Leave Request Processing System ===\n");
        
        // Test different leave requests
        processLeaveRequest(teamLead, "John Doe", 1, "Doctor's appointment");
        processLeaveRequest(teamLead, "Jane Smith", 2, "Emergency at home");
        processLeaveRequest(teamLead, "Mike Johnson", 5, "Vacation");
        processLeaveRequest(teamLead, "Sarah Williams", 8, "Vacation");
        processLeaveRequest(teamLead, "David Brown", 15, "Medical treatment");
        processLeaveRequest(teamLead, "Emma Davis", 25, "Extended vacation");
        processLeaveRequest(teamLead, "Robert Wilson", 45, "Sabbatical for research");
        processLeaveRequest(teamLead, "Lisa Anderson", 3, "Personal day");
    }
    
    private static void processLeaveRequest(Handler handler, String name, int days, String reason) {
        System.out.println("\nProcessing leave request for " + name + ":");
        System.out.println("Days: " + days + ", Reason: " + reason);
        handler.handle(new LeaveRequest(name, days, reason));
    }
}
