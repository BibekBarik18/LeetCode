/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* rotateRight(struct ListNode* head, int k) {
    int c=1;
    struct ListNode *temp;
    temp=head;
    if(head==NULL || head->next==NULL || k==0)
    return head;
    while(temp->next!=NULL)
    {
        temp=temp->next;
        c++;
    }
    temp->next=head;
    k=k%c;
    if (k == 0) {
        temp->next = NULL; // Break the circular link
        return head; // No rotation needed
    }
    k=c-k;
    temp=head;
    for(int i=1;i<k;i++)
    {
        temp=temp->next;
    }
    head=temp->next;
    temp->next=NULL;
    return head;
}
