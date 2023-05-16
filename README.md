# comparendos.github.io

# Problema

En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que necesita la Secretaria de Movilidad, promediar la cantidad de cursos impartidos en un dia y a su vez saber cuantos comparendos junto con el promedio de asistentes

# Levantamiento de información 

*En la aplicación se solicita para calcular cuantas personas ingresan a curso en un dia

*En la aplicación se solicita saber cual es infracción por la cual mas hacen curso

*Dentro de la apliacion se solcitan los campos de: No. asistentes, infraccion

# Analisis del caso

![image](https://github.com/Anama053/comparendos.github.io/assets/113647233/71a5deae-ca2f-4929-9cd4-80a05d6a52fc)
![image](https://github.com/Anama053/comparendos.github.io/assets/113647233/83b8e3be-e162-4035-801b-5e8697365207)


# Aproximacion del caso de uso

![image](https://github.com/Anama053/comparendos.github.io/assets/113647233/61a7cd13-08df-4efb-aff6-e487df8e81da)
Descripcion del caso:

Nombre: Calcular promedio de asistentes a curso

Actores: Secretaria Distrital de Movilidad
Proposito: Guardar cantidad de cursos, promedio de asistentes y total comparendos 

Curso normal de eventos:
  1. El funcionario ingresa la cantidad de cursos
  2. El Funcionario ingresa la infraccion y cantidad de asistentes
  3. Se calcula el promedio a partir de (Σ(infraccion1, infraccion2, infraccionN)/Cantidad cursos)
  4. Se muestra el promedio de los asistentes
  5. Se muestra la cantidad de cursos
  6. Se muestra la cantidad de comparendos

# Diagrama de Flujo

![image](https://github.com/Anama053/comparendos.github.io/assets/113647233/f58ae90e-b605-41a5-a482-81b7ff19d00d)


# Pseudocodigo

El Pseudocodigo es:

Algoritmo comparendos

	Definir C02, C14, C29, i Como Entero
	
	Dimension infraccionC02[50], infraccionC14[50], infraccionC29[50]
	Definir total Como Real
	Escribir "*****PROGRAMA DE PROMEDIO DE CURSOS IMPARTIDOS*****" 
	Escribir "Digite la cantidad de cursos en el dia"
	Leer curso
	Para i=0 Hasta i Con Paso curso Hacer
		Escribir "En la infracción C02,-mal parqueado/ abandono, ingrese la cantidad: "
		Leer C02
		Escribir "En la infracción C14,ransitar por sitios restringidos-ingrese la cantidad: "
		Leer C14
		Escribir "En la infracción C29,-conducir a velocidad no permitida, ingrese la cantidad: "
		Leer C29
		
		infraccionC02[i]=C02;
		infraccionC14[i]=C14;
		infraccionC29[i]=C29;
	Fin Para
	Para i<-0 Hasta i Con Paso curso Hacer
		total=total+(C02+C14+C29);
		usuario=usuario+((infraccionC02[i]+infraccionC14[i]+infraccionC29[i])/curso);
	Fin Para
	Escribir "El promedio de usuarios atendidos por curso es: " usuario
	Escribir "La cantidad total de comparendo es: " total
	Escribir "Total de cursos: " curso
FinAlgoritmo

# Codigo En Java

El codigo de la aplicacion es:

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

