package lab_11;

import java.util.*;

public class Solution {

    public static <T> ArrayList<T> newArrayList(T... elements) {
        ArrayList<T> res = new ArrayList<>();
        for (T elm : elements)
            res.add(elm);

        return res;
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        HashSet<T> res = new HashSet<>();
        for (T elm : elements)
            res.add(elm);

        return res;
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        if (keys.size() != values.size())
            throw new IllegalArgumentException();

        HashMap<K, V> res = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            res.put(keys.get(i), values.get(i));
        }

        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> test1 = newArrayList (1,2,34,5);
        ArrayList<String> test2 = newArrayList ("name1", "name2");
        test2.forEach(e -> System.out.println(e.toString()));
        System.out.println(test1);

        HashSet<Integer> test3 = newHashSet(1,2,3,4,5);
        HashSet<String> test4 = newHashSet("name1", "name2", "name3");
        test4.forEach(e -> System.out.println(e.toString()));

        HashMap<Integer, String> test5 = newHashMap(Arrays.asList(1, 2, 3), Arrays.asList("a", "b", "c"));
        HashMap<String, Integer> test6 = newHashMap(Arrays.asList("a", "b", "c"), Arrays.asList(1, 2, 3));
    }
}
