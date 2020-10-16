#include<stdio.h>
#include<stdlib.h>

struct node
{
  int data;
  struct node *left;
  struct node *right;
};

typedef struct node nodep;

nodep *root;

nodep *insert()
{
  int x;
  nodep *new=(struct node*)malloc(sizeof(struct node));

  printf("\n ENter the data (-1 for exit) : ");
  scanf("%d",&x);

  if(x==-1)
    return NULL;

  new->data=x;
  printf("\n Enter the Left node :");
  new->left=insert();

  printf("\n Enter the Right Node :");
  new->right=insert();

  return new;
}

void printtree()
{

}

nodep del(nodep *top)
{
  if(top!=NULL)
  {
    del(top->left);
    printf("\t %d",top->data);

    del(top->right);

  }
}

int main()
{
  //nodep *root;
  char ch;
  while(1)
  {
    printf("\n Enter your choice :");
    printf("\n 1.Insert  ");
    printf("\n 2.Delete ");
    printf("\n 3.Print");
    printf("\n Anything to exit");
    scanf("%d",&ch);

    if(ch==1)
      root=insert();

    else if(ch==2)
      del(root);

    else if(ch==3)
      printtree();

    else
      exit(0);
  }

}
