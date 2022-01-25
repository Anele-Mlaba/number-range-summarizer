package numberrangesummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class NumberHandler implements NumberRangeSummarizer {
    @Override
    public Collection<Integer> collect(String input)
    {
        if(input.length() == 0) return new TreeSet<>();
        TreeSet<Integer> queue = new TreeSet<>();
        String[] inputs = input.split(",");
        for (String x: inputs)
        {
            queue.add((Integer.parseInt(x)));
        }
        return queue;
    }

    @Override
    public String summarizeCollection(Collection<Integer> input)
    {
        if(input.size() == 0) return "";
        ArrayList<Integer> array = new ArrayList<>() ;
        for(int x:input)
        {
            array.add(x);
        }

        String ans = "";
        boolean wasConsecutive = false;
        for (int i = 0; i<array.size(); i++)
        {
            int f = i+1;
            int g = i;
            String temp = "";
            while( f<array.size() && array.get(f)-array.get(g)==1 )
            {

                if(array.get(f)>0) temp = array.get(i)+"-"+array.get(f)+", ";
                else temp = array.get(i)+"-("+array.get(f)+"), ";
                f++;
                g++;
                wasConsecutive = true;
            }
            if (wasConsecutive)
            {
                i = f-1;
                ans += temp;
                wasConsecutive = false;
            }
            else
            {
                ans += array.get(i)+", ";
            }
        }
        ans = ans.substring(0, ans.length()-2);
        return ans;
    }
}
