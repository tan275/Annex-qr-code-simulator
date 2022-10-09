#include <iostream>
using namespace std;
int kadanesAlgo(int n, int arr[])
{
    int maxSum = 0;
    int currSum = 0;
    for (int i = 0; i < n; i++)
    {
        maxSum += arr[i];
        if (maxSum < 0)
        {
            maxSum = 0;
        }
        if (currSum < maxSum)
        {
            currSum = maxSum;
        }
    }
    return currSum;
}
int main()
{
    int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int sizeofarr = sizeof(arr) / sizeof(arr[0]);
    cout << kadanesAlgo(sizeofarr, arr);
    return 0;
}