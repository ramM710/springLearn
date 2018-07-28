/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp;

/**
 *
 * @author Ram M
 */
public class EmpInfo {

    private int id;
    private String name;
    EmpAddress address;

    public EmpInfo() {
    }

    public EmpInfo(EmpAddress address) {
        this.address = address;
    }

    public EmpAddress getAddress() {
        return address;
    }

    public void setAddress(EmpAddress address) {
        this.address = address;
    }

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

    public void myInit() {
        System.out.println("---Object Initialized----");
    }

    public void myDestroy() {
        System.out.println("---Object Destroyed----");
    }

    @Override
    public String toString() {
        return "EmpInfo{" + "id =" + id + ", name =" + name + ", address =" + address + '}';
    }

}
