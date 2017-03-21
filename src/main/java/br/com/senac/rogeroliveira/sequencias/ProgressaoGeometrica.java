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
public class ProgressaoGeometrica extends SequenciaNumerica 
{
    public int razao;
    
    public ProgressaoGeometrica(int valorInicial, int razao)
    {
        super(valorInicial);
        this.razao = razao;
    }
    
    public void proximoValor()
    {
        valorAtual *= razao;
    }
    
    public static void main(String[] args) {
        int quantidade = Integer.parseInt(args[0]);
        int valorInicial = Integer.parseInt(args[1]);
        int razao = Integer.parseInt(args[2]);
        ProgressaoGeometrica pg = new ProgressaoGeometrica(valorInicial, razao);
        for (int i=0; i<quantidade; i++) 
        {
            System.out.print (pg.valorAtual() + " ");
            pg.proximoValor();
        }
    }
}
