#include<stdio.h>

int main(){
	register int a;
	register int b;
	
	a=5;
	b=a*3;
	
	printf("a=%d, b=%d\n", a, b);
	return 0;
} 
