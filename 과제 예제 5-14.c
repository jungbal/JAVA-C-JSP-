#include<stdio.h>

int main(void)
{
	int num=0;
	int sum=0;
	int i=0;
	
	printf("정수 5개를 입력하세요: ");
	while(i<5)
	{
		
		scanf("%d", &num);
		sum+=num;
		i++; 
	}
	printf("합계: %d\n", sum);
	
	printf("2020-09-14,03:07,20204133,이정원");
	
	return 0;
}
