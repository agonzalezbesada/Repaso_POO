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


        for (Object g : objetos) {
            if (g instanceof Arma) {
                /*
                 Aquí hago que el double del random sea de 2 decimales máximo, ya que doing_damage recibe un double,
                 pero esto reduce drásticamente la media de los daños, ya que hay más números posibles
                 */
                System.out.println("Daño: "+((Arma) g).doing_damage(Math.round((Math.random()*(3-0+1)+0)*100)/100d));
            }
            if (g instanceof Casco) {
                System.out.println(((Casco)g).accion_especial(true));
            }
            if (g instanceof Botas) {
                System.out.println(((Botas)g).accion_especial(true, false));
            }
        }
    }
}
