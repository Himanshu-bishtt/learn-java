package com.company;

public class Printer {
    private int tonerLevel;
    private int pagePrinted;
    private boolean duplex;
    private final int maxPages = 1200;
    private final int pagesRemaining = 1200;

    public Printer(int tonerLevel, int pagePrinted, boolean duplex) {
        if(tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagePrinted = pagePrinted;
        this.duplex = duplex;
    }

    public void fillToner(int level) {
        if(this.tonerLevel + level <= 100) {
            this.tonerLevel += level;
            System.out.println("Toner added: " + level);
            System.out.println("New Toner Level: " + this.tonerLevel);
        } else {
            this.tonerLevel = 100;
            System.out.println("Max Toner level reached: " + this.tonerLevel + "% full");
        }
    }

    public void printPage(int pages) {
        if(this.pagePrinted + pages <= this.maxPages) {
            this.pagePrinted += pages;
            int remainingPages = this.pagesRemaining - this.pagePrinted;
            System.out.println("Pages printed: " + pages);
            System.out.println("Total Pages Printed: " + this.pagePrinted);
            System.out.println("Remaining pages: " + remainingPages);
        } else {
            System.out.println("Not Enough pages");
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
    public int getPagePrinted() {
        return pagePrinted;
    }
    public boolean isDuplex() {
        return duplex;
    }
}
