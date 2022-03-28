#include<stdio.h>

void dummy()
{
	int y=456;
	printf("y=%d\n", y);
	y--;
}

int main(void)
{
	int i;
	for(i=0;i<3;i++)
	dummy();
	for(i=0;i<3;i++)
	{
		int x=123;
		printf("x=%d\n", x);
		x++;
	}
	printf("2020-09-14,20:49,20204133,ÀÌÁ¤¿ø");
	
	return 0;
}
