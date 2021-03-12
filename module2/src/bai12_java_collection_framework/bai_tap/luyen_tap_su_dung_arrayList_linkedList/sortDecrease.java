package bai12_java_collection_framework.bai_tap.luyen_tap_su_dung_arrayList_linkedList;

import java.util.Comparator;

public class sortDecrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPriceProduct()-o1.getPriceProduct());
    }

}
