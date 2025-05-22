package com.design.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Proxy class that controls access to the RealInternet.
 */
public class ProxyInternet implements Internet {
    private Internet internet = new RealInternet();
    private static List<String> bannedSites;
    
    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("banned-site.com");
        bannedSites.add("another-banned-site.com");
        bannedSites.add("restricted-site.org");
    }
    
    @Override
    public void connectTo(String serverHost) throws Exception {
        if (bannedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Access Denied to " + serverHost);
        }
        
        internet.connectTo(serverHost);
    }
    
    /**
     * Add a site to the banned list.
     * @param site The site to ban
     */
    public static void banSite(String site) {
        bannedSites.add(site.toLowerCase());
    }
    
    /**
     * Remove a site from the banned list.
     * @param site The site to unban
     */
    public static void unbanSite(String site) {
        bannedSites.remove(site.toLowerCase());
    }
}
