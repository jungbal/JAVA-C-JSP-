#include<stdio.h>

int main(void)
{
	int age, fee;
	
	printf("����? ");
	scanf("%d", &age);
	
	if(age>=8) {
		if(age>=65) {
			fee=5000;
		}
		else{
			fee=10000;
		}
	}
	else{
		fee=0;
	}
	printf("�����: %d��\n", fee);
	
	printf("2020-09-14,02:07,20204133,������");
	
	return 0;
}
