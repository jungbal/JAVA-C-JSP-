#include<stdio.h>

int main(void)
{
	int a, b;
	char op;
	char yesno='Y';
	
	while(yesno=='Y'||yesno=='y')
	{
		printf("����? ");
		scanf("%d %c %d", &a, &op, &b);
		
		switch(op) {
			case'+':
				printf("%d+%d=%d\n", a, b, a+b);
				break;
				case'-':
					printf("%d-%d=%d\n", a, b, a-b);
					break;
					case'*':
						printf("%d*%d=%d\n", a, b, a*b);
						break;
						case'/':
							if(b!=0)
							printf("%d/%d=%.2f\n", a, b, (double)a/b);
							else printf("0���� ���� �� �����ϴ�.\n");
							break;
							default:
								printf("�߸��� �����Դϴ�.\n");
								break;
		} 
		printf("�Լ� �Ͻðڽ��ϱ�(Y/N)? ");
		scanf(" %c", &yesno); 
	}
	printf("2020-09-14,16:40,20204133,������");
	
	return 0;
}
