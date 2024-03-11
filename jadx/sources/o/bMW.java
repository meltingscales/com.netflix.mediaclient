package o;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import io.reactivex.disposables.Disposable;
import o.InterfaceC8965gf;

/* loaded from: classes4.dex */
public abstract class bMW extends NetflixDialogFrag implements InterfaceC8965gf {
    public static final d a = new d(null);
    public static final int c = 8;
    private boolean b;
    private TrackingInfoHolder d = TrackingInfoHolder.a.b();
    private Long e;

    protected void f() {
    }

    public final TrackingInfoHolder h() {
        return this.d;
    }

    protected void i() {
    }

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

    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    @Override // o.InterfaceC8894fN
    public LifecycleOwner X_() {
        LifecycleOwner value = getViewLifecycleOwnerLiveData().getValue();
        return value == null ? this : value;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        TrackingInfoHolder trackingInfoHolder = arguments != null ? (TrackingInfoHolder) arguments.getParcelable("tracking_info_holder") : null;
        if (trackingInfoHolder == null) {
            trackingInfoHolder = TrackingInfoHolder.a.b();
        }
        this.d = trackingInfoHolder;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        i_();
        AppView appView = getAppView();
        if (appView != null) {
            Long l = this.e;
            if (l != null) {
                Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
            }
            this.e = Logger.INSTANCE.startSession(new Presentation(appView, TrackingInfoHolder.e(this.d, null, 1, null)));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Long l = this.e;
        if (l != null) {
            Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
            this.e = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setEnterTransition(Object obj) {
        super.setEnterTransition(obj);
        if (obj instanceof Transition) {
            ((Transition) obj).addListener(new b());
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends TransitionListenerAdapter {
        b() {
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            C8632dsu.c((Object) transition, "");
            bMW.this.b = true;
            bMW.this.i();
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            C8632dsu.c((Object) transition, "");
            bMW.this.b = false;
            bMW.this.f();
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            C8632dsu.c((Object) transition, "");
            bMW.this.b = false;
        }
    }
}
