package sort.selection.student;

public class SelectionSort {

    public static void sort(Student[] arr) {

        Student maxGradeStudent;
        int index;
        for (int i = 0; i < arr.length - 1; i++) {
            // 처음엔 제일 앞 데이터를 maxGradeStudent로 두고 비교한다.
            maxGradeStudent = arr[i];
            index = i;

            /*
             * 학생 배열에서 최대 등급을 찾고 그 자리 index을 확인한다.
             * ( A > B > C > D )
             */
            Student compareStudent;
            for (int j = i + 1; j < arr.length; j++) {
                compareStudent = arr[j];
                if (maxGradeStudent.compareTo(compareStudent) > 0) {
                    maxGradeStudent = compareStudent;
                    index = j;
                }
            }

            arr[index] = arr[i];
            arr[i] = maxGradeStudent;
        }
        
    }

}
