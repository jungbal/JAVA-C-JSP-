#include<stdio.h>

int main(void)
{
	int menu;
	char filename[32]="test.avi";
	
	while(1)
	{
		printf("1.파일 열기\n");
		printf("2.재생\n");
		printf("3.재생 옵션\n");
		printf("선택: ");
		
		scanf("%d", &menu);
		switch(menu) {
			case 1:
				printf("재생할 파일 이름? ");
				scanf("%s", filename);
				break;
				case 2:
					printf("%s를 재생합니다.\n", filename);
					break;
					case 3:
						printf("재생 옵션을 선택합니다.\n");
						break;
						default:
							printf("잘못 선택하셨습니다.\n");
							break;
		} 
	}
	printf("2020-09-14,16:56,20204133,이정원");
	
	return 0;
}
