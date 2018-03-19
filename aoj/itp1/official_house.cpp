#include <iostream>
using namespace std;

int main() {
  int n, b, f, r, v;
  int count[4][3][10] = {};
  cin >> n;
  for (int i=0;i<n;i++) {
    cin >> b >> f >> r >> v;
    count[b-1][f-1][r-1] += v;
    if (count[b-1][f-1][r-1] < 0) {
      count[b-1][f-1][r-1] = 0;
    }
    if (count[b-1][f-1][r-1] > 9) {
      count[b-1][f-1][r-1] = 9;
    }

  }
  for (int i=0;i<4;i++) {
    for (int j=0;j<3;j++) {
      for (int k=0;k<10;k++) {
        cout << " " << count[i][j][k];
      }
      cout << endl;
    }
    if (i == 3) {
      break;
    }
    cout << "####################" << endl;
  }
  return 0;
}
