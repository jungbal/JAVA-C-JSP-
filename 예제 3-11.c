#include <stdio.h>
#define PI 3.14
int main(void)
{
	double radius = 0;
	double area = 0;
	
	printf("������? ");
	scanf("%lf", &radius);
	
	area = PI * radius * radius;
	printf("���� ����: %.2f\n", area);
	printf("PI = %.2f\n", PI);
	
	printf("2020-09-11,19:51,20204133,������");
	
	return 0; 
}
