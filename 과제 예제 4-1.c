#include<stdio.h> 

int main(void)
{
	int x=0, y=0;
	
	printf("�� ���� ������ �Է��ϼ���:");
	scanf("%d %d", &x, &y);
	
	printf("+%d=%d\n", x, +x);
	printf("-%d=%d\n", y, -y);
	printf("%d+%d=%d\n", x, y, x+y);
	printf("%d-%d=%d\n", x, y, x-y);
	printf("%d*%d=%d\n", x, y, x*y);
	printf("%d/%d=%d\n", x, y, x/y);
	printf("%d%%%d=%d\n", x, y, x%y);
	
	printf("2020-09-11,20:02,20204133,������");
	
	return 0; 
}
