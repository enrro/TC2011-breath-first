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
        Tablero juego = new Tablero();
        Queue<Tablero> queue  = new LinkedList<Tablero>();
        int depthLimit = 20;
        Scanner reader = null;
        int mb = 1024*1024;
		//Getting the runtime reference from system
		Runtime runtime = Runtime.getRuntime();

        System.out.println("Hello World!");
        try {
            reader = new Scanner(new File("data.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(int j=0;j<9;j++){
            //System.out.println("j: "+ j + " k: " + k);
            juego.tablero[j]= reader.nextInt();
            if(j==8){
                juego.objetivo[j] = j+1;
            } else{
                juego.objetivo[j] = j+1;
            }
        }
        juego.printMatrix();
        juego.printObjectiveMatrix();
        
        //logic goes here
        queue.add(juego);

        queue.element().printMatrix();
        int nodesVisited = 0;
        int depth = 0;
        while(true){
            Tablero node = queue.poll();
            nodesVisited++;

            // Check if current node is the goal
            if(node.solved()){
                System.out.println("Nodes visited: " + nodesVisited);
            }else if(depth<depthLimit){
                
            }else{
                System.out.println("Depth limit has been reached, limit depth is: " + depthLimit);
                System.exit(0);
            }
        }

		System.out.println("##### Heap utilization statistics [MB] #####");
        System.out.println("Used Memory: " + (runtime.totalMemory() - runtime.freeMemory()) / mb);
        System.out.println("son iguales: " + queue.element().solved());


    }
}
