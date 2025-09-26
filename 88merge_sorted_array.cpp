class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int a1 = 0; 
        int a2 = 0;

        vector<int> nums3;

        while (a1 < m && a2 < n){
            if (nums1.at(a1) < nums2.at(a2)){
                nums3.push_back(nums1.at(a1));
                    a1++;
            }
            else{
                nums3.push_back(nums2.at(a2));
                    a2++;
            }
        }
        while (a1 < m) {
            nums3.push_back(nums1[a1]);
            a1++;
        }

        while (a2 < n) {
            nums3.push_back(nums2[a2]);
            a2++;
        }
        nums1 = nums3;
    }
};