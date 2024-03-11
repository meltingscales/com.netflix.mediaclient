package com.netflix.mediaclient.ui.mdx;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.mdx.CastSheetDialogFrag;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import o.AbstractC6563cff;
import o.AbstractC6576cfs;
import o.C6490ceL;
import o.C6498ceT;
import o.C6539cfH;
import o.C8632dsu;
import o.C9726vo;
import o.C9935zP;
import o.bZN;
import o.dpR;
import o.drM;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class CastSheetDialogFrag extends AbstractC6576cfs {
    @Inject
    public bZN localDiscoveryConsentUi;

    public final bZN d() {
        bZN bzn = this.localDiscoveryConsentUi;
        if (bzn != null) {
            return bzn;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        final NetflixActivity requireNetflixActivity = requireNetflixActivity();
        C8632dsu.a(requireNetflixActivity, "");
        C9935zP b = b();
        final C6490ceL c6490ceL = new C6490ceL(b, new drM<View, dpR>() { // from class: com.netflix.mediaclient.ui.mdx.CastSheetDialogFrag$onCreateView$castSheet$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(View view) {
                d(view);
                return dpR.c;
            }

            public final void d(View view) {
                C8632dsu.c((Object) view, "");
                C6498ceT.a();
                CastSheetDialogFrag.this.dismiss();
            }
        }, requireNetflixActivity);
        Observable d = b.d(AbstractC6563cff.class);
        AndroidLifecycleScopeProvider a = AndroidLifecycleScopeProvider.a(this, Lifecycle.Event.ON_DESTROY);
        C8632dsu.a(a, "");
        Object as = d.as(AutoDispose.b(a));
        C8632dsu.b(as, "");
        final drM<AbstractC6563cff, dpR> drm = new drM<AbstractC6563cff, dpR>() { // from class: com.netflix.mediaclient.ui.mdx.CastSheetDialogFrag$onCreateView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6563cff abstractC6563cff) {
                c(abstractC6563cff);
                return dpR.c;
            }

            public final void c(AbstractC6563cff abstractC6563cff) {
                if (C8632dsu.c(abstractC6563cff, AbstractC6563cff.e.e)) {
                    C6490ceL.this.close();
                } else if (abstractC6563cff instanceof AbstractC6563cff.b) {
                    AbstractC6563cff.b bVar = (AbstractC6563cff.b) abstractC6563cff;
                    NetflixActivity netflixActivity = requireNetflixActivity;
                    C6539cfH.d(bVar.e(), bVar.e(), netflixActivity, netflixActivity.getServiceManager(), requireNetflixActivity.requireMdxTargetCallback());
                    C6490ceL.this.close();
                } else if (C8632dsu.c(abstractC6563cff, AbstractC6563cff.d.d)) {
                    NetflixActivity netflixActivity2 = requireNetflixActivity;
                    C6539cfH.a(netflixActivity2, netflixActivity2.requireMdxTargetCallback());
                    C6490ceL.this.close();
                } else if (C8632dsu.c(abstractC6563cff, AbstractC6563cff.a.e)) {
                    C6490ceL.this.close();
                    this.d().a();
                }
            }
        };
        ((ObservableSubscribeProxy) as).e(new Consumer() { // from class: o.cfa
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CastSheetDialogFrag.b(drM.this, obj);
            }
        });
        return c6490ceL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // o.InterfaceC8894fN
    public void e() {
        View view;
        NetflixActivity netflixActivity = getNetflixActivity();
        if (netflixActivity == null || (view = getView()) == null) {
            return;
        }
        C8632dsu.d(view);
        C6490ceL c6490ceL = (C6490ceL) C9726vo.d(view, C6490ceL.class);
        if (c6490ceL != null) {
            c6490ceL.c(netflixActivity);
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        C6498ceT.e();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C6498ceT.d();
    }

    private final C9935zP b() {
        C9935zP.b bVar = C9935zP.b;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        return bVar.d(viewLifecycleOwner);
    }
}
