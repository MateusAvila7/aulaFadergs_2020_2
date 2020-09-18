
package aulad177;

import loja.Carro;

/**
 *
 * @author Mateus
 */
public class Aulad177 {

    public static void main(String[] args) {
        int x = 0;
        int y;
        y = 0;
        Carro c1 = new Carro(" ford ", " Versaille ", 58.0);
        c1.cadastrar();
        System.out.println("id:" + c1.getid());
        
        Carro c2 = new Carro(" chevrolet ", " opala ", 60.00);
        c2.cadastrar();
        System.out.println("id:" + c2.getid());
        
        
    }
    
}
