Linear search
----------------------------------------
class Linear {
    static int search(int arr[], int x) {
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
