# Write your MySQL query statement below
-- Select tweet_id from Tweets where (Select count(content) from Tweets)>15
Select Tweet_id from Tweets where length(content)>15
