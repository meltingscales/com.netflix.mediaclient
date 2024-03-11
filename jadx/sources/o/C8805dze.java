package o;

import o.C8632dsu;

/* renamed from: o.dze  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C8805dze {
    private static final drM<Object, Object> a = new drM<Object, Object>() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultKeySelector$1
        @Override // o.drM
        public final Object invoke(Object obj) {
            return obj;
        }
    };
    private static final drX<Object, Object, Boolean> c = new drX<Object, Object, Boolean>() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultAreEquivalent$1
        @Override // o.drX
        /* renamed from: a */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(C8632dsu.c(obj, obj2));
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> dyS<T> a(dyS<? extends T> dys) {
        return dys instanceof InterfaceC8822dzv ? dys : b(dys, a, c);
    }

    public static final <T> dyS<T> d(dyS<? extends T> dys, drX<? super T, ? super T, Boolean> drx) {
        drM<Object, Object> drm = a;
        C8632dsu.d(drx);
        return b(dys, drm, (drX) dsH.a(drx, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> dyS<T> b(dyS<? extends T> dys, drM<? super T, ? extends Object> drm, drX<Object, Object, Boolean> drx) {
        if (dys instanceof dyU) {
            dyU dyu = (dyU) dys;
            if (dyu.a == drm && dyu.d == drx) {
                return dys;
            }
        }
        return new dyU(dys, drm, drx);
    }
}
