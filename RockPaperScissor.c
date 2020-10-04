#include <stdio.h>
#include <stdlib.h>

int computer, player, compScore = 0, playerScore = 0;

void compare(int comp, int player)
{
    if (comp == 1)
    {
        if (player == 2)
            playerScore++;
        else if (player == 3)
            compScore++;
    }
    else if (comp == 2)
    {
        if (player == 1)
            compScore++;
        else if (player == 3)
            playerScore++;
    }
    else if (comp == 3)
    {
        if (player == 1)
            playerScore++;
        else if (player == 2)
            compScore++;
    }
}

int random()
{
    for (int i = 0; i < 1; i++)
    {
        int num = (rand() % (3 - 1 + 1)) + 1;
        return num;
    }
    return 0;
}

int main()
{
    printf("\n\t=== Welcome to Rock Paper Scissor Game! ===\n\n");

    int a = 1;
    while (a == 1)
    {
        printf("Choose the number!\n1. Rock\n2. Paper\n3. Scissor\n4. Quit the game\n\n");
        printf("Enter the number : ");
        scanf("%d", &player);

        if (player == 4)
        {
            a = 0;
            break;
        }
        else if (player > 4)
        {
            printf("You entered the wrong number!\n");
            continue;
        }

        computer = random();
        compare(computer, player);

        printf("Computer choose %d\n", computer);
        printf("\n=== SCORE ===\nComputer : %d\nPlayer : %d\n=============\n\n", compScore, playerScore);
    }

    return 0;
}