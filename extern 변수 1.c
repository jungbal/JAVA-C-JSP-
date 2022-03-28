#include<stdio.h>

extern char *str;
int main(){
	printf("%s\n", str);
	return 0;
}
char *str="smile on your face";
