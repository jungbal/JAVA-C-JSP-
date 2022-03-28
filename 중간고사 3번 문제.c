#include <stdio.h>

int main(void)
{
	int a,b;
	
	printf("숫자를 입력하세요: ");
	scanf("%d", &a);
	
	for(b=2;b<a;b++){
		printf("%d %% %d = %d\n", a,b,a%b);
		if(a%b==0)
		break;
	} 
	
	if(b==a)
	printf("소수이다");
	else
	printf("소수가 아니다");
	
	return 0; 
 } 
