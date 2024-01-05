package ArrayPracties;

import java.util.Arrays;

public class MergeSortedArray88 {
    //using sorting
    public void mergeUsingSorting(int[] nums1, int m, int[] nums2, int n) {
        //int k = nums2.length-1;
        int l = nums1.length - 1;
        while (n > 0) {
            nums1[l] = nums2[n - 1];
            n--;
            l--;
        }
        Arrays.sort(nums1);
    }



    //2-pointer from front. not working

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0, k = 0;
        while (i < m && k < n) {
            if (nums1[i] <= nums2[k] && nums1[i] != 0) {
                i++;
            } else {
                makeASpace(nums1, i);
                nums1[i] = nums2[k];
                k++;
                i++;
                m++;
            }
        }
        if (k < n) {
            while (k < n) {
                nums1[i] = nums2[k];
                i++;
                k++;
            }
        }

    }

    static void makeASpace(int[] givenArrya, int position) {
        int j = givenArrya.length - 1;

        while (j >= position) {
            if (givenArrya[j] == 0) {
                j--;
            } else {
                givenArrya[j + 1] = givenArrya[j];
                j--;
            }
        }
    }


    //2 pointer from back
    public void merge2pointer(int[] nums1, int m, int[] nums2, int n){
        int k = nums1.length-1;

        while(m>0 && n>0){
            if(nums1[m-1] > nums2[n-1]){
                nums1[k] = nums1[m-1];
                m--;
                k--;
            }else {
                nums1[k] = nums2[n-1];
                n--;
                k--;
            }
        }
        if(n>=1){
            while(n>=1){
                nums1[k] = nums2[n-1];
                n--;
                k--;
            }
        }
    }

    public static void main(String[] args) {
        MergeSortedArray88 mergeSortedArray = new MergeSortedArray88();
        int m = 0, n = 0;
        //Test case -1
        int[] num1 = {1, 2, 3, 0, 0, 0};
        m = 3;
        int[] num2 = {2, 5, 6};
        n = 3;

        mergeSortedArray.merge2pointer(num1, m, num2, n);

        //test case -2
        int[] num3= {0};
        m = 0;
        int[] num4= {1};
        n = 1;
        mergeSortedArray.merge2pointer(num3, m, num4, n);

        for (int num : num1
        ) {
            System.out.print(num + ", ");
        }

    }
}
