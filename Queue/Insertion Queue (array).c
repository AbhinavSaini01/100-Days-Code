#include<stdio.h>
#include<conio.h>
#define MAX 10


int insertqueue(int *a,int item,int*front,int*rear)
{
    if (*rear==MAX-1)
    {
        printf("\n Queue is full. ");
    }
    
    (*rear)++;
    a[*rear]=item;
    if(*front==-1)
    {
        *front=0;
    }
    
    return item;
}


void main()
{
    int a[MAX];
    int front=-1, rear=-1,i;
    
    i=insertqueue(a,20,&front,&rear);
    printf("\nitem inserted %d", i);
    
    i=insertqueue(a,22,&front,&rear);
    printf("\nitem inserted %d", i);
    
    i=insertqueue(a,24,&front,&rear);
    printf("\nitem inserted %d", i);
    
    i=insertqueue(a,26,&front,&rear);
    printf("\nitem inserted %d", i);
    
    i=insertqueue(a,28,&front,&rear);
    printf("\nitem inserted %d", i);
    
    i=insertqueue(a,30,&front,&rear);
    printf("\nitem inserted %d", i);
    
    i=insertqueue(a,32,&front,&rear);
    printf("\nitem inserted %d", i);
    
    i=insertqueue(a,34,&front,&rear);
    printf("\nitem inserted %d", i);
    
    i=insertqueue(a,36,&front,&rear);
    printf("\nitem inserted %d", i);
    
    i=insertqueue(a,38,&front,&rear);
    printf("\nitem inserted %d", i);

}
