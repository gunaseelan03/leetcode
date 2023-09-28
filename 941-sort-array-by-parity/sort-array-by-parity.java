class Solution {
    public int[] sortArrayByParity(int[] arr) {
       for(int i=0,j=0;j<arr.length;j++){
           if(arr[j]%2==0){
               int tmp = arr[i];
               arr[i++] = arr[j];
               arr[j] = tmp;
           }
       }
        return arr;
    }
}