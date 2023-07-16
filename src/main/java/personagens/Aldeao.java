package personagens;


import poo.Principal;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Aldeao extends Personagem{


    public Aldeao(JPanel p, String img, int x, int y) {
        super(p, img, x, y);
    }
    public void atacar(){
        super.atacar();
    }

    @Override
    public void mover(int direcao) {
        super.mover(direcao);
    }

    @Override
    public void desenhar(Graphics g) {
        super.desenhar(g);
    }


}
