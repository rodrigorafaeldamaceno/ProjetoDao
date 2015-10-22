/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modelo.*;

/**
 *
 * @author UTFPR
 */
public class PessoaDaoArrayList implements Dao{
    private ArrayList<Pessoa> lista;

    public PessoaDaoArrayList() {
        lista = new ArrayList<>();
    }
    
    
    
    @Override
    public void adicionar(Pessoa p) {
        lista.add(p);
        System.out.println("A pessoa \"" +p.getNome()+" foi inserida com sicesso\"");
    }

    @Override
    public void remover(Pessoa p) {
        lista.remove(p);
    }

    @Override
    public void listar(Pessoa p) {
        /*temos que percorrer o ArrayLista
        de sua posição inicial até o final.. mas temos um topo
        
        */
        System.out.println("Inicio da relação\n");
        for (Pessoa posicao : lista) {
            System.out.println(posicao);
        }
        System.out.println("Final da relação");

    }
    
}
