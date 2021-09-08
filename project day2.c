#include<stdio.h>
#include<stdlib.h>
struct Node{
	int value;
	struct Node*link;
};
void insert(struct Node*link, int value)
{
	struct Node *cur = link;
	struct Node *newNode = malloc(sizeof(struct Node));
	newNode->value = value;
	newNode->link = NULL;
	
}
int main (void){
	int num;
	int b;
	struct Node *head = NULL;
    while(1){
	printf("-------메뉴-------");
	printf("1.삽입 2.삭제 3.연산 4.종료\n");
	printf("번호를 입력하세요:");
	scanf("%d", &num);
	if(num==4)
	return;
	switch(num){
		case 1:
			printf("1.삽입\n");
            insert(&head, b);
			break;
			case 2:
			printf("2.삭제\n");
			break;
			case 3:
			printf("3.연산\n");
			break;
			case 4:
			printf("4.종료\n"); 
			break; 
			default :
				printf("%d는 잘못된 번호입니다. \n", num);
	}
}
	}
  
