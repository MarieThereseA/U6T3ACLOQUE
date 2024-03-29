public class Main {
    public static void main(String[] args){

        //TEST CODE for makeLowercase:

//        String[] strings5 = {"HELLO", "Halo", "Adam", "what", "booyAH", "WHY?"};
//        String[] lower = ArrayAlgorithms.makeLowercase(strings5);
//        for (String str : lower) {
//            System.out.print(str + " ");
//        }
//        System.out.println("\n\noriginal array not modified:");
//        for (String str : strings5) {
//            System.out.print(str + " ");
//        }

        //TEST CODE for endsInExclamations:

//        String[] strings6 = {"hello!!", "!!!whoa", "sad", "Adam!", "What! No way", "Why!"};
//        int numExclamations = ArrayAlgorithms.endsInExclamations(strings6);
//        System.out.println(numExclamations);
//
//        String[] strings7 = {"hell!o", "w!hoa", "!sad", "Adam", "What! No way", "Why"};
//        int numExclamations2 = ArrayAlgorithms.endsInExclamations(strings7);
//        System.out.println(numExclamations2);

        //TEST CODE for makeUppercase:

//        String[] strings9 = {"HELlo", "Halo", "WHAT!", "Adam", "what", "booyAH", "WHY?", "for"};
//        ArrayAlgorithms.makeUppercase(strings9);
//        for (String str : strings9) {
//            System.out.print(str + " ");
//        }
//        System.out.println();

        //TEST CODE for arrayMaximums:

//        int[] arr1 = {2, 5, 6, 1, 0, -6, 10};
//        int[] arr2 = {1, 7, 6, -2, 8, -8, 8};
//        int[] maximums = ArrayAlgorithms.arrayMaximums(arr1, arr2);
//
//        for (int num : maximums) {
//            System.out.print(num + " ");
//        }
//        System.out.println("\n\noriginal arrays not modified:");
//        for (int num : arr1) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//        for (int num : arr2) {
//            System.out.print(num + " ");
//        }
//        System.out.println();

       // TEST CODE for countConsecutiveDoubles:

//        int[] nums10 = {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6};
//        int numDoubles = ArrayAlgorithms.countConsecutiveDoubles(nums10);
//        System.out.println(numDoubles);
//        int[] nums11 = {1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2};
//        int numDoubles2 = ArrayAlgorithms.countConsecutiveDoubles(nums11);
//        System.out.println(numDoubles2);
//        int[] nums12 = {1, 2, 1, 3, 1, 2, 1, 3, 1, 2, 1, 3};
//        int numDoubles3 = ArrayAlgorithms.countConsecutiveDoubles(nums12);
//        System.out.println(numDoubles3);

    //      TEST CODE for longestStreak:
    //
        int[] nums13 = {10, 20, 10, 30, 10, 20, 10, 30, 10, 20, 10, 30};
        int streak1 = ArrayAlgorithms.longestStreak(nums13);
        System.out.println(streak1);
        int[] nums14 = {10, 10, 20, 20, 20, 30, 30, 30, 30, 40, 40, 50};
        int streak2 = ArrayAlgorithms.longestStreak(nums14);
        System.out.println(streak2);
        int[] nums15 = {10, 10, 10, 10, 10, 10, 20, 20, 30, 30, 30, 30};
        int streak3 = ArrayAlgorithms.longestStreak(nums15);
        System.out.println(streak3);
        int[] nums16 = {20, 20, 30, 30, 30, 30, 10, 10, 10, 10, 10, 10};
        int streak4 = ArrayAlgorithms.longestStreak(nums16);
        System.out.println(streak4);
        int[] nums17 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int streak5 = ArrayAlgorithms.longestStreak(nums17);
        System.out.println(streak5);













    }
}
