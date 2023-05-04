#include<stdio.h>
#include<conio.h>


typedef struct lklist
{
    int data;
    struct lklist *link;
}node;

void push(node**,int);
int pop(node**);
void delstack(node**);

void main()
{
    node*s=NULL;
    int i;
    
    push(&s,10);
    push(&s,11);
    push(&s,12);
    push(&s,13);
    push(&s,14);
    push(&s,15);
    push(&s,16);
    push(&s,17);
    
    i=pop(&s);
    printf("\n item popped : %d",i);
    
    i=pop(&s);
    printf("\n item popped : %d",i);
    
    i=pop(&s);
    printf("\n item popped : %d",i);
    
    delstack(&s);
    
}

void push(node**top,int item)
{
    node*temp;
    temp=(node*) malloc(sizeof(node));
    
    if(temp==NULL)
    {
        printf("\nstack is full");
    }
    temp->data=item;
    temp->link=*top;
    *top=temp;
}

int pop(node**top)
{
    node*temp;
    int item;
    
    if(*top==NULL)
    {
        printf("\nstack is empty");
        return NULL;
    }
     
    temp=*top;
    item=temp->data;
    *top=(*top)->link;
    
    free(temp);
    return item;
}

void delstack(node**top)
{
    node*temp;
    
    if(*top==NULL)
    {
        return;
    }
    
    while(*top!=NULL)
    {
        temp=*top;
        *top=(*top)->link;
        free(temp);
        
    }
}