package in.ineuron.dsaAssignment;

import java.io.NotActiveException;
import java.lang.foreign.SymbolLookup;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import javax.xml.namespace.QName;

public class DsaAssignment1 {

	// Q.1 Two Sum Problem
	public static int[] TwoSum(int arr[], int x) {
		int collect[] = new int[2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == x) {
					collect[0] = i;
					collect[1] = j;
				}

			}
		}
		return collect;
	}

	// Q.3 Binary Search
	public static int BinarySearch(int arr[], int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (arr[mid] > target) {
				end = mid - 1;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else if (arr[mid] == target) {
				return mid;
			}

		}
		return -1;
	}

	// Q.5 Merge two sorted array
	public static int[] MergeArrays(int nums1[], int nums2[]) {

		int index = 1;
		for (int i = nums1.length - 1; i >= 0; --i) {

			if (nums1[i] == 0) {
				for (int j = nums2.length - index; j >= 0;) {
					nums1[i] = nums2[j];

					index++;
					break;
				}
			} else {
				break;
			}

		}

		for (int i = 0; i < nums1.length; i++) {
			for (int j = i + 1; j < nums1.length; j++) {
				if (nums1[i] > nums1[j]) {
					int temp = nums1[i];
					nums1[i] = nums1[j];
					nums1[j] = temp;

				}

			}

		}

		return nums1;

	}

	// Q.4 Plus one
	public static int[] PlusOne(int digits[]) {

		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}

		// below case if all number inside array are 9
		// when we define the size of the array than array previous value will be
		// vanished from the array.
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}
	
	
	
	

	// Q.6 Containes Duplicate
	public static boolean containsDuplicate(int[] nums) {
		if (nums == null || nums.length == 0)
			return false;

		// Create a hashset...
		HashSet<Integer> hset = new HashSet<Integer>();

		// Traverse all the elements through the loop...
		for (int idx : nums) {
			// If it contains duplicate...
			if (!hset.add(idx)) {
				return true;
			}
		}
		// Otherwise return false (when duplicate not found)

		return false;
	}
	
	
	
	
	//Q.2 Remove Element
public static int search(int arr[], int target) {

		
		for (int i = 0; i < arr.length; i++) {
		
			if (arr[i]==target) {
				return i;
				
				
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {

		// Q.1 Two Sum
//		int a[] = {11,7,15,2};
//		
//		int target = 9;
//		
//		System.out.println(Arrays.toString(TwoSum(a, target)));

		// Q.3 Binary Search
//		int a[] = {1,3,4,14,9,14,45,80};
//		int target = 14;
//		
//		System.out.println( "The index is:: "+BinarySearch(a, target));

		// Q.5 Merge Sorted Array

		// eg.1
//		int [] nums1 = {1,2,3,0,0,0};
//		
//		int [] nums2 = {2,5,6};

		// eg.2
//		int nums1[] = {0};
//		int nums2[] = {1};
//		
//		System.out.println(Arrays.toString(MergeArrays(nums1,nums2)));

		// Q.4 Plus one

//		int arr[] = { 1, 2, 3, 4, 9 };
//		int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 1 };
////		int arr[] = {9};
//		System.out.println(Arrays.toString(PlusOne(arr)));

		// Q.6 Contains Duplicate
//		int nums[] = {1,1,1,3,3,4,3,2,4,2};
//		
//		 boolean f = containsDuplicate(nums);
//		 
//		if (f) {
//			System.out.println("Duplicate found");
//		}else {
//			System.out.println("Duplicate not found");
//		}

		// Q.8 Set Mismatch

//		int nums[] = { 1, 2, 2, 4 };
//
//		int arr[] = new int[2];
//
//		HashSet<Integer> set = new HashSet<>();
//
//		for (int i = 0; i < nums.length; i++) {
//
//			if (set.contains(nums[i])) {
//				arr[0] = nums[i];
//			} else {
//				set.add(nums[i]);
//			}
//		}
//
//		// This below for loop for checking 1 to n that if any number is missing then
//		// save it in arr[1]. Because in the question array starts from 1 to n.
//		for (int i = 1; i <= nums.length; i++) {
//
//			if (set.contains(i) == false) {
//				arr[1] = i;
//				break;
//			}
//
//		}
//
//		System.out.println(Arrays.toString(arr));
		
		
		
		
		//Q.7 Move Zeros
//		int nums[] = {0,1,0,3,12};
//		 for(int i=0; i<nums.length; i++){
//	           
//	          for(int j =i+1; j<nums.length; j++){
//	                     if(nums[i]==0){
//	                         int temp = nums[i];
//	                         nums[i] = nums[j];
//	                         nums[j] = temp;
//	                     }
//	          }
//	    }
//		
//		System.out.println(Arrays.toString(nums));
		


		
		//Q.2 Remove Element
		int nums[] = {4,5};
		int val = 2;
		
		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] == val) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(nums));

		int index = search(nums, val);

		if (index == -1) {
			
			System.out.println("index == -1:: " + nums.length);
		}
		
		if (index == 0) {
			int count = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == val) {
					count++;
				}
			}
			System.out.println("index == 0 :: " + (nums.length - count));
		} 
		
		else{
			System.out.println("index>0:: " + index);
		}

		
		
		
		

	}
	


}