#include <stdio.h>

int main(void)
{
	int num[10];
	printf("난수 발생:");

	srand((unsigned)time(NULL));

	for (int i = 0; i < 10; i++)
	{
		num[i] = rand() % 10 + 1;
		for (int j = 0; j < i; j++)
		{
			if (num[i] == num[j])
			{
				i--;
				break;
			}
		}
	}
	for (int i = 0; i < 10; i++)
	{
		printf("%d ", num[i]);
	}
	printf("\n");

}

