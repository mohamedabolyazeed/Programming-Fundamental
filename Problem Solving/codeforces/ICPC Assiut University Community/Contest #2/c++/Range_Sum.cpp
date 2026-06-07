#include<bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int t;
    cin >> t;
    
    while(t--){
        long long l, r;
        cin >> l >> r;
        if(l > r) swap(l, r);
        long long sum = r*(r+1)/2 - (l-1)*l/2;
        cout << sum << "\n";
    }
    
    return 0;
}