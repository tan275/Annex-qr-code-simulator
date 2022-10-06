#include<bits/stdc++.h>
using namespace std;
class Node{
    public:
  int data;
  Node* next;
  Node(int data)
  {
     this->data=data;
     this->next=NULL;
  }
};
void insertAtHead(Node* &head,int d)
{
    Node*temp=new Node(d);
    temp->next=head;
    head=temp;
}
void print(Node* &head)
{
    Node*temp=head;
    while(temp!=NULL)
    {
        cout<<temp->data<<" ";
        temp=temp->next;
    }
    cout<<endl;
}

int main()
{
    Node* head=new Node(10);
    print(head);
    insertAtHead(head,20);
    print(head);
    insertAtHead(head,30);
    print(head);
    return 0;
}