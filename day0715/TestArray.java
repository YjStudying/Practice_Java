package day0715;

public class TestArray {
    public static void main(String[] args) {
        double[] myList = {1.9,1.4,4.3,9.1};

        for (int i = 0;i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }

        double total = 0;
        for (double i: myList) {
            total += i;
        }
        System.out.println("Total is " + total);

        double max = myList[0];
        for (double i : myList) {
            if (i > max) max = i;
        }
        System.out.println("Max is " + max);
    }
}
