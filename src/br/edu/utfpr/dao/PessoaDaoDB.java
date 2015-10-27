/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.modelo.Pessoa;
import java.sql.*;

/**
 * jdbc:derby://localhost:1527/DB
 *
 * @author UTFPR
 */
public class PessoaDaoDB implements Dao {

    Statement stat;

    public PessoaDaoDB() {
        //lembre de usar suas credenciais
        String username = "rodrigo";
        String password = "kjkszpj";
        String url = "jdbc:derby://localhost:1527/DB";
        //depois disso, posso mandar conectar
        try {
            Connection com = DriverManager.getConnection(url, username, password);
            stat = com.createStatement();
            System.out.println("Sessão estabilizada...");
        } catch (SQLException se) {
            System.out.println("Mensagem: " + se.getMessage());
        }
    }

    @Override
    public void adicionar(Pessoa p) {
        String instrucao = "INSERT INTO PESSOA(NOME, SOBRENOME, IDADE) values ("
                + "'" + p.getNome() + "',"
                + "'" + p.getSobrenome() + "',"
                + p.getIdade() + ")";
        System.out.println(instrucao);

        try {
            stat.executeUpdate(instrucao);

        } catch (SQLException se) {
            System.out.println("Mensagem: " + se.getMessage());

        }
    }

    @Override
    public void remover(Pessoa p) {
        String instrucao = "DELETE FROM PESSOA WHERE NOME ='" + p.getNome() + "'";
        System.out.println(instrucao);

        try {
            stat.executeUpdate(instrucao);
        } catch (SQLException se) {
            System.out.println("Mensagem: " + se.getMessage());
        }
    }

    @Override
    public void listar(Pessoa p) {
        String instrucao = "SELECT 'FROM PESSOA'";

        try {
            //vou executar e armazenar o resultado
            //um select traz resultados que precisam ser armazenados, vamos usar o resultSet para isso
            ResultSet rs = stat.executeQuery(instrucao);
            while (rs.next()) {
                System.out.println("Nome: " + rs.getString("NOME")
                        + "Sobrenome: " + rs.getString("SOBRENOME")
                        + "Idade: " + rs.getString("IDADE")
                );
            }
        } catch (SQLException se) {
            System.out.println("Mensagem: " + se.getMessage());
        }
    }

}
