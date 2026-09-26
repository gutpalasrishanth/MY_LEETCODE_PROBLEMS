class Solution {
    public String originalDigits(String s) {
        int arr[] = new int[26];
        int nums[] = new int[10];

        for (char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }

        nums[0] = arr['z' - 'a'];
        arr['e' - 'a'] -= nums[0];
        arr['r' - 'a'] -= nums[0];
        arr['o' - 'a'] -= nums[0];

        nums[6] = arr['x' - 'a'];
        arr['s' - 'a'] -= nums[6];
        arr['i' - 'a'] -= nums[6];

        nums[7] = arr['s' - 'a'];
        arr['e' - 'a'] -= 2 * nums[7];
        arr['v' - 'a'] -= nums[7];
        arr['n' - 'a'] -= nums[7];

        nums[2] = arr['w' - 'a'];
        arr['o' - 'a'] -= nums[2];
        arr['t' - 'a'] -= nums[2];

        nums[8] = arr['g' - 'a'];
        arr['e' - 'a'] -= nums[8];
        arr['i' - 'a'] -= nums[8];
        arr['h' - 'a'] -= nums[8];
        arr['t' - 'a'] -= nums[8];

        nums[3] = arr['h' - 'a'];
        arr['t' - 'a'] -= nums[3];
        arr['h' - 'a'] -= nums[3];
        arr['e' - 'a'] -= 2 * nums[3];

        nums[4] = arr['u' - 'a'];
        arr['f' - 'a'] -= nums[4];
        arr['o' - 'a'] -= nums[4];
        arr['r' - 'a'] -= nums[4];

        nums[5] = arr['f' - 'a'];
        arr['i' - 'a'] -= nums[5];
        arr['v' - 'a'] -= nums[5];
        arr['e' - 'a'] -= nums[5];

        nums[1] = arr['o' - 'a'];
        arr['n' - 'a'] -= nums[1];
        arr['e' - 'a'] -= nums[1];

        nums[9] = arr['e' - 'a'];

        StringBuilder ss = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            while (nums[i] > 0) {
                ss.append(i);
                nums[i]--;
            }
        }

        return ss.toString();
    }
}