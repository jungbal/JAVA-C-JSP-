#include <stdio.h> // printf 함수, scanf 함수를 사용하기 위해서 
#include <stdlib.h> // srand 함수, rand 함수를 사용하기 위해서 
#include <time.h> // time 함수를 사용하기 위해서 
#define LIMIT 10 // 최대 기회는 10번 

int main(void)
{
	int question[3], answer[3];
	int i=1, check, retry, strike=0, ball;
	// 난생 발생의 기준 값 설정 
	srand((unsigned int)time(NULL));
	// 3개의 난수를 중복없이 발생하고 싶은 경우
	// 첫 숫자는 무조건 중복 없음 
	question[0]=rand()%10; // 0~9 사이의 난수 값 생성 
	while(i<3) {
		question[i]=rand()%10; // 0~9 사이의 난수 값 생성 
		// question[i]에 저장된 값이 이미 발생된 값과 중복이 있나 체크 
		for(check=0;check<i;check++){ // 기존에 만들어진 값과 중복된다면 반복을 중단 
			if(question[check]==question[i]) 
			break; // 중복이 없는 경우 다음 숫자를 찾음 
		}
		if(check == i) i ++;
	}
	
	printf("게임 시작!\n");
	// 10회 시도를 하거나 스트라이크가 3회 나오면 종료한다. 
	for(retry= 0;retry<LIMIT&&strike<3;retry++){
		printf("[%d번째 시도] 3개의 숫자 선택: ", retry+1);
		scanf_s("%d %d %d", &answer[0], &answer[1], &answer[2]);
		
		strike=ball=0;
		for(i=0;i<3;i++){
			for(check=0;check<3;check++){ // question와 answer에 같은 값이 있는지 찾는다 
				if(question[i]==answer[check]){
					//같은 값이 같은 위치에 있으면 스트라이크이고
					//같은 값이 다른 위치에 있으면 볼입니다. 
					if(i==check) strike++;
					else ball++;
				}
			}
		} //힌트를 출력 
		printf("도전결과: %d 스트라이크, %d 볼!\n\n", strike, ball); 
	}
	// 성공 여부를 출력한다. 
	if(strike==3) printf("너가 이겼습니다!\n");
	else printf("너가 졌습니다\n");
	
	return 0;
 } 
