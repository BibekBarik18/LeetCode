/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode *temp=head,*temp1=NULL,*temp2=NULL;
    while(temp!=NULL)
    {
        temp2=temp->next;
        temp->next=temp1;
        temp1=temp;
        temp=temp2;
    }
    head=temp1;
    return head;    
}
