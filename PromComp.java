
/**
 * Write a description of class PromComp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PromComp
{
    public static void main(String[] Args){
        Scanner aj = new Scanner(System.in);
        int curso;        
        CompPOO[] comp = new CompPOO[50];
        int C02=0, C14=0, C29=0,usuario=0;
        double total=0;
        
        System.out.println("*****PROGRAMA DE PROMEDIO DE CURSOS IMPARTIDOS***** ");
                                
        System.out.println("Digite la cantidad de cursos en el dia");
        curso = aj.nextInt();
        
        for(int i=0; i<curso; i++){
            System.out.println("En la infracción C02,-mal parqueado/ abandono, ingrese la cantidad: ");;
            C02 = aj.nextInt();
            System.out.println("En la infracción C14,Transitar por sitios restringidos-ingrese la cantidad: ");
            C14 = aj.nextInt();
            System.out.println("En la infracción C29,-conducir a velocidad no permitida, ingrese la cantidad: ");
            C29 = aj.nextInt();
            
            CompPOO unComp = new CompPOO();
            unComp.C02 = C02;
            unComp.C14 = C14;
            unComp.C29 = C29;
            unComp.usuario = usuario;
            unComp.total = total;
            comp[i] = unComp;
        }
        for (int i = 0; i < curso; i++) {
        
            total=total+(C02+C14+C29);
            usuario=usuario+((comp[i].C02+comp[i].C14+comp[i].C29)/curso);
        }
        System.out.println("La promedio de usuarios atendidos por curso es: " + usuario);
        System.out.println("La cantidad total de comparendo es: " + total);
        System.out.println("Total de cursos "+curso);
    }
}
