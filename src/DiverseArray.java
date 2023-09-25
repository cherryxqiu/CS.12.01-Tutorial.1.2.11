public class DiverseArray {
    public static int arraySum (int[] arr) {
        int sum = 0;
        for (int i =0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] rowSums (int[][] arr2D) {
        int[] sumArray = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++) {
            int thisRowSum = 0;
            for (int j = 0; j < arr2D[0].length; j++)
                thisRowSum += arr2D[i][j];
            sumArray[i] = thisRowSum;
        }
        return sumArray;


    }

    public static boolean isDiverse (int[][] arr2D) {
        int[] rowSums = rowSums(arr2D);
        for (int i = 0; i < rowSums.length; i++) {
            int thisSum = rowSums[i];
            for (int j = 0; j < rowSums.length; j++) {
                if (j==i) {
                    j++;
                }
                else {
                    if (rowSums[j] == thisSum) {
                        return false;
                    }
                }

            }

        }

        return true;

    }



}