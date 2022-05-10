package graphic;

import graphic.geo.Punto;

import java.awt.*;

public class BuilderVertice {
    private Punto centro;
    private Color color;
    private String etiqueta;

    public BuilderVertice() {
        this.centro = new Punto(0, 0);
        this.etiqueta = " ";
        this.color = new Color(50, 133, 206);
    }

    public BuilderVertice setPunto(Punto punto) {
        centro.setLocation(punto);
        return this;
    }

    public BuilderVertice setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
        return this;
    }

    public BuilderVertice setColor(Color color) {
        this.color = color;
        return this;
    }

    public BuilderVertice setRandomLocation() {
        int x = ((int) (Math.random() *  (GraphPanel.b-GraphPanel.a))) + GraphPanel.a;
        int y = ((int) (Math.random() *  (GraphPanel.b-GraphPanel.a))) + GraphPanel.a;
        centro.setLocation(new Punto(x, y));
        return this;
    }

    public Vertice build() {
        return new Vertice(this);
    }

    public Punto getCentro() {
        return this.centro;
    }

    public String getEtiqueta() {
        return this.etiqueta;
    }

    public Color getColor() {
        return this.color;
    }
}
