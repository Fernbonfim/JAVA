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
public class JogadorPadrao implements Jogador {

    @Override
    public void soco() {
        System.out.println("soquinho");
    }

    @Override
    public void chute() {
        System.out.println("chutinho");
    }

    @Override
    public void poder() {
        System.out.println("nao tem poder");
    }

    @Override
    public void especial() {
        System.out.println("nao tem especial");
    }
    
}
