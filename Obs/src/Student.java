public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverage();
        this.isPass = false;
    }
    public void addOralNote(int note, double impactPercentage) {
        if (this.mat != null && this.mat.courseTeacher != null) {
            this.mat.note += note * impactPercentage;
        }

        if (this.fizik != null && this.fizik.courseTeacher != null) {
            this.fizik.note += note * impactPercentage;
        }

        if (this.kimya != null && this.kimya.courseTeacher != null) {
            this.kimya.note += note * impactPercentage;
        }
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama: " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti.");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAverage() {
        double matWeight = 1 - this.mat.oralWeight; // Sınav notunun etkisi
        double fizikWeight = 1 - this.fizik.oralWeight;
        double kimyaWeight = 1 - this.kimya.oralWeight;

        double matGrade = this.mat.note * matWeight;
        double fizikGrade = this.fizik.note * fizikWeight;
        double kimyaGrade = this.kimya.note * kimyaWeight;

        this.average = (matGrade + fizikGrade + kimyaGrade) / 3;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci: " + this.name);
        System.out.println("Matematik Notu: " + this.mat.note);
        System.out.println("Fizik Notu: " + this.fizik.note);
        System.out.println("Kimya Notu: " + this.kimya.note);
    }
}
