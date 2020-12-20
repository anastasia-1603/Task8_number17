import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Utils
{
    public static void writeArrayToFile(String fileName, int[][] arr2)
            throws FileNotFoundException
    {
        try (PrintWriter out = new PrintWriter(fileName))
        {
            out.println(toString(arr2));
        }
    }

    public static int[][] readIntArray2FromFile(String fileName)
    {
        try
        {
            return toIntArray2D(readLinesFromFile(fileName));
        }
        catch(FileNotFoundException e)
        {
            return null;
        }
    }

    private static String[] readLinesFromFile(String fileName) throws FileNotFoundException
    {
        List<String> lines;
        try (Scanner scanner = new Scanner(new File(fileName), "UTF-8"))
        {
            lines = new ArrayList<>();
            while (scanner.hasNext())
            {
                lines.add(scanner.nextLine());
            }
        }
        return lines.toArray(new String[0]);
    }

    private static int[][] toIntArray2D(String[] lines)
    {
        int[][] arr2 = new int[lines.length][];
        for (int r = 0; r < lines.length; r++)
        {
            arr2[r] = toIntArray(lines[r]);
        }
        return arr2;
    }

    private static int[] toIntArray(String str)
    {
        Scanner scanner = new Scanner(str);
        scanner.useLocale(Locale.ROOT);
        scanner.useDelimiter("(\\s|[,;])+");
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext())
        {
            list.add(scanner.nextInt());
        }
        Integer[] arr = list.toArray(new Integer[0]);
        return toPrimitive(arr);
    }

    private static int[] toPrimitive(Integer[] arr)
    {
        if (arr == null)
        {
            return null;
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            result[i] = arr[i];
        }
        return result;
    }

    public static String toString(int[][] arr2)
    {
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < arr2.length; r++)
        {
            if (r > 0)
            {
                sb.append(System.lineSeparator());
            }
            sb.append(toString(arr2[r]));
        }
        return sb.toString();
    }

    private static String toString(int[] arr)
    {
        if (arr == null)
        {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++)
        {
            if (i > 0)
            {
                sb.append(", ");
            }
            sb.append(String.format(Locale.ROOT, "%d", arr[i]));
        }
        return sb.toString();
    }
}
