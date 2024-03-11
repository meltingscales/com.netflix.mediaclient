package o;

import java.util.List;

/* renamed from: o.bgT  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4540bgT implements Comparable<C4540bgT> {
    private final long a;
    private final String b;
    private int c;
    private int d;
    private int e;
    private String[] f;
    private int i;

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C4540bgT c4540bgT) {
        return this == c4540bgT ? 0 : 1;
    }

    public String[] b() {
        return this.f;
    }

    public long c() {
        return this.a;
    }

    public String e() {
        return this.b;
    }

    public C4540bgT(AbstractC4541bgU abstractC4541bgU) {
        this.b = abstractC4541bgU.e();
        this.a = abstractC4541bgU.g();
        this.i = abstractC4541bgU.i();
        this.d = abstractC4541bgU.d();
        this.c = abstractC4541bgU.c();
        this.e = abstractC4541bgU.h();
        List<String> j = abstractC4541bgU.j();
        this.f = (String[]) j.toArray(new String[j.size()]);
    }

    public float d() {
        int i = this.e;
        if (i != 0) {
            return this.c / i;
        }
        return 0.0f;
    }

    public boolean a() {
        String[] strArr;
        return this.b != null && (strArr = this.f) != null && strArr.length > 0 && C8168dfL.h(strArr[0]);
    }

    public String toString() {
        return "TrickplayUrl: width=" + this.i + ", height=" + this.d + " aspect=" + (this.c / this.e) + ", url:" + this.f;
    }
}
