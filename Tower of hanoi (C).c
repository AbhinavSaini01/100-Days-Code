#include<stdio.h>
#include<conio.h>

void TOH(char a, char b, char c, int n)
{
    if(n==1)
    {
        printf("\nmove disk form %c to %c",a,b);
        return;
    }
    
    else 
    {
        TOH(a,c,b,n-1);
        printf("\nmove disk %c to %c",a,b);
        TOH(c,b,a,n-1);
    }
}

void main()
{
    int n;
    char a,b,c;
    void TOH(char,char,char,int);
    
    printf("\nEnter number of disk");
    scanf("%d",&n);
    TOH('a','b','c',n);
}
