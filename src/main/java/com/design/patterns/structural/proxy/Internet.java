package com.design.patterns.structural.proxy;

/**
 * Subject interface that both the RealSubject and Proxy will implement.
 */
public interface Internet {
    void connectTo(String serverHost) throws Exception;
}
