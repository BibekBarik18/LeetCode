/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
void preorder(struct TreeNode *node,int *,int *);
int count(struct TreeNode *node);
int* preorderTraversal(struct TreeNode* root, int* returnSize) {
    if(root==NULL)
    {
        *returnSize=0;
        return NULL;
    }
    int s=count(root);
    int *ans=(int *)malloc(s*sizeof(int));
    int i=0;
    preorder(root,ans,&i);
    *returnSize=s;
    return ans;
}
int count(struct TreeNode *node)
{
    if(node==NULL)
    return 0;
    return 1+count(node->left)+count(node->right);
}
void preorder(struct TreeNode *node,int *ans,int *i)
{
    if(node==NULL)
    return;
    ans[(*i)++]=node->val;
    preorder(node->left,ans,i);
    preorder(node->right,ans,i);
}
