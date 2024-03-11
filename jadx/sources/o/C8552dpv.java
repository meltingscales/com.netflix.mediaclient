package o;

import org.chromium.net.PrivateKeyType;

/* renamed from: o.dpv  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8552dpv implements Comparable<C8552dpv> {
    private final int c;
    private final int d;
    private final int e;
    private final int g;
    public static final c b = new c(null);
    public static final C8552dpv a = C8551dpu.a();

    public int hashCode() {
        return this.g;
    }

    public C8552dpv(int i, int i2, int i3) {
        this.e = i;
        this.c = i2;
        this.d = i3;
        this.g = e(i, i2, i3);
    }

    private final int e(int i, int i2, int i3) {
        if (new C8654dtp(0, PrivateKeyType.INVALID).a(i) && new C8654dtp(0, PrivateKeyType.INVALID).a(i2) && new C8654dtp(0, PrivateKeyType.INVALID).a(i3)) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append('.');
        sb.append(this.c);
        sb.append('.');
        sb.append(this.d);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C8552dpv c8552dpv = obj instanceof C8552dpv ? (C8552dpv) obj : null;
        return c8552dpv != null && this.g == c8552dpv.g;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C8552dpv c8552dpv) {
        C8632dsu.c((Object) c8552dpv, "");
        return this.g - c8552dpv.g;
    }

    /* renamed from: o.dpv$c */
    /* loaded from: classes6.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
