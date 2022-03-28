#include<stdio.h>

int get_gcd(int x, int y)
{
	int r;
	while(y!=0) {
		r=x%y;
		x=y;
		y=r;
	}
	return x;
}

int main(void)
{
	int x, y;
	int gcd;
	
	while(1) {
		printf("정수 2개를 입력하세요. (0 0이면 종료): ");
		scanf("%d %d", &x, &y);
		if(x==0&&y==0)
		break;
		gcd=get_gcd(x, y);
		printf("%d와 %d의 GCD: %d\n", x, y, gcd);
	}
	printf("2020-09-14,20:34,20204133,이정원");
	
	return 0;
}
