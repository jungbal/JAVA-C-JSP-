#include <stdio.h>
int main(void)
{
	int A;
	int B;
	int C;
	
	printf("A를 입력하세요");
	scanf("%d", &A);
	printf("B를 입력하세요");
	scanf("%d", &B);
	printf("C를 입력하세요");
	scanf("%d", &C);
	
	int max;
	int mid;
	int min;
	
	printf("가장큰수: %d, 중간수: %d, 가장작은수: %d", max=A>B?A:C%B, mid=B>C?B:A%C, min=B>A?B:C%A);
	
	return 0; 
 } 
