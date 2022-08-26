class ChocolateDistribution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        int minDiff=Integer.MAX_VALUE;
        //This function sorts the array
        //It takes nlogn time
        Collections.sort(a);
        // 1 3 4 7 9 9 12 56
        for(int i=0;i+m-1<n;i++){
        minDiff=Math.min(a.get(i+m-1)-a.get(i),minDiff);
        }
        return minDiff;
    }
}
