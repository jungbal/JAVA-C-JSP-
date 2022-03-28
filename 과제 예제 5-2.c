#include<stdio.h>

int main(void)
{
	int score;
	
	printf("퀴즈 점수를 입력하세요: ");
	scanf("%d", &score);
	
	if(score<70)
	printf("재시!!!\n");
	else
	printf("통과!!!\n");
	
	printf("2020-09-14,01:58,20204133,이정원");
	
	return 0;
}
