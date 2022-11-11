
//menu
public class Utils {
    public Boolean validaNumero(String valor)
    {
        if(valor.matches("[1-3]"))
            return  true;
        else
            return  false;
    }

    public int convertirANumero(String valor)
    {
        int nuevoValor = Integer.parseInt(valor);
        return nuevoValor;
    }
    public double random(double min, double max){
        double x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }


}
