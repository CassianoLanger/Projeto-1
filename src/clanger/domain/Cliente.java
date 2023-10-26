/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanger.domain;

import java.util.Objects;

/**
 *
 * @author c-lan
 */
public class Cliente {
    private String name;
    private Long cpf;
    private String telephone;
    private String address;
    private Long number;
    private String city;
    private String state;
    
    public Cliente(String name, String cpf, String telephone, String address, 
            String number, String city, String state){
        this.name = name;
        this.cpf = Long.valueOf(cpf);
        this.telephone = telephone;
        this.address = address;
        this.number = Long.valueOf(number);
        this.city = city;
        this.state = state;
         
    }
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public Long getCpf(){
        return this.cpf;
    }
    
    public String getTelephone(){
        return this.telephone;
    }
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }
    
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    
    public Long getNumber(){
        return this.number;
    }
    public void setNumber(Long number){
        this.number = number;
    }
    
    public String getCity(){
        return this.city;
    }
    public void setCity(String city){
        this.city = city;
    }
    
    public String getState(){
        return this.state;
    }
    
    public void setState(String state){
        this.state = state;
    }
    
    @Override
    public int hashCode() {
            return Objects.hash(cpf);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.cpf, other.cpf);
    }
    
    
}
