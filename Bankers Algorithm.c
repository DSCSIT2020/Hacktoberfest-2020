#include<stdio.h>
#define process 5
#define resource 3
int main()
{
    int i,j,k=0,count1=0,count2=0;
    int avail[resource]={1,0,2};
    int max[process][resource] ={0,0,4,2,0,1,1,3,7,8,4,2,1,5,7};
    int allot[process][resource]={0,0,2,1,0,0,1,3,5,6,3,2,1,4,3};
    int need[process][resource];
    int completed[process]={0};

    for(i=0;i<process;i++)
        for(j=0;j<resource;j++)
            need[i][j]= max[i][j]-allot[i][j];

    printf("\nPossible Sequence\n");
    while(count1 != process)
    {
        count2=count1;
        for(i=0;i<process;i++)
        {
            k=0;
            for(j=0;j<resource;j++)
            {
                if(need[i][j]<=avail[j])
                    k++;
            }

            if(k==resource && completed[i]==0)
            {
                printf("\tp[%d]",i);
                completed[i]=1;
                for(j=0;j<resource;j++)
                    avail[j] += allot[i][j];
                count1++ ;
            }
        }

        if(count1==count2)
        {
            printf("\nStop... Deadlock\n");
            return 0;
        }
    }
    printf("\nSafe Sequence exists");
    return 0;
}
