struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2){
    struct ListNode p;
    struct ListNode *cur = &p;
    cur->next = NULL;

    while (list1 != NULL && list2 != NULL) {
        if (list1->val < list2->val) {
            cur->next = list1;
            list1 = list1->next;
        } else {
            cur->next = list2;
            list2 = list2->next;
        }
        cur = cur->next;
    }

    if (list1 != NULL) {
        cur->next = list1;
    } else {
        cur->next = list2;
    }
    return p.next;
}

