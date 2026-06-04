/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo10_24060124110142;

/**
 * File: MainDAO.java
 * Deskripsi: Main program untuk akses DAO
 * @author Muchammad Yuda Tri Ananda
 */
public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("Muchammad Yuda Tri Ananda");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
