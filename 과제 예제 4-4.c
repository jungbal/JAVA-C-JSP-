#include<stdio.h>
#define PI 3.141592

int main(void)
{
	int radius=0;
	double area, perimeter;
	
	printf("������? ");
	scanf("%d", &radius);
	
	area=PI*radius*radius;
	printf("���� ����: %.2f\n", area);
	
	perimeter=2*PI*radius;
	printf("���� �ѷ�: %.2f\n", perimeter);
	
	printf("2020-09-12,23:10,20204133,������");
	
	return 0;
 } 
