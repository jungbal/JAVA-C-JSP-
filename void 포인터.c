#include <stdio.h>
#include <stdlib.h>

int main()
{
	void *ptr=malloc(100);
	
	printf("%d\n", *(int *)ptr);
	
	printf("%d\n", *((int *)ptr+1));
	printf("%d\n", *((int *)ptr-1));
	
	
	
	return 0;
 } 
