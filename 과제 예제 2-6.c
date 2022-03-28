#include <stdio.h>

int main()
{
	char name[20];
	int age;
	char gender;
	
	printf("이름, 나이, 성별(M/F) 순으로 입력하세요.\n");
	scanf("%s %d %c", name, &age, &gender);
	printf("이름: %s\n", name);
	printf("나이: %d\n", age);
	printf("성별: %c\n", gender);
	printf("8월 31일 월요일, 오후 4:28:04, 20204133, 이정원");
	return 0;
}
