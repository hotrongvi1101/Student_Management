
package project;

import java.util.Scanner;
public class Student{
    private String fullName;
    private String ID;
    private String dateofBirth;
    private String phoneNo;
    private String sex;
    private String khoa;

    public Student() {
    }

    public Student(String ID, String fullName, String dateofBirth, String phoneNo, String sex, String khoa) {
        this.fullName = fullName;
        this.ID = ID;
        this.dateofBirth = dateofBirth;
        this.phoneNo = phoneNo;
        this.sex = sex;
        this.khoa = khoa;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String classf) {
        this.khoa = khoa;
    }

  
}
