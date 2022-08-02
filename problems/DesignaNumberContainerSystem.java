import java.util.Map;
import java.util.TreeMap;
/*
https://leetcode.com/problems/design-a-number-container-system/

TreeMap - will store values in sorted order
 */
public class DesignaNumberContainerSystem {

    Map<Integer,Integer> a;
    public DesignaNumberContainerSystem() {
        a=new TreeMap<>();
    }

    public void change(int index, int number) {
        a.put(index,number);
    }

    public int find(int number) {
        for (Map.Entry<Integer, Integer>
                entry : a.entrySet())
        {
            if(entry.getValue()==number)
            {
                return entry.getKey();
            }
        }
        return -1;
    }
}
