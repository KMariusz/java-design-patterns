package com.design.patterns.behavioral.strategy;

import java.util.Scanner;

/**
 * Concrete strategy that implements Bitcoin payment method.
 */
public class BitcoinStrategy implements PaymentStrategy {
    private String walletAddress;
    
    @Override
    public void collectPaymentDetails() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Bitcoin wallet address: ");
            this.walletAddress = scanner.nextLine();
        }
    }
    
    @Override
    public boolean pay(int amount) {
        if (isValidWallet()) {
            System.out.println("Paying " + amount + " using Bitcoin (" + maskWalletAddress() + ")");
            // Actual Bitcoin transaction would happen here
            return true;
        }
        return false;
    }
    
    private boolean isValidWallet() {
        // Simple validation - in a real app, this would validate the wallet address format
        return walletAddress != null && walletAddress.length() >= 26 && walletAddress.length() <= 35;
    }
    
    private String maskWalletAddress() {
        if (walletAddress == null || walletAddress.length() < 8) {
            return "****";
        }
        return walletAddress.substring(0, 4) + "..." + walletAddress.substring(walletAddress.length() - 4);
    }
}
