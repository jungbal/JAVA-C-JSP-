#include <stdio.h>

int main(void)
{
	int a = 0, b = 0;
	
	printf("두 개의 정수? ");
	scanf("%d %d", &a, &b);
	
	printf("%d > %d : %d\n", a, b, a > b);
	printf("%d < %d : %d\n", a, b, a < b);
	printf("%d >= %d : %d\n", a, b, a >= b);
	printf("%d <= %d : %d\n", a, b, a <= b);
	printf("%d == %d : %d\n", a, b, a == b);
	printf("%d != %d : %d\n", a, b, a != b);
	
	printf("2020-09-12,23:20,20204133,이정원");
	
	return 0;
}
