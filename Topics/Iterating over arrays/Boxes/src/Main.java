import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] box1 = input.split(" ");

        input = scanner.nextLine();
        String[] box2 = input.split(" ");

        boolean box1Smallest = ((Integer.parseInt(box1[0]) < Integer.parseInt(box2[0]))
                                    && (Integer.parseInt(box1[1]) < Integer.parseInt(box2[1]))
                                    && (Integer.parseInt(box1[2]) < Integer.parseInt(box2[2])))
                                || ((Integer.parseInt(box1[0]) < Integer.parseInt(box2[0]))
                                    && (Integer.parseInt(box1[2]) < Integer.parseInt(box2[1]))
                                    && (Integer.parseInt(box1[1]) < Integer.parseInt(box2[2])))

                                || ((Integer.parseInt(box1[1]) < Integer.parseInt(box2[1]))
                                        && (Integer.parseInt(box1[0]) < Integer.parseInt(box2[0]))
                                        && (Integer.parseInt(box1[2]) < Integer.parseInt(box2[2])))
                                    || ((Integer.parseInt(box1[1]) < Integer.parseInt(box2[1]))
                                        && (Integer.parseInt(box1[2]) < Integer.parseInt(box2[0]))
                                        && (Integer.parseInt(box1[0]) < Integer.parseInt(box2[2])))

                                || ((Integer.parseInt(box1[2]) < Integer.parseInt(box2[2]))
                                        && (Integer.parseInt(box1[1]) < Integer.parseInt(box2[1]))
                                        && (Integer.parseInt(box1[0]) < Integer.parseInt(box2[0])))
                                    || ((Integer.parseInt(box1[2]) < Integer.parseInt(box2[2]))
                                        && (Integer.parseInt(box1[0]) < Integer.parseInt(box2[1]))
                                        && (Integer.parseInt(box1[1]) < Integer.parseInt(box2[0])));

        boolean box2Smallest = ((Integer.parseInt(box1[0]) > Integer.parseInt(box2[0]))
                                        && (Integer.parseInt(box1[1]) > Integer.parseInt(box2[1]))
                                        && (Integer.parseInt(box1[2]) > Integer.parseInt(box2[2])))
                                   || ((Integer.parseInt(box1[0]) > Integer.parseInt(box2[0]))
                                        && (Integer.parseInt(box1[2]) > Integer.parseInt(box2[1]))
                                        && (Integer.parseInt(box1[1]) > Integer.parseInt(box2[2])))

                                || ((Integer.parseInt(box1[1]) > Integer.parseInt(box2[1]))
                                        && (Integer.parseInt(box1[0]) > Integer.parseInt(box2[0]))
                                        && (Integer.parseInt(box1[2]) > Integer.parseInt(box2[2])))
                                    || ((Integer.parseInt(box1[1]) > Integer.parseInt(box2[1]))
                                        && (Integer.parseInt(box1[2]) > Integer.parseInt(box2[0]))
                                        && (Integer.parseInt(box1[0]) > Integer.parseInt(box2[2])))

                                || ((Integer.parseInt(box1[2]) > Integer.parseInt(box2[2]))
                                        && (Integer.parseInt(box1[1]) > Integer.parseInt(box2[1]))
                                        && (Integer.parseInt(box1[0]) > Integer.parseInt(box2[0])))
                                    || ((Integer.parseInt(box1[2]) > Integer.parseInt(box2[2]))
                                        && (Integer.parseInt(box1[0]) > Integer.parseInt(box2[1]))
                                        && (Integer.parseInt(box1[1]) > Integer.parseInt(box2[0])));


        if(box1Smallest){
            System.out.println("Box 1 < Box 2");
        } else if (box2Smallest) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }


    }
}