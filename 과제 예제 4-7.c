#include<stdio.h>

int main(void)
{
	int items=0;
	int pages=0;
	int items_per_page=0;
	
	printf("�׸��? ");
	scanf("%d", &items);
	
	printf("�� ������ �� �׸��? ");
	scanf("%d", &items_per_page);
	
	pages=items/items_per_page;
	items%=items_per_page;
	printf("%d �������� %d �׸�\n", pages, items);
	
	printf("2020-09-12,23:18,20204133,������");
	
	return 0;
 } 
