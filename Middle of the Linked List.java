/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct  ListNode* delete(struct ListNode* l,int mid){
    int c=0;
    struct ListNode* p;
    p=l;
    struct ListNode* y;
    while(p!=NULL){
        c++;
        if(c==(mid)){
            y=p->next;
            p->next=y->next;
            break;
        }
        else{
            p=p->next;
        }
    }
    return y;
}
struct ListNode* middleNode(struct ListNode* l){
    struct ListNode* p;
    p=l;
    int c=0;
    while(p!=NULL){
        c++;
        p=p->next;
    }
    if(c==1)
        return l;
    int mid=c/2;
    struct ListNode* q;
    q=delete(l,mid);
    return q;
}
