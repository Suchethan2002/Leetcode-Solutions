class Solution {
    public int findComplement(int num) {
        int mask = 0;
        for(int i = 0; i < 32; i++)
            mask |= num >> i;
        return mask^num;
    }
}