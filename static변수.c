#include<stdio.h>

void ShowCount(void){
	static int iCount=0;
	printf("iCount=%d\n", iCount++);
}
int main(){
	ShowCount();
	ShowCount();
	ShowCount();
	return 0;
}
