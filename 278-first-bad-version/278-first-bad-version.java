/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=0;
        int h=n;
        int res=0;
        
        while(l<=h){
            int mid = l + (h-l)/2;
            boolean badVersion = isBadVersion(mid);
            
            if(badVersion){
                res = mid;
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        
        return res;
    }
}