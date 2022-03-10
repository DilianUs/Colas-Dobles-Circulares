//Autores: dilian Armando Us Cachon y Joel Ivan Ruiz blanco
//Calculadora de polinomios
//Estructura de datos
//proyecto integrador


package prueba;



public class control {

    
    public static void main(String[] args) {
        Lista prueba = new Lista();
        Lista prueba2 = new Lista();
        Operaciones suma1 = new Operaciones();
        
        
        System.out.println("Esta vacia: "+ prueba.estaVacia());
        
        prueba.insertarPrimero(4, 0);
        prueba.insertarPrimero(3, 1);
        prueba.insertarPrimero(5, 2);
        prueba.imprimir();
        
        System.out.println("Esta vacia: "+ prueba2.estaVacia());
        
        prueba2.insertarPrimero(5, 0);
        prueba2.insertarPrimero(2, 1);
        prueba2.insertarPrimero(7, 2);
        prueba2.imprimir();
        
        prueba2.obtenerCoef();
        
        suma1.suma(prueba, prueba2);
       
        
        
        
    }

   
    
}
