/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanger.dao;

import clanger.domain.Cliente;
import java.util.Map;
import java.util.Objects;
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
        Cliente clientCadastrado = this.map.get(cpf);
        
        if(clientCadastrado != null){
            this.map.remove(cpf,clientCadastrado);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = this.map.get(cliente.getCpf());		
            if(clienteCadastrado != null) {
                clienteCadastrado.setName(cliente.getName());
                clienteCadastrado.setCity(cliente.getCity());
                clienteCadastrado.setAddress(cliente.getAddress());
                clienteCadastrado.setNumber(cliente.getNumber());
                clienteCadastrado.setState(cliente.getState());
                clienteCadastrado.setTelephone(cliente.getTelephone());
            }
    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }
    
    @Override
	public int hashCode() {
		return Objects.hash(map);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientMapDao other = (ClientMapDao) obj;
		return Objects.equals(map, other.map);
	}
    
}
