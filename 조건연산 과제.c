#include <stdio.h>
int main(void)
{
	
	int A;
	int B;
	int C;
	
	printf("A�� �Է��ϼ���");
	scanf("%d", &A);
	printf("B�� �Է��ϼ���");
	scanf("%d", &B);
	printf("C�� �Է��ϼ���");
	scanf("%d", &C); 
	
	int max;
	int mid;
	int min;
	printf("����ū��: %d, �߰���: %d, ����������: %d", max=B>A?B:C%A, mid=C>A?C:B%A, min=C>B?C:A%B); 
	
	return 0; 
 } 
