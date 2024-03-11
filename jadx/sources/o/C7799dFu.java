package o;

import java.util.Arrays;
import o.AbstractC7716dCs;

/* renamed from: o.dFu  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7799dFu {
    private int b;
    private int[] c;
    private Object[] e = new Object[8];

    public C7799dFu() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.c = iArr;
        this.b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dFu$d */
    /* loaded from: classes5.dex */
    public static final class d {
        public static final d b = new d();

        private d() {
        }
    }

    public final void c(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        int i = this.b + 1;
        this.b = i;
        if (i == this.e.length) {
            a();
        }
        this.e[i] = interfaceC7707dCj;
    }

    public final void b(int i) {
        this.c[this.b] = i;
    }

    public final void c(Object obj) {
        int[] iArr = this.c;
        int i = this.b;
        if (iArr[i] != -2) {
            int i2 = i + 1;
            this.b = i2;
            if (i2 == this.e.length) {
                a();
            }
        }
        Object[] objArr = this.e;
        int i3 = this.b;
        objArr[i3] = obj;
        this.c[i3] = -2;
    }

    public final void c() {
        int[] iArr = this.c;
        int i = this.b;
        if (iArr[i] == -2) {
            this.e[i] = d.b;
        }
    }

    public final void b() {
        int i = this.b;
        int[] iArr = this.c;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            this.b = i - 1;
        }
        int i2 = this.b;
        if (i2 != -1) {
            this.b = i2 - 1;
        }
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i = this.b;
        for (int i2 = 0; i2 < i + 1; i2++) {
            Object obj = this.e[i2];
            if (obj instanceof InterfaceC7707dCj) {
                InterfaceC7707dCj interfaceC7707dCj = (InterfaceC7707dCj) obj;
                if (C8632dsu.c(interfaceC7707dCj.b(), AbstractC7716dCs.c.d)) {
                    if (this.c[i2] != -1) {
                        sb.append("[");
                        sb.append(this.c[i2]);
                        sb.append("]");
                    }
                } else {
                    int i3 = this.c[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(interfaceC7707dCj.a(i3));
                    }
                }
            } else if (obj != d.b) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append("]");
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    private final void a() {
        int i = this.b * 2;
        Object[] copyOf = Arrays.copyOf(this.e, i);
        C8632dsu.a(copyOf, "");
        this.e = copyOf;
        int[] copyOf2 = Arrays.copyOf(this.c, i);
        C8632dsu.a(copyOf2, "");
        this.c = copyOf2;
    }

    public String toString() {
        return e();
    }
}
