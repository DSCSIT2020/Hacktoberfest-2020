#include <iostream>
using namespace std;
int main() {
   int search, c,n;
   cout<<"Enter size of array \n";
   cin>>n;
   cout<<"Enter the array elements \n";
   int arr[n];
   for(c = 0;c < n; c++)
   cin>>arr[c];
   cout<<"Enter the number to search \n";
   cin>>search;
   for (c = 0; c < n; c++) {
      if (arr[c] == search) {
         cout<<search<<" is present at location "<<c+1;
         break; 
      }
   }
   if (c == n)
      cout<<"the number "<<search <<" is not present in the array ";
   return 0;
}