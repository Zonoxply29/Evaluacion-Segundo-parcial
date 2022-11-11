import java.util.Arrays;
import java.util.List;

public class Cartas{
    // Constructor Default
    Cartas(){
        setTipoCarta("Numerica");
        setValorCarta("9");
    };

    // Constructor Dinámico
    Cartas(String tipoCarta, String valorCarta){
        setTipoCarta(tipoCarta);
        setValorCarta(valorCarta);
    };

    // Propiedades - Getters y Setters --------------------- para obtener y fijar>>>
    // Tipo de Carta
    private String tipoCarta;

    public String getTipoCarta() {
        return tipoCarta;
    }

    public void setTipoCarta(String tipoCarta) {
        this.tipoCarta = tipoCarta;

    }

    // Valor de Carta
    private String valorCarta;

    public String getValorCarta() {
        return valorCarta;
    }

    public void setValorCarta(String valorCarta) {
        this.valorCarta = valorCarta;
    }

    // Funciones ---------------------------->>>
    public Cartas[] crearBaraja(){
    {
        int contador = 0;
        Cartas[] cartas = new Cartas[128];

        // Creamos cartas numericas
        for (int i = 0; i <120; i++)
        {
            cartas[i] = new Cartas("Numerica",Integer.toString(contador));
            contador = contador + 1;

            if (contador > 9) contador = 0;
        }

        // Creamos carta de bloqueo
        for(int i = 120; i <124; i++)
        {
            cartas[i] = new Cartas("Bloqueo","Bloqueo");
        }

        // Creamos carta de reversa
        for(int i = 124; i <128; i++)
        {
            cartas[i] = new Cartas("Reversa","Reversa");
        }
        return cartas;
    }
    public List <Cartas> crearBaraja(){
    {
        int cont = 1;
        int random=0;
        int random2=0;
        Cartas[] cartas = new Cartas[128];

        // Creamos cartas numericas aleatorias
        for (int i = 0; i < 128; i++)
        {
            Utils u = new Utils();
            random = (int) u.random(0,9);
            cartas[i] = new Cartas("Numerica",Integer.toString(random));
            cont = cont + 1;

            if (cont >= 16){
                 random2 =(int) u.random(0,1);

                 if (random2 == 0){
                     cartas[i] = new Cartas("Bloqueo","Bloqueo");
                 }

                if (random2 == 1){
                    cartas[i] = new Cartas("Reversa","Reversa");
                }
                cont = 0;
            }



        }

    }

   /* public Cartas[] barajeo(Cartas[]Object barajaoriginal = null;
            barajaoriginal){
        Cartas[] baraja = new Cartas[128];
        for (int i=0; i<128;i++){

        }
        return baraja;
    }*/
}