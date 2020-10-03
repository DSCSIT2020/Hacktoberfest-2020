
#include <stdio.h>
#include <time.h>
#include <stdlib.h>

// 0 - Rock
// 1 - Paper
// 2 - Scissors
int whoWon(int move1, int move2) {
    int winner = 0;
    if(move1 != move2) { // Otherwise is a tie
        if(move1>move2) { // 1 beats 0, 2 beats 1
            if(move1-move2<2) {
                winner = 1;
            } else {
                winner = 2;
            }
        } else {
            if(move2-move1<2) {
                winner = 2;
            } else {
                winner = 1;
            }
        }
    }
    return winner;
}

int main(void)
{
    int play = 1;
    srand(time(NULL));   // Initialization, should only be called once.
    while(play == 1) {
        printf("Hi! What's your move?\n");
        int yourMove = -1;

        printf("(R)ock\n");
        printf("(P)aper\n");
        printf("(S)cissors\n");

        char move = getchar();
        getchar(); // To skip \n

        if(move == 'R') yourMove = 0;
        if(move == 'P') yourMove = 1;
        if(move == 'S') yourMove = 2;

        if(yourMove != -1) {
            int myMove = rand();

            if(myMove%3 == 0) printf("I play Rock!\n");
            if(myMove%3 == 1) printf("I play Paper!\n");
            if(myMove%3 == 2) printf("I play Scissors!\n");

            int winner = whoWon(yourMove, myMove);
            if(winner == 0) printf("Its a tie!\n");
            if(winner == 1) printf("You Win!\n");
            if(winner == 2) printf("I Win!\n");

        } else {
            printf("Invalid move, please select a valid one.\n");
        }

        printf("Wanna play again?(y/n)");

        char again = getchar();
        getchar(); // To skip \n
        printf("a%ca\n",again);

        if(again == 'y') {
            play = 1;
        } else {
            play = 0;
        }
    }
    printf("Bye!\n");
    return 0;
}
