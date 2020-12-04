

public class PantallaHoraYFecha{
    
    private PantallaDosDigitos pantallaHoras;
    private PantallaDosDigitos pantallaMinutos;
    private PantallaDosDigitos pantallaDia;
    private PantallaDosDigitos pantallaMes;
    private PantallaDosDigitos pantallaAnio;


    public PantallaHoraYFecha(){
        pantallaHoras = new PantallaDosDigitos(0, 24);
        pantallaMinutos = new PantallaDosDigitos(0, 60);
        pantallaDia = new PantallaDosDigitos(1, 31);
        pantallaMes = new PantallaDosDigitos(1, 12);
        pantallaAnio = new PantallaDosDigitos(1, 99);
    }



}
