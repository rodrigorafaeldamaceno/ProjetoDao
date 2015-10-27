/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public class PessoaDaoVetor implements Dao {

    private Pessoa lista[];
    private int posicao;
    private int qtd;

    public PessoaDaoVetor(int x) {
        lista = new Pessoa[x];
        posicao = 0;
        qtd = 0;
    }

    @Override
    public void adicionar(Pessoa p) {
        lista[posicao] = p;
        System.out.println("A pessoa \"" + p.getNome() + " foi inserida com sicesso\"");
        posicao++;
        qtd++;
    }

    @Override
    public void remover(Pessoa p) {
        lista[posicao] = null;
        System.out.println("removido");
    }

    @Override
    public void listar(Pessoa p) {
        System.out.println("Aqui vc vai listar");
        int i;
        for (i = 0; i < qtd; i++) {
            System.out.println(lista[i]);
        }

    }

}
