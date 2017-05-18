package ejercicios01;

public class Arreglos01 {

    void iniciar() {
      arreglo01();
      //arreglo02();
      //arreglo03();
    
    
    }

    private void arreglo01() {
        //Primera forma
          //Declaracion del Arreglo
          int[] numeros; //Corchetes alt+91 alt+93
          //Asignarle tamaño al arreglo
          numeros=new int[4];
          
          numeros[0]=14;
          numeros[1]=5;
          numeros[3]=69;
          
          System.out.println("Indice[3]= "+numeros[3]);
          System.out.println("Indice[0]= "+numeros[0]);
          System.out.println("Indice[2]= "+numeros[2]);
          System.out.println("Indice[1]= "+numeros[1]);
    }
    void arreglo02(){
        String[] nombres=new String[3];
        nombres[0]="arturo";
        nombres[2]="pepe";
        
        System.out.println("Indice[0]= "+nombres[0]);
        System.out.println("Indice[1]= "+nombres[1]);
        System.out.println("Indice[2]= "+nombres[2]);
        
    }

   void arreglo03() {
     Object[] varios=new Object[3];
     varios[0]="pepe";
     varios[1]=3.9;
     varios[2]=true;
     
     /*
     i=3
     */
       for (int i = 0; i <3; i++) {
           System.out.println("Indice["+i+"]= "+varios[i]);
           //Indice[0]= pepe
           //Indice[1]= 3.9
           //Indice[2]= true
       }
     
     
   }
}
