import java.util.ArrayList;

public class Box {
    private int length;     //довжина коробки
    public double capacity;//ємність коробки
    protected char colorChar; //символ коліру коробки: 'r' - red, 'b' - black

    Tree trees[] = new Tree[3];



    String str[];

    static byte variable[][] = new byte[3][4];

    public static void main(String[] args) {

        float a = 10.0f/0.0f;
        System.out.println(a);

//        for (int i = 0; i < variable.length; i++) {
//            for (int j = 0; j < variable[i].length; j++)
//                System.out.print(variable[i][j]);
//            System.out.println();
//        }

//        for (int i:variable){
//            System.out.println(i);
//        }

//        int intArray[][] = new int[3][3];
//
//        for (int i = 0; i < intArray.length; i++) {
//            for (int j = 0; j < intArray[i].length; j++) {
//                intArray[i][j] = 10;
//            }
//        }

        int intArray[][] = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};

    }


    public Box() {

    }

    public Box(int length) {
        this.length = length;
    }

    public Box(int length, double capacity) {
        this.length = length;
        this.capacity = capacity;
    }

    public Box(int length, double capacity, char colorChar, String str) {
        this.length = length;
        this.capacity = capacity;
        this.colorChar = colorChar;
//        this.str = str;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void createBox(int length, double capacity, char colorChar) {
        this.length = length;
        this.capacity = capacity;
        this.colorChar = colorChar;
    }

}

