package binarySearch.easy.firstBadVersion;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class Solution extends VersionControl {
    public int bsearch(int low,int high){
        int mid=low+(high-low)/2;

        while(low<=high){
            if(!isBadVersion(mid) && isBadVersion(mid+1))return mid+1;
            if(isBadVersion(mid) && isBadVersion(mid+1))return bsearch(low,mid-1);
            if(!isBadVersion(mid) && !isBadVersion(mid+1))return bsearch(mid+1,high);
        }

        return 1;
    }
    public int firstBadVersion(int n) {
        return bsearch(1,n);
    }
}