package com.company;

import java.util.Scanner;

public class Person {
    protected String name;
    protected String sex;
    protected String adrress;
    protected String birthday;

    public Person() {
    }

    public Person(String name, String sex, String adrress, String birthday) {
        this.name = name;
        this.sex = sex;
        this.adrress = adrress;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdrress() {
        return adrress;
    }

    public void setAdrress(String adrress) {
        this.adrress = adrress;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public  void  inputPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten :");
        this.name = scanner.nextLine();
        System.out.println("nhap gioi tinh :");
        this.sex = scanner.nextLine();
        System.out.println("nhap dia chi :");
        this.adrress = scanner.nextLine();
        System.out.println("nhap ngay sinh");
        this.birthday = scanner.nextLine();
    }

    public void showPerson(){
        System.out.println("Ho ten: " + this.name + " " + " gioi tinh: " + this.sex + " " + " dia chi: " + this.adrress + " ngay sinh: " + this.birthday);
    }
}
