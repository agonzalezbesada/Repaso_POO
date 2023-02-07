public class Casco extends Armadura{


    private boolean proyectil;


    Casco() {

    }

    Casco(int nivel_rareza, int nivel, String nombre, double defensa, double multiplicador) {
        super(nivel_rareza, nivel, nombre, defensa, multiplicador);
    }

    @Override
    public boolean accion_especial(boolean proyectil) {
        return proyectil;
    }
}
