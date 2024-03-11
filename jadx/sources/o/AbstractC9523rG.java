package o;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import java.util.Arrays;

/* renamed from: o.rG  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9523rG {
    protected final boolean d;

    public abstract AbstractC9453pq<Object> c(Class<?> cls);

    public abstract AbstractC9523rG d(Class<?> cls, AbstractC9453pq<Object> abstractC9453pq);

    protected AbstractC9523rG(boolean z) {
        this.d = z;
    }

    protected AbstractC9523rG(AbstractC9523rG abstractC9523rG) {
        this.d = abstractC9523rG.d;
    }

    public final d d(Class<?> cls, AbstractC9459pw abstractC9459pw, BeanProperty beanProperty) {
        AbstractC9453pq<Object> a2 = abstractC9459pw.a(cls, beanProperty);
        return new d(a2, d(cls, a2));
    }

    public final d b(JavaType javaType, AbstractC9459pw abstractC9459pw, BeanProperty beanProperty) {
        AbstractC9453pq<Object> b2 = abstractC9459pw.b(javaType, beanProperty);
        return new d(b2, d(javaType.h(), b2));
    }

    public final d a(Class<?> cls, AbstractC9459pw abstractC9459pw, BeanProperty beanProperty) {
        AbstractC9453pq<Object> d2 = abstractC9459pw.d(cls, beanProperty);
        return new d(d2, d(cls, d2));
    }

    public final d e(JavaType javaType, AbstractC9459pw abstractC9459pw, BeanProperty beanProperty) {
        AbstractC9453pq<Object> d2 = abstractC9459pw.d(javaType, beanProperty);
        return new d(d2, d(javaType.h(), d2));
    }

    public final d e(Class<?> cls, AbstractC9459pw abstractC9459pw, BeanProperty beanProperty) {
        AbstractC9453pq<Object> e2 = abstractC9459pw.e(cls, beanProperty);
        return new d(e2, d(cls, e2));
    }

    public static AbstractC9523rG c() {
        return b.b;
    }

    /* renamed from: o.rG$d */
    /* loaded from: classes5.dex */
    public static final class d {
        public final AbstractC9453pq<Object> c;
        public final AbstractC9523rG d;

        public d(AbstractC9453pq<Object> abstractC9453pq, AbstractC9523rG abstractC9523rG) {
            this.c = abstractC9453pq;
            this.d = abstractC9523rG;
        }
    }

    /* renamed from: o.rG$i */
    /* loaded from: classes5.dex */
    static final class i {
        public final Class<?> a;
        public final AbstractC9453pq<Object> c;

        public i(Class<?> cls, AbstractC9453pq<Object> abstractC9453pq) {
            this.a = cls;
            this.c = abstractC9453pq;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.rG$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC9523rG {
        public static final b b = new b(false);
        public static final b a = new b(true);

        @Override // o.AbstractC9523rG
        public AbstractC9453pq<Object> c(Class<?> cls) {
            return null;
        }

        protected b(boolean z) {
            super(z);
        }

        @Override // o.AbstractC9523rG
        public AbstractC9523rG d(Class<?> cls, AbstractC9453pq<Object> abstractC9453pq) {
            return new c(this, cls, abstractC9453pq);
        }
    }

    /* renamed from: o.rG$c */
    /* loaded from: classes5.dex */
    static final class c extends AbstractC9523rG {
        private final AbstractC9453pq<Object> a;
        private final Class<?> b;

        @Override // o.AbstractC9523rG
        public AbstractC9453pq<Object> c(Class<?> cls) {
            if (cls == this.b) {
                return this.a;
            }
            return null;
        }

        public c(AbstractC9523rG abstractC9523rG, Class<?> cls, AbstractC9453pq<Object> abstractC9453pq) {
            super(abstractC9523rG);
            this.b = cls;
            this.a = abstractC9453pq;
        }

        @Override // o.AbstractC9523rG
        public AbstractC9523rG d(Class<?> cls, AbstractC9453pq<Object> abstractC9453pq) {
            return new e(this, this.b, this.a, cls, abstractC9453pq);
        }
    }

    /* renamed from: o.rG$e */
    /* loaded from: classes5.dex */
    static final class e extends AbstractC9523rG {
        private final Class<?> a;
        private final AbstractC9453pq<Object> b;
        private final Class<?> c;
        private final AbstractC9453pq<Object> e;

        @Override // o.AbstractC9523rG
        public AbstractC9453pq<Object> c(Class<?> cls) {
            if (cls == this.a) {
                return this.e;
            }
            if (cls == this.c) {
                return this.b;
            }
            return null;
        }

        public e(AbstractC9523rG abstractC9523rG, Class<?> cls, AbstractC9453pq<Object> abstractC9453pq, Class<?> cls2, AbstractC9453pq<Object> abstractC9453pq2) {
            super(abstractC9523rG);
            this.a = cls;
            this.e = abstractC9453pq;
            this.c = cls2;
            this.b = abstractC9453pq2;
        }

        @Override // o.AbstractC9523rG
        public AbstractC9523rG d(Class<?> cls, AbstractC9453pq<Object> abstractC9453pq) {
            return new a(this, new i[]{new i(this.a, this.e), new i(this.c, this.b), new i(cls, abstractC9453pq)});
        }
    }

    /* renamed from: o.rG$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC9523rG {
        private final i[] e;

        public a(AbstractC9523rG abstractC9523rG, i[] iVarArr) {
            super(abstractC9523rG);
            this.e = iVarArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0057 A[ORIG_RETURN, RETURN] */
        @Override // o.AbstractC9523rG
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public o.AbstractC9453pq<java.lang.Object> c(java.lang.Class<?> r4) {
            /*
                r3 = this;
                o.rG$i[] r0 = r3.e
                r1 = 0
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.a
                if (r2 != r4) goto Lc
                o.pq<java.lang.Object> r4 = r1.c
                return r4
            Lc:
                r1 = 1
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.a
                if (r2 != r4) goto L16
                o.pq<java.lang.Object> r4 = r1.c
                return r4
            L16:
                r1 = 2
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.a
                if (r2 != r4) goto L20
                o.pq<java.lang.Object> r4 = r1.c
                return r4
            L20:
                int r1 = r0.length
                switch(r1) {
                    case 4: goto L4d;
                    case 5: goto L43;
                    case 6: goto L39;
                    case 7: goto L2f;
                    case 8: goto L25;
                    default: goto L24;
                }
            L24:
                goto L57
            L25:
                r1 = 7
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.a
                if (r2 != r4) goto L2f
                o.pq<java.lang.Object> r4 = r1.c
                return r4
            L2f:
                r1 = 6
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.a
                if (r2 != r4) goto L39
                o.pq<java.lang.Object> r4 = r1.c
                return r4
            L39:
                r1 = 5
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.a
                if (r2 != r4) goto L43
                o.pq<java.lang.Object> r4 = r1.c
                return r4
            L43:
                r1 = 4
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.a
                if (r2 != r4) goto L4d
                o.pq<java.lang.Object> r4 = r1.c
                return r4
            L4d:
                r1 = 3
                r0 = r0[r1]
                java.lang.Class<?> r1 = r0.a
                if (r1 != r4) goto L57
                o.pq<java.lang.Object> r4 = r0.c
                return r4
            L57:
                r4 = 0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AbstractC9523rG.a.c(java.lang.Class):o.pq");
        }

        @Override // o.AbstractC9523rG
        public AbstractC9523rG d(Class<?> cls, AbstractC9453pq<Object> abstractC9453pq) {
            i[] iVarArr = this.e;
            int length = iVarArr.length;
            if (length == 8) {
                return this.d ? new c(this, cls, abstractC9453pq) : this;
            }
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, length + 1);
            iVarArr2[length] = new i(cls, abstractC9453pq);
            return new a(this, iVarArr2);
        }
    }
}
