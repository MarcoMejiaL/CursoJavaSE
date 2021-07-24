package perritos;
//metodo? cast transforma datos? o redonde variavbles?
/* 
double d = 86.45;
int i = (int) d;

*/
public class perritos {
   public static void main(String[] args) {
        //en un año ubique 30 perritos ¿cuandos ubique al mes?
        
    double monthlyDogs = 30.0 / 12.0;
    System.out.println(monthlyDogs);
    //2.5 perritos? no hay medios perritos o si?
    //caso de ESTIMACION
    int estimatedMonthlyDogs = (int) monthlyDogs;
    System.out.println(estimatedMonthlyDogs);
    //2 perritos, esto tiene mas sentido aunque es probable que cada 2 meses se pierden algunos perritos
    
    //caso de EXACTITUD
    int a = 30;
    int b =12;
    System.out.println(a/b);
    //tiene que ser 2.5 no? pero como es entero lo majea como entero sin decimales

    
    //para hacerlo mas excato seria:
    System.out.println((double) a/b);
    // 2.5 ya fue un dato mas exacto y no estimado 

    /*
    Apuntes que hago en bloc de notas.

Cast entre variables

.::Conversión Automatica::.
byte -> short
short -> int
char -> int
int -> long
long -> float
float -> double

.::Cast Necesario::.
double -> float
float -> long
long -> int
int -> short
short -> byte

char <-> byte
char <-> short
int -> char 
     */

   }


}
