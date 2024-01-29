package week01.taskOneLambda;

public class Main {

    public static void main(String[] args) {

        int[] arrayOne = {10, 11, 12, 13, 14, 15};
        int[] arrayTwo = {16, 17, 18, 19, 20, 21};

        ArithmeticOperation addition = (int a, int b) -> a + b;
        ArithmeticOperation subtraction = (int a, int b) -> a - b;
        ArithmeticOperation multiplication = (int a, int b) -> a * b;
        ArithmeticOperation division = (int a, int b) -> a / b;
        ArithmeticOperation modulus = (int a, int b) -> a % b;
        ArithmeticOperation power = (int a, int b) -> (int) Math.pow(a,b);


        System.out.println(addition.perform(1,2));
        System.out.println(subtraction.perform(3,4));
        System.out.println(multiplication.perform(5,6));
        System.out.println(division.perform(7,7));
        System.out.println(modulus.perform(8,9));
        System.out.println(power.perform(10,11));

        System.out.println(operate(1,2,addition));
        System.out.println(operate(1,2,subtraction));
        System.out.println(operate(1,2,multiplication));
        System.out.println(operate(1,1,division));
        System.out.println(operate(1,2,modulus));
        System.out.println(operate(1,2,power));

        int[] result0 = operate(arrayOne,arrayTwo,addition);
        int[] result1 = operate(arrayOne,arrayTwo,subtraction);
        int[] result2 = operate(arrayOne,arrayTwo,multiplication);
        int[] result3 = operate(arrayOne,arrayTwo,division);
        int[] result4 = operate(arrayOne,arrayTwo,modulus);
        int[] result5 = operate(arrayOne,arrayTwo,power);

        for (int i: result0){
            System.out.println(i);
        }
        for (int i: result1){
            System.out.println(i);
        }
        for (int i: result2){
            System.out.println(i);
        }
        for (int i: result3){
            System.out.println(i);
        }
        for (int i: result4){
            System.out.println(i);
        }
        for (int i: result5){
            System.out.println(i);
        }
    }

    private static int operate(int a, int b, ArithmeticOperation op) {
        return op.perform(a, b);
    }

    private static int[] operate(int[] a, int[] b, ArithmeticOperation op) {

        int[] result = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = op.perform(a[i], b[i]);
        }
        return result;
    }
}

@FunctionalInterface
interface ArithmeticOperation {
    int perform(int a, int b);
}