/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode *dummy=(struct ListNode*)malloc(sizeof(struct ListNode));
    struct ListNode *tail=dummy;
    int carry=0,d1=0,d2=0,sum=0,u=0;
    while(l1 || l2 || carry!=0)
    {
        int d1 = l1 ? l1->val : 0;
        int d2 = l2 ? l2->val : 0;
        sum=d1+d2+carry;
        carry=sum/10;
        tail->next = (struct ListNode*)malloc(sizeof(struct ListNode));
        tail->next->val = sum % 10;
        tail = tail->next;

        l1 = l1 ? l1->next : NULL;
        l2 = l2 ? l2->next : NULL;
    }
    tail->next=NULL;
    return dummy->next;
}
