import java.util.Scanner;

public class reversaybloqueo {
        public static void main(String[]args){
            Scanner leer =new Scanner(System.in); //declaramos el scanner
            int reversa =0; //va a ser reversa desactivada y el 1 va a ser la reversa activada
            int turno_jugador = 1; //80 reversa

            while (reversa == 0){
                if (turno_jugador == 7){
                    turno_jugador = 1;
                }else {
                    System.out.println("Turno del jugador: " + turno_jugador);
                    int leer_dato = leer.nextInt();

                    if (leer_dato == 10){
                        System.out.println("METISTE UNA REVERSA");
                        turno_jugador = turno_jugador -2;
                        reversa =1;
                    }
                    turno_jugador++;
                }
                while (reversa == 1){
                    if(turno_jugador == 0){
                        turno_jugador = 7;
                    }else{
                        System.out.println("Turno de Jugador" + turno_jugador);
                        int leer_dato=leer.nextInt();

                        if (leer_dato==80){
                            System.out.println("Metiste una reversa");
                            turno_jugador = turno_jugador + 2;
                            reversa=0;
                        }
                        if (leer_dato ==90){
                            System.out.println("Metiste un Bloqueo");
                            turno_jugador--;
                        }
                        turno_jugador--;
                    }

                }
            }
        }
    }

