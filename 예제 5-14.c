#include <stdio.h>

int main(void)
{
	int num = 0;
	int sum = 0;
	int a = 1;
	
	printf("한개의 정수를 입력하세요 ");
	scanf("%d", &num);
	while(a<=num)
	{
		sum =sum+a;
		a++;
	 } 
	 printf("합계: %d\n", sum);
	 
	 return 0;
 } 
