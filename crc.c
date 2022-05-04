#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>

int binToInt(char *msg){
	int i, k, len, num=0;
	len = strlen(msg);
	k = 0;
	for(i = len-1; i>=0; i--){
		num += pow(2,k) * (msg[i]-48);
		k++;
	}
	return num;
}

void intToBin(int n, char *num){
	char temp[32];
	int i=0, j;
	while(n!=0){
		temp[i] = (char)((n%2) + 48);
		n = n/2;
		i++;
	}
	i--;
	for(j = 0; i>=0 ; j++){
		num[j] = temp[i];
		i--;
	}
	num[j] = '\0';
}

int main(void){
	char msg[32], divisor[8], rem[32];
	int msgNum, dNum, r;
	printf("Enter bit message: ");
	scanf("%s", msg);
	printf("Enter divisor: ");
	scanf("%s", divisor);
	msgNum = binToInt(msg);
	dNum = binToInt(divisor);
	r = msgNum%dNum;
	intToBin(r, rem);
	printf("Remainder = %s\n", rem);
	strcat(msg, rem);
	printf("After addition: %s\n", msg);
	msgNum = binToInt(msg);
	printf("AfAD: %d\n", msgNum);
	r = msgNum%dNum;
	printf("Remainder = %d\n", r);
	bzero(&rem, sizeof(rem));
	intToBin(r, rem);
	printf("Remainder = %s\n", rem);
	return 0;
}

/*
1010001101
110101
*/
