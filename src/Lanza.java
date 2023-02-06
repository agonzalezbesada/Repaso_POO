public class Lanza extends Arma{


    Lanza() {

    }

    Lanza(int nivel_rareza, int nivel, String nombre, double damage, double multiplicador, double distancia, double tiempo_para_damage) {
        super(nivel_rareza, nivel, nombre, damage, multiplicador, distancia, tiempo_para_damage);
    }

    public double doing_damage(double distancia_enemigo) {

        if (distancia_enemigo<=getDistancia()) {
            if (distancia_enemigo>=(getDistancia()/2)) {
                return getMultiplicador() * getDamage() * (getDistancia()-distancia_enemigo);
            }
            return 0.0;
        }

        return 0.0;
    }
}
