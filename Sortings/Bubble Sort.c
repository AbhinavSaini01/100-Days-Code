#include<stdio.h>
#include<conio.h>
void bubblesort(int arr[],int n)
{
    for(int i=0;i<=n-1;i++)
    {
        for(int j=0;j<=n-1-i;j++)
        {
            if(arr[j]>arr[j+1])
            {
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            }
                
        }
    }
}
void main()
{
    int arr[]={23,85,29,63,1};
    int n=sizeof(arr)/sizeof(arr[0]);
    int i,j,temp;
    
    printf("\narray before sorting");
    for(i=0;i<=n;i++)
    {
        printf("\t%d",arr[i]);
    }
    
    
    bubblesort(arr,n);
    printf("\nsorted array");
    for(int i=0;i<=n;i++)
    {
        printf("\t%d",arr[i]);
    }
    
}