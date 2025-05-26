class Binary {
    public int binarysearch(int[] arr, int k) {
       int  l=0,r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==k){
                while(mid-1>-1 && arr[mid-1]==k){
                    mid=mid-1;
                }
                return mid;
            }
            else if(k<arr[mid]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
}
