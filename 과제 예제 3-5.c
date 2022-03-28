#include <stdio.h>

int main(void)
{
	char ch, prev_ch, next_ch;
	
	printf("문자? ");
	scanf("%c", &ch);
	
	prev_ch = ch - 1;
	next_ch = ch + 1;
	printf("prev_ch = %c, %d, %#02x\n", prev_ch, prev_ch, prev_ch);
	printf("ch      = %c, %d, %#02x\n", ch, ch, ch);
	printf("next_ch = %c, %d, %#02x\n", next_ch, next_ch, next_ch);
	printf("2020-09-04, 22:53, 20204133, 이정원");
	
	return 0;
 } 
