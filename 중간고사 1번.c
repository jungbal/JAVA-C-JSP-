#include <stdio.h>

int main(void)
{
	int a;
	
	printf("정수를 입력하세요: ");
	scanf("%d", &a);
	
	if(a%2)
	printf("홀수\n");// 나머지가 있는 경우 홀수가  수행된다.
	else
	printf("짝수\n");//그렇지 않은경우 짝수가 수행된다.
	
	return 0; 
 } 
