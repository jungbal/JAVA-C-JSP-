#include<stdio.h>

void double_it(int num)
{
	num*=2;
}

int double_this(int num)
{
    return num*2;
}
	int main(void)
	{
		int x=5;
		
		double_it(x);
		printf("double_it 호출 후 : x=%d\n", x);
		
		x=double_this(x);
		printf("double_this 호출 후 : x=%d\n", x);
		
		printf("2020-09-14,20:53,20204133,이정원");
		
		return 0; 
	}

