DESCRIPTION: The task is to find the minimum path sum in a 2D grid.
Path from top left to bottom in the right direction which
minimizes the sum of all numbers along its path.

Given grid:
<pre>
4   9   4   2   1   7   3   1   8   7
6   9   4   3   6   1   1   4   5   6
7   5   4   7   4   6   3   8   8   4
5   4   1   2   2   3   7   6   1   3
0   3   3   4   3   5   2   7   2   9
2   3   5   4   0   5   3   8   1   0
7   8   4   5   8   9   2   7   5   3
6   1   8   1   3   5   5   6   1   1
3   0   5   5   1   8   7   5   8   6
7   8   5   1   4   2   9   1   1   2
</pre>
Searching minimum-valued path ..
<pre>
4   9   4   2   1           
                6   1   1       
                        3       
                        7   6   1   
                                2   
                                1   0 
                                    3 
                                    1 
                                    6
                                    2
</pre>
Sum of all numbers along its path: 60