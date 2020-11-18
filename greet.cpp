#include<iostream>
using namespace std;

void greet()
{
    string name;
    cout <<"Hey there!, what is your name? "<<endl;
    cin >> name;
    cout << "Hello " << name <<", nice to meet you.";
}
int main()
{
    greet();
}