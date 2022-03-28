#include<stdio.h>

int main(){
	{
		extern char *str;
		printf("%s\n", str); /* OK */
	}
	/*printf("%s\n", str); /* error */ /*str의 참조를 유지하지 않기 때문*/ 
	return 0;
} 
char *str="smile on your face";
