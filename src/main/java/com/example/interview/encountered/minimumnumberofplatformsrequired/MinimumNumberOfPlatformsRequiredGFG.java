package com.example.interview.encountered.minimumnumberofplatformsrequired;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class pair
{
    int first;
    char second;
    pair(int key1, char key2)
    {
        this.first = key1;
        this.second= key2;

    }
}

class MinimumNumberOfPlatformsRequiredGFG
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    public static int findPlatform(int arr[], int dep[], int n)
    {

        ArrayList<pair> order = new ArrayList<>();
        //inserting all the values of time(arrival and departure)
        //in the ArrayList of pairs.
        for(int i = 0; i < n; i++)
        {
            //if the time is of arrival then we keep second value
            //of pair as 'a' else 'd'.
            order.add(new pair(arr[i], 'a'));
            order.add(new pair(dep[i], 'd'));

        }

        //using custom sort on ArrayList, first according to time and if time is
        //same for two events, then arrival comes first followed by departure.
        Collections.sort(order, new Comparator<pair>()
                {
                    @Override public int compare(pair p1, pair p2)
                    {
                        if(p1.first == p2.first)
                            return new Character(p1.second).compareTo(new Character(p2.second));
                        return p1.first - p2.first;
                    }
                }

        );
        int result = 1;
        int plat_needed = 0;
        for(int i = 0; i < order.size(); i++)
        {
            pair p = order.get(i);

            //if the second value of list element is 'a' which stands
            //for arrival then we add 1 to platform needed else we
            //subtract 1 from platform needed.
            if(p.second == 'a')
                plat_needed++;
            else
                plat_needed--;
            //we keep updating the value of result.
            if(plat_needed > result)
                result = plat_needed;
        }
        //returning the minimum number of platforms required.
        return result;
    }

    public static void main(String[] args) {
        int arrival[] = {900, 940, 950, 1100, 1500, 1800};
        int departure[] = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatform(arrival, departure, 6));
    }

}
