package o;

import androidx.fragment.app.Fragment;
import com.airbnb.mvrx.lifecycleAwareLazy;
import o.AbstractC8899fS;
import o.C8960ga;
import o.C8968gi;
import o.drM;

/* renamed from: o.ft  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8926ft implements InterfaceC8976gq {
    @Override // o.InterfaceC8976gq
    public <S extends InterfaceC8888fH, T extends Fragment & InterfaceC8894fN, VM extends AbstractC8899fS<S>> InterfaceC8554dpx<VM> d(final T t, dtC<?> dtc, InterfaceC8660dtv<VM> interfaceC8660dtv, drO<String> dro, InterfaceC8660dtv<S> interfaceC8660dtv2, boolean z, final drM<? super InterfaceC8890fJ<VM, S>, ? extends VM> drm) {
        C8632dsu.c((Object) t, "");
        C8632dsu.c((Object) dtc, "");
        C8632dsu.c((Object) interfaceC8660dtv, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) interfaceC8660dtv2, "");
        C8632dsu.c((Object) drm, "");
        return new lifecycleAwareLazy(t, null, new drO<VM>() { // from class: com.airbnb.mvrx.DefaultViewModelDelegateFactory$createLazyViewModel$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (Lo/drM<-Lo/fJ<TVM;TS;>;+TVM;>;TT;)V */
            {
                super(0);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TVM; */
            @Override // o.drO
            /* renamed from: b */
            public final AbstractC8899fS invoke() {
                VM invoke = drM.this.invoke(new C8968gi());
                Fragment fragment = t;
                AbstractC8899fS abstractC8899fS = (AbstractC8899fS) invoke;
                C8960ga.e(abstractC8899fS, fragment, null, new DefaultViewModelDelegateFactory$createLazyViewModel$1$1$1(fragment, null), 2, null);
                return abstractC8899fS;
            }
        }, 2, null);
    }
}
