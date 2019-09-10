#include <stdio.h>

int main(void)
{

	int num[10];
	printf("난수 발생:");
	for (int i = 0; i < 10; i++)
	{
		num[i] = rand() % 10 + 1;
		printf("%d ", num[i]);
	}
	printf("\n");

}