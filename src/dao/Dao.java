/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public interface Dao {
    //ctrl +shift +i
    
    public void adicionar(Pessoa joao);
    public void remover(Pessoa joao);
    public void listar(Pessoa joao);
}
