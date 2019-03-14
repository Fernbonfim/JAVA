/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagem;

/**
 *
 * @author Aluno
 */
public class Jogadores implements Jogador{
    
     @Override
    public void soco() {
        System.out.println("nadar");
                
    }

    @Override
    public void chute() {
        System.out.println("sobrevoar");
    }

    @Override
    public void poder() {
        System.out.println("correr");
    }

    @Override
    public void especial() {
        System.out.println("especialissimo");
         }

}
   
