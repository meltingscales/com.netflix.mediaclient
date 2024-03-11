package o;

import java.util.Arrays;
import kotlin.Result;
import kotlinx.coroutines.channels.BufferOverflow;

/* renamed from: o.dzr  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8818dzr<T> extends dzI<C8816dzp> implements InterfaceC8810dzj<T>, dyP<T>, dzU<T> {
    private int a;
    private final BufferOverflow b;
    private final int c;
    private Object[] d;
    private long e;
    private long f;
    private int h;
    private final int i;

    /* renamed from: o.dzr$c */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            e = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int s() {
        return this.a + this.h;
    }

    @Override // o.InterfaceC8814dzn, o.dyS
    public Object collect(dyQ<? super T> dyq, InterfaceC8585dra<?> interfaceC8585dra) {
        return b(this, dyq, interfaceC8585dra);
    }

    @Override // o.InterfaceC8810dzj, o.dyQ
    public Object emit(T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return e(this, t, interfaceC8585dra);
    }

    public final long h() {
        long j = this.f;
        if (j < this.e) {
            this.e = j;
        }
        return j;
    }

    public C8818dzr(int i, int i2, BufferOverflow bufferOverflow) {
        this.i = i;
        this.c = i2;
        this.b = bufferOverflow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long k() {
        return Math.min(this.e, this.f);
    }

    private final int n() {
        return (int) ((k() + this.a) - this.f);
    }

    private final long m() {
        return k() + this.a;
    }

    private final long o() {
        return k() + this.a + this.h;
    }

    public final T j() {
        Object d;
        Object[] objArr = this.d;
        C8632dsu.d(objArr);
        d = C8820dzt.d(objArr, (this.f + n()) - 1);
        return (T) d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ <T> java.lang.Object b(o.C8818dzr<T> r8, o.dyQ<? super T> r9, o.InterfaceC8585dra<?> r10) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8818dzr.b(o.dzr, o.dyQ, o.dra):java.lang.Object");
    }

    @Override // o.InterfaceC8810dzj
    public boolean a(T t) {
        int i;
        boolean z;
        InterfaceC8585dra<dpR>[] interfaceC8585draArr = dzG.e;
        synchronized (this) {
            if (c((C8818dzr<T>) t)) {
                interfaceC8585draArr = d(interfaceC8585draArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (InterfaceC8585dra<dpR> interfaceC8585dra : interfaceC8585draArr) {
            if (interfaceC8585dra != null) {
                Result.c cVar = Result.e;
                interfaceC8585dra.resumeWith(Result.e(dpR.c));
            }
        }
        return z;
    }

    static /* synthetic */ <T> Object e(C8818dzr<T> c8818dzr, T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        if (c8818dzr.a((C8818dzr<T>) t)) {
            return dpR.c;
        }
        Object c2 = c8818dzr.c((C8818dzr<T>) t, interfaceC8585dra);
        e = C8586drb.e();
        return c2 == e ? c2 : dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c(T t) {
        if (f() == 0) {
            return e((C8818dzr<T>) t);
        }
        if (this.a >= this.c && this.e <= this.f) {
            int i = c.e[this.b.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        d(t);
        int i2 = this.a + 1;
        this.a = i2;
        if (i2 > this.c) {
            l();
        }
        if (n() > this.i) {
            d(this.f + 1, this.e, m(), o());
        }
        return true;
    }

    private final boolean e(T t) {
        if (this.i == 0) {
            return true;
        }
        d(t);
        int i = this.a + 1;
        this.a = i;
        if (i > this.i) {
            l();
        }
        this.e = k() + this.a;
        return true;
    }

    private final void l() {
        Object[] objArr = this.d;
        C8632dsu.d(objArr);
        C8820dzt.b(objArr, k(), null);
        this.a--;
        long k = k() + 1;
        if (this.f < k) {
            this.f = k;
        }
        if (this.e < k) {
            a(k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Object obj) {
        int s = s();
        Object[] objArr = this.d;
        if (objArr == null) {
            objArr = e((Object[]) null, 0, 2);
        } else if (s >= objArr.length) {
            objArr = e(objArr, s, objArr.length * 2);
        }
        C8820dzt.b(objArr, k() + s, obj);
    }

    private final Object[] e(Object[] objArr, int i, int i2) {
        Object d;
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i2];
        this.d = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long k = k();
        for (int i3 = 0; i3 < i; i3++) {
            long j = i3 + k;
            d = C8820dzt.d(objArr, j);
            C8820dzt.b(objArr2, j, d);
        }
        return objArr2;
    }

    public final InterfaceC8585dra<dpR>[] d(long j) {
        long j2;
        long j3;
        Object d;
        Object d2;
        long j4;
        dzF[] d3;
        if (j > this.e) {
            return dzG.e;
        }
        long k = k();
        long j5 = this.a + k;
        if (this.c == 0 && this.h > 0) {
            j5++;
        }
        if (dzI.e(this) != 0 && (d3 = dzI.d(this)) != null) {
            for (dzF dzf : d3) {
                if (dzf != null) {
                    long j6 = ((C8816dzp) dzf).b;
                    if (j6 >= 0 && j6 < j5) {
                        j5 = j6;
                    }
                }
            }
        }
        if (j5 <= this.e) {
            return dzG.e;
        }
        long m = m();
        int min = f() > 0 ? Math.min(this.h, this.c - ((int) (m - j5))) : this.h;
        InterfaceC8585dra<dpR>[] interfaceC8585draArr = dzG.e;
        long j7 = this.h + m;
        if (min > 0) {
            interfaceC8585draArr = new InterfaceC8585dra[min];
            Object[] objArr = this.d;
            C8632dsu.d(objArr);
            long j8 = m;
            int i = 0;
            while (true) {
                if (m >= j7) {
                    j2 = j5;
                    j3 = j7;
                    break;
                }
                d2 = C8820dzt.d(objArr, m);
                j2 = j5;
                dAH dah = C8820dzt.e;
                if (d2 != dah) {
                    C8632dsu.d(d2);
                    b bVar = (b) d2;
                    int i2 = i + 1;
                    j3 = j7;
                    interfaceC8585draArr[i] = bVar.a;
                    C8820dzt.b(objArr, m, dah);
                    C8820dzt.b(objArr, j8, bVar.c);
                    j4 = 1;
                    j8++;
                    if (i2 >= min) {
                        break;
                    }
                    i = i2;
                } else {
                    j3 = j7;
                    j4 = 1;
                }
                m += j4;
                j5 = j2;
                j7 = j3;
            }
            m = j8;
        } else {
            j2 = j5;
            j3 = j7;
        }
        int i3 = (int) (m - k);
        long j9 = f() == 0 ? m : j2;
        long max = Math.max(this.f, m - Math.min(this.i, i3));
        if (this.c == 0 && max < j3) {
            Object[] objArr2 = this.d;
            C8632dsu.d(objArr2);
            d = C8820dzt.d(objArr2, max);
            if (C8632dsu.c(d, C8820dzt.e)) {
                m++;
                max++;
            }
        }
        d(max, j9, m, j3);
        b();
        return (interfaceC8585draArr.length == 0) ^ true ? d(interfaceC8585draArr) : interfaceC8585draArr;
    }

    private final void d(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long k = k(); k < min; k++) {
            Object[] objArr = this.d;
            C8632dsu.d(objArr);
            C8820dzt.b(objArr, k, null);
        }
        this.f = j;
        this.e = j2;
        this.a = (int) (j3 - min);
        this.h = (int) (j4 - j3);
    }

    private final void b() {
        Object d;
        if (this.c != 0 || this.h > 1) {
            Object[] objArr = this.d;
            C8632dsu.d(objArr);
            while (this.h > 0) {
                d = C8820dzt.d(objArr, (k() + s()) - 1);
                if (d != C8820dzt.e) {
                    return;
                }
                this.h--;
                C8820dzt.b(objArr, k() + s(), null);
            }
        }
    }

    private final Object e(C8816dzp c8816dzp) {
        Object obj;
        InterfaceC8585dra<dpR>[] interfaceC8585draArr = dzG.e;
        synchronized (this) {
            long b2 = b(c8816dzp);
            if (b2 < 0) {
                obj = C8820dzt.e;
            } else {
                long j = c8816dzp.b;
                Object e = e(b2);
                c8816dzp.b = b2 + 1;
                interfaceC8585draArr = d(j);
                obj = e;
            }
        }
        for (InterfaceC8585dra<dpR> interfaceC8585dra : interfaceC8585draArr) {
            if (interfaceC8585dra != null) {
                Result.c cVar = Result.e;
                interfaceC8585dra.resumeWith(Result.e(dpR.c));
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long b(C8816dzp c8816dzp) {
        long j = c8816dzp.b;
        if (j < m()) {
            return j;
        }
        if (this.c <= 0 && j <= k() && this.h != 0) {
            return j;
        }
        return -1L;
    }

    private final Object e(long j) {
        Object d;
        Object[] objArr = this.d;
        C8632dsu.d(objArr);
        d = C8820dzt.d(objArr, j);
        return d instanceof b ? ((b) d).c : d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final InterfaceC8585dra<dpR>[] d(InterfaceC8585dra<dpR>[] interfaceC8585draArr) {
        dzF[] d;
        C8816dzp c8816dzp;
        InterfaceC8585dra<? super dpR> interfaceC8585dra;
        int length = interfaceC8585draArr.length;
        if (dzI.e(this) != 0 && (d = dzI.d(this)) != null) {
            int length2 = d.length;
            int i = 0;
            interfaceC8585draArr = interfaceC8585draArr;
            while (i < length2) {
                dzF dzf = d[i];
                if (dzf != null && (interfaceC8585dra = (c8816dzp = (C8816dzp) dzf).a) != null && b(c8816dzp) >= 0) {
                    int length3 = interfaceC8585draArr.length;
                    interfaceC8585draArr = interfaceC8585draArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(interfaceC8585draArr, Math.max(2, interfaceC8585draArr.length * 2));
                        C8632dsu.a((Object) copyOf, "");
                        interfaceC8585draArr = copyOf;
                    }
                    interfaceC8585draArr[length] = interfaceC8585dra;
                    c8816dzp.a = null;
                    length++;
                }
                i++;
                interfaceC8585draArr = interfaceC8585draArr;
            }
        }
        return interfaceC8585draArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dzI
    /* renamed from: d */
    public C8816dzp c() {
        return new C8816dzp();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dzI
    /* renamed from: a */
    public C8816dzp[] b(int i) {
        return new C8816dzp[i];
    }

    @Override // o.dzU
    public dyS<T> a(dqZ dqz, int i, BufferOverflow bufferOverflow) {
        return C8820dzt.d(this, dqz, i, bufferOverflow);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dzr$b */
    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC8760dxn {
        public final InterfaceC8585dra<dpR> a;
        public final Object c;
        public final C8818dzr<?> d;
        public long e;

        /* JADX WARN: Multi-variable type inference failed */
        public b(C8818dzr<?> c8818dzr, long j, Object obj, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            this.d = c8818dzr;
            this.e = j;
            this.c = obj;
            this.a = interfaceC8585dra;
        }

        @Override // o.InterfaceC8760dxn
        public void co_() {
            this.d.c(this);
        }
    }

    private final void a(long j) {
        dzF[] d;
        if (dzI.e(this) != 0 && (d = dzI.d(this)) != null) {
            for (dzF dzf : d) {
                if (dzf != null) {
                    C8816dzp c8816dzp = (C8816dzp) dzf;
                    long j2 = c8816dzp.b;
                    if (j2 >= 0 && j2 < j) {
                        c8816dzp.b = j;
                    }
                }
            }
        }
        this.e = j;
    }

    private final Object c(T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        InterfaceC8585dra b2;
        b bVar;
        Object e;
        Object e2;
        b2 = C8590drf.b(interfaceC8585dra);
        C8741dwv c8741dwv = new C8741dwv(b2, 1);
        c8741dwv.h();
        InterfaceC8585dra<dpR>[] interfaceC8585draArr = dzG.e;
        synchronized (this) {
            if (c((C8818dzr<T>) t)) {
                Result.c cVar = Result.e;
                c8741dwv.resumeWith(Result.e(dpR.c));
                interfaceC8585draArr = d(interfaceC8585draArr);
                bVar = null;
            } else {
                b bVar2 = new b(this, s() + k(), t, c8741dwv);
                d(bVar2);
                this.h++;
                if (this.c == 0) {
                    interfaceC8585draArr = d(interfaceC8585draArr);
                }
                bVar = bVar2;
            }
        }
        if (bVar != null) {
            dwB.d(c8741dwv, bVar);
        }
        for (InterfaceC8585dra<dpR> interfaceC8585dra2 : interfaceC8585draArr) {
            if (interfaceC8585dra2 != null) {
                Result.c cVar2 = Result.e;
                interfaceC8585dra2.resumeWith(Result.e(dpR.c));
            }
        }
        Object b3 = c8741dwv.b();
        e = C8586drb.e();
        if (b3 == e) {
            C8592drh.c(interfaceC8585dra);
        }
        e2 = C8586drb.e();
        return b3 == e2 ? b3 : dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(b bVar) {
        Object d;
        synchronized (this) {
            if (bVar.e < k()) {
                return;
            }
            Object[] objArr = this.d;
            C8632dsu.d(objArr);
            d = C8820dzt.d(objArr, bVar.e);
            if (d != bVar) {
                return;
            }
            C8820dzt.b(objArr, bVar.e, C8820dzt.e);
            b();
            dpR dpr = dpR.c;
        }
    }

    private final Object a(C8816dzp c8816dzp, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        InterfaceC8585dra b2;
        dpR dpr;
        Object e;
        Object e2;
        b2 = C8590drf.b(interfaceC8585dra);
        C8741dwv c8741dwv = new C8741dwv(b2, 1);
        c8741dwv.h();
        synchronized (this) {
            if (b(c8816dzp) >= 0) {
                Result.c cVar = Result.e;
                c8741dwv.resumeWith(Result.e(dpR.c));
            } else {
                c8816dzp.a = c8741dwv;
            }
            dpr = dpR.c;
        }
        Object b3 = c8741dwv.b();
        e = C8586drb.e();
        if (b3 == e) {
            C8592drh.c(interfaceC8585dra);
        }
        e2 = C8586drb.e();
        return b3 == e2 ? b3 : dpr;
    }

    @Override // o.InterfaceC8810dzj
    public void a() {
        synchronized (this) {
            d(m(), this.e, m(), o());
            dpR dpr = dpR.c;
        }
    }
}
