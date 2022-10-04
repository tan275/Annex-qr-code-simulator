class Solution {
public:
    void printf(int ind,vector <int> ds,int nums[],int n){
        if (ind==n){
            for (auto i : ds){
                if (ds.size()>2){
                    cout<<i<<" ";
                }
            }
        if (ds.size()==0){
            cout<<" ";
        }
        cout<<endl;
        return;
        printf(ind+1,ds,nums,n);
        ds.push_back(nums[ind]);
        printf(ind+1,ds,nums,n);
        ds.pop_back();
    }
}
public:
    vector<vector<int>> findSubsequences(vector<int>& nums) {
        int n=nums.size();
        vector <int> ds;
        vector<vector<int>> ans;
        ans = printf(0,ds,nums,n);
        return ans;    
    }
}
};