public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        double harmonicSum = 0D;

        for(var element: array){
            harmonicSum += 1D / element;
        }

        System.out.println(harmonicSum);

    }
}
