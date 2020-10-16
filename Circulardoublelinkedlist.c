#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *prev;
    struct node *next;
} *head=NULL,*start=NULL;

typedef struct node nodep;

void push()
{
  nodep *nnode=(struct node*)malloc(sizeof(struct node));
  int data;
  printf("\n Enter the data : ");
  scanf(" %d",&data);
  nnode->data=data;

  if(head==NULL)
  {
    nnode->prev=nnode;
    head=nnode;
    nnode->next=nnode;
    //start=nnode;
  }
  else
  {
      nodep *temp=head->prev;
      nnode->next=head;
      nnode->prev=temp;
      temp->next=nnode;
      head->prev=nnode;
   }

    /*start->prev=nnode;
    head->next=nnode;
    nnode->next=head->next;
    nnode->prev=head;
    head=nnode;
    */
}
void pop()
{
  nodep *temp=head,*back;
  if(head==NULL)
    printf("\n Empty list \n");
  else
    {
      back=temp->prev;
      back->next=temp->next;
      head=back;
      free(temp);
    }
}

void display()
{
   nodep *temp=head->next;//start;//head;
   if(head == NULL)
      printf("\nList is Empty!!!\n");
  //else if(temp==head)
    //  printf("\n %d\n",head->data);
   else
   {
     printf("\n\n");
     while(temp!=head)
     {
       printf("-->%d",temp->data);
       temp=temp->next;
     }
     printf("-->%d",temp->data);
     printf("\n\n");
   }
}

void insert_after()
{
  nodep *nnode=(struct node*)malloc(sizeof(struct node));
  int data;
  printf("\n Enter the data : ");
  scanf(" %d",&data);
  nnode->data=data;

  nodep *temp=head->prev;
  nnode->next=head;
  nnode->prev=temp;
  temp->next=nnode;
  head->prev=nnode;
  head=nnode;

}
void prind()
{
  nodep *temp=head->next;
  //while(temp!=head)
  //{
      printf("temp->next : %p\n",temp->next);
      printf("temp->prev : %p\n\n",temp->prev);
      temp=temp->next;
  //}
}

void reverse()
{
  nodep *temp=head,*temp1;
    while(temp->next!=head)
    {
      temp1=temp->next;
      temp->next=temp->prev;
      temp->prev=temp1;
      temp=temp1;
    }
    head=temp;

}

void sort()
{
  nodep *temp=head,*back;
  int x;
  printf("\n Hey   ::::::::\n\n\n");
  while(temp->next!=head)
  {
    back=temp->next;
    while(back!=head->next)
    {
      if((temp->data)>(back->data))
      {
        x=temp->data;
        temp->data=back->data;
        back->data=x;
      }
      back=back->next;
    }
    temp=temp->next;

  }
}

int main()
{
  int ch;
  do {
    printf("\n Enter the choice");
    printf("\n 1.Push");
    printf("\n 2.Pop");
    printf("\n 3.Display");
    printf("\n 4.Insert after \n 5.Reverse_list \n 6.Sort");
    printf("\n 0.EXIT\n");
    scanf("%d",&ch);

    if(ch==1)
      push();
    else if(ch==2)
      pop();
    else if(ch==3)
      display();
    else if(ch==4)
      insert_after();
    else if(ch==5)
      reverse();
    else if(ch==6)
      sort();
    else if(ch==7)
      prind();
    else
      exit(0);
  } while(ch>0 && ch<8);
}
