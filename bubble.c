#include<stdio.h>
#include<stdlib.h>
void bubble(int a[],int n)
{
    int i,j;int temp;
    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-i-1;j++)
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
}
void main()
{
    int n,i;
    printf("Enter the no. of element");
    scanf("%d",&n); int a[n];
    printf("Enter the element");
    for(i=0;i<n;i++) scanf("%d",&a[i]);
    bubble(a,n);
    for(i=0;i<n;i++) printf("%d ",a[i]);
}
