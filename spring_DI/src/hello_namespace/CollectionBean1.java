package hello_namespace;

import java.util.*;

public class CollectionBean1 {
    private Set<String> set1;
    private List<?> list1;
    private Map<String,String> map1;
    private Properties prop1;
    private String[]  arrays1;

    public void setSet1(Set<String> set1) {
        this.set1 = set1;
    }

    public void setList1(List<?> list1) {
        this.list1 = list1;
    }

    public void setMap1(Map<String, String> map1) {
        this.map1 = map1;
    }

    public void setProp1(Properties prop1) {
        this.prop1 = prop1;
    }

    public void setArrays1(String[] arrays) {
        this.arrays1 = arrays;
    }

    @Override
    public String toString() {
        return "CollectionBean1{" + "\nset=" + set1 + ", \nlist=" + list1 + ", \nmap=" + map1 + ", \nprop=" + prop1 + "\narrays1"+Arrays.toString(arrays1)+'}';
    }
}
