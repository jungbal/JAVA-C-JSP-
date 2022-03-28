#include<stdio.h>

int main(void)
{
	int width, height;
	char ch;
	int i, j;
	
	printf("직사각형의 폭과 높이? ");
	scanf("%d %d", &width, &height);
	printf("직사각형을 그릴 문자? ");
	scanf(" %c", &ch);
	
	for(i=0;i<height;i++)
	{
		for(j=0;j<width;j++)
		printf("%c", ch);
		printf("\n");
	}
	printf("2020-09-14,03:01,20204133,이정원");
	
	return 0;
}
