#include<stdio.h>
#include<stdlib.h>

typedef struct TreeNode
{
    int item;
    struct TreeNode* left;
    struct TreeNode* right;
}TreeNode;

int insertNode(TreeNode** root,int element)
{
    if(*root==NULL)
    {
        *root=(TreeNode*)malloc(sizeof(TreeNode));
        (*root)->item=element;
        (*root)->left=NULL;
        (*root)->right=NULL;
    }
    else if(element < (*root)->item)
    {
        insertNode( &((*root)->left),element);
    }
    else
    {
        insertNode(&((*root)->right),element);
    }
}

void postorder(TreeNode*root)
{
  if(root!= NULL)
  {
    postorder(root->left);
    postorder(root->right);
    printf("%d",root->item);
  }
}

void main()
{ 
    int i;
    TreeNode*root;
    root=NULL;
    
    i = insertNode(&root,18);
    i = insertNode(&root,33);
    i = insertNode(&root,56);
    i = insertNode(&root,89);
    
    printf("PostOrder traversal: ");
    postorder(root);
    
}