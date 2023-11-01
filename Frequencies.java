int i,j;
for(int i=0;i<N;){
    if(arr[i]>0 && arr[i]<=N){
        j=arr[i]-1;
        if(arr[j]<=0){
            arr[j]--;
            arr[i]=0;
            i++;
        }
    }
    else if(arr[i]>N){
        arr[i]=0;
        i++;
    }
    else i++;
}