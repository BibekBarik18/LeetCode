/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {
    if(head==NULL)
    return head;
    while (head != NULL && head->val == val) {
        head = head->next;
    }
    struct ListNode *temp=head,*temp1=head;
    while(temp!=NULL)
    {
        if(temp->val==val)
        {
            temp1->next=temp->next;
            temp=temp->next;
        }
        else
        {
            temp1=temp;
            temp=temp->next;
        }
    }
    return head;
}
