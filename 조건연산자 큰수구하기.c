#include<stdio.h>
int main(void){
	int a,b,c,max;
	scanf("%d %d %d", &a, &b, &c);
	printf("%d", max=a>b?(a>b?a:c):(b>c?b:c));
	return 0;
}
