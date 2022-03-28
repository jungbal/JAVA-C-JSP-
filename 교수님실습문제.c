# include <stdio.h>

int main(void)
{
	A = 10, B = 10, C = 10;
	A = ++A + B-- + C++;
	
	printf("%d", ++A);
	printf("%d", A++);
	
	return 0;
} 
