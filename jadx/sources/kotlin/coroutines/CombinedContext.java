package kotlin.coroutines;

import java.io.Serializable;
import kotlin.jvm.internal.Ref;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.dqZ;
import o.drX;

/* loaded from: classes5.dex */
public final class CombinedContext implements dqZ, Serializable {
    private final dqZ b;
    private final dqZ.b e;

    public CombinedContext(dqZ dqz, dqZ.b bVar) {
        C8632dsu.c((Object) dqz, "");
        C8632dsu.c((Object) bVar, "");
        this.b = dqz;
        this.e = bVar;
    }

    @Override // o.dqZ
    public dqZ plus(dqZ dqz) {
        return dqZ.c.d(this, dqz);
    }

    @Override // o.dqZ
    public <E extends dqZ.b> E get(dqZ.d<E> dVar) {
        C8632dsu.c((Object) dVar, "");
        CombinedContext combinedContext = this;
        while (true) {
            E e = (E) combinedContext.e.get(dVar);
            if (e != null) {
                return e;
            }
            dqZ dqz = combinedContext.b;
            if (dqz instanceof CombinedContext) {
                combinedContext = (CombinedContext) dqz;
            } else {
                return (E) dqz.get(dVar);
            }
        }
    }

    @Override // o.dqZ
    public <R> R fold(R r, drX<? super R, ? super dqZ.b, ? extends R> drx) {
        C8632dsu.c((Object) drx, "");
        return drx.invoke((Object) this.b.fold(r, drx), this.e);
    }

    @Override // o.dqZ
    public dqZ minusKey(dqZ.d<?> dVar) {
        C8632dsu.c((Object) dVar, "");
        if (this.e.get(dVar) != null) {
            return this.b;
        }
        dqZ minusKey = this.b.minusKey(dVar);
        return minusKey == this.b ? this : minusKey == EmptyCoroutineContext.e ? this.e : new CombinedContext(minusKey, this.e);
    }

    private final int b() {
        int i = 2;
        CombinedContext combinedContext = this;
        while (true) {
            dqZ dqz = combinedContext.b;
            combinedContext = dqz instanceof CombinedContext ? (CombinedContext) dqz : null;
            if (combinedContext == null) {
                return i;
            }
            i++;
        }
    }

    private final boolean a(dqZ.b bVar) {
        return C8632dsu.c(get(bVar.getKey()), bVar);
    }

    private final boolean b(CombinedContext combinedContext) {
        while (a(combinedContext.e)) {
            dqZ dqz = combinedContext.b;
            if (dqz instanceof CombinedContext) {
                combinedContext = (CombinedContext) dqz;
            } else {
                C8632dsu.d(dqz);
                return a((dqZ.b) dqz);
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CombinedContext) {
                CombinedContext combinedContext = (CombinedContext) obj;
                if (combinedContext.b() != b() || !combinedContext.b(this)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.b.hashCode() + this.e.hashCode();
    }

    public String toString() {
        return '[' + ((String) fold("", new drX<String, dqZ.b, String>() { // from class: kotlin.coroutines.CombinedContext$toString$1
            @Override // o.drX
            /* renamed from: c */
            public final String invoke(String str, dqZ.b bVar) {
                C8632dsu.c((Object) str, "");
                C8632dsu.c((Object) bVar, "");
                if (str.length() == 0) {
                    return bVar.toString();
                }
                return str + ", " + bVar;
            }
        })) + ']';
    }

    private final Object writeReplace() {
        int b = b();
        final dqZ[] dqzArr = new dqZ[b];
        final Ref.IntRef intRef = new Ref.IntRef();
        fold(dpR.c, new drX<dpR, dqZ.b, dpR>() { // from class: kotlin.coroutines.CombinedContext$writeReplace$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(dpR dpr, dqZ.b bVar) {
                C8632dsu.c((Object) dpr, "");
                C8632dsu.c((Object) bVar, "");
                dqZ[] dqzArr2 = dqzArr;
                Ref.IntRef intRef2 = intRef;
                int i = intRef2.b;
                intRef2.b = i + 1;
                dqzArr2[i] = bVar;
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(dpR dpr, dqZ.b bVar) {
                a(dpr, bVar);
                return dpR.c;
            }
        });
        if (intRef.b != b) {
            throw new IllegalStateException("Check failed.".toString());
        }
        return new Serialized(dqzArr);
    }

    /* loaded from: classes6.dex */
    static final class Serialized implements Serializable {
        public static final b a = new b(null);
        private static final long serialVersionUID = 0;
        private final dqZ[] b;

        /* loaded from: classes6.dex */
        public static final class b {
            public /* synthetic */ b(C8627dsp c8627dsp) {
                this();
            }

            private b() {
            }
        }

        public Serialized(dqZ[] dqzArr) {
            C8632dsu.c((Object) dqzArr, "");
            this.b = dqzArr;
        }

        private final Object readResolve() {
            dqZ[] dqzArr = this.b;
            dqZ dqz = EmptyCoroutineContext.e;
            for (dqZ dqz2 : dqzArr) {
                dqz = dqz.plus(dqz2);
            }
            return dqz;
        }
    }
}
