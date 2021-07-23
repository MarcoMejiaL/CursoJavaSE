package variables;

public class variables {
    public static void main(String[] args) {
        int speed=2+8;//declaracion de variable : tipo id_unico = inicializacion nota: siempre inicializar las variables
        System.out.println(speed);
        
        

        //nombre de variable tiene que ser unicos
        int salario = 1000;
        //bono 200
        salario += 200;
        System.out.println("el salario es: "+salario);

        //pension : $50 Descuento
        salario -=50;
        System.out.println(salario);
        
        //2 horas extra == $30 c/u
        //Comida == $-45
        salario += 60 - 45;
        System.out.println(salario);

        //Actaulizando cadenas de texto

        String nombre = "Marco Mejia ";
        nombre += " Lopez";
        System.out.println(nombre);
        //los nombres de las variables comienzan con Letras y son sensibles a mayusculas y a minusculas
        // alParecerTambienExisteLoDelCamelloComoEnJavascripEstoEsInteresante

        //tipos de datos numericos
        int n = 1234567890;//maximo 10 digitos
        long nL= 1234567890;//datos tipo entrero

        //datos decimales o Flotante
        float flotante = 1.4F;//para que sea flotante se le pone la F al final
        double doble = 3.2387193217983;//dato mas preciso

        //datos texto

        char a ='a'; //solo un digito como valor nota: comilla simpre ('')
        String cadena = "marco mejia";//datos tipo texto

        //logicos

        boolean verdadero = true;
        boolean falso = false;

        //VAIABLE COMO EN JS
        var dato =10;

        //operaciones matematicas

        System.out.println(Math.PI);
         // 3.141592653589793
        System.out.println(Math.E);

System.out.println(Math.ceil(2.1)); // 3.0 (redondear hacia arriba)


System.out.println(Math.pow(2, 3)); // 8.0 (número elevado a una potencia)
System.out.println(Math.sqrt(3)); // 1.73... (raíz cuadrada)

System.out.println(Math.max(2, 3)); // 3.0 (el número más grande)
var r =2;
// Área de un círculo (PI * r^2):
System.out.println(Math.PI * Math.pow(r, 2));

// Área de una esfera (4 * PI * r^2):
System.out.println(4 * Math.PI * Math.pow(r, 2));

// Volumen de una esfera ( (4/3) * PI * r^3):
System.out.println((4/3) * Math.PI * Math.pow(r, 3));

    }
}
