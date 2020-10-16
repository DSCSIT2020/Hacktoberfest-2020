#include<stdio.h>

int canPlace(char board[][64],int row,int col,int n){

/* Check whether Queen is available in the Row */
for(int i=0;i<n;i++){
if(board[row][i]=='Q'){
return 0;
}
}
/* Check whether Queen is available in the Column */
for(int i=0;i<n;i++){
if(board[i][col]=='Q'){
return 0;
}
}
/* Check whether Queen is available in Diagonals */
//Top Left
int i=row,j=col;
while(i>=0&&j>=0){
if(board[i][j]=='Q'){
return 0;
}
i--;
j--;
}
//Top Right
i=row,j=col;
while(i>=0 && j<n){
if(board[i][j]=='Q'){
return 0;
}
i--;
j++;
}
//return success if there in no conflicting Queens
return 1;
}

int solveNQueen(char board[][64],int n,int row){
if(row==n){
//Print the board
for(int x=0;x<n;x++){
for(int y=0;y<n;y++){
printf("%c ",board[x][y]);
}
printf("\n");

}

return 1;
}

//Rec Case

//Try to place the queen in the current row

for(int pos=0;pos<n;pos++){

if(canPlace(board,row,pos,n)){
board[row][pos]='Q';

int canPlaceQueen = solveNQueen(board,n,row+1);
if(canPlaceQueen==1){
return 1;
}

board[row][pos]='.';
}
}
//Backtracking
return 0;
}

/* The main function */
int main(){

char board[64][64];

int n;
printf("Enter no of queens : ");
scanf("%d",&n);

for(int x=0;x<n;x++){
for(int y=0;y<n;y++){
board[x][y]='.';
}

}
solveNQueen(board,n,0);

return 0;
}
