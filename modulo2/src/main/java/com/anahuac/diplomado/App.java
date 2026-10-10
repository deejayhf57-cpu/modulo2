package com.anahuac.diplomado;

/**
 * Hola Kybalion!
 *
 */
public class App
{

    public static void main( String[] args )
    {
        System.out.println( "Hola Kybalion" );
        double var1 = 10.567;        
        double var2 = 20;
        int var3 = 20;
        char varChar = 'A';
        char varChar2 = 'B';
        boolean varBool = true; //Declaración de variable booleana
        float varFloat = 10.5f;
        varBool = var1 > var2;
        System.out.println("Value of var1: " + var1);
        System.out.println("Value of var1: " + var2);
        System.out.println("Value of var1: " + var3);
        System.out.println("Value of var1: " + (var3 + var1));
        System.out.println("Value of varChar: " + varChar);
        System.out.println("Value of varFloat: " + varFloat);
        System.out.println("Value of varBool: " + varBool);   
        
        int a = 20;
		a += 5;
		System.out.println("R = " + a); //25
		a = a + 5;
		System.out.println("R = " + a); //30
        a++; // a = a + 1;
        System.out.println("R = " + a);//31
        varBool = varChar == varChar2;
        varBool = var3 < var1;
        varBool = var3 < 29;
        varBool = (var3 < 29 && var1 > 10) || (varChar == 'A');
        System.out.println("Value of varBool: " + varBool);

        //Condicionales
        if(var1 > var2) //True
        {
            System.out.println("var1 es mayor que var2");
            System.out.println("var1 es mayor que var2");
            System.out.println("var1 es mayor que var2");
            System.out.println("var1 es mayor que var2");
        }
        else //False
        {
            System.out.println("ELSE");
            System.out.println("ELSE");
            System.out.println("ELSE");
           
        }

         //Condicionales
        if(var1 < var2) //True
        {
            System.out.println("Este es un if sin else");
        }

        //Condicionales anidadas
        if(var1 > var2) //True
        {
            System.out.println("If primer nivel");
            int diez = 10;
            if(50 > diez) //True
            {
                System.out.println("if segundo nivel");
               
            }
             else //False
            {
                System.out.println("ELSE segundo nivel");
            }
        }
        else //False
        {
            System.out.println("ELSE primer nivel");                       
        }
        
        //Condicionales ligadas - Múltiples condiciones
        if(var1 > var2) //Primera condicion
        {
            System.out.println("Primera condición");
        }
        else if(var1+10 < var2+5) //SEgunda condicion
        {
            System.out.println("SEgunda condicion");
        }
        else if(var1*2 < var2-2) //Tercera condicion
        {
            System.out.println("Tercera condicion");
        }

        
        System.out.println("Esta línea esta fuera del if");


        //CICLOS
        int cal1 = 100;
        int cal2 = 90;
        int cal3 = 80;

        double promedio = (cal1 + cal2 + cal3) / 3;
        System.out.println("Promedio: " + promedio);
        int i = 0;
        for (i = 0; i < 10; i++) {
            System.out.println("Valor de i: " + i);
        } 
        System.out.println("valor de i: " + i);
        for (i = 0; i < 10; i++) {
            if(i == 5){
            
                System.out.println("Valor de i: " + i);                
                    System.out.println(" Ya encontre el numero que buscaba - break");
                
                    break; //rompimiento de ciclo
                }
                System.out.println("Valor de i: " + i);

                //CICLO WHILE - Adivinar numero
                int numeroSecreto = 5;
                int numeroUsuario = 0; //condicion
                java.util.Scanner scanner = new java.util.Scanner(System.in); // LEER //ENTRADA
                while(numeroUsuario != numeroSecreto) { //condicion 
                    System.out.println("Adivina el numero secreto (1-10): "); //MOSTRAR / SALIDA
                    numeroUsuario = scanner.nextInt(); //LEER //ENTRADA
                    if(numeroUsuario == numeroSecreto) {
                        System.out.println("Felicidades, adivinaste el numero secreto");
                    } else {
                        System.out.println("Intenta de nuevo"); 
                    }
                }
                scanner.close();
            }
        }
}
