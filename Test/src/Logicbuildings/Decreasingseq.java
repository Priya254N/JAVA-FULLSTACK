package Logicbuildings;

class Result {
    int countSeq;
    int maxLen;

    Result(int countSeq, int maxLen) {
        this.countSeq = countSeq;
        this.maxLen = maxLen;
    }

    
    public String toString() {
        return "Count: " + countSeq + ", Max Length: " + maxLen;
    }
}

public class Decreasingseq {

    public Result decreasingSequence(int[] input1, int input2) {
        int countSeq = 0;  
        int maxLen = 0;     
        int currLen = 1;    

        for (int i = 1; i < input2; i++) {
            if (input1[i] < input1[i - 1]) {
                currLen++;
            } else {
                if (currLen > 1) {
                    countSeq++;
                    if (currLen > maxLen) {
                        maxLen = currLen;
                    }
                }
                currLen = 1;
            }
        }

        if (currLen > 1) {
            countSeq++;
            if (currLen > maxLen) {
                maxLen = currLen;
            }
        }

        return new Result(countSeq, maxLen);
    }

    public static void main(String[] args) {
        Decreasingseq obj = new Decreasingseq();
        int[] arr = {9, 7, 5, 6, 3, 1};
        Result res = obj.decreasingSequence(arr, arr.length);
        System.out.println(res);
    }
}

