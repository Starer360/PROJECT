#include <iostream>
#include <windows.h>
#include <time.h>
#include <conio.h>

#define W 50
#define H 50

using namespace std;

class chessboard
{
public:
    char qp[W][H];
    int i, j, x1, y1;
    chessboard();
    void food();
    void prt(int grade, int score, int gamespeed);
};

chessboard::chessboard()
{
    // 空格
    for (i = 1; i < H - 2; i++)
    {
        for (j = 1; j < W - 2; j++)
            qp[i][j] = ' ';
    }
     
    // 墙
    for (i = 0; i < H-1; i++)
        qp[0][i] = qp[H-1][i] = '#';

    for (j = 1; j < W-2; j++)
        qp[j][0] = qp[j][H-1] = '#';
    food();
}

void chessboard::food()
{
    srand(time(0));
    do
    {
        x1 = rand() % W - 1;
        y1 = rand() % H - 1;
    } while (qp[y1][x1] == ' ');
    qp[y1][x1] = '&';
    
}