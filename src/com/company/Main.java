package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p = new Person();
        p.inputPerson();
        p.showPerson();
        Person p1 = new Person();
        p1.setName("Huong");
        p1.setSex("phu nu");
        p1.setAdrress("HN");
        p1.setBirthday("1995");
        p1.showPerson();
    }
}
