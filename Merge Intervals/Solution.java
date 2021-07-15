import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Interval {
    int start;
    int end;
    Interval() {
        start = 0; 
        end = 0; 
    }
    Interval(int s, int e) {
        start = s; 
        end = e; 
    }
}

class Solution {

    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        int[] indexes = new int[2];
        Arrays.fill(indexes, -1);

        if(intervals.isEmpty()){
            intervals.add(newInterval);
            return intervals;
        }

        

        if(newInterval.start > newInterval.end) {
            newInterval.start = newInterval.start + newInterval.end;
            newInterval.end = newInterval.start - newInterval.end;
            newInterval.start = newInterval.start - newInterval.end;
        }

        for (int i = 0; i < intervals.size(); i++) {
            if(intervals.get(i).start < newInterval.start && intervals.get(i).end > newInterval.start)
                indexes[0] = i;
            if(intervals.get(i).start < newInterval.end && intervals.get(i).end > newInterval.end)
                indexes[1] = i;
        }
        
        if(indexes[0] != -1 && indexes[1] != -1){
            intervals.get(indexes[0]).end = intervals.get(indexes[1]).end;
            intervals.subList(indexes[0] + 1, indexes[1]+1).clear();
        }

        //A : [ (31935139, 38366404), (54099301, 76986474), (87248431, 94675146) ]
        //B : (43262807, 68844111)
        if(indexes[0] == -1 && indexes[1] != -1) {
            int unknownIndex = -1;
            intervals.get(indexes[1]).start = newInterval.start;  //[ (31935139, 38366404), (43262807, 76986474), (87248431, 94675146) ]
            if(newInterval.start < intervals.get(0).start)
                intervals.subList(0, indexes[1]).clear();
            else {
                List<Interval> redZone = intervals.subList(0, indexes[1]);
                for (int i = 0; i < redZone.size()-1; i++) 
                    if(newInterval.start > redZone.get(i).end && newInterval.start < redZone.get(i+1).start){
                        unknownIndex = i; 
                        break;
                    }
                if(unknownIndex != -1)
                    redZone.subList(unknownIndex+1, indexes[1]).clear();
            }
        }

        if(indexes[0] != -1 && indexes[1] == -1) {
            int unknownIndex = -1;
            intervals.get(indexes[0]).end = newInterval.end; 
            if(newInterval.end > intervals.get(intervals.size()-1).end)
                intervals.subList(indexes[0]+1, intervals.size()).clear();  
            else{
                List<Interval> redZone = intervals.subList(indexes[0], intervals.size());
                for (int i = 0; i < redZone.size()-1; i++)
                    if(newInterval.end > redZone.get(i).end && newInterval.end < redZone.get(i+1).start) {
                        unknownIndex = i; 
                        break;
                    }
                if(unknownIndex != -1)
                    redZone.subList(1, unknownIndex+1).clear();
            }
        }

        if(indexes[0] == -1 && indexes[1] == -1) {
            int startUnknown = -1, endUnknown = -1;

            for(int i=0; i<intervals.size()-1; i++) {
                if(intervals.get(i).end < newInterval.start && intervals.get(i+1).start > newInterval.start )
                    startUnknown = i;
                if(intervals.get(i).end < newInterval.end && intervals.get(i+1).start > newInterval.end )
                    endUnknown = i;
            }

            if(intervals.get(intervals.size()-1).end < newInterval.start)
                intervals.add(intervals.size() ,newInterval);
            else if(intervals.get(0).start > newInterval.end)
                intervals.add(0 ,newInterval);
            else {
                if(startUnknown != -1 && endUnknown != -1) {
                    intervals.subList(startUnknown+1,endUnknown+1).clear();
                }else if(startUnknown == endUnknown){
                    if(!(startUnknown != -1))
                        intervals.clear();
                }else {
                    if(startUnknown == -1){
                        intervals.subList(0,endUnknown+1).clear();
                    }else{
                        intervals.subList(startUnknown+1, intervals.size()).clear();
                    }
                }
                intervals.add(startUnknown+1,newInterval);
            }
        }

        return intervals;
    }

    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(3, 5));
        intervals.add(new Interval(8, 9));
        
        for (Interval interval : insert(intervals, new Interval(4, 10))) 
            System.out.println(interval.start + " " + interval.end);
    }
}