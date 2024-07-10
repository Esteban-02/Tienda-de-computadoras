package mundoPc;

import mundoPc.Servicio.Orden;
import mundoPc.modelo.Computadora;
import mundoPc.modelo.Monitor;
import mundoPc.modelo.Raton;
import mundoPc.modelo.Teclado;

public class VentaComputadorasApp {
    public static void main(String[] args) {

        Raton raton = new Raton("USB","Lenovo");
       // System.out.println(raton);

        Teclado teclado = new Teclado("USB", "Acer");
       // System.out.println(teclado);

        Monitor monitor = new Monitor("LG", 14);
        //System.out.println(monitor);

        Computadora computadora = new Computadora("Lenovo", monitor, teclado, raton);
       // System.out.println(computadora);






        // creamos una orden

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora);
        orden1.mostrarOrden();

        // nuevo objeto
        Monitor monitorDELL = new Monitor("DELL", 15.0);
        Teclado tecladoDELL = new Teclado("Bluetooth", "DELL");
        Raton ratonDELL = new Raton("USB", "DELL");
        Computadora computadoraDELL = new Computadora("DELL", monitorDELL, tecladoDELL, ratonDELL);

        Orden ordenDELL = new Orden();
        ordenDELL.agregarComputadora(computadoraDELL);
        ordenDELL.mostrarOrden();

        //Nueva computadora

        Monitor monitorMac = new Monitor("MAC", 15);
        Teclado tecladoMac = new Teclado("USB", "MAC");
        Raton ratonMac = new Raton("USB", "MAC");
        Computadora computadoraMac = new Computadora("IMAC",monitorMac,tecladoMac,ratonMac);

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraMac);
        orden2.agregarComputadora(computadoraDELL);
        orden2.agregarComputadora(computadora);

        orden2.mostrarOrden();
    }
}