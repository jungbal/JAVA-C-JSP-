#include <stdio.h>
int main(void)
{
	int sum=0;
	int a;
	for(a=1;a<101;a++){
		if(a%4==0)
		sum=sum+a;
	} printf("4�� ����� ��: %d", sum);
	return 0;
 } 
