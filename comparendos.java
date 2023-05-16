
/**
 * Write a description of class Comparendos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class comparendos
{
   public static void main (String[] args){
        
        Scanner aj = new Scanner(System.in);
       
        int C02=0,C29=0,C14=0,usuario=0,i,curso;
        int infraccionC02[],infraccionC14[],infraccionC29[];
        double total=0;
                
        infraccionC02=new int[50];
        infraccionC14=new int[50];
        infraccionC29=new int[50];
        
        System.out.println("*****PROGRAMA DE PROMEDIO DE CURSOS IMPARTIDOS***** ");
                                
        System.out.println("Digite la cantidad de cursos en el dia");
        curso = aj.nextInt();
                 
        for(i=0; i<curso; i++){
            System.out.println("En la infracción C02,-mal parqueado/ abandono, ingrese la cantidad: ");;
            C02 = aj.nextInt();
            System.out.println("En la infracción C14,Transitar por sitios restringidos-ingrese la cantidad: ");
            C14 = aj.nextInt();
            System.out.println("En la infracción C29,-conducir a velocidad no permitida, ingrese la cantidad: ");
            C29 = aj.nextInt();
                                   
            infraccionC02[i]=C02;
            infraccionC14[i]=C14;
            infraccionC29[i]=C29;
        }
        for (i = 0; i < curso; i++) {
        
            total=total+(C02+C14+C29);
            usuario=usuario+((infraccionC02[i]+infraccionC14[i]+infraccionC29[i])/curso);
        }
        System.out.println("La promedio de usuarios atendidos por curso es: " + usuario);
        System.out.println("La cantidad total de comparendo es: " + total);
        System.out.println("Total de cursos "+curso);        
   }
}