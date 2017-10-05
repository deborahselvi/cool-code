#include<stdio.h>
#include<math.h>
void main()
{
int n,e,y;
printf("Enter the number:");
scanf("%d",n);
printf("Enter the exponent value:");
scanf("%d",e);
y=pow(n,e);
printf("%d power %d is %d",n,e,y);
}
