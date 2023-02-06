public class Casco extends Armadura{


    private boolean proyectil;


    Casco() {

    }

    Casco(int nivel_rareza, int nivel, String nombre, double defensa, double multiplicador, boolean accion_especial) {
        super(nivel_rareza, nivel, nombre, defensa, multiplicador, accion_especial);
        this.proyectil = accion_especial;
    }
}
