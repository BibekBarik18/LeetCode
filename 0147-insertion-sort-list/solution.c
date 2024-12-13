/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* insertionSortList(struct ListNode* head) {
    int l=0;
    struct ListNode* temp=head;
    while(temp!=NULL)
    {
        l++;
        temp=temp->next;
    }
    int arr[l];
    temp=head;
    int i=0;
    while(temp!=NULL)
    {
        arr[i]=temp->val;
        i++;
        temp=temp->next;
    }
    for(int i=0;i<l-1;i++)
    {
        for(int j=i+1;j>0;j--)
        {
            if(arr[j]<arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
    }
    temp=head;
    i=0;
    while(temp!=NULL)
    {
        temp->val=arr[i];
        i++;
        temp=temp->next;
    }
    return head;
}
