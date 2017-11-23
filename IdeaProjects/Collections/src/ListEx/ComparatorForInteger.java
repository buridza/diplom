package ListEx;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorForInteger implements Comparator<Number> {
    @Override
    public int compare(Number o1, Number o2) {
        if(o1.intValue()<o2.intValue()){
            return -1;
        }else if(o1.intValue()>o2.intValue()){
            return 1;
        }else return 0;
    }


}
