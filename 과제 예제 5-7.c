#include<stdio.h>

int main(void)
{
	int a, b;
	char op;
	
	printf("수식? ");
	scanf("%d %c %d", &a, &op, &b);
	
	if(op=='+') {
		printf("%d+%d=%d\n", a, b, a+b);
	}
	else if(op=='-') {
		printf("%d-%d=%d\n", a, b, a-b);
	}
	else if(op=='*') {
		printf("%d*%d=%d\n", a, b, a*b);
	}
	else if(op=='/') {
		if(b!=0)
		printf("%d/%d=%.2f\n", a, b, (double)a/b);
		else
		printf("0으로 나눌 수 없습니다.\n");
	}
	else {
		printf("잘못된 수식입니다.\n");
	}
	printf("2020-09-14,02:33,20204133,이정원");
	
	return 0; 
}
