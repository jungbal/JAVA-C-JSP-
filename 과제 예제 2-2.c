#include <stdio.h>

int main()
{
	int num;  
	float x;  
	char ch; 
	
	num=123;  
	x=1.23;  
	ch='A';  
	
	printf("%d %x\n", num, num); 
	printf("%f %e\n", x, x);
	printf("%c\n", ch);
	
	printf("%x\n", num);
	printf("%X\n", num);
	printf("%#x\n", num);
	printf("%#X\n", num);
	printf("8�� 31�� ������, ���� 4:08:48, 20204133, ������");
	return 0;
 } 
