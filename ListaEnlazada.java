
public class ListaEnlazada<E>{

    // Clase interna 
    private class Enlace{
        public E valor;
        public Enlace siguiente;
        public Enlace(E val, Enlace sig){
            this.valor = val;
            this.siguiente = sig;
        }
    }
    //---------------
    
    // Atributos 
    private Enlace cabeza;
    
    // Constructor
    public ListaEnlazada(){
        this.cabeza = null;
    }
    
    public boolean EstaVacio(){
        return this.cabeza==null;
    }
    
    // añade un elemento
    public void Agregar(E elemento){
        this.cabeza = new Enlace(elemento, this.cabeza);
    }
    
    // Elimina un valor de la lista enlazada
    public void Remover() throws IllegalStateException{
        if (this.cabeza == null){
            throw new IllegalStateException();
        }
        else {
            this.cabeza = this.cabeza.siguiente;
        }
    }
    
    // devuelve el valor de la cabeza
    public E valorCabeza(){
        return this.cabeza.valor;
    }

    public boolean contiene(E elemento){
        Enlace actual = this.cabeza;
        while(actual !=null){
            if (actual.valor.equals(elemento)){
                return true;
            }
            else {
                actual=actual.siguiente;
            }
        }
        return false;
    }

    public int Longitud(){
        Enlace actual = this.cabeza;
        int cantidad = 0;
        while (actual != null){
            actual = actual.siguiente;
            cantidad += 1;
        }
        return cantidad;
    }

    public static void main(String[] args) {
        ListaEnlazada<String> nomEstudiante = new ListaEnlazada<String>();
        nomEstudiante.Agregar("Rocio");
        nomEstudiante.Agregar("Lili");
        nomEstudiante.Agregar("Jose");
        nomEstudiante.Agregar("Alvaro");
        nomEstudiante.Remover();
        nomEstudiante.Remover();
        System.out.println(nomEstudiante.Longitud());
        System.out.println(nomEstudiante.EstaVacio());
        System.out.println(nomEstudiante.valorCabeza());
    }
}
