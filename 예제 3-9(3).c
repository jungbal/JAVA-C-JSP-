#include <stdio.h>

int main(void)
{
	int amount;
	int price = 0;
	int total_price = 0;
	
	printf("amount = &d, price = %d\n", amount, price);
	
	printf("수량? ");
	scanf("%d", &amount);
	
	price = 2000;
	
	total_price = amount * price;
	printf("합계: %d원\n", total_price);
	
	return 0;
 } 
