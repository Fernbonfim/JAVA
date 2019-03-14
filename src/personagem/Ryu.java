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
public class Ryu implements Jogador {

    @Override
    public void soco() {
        System.out.println("soco do ryu");
                
    }

    @Override
    public void chute() {
        System.out.println("chute do ryu");
    }

    @Override
    public void poder() {
        System.out.println("raduka");
    }

    @Override
    public void especial() {
        System.out.println("RAAADUUKKAAAAAA");
    }
    
}
