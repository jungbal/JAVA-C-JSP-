#include<stdio.h>

int main(void)
{
	
	unsigned short x=0x12;
	unsigned short y=0xF0;
	
	printf("%08x&%08x=%08x\n", x, y, x&y);
	printf("%08x|%08x=%08x\n", x, y, x|y);
	printf("%08x^%08x=%08x\n", x, y, x^y);
	printf("~%08x=%08x\n", x, ~x);
	
	printf("2020-09-12,23:33,20204133,ÀÌÁ¤¿ø");
	
	return 0; 
 } 
