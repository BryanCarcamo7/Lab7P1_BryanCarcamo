package practica;


import java.security.SecureRandom;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bryan Carcamo
 */
public class Lab7P1_BryanCarcamo {
            
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        SecureRandom aleatorio =new SecureRandom();
      
         int opcion=0;
        while(opcion!=4){
       
       opcion=Integer.parseInt(JOptionPane.showInputDialog("---------MENU--------\n" +
"1.Promedios \n" +
"2.De landscape a portrait \n" +
"3.Higher-Order Contains \n" +
"4.Salir "));
       
       switch(opcion){
           case 1:
            int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas: "));

            int columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas: "));
                         
            llenarArreglos(fila,columna);
   
           int str;
           
            str = Integer.parseInt(JOptionPane.showInputDialog("Matriz Generada \n"+ImprimirArreglo(fila,columna)+"\nCalcular el Promedio de "
                    + "\n1.Filas"
                    + "\n2.Columnas"));
           
            if(str ==1){
               int d= Integer.parseInt(JOptionPane.showInputDialog(promedioFilas(fila,columna)));
            
            }else if(str ==2){
             int s= Integer.parseInt(JOptionPane.showInputDialog(promedioColumnas(fila,columna)));
            }else{
            break;
            }
            
               break;


           case 2:
                int f = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas: "));

                int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de colunas: "));
                
                ArreglosRandom(f,c);
                
               JOptionPane.showInputDialog(ImprimirArreglo(f,c));
                
                RotarMatriz(f,c);
                
               JOptionPane.showInputDialog(ImprimirRotacion(f,c));
                
                
               break;
           case 3:
               
              int fi = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas: "));

              int co = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de colunas: "));
              
               break;
           case 4:
               System.out.println("Feliz dia");
               break;
               
       }
       
       }
    }

    public static int[][] llenarArreglos( int f, int c ) {      
         int [][] arr=new int[f][c];
        for(int i=0;i<arr.length;i++){
        for(int x=0;x<arr.length;x++){
        arr[i][x]=(int)(Math.random()*99);
        }
        }
    return arr;
    }
     public static int promedioFilas( int f, int c ) {      
        int frecuencia=0;
        int total=0;
        int promedio=0;
         int [] arr=new int[f];
        for(int i=0;i<arr.length;i++){
        total+=arr[i];
        frecuencia++;
        promedio=total/frecuencia;
        
        }
         System.out.println(promedio);
    return promedio;
    }
      public static int promedioColumnas( int f, int c ) {      
        int frecuencia=0;
        int total=0;
        int promedio=0;
         int [] arr=new int[f];
        for(int i=0;i<arr.length;i++){
       for(int x=0;x<arr.length;x++){     
        total+=arr[x];
        frecuencia++;
        promedio=total/frecuencia;
       }
        }
          System.out.println(promedio);
    return promedio;
    }
   
     public static int[][] ArreglosRandom( int f, int c ) {      
         int [][] arr=new int[f][c];
        for(int i=0;i<arr.length;i++){
        for(int x=0;x<arr.length;x++){
        arr[i][x]=(int)(Math.random()*9);
        }
        }
    return arr;
    }
   
      public static int[][] RotarMatriz( int f, int c ) {      
         int [][] arr=new int[f][c];
      int tamaño=arr.length;
      int [][] nuevamatriz=new int[tamaño][tamaño];
      for (int x=0;x<tamaño;x++) {
  for (int y=0;y<tamaño;y++) {
    nuevamatriz[y][tamaño-1-x] = arr[x][y];
  }
}
      
    return arr;
    }
      public static int[][] ImprimirRotacion(int f, int c){
       int [][] arr=new int[f][c];
      int tamaño=arr.length;
      int [][] nuevamatriz=new int[tamaño][tamaño];   
       for (int x=0;x<tamaño;x++) {
   for (int y=0;y<tamaño;y++) {
       System.out.println(arr[x][y]);
  }
}
         return arr;    
      }
      
     

   public static int[][] ImprimirArreglo(int f, int c){
   int arr[][]=new int[f][c];
    for(int i=0;i<arr.length;i++){
        for(int x=0;x<arr.length;x++){
            System.out.print(arr[i][x]);
        }
   } 
    return arr;
   }
   

}