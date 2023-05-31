#include<stdio.h>
#include<conio.h>

void selectionsort(int arr[], int n)
{
    for(int i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]>arr[j])
            {
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
}

void main()
{
    int arr[]={23,15,29,11,1};
    int n=sizeof(arr)/sizeof(arr[0]);
    
    printf("\narray before sorting");
    for(int i=0;i<n;i++)
    {
        printf("\t%d",arr[i]);
    }
    
    selectionsort(arr,n);
    printf("\nsorted array");
    for(int i=0;i<n;i++)
    {
        printf("\t%d",arr[i]);
    }
        
}