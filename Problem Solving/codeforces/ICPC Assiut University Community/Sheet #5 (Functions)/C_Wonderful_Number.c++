#include <iostream>
#include <string>
#include <bitset>
using namespace std;
 
bool isWonderful(int N)
{
  if (N % 2 == 0)
  {
    return false;
  }
  string binary = bitset<32>(N).to_string();
 
  binary.erase(0, binary.find_first_not_of('0'));
 
  string reversedBinary = string(binary.rbegin(), binary.rend());
  return binary == reversedBinary;
}
int main()
{
  int N;
  cin >> N;
 
  if (isWonderful(N))
  {
    cout << "YES" << endl;
  }
  else
  {
    cout << "NO" << endl;
  }
 
  return 0;
}