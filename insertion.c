#include<stdio.h>
void insertion(int a[],int n)
{
    int i,key,j;
    for(i=1;i<n;i++)
    {
        key=a[i];
        j=i-1;
        while(j>=0 && a[j]>key)
        {
            a[j+1]=a[j];
            j=j-1;
        }
        a[j+1]=key;
    }
}
void main()
{
    int n,i;
    printf("Enter no. of element");
    scanf("%d",&n);
    int a[n];
    printf("Enter the element");
    for(i=0;i<n;i++) scanf("%d",&a[i]);
    insertion(a,n);
    for(i=0;i<n;i++) printf("%d ",a[i]);
}
