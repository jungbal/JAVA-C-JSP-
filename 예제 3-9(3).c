#include <stdio.h>

int main(void)
{
	int amount;
	int price = 0;
	int total_price = 0;
	
	printf("amount = &d, price = %d\n", amount, price);
	
	printf("����? ");
	scanf("%d", &amount);
	
	price = 2000;
	
	total_price = amount * price;
	printf("�հ�: %d��\n", total_price);
	
	return 0;
 } 
