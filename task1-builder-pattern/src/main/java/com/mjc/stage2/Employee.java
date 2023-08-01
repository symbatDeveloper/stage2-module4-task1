package com.mjc.stage2;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class Employee {
    private String name;
    private String lastName;
    private String position;
    private static String phone;
    private String email;
    private String carNumber;
    private String getLastName;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public static EmployeeBuilder getBuilder() {
        return new EmployeeBuilder();
    }

    public static class EmployeeBuilder {
        private Employee employee;
        public  EmployeeBuilder(){
            employee = new Employee();
        }
    Employee employee1 = new Employee.EmployeeBuilder()
        .setName("name")
        .setLastName("lastName")
        .getPosition()
        .setPosition("position")
        .getPhone();
        //.setPhone("String phone")
//        .getEmail()
//        .setEmail(String email)
//        .getCarNumber()
//         .setCarNumber(String carNumber)
//        . getBuilder();

        private Employee getPhone() {
            return null;
        }


        private EmployeeBuilder setPhone() {
            employee.phone= phone;
            return this;
        }

        private EmployeeBuilder getPosition() {
            return null;
        }

        private EmployeeBuilder setPosition(String position) {
            employee.position=position;
            return this;
        }

        private EmployeeBuilder setLastName(String lastName) {
           employee.lastName= lastName;
           return this;
        }
        private EmployeeBuilder setEmail(String email) {
            employee.email= email;
            return this;
        }

        private EmployeeBuilder setName(String name) {
            employee.name =name;
            return this;
        }
        // Write your code here!
    }

}

