#include<stdio.h>
#include<conio.h>
void main()
{
int n,i,sum=0;
printf("Enter the value of N");
scanf("%d",n);
for(i=0;i<=n;i++)
sum+=i;
printf("The sum of N numbers is %d",sum);
}
