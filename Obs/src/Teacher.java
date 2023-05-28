public class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public String getMpno() {
        return mpno;
    }

    public String getBranch() {
        return branch;
    }
}
