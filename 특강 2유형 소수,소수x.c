#include <stdio.h>
int prime(void){
	int a,b,c=0;
	scanf("%d", &a);
	for(b=2;b<a;b++){
		if(a%b==0)
		c=1;
	}
	return c;
} 
int main(void){
	if(prime())
	printf("�Ҽ��� �ƴϴ�");
	else
	printf("�Ҽ��̴�");
	return 0; 
}
