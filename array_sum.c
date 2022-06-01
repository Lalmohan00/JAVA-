//write a program in c find the sum of all elements of array.

#include<stdio.h>
int main()
{
	int i=0,sum=0,a[5]={4,5,3,8,6};
	
	for(i=0;i<5;i++)
	{
		printf("%d\n",a[i]);
		
		sum=sum+a[i];
		printf("sum of all element of array=%d\n",sum);
		
	}
	return 0;
	
}