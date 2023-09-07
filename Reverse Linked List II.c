/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseLL(struct ListNode* curr,int left,int right){
    struct ListNode* prev=NULL;
    struct ListNode* next=NULL;
    struct ListNode* l=curr;
    while((curr!=NULL) && (left<=right)){
        next=curr->next;
        curr->next=prev;
        prev=curr;
        curr=next;
        left++;
    }
    l->next=curr;
    return prev;
}
struct ListNode* reverseBetween(struct ListNode* head, int left, int right){
    struct ListNode* p;
    p = head;
    int c1 = 1; // Initialize c1 to 1
    struct ListNode dummy; // Create a dummy node to handle the case when left == 1
    dummy.next = head;
    struct ListNode* prev = &dummy;
    
    while (p != NULL) {
        if (c1 == left) {
            prev->next = reverseLL(p, left, right);
            return dummy.next; // Return the head of the modified list
        } else {
            c1++;
            prev = p; // Move prev to the node just before left
            p = p->next;
        }
    }
    return head;
}
