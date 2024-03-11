package o;

import com.airbnb.mvrx.MvRxView$subscribe$1;
import io.reactivex.disposables.Disposable;
import o.InterfaceC8894fN;

/* renamed from: o.gf  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC8965gf extends InterfaceC8894fN {
    <S extends InterfaceC8888fH> Disposable e(AbstractC8919fm<S> abstractC8919fm, AbstractC8928fv abstractC8928fv, drM<? super S, dpR> drm);

    /* renamed from: o.gf$e */
    /* loaded from: classes2.dex */
    public static final class e {
        public static <S extends InterfaceC8888fH> dxD a(InterfaceC8965gf interfaceC8965gf, AbstractC8899fS<S> abstractC8899fS, AbstractC8928fv abstractC8928fv, drX<? super S, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
            C8632dsu.c((Object) abstractC8899fS, "");
            C8632dsu.c((Object) abstractC8928fv, "");
            C8632dsu.c((Object) drx, "");
            return InterfaceC8894fN.b.e(interfaceC8965gf, abstractC8899fS, abstractC8928fv, drx);
        }

        public static void d(InterfaceC8965gf interfaceC8965gf) {
            InterfaceC8894fN.b.e(interfaceC8965gf);
        }

        public static /* synthetic */ Disposable c(InterfaceC8965gf interfaceC8965gf, AbstractC8919fm abstractC8919fm, AbstractC8928fv abstractC8928fv, drM drm, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    abstractC8928fv = C8973gn.b;
                }
                return interfaceC8965gf.e(abstractC8919fm, abstractC8928fv, drm);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribe");
        }

        public static <S extends InterfaceC8888fH> Disposable a(InterfaceC8965gf interfaceC8965gf, AbstractC8919fm<S> abstractC8919fm, AbstractC8928fv abstractC8928fv, drM<? super S, dpR> drm) {
            C8632dsu.c((Object) abstractC8919fm, "");
            C8632dsu.c((Object) abstractC8928fv, "");
            C8632dsu.c((Object) drm, "");
            return C8967gh.c(C8960ga.b(abstractC8919fm, interfaceC8965gf.X_(), abstractC8928fv, new MvRxView$subscribe$1(drm, null)));
        }
    }
}
