#include<stdio.h>

int main(){
	{
		extern char *str;
		printf("%s\n", str); /* OK */
	}
	/*printf("%s\n", str); /* error */ /*str�� ������ �������� �ʱ� ����*/ 
	return 0;
} 
char *str="smile on your face";
