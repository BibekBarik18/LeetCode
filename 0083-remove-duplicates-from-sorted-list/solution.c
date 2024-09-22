/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    if(head==NULL)
    return head;
    struct ListNode *temp=head->next;
    struct ListNode *prev=head;
    while(temp!=NULL)
    {
        if(temp->val!=prev->val)
        {
            prev=temp;
            temp=temp->next;
        }
        else
        {
            prev->next=temp->next;
            temp=temp->next;
        }
    }
    return head;
}
