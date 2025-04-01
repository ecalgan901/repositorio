/**
 * <h2>Clase Fraccion</h2>
 * <h3>Esta clase representa una fracción matemática con numerador y denominador,
 * permitiendo realizar operaciones como suma, resta, multiplicación y división.
 * Además, ofrece métodos para simplificar fracciones.</h3>
 * 
 * @author <u>Elias Calvo</u>
 * @version <u>1.0</u>
 * @since <u>04-03-2025</u>
 */
public class Fraccion {
    
    /**
     * Numerador de la fracción.
     */
    public int num;
    /**
     * Denominador de la fracción.
     */
    public int den;
    
    /**
     * 
     * Constructor por defecto. Crea la fracción 0/1.
     */
    public Fraccion() {
        num = 0;
        den = 1;
    }
    
    /**
     * Constructor con parámetros. Crea una fracción con los valores dados.
     * Si el denominador es 0, se establece automáticamente a 1.
     * 
     * @param num Valor del numerador.
     * @param den Valor del denominador.
     */
    public Fraccion(int num, int den) {
        this.num = num;
        if (den == 0) {
            den = 1;
        }
        this.den = den;
        simplificar();
    }
    
    /**
     * Constructor copia. Crea una nueva fracción a partir de otra existente.
     * 
     * @param f Fracción a copiar.
     */
    public Fraccion(final Fraccion f) {
        num = f.num;
        den = f.den;
    }
    
    /**
     * Establece el valor del numerador.
     * 
     * @param num Nuevo valor del numerador.
     */
    public void setNum(int num) {
        this.num = num;
    }
    
    /**
     * Obtiene el valor del numerador.
     * 
     * @return Valor actual del numerador.
     */
    public int getNum() {
        return num;
    }
    
    /**
     * Establece el valor del denominador.
     * 
     * @param den Nuevo valor del denominador.
     */
    public void setDen(int den) {
        this.den = den;
    }
    
    /**
     * Obtiene el valor del denominador.
     * 
     * @return Valor actual del denominador.
     */
    public int getDen() {
        return den;
    }
    
    /**
     * Calcula el máximo común divisor (MCD).
     * 
     * @return El MCD entre el numerador y el denominador.
     */
    public int mcd() {
        int u = Math.abs(num);
        int v = Math.abs(den);
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }
    
    /**
     * Simplifica la fracción dividiendo numerador y denominador por su MCD.
     */
    public void simplificar() {
        int n = mcd();
        num = num / n;
        den = den / n;
    }
    
    /**
     * Muestra la fracción en formato de cadena de texto.
     * 
     * @return Representación en texto de la fracción.
     */
    public String toString() {
        return num + "/" + den;
    }
    
    /**
     * Suma dos fracciones.
     * 
     * @param f Fracción a sumar.
     * @return Nueva fracción resultado de la suma.
     */
    public Fraccion sumar(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = num * f.den + den * f.num;
        aux.den = den * f.den;
        aux.simplificar();
        return aux;
    }
    
    /**
     * Resta dos fracciones.
     * 
     * @param f Fracción a restar.
     * @return Nueva fracción resultado de la resta.
     */
    public Fraccion restar(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = num * f.den - den * f.num;
        aux.den = den * f.den;
        aux.simplificar();
        return aux;
    }
    
    /**
     * Multiplica dos fracciones.
     * 
     * @param f Fracción a multiplicar.
     * @return Nueva fracción resultado de la multiplicación.
     */
    public Fraccion multiplicar(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = num * f.num;
        aux.den = den * f.den;
        aux.simplificar();
        return aux;
    }
    
    /**
     * Divide dos fracciones.
     * 
     * @param f Fracción por la que se divide.
     * @return Nueva fracción resultado de la división.
     */
    public Fraccion dividir(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = num * f.den;
        aux.den = den * f.num;
        aux.simplificar();
        return aux;
    }
}
