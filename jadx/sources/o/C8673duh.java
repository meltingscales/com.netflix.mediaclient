package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.duh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8673duh implements dtQ<C8654dtp> {
    private final CharSequence a;
    private final int c;
    private final int d;
    private final drX<CharSequence, Integer, Pair<Integer, Integer>> e;

    /* JADX WARN: Multi-variable type inference failed */
    public C8673duh(CharSequence charSequence, int i, int i2, drX<? super CharSequence, ? super Integer, Pair<Integer, Integer>> drx) {
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) drx, "");
        this.a = charSequence;
        this.d = i;
        this.c = i2;
        this.e = drx;
    }

    /* renamed from: o.duh$a */
    /* loaded from: classes.dex */
    public static final class a implements Iterator<C8654dtp>, dsK {
        private int a;
        private int b;
        private C8654dtp d;
        private int e;
        private int h = -1;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        a() {
            int c;
            c = C8657dts.c(C8673duh.this.d, 0, C8673duh.this.a.length());
            this.e = c;
            this.b = c;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r0 < r6.c.c) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void e() {
            /*
                r6 = this;
                int r0 = r6.b
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.h = r1
                r0 = 0
                r6.d = r0
                goto L9e
            Lc:
                o.duh r0 = o.C8673duh.this
                int r0 = o.C8673duh.b(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.a
                int r0 = r0 + r3
                r6.a = r0
                o.duh r4 = o.C8673duh.this
                int r4 = o.C8673duh.b(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.b
                o.duh r4 = o.C8673duh.this
                java.lang.CharSequence r4 = o.C8673duh.d(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                o.dtp r0 = new o.dtp
                int r1 = r6.e
                o.duh r4 = o.C8673duh.this
                java.lang.CharSequence r4 = o.C8673duh.d(r4)
                int r4 = o.C8684dus.d(r4)
                r0.<init>(r1, r4)
                r6.d = r0
                r6.b = r2
                goto L9c
            L47:
                o.duh r0 = o.C8673duh.this
                o.drX r0 = o.C8673duh.e(r0)
                o.duh r4 = o.C8673duh.this
                java.lang.CharSequence r4 = o.C8673duh.d(r4)
                int r5 = r6.b
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L77
                o.dtp r0 = new o.dtp
                int r1 = r6.e
                o.duh r4 = o.C8673duh.this
                java.lang.CharSequence r4 = o.C8673duh.d(r4)
                int r4 = o.C8684dus.d(r4)
                r0.<init>(r1, r4)
                r6.d = r0
                r6.b = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.b()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.c()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.e
                o.dtp r4 = o.C8653dto.d(r4, r2)
                r6.d = r4
                int r2 = r2 + r0
                r6.e = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.b = r2
            L9c:
                r6.h = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C8673duh.a.e():void");
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public C8654dtp next() {
            if (this.h == -1) {
                e();
            }
            if (this.h == 0) {
                throw new NoSuchElementException();
            }
            C8654dtp c8654dtp = this.d;
            C8632dsu.d(c8654dtp);
            this.d = null;
            this.h = -1;
            return c8654dtp;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.h == -1) {
                e();
            }
            return this.h == 1;
        }
    }

    @Override // o.dtQ
    public Iterator<C8654dtp> iterator() {
        return new a();
    }
}
