#include <stdio.h>

int main()
{
	int num=12345;
	
	printf("%d\n", num);
	printf("%d\n", num*10);
	printf("%d\n", num*100);
	printf("%d\n", num*1000);
	
	printf("%8d\n", num);
	printf("%8d\n", num*10);
	printf("%8d\n", num*100);
	printf("%8d\n", num*1000);
	printf("%8d\n", num*100000);
	
	printf("%08d\n", num);
	printf("8�� 31�� ������, ���� 4:13:51, 20204133, ������");
	return 0;
 } 
