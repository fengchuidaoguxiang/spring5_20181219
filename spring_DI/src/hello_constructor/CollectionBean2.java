package hello_constructor;

import java.util.*;

public class CollectionBean2 {
    private Set<String> set2;
    private List<?> list2;
    private Map<String,String> map2;
    private Properties prop2;
    private String[]  arrays2;

    public CollectionBean2(Set<String> set2, List<?> list2, Map<String, String> map2, Properties prop2, String[] arrays2) {
        this.set2 = set2;
        this.list2 = list2;
        this.map2 = map2;
        this.prop2 = prop2;
        this.arrays2 = arrays2;
    }

    @Override
    public String toString() {
        return "CollectionBean1{" + "\nset=" + set2 + ", \nlist=" + list2 + ", \nmap=" + map2 + ", \nprop=" + prop2 + "\narrays2"+Arrays.toString(arrays2)+'}';
    }
}
