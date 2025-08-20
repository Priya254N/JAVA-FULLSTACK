package Basicpgms;
class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        System.out.print("Leaders: ");
        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    leader = false;
                    break;
                }
            }
            if (leader) System.out.print(arr[i] + " ");
        }
    }
}
