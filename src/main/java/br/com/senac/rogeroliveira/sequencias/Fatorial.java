/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.rogeroliveira.sequencias;

/**
 *
 * @author roger.roliveira
 */
public class Fatorial extends SequenciaNumerica 
{    
    private int fator;
    
    public Fatorial()
    {
        super(1);
        fator = 1;
    }
    
    private void calcularFatorial()
    {
        for (int i = 1; i < fator; i++) {
            this.valorAtual *= i; 
        }
    }
    
    public void proximoValor()
    {
        this.valorAtual = 1;
        fator++;
        calcularFatorial();
    }
    
    public static void main (String[] args) 
    {
        int quantidade = Integer.parseInt(args[0]);
        Fatorial pg = new Fatorial();
        for (int i=0; i<quantidade; i++) 
        {
            System.out.print (pg.valorAtual() + " ");
            pg.proximoValor();
        }
    } 
}
