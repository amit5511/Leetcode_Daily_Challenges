
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
         int n=gas.length;
           for(int i=0;i<n;i++)
            {
               int val=gas[i]-cost[i];
               int j=i+1;
               while(val>0&&j%n!=i){
                 val=val-cost[(j)%n]+gas[j%n];
                 j++;
             }
           
            if(val>=0&&j%n==i)
                return i;
           }
        return -1;
    }
}
