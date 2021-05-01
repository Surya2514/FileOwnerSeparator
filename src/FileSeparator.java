import java.util.*;

public class FileSeparator {
    public static void main(String[] as)
    {
        Map<String, String> files = new HashMap<>();
        files.put("Input.txt", "Randy");
        files.put("Code.py", "Stan");
        files.put("Output.txt", "Randy");

        System.out.println(group_by_owners(files));

    }

    public static Map<String, List<String>> group_by_owners(Map<String, String> map)
    {
        Map<String, List<String>> result = new HashMap<>();
        map.forEach((key, values) -> result.computeIfAbsent(values, x -> new ArrayList<>()).add(key));

        return result;
    }
}
