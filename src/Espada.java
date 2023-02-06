public class Espada extends Arma{

    public double doing_damage(double distancia_enemigo) {
        if (distancia_enemigo<=getDistancia()) {
            return getMultiplicador() * getDamage() * (getDistancia()-distancia_enemigo);
        }

        return 0.0;
    }
}
