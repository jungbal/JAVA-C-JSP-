#include<stdio.h>

int main(void)
{
	int num=0;
	int sum=0;
	int i;
	
	printf("정수 5개를 입력하세요: ");
	for(i=0;i<5;i++)
	{
		scanf("%d", &num);
		sum+=num;
	}
	printf("합계: %d\n", sum);
	
	printf("2020-09-14,02:56,20204133,이정원");
	
	return 0;
}
