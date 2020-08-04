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
public class Client {

    private String cedula;
    private String name;
    private String lastName;
    private String cellphone;
    private String address;
    private String email;

    public Client() {
    }

    public Client(String cedula, String name, String lastName, String cellphone, String address, String email) {
        this.cedula = cedula;
        this.name = name;
        this.lastName = lastName;
        this.cellphone = cellphone;
        this.address = address;
        this.email = email;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" + "cedula=" + cedula + ", names=" + name + ", lastName=" + lastName + ", phoneNumber=" + cellphone + ", address=" + address + ", email=" + email + '}';
    }

}
