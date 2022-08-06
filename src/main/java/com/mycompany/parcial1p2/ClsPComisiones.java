
package com.mycompany.parcial1p2;


/**
 *
 * @author chinc
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ClsPComisiones {
    
    private static String[][] comisionesT = new String[2][11];
    private static String[][] comisiones = new String[6][11];
    
    
    private static final int NOMBRE=0;
    private static final int ENERO=1;
    private static final int FEBRERO=2;
    private static final int MARZO=3;
    private static final int ABRIL=4;
    private static final int TVENTAS=5;
    private static final int P20=6;
    private static final int P35=7;
    private static final int TVC=8;
    private static final int ISR=9;
    private static final int LRECIBIR=10;
    
    
    private static void cargaInfo(){
       
        comisiones[0][NOMBRE]=("ANDREW");
        comisiones[1][NOMBRE]=("PAOLA");
        comisiones[2][NOMBRE]=("PEDRO");
        comisiones[3][NOMBRE]=("TITO");
        comisiones[4][NOMBRE]=("DULCE");
        comisiones[5][NOMBRE]= ("TOTAL");
        
                
        comisiones[0][ENERO]=("1000");
        comisiones[1][ENERO]=("2000");
        comisiones[2][ENERO]=("150");
        comisiones[3][ENERO]=("2200");
        comisiones[4][ENERO]=("500");
        
                
        comisiones[0][FEBRERO]=("100");
        comisiones[1][FEBRERO]=("600");
        comisiones[2][FEBRERO]=("250");
        comisiones[3][FEBRERO]=("900");
        comisiones[4][FEBRERO]=("100");
        
        comisiones[0][MARZO]=("100");
        comisiones[1][MARZO]=("600");
        comisiones[2][MARZO]=("250");
        comisiones[3][MARZO]=("700");
        comisiones[4][MARZO]=("500");
        
        comisiones[0][ABRIL]=("100");
        comisiones[1][ABRIL]=("600");
        comisiones[2][ABRIL]=("250");
        comisiones[3][ABRIL]=("700");
        comisiones[4][ABRIL]=("500");
        
        
        
  
    }//Cierre CargaInfo
    
    
    private static void ImprimirModelo(){
        System.out.print("\n");
        System.out.println("\t\t\t\t\t\t\t----->>>    M A T R I Z   D E   C O M I S I O N E S    <<<-----  -\n");
        System.out.print("\n");
        System.out.print(comisionesT[1][6]=("\t\t\t\t\t\t\t\t\t\t\t\t    COMISIONES"));
        System.out.println(comisionesT[1][9]=("\t\t\t\t\tBONO"));
        System.out.print("\n");
        System.out.print(comisionesT[0][0]=("NOMBRE "));
        System.out.print(comisionesT[0][1]=("\t\tENERO  "));
        System.out.print(comisionesT[0][2]=("\t\tFEBRERO  "));
        System.out.print(comisionesT[0][3]=("\tMARZO  "));
        System.out.print(comisionesT[0][4]=("\t\tABRIL  "));
        System.out.print(comisionesT[0][5]=("\t\tT VENTAS  "));
        System.out.print(comisionesT[0][6]=("\t20%  "));
        System.out.print(comisionesT[0][7]=("\t\t35%  "));
        System.out.print(comisionesT[0][8]=("\t\tT VENTAS.C  "));
        System.out.print(comisionesT[0][9]=("\tISR 5%  "));
        System.out.print(comisionesT[0][10]=("\tLQ RECIBIR  \n\n"));
        
        for(int x=0;x<comisiones.length;x++){
                System.out.print("|");
                for(int y=0;y<comisiones[x].length;y++){
                    System.out.print(comisiones[x][y]);
                    if(y!=comisiones[x].length-1){
                        System.out.print("\t\t");
                    }//cierre condicional if
                }//cierre for Y
                System.out.println("|");
        }//cierre for anidado
    }//cierre imprimirModelo
    
        public static void calculos(){
            int totalVentas=0,VentasComision=0,Isr=0,Totaliquido=0;
            
            for(int i=0;i<5;i++){
                
                totalVentas= Integer.valueOf(comisiones[i][ENERO]);
                totalVentas = totalVentas +  Integer.valueOf(comisiones[i][FEBRERO]);
                totalVentas = totalVentas+  Integer.valueOf(comisiones[i][MARZO]);
                totalVentas = totalVentas +  Integer.valueOf(comisiones[i][ABRIL]);
                
                comisiones[i][TVENTAS]=totalVentas+"";
                if(totalVentas<=2000){
                    comisiones[i][P20]=String.valueOf(totalVentas*20/100);
                    comisiones[i][P35]="0";
                }
                else{
                    comisiones[i][P20]="0";
                }
                if(totalVentas>=2001){
                 comisiones[i][P35]=String.valueOf(totalVentas*35/100);
                 comisiones[i][P20]="0";
                }
                 else{
                         comisiones[i][P35]="0";
                         }
                VentasComision = Integer.valueOf(comisiones[i][TVENTAS]);
                VentasComision = VentasComision +  Integer.valueOf(comisiones[i][P20]);
                VentasComision = VentasComision +  Integer.valueOf(comisiones[i][P35]);
                
                comisiones[i][TVC]=VentasComision+"";//TOTAL DE VENTAS + COMISIONES
                comisiones[i][ISR]=String.valueOf(VentasComision*5/100);//RESTA DEL BONO ISR 5%
                
                Totaliquido= Integer.valueOf(comisiones[i][TVC]);
                Totaliquido= Totaliquido - Integer.valueOf(comisiones[i][ISR]);
                comisiones[i][LRECIBIR]=Totaliquido+"";
   
           }//cierre ciclo for
            
        }//cierre calculos
        
        public static void SumColumn(){
          // int TotalColumn=0;
        
            for(int i=1;i<11;i++){
                 int TotalColumn=0;
                TotalColumn= Integer.valueOf(comisiones[0][i]);
                TotalColumn = TotalColumn +  Integer.valueOf(comisiones[1][i]);
                TotalColumn = TotalColumn +  Integer.valueOf(comisiones[2][i]);
                TotalColumn = TotalColumn +  Integer.valueOf(comisiones[3][i]);
               TotalColumn = TotalColumn +  Integer.valueOf(comisiones[4][i]);
                comisiones[5][i]=TotalColumn+"";
        }//cierre ciclo for
        }//cierre SumColumn
        
        public static void VendedorMax(){
            int nom1,nom2,nom3,nom4,nom5;
            nom1=1482;
            nom2=4874;
            nom3=1026;
            nom4=5772;
            nom5=1824;
           if(nom1>nom2 && nom1>nom3 && nom1>nom4 && nom1>nom5){
               System.out.println("EL VENDEDOR QUE RECIBIO MÁS FUE: -->> "+comisiones[0][NOMBRE]);
           }else if(nom2>nom1 && nom2>nom3 && nom2>nom4 && nom2>nom5){
               System.out.println("EL VENDEDOR QUE RECIBIO MÁS FUE: -->> "+comisiones[1][NOMBRE]);
           }else if(nom3>nom1 && nom3>nom2 && nom3>nom4 && nom3>nom5){
                 System.out.println("EL VENDEDOR QUE RECIBIO MÁS FUE: -->> "+comisiones[2][NOMBRE]);
           }else if(nom4>nom1 && nom4>nom2 && nom4>nom3 && nom4>nom5){
                System.out.println("EL VENDEDOR QUE RECIBIO MÁS FUE: -->> "+comisiones[3][NOMBRE]);
           }else if(nom5>nom1 && nom5>nom2 && nom5>nom3 && nom5>nom4){
               System.out.println("EL VENDEDOR QUE RECIBIO MÁS FUE: -->> "+comisiones[4][NOMBRE]);
           }
            
        }//CIERRE VENDEDOR MAXIMO
    
        public static void VendedorMin(){
            int nom1,nom2,nom3,nom4,nom5;
            nom1=1482;
            nom2=4874;
            nom3=1026;
            nom4=5772;
            nom5=1824;
            
           if(nom1<nom2 && nom1<nom3 && nom1<nom4 && nom1<nom5){
               System.out.println("EL VENDEDOR QUE RECIBIO MENOS FUE: -->> "+comisiones[0][NOMBRE]);
           }else if(nom2<nom1 && nom2<nom3 && nom2<nom4 && nom2<nom5){
               System.out.println("EL VENDEDOR QUE RECIBIO MENOS FUE: -->> "+comisiones[1][NOMBRE]);
           }else if(nom3<nom1 && nom3<nom2 && nom3<nom4 && nom3<nom5){
                 System.out.println("EL VENDEDOR QUE RECIBIO MENOS FUE: -->> "+comisiones[2][NOMBRE]);
           }else if(nom4<nom1 && nom4<nom2 && nom4<nom3 && nom4<nom5){
                System.out.println("EL VENDEDOR QUE RECIBIO MENOS FUE: -->> "+comisiones[3][NOMBRE]);
           }else if(nom5<nom1 && nom5<nom2 && nom5<nom3 && nom5<nom4){
               System.out.println("EL VENDEDOR QUE RECIBIO MENOS FUE: -->> "+comisiones[4][NOMBRE]);
           }
            
        }//CIERRE VENDEDOR MINIMO
        
       
        
        public static void Menu()
        {
            Scanner ts = new Scanner(System.in);
            
            System.out.println("\t\t\t >> BIENVENIDO USUARIO <<");
            System.out.println("\n");
            System.out.println("\t\t\t ****** MENU ******");
            System.out.println("\n");
            System.out.println("\t FAVOR ELIJA UNA OPCIÓN: ");
            System.out.println("\n");
            System.out.println("\tOPCION 1: >> MOSTRAR MATRIZ DE COMISIONES <<");
            System.out.println("\n");
            System.out.println("\tOPCION 2: >> MOSTRAR VENDEDOR CON MAYOR TOTAL DE VETA LIQUIDA <<");
            System.out.println("\n");
            System.out.println("\tOPCION 3: >> MOSTRAR VENDEDOR CON MENOR TOTAL DE VENTA LIQUIDA");
            System.out.println("\n");
            System.out.println("\tOPCION 4: >> SALIR <<");
            System.out.println("\n");
            System.out.print("\tOPCION: >>");
            int opciones;
            opciones = Integer.parseInt(JOptionPane.showInputDialog(">> OPCION :"));
            
            switch(opciones){
                case 1:
                    cargaInfo();
                    calculos();
                    SumColumn();
                    ImprimirModelo();
                    break;
                case 2:
                    cargaInfo();
                    VendedorMax();
                    break;
                case 3:
                    cargaInfo();
                    VendedorMin();
                    break;
                case 4:
                    break;
            
            }
        }//CIERRE PROGRAMA MENU
        
        
        
    public static void main(String[] args) {
        Menu();
//        cargaInfo();
//        calculos();
//        SumColumn();
//        ImprimirModelo();
//        VendedorMax();
//        VendedorMin();
        
        
    }//cierre void main

}//cierre programa
