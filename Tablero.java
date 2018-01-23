import java.util.Arrays;

class Tablero{
    public int [] tablero = new int[9];
    public int [] objetivo = new int[9];

    public Tablero(){}
    public Tablero(int[] arr){

    }

    public  boolean isTop(int pos){
        return pos>2? true:false;
    }

    public  boolean isBottom(int pos){
        return pos<6? true:false;

    }

    public  boolean isRight(int pos){
        if(pos==2||pos==5||pos==8){
            return false;
        }
        return true;

    }

    public  boolean isLeft(int pos){
        if(pos==0||pos==3||pos==6){
            return false;
        }
        return true;
    }

    public  boolean solved(){
        return (Arrays.equals(this.tablero, this.objetivo));
    }

    public  void printMatrix(){
        System.out.println("\n-----------");
        for(int i=0; i<9;i++){
            if(i%3==0 && i!=0){
                System.out.print("\n");
            }
            System.out.print(this.tablero[i]+ "\t");
        }
        System.out.println();
    }

    public  void printObjectiveMatrix(){
        System.out.println("\n-----------");
        for(int i=0; i<9;i++){
            if(i%3==0 && i!=0){
                System.out.print("\n");
            }
            System.out.print(this.objetivo[i]+ "\t");
        }
        System.out.println();
    }

    public  void swap(int[] arr,  int pos1, int pos2){
        int valTemp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = valTemp;
    }

}