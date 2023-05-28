public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT",0.2);
        Course fizik = new Course("Fizik", "FZK101", "FZK",0.2);
        Course kimya = new Course("Kimya", "KMY101", "KMY",0.2);

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50, 20, 40);
        s1.addOralNote(70, 0.2); // Fizik dersi için sözlü notunu ekler (Etki yüzdesi %20)

        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100, 50, 40);
        s2.addOralNote(80, 0.3); // Matematik dersi için sözlü notunu ekler (Etki yüzdesi %30)

        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50, 20, 40);
        s3.addOralNote(90, 0.1); // Kimya dersi için sözlü notunu ekler (Etki yüzdesi %10)

        s3.isPass();
    }
}
