package o;

/* renamed from: o.aWe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2001aWe {
    private String b;
    private boolean c;
    private String d;
    private String e;

    public boolean a() {
        return this.c;
    }

    public C2001aWe(String str, String str2, String str3, boolean z) {
        this.e = str;
        this.b = str2;
        this.d = str3;
        this.c = z;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2001aWe) {
            C2001aWe c2001aWe = (C2001aWe) obj;
            if (C8168dfL.d(this.e, c2001aWe.e) && C8168dfL.d(this.b, c2001aWe.b) && C8168dfL.d(this.d, c2001aWe.d) && this.c == c2001aWe.c) {
                return true;
            }
        }
        return false;
    }
}
