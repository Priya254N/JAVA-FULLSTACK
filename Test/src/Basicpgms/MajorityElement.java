package Basicpgms;
class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,2,2,2};
        int count = 0, candidate = -1;

        for (int num : arr) {
            if (count == 0) candidate = num;
            if (num == candidate) count++;
            else count--;
        }

        // Verify
        count = 0;
        for (int num : arr) if (num == candidate) count++;
        if (count > arr.length / 2)
            System.out.println("Majority element: " + candidate);
        else
            System.out.println("No majority element");
    }
}
