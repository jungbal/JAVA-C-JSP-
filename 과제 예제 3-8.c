#include <stdio.h>

int main(void)
{
	float x = 3.40282e38;
	float y = 1.17549e-38;
	
	printf("x=%30.25e\n", x);
	printf("y=%30.25e\n", y);
	
	x = x*100;
	printf("x=%30.25e\n", x);
	
	y = y/1000;
	printf("y=%30.25e\n", y);
	
	y = y/1000;
	printf("y=%30.25e\n", y);
	
	y = y/1000;
	printf("y=%30.25e\n", y);
	
	printf("2020-09-11,19:40,20204133,ÀÌÁ¤¿ø");
	
	return 0; 
	
}
