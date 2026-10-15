class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void introduce(){
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
        
    }
}


class Employee extends Person{
    private String company;
    public Employee(String name, int age, String company){
        super(name, age);
        this.company = company;
    }
    public String getCompany(){
        return company;
    }
    public void displayInfo(){
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Company: " + getCompany());
    }

}

public class Inheritance{
    public static void main(String[] args) {
        System.out.println("Inheritance in Java");
        // ============================================================
        // ceating objects of Person and Employee classes
        // ============================================================

        // Employee employee1 = new Employee("John Doe", 30, "ABC Company");
        // Employee employee2 = new Employee("Jane Smith", 28, "XYZ Corporation");
        // employee1.introduce();

        // employee1.displayInfo();
        // employee2.displayInfo();
        // creating array
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("John Doe", 30, "ABC Company");
        employees[1] = new Employee("Jane Smith", 28, "XYZ Corporation");
        employees[2] = new Employee("Alice Johnson", 25, "DEF Industries");
        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }

}
