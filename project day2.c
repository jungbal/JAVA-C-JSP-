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
	printf("-------�޴�-------");
	printf("1.���� 2.���� 3.���� 4.����\n");
	printf("��ȣ�� �Է��ϼ���:");
	scanf("%d", &num);
	if(num==4)
	return;
	switch(num){
		case 1:
			printf("1.����\n");
            insert(&head, b);
			break;
			case 2:
			printf("2.����\n");
			break;
			case 3:
			printf("3.����\n");
			break;
			case 4:
			printf("4.����\n"); 
			break; 
			default :
				printf("%d�� �߸��� ��ȣ�Դϴ�. \n", num);
	}
}
	}
  
