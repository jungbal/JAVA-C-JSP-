#include <stdio.h>
int main(void)
{
	int a;
	for(a=1;a<101;a++){
		if(a*=4==0)
		printf("4�ǹ����: %d", a);
	}
	return 0; 
}
