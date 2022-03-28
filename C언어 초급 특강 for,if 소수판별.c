#include <stdio.h>
int main(void){
	int a,b,c=0;
	scanf("%d", &a);
    for(b=1;b<=a;b++){
	if(c>2){
		break;
	}
	if(a%b==0){
		c+=1;
	}
	}
	if(c==2){
		printf("소수입니다.");
	}
	else{
		printf("소수가 아닙니다.");
	} 
	return 0;} 
