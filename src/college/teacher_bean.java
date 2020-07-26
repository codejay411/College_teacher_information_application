/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

/**
 *
 * @author jaypr
 */
public class teacher_bean {
    
    private int id;
    private String name;
    private float salary;
    private String dob;
    private String address;
    private String subject;
    
    // contructor made by presseing alt+insert

    public teacher_bean(int id, String name, float salary, String dob, String address, String subject) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dob = dob;
        this.address = address;
        this.subject = subject;
    }

    
    // getter and setter methods by clicking Alt+insert
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    
    
}
