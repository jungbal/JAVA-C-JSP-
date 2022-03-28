#include <stdio.h>
#include <limits.h>
#include <float.h>

int main(void)
{
	char a = CHAR_MAX;
	char b = CHAR_MAX + 1;
	short c = SHRT_MAX;
	short d = SHRT_MAX + 1;
	int e = INT_MAX;
	int f = INT_MAX + 1;
	float g = FLT_MAX;
	float h = FLT_MAX * 10;
	
	printf("a = %d, b = %d\n", a, b);
	printf("c = %d, d = %d\n", c, d);
	printf("e = %d, f = %d\n", e, f);
	printf("g = %30.25e, h = %30.25e\n", g, h);
	
	printf("2020-09-11,19:53,20204133,ÀÌÁ¤¿ø");
	
	return 0;
}
 
