#include <vector>
#include <unordered_map>
#include <cmath>

class Solution {
public:
    bool containsNearbyDuplicate(std::vector<int>& nums, int k) {
        std::unordered_map<int, int> last_seen;
        for (int i = 0; i < nums.size(); ++i) {
            if (last_seen.find(nums[i]) != last_seen.end()) {
                if (i - last_seen[nums[i]] <= k) {
                    return true;
                }
            }
            last_seen[nums[i]] = i;
        }
        return false;
    }
};
