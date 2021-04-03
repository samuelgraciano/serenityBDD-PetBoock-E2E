package co.com.petBook.exceptions;

public class ResultadoDeBusquedaInesperado  extends AssertionError {
    public static final String NO_ENCONTRO_ALGUNA_FOTO_GATO = "No encontro alguna imagen de los gatos o no la pusieron en el simulador de base de datos";
    public static final String NO_ENCONTRO_ALGUNA_FOTO_PERRO = "No encontro alguna imagen de los perros o no la pusieron en el simulador de base de datos";
    public static final String FALTA_FOTO_MASCOTA = "No encontro alguna imagen de los perros o gatos o no la pusieron en el simulador de base de datos";

    public static final String NO_ENCONTRO_LA_FOTO = "No encontro la foto individiual esperada en el entonces del ecenario";

    public ResultadoDeBusquedaInesperado(String message, Throwable cause){
        super(message, cause);
    }
}