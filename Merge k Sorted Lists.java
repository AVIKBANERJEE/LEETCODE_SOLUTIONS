/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* merge2Lists(struct ListNode* list1, struct ListNode* list2) {
    // Recursion 

    // Time complexity: O(n1 + n2), n1 := list1.length, n2 := list2.length
    // Space complexity: O(n1 + n2)

    // takes two sorted linked lists as input and returns a new linked list that is formed by 
    // merging the elements from both input lists while maintaining the ascending order

    // the base cases are when either of the input lists becomes NULL, in which case 
    // the other non-empty list is returned as the merged list
    if (list1 == NULL) 
        return list2;
    if (list2 == NULL) 
        return list1;
    
    // compares the values of the current nodes of the input lists and 
    // appends the smaller value node to the result list
    if (list1->val >= list2->val) {
        list2->next = merge2Lists(list1, list2->next);
        return list2;
    }
    else {
        list1->next = merge2Lists(list1->next, list2);
        return list1;
    }
    return NULL;
}
struct ListNode* mergeKLists(struct ListNode** lists, int listsSize) {
    // Recursion 

    // uses a merge2Lists() function to recursively merge pairs of linked lists, 
    // starting with the first two lists, then the result of the first merge with 
    // the third list, and so on, until all lists are merged

    // Time complexity: O(n*k), n := total number of nodes across all linked lists 
    // Space complexity: O(max(n1, n2)), dominated by the recursion depth 

    struct ListNode* result = NULL;
    if (listsSize == 0 || (listsSize == 1 && lists[0] == NULL)) 
        return NULL;
    for (int i = 0; i < listsSize; i++) {
        result = merge2Lists(result, lists[i]);
    }
    return result;
}
