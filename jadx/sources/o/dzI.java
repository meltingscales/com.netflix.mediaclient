package o;

import java.util.Arrays;
import kotlin.Result;
import o.dzF;

/* loaded from: classes5.dex */
public abstract class dzI<S extends dzF<?>> {
    private int a;
    private S[] c;
    private int d;
    private C7644dAa e;

    protected abstract S[] b(int i);

    protected abstract S c();

    public final int f() {
        return this.a;
    }

    public final S[] i() {
        return this.c;
    }

    public static final /* synthetic */ dzF[] d(dzI dzi) {
        return dzi.c;
    }

    public static final /* synthetic */ int e(dzI dzi) {
        return dzi.a;
    }

    public final InterfaceC8822dzv<Integer> e() {
        C7644dAa c7644dAa;
        synchronized (this) {
            c7644dAa = this.e;
            if (c7644dAa == null) {
                c7644dAa = new C7644dAa(this.a);
                this.e = c7644dAa;
            }
        }
        return c7644dAa;
    }

    public final S g() {
        S s;
        C7644dAa c7644dAa;
        synchronized (this) {
            S[] sArr = this.c;
            if (sArr == null) {
                sArr = b(2);
                this.c = sArr;
            } else if (this.a >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                C8632dsu.a(copyOf, "");
                this.c = (S[]) ((dzF[]) copyOf);
                sArr = (S[]) ((dzF[]) copyOf);
            }
            int i = this.d;
            do {
                s = sArr[i];
                if (s == null) {
                    s = c();
                    sArr[i] = s;
                }
                i++;
                if (i >= sArr.length) {
                    i = 0;
                }
                C8632dsu.d(s);
            } while (!s.e(this));
            this.d = i;
            this.a++;
            c7644dAa = this.e;
        }
        if (c7644dAa != null) {
            c7644dAa.e(1);
        }
        return s;
    }

    public final void b(S s) {
        C7644dAa c7644dAa;
        int i;
        InterfaceC8585dra<dpR>[] a;
        synchronized (this) {
            int i2 = this.a - 1;
            this.a = i2;
            c7644dAa = this.e;
            if (i2 == 0) {
                this.d = 0;
            }
            C8632dsu.d(s);
            a = s.a(this);
        }
        for (InterfaceC8585dra<dpR> interfaceC8585dra : a) {
            if (interfaceC8585dra != null) {
                Result.c cVar = Result.e;
                interfaceC8585dra.resumeWith(Result.e(dpR.c));
            }
        }
        if (c7644dAa != null) {
            c7644dAa.e(-1);
        }
    }
}
