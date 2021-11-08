#include<bits/stdc++.h>
using namespace std;

struct Node{

    int data; 
    Node*left,*right;

    Node(int data, Node* left, Node* right){
        this->data = data;
        this->left = this->right = NULL;
    }
};

int sum = 0;
void SumReplacement(Node* node){
  
   if(node == NULL){
       return ;
   }
   SumReplacement(node->right);
   int data = node->data;
   node->data = sum;
   sum+= data;
   SumReplacement(node->left);
}

void inorder(Node* node){
    if(node== NULL){
        return;
    }
    inorder(node->left);
    cout<<node->data<<" ";
    inorder(node->right);
}

int main(){

        Node* root = new Node(50, NULL,NULL);
        root->left = new Node(30, NULL, NULL);
        root->left->left = new Node(20, NULL, NULL);
        root->left->right = new Node(40, NULL, NULL);
        root->right = new Node(70, NULL, NULL);
        root->right->left = new Node(60, NULL, NULL);
        root->right->right = new Node(80, NULL, NULL);

        inorder(root);
        cout<<endl;
        SumReplacement(root);
        inorder(root);


    return 0;
}
 