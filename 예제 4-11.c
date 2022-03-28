#include <stdio.h>

int main(void)
{
	int x = 0x00000012;
	int y = x << 4;
	int z = x >> 4;
	
	printf("x = %#08x, %d\n", x, x);
	printf("y = %#08x, %d\n", y, y);
	printf("z = %#08x, %d\n", z, z);
	
	printf("2020-09-12,23:35,20204133,ÀÌÁ¤¿ø");
	
	return 0;
 } 
