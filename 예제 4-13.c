#include <stdio.h>
int main(void)
{
	int items = 0;
	int pages = 0, left = 0;
	int items_per_page = 0;
	
	printf("항목수? ");
	scanf("%d", &items);
	
	printf("한 페이지 당 항목수? ");
	scanf("%d", &items_per_page);
	
	pages = items / items_per_page;
	left = items % items_per_page;
	pages = left > 0 ? pages + 1 : pages;
	printf("필요한 총 페이지수: %d\n", pages);
	printf("마지막 페이지의 항목수: %d\n", left > 0 ? left : items_per_page);
	     
	     printf("2020-09-12,23:52,20204133,이정원");
	     
    return 0;
}
