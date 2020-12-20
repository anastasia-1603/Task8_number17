
import org.junit.Assert;
import org.junit.Test;

public class Tests
{
    @Test
    public void test1()
    {
        int[][] inputArray = Utils.readIntArray2FromFile("tests\\input1.txt");
        int[][] squareArray = Logic.cropArray(inputArray);
        int[][] expectedArray = {{1, 2, 3, 4}, {2, 3, 4, 5}, {3, 4, 5, 6}, {4, 5, 6, 7}};
        Assert.assertArrayEquals(expectedArray, squareArray);
    }

    @Test
    public void test2()
    {
        int[][] inputArray = Utils.readIntArray2FromFile("tests\\input2.txt");
        int[][] squareArray = Logic.cropArray(inputArray);
        int[][] expectedArray = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        Assert.assertArrayEquals(expectedArray, squareArray);
    }

    @Test
    public void test3()
    {
        int[][] inputArray = Utils.readIntArray2FromFile("tests\\input3.txt");
        int[][] squareArray = Logic.cropArray(inputArray);
        int[][] expectedArray = {{0}};
        Assert.assertArrayEquals(expectedArray, squareArray);
    }

    @Test
    public void test4()
    {
        int[][] inputArray = Utils.readIntArray2FromFile("tests\\input4.txt");
        int[][] squareArray = Logic.cropArray(inputArray);
        int[][] expectedArray = {{1234, 2345}, {3217, 7829}};
        Assert.assertArrayEquals(expectedArray, squareArray);
    }

    @Test
    public void test5()
    {
        int[][] inputArray = Utils.readIntArray2FromFile("tests\\input5.txt");
        int[][] squareArray = Logic.cropArray(inputArray);
        int[][] expectedArray = {{4, 5, 65, -76, 35}, {5, 77, 99, 85, 43},
                {2, 3, -78, 9, 97}, {35, 8, 98, 8, -1}, {1, 0, 92, 82, 2}};
        Assert.assertArrayEquals(expectedArray, squareArray);
    }
}
