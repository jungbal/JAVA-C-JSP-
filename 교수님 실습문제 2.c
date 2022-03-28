# include <stdio.h>

int main(void)
{
	int A, B, C;
	A = 10, B = 10, C = 10;
	A = ++A + B-- + C++;
	
	printf("%d", ++A);
	printf("%d", A++);
	
	return 0;
} 
