#include <stdio.h>

int main(void)
{
	int a,b;
	
	printf("���ڸ� �Է��ϼ���: ");
	scanf("%d", &a);
	
	for(b=2;b<a;b++){
		printf("%d %% %d = %d\n", a,b,a%b);
		if(a%b==0)
		break;
	} 
	
	if(b==a)
	printf("�Ҽ��̴�");
	else
	printf("�Ҽ��� �ƴϴ�");
	
	return 0; 
 } 
