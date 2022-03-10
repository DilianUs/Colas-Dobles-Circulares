
package prueba;

public class Nodo {
    float coefficient;
    int exponent;
    Nodo siguiente; //Puntero de enlace
    
    
    public Nodo(float c, int e){
        this.coefficient=c;
        this.exponent=e;
    }
    //insertar al inicio
    public void enlaceSiguiente(Nodo n){
        siguiente = n;
    }
    
}
