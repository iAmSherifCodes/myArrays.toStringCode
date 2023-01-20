import java.util.Arrays;

public class ArrayPractice {

    //arrayToStringCopy() method overloaded
    public static void arrayToStringCopy(String[] arr){
        System.out.print("[");
        for (int elem = 0; elem < arr.length; elem++) {
            int d = arr.length -1;
            if (elem == d){
                System.out.printf("%s", arr[elem]);
                break;
            }
            System.out.printf("%s, ", arr[elem]);
        }
        System.out.print("]");
        System.out.println();
    }
    public static void arrayToStringCopy(int[] arr){
        System.out.print("[");
        for (int elem = 0; elem < arr.length; elem++) {
            String s = Integer.toString(arr[elem]);
            int d = arr.length -1;
            if (elem == d){
                System.out.printf("%s", s);
                break;
            }
            System.out.printf("%s, ", s);
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        String colors[] = new String[7];
        colors[0] = "pink";
        colors[1] = "red";
        colors[2] = "yellow";
        colors[3] = "purple";
        colors[4] = "violet";
        colors[5] = "green";
        colors[6] = "gold";

        System.out.println("java.util.Arrays - Arrays.toString() format");
        System.out.println(Arrays.toString(colors));
        System.out.printf("%n%n");

        System.out.println("My format");
        arrayToStringCopy(colors);

        int numberArr[] = new int[5];
        numberArr[0] = 1;
        numberArr[1] = 2;
        numberArr[2] = 3;
        numberArr[3] = 4;
        numberArr[4] = 5;

        System.out.println();
        System.out.println("--".repeat(15));
        System.out.printf("%n%n");
        System.out.println("java.util.Arrays - Arrays.toString() format");
        System.out.println(Arrays.toString(numberArr));

        System.out.printf("%n%n");
        System.out.println("My format");
        arrayToStringCopy(numberArr);


    }

}

