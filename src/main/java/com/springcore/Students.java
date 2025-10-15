package com.springcore;

public class Students {
    private int studentId;
    private String studentName;
    private String studentAddress;

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentAddress() {
        return studentAddress;
    }
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    //constructor with feild
    public Students(int studentId, String studentAddress, String studentName){
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }
    //default constructor
    public Students(){
        super();
    }

    //after creating object it will automatically print all the values
    @Override
    public String toString(){
        return "Student [studentId=" + studentId+ ", StudentName="+ studentName + ", studentAddress= "+ studentAddress + "]";
    }
}


