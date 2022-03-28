#include <stdio.h>

void draw_line(char ch, int len)
{
	int i;
	for(i=0;i<len;i++)
	printf("%c", ch);
	printf("\n");
}

int main(void)
{
	int amount=10;
	int price=1000;
	int total=amount*price;
	int width;
	
	draw_line('-', 30);
	
	printf("수량 단가 합계\n");
	width=3+8+8+2;
	draw_line('*', width);
	printf("%3d %8d %8d\n", amount, price, total);
	
	draw_line('-', 30);
	
	printf("2020-09-14,17:32,20204133,이정원");
	
	return 0;
}
