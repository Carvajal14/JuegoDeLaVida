import java.util.*;
class Main {
  public static String tabla[][]=new String[30][30];
  public static Scanner sc=new Scanner(System.in);
  public static void main(String[] args) {

    System.out.println("Programa: Juego de la vida ");
    System.out.println("Programador : Santiago Carvajal Fernández ");
    System.out.println("--------------------------");
    //Asigno celulas al azar a la tabla y la imprimo
    for (int i = 0; i <tabla.length; i++) {
      for (int j = 0; j < tabla[i].length; j++) {
        int num = new Random().nextInt(2);
        if (num == 1)
            tabla[i][j] = "*";
        else if (num == 0)
            tabla[i][j] = " ";
        System.out.print(tabla[i][j]+" ");
      }
      System.out.println("");
    }
    int n=1;
    System.out.println("\n-------------------\n#"+n);

    int count=0;
    String e="";
    do{
      //Crear las condiciones
      for (int i = 0; i <tabla.length; i++) {
        for (int j = 0; j < tabla[i].length; j++) {
          //Condiciones
          if(j == 0){//Lado izquierdo TABLA ~~~
            if(i == 0 && j==0){//Esquina superior izquierda TABLA -----
              //Contadores de vecinos
              if(tabla[tabla.length-1][j]=="*"){//Arriba
                count=count+1;
              }
              if(tabla[tabla.length-1][j+1]=="*"){//Esquina superior derecha
                count=count+1;
              }
              if(tabla[i][j+1]=="*"){//Derecha
                count=count+1;
              }
              if(tabla[i+1][j+1]=="*"){//Esquina inferior derecha
                count=count+1;
              }
              if(tabla[i+1][j]=="*"){//Abajo
                count=count+1;
              }
              if(tabla[i+1][tabla[i].length-1]=="*"){//Esquina inferior izquierda
                count=count+1;
              }
              if(tabla[i][tabla[i].length-1]=="*"){//Izquierda
                count=count+1;
              }
              if(tabla[tabla.length-1][tabla[i].length-1]=="*"){//Esquina superior izquierda
                count=count+1;
              }
              //tabla[i][j] = "2";
              
            }else if(i == tabla.length-1 && j==0){//Esquina inferior izquierda TABLA -----
              //Contadores de vecinos
              if(tabla[i-1][j] == "*"){//Arriba
                count=count+1;
              }
              if(tabla[i-i][j+1] == "*"){//Esquina superior derecha
                count=count+1;
              }
              if(tabla[i][j+1] == "*"){//Derecha
                count=count+1;
              }
              if(tabla[0][j+1] == "*"){//Esquina inferior derecha
                count=count+1;
              }
              if(tabla[0][j] == "*"){//Abajo
                count=count+1;
              }
              if(tabla[0][tabla[i].length-1] == "*"){//Esquina inferior izquierda
                count=count+1;
              }
              if(tabla[i][tabla[i].length-1] == "*"){//Izquierda
                count=count+1;
              }
              if(tabla[i-1][tabla[i].length-1] == "*"){//Esquina superior izquierda
                count=count+1;
              }
              //tabla[i][j] = "4";
              
            }else if(i!=0 && i!=tabla.length-1 && j==0){//Centro izquierda TABLA -----
              //Contadores de vecinos
              if(tabla[i-1][j] == "*"){//Arriba
                count=count+1;
              }
              if(tabla[i-1][j+1] == "*"){//Esquina superior derecha
                count=count+1;
              }
              if(tabla[i][j+1] == "*"){//Derecha
                count=count+1;
              }
              if(tabla[i+1][j+1] == "*"){//Esquina inferior derecha
                count=count+1;
              }
              if(tabla[i+1][j] == "*"){//Abajo
                count=count+1;
              }
              if(tabla[i+1][tabla[i].length-1] == "*"){//Esquina inferior izquierda
                count=count+1;
              }
              if(tabla[i][tabla[i].length-1] == "*"){//Izquierda
                count=count+1;
              }
              if(tabla[i-1][tabla[i].length-1] == "*"){//Esquina superior izquierda
                count=count+1;
              }
              //tabla[i][j] = "1";
            }
              
          }else if(j == tabla[i].length-1){//Lado derecho TABLA ~~~
            if(i == 0 && j==tabla[i].length-1){//Esquina superior derecha TABLA -----
              //Contadores de vecinos
              if(tabla[tabla.length-1][j]=="*"){//Arriba
                count=count+1  ;
              }
              if(tabla[tabla.length-1][0]=="*"){//Esquina superior derecha
                count=count+1;
              }
              if(tabla[i][0]=="*"){//Derecha
                count=count+1;
              }
              if(tabla[i+1][0]=="*"){//Esquina inferior derecha
                count=count+1;
              }
              if(tabla[i+1][j]=="*"){//Abajo
                count=count+1;
              }
              if(tabla[i+1][j-1]=="*"){//Esquina inferior izquierda
                count=count+1;
              }
              if(tabla[i][j-1]=="*"){//Izquierda
                count=count+1;
              }
              if(tabla[tabla.length-1][j-1]=="*"){//Esquina superior izquierda
                count=count+1;
              }
              //tabla[i][j] = "6";
              
            }else if(i == tabla.length-1 && j==tabla[i].length-1){//Esquina inferior derecha TABLA -----
              //Contadores de vecinos
              if(tabla[i-1][j] == "*"){//Arriba
                count=count+1;
              }
              if(tabla[i-1][0] == "*"){//Esquina superior derecha
                count=count+1;
              }
              if(tabla[i][0] == "*"){//Derecha
                count=count+1;
              }
              if(tabla[0][0] == "*"){//Esquina inferior derecha
                count=count+1;
              }
              if(tabla[0][j] == "*"){//Abajo
                count=count+1;
              }
              if(tabla[0][j-1] == "*"){//Esquina inferior izquierda
                count=count+1;
              }
              if(tabla[i][j-1] == "*"){//Izquierda
                count=count+1;
              }
              if(tabla[i-1][j-1] == "*"){//Esquina superior izquierda
                count=count+1;
              }
             // tabla[i][j] = "8";
              
            }else if(i!=0 && i!=tabla.length-1 && j==tabla[i].length-1){//Centro derecha TABLA -----
              //Contadores de vecinos
              if(tabla[i-1][j] == "*"){//Arriba
                count=count+1;
              }
              if(tabla[i-1][0] == "*"){//Esquina superior derecha
                count=count+1;
              }
              if(tabla[i][0] == "*"){//Derecha
                count=count+1;
              }
              if(tabla[i+1][0] == "*"){//Esquina inferior derecha
                count=count+1;
              }
              if(tabla[i+1][j] == "*"){//Abajo
                count=count+1;
              }
              if(tabla[i+1][j-1] == "*"){//Esquina inferior izquierda
                count=count+1;
              }
              if(tabla[i][j-1] == "*"){//Izquierda
                count=count+1;
              }
              if(tabla[i-1][j-1] == "*"){//Esquina superior izquierda
                count=count+1;
              }
              //tabla[i][j] = "7";
            }
            
          }else if(i==0){//Centro arriba TABLA ~~~
            //Contadores de vecinos
            if(tabla[tabla.length-1][j] == "*"){//Arriba
              count=count+1;
            }
            if(tabla[tabla.length-1][j+1] == "*"){//Esquina superior derecha
              count=count+1;
            }
            if(tabla[i][j+1] == "*"){//Derecha
              count=count+1;
            }
            if(tabla[i+1][j+1] == "*"){//Esquina inferior derecha
              count=count+1;
            }
            if(tabla[i+1][j] == "*"){//Abajo
              count=count+1;
            }
            if(tabla[i+1][j-1] == "*"){//Esquina inferior izquierda
              count=count+1;
            }
            if(tabla[i][j-1] == "*"){//Izquierda
              count=count+1;
            }
            if(tabla[tabla.length-1][j-1] == "*"){//Esquina superior izquierda
              count=count+1;
            }
            //tabla[i][j] = "9";
              
          }else if(i==tabla.length-1){//Centro abajo TABLA ~~~
            //Contadores de vecinos
            if(tabla[i-1][j] == "*"){//Arriba
              count=count+1;
            }
            if(tabla[i-1][j+1] == "*"){//Esquina superior derecha
              count=count+1;
            }
            if(tabla[i][j+1] == "*"){//Derecha
              count=count+1;
            }
            if(tabla[0][j+1] == "*"){//Esquina inferior derecha
              count=count+1;
            }
            if(tabla[0][j] == "*"){//Abajo
              count=count+1;
            }
            if(tabla[0][j-1] == "*"){//Esquina inferior izquierda
              count=count+1;
            }
            if(tabla[i][j-1] == "*"){//Izquierda
              count=count+1;
            }
            if(tabla[i-1][j-1] == "*"){//Esquina superior izquierda
              count=count+1;
            }
            //tabla[i][j] = "5";
              
          }else{//Todo lo demás ~~~
            //Contadores de vecinos
            if(tabla[i-1][j]=="*"){//Arriba
              count=count+1;
            }
            if(tabla[i-1][j+1]=="*"){//Esquina superior derecha
              count=count+1;
            }
            if(tabla[i][j+1]=="*"){//Derecha
              count=count+1;
            }
            if(tabla[i+1][j+1]=="*"){//Esquina inferior derecha
              count=count+1;
            }
            if(tabla[i+1][j]=="*"){//Abajo
              count=count+1;
            }
            if(tabla[i+1][j-1]=="*"){//Esquina inferior izquierda
              count=count+1;
            }
            if(tabla[i][j-1]=="*"){//Izquierda
              count=count+1;
            }
            if(tabla[i-1][j-1]=="*"){//Esquina superior izquierda
              count=count+1;
            }
            //tabla[i][j] = "0";
          }
          
          //Reglas de las celulas 
          if (tabla[i][j]=="*") {
            if (count==1 || count==0) { 
              tabla[i][j]=" ";
            }else if (count==2 && count==3){
              tabla[i][j]="*";
            }
            if (count>=4) {
              tabla[i][j]=" ";
            }
          }
          if (tabla[i][j]==" ") {
            if (count==3){
              tabla[i][j]="*";
            }else{
              tabla[i][j]=" ";
            }
          }
            
          //Imprimir
          System.out.print(tabla[i][j]+" ");
          //System.out.println(count);
          count=0;
        }
        System.out.println("");
      }
      n=n+1;
      System.out.println("\n-------------------\n#"+n);
    // }while(true);
      e=sc.nextLine();
    }while(e=="");
  }
}