/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
bool evaluateTree(struct TreeNode* root) {
    if(root->val == 0) 
        return false;
    if(root->val == 1) 
        return true;
    bool left = evaluateTree(root->left);
    bool right = evaluateTree(root->right);
    return root->val == 2 ? left | right : left & right;
}
