public class Array2DAlgorithmTester
{
    public static void main(String[] args)
    {
        // the method will print the 2D array, and also return the 2D array
        int[][] returnedArr = Algorithm2DArrays.printNumberGrid(5, 6);

        System.out.println("-----------");

        // print the returned array (number grid), just to test that the
        // correct 2D array got returned -- this should print the same grid
        // that is printed by the method
        for (int[] row : returnedArr)
        {
            for (int val : row)
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}


