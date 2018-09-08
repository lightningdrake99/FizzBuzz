#include <iostream>
#include <string>
using namespace std;

int main()
{
	
	 for( int a = 0; a < 101; ++a)
{
string output = "";
if(a % 5 == 0){output=output+"fizz";}
if(a % 3 == 0){output=output+"buzz";}
if(output == ""){cout << a << endl;}else{
cout << output << endl;};
}
return 0;

};
