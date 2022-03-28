#include<stdio.h>

int main(void)
{
	int items=0;
	int pages=0;
	int items_per_page=0;
	
	printf("항목수? ");
	scanf("%d", &items);
	
	printf("한 페이지 당 항목수? ");
	scanf("%d", &items_per_page);
	
	pages=items/items_per_page;
	items%=items_per_page;
	printf("%d 페이지와 %d 항목\n", pages, items);
	
	printf("2020-09-12,23:18,20204133,이정원");
	
	return 0;
 } 
