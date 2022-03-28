#include <stdio.h>

int main(void)
{
	float A, B, C;
	A = 2.5F, B = 1.23F, C = 1.05F;
	
	A = B-- + ++C;
	printf("%f\n", A);
	printf("%f\n", B);
	printf("%f\n", C); 
	
	return 0;
 } 
