package o;

/* loaded from: classes3.dex */
public class aYQ implements dkF {
    private AbstractC8399dkd b;

    @Override // o.dkF
    public void d(dkC dkc) {
    }

    public aYQ(AbstractC8399dkd abstractC8399dkd) {
        this.b = abstractC8399dkd;
    }

    @Override // o.dkF
    public void c(dkC dkc) {
        String str;
        String str2;
        if (dkc instanceof C8416dku) {
            return;
        }
        dkG dkg = (dkG) dkc;
        if (dkg.b() != null) {
            dkO a = dkg.a();
            dkO c = dkg.b().c();
            boolean z = true;
            String str3 = "unknown";
            if (c != null) {
                if (a == null) {
                    str2 = "issuance";
                } else if (c.c() == a.c()) {
                    str2 = "renewal";
                } else {
                    str = "new MT serial does not match original. " + c.c() + " " + a.c() + " " + c.e() + " " + a.e();
                }
                str3 = str2;
                str = "";
                z = false;
            } else {
                str = "Got a KeyResponseData, but it had no MT!";
            }
            if (z) {
                C1044Mm.e("nf_msl", "Saw an unexpected KeyResponseData result!: " + str);
                return;
            }
            C1044Mm.e("nf_msl", "Got a KeyResponseData of type: " + str3);
        }
    }
}
