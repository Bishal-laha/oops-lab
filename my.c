#include<stdio.h>
#include<stdlib.h>


void main(){

	int arr[20],arr1[20],div[10],ans[20],quotient[20],temp;
	//taking divisor
	printf("enter the number\n");
	for(int i = 0;i<8;i++){
		scanf("%d",&arr[i]);
	}
	printf("enter the number\n");
	for(int i = 0;i<4;i++){
		scanf("%d",&div[i]);
	}
	for(int i = 8;i<12;i++){
		arr[i]=0;
	}
	for(int i = 0;i<8;i++){
		temp = i;
		if(arr[i] == 1){
			for(int j=0;j<4;j++){
				if(arr[temp] == div[j]){
					arr1[temp] = 0;
					ans[j] = 0;
				}else{
					arr1[temp] = 1;
					ans[j] = 1;
				}
				temp += 1;
			}
			quotient[i] = 1;
		}else{
			quotient[i] = 0;
		}
	}
	printf("The quotient is\n");
	for(int i = 0;i<8;i++){
		printf("%d",quotient[i]);
	}
	printf("\nThe remainder is\n");
	for(int i = 0;i<4;i++){
		printf("%d",ans[i]);
	}
	for(int k = 8,j=0;k<12 && j<4;k++,j++){
		arr[k] = ans[j];
	}
	printf("\nThe answer is\n");
	for(int i = 0;i<12;i++){
		printf("%d",arr[i]);
	}
}
