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
	printf("8월 31일 월요일, 오후 4:13:51, 20204133, 이정원");
	return 0;
 } 
