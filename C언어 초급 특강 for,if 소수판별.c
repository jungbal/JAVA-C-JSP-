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
		printf("�Ҽ��Դϴ�.");
	}
	else{
		printf("�Ҽ��� �ƴմϴ�.");
	} 
	return 0;} 
