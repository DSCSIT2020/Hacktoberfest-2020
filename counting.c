#include<stdio.h>

// this function returns the maximum value present in the array
int find_max(int a[],int n){
int i, max=a[0];
for(i=1;i<n;i++) {
if(max<a[i])
max=a[i];
}
return max;
}

// this function sorts the array of n elements
void countSort(int a[],int n, int max) {

int c[max],i,j,k=0; // max is the size of temporary array

for(i=0;i<max;i++) // initialize all array elemetts by 0
c[i]=0;

for(i=0;i<n;i++) // increment temporary array value by 1
c[a[i]]++; // if the index value is present in actual array

for(i=0;i<max;i++){
if(c[i]!=0){ // if the value in temporary array is > 0 then
for(j=0;j<c[i];j++) // store the index value in the actual array
a[k++]=i;
}
}
}

/* the main function() */
int main(){
int n,i;

printf("\nEnter No of elements: ");
scanf("%d",&n);

int arr[n];

printf("\nEnter Array elements:");
for(i=0;i<n;i++)
scanf("%d",&arr[i]);

// call the function by passing array, size and maximum value + 1
countSort(arr,n,find_max(arr,n)+1);

printf("Array after sorting : ");

for(int i=0;i<n;i++)
printf("%d ",arr[i]);
printf("\n");

return 0;
}
