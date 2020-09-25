/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;


import javax.swing.JOptionPane;


public class Carro {
    
    public static final double CAPACIDAEDE_MAXIMA = 100.0;
    
    private int id;
    private String marca;
    protected String modelo;
    private double capacidadedetanque;
    private double qtdCombustivel;
    
    public Carro(){
        System.out.println("Carro construido");
    }
    
    public Carro(String marca, String modelo, double capacidadedotanque){
        this.marca= marca;
        this.modelo= modelo;
        this.capacidadedetanque= capacidadedotanque;
        this.qtdCombustivel= 0.0;
    }
     
    public int getid(){
        return this.id;
    }
    
    public void cadastrar(){
        if( this.id > 0){
            String texto = "Este carro ja esta cadastrado";
            JOptionPane.showMessageDialog(null, texto);
        }else{    
        String texto = "O carro com a marca "+ this.marca + " e modelo "
                + this.modelo + "Foi cadastrado com sucesso!";
        JOptionPane.showMessageDialog(null, texto);
        this.id = (int) Math.random()* 1000 + 1 ;
        }
    }
    
    public double abastecer( double qtd){
        double espaco = this.capacidadedetanque - this.qtdCombustivel;
        if( espaco >= qtd ){
            espaco = espaco - qtd;
        }else{
            JOptionPane.showMessageDialog( null, "Espaço insuficiente ");
        }
        return espaco;
    }
    //constantes e metodos estaticos 
    public static double calcularConsumo(double km, double litros){
        double consumo = km / litros;
        return consumo;
    }
    
}
