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

int count_nonleafnode(TreeNode*root)
{
	if (root== NULL||(root->left==NULL&&root->right == NULL))
        return 0;

    return 1 + count_nonleafnode(root->left)+count_nonleafnode(root->right); 
	
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
    
    
    if(root==NULL)
	printf("Tree is Empty");
	printf("The total nodes in the tree is %d ",count_nonleafnode(root));


}
