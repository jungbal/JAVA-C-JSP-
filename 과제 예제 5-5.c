#include<stdio.h>

int main(void)
{
	int age, fee;
	
	printf("나이? ");
	scanf("%d", &age);
	
	if(age<8){
		fee=0;
	}
	else if(age>=65) {
		fee=5000;
	}
	else{
		fee=10000;
	}
	printf("입장료: %d원\n", fee);
	
	printf("2020-09-14,02:16,20204133,이정원");
	
	return 0; 
}
