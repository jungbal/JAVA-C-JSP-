#include <stdio.h>

int main(void)
{
	int num = 0;
	int sum = 0;
	int a = 1;
	
	printf("�Ѱ��� ������ �Է��ϼ��� ");
	scanf("%d", &num);
	while(a<=num)
	{
		sum =sum+a;
		a++;
	 } 
	 printf("�հ�: %d\n", sum);
	 
	 return 0;
 } 
