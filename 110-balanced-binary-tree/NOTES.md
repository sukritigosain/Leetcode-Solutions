​<h1>Solution Explanation </h1>
The first condition we check here is for null, if root is null, there is nothing to be balanced, hence return true.<br>
Otherwise, find the height of left subtree and right subtree and find their difference. If their absolute difference is greater than 1 return false.<br>
Now let the recursion find the answer for left subtree and right subtree. We will return AND of both the results (found by recursion for left subtree and right subtree) as if any one of the subtree is not balanced the whole tree is not balanced.<br>
