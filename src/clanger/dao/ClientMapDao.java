/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanger.dao;

import clanger.domain.Cliente;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author c-lan
 */
public class ClientMapDao implements iClientDao{
    private Map<Long, Cliente> map;
    
    public ClientMapDao(){
        map = new TreeMap<>();
    }
    @Override
    public Boolean cadastrar(Cliente cliente) {
        if(map.containsKey(cliente.getCpf())){
           return false; 
        } else {
            map.put(cliente.getCpf(), cliente);
            return true;
        }
    }

    @Override
    public void excluir(Long cpf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void alterar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente consultar(Long CPF) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
