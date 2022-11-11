import java.util.List;
import java.util.Scanner;

public class Main {
    static String opc="";
    static int menu=0, menu2=0;
    static boolean bandera = false;
    static Scanner leer = new Scanner(System.in);
    static Utils utils = new Utils();
    static Cartas carta = new Cartas();

    static jugadores jugador = new jugadores();

    public static void main(String[] args) {

        do {
            System.out.println("\n\nBIENVENIDO A UNO ");
            System.out.println("1......jugar");
            System.out.println("2.....Multijugador");
            System.out.println("3.....Salir");

            opc = leer.next();
            bandera = utils.validaNumero(opc);
            if(bandera) {
                menu = utils.convertirANumero(opc);
            }
            else
            {
                System.out.println("Opción inválida...\nIntente nuevamente.");
                leer.nextLine();
            }
        }
        while (menu == 0);

         do {
            if (menu == 1)
            {
                System.out.println("Contra cuántos bots quieres jugar 1,2 o 3");
                opc = "";
                opc = leer.next();
                bandera = utils.validaNumero(opc);
                if(!bandera) {
                    menu2 = utils.convertirANumero(opc);
                }
                    else
                {
                    System.out.println("Opción inválida...\nIntente nuevamente.");
                    // leer.nextLine();
                }
            }

            if (menu == 2)
            {
                System.out.println("Contra cuántos amigos quieres jugar 1,2 o 3");
                opc = null;
                opc = leer.next();
                bandera = utils.validaNumero(opc);
                if(bandera)
                    menu2 = utils.convertirANumero(opc);
                else
                {
                    System.out.println("Opción inválida...\nIntente nuevamente.");
                    leer.nextLine();
                }
            }

            if (menu == 3)
            {
                System.out.println("Gracias por jugar!");
            }
        } while (menu2 == 0);

        List<Cartas> cartas = List.of(carta.crearBaraja());
        jugadores[] jugadores =jugador.crearjugador(menu,menu2,(Cartas[]) cartas.toArray());
        for (Cartas carta_:cartas) {
            System.out.println(carta_.getValorCarta()+" | "+carta_.getTipoCarta());
        }
    }
}