package o;

/* renamed from: o.bpt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4970bpt {
    public int b;
    public String d;
    public int e;

    public void b(int i, int i2) {
        this.e += i;
        this.b += i2;
    }

    public C4970bpt(String str, int i, int i2) {
        this.d = str;
        this.e = i;
        this.b = i2;
    }

    public String toString() {
        return "SubtitleQoe{downloadableId='" + this.d + "', expectedToShow=" + this.e + ", displayed=" + this.b + '}';
    }
}
