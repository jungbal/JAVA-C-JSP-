#include<stdio.h>

void print_count(void);
void increment(void);
void decrement(void);

int count;

int main(void)
{
	int i;
	
	count=0;
	print_count();
	
	for(i=0;i<3;i++)
	increment();
	print_count();
	
	for(i=0;i<3;i++)
	decrement();
	print_count();
	
	printf("2020-09-14,21:00,20204133,ÀÌÁ¤¿ø");
	
	return 0;
}

void print_count(void)
{
	printf("count=%d\n", count);
 } 
 
 void increment(void)
 {
 	count++;
 }
 
 void decrement(void)
 {
 	count--;
 }
