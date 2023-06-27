/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
/* function to swap data of two nodes a and b*/

struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2){
    struct ListNode *head;
    struct ListNode *temp;

    if (list1 == NULL || list2 == NULL)
        return (list1) ? list1 : list2;
    if (list1->val <= list2->val) {
        head = temp = list1;
        list1 = list1->next;
    }
    else {
        head = temp = list2;
        list2 = list2->next;
    }
    while (list1 && list2) {
        if (list1->val <= list2->val) {
            temp->next = list1;
            list1 = list1->next;
        }
        else {
            temp->next = list2;
            list2 = list2->next;
        }
        temp = temp->next;
    }
     if(list1 == NULL) 
         temp->next =list2;
    else
         temp->next =list1;
    return (head);
}
