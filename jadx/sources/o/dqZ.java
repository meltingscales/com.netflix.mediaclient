package o;

import kotlin.coroutines.EmptyCoroutineContext;
import o.C8632dsu;
import o.dqY;
import o.dqZ;

/* loaded from: classes.dex */
public interface dqZ {

    /* loaded from: classes5.dex */
    public interface d<E extends b> {
    }

    <R> R fold(R r, drX<? super R, ? super b, ? extends R> drx);

    <E extends b> E get(d<E> dVar);

    dqZ minusKey(d<?> dVar);

    dqZ plus(dqZ dqz);

    /* loaded from: classes5.dex */
    public static final class c {
        public static dqZ d(dqZ dqz, dqZ dqz2) {
            C8632dsu.c((Object) dqz2, "");
            return dqz2 == EmptyCoroutineContext.e ? dqz : (dqZ) dqz2.fold(dqz, new drX<dqZ, b, dqZ>() { // from class: kotlin.coroutines.CoroutineContext$plus$1
                @Override // o.drX
                /* renamed from: a */
                public final dqZ invoke(dqZ dqz3, dqZ.b bVar) {
                    CombinedContext combinedContext;
                    C8632dsu.c((Object) dqz3, "");
                    C8632dsu.c((Object) bVar, "");
                    dqZ minusKey = dqz3.minusKey(bVar.getKey());
                    EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.e;
                    if (minusKey == emptyCoroutineContext) {
                        return bVar;
                    }
                    dqY.b bVar2 = dqY.d;
                    dqY dqy = (dqY) minusKey.get(bVar2);
                    if (dqy == null) {
                        combinedContext = new CombinedContext(minusKey, bVar);
                    } else {
                        dqZ minusKey2 = minusKey.minusKey(bVar2);
                        if (minusKey2 == emptyCoroutineContext) {
                            return new CombinedContext(bVar, dqy);
                        }
                        combinedContext = new CombinedContext(new CombinedContext(minusKey2, bVar), dqy);
                    }
                    return combinedContext;
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public interface b extends dqZ {
        @Override // o.dqZ
        <E extends b> E get(d<E> dVar);

        d<?> getKey();

        /* loaded from: classes5.dex */
        public static final class e {
            public static dqZ d(b bVar, dqZ dqz) {
                C8632dsu.c((Object) dqz, "");
                return c.d(bVar, dqz);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, d<E> dVar) {
                C8632dsu.c((Object) dVar, "");
                if (C8632dsu.c(bVar.getKey(), dVar)) {
                    C8632dsu.d(bVar);
                    return bVar;
                }
                return null;
            }

            public static <R> R d(b bVar, R r, drX<? super R, ? super b, ? extends R> drx) {
                C8632dsu.c((Object) drx, "");
                return drx.invoke(r, bVar);
            }

            public static dqZ a(b bVar, d<?> dVar) {
                C8632dsu.c((Object) dVar, "");
                return C8632dsu.c(bVar.getKey(), dVar) ? EmptyCoroutineContext.e : bVar;
            }
        }
    }
}
