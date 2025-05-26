Selection Sorting
-------------------------------------------
class Selection {
    void selectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
           int a=i;
           for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[a]){
                   a=j;
               }
           }
           int temp=arr[i];
           arr[i]=arr[a];
           arr[a]=temp;
        }
    }
}
