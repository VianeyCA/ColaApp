package colaapp;

public class Cola {
    NodoCola inicio,fin;
    int tamanio;

    public Cola(){
        inicio=fin=null;
        tamanio=0;
    }
    public boolean estaVacia(){
        return inicio==null;
    }
    public void insertar(int elemento){
        NodoCola nuevo =new NodoCola(elemento);
        if(estaVacia()){
            inicio=nuevo;
        }else{
            fin.siguiente=nuevo;
        }
        fin=nuevo;
        tamanio++;
    }
    public int eliminar(){
        int aux=inicio.dato;
        inicio=inicio.siguiente;
        tamanio--;
        return aux;
    }
    
     public void mostrarCola() {
        NodoCola R=inicio;
        while (R != null) {
            System.out.print("[" + R.dato + "]");
            R = R.siguiente;
        }
        System.out.println("");

    }
    
    
    
    public int inicioCola(){
        return inicio.dato;
    }
    public int tamanioCola(){
        return tamanio;
    }
}
