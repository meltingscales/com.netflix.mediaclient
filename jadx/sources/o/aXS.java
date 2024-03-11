package o;

/* loaded from: classes3.dex */
public final class aXS extends AbstractC2049aXz {
    private int a;

    public int c() {
        return this.a;
    }

    public aXS(String str, int i, boolean z) {
        super("PLAYER_SET_VOLUME");
        c("xid", str);
        a("volume", i);
        if (z) {
            a("useMediaVolume", true);
        }
        this.a = i;
    }
}
