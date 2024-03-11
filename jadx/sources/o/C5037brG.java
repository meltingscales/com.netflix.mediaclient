package o;

/* renamed from: o.brG  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5037brG {
    Long a;
    public String b;

    public void c() {
        this.a = Long.valueOf(C8170dfN.d());
    }

    public String e() {
        if (this.a == null || C8170dfN.d() > this.a.longValue() + 28800000) {
            return null;
        }
        return this.b;
    }
}
