package o;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.disposables.Disposable;
import o.InterfaceC8965gf;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public abstract class bMX extends AbstractC3852bNa implements InterfaceC8965gf {
    @Override // o.InterfaceC8894fN
    public <S extends InterfaceC8888fH> dxD c(AbstractC8899fS<S> abstractC8899fS, AbstractC8928fv abstractC8928fv, drX<? super S, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return InterfaceC8965gf.e.a(this, abstractC8899fS, abstractC8928fv, drx);
    }

    @Override // o.InterfaceC8965gf
    public <S extends InterfaceC8888fH> Disposable e(AbstractC8919fm<S> abstractC8919fm, AbstractC8928fv abstractC8928fv, drM<? super S, dpR> drm) {
        return InterfaceC8965gf.e.a(this, abstractC8919fm, abstractC8928fv, drm);
    }

    @Override // o.InterfaceC8894fN
    public void i_() {
        InterfaceC8965gf.e.d(this);
    }

    @Override // o.InterfaceC8894fN
    public LifecycleOwner X_() {
        LifecycleOwner value = getViewLifecycleOwnerLiveData().getValue();
        return value == null ? this : value;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        i_();
    }
}
