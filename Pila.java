public class Pila<E> {
	
    private class Enlace{
        public E valor;
        public Enlace siguiente;
        
        public Enlace(E val, Enlace sig){
            this.valor = val;
            this.siguiente = sig;
        }
    }

    private Enlace tope;
    
    public boolean EstaVacio(){
        return this.tope == null;
    }
    
    public Pila(){
        this.tope = null;
    }
    
    public void Apilar(E elemento){
        Enlace temporal = new Enlace(elemento, this.tope);
        tope = temporal;
    }
    
    public void Desapilar(){
        if (tope!=null){
            tope = tope.siguiente;
        }
    }
    public E ObtenerValorTope(){
        return tope == null ? null : this.tope.valor;
    }

    public static void main(String[] args) {
    	
        Pila<Double> pesos = new Pila<Double>();
        System.out.println(pesos.EstaVacio()); //true
        
        pesos.Apilar(41.2);
        System.out.println(pesos.EstaVacio()); //false
        
        pesos.Apilar(1.2);
        pesos.Apilar(5.2);
        pesos.Apilar(4.3);
        pesos.Apilar(3.21);
        
        System.out.println(pesos.ObtenerValorTope());//3.21
        
        pesos.Desapilar();
        System.out.println(pesos.ObtenerValorTope());//4.3
        
    }
}
