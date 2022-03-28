#include<stdio.h> 

int main(void)
{
	int x=0, y=0;
	
	printf("두 개의 정수를 입력하세요:");
	scanf("%d %d", &x, &y);
	
	printf("+%d=%d\n", x, +x);
	printf("-%d=%d\n", y, -y);
	printf("%d+%d=%d\n", x, y, x+y);
	printf("%d-%d=%d\n", x, y, x-y);
	printf("%d*%d=%d\n", x, y, x*y);
	printf("%d/%d=%d\n", x, y, x/y);
	printf("%d%%%d=%d\n", x, y, x%y);
	
	printf("2020-09-11,20:02,20204133,이정원");
	
	return 0; 
}
