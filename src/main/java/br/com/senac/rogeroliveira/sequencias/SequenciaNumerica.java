package br.com.senac.rogeroliveira.sequencias;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roger.roliveira
 */
public class SequenciaNumerica 
{
    protected int valorAtual;
    
    public SequenciaNumerica(int valorAtual)
    {
        this.valorAtual = valorAtual;
    }
    
    public int valorAtual()
    {
        return valorAtual;
    }
}

