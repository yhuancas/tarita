public class Cola<E> {

    // Clase interna
    private class Enlace{
        public E valor;
        
        public Enlace siguiente;
        
        public Enlace(E val, Enlace sig){
            this.valor = val;
            this.siguiente = sig;
        }
    }
  
    // referencias
    private Enlace primero;
    private Enlace ultimo;
    
    public Cola(){
        primero = ultimo = null;
    }
    
    public E ObtenerValorFinal(){
        return ultimo.valor;
    }
    
    public E ObtenerValorInicial(){
        return primero.valor;
    }
    
    // Agregar un valor a la cola
    public void Encolar(E elemento){
        Enlace temporal = new Enlace(elemento, null);
        if (ultimo == null){
            primero = ultimo = temporal;
        }
        else{
            ultimo.siguiente = temporal;
            ultimo = temporal;
        }
    }
    
    public void desencolar(){
        if (primero != null) {            
            primero = primero.siguiente;
            if (primero == null){
                ultimo = null;
            }            
        }
    }
    public boolean estaVacio(){
        return this.ultimo == null;
    }

    public static void main(String[] args) {
        Cola <Integer> notas = new Cola<Integer>();
        notas.Encolar(10);
        notas.Encolar(20);
        notas.Encolar(25);
        
        System.out.println(notas.ObtenerValorInicial());//10
        System.out.println(notas.ObtenerValorFinal());//25
        
        notas.desencolar();
        notas.desencolar();
        System.out.println(notas.estaVacio());//false
        
        System.out.println(notas.ObtenerValorFinal());//25
        System.out.println(notas.ObtenerValorInicial());//25
        System.out.println("------------");
        notas.Encolar(30);
        notas.Encolar(40);
        notas.Encolar(50);
        notas.desencolar();        
        System.out.println(notas.ObtenerValorInicial());
        System.out.println(notas.ObtenerValorFinal());
        
    }
}
