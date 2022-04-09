Sorting
- aranging of list of number od data in order

-----------------------------choose the sorting as per requirements-----------------------

types of sorting algorothm
-elemenyary(basic)
	-bubble, selection, insertion
-efficient
	-merge, hash, radix, qucik

1.Merge sort

-breaking of unsorted array into half until the array becomes indiviual elements
-as every array becomes individual element merge it by comparing the corresponding elements in each 
step in ascending or descending order
---------------------------------------------------------------------------------------------------
2.Selection sort

-uses mechanism of maximum and minimum technique
-consider a[0] the lowest, and  start sorting.
-if any element is smaller than that of a[0] swap it.
---------------------------------------------------------------------------------------------------
3.Insertion sort

-compare the elements of array before insertion
-checking position while insertion from 0 index to nth index
------------------------------------------------------------------------------------------------
4.Quick sort

-most efficient sorting algorithm and it is based on the spliting of array into smaller ones.

-algorithm
compare start index and end index with pivot vale on the basis of greate than and smaller than 
smaller are kept on left 
greater are kept on right

conditions
-if element of start index is less than or equal to pivot number than increase the start in 
 array otherwise stop.
-if element of end is greater than pivot number than decrease end otherwise stop
-after the start and end stopped. swap the value of start and end
-if start and end value crossed the path, then swap the value of pivot number and end

pivot value = a value in middle of all elements
1st element= start index 
last element= end index
step 1: compare start index with pivot number
	if(s<=p){
		s++;
	}
	else stop
	step 1.1:compare end index with pivot number
		if(e>=p){
			e--;
		}
		stop	
	step 1.2:compare end index with pivot value
		if(e>=p){
			e--;
		}
		stop
after swapping end index and pivot number the new position hold by pivot number is sorted.
so following divide and conquer algorithm we need to divide the array into two parts i.e.
left array and right array of piviot number
left array
right array 
and sorted position

step 2:choose right or left array  
	choose the middle number as pivot
	start step 1.
--------------------------------------------------------------------------------------------------
5.Bubble sort

-repeatedly swapping of adjacent elements until they are not in the intended order
-algorithm  
   for (i = 0; i < (num - 1); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        } 
--------------------------------------------------------------------------------------------------
6.Heap sort

-elimination process

heap- similar to binary tree
    - insertion from left hand side
two types of heap
-max heap:lowest element in root
-min heap:highest element in root

working of heap sorting(heapify method)
step1:construct a binary tree with given list of elements
step2:transform the binary tree into min heap

compare root node with left child node first,
if root node has greater value no change
if child node has greater value swap
compare root node value with every descendent node.
if greater no change
if smaller swap.

eliminate the root node value and store ina new array from end index.

---------------------------------------------------------------------------------------------------
7.Radix sort

algorithm
-find the maximum digit number from digit it can hold from given array
-make bucket out of maximum digit number.
-make every number in array equivalent to the maximum digit
-sort the number in the first bucket starting from 1 digits
-in second bucket sort array of  1st bucket into 2nd bucket comparing ten's digit value
-in third bucket,chcek hundreth digit values and so on until the maximum digit from array is solved


