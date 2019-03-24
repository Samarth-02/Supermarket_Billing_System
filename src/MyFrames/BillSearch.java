
package MyFrames;

import java.util.Date;

public class BillSearch {

    private int bno;
    private String cname;
    private int amt;
    private Date pdate;

    public BillSearch(int bno, String cname, int amt, Date pdate) {
        this.bno = bno;
        this.cname = cname;
        this.amt = amt;
        this.pdate = pdate;

    }

    public int getbno() {
        return bno;
    }

    public String getcname() {
        return cname;
    }

    public int getamt() {
        return amt;
    }

    public Date pdate() {
        return pdate;
    }
}
