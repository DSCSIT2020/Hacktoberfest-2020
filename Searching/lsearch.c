#include<stdio.h>
int main()
{
    int a[100],loc=0,n,item,k=0,flag=0,i;
    printf("Enter the size of an array");
    scanf("%d",&n);
    printf("Enter the element of an array");
    for(i=0;i<n;i++) scanf("%d",&a[i]);
    printf("Enter the element to be searched");
    scanf("%d",&item);
    while(k<=n)
    {
        if(item==a[k])
        {
            loc=k;
            k=k+1;
            flag=1;
            break;
        }
    }
    if(flag==1)
    {
        printf("The searched item's location is %d",loc);
    }
    else
    {
        printf("The searched item not found");
    }
    return 0;
}
