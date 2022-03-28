#include <stdio.h> // printf �Լ�, scanf �Լ��� ����ϱ� ���ؼ� 
#include <stdlib.h> // srand �Լ�, rand �Լ��� ����ϱ� ���ؼ� 
#include <time.h> // time �Լ��� ����ϱ� ���ؼ� 
#define LIMIT 10 // �ִ� ��ȸ�� 10�� 

int main(void)
{
	int question[3], answer[3];
	int i=1, check, retry, strike=0, ball;
	// ���� �߻��� ���� �� ���� 
	srand((unsigned int)time(NULL));
	// 3���� ������ �ߺ����� �߻��ϰ� ���� ���
	// ù ���ڴ� ������ �ߺ� ���� 
	question[0]=rand()%10; // 0~9 ������ ���� �� ���� 
	while(i<3) {
		question[i]=rand()%10; // 0~9 ������ ���� �� ���� 
		// question[i]�� ����� ���� �̹� �߻��� ���� �ߺ��� �ֳ� üũ 
		for(check=0;check<i;check++){ // ������ ������� ���� �ߺ��ȴٸ� �ݺ��� �ߴ� 
			if(question[check]==question[i]) 
			break; // �ߺ��� ���� ��� ���� ���ڸ� ã�� 
		}
		if(check == i) i ++;
	}
	
	printf("���� ����!\n");
	// 10ȸ �õ��� �ϰų� ��Ʈ����ũ�� 3ȸ ������ �����Ѵ�. 
	for(retry= 0;retry<LIMIT&&strike<3;retry++){
		printf("[%d��° �õ�] 3���� ���� ����: ", retry+1);
		scanf_s("%d %d %d", &answer[0], &answer[1], &answer[2]);
		
		strike=ball=0;
		for(i=0;i<3;i++){
			for(check=0;check<3;check++){ // question�� answer�� ���� ���� �ִ��� ã�´� 
				if(question[i]==answer[check]){
					//���� ���� ���� ��ġ�� ������ ��Ʈ����ũ�̰�
					//���� ���� �ٸ� ��ġ�� ������ ���Դϴ�. 
					if(i==check) strike++;
					else ball++;
				}
			}
		} //��Ʈ�� ��� 
		printf("�������: %d ��Ʈ����ũ, %d ��!\n\n", strike, ball); 
	}
	// ���� ���θ� ����Ѵ�. 
	if(strike==3) printf("�ʰ� �̰���ϴ�!\n");
	else printf("�ʰ� �����ϴ�\n");
	
	return 0;
 } 
