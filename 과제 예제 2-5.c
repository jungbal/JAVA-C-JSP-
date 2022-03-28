#include <stdio.h>

int main()
{
	int num;
	
	printf("정수? ");
	scanf("%d", &num);
	
	printf("10진수 %d는 16진수 %x입니다\n", num, num);
	printf(" 8월 31일 월요일, 오후 4:22:42, 20204133, 이정원"); 
	return 0; 
}
