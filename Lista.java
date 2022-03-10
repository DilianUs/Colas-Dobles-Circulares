
package prueba;


public class Lista {
    protected Nodo cabeza;//punteros, inicio y final
    
   public Lista(){
       cabeza = null;
   }
   
   public void insertarPrimero(float coef, int exp){
       if (cabeza == null){
           cabeza = new Nodo(coef,exp);
          
       }else{
           Nodo temp = cabeza;
           Nodo nuevo = new Nodo(coef,exp);
           nuevo.enlaceSiguiente(temp);
           cabeza = nuevo;
       }
       
   }
  
   public void imprimir(){
       Nodo temporal = cabeza;
       do{
           System.out.printf(temporal.coefficient +"x^"+temporal.exponent);
           temporal = temporal.siguiente;
           
           
           if(temporal!=null){
               System.out.printf(" + ");
               
           }else{
               System.out.printf("\n");
           }
       }while(temporal!=null);
       
   }
   public void obtenerCoef(){
       float coeficiente= 0;
       Nodo temp = cabeza;
       
       while(temp!=null){
       coeficiente= temp.coefficient;
       System.out.println(coeficiente);
       temp = temp.siguiente;
       
       }
   }
   public int obtenerExpo(){
       int exponente = 0;
       Nodo temp=cabeza;
       exponente = temp.exponent;
       return exponente;
   }
   
  
   
   public boolean estaVacia(){
       return(cabeza == null)?true:false;
   }
    
    
    
    
}
