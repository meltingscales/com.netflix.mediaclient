package o;

import org.json.JSONObject;

/* renamed from: o.aWi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2005aWi implements InterfaceC5123bsn {
    protected static String a = "isDVHDRSupported";
    protected static String b = "isUHDAHDRSupported";
    protected static String c = "is5dot1Supported";
    protected static String d = "autoAdvanceMax";
    protected static String e = "isHdSupported";
    protected static String f = "volumeStep";
    protected static String h = "volumeControl";
    protected static String i = "mediaVolumeControl";
    protected static String j = "isUltraHdSupported";
    private int g;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13452o;
    private boolean p;
    private boolean r;
    private int s;

    public boolean a() {
        return this.p;
    }

    @Override // o.InterfaceC5123bsn
    public boolean b() {
        return this.l;
    }

    @Override // o.InterfaceC5123bsn
    public boolean c() {
        return this.f13452o;
    }

    @Override // o.InterfaceC5123bsn
    public boolean d() {
        return this.k;
    }

    @Override // o.InterfaceC5123bsn
    public boolean e() {
        return this.m;
    }

    public boolean h() {
        return this.r;
    }

    @Override // o.InterfaceC5123bsn
    public boolean i() {
        return this.n;
    }

    public C2005aWi(String str) {
        this(new JSONObject(str));
    }

    public C2005aWi(JSONObject jSONObject) {
        this.f13452o = C8123deT.a(jSONObject, e, false);
        this.l = C8123deT.a(jSONObject, c, false);
        this.n = C8123deT.a(jSONObject, j, false);
        this.g = C8123deT.a(jSONObject, d, 0);
        if (jSONObject.has(h)) {
            this.r = jSONObject.getBoolean(h);
        }
        if (jSONObject.has(i)) {
            this.p = jSONObject.getBoolean(i);
        }
        if (jSONObject.has(f)) {
            this.s = jSONObject.getInt(f);
        }
        this.m = C8123deT.a(jSONObject, b, false);
        this.k = C8123deT.a(jSONObject, a, false);
    }

    public String toString() {
        return "MdxTargetCapabilities [isHdSupported=" + this.f13452o + ", is5dot1Supported=" + this.l + ", autoAdvanceMax=" + this.g + ", volumeControl=" + this.r + ", volumeStep=" + this.s + ", isUltraHdSupported=" + this.n + ", isHdr10Supported=" + this.m + ", isDolbyVisionSupported=" + this.k + "]";
    }
}
