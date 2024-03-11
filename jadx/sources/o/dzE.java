package o;

/* loaded from: classes5.dex */
public final class dzE {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> dyQ<T> b(dyQ<? super T> dyq, dqZ dqz) {
        return ((dyq instanceof dzZ) || (dyq instanceof dzW)) ? dyq : new C7645dAb(dyq, dqz);
    }

    public static /* synthetic */ Object a(dqZ dqz, Object obj, Object obj2, drX drx, InterfaceC8585dra interfaceC8585dra, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = dAO.c(dqz);
        }
        return b(dqz, obj, obj2, drx, interfaceC8585dra);
    }

    public static final <T, V> Object b(dqZ dqz, V v, Object obj, drX<? super V, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, InterfaceC8585dra<? super T> interfaceC8585dra) {
        Object e;
        Object c = dAO.c(dqz, obj);
        try {
            Object invoke = ((drX) dsH.a(drx, 2)).invoke(v, new dzY(interfaceC8585dra, dqz));
            dAO.b(dqz, c);
            e = C8586drb.e();
            if (invoke == e) {
                C8592drh.c(interfaceC8585dra);
            }
            return invoke;
        } catch (Throwable th) {
            dAO.b(dqz, c);
            throw th;
        }
    }
}
