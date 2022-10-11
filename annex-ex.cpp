// C++ program to illustrate that the
// pointers point into the same object,
// but to members with different
// access control
#include <iostream>
using namespace std;

// Class A
class A {
public:
	int x;
	int y;

	// Function returns true if
	// x comes before y
	bool f1() { return &x < &y; }

	// unspecified
	bool f2() { return &x < &z; }
private:
	int z;
};

// Driver Code
int main()
{

	// Object of class A
	A a;

	// Function Call
	cout << a.f1() << "\n"
		<< a.f2();
	return 0;
}
