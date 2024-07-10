package mundoPc.modelo;

public class Raton extends  DispositivoEntrada{
    private final int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        idRaton = ++contadorRatones;    //Se inicializa al ejecutar el constructor
    }

    @Override
    public String toString() {
        return "Raton{" +
                "idRaton=" + idRaton +
                '}'+ super.toString();
    }
}
