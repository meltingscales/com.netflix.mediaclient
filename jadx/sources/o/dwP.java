package o;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref;
import o.dqZ;
import o.dwT;

/* loaded from: classes5.dex */
public final class dwP {
    public static final String b(dqZ dqz) {
        return null;
    }

    public static final dqZ a(dwU dwu, dqZ dqz) {
        dqZ d = d(dwu.getCoroutineContext(), dqz, true);
        return (d == C8752dxf.b() || d.get(dqY.d) != null) ? d : d.plus(C8752dxf.b());
    }

    public static final dqZ d(dqZ dqz, dqZ dqz2) {
        return !c(dqz2) ? dqz.plus(dqz2) : d(dqz, dqz2, false);
    }

    private static final boolean c(dqZ dqz) {
        return ((Boolean) dqz.fold(Boolean.FALSE, new drX<Boolean, dqZ.b, Boolean>() { // from class: kotlinx.coroutines.CoroutineContextKt$hasCopyableElements$1
            public final Boolean a(boolean z, dqZ.b bVar) {
                return Boolean.valueOf(z || (bVar instanceof dwT));
            }

            @Override // o.drX
            public /* synthetic */ Boolean invoke(Boolean bool, dqZ.b bVar) {
                return a(bool.booleanValue(), bVar);
            }
        })).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final dqZ d(dqZ dqz, dqZ dqz2, final boolean z) {
        boolean c = c(dqz);
        boolean c2 = c(dqz2);
        if (!c && !c2) {
            return dqz.plus(dqz2);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.d = dqz2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.e;
        dqZ dqz3 = (dqZ) dqz.fold(emptyCoroutineContext, new drX<dqZ, dqZ.b, dqZ>() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$folded$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [T, o.dqZ] */
            @Override // o.drX
            /* renamed from: c */
            public final dqZ invoke(dqZ dqz4, dqZ.b bVar) {
                if (bVar instanceof dwT) {
                    dqZ.b bVar2 = objectRef.d.get(bVar.getKey());
                    if (bVar2 == null) {
                        dwT dwt = (dwT) bVar;
                        if (z) {
                            dwt = dwt.d();
                        }
                        return dqz4.plus(dwt);
                    }
                    Ref.ObjectRef<dqZ> objectRef2 = objectRef;
                    objectRef2.d = objectRef2.d.minusKey(bVar.getKey());
                    return dqz4.plus(((dwT) bVar).a(bVar2));
                }
                return dqz4.plus(bVar);
            }
        });
        if (c2) {
            objectRef.d = ((dqZ) objectRef.d).fold(emptyCoroutineContext, new drX<dqZ, dqZ.b, dqZ>() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$1
                @Override // o.drX
                /* renamed from: e */
                public final dqZ invoke(dqZ dqz4, dqZ.b bVar) {
                    if (bVar instanceof dwT) {
                        return dqz4.plus(((dwT) bVar).d());
                    }
                    return dqz4.plus(bVar);
                }
            });
        }
        return dqz3.plus((dqZ) objectRef.d);
    }

    public static final C8780dyg<?> b(InterfaceC8585dra<?> interfaceC8585dra, dqZ dqz, Object obj) {
        if ((interfaceC8585dra instanceof InterfaceC8594drj) && dqz.get(C8785dyl.e) != null) {
            C8780dyg<?> e = e((InterfaceC8594drj) interfaceC8585dra);
            if (e != null) {
                e.b(dqz, obj);
            }
            return e;
        }
        return null;
    }

    public static final C8780dyg<?> e(InterfaceC8594drj interfaceC8594drj) {
        while (!(interfaceC8594drj instanceof C8751dxe) && (interfaceC8594drj = interfaceC8594drj.getCallerFrame()) != null) {
            if (interfaceC8594drj instanceof C8780dyg) {
                return (C8780dyg) interfaceC8594drj;
            }
        }
        return null;
    }
}
