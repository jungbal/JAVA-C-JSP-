#include<stdio.h>

int main(void)
{
	int a, b;
	char op;
	
	printf("����? ");
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
		printf("0���� ���� �� �����ϴ�.\n");
	}
	else {
		printf("�߸��� �����Դϴ�.\n");
	}
	printf("2020-09-14,02:33,20204133,������");
	
	return 0; 
}
