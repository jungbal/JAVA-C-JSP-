#include <stdio.h>

int main(void)
{
	int amount = 0, price = 0;
	const double VAT_RATE = 0.1;
	int total_price = 0;
	
	printf("����? ");
	scanf("%d", &amount);
	
	printf("�ܰ�? ");
	scanf("%d", &price);
	
	total_price = amount * price * (1 + VAT_RATE);
	printf("�հ�: %d��\n", total_price);
	
	//VAT_RATE = 0.15;
	printf("2020-09-11,19:55,20204133,������");
	
	return 0;
}
