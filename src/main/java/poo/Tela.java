package poo;

import personagens.Aldeao;
import personagens.Arqueiro;
import personagens.Cavaleiro;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Tela extends JPanel {

    private ArrayList<Aldeao> aldeoes;
    private ArrayList<Arqueiro> arqueiros;
    private ArrayList<Cavaleiro> cavaleiros;

    public Tela() {

        //TODO preciso ser melhorado

        this.setBackground(Color.white);
        this.aldeoes = new ArrayList<>();
        this.cavaleiros = new ArrayList<>();
        this.arqueiros = new ArrayList<>();
    }

    /**
     * Método que invocado sempre que o JPanel precisa ser resenhado.
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //TODO preciso ser melhorado

        // percorrendo a lista de aldeões e pedindo para cada um se desenhar na tela
        aldeoes.forEach(aldeao -> aldeao.desenhar(g));
        arqueiros.forEach(arqueiro -> arqueiro.desenhar(g));
        cavaleiros.forEach(cavaleiro -> cavaleiro.desenhar(g));

        // liberando o contexto gráfico
        g.dispose();
    }

    /**
     * Cria um aldeao nas coordenadas X e Y, desenha-o neste JPanel
     * e adiciona o mesmo na lista de aldeoes
     *
     * @param x coordenada X
     * @param y coordenada Y
     */
    public void criarAldeao(int x, int y) {
        Aldeao a = new Aldeao(this, "aldeao", x, y);
        a.desenhar(super.getGraphics());
        aldeoes.add(a);
    }

    /**
     * Atualiza as coordenadas X ou Y de todos os aldeoes
     *
     * @param direcao
     */
    public void movimentarAldeao(int direcao) {
        //TODO preciso ser melhorado

        aldeoes.forEach(aldeao -> aldeao.mover(direcao));
        // Depois que as coordenadas foram atualizadas é necessário repintar o
        //JPanel
        this.repaint();
    }

    /**
     * Altera o estado do aldeão de atacando para não atacando e vice-versa
     */
    public void atacarAldeao() {

        //TODO preciso ser melhorado

        // Percorrendo a lista de aldeões e pedindo para todos atacarem
        aldeoes.forEach(aldeao -> aldeao.atacar());

        // Fazendo o JPanel ser redesenhado
        this.repaint();
    }
    public void criarArqueiro(int x, int y){
        Arqueiro a = new Arqueiro(this, "arqueiro", x, y);
        a.desenhar(super.getGraphics());
        arqueiros.add(a);
    }
    public void movimentarArqueiro(int direcao) {
        //TODO preciso ser melhorado

        arqueiros.forEach(arqueiro -> arqueiro.mover(direcao));
        // Depois que as coordenadas foram atualizadas é necessário repintar o
        //JPanel
        this.repaint();
    }
    public void atacarArqueiro() {

        //TODO preciso ser melhorado

        // Percorrendo a lista de aldeões e pedindo para todos atacarem
        arqueiros.forEach(arqueiro -> arqueiro.atacar());

        // Fazendo o JPanel ser redesenhado
        this.repaint();
    }

    public void criarCavaleiro(int x, int y){
        Cavaleiro a = new Cavaleiro(this, "cavaleiro", x, y);
        a.desenhar(super.getGraphics());
        cavaleiros.add(a);
    }
    public void movimentarCavaleiro(int direcao) {
        //TODO preciso ser melhorado

        cavaleiros.forEach(cavaleiro -> cavaleiro.mover(direcao));
        // Depois que as coordenadas foram atualizadas é necessário repintar o
        //JPanel
        this.repaint();
    }
    public void atacarCavaleiro() {

        //TODO preciso ser melhorado

        // Percorrendo a lista de aldeões e pedindo para todos atacarem
        cavaleiros.forEach(cavaleiro -> cavaleiro.atacar());

        // Fazendo o JPanel ser redesenhado
        this.repaint();
    }

}
