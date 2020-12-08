
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
        pantallaMes = new PantallaDosDigitos(1, 13);
        pantallaAnio = new PantallaDosDigitos(1, 100);
    }

    public String getFechaYHora() {
        String pantallaCompleta = pantallaHoras.getTextoDeLaPantalla() + ":" + pantallaMinutos.getTextoDeLaPantalla() + " " + pantallaDia.getTextoDeLaPantalla() + "-" + pantallaMes.getTextoDeLaPantalla() + "-" + pantallaAnio.getTextoDeLaPantalla();
        return pantallaCompleta;
    }

    public void avanzarMinuto(){
        pantallaMinutos.incrementaValorAlmacenado();
        if (pantallaMinutos.getValorAlmacenado() == 00){
            pantallaHoras.incrementaValorAlmacenado();
            if (pantallaHoras.getValorAlmacenado() == 00){
                pantallaDia.incrementaValorAlmacenado();
                if (pantallaDia.getValorAlmacenado() == 01){
                    pantallaMes.incrementaValorAlmacenado();
                    if (pantallaMes.getValorAlmacenado() == 01){
                    pantallaAnio.incrementaValorAlmacenado();
                   }                
                }           
            }
        }
    }
    
    public void fijarFechaYHora(int nuevaHora, int nuevoMin, int nuevoDia, int nuevoMes, int nuevoAnio){
        pantallaHoras.setValorAlmacenado(nuevaHora);
        pantallaMinutos.setValorAlmacenado(nuevoMin);
        pantallaDia.setValorAlmacenado(nuevoDia);
        pantallaMes.setValorAlmacenado(nuevoMes);
        pantallaAnio.setValorAlmacenado(nuevoAnio);
    }

}
