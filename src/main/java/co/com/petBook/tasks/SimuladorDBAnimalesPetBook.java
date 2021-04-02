package co.com.petBook.tasks;

import java.util.ArrayList;

public class SimuladorDBAnimalesPetBook {
    private ArrayList listaAnimalesPetBook;

    public SimuladorDBAnimalesPetBook() {
        listaAnimalesPetBook = new ArrayList();
    }

    public ArrayList getListaAnimalesPetBook() {
        return listaAnimalesPetBook;
    }

    public void cargueTodoslosAnimales (){
        listaAnimalesPetBook.add("perro1.jpg");
        listaAnimalesPetBook.add("perro2.jpg");
        listaAnimalesPetBook.add("gato1.jpg");
        listaAnimalesPetBook.add("gato2.jpeg");
        listaAnimalesPetBook.add("perro3.jpg");
    }

    public void cargueTodoslosPerros(){
        listaAnimalesPetBook.add("perro1.jpg");
        listaAnimalesPetBook.add("perro2.jpg");
        listaAnimalesPetBook.add("perro3.jpg");

    }

    public void cargueTodoslosGatos(){
        listaAnimalesPetBook.add("gato1.jpg");
        listaAnimalesPetBook.add("gato2.jpeg");
    }


}
