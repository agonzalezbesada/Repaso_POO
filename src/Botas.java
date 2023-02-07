public class Botas extends Armadura{



    Botas() {

    }


    Botas(int nivel_rareza, int nivel, String nombre, double defensa, double multiplicador) {
        super(nivel_rareza, nivel, nombre, defensa, multiplicador);
    }

    @Override
    public boolean accion_especial(boolean melee, boolean distancia) {
        boolean cosa = true;
        return cosa;
    }
}
