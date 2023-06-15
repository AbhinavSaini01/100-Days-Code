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


int height(TreeNode*root)
{
	int rh,lh;
	if(root==NULL) return 0;
	else
	{
		rh = height(root->right);
		lh = height(root->left);
		if(lh>rh)
			return lh++;
		else 
			return rh++;
	}
}

void main()
{ 
    int i;
    TreeNode*root;
    root=NULL;
    
    i = insertNode(&root,99);
    i = insertNode(&root,33);
    i = insertNode(&root,56);
    i = insertNode(&root,39);
    i = insertNode(&root,58);
    i = insertNode(&root,32);
    i = insertNode(&root,84);
    i = insertNode(&root,97);
    i = insertNode(&root,21);
    i = insertNode(&root,64);
    
    
    
    if(root==NULL)
	printf("Tree is Empty");
	printf("The height of the tree is %d ",height(root));

}