public class FindWordInString {
    public static  boolean findWordSentence(String Sentence,String word){
        return Sentence.contains(word);
    }
    public static void main(String[] args) {
        String Sentence ="Welcome to bridge labz solutions";
        String searchWord ="bridge";
        boolean find = findWordSentence(Sentence,searchWord);
        if (find){
            System.out.println("the word is found in the sentence:-"+searchWord);
        }
        else {
            System.out.println("the word is not found in th sentence ");
        }
    }
}
