#include<stdio.h>

int main(void)
{
	int width, height;
	char ch;
	int i, j;
	
	printf("���簢���� ���� ����? ");
	scanf("%d %d", &width, &height);
	printf("���簢���� �׸� ����? ");
	scanf(" %c", &ch);
	
	for(i=0;i<height;i++)
	{
		for(j=0;j<width;j++)
		printf("%c", ch);
		printf("\n");
	}
	printf("2020-09-14,03:01,20204133,������");
	
	return 0;
}
