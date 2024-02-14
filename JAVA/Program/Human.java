public class Human {
    private String name;
    private String id;
    private String partai;
    private String bidang;

    public Human() {
        this.name = "";
        this.id = "";
        this.partai = "";
        this.bidang = "";
    }

    public Human(String name, String id, String partai, String bidang) {
        this.name = name;
        this.id = id;
        this.partai = partai;
        this.bidang = bidang;
    }

    public String get_name() {
        return this.name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public String get_id() {
        return this.id;
    }

    public void set_id(String id) {
        this.id = id;
    }

    public String get_partai() {
        return this.partai;
    }

    public void set_partai(String partai) {
        this.partai = partai;
    }

    public String get_bidang() {
        return this.bidang;
    }

    public void set_bidang(String bidang) {
        this.bidang = bidang;
    }
}