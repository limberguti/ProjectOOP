/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecordgui.model;

/**
 *
 * @author Jhonatan Lituma
 */
public class Person {

    private String cedula;
    private String name;
    private String lastName;
    private String cellphone;

    public Person() {

    }

    public Person(String cedula, String name, String lastName, String cellphone) {
        this.cedula = cedula;
        this.name = name;
        this.lastName = lastName;
        this.cellphone = cellphone;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    @Override
    public String toString() {
        return cedula;
    }

}
