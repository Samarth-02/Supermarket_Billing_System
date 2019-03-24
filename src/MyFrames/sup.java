package MyFrames;

public class sup {

    private int sid;
    private String sname;
    private int pid;
    private String pname;
    private int price;

    public sup(int sid, String sname, int pid, String pname, int price) {
        this.sid = sid;
        this.sname = sname;
        this.pid = pid;
        this.pname = pname;
        this.price = price;

    }

    public int getsid() {
        return sid;
    }

    public String getsname() {
        return sname;
    }

    public int getpid() {
        return pid;
    }

    public String getpname() {
        return pname;
    }

    public int getprice() {
        return price;
    }
}
