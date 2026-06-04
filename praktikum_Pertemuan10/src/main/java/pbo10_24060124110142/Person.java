/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo10_24060124110142;

/**
 *  File: Person.java
 *  Deskripsi: Person database model
 * @author Muchammad Yuda Tri Ananda
 */
public class Person {
    private int id;
    private String name;
    
    public Person(String n) {
        this.name = n;
    }
    
    public Person(int i, String n) {
        this.id = i;
        this.name = n;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
}
