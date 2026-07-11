public class Pg1 {
    public static void main(String[] args) {
        int[] arr = {4,1,1,1,2,3,5};
        int k = 5;
        int max = Integer.MIN_VALUE;
        int i=0,j=0,sum=0;
        while(j< arr.length){
            if(sum<k){
                sum+=arr[j];
                j++;
            }
            else if(sum==k){
                max = Math.max(max,j-i);
                sum-=arr[i];
                i++;
            }
            else{
                sum-=arr[i];
                i++;
            }
        }
        System.out.println(max);
    }
}
