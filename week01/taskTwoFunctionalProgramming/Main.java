package week01.taskTwoFunctionalProgramming;

public class Main {

    public static void main(String[] args) {

        int[] arrayOne = {12, 13, 14, 15, 16, 17};
        int[] arrayTwo = {3, 6, 9, 3, 13, 63, 93};

        MyTransformingType addThree = (int a) -> a + 3;
        MyValidatingType isTheNumberThree = (int a) -> a == 3;

        int[] resultOne = map(arrayOne, addThree);
        for (int i : resultOne) {
            System.out.println(i);
        }

        int[] resultTwo = filter(arrayTwo,isTheNumberThree);
        for (int i: resultTwo){
            System.out.println(i);
        }
    }

    private static int[] filter(int[] a, MyValidatingType op) {

        int[] resultArray = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            boolean resultChecker = op.perform(a[i]);
            if (resultChecker == true){
                resultArray[i] = a[i];
            }
        }
        return resultArray;
    }
    private static int[] map(int[] a, MyTransformingType op) {
        int[] result = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = op.perform(a[i]);
        }
        return result;
    }
}

@FunctionalInterface
interface MyTransformingType {
    int perform(int a);
}

@FunctionalInterface
interface MyValidatingType {
    boolean perform(int a);
}
