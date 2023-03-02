#include<stdio.h>
void main()
{
    int arr[5],digit,i,largestNumber,secondLargestNumber;
    for(digit=0;digit<5;digit++)
    {
        printf("Enter the %d element of the array: ",digit+1);
        scanf("%d",&arr[digit]);
    }
    for(i=0;i<5;i++)
    {
        if(arr[i]>largestNumber)
        {
            secondLargestNumber=largestNumber;
            largestNumber=arr[i];
        }
        else if(arr[i]>secondLargestNumber)
        {
            secondLargestNumber=arr[i];
        }
    }
    printf("The second largest number is %d",secondLargestNumber);
}