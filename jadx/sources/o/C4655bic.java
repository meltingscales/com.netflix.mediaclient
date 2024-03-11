package o;

/* renamed from: o.bic  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4655bic implements Comparable<C4655bic> {
    public final long a;
    private boolean b = false;
    private final a c;
    public final boolean d;
    private final boolean e;

    /* renamed from: o.bic$a */
    /* loaded from: classes3.dex */
    public interface a {
        void e(String str, String str2, long j);
    }

    public void a() {
        this.b = false;
    }

    public boolean e() {
        return this.b;
    }

    public C4655bic(a aVar, long j, boolean z, boolean z2) {
        this.c = aVar;
        this.a = j;
        this.d = z;
        this.e = z2;
    }

    public boolean a(String str, String str2, long j) {
        if (this.b || j > this.a + 50) {
            return false;
        }
        if (!this.e || str2 == null) {
            this.c.e(str, str2, j);
            this.b = true;
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(C4655bic c4655bic) {
        int i = (this.a > c4655bic.a ? 1 : (this.a == c4655bic.a ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        return i < 0 ? -1 : 0;
    }
}
