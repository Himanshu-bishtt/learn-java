package com.company;

public class Furniture {
    private Table table;
    private Chair chair;
    private StudyTable studyTable;

    public Furniture(Table table, Chair chair, StudyTable studyTable) {
        this.table = table;
        this.chair = chair;
        this.studyTable = studyTable;
    }

    public void furnitureRate(String furniture) {
        String lowerCaseFurniture = furniture.toLowerCase();
        if(lowerCaseFurniture.equals("table") || lowerCaseFurniture.equals("tables") ) {
            System.out.println("Table is $1000");
        } else if(lowerCaseFurniture.equals("chair") || lowerCaseFurniture.equals("chairs")) {
            System.out.println("Chair is $250");
        } else if(lowerCaseFurniture.equals("studytable") || lowerCaseFurniture.equals("studytables") ) {
            System.out.println("StudyTable is $190");
        } else {
            System.out.println("Invalid furniture name");
        }
    }

    public Table getTable() {
        return table;
    }
    public Chair getChair() {
        return chair;
    }
    public StudyTable getStudyTable() {
        return studyTable;
    }
}
