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
    public static void main(String[] args) {
        int mb = 1024*1024;
        //Queue<int[]> queue  = new LinkedList<int[]>();
		//Getting the runtime reference from system
		Runtime runtime = Runtime.getRuntime();

        System.out.println("Hello World!");
        Tablero juego = new Tablero();
        int val = 1;
        Scanner reader = null;
        try {
            reader = new Scanner(new File("data.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(int j=0;j<9;j++){
            //System.out.println("j: "+ j + " k: " + k);
            juego.tablero[j]= reader.nextInt();
            juego.objetivo[j] = val;
            val++;
        }
        juego.printMatrix();
        juego.printObjectiveMatrix();
        
        //logic goes here
        //queue.add(juego);


		System.out.println("##### Heap utilization statistics [MB] #####");
        System.out.println("Used Memory: " + (runtime.totalMemory() - runtime.freeMemory()) / mb);
        // System.out.println("son iguales: " + solved(juego));


    }
}
