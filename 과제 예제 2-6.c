#include <stdio.h>

int main()
{
	char name[20];
	int age;
	char gender;
	
	printf("�̸�, ����, ����(M/F) ������ �Է��ϼ���.\n");
	scanf("%s %d %c", name, &age, &gender);
	printf("�̸�: %s\n", name);
	printf("����: %d\n", age);
	printf("����: %c\n", gender);
	printf("8�� 31�� ������, ���� 4:28:04, 20204133, ������");
	return 0;
}
