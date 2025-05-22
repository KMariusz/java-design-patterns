package com.design.patterns.behavioral.chainofresponsibility;

public interface Handler {
    void setNext(Handler handler);
    void handle(LeaveRequest request);
}
