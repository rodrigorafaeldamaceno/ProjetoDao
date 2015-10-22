/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.modelo.Pessoa;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author UTFPR
 */
public class PessoaDaoDB implements Dao {

    Statement stat;

    public PessoaDaoDB() {
        //lembre de usar suas credenciais
        String username = "rodrigo";
        String password = "kjkszpj";
        String url = "jdbc:derby://localhost:1527/Meu banco de dados [roohrafa em ROOHRAFA]";
        //depois disso, posso mandar conectar
        try {
            Connection com
                    = DriverManager.getConnection(url, username, password);
            stat = com.createStatement();
            System.out.println("Sessão estabilizada...");
        } catch (SQLException se) {
            System.out.println("Mensagem: " + se.getMessage());
        }
    }

    @Override
    public void adicionar(Pessoa p) {

    }

    @Override
    public void remover(Pessoa p) {
    }

    @Override
    public void listar(Pessoa p) {
    }

}
