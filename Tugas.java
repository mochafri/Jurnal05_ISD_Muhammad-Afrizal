public class Tugas {
    private String mataKuliah;
    private String tugas;
    private String deadline;

    public Tugas(String mataKuliah, String tugas, String deadline){
        this.mataKuliah = mataKuliah;
        this.tugas = tugas;
        this.deadline = deadline;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public String getTugas() {
        return tugas;
    }

    public String getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Data [mataKuliah=" + mataKuliah + ", tugas=" + tugas + ", deadline=" + deadline + "]";
    }

    
}
