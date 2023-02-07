public class Main {
    public static void main(String[] args) {

        Espada espada = new Espada(1, 1, "Excalibur", 1, 1.5, 1, 1);

        Lanza lanza = new Lanza(2, 2, "Longinus", 2, 2, 2, 2);

        Hacha hacha = new Hacha(3, 3, "Leviatán", 3, 3, 0.5, 0.5);

        Casco casco = new Casco(4, 4, "Gálea", 4, 4);

        Botas botas = new Botas(4, 4, "Soleae", 4, 4);

        Object[] objetos = new Object[5];

        objetos[0] = espada;
        objetos[1] = lanza;
        objetos[2] = hacha;
        objetos[3] = casco;
        objetos[4] = botas;


        for (int i = 0; i<3;i++) {
            System.out.println("Daño de la espada: "+espada.doing_damage((int) (Math.random()*3+0)));
            System.out.println("Daño de la lanza"+lanza.doing_damage((int) (Math.random()*3+0)));
            System.out.println("Daño del hacha: "+hacha.doing_damage((int) (Math.random()*3+0)));
            System.out.println("Protectil recibido: "+casco.accion_especial(true));
            System.out.println("Daño melee o a distancia recibido: "+botas.accion_especial(false, true)+"\n");
        }
    }
}
