package o;

/* loaded from: classes3.dex */
public class GR {
    private boolean c;
    private int e;

    public boolean a() {
        return this.c;
    }

    public int e() {
        return this.e;
    }

    public GR() {
        this(10000, false);
    }

    public GR(int i, boolean z) {
        this.e = i;
        this.c = z;
    }

    public String toString() {
        return getClass().getSimpleName() + "{launchTimeoutMs=" + e() + ",useStrictSpec=" + a() + "}";
    }
}
