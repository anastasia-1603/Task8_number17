public class Logic
{
    public static int[][] cropArray(int[][] arr)
    {
        int row = arr.length;
        int column = arr[0].length;
        int minSize = Math.min(row, column);
        int[][] newArray = new int[minSize][minSize];
        if (row != column)
        {
            for (int i = 0; i < minSize; i++)
            {
                for (int k = 0; k < minSize; k++)
                {
                    newArray[i][k] = arr[i][k];
                }
            }
        }
        else
        {
            return arr;
        }
        return newArray;
    }
}
