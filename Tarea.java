import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class Tarea {
    public static int[] objetivo = new int[9];
    
    public static boolean isTop(int pos){
        return pos>2? true:false;
    }

    public static boolean isBottom(int pos){
        return pos<6? true:false;

    }

    public static boolean isRight(int pos){
        if(pos==2||pos==5||pos==8){
            return false;
        }
        return true;

    }

    public static boolean solved(int [] arr){
        return (Arrays.equals(arr, objetivo));
    }

    public static boolean isLeft(int pos){
        if(pos==0||pos==3||pos==6){
            return false;
        }
        return true;
    }

    public static void printMatrix(int[] matrix){
        System.out.println("\n-----------");
        for(int i=0; i<9;i++){
            if(i%3==0 && i!=0){
                System.out.print("\n");
            }
            System.out.print(matrix[i]+ "\t");
        }
        System.out.println();
    }

    public static void swap(int[] arr,  int pos1, int pos2){
        int valTemp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = valTemp;
    }

    public static void main(String[] args) {
        int mb = 1024*1024;

        Queue<Integer[]> queue  = new LinkedList<Integer[]>();
		//Getting the runtime reference from system
		Runtime runtime = Runtime.getRuntime();

        System.out.println("Hello World!");
        int[] juego = new int[9];
        int val = 1;
        Scanner reader = null;
        try {
            reader = new Scanner(new File("data.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(int j=0;j<9;j++){
                //System.out.println("j: "+ j + " k: " + k);
                juego[j]= reader.nextInt();
                objetivo[j] = val;
                val++;
        }
        printMatrix(juego);
        printMatrix(objetivo);
        
        //logic goes here
        


		System.out.println("##### Heap utilization statistics [MB] #####");
        System.out.println("Used Memory: " + (runtime.totalMemory() - runtime.freeMemory()) / mb);
        System.out.println("son iguales: " + solved(juego));


    }
}
