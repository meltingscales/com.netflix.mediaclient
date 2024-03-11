package o;

/* renamed from: o.kW  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9168kW {
    private final String a;
    private final String e;

    public C9168kW() {
        this(null, null, 3, null);
    }

    public final String a() {
        return this.a;
    }

    public final String e() {
        return this.e;
    }

    public C9168kW(String str, String str2) {
        this.e = str;
        this.a = str2;
    }

    public /* synthetic */ C9168kW(String str, String str2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? "https://notify.bugsnag.com" : str, (i & 2) != 0 ? "https://sessions.bugsnag.com" : str2);
    }
}
