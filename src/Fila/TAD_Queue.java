/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fila;

import Arvore.Questoes;

/**
 *
 * @author Clayton
 */

public interface TAD_Queue {//Tipo abstrato de dados.
    //Retornam se a fila está vazia:
    public boolean isEmpty();
   
    //Insere um elemento no final da fila:
    public Questoes enqueue(Questoes x);
    //Remove um elemento do início da fila:
    public Questoes dequeue();
    //Retorna o objeto do início da fila (o 1º da fila) sem eliminar:
    //public Object peek();
    public Questoes peek();
    //Retorna o conteúdo (todos os elementos) da Queue:
    @Override
    public String toString();
}
