#include<stdio.h>
#include<stdlib.h>

struct node
{
  int data;
  struct node *next;
};
typedef struct node nodep;
nodep *front,*rear;

void assign()
{
  front=NULL;
  rear=NULL;
}
void push()
{
  nodep *temp=(struct node*) malloc(sizeof(struct node));
  int data;
  printf("\n Enter data: ");
  scanf("%d",&data);
  temp->data=data;
  temp->next=NULL;
  if(rear==NULL)
      front=rear=temp;
  else
    {
      rear->next=temp;
      rear=temp;
    }
}

void pop()
{
  nodep *temp;
  int x=front->data;
  if(front==NULL)
    printf("\n UNDERFLOW");
  else
    {
      temp=front;
      front=front->next;
      free(temp);
      printf("\n Deleted item is %d\n\n",x);
    }
}

void display()
{
  nodep *temp;
  temp=front;
  while(temp!=NULL)
  {
    printf("%d\t",temp->data);
    temp=temp->next;
  }
}
////////////////////////////////////
/*

void queue::add(int x)
{ student *temp=new student;
  temp->seatno=x;
  temp->next=NULL;
   if(rear==NULL)
      front=rear=temp;
   else
     { rear->next=temp;
       rear=temp;
     }
}
int queue::remove()
{ student *temp;
  int x=front->seatno;
  if(rear==NULL)
    cout<<"\n UNDERFLOW";
  else
   { temp=front;
     front=front->next;
     delete temp;

   }
   return x;
}
void queue::disp()
{ student *temp;
  temp=front;
    while(temp!=NULL)
      { cout<<temp->seatno<<"\t";
	temp=temp->next;

      }

}
*/
////////////////////////////////////////////

int main()
{
  int ch;
  do
  {
    printf("\n Enter the choice");
    printf("\n 1.Push");
    printf("\n 2.Pop");
    printf("\n 3.Display");
    printf("\n 4.EXIT\n");
    scanf("%d",&ch);

    if(ch==1)
      push();
    else if(ch==2)
      pop();
    else if(ch==3)
      display();
    else
      exit(0);
  } while(ch>0 && ch<5);
}
