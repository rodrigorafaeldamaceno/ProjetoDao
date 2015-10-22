/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.app;

import br.edu.utfpr.dao.PessoaDaoVetor;
import br.edu.utfpr.dao.Dao;
import br.edu.utfpr.modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public class App {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa("joao", "fagundes",20);
        Pessoa jose = new Pessoa("jose","fagundes",21);
        Pessoa maria = new Pessoa("maria","fagundes",22);

        //Dao dao = new PessoaDaoArrayList();
        Dao dao = new PessoaDaoVetor(5);
        dao.adicionar(joao);     
        dao.listar(joao);       
        System.out.println("Vamos remover");
        dao.remover(joao);
        dao.listar(joao);
        
        System.out.println("\n\nOther...");
        dao.adicionar(jose);     
        dao.listar(jose);       
        System.out.println("Vamos remover");
        
        dao.remover(jose);
        dao.listar(jose);
        
    }
}
