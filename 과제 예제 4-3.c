#include<stdio.h>

int main(void)
{
	int items=0;
	int pages=0, left=0;
	int items_per_page=0;
	
	printf("�׸��? ");
	scanf("%d", &items);
	
	printf("�� ������ �� �׸��? ");
	scanf("%d", &items_per_page);
	
	pages=items/items_per_page;
	left=items%items_per_page;
	printf("%d �������� %d �׸�\n", pages, left);
	
	printf("2020-09-12,23:09,20204133,������");
	
	return 0; 
 } 
