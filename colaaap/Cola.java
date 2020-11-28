package colaapp;

public class Cola {
    NodoCola inicio;
    NodoCola fin;
    int dim;

    public Cola(){
        inicio=fin=null;
        dim=0;
    }
    public boolean estaVacia(){
        return inicio==null;
    }
    public void insertar(int elemento){
         NodoCola nuevo =new NodoCola(elemento); 
         if(dim!=5){
             if(estaVacia()){
             inicio=nuevo;
         }else{
             fin.Siguiente=nuevo;
         }
         fin=nuevo;
         dim++;   
         } else 
             if(dim==5){
             System.out.println("Cola llena");
         }
         
         
    }
    public int eliminar(){
        int cont=inicio.Dato;
        inicio=inicio.Siguiente;
        dim--;
        return cont;
    }
    
     public void mostrarCola() {
        NodoCola Nc=inicio;
        while (Nc != null) {
            System.out.print("[" + Nc.Dato + "]");
            Nc = Nc.Siguiente;
        }
        System.out.println("");

    }

    public int inicioCola(){
        return inicio.Dato;
    }
    public int tamanioCola(){
        return dim;
    }
}
