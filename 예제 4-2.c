#include <stdio.h>

int main(void)
{
	double x=0, y=0;
	
	printf("�� ���� �Ǽ��� �Է��ϼ��� : ");
	scanf("%lf %lf", &x, &y);
	
	printf("+%f = %f\n", x, +x);
	printf("-%f = %f\n", y, -y);
	printf("%f + %f = %f\n", x, y, x + y);
	printf("%f - %f = %f\n", x, y, x - y);
	printf("%f * %f = %f\n", x, y, x * y);
	printf("%f / %f = %f\n", x, y, x / y);
	//printf("%f %% %f = %f\n", x, y, x %y); // ������ ���� 
	
	printf("2020-09-11,20:06,20204133,������");
	
	return 0;
} 
