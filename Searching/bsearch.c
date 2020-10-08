#include<stdio.h>
int main()
{
    int a[100],lb,end,mid,item,i,ub,beg=0,n,loc;
    printf("Enter the size of an array");
    scanf("%d",&n);
    printf("Enter the element of an array");
    for(i=0;i<n;i++) scanf("%d",&a[i]);
    end=n-1;
    mid=(beg+end)/2;
    printf("Enter the item to be searched");
    scanf("%d",&item);
    while(beg<=end && a[mid]!=item)
    {
        if(item<a[mid])
        {
            end=mid-1;
        }
        else
        {
            beg=mid+1;
        }
        mid=(beg+end)/2;
    }
    if(a[mid]==item)
    {
        loc=mid;
        printf("The searched item %d in location %d",item,loc+1);
    }
    else
    {
        printf("Item not found");
    }
}
