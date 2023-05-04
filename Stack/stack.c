#include<stdio.h>
#include<conio.h>
#define ARR 10

typedef struct stack
{
    int a[ARR];
    int top;
}STK;

void init_stack(STK *);
void push(STK *, int item);
int pop(STK*);

void main()
{
    STK s;
    int i;
    
    init_stack(&s);
    
    push(&s,11);
    push(&s,12);
    push(&s,13);
    push(&s,14);
    push(&s,15);
    push(&s,16);
    push(&s,17);
    push(&s,18);
    push(&s,19);
    push(&s,20);
    
    i=pop(&s);
    printf("\n item popped : %d",i);
    
    i=pop(&s);
    printf("\n item popped : %d",i);
    
    i=pop(&s);
    printf("\n item popped : %d",i);
    
    i=pop(&s);
    printf("\n item popped : %d",i);
    
    i=pop(&s);
    printf("\n item popped : %d",i);
}


void init_stack(STK *s)  /* Initialization of the Stack */
{
    s->top=-1;  //stack is empty
}


void push(STK *s,int item)  /* Adds element to the stack */
{
    if(s->top==ARR-1)
    {
        printf("\nstack is full");
        return;
    }
    s->top++;
    s->a[s->top]=item;
}


int pop(STK*s)  /*Removes an element from the stack */
{
    int item;
    if(s->top==-1)
    {
        printf("\nstack is empty");
        return NULL;
    }
    item=s->a[s->top];
    s->top--;
    return item;
}