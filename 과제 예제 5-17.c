#include<stdio.h>

int main(void)
{
	int a, b;
	char op;
	char yesno;
	
	do{
		printf("����? ");
		scanf("%d %c %d", &a, &op, &b);
		
		switch(op) {
			case'+':
				printf("%d=%d=%d\n", a, b, a+b);
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
							else
							printf("0���� ���� �� �����ϴ�.\n");
							break;
							default:
								printf("�߸��� �����Դϴ�.\n");
								break;
		}
		printf("��� �Ͻðڽ��ϱ�(Y/N)? ");
		scanf(" %c", &yesno);
	} while(yesno=='Y'||yesno=='y');
	printf("2020-09-14,16:50,20204133,������");
	
	return 0; 
}
