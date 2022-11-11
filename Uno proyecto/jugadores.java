import java.util.List;

public class jugadores{
 jugadores(){

 }
    jugadores(int id, String nombre,Cartas[]cartas){
     setId(id);
     setNombre(nombre);
     setCartas(cartas);
    }
    private int id=0;

    //funcion para traer el id del jugador
    public int getId() {
        return id;
    }
    //funcion para establecer el id del jugador
    public void setId(int id) {
        this.id = id;
    }
    //encapsulamiento de propiedad nombre tipo string
    private String nombre = "";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private Cartas[] cartas = null;

    public Cartas[] getCartas() {
        return cartas;
    }

    public void setCartas(Cartas[] cartas) {
        this.cartas = cartas;
    }
    public jugadores[] crearjugador(int opc,int cantjugadores,Cartas[]cartas){
        jugadores[] guardarjugadores= new jugadores[cantjugadores +1];
        if (opc==1){
            for (int i=0; i<cantjugadores; i++){
                guardarjugadores[i]=new jugadores(i+1,"bot"+i+1,cartas);
            }
        } return guardarjugadores;
    }
}
