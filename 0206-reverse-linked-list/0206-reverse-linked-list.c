struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode *prev = NULL;
    struct ListNode *curr = head;
 
    while (curr != NULL) {
        struct ListNode *nextTemp = curr->next; // Save next node
        curr->next = prev;                      // Reverse pointer
        prev = curr;                            // Advance prev
        curr = nextTemp;                        // Advance curr
    }

    return prev; // prev is the new head
}