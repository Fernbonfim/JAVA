/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg04;

import personagem.JogadorPadrao;
import personagem.RyuPossuido;
import personagem.Jogadores;
import personagem.Jogador;

/**
 *
 * @author Aluno
 */
public class AULA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jogador jogador;
        jogador = new RyuPossuido();
        jogador = new Jogadores();
        jogador.soco();
        jogador.chute  ();
        jogador.especial();
    }
    
}
