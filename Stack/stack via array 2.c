#define MAX 10
#include <stdio.h>

typedef struct stacktype
{
    int a[MAX];
    int top;
} STACK;
 
int isoverflow(STACK s)
{
    if (s.top == MAX - 1)
        return 1;
    else
        return 0;
}
int isunderflow(STACK s)
{
    if (s.top == -1)
        return 1;
    else
        return 0;
}
void push(STACK *stac, int item)
{
    stac->top = stac->top + 1;
    stac->a[stac->top] = item;
}
int pop(STACK *stac)
{
    int item;
    item = stac->a[stac->top];
    stac->top = stac->top - 1;
    return item;
}
int peep(STACK s)
{
    return s.a[s.top];
}
int main()
{
    STACK s;
    int choice, item;
    char ch;
    int isoverflow(STACK);
    int isunderflow(STACK);
    void push(STACK *, int);
    int pop(STACK *);
    s.top = -1;
    do
    {
        printf("Choose one of the following choices : \n");
        printf("1.Push the element onto stack\n");
        printf("2.Pop the element\n");
        printf("3.Peep Operation\n");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
        {
            if (isoverflow(s))
                printf("Stack is full!\n");
            else
            {
                printf("Enter the item to be pushed : ");
                scanf("%d", &item);
                push(&s, item);
            }
            break;
        }
        case 2:
        {
            if (isunderflow(s))
                printf("Stack is empty!\n");
            else
            {
                printf("The element which is popped out is %d ", pop(&s));
            }
            break;
        }
        case 3:
        {
            printf("The element through peep is %d ", peep(s));
            break;
        }
        default:
        {
            printf("Wrong choice!!");
            break;
        }
        }
        fflush(stdin);
        printf("\nDo you want to continue press Y for yes and N for no : ");
        scanf("%c", &ch);
     }while (ch == 'Y' || ch == 'y');
}