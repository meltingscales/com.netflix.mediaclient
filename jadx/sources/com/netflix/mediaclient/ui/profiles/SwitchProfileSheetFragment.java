package com.netflix.mediaclient.ui.profiles;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.R;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.rxkotlin.SubscribersKt;
import javax.inject.Inject;
import o.AbstractC5897cMk;
import o.C5898cMl;
import o.C5956cOq;
import o.C6705ciO;
import o.C8632dsu;
import o.C9726vo;
import o.C9935zP;
import o.InterfaceC5844cKl;
import o.SA;
import o.cLV;
import o.dpR;
import o.drM;
import o.drO;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class SwitchProfileSheetFragment extends cLV {
    @Inject
    public Lazy<C5898cMl> myNetflixMenuHelper;
    @Inject
    public InterfaceC5844cKl profileApi;

    public final InterfaceC5844cKl a() {
        InterfaceC5844cKl interfaceC5844cKl = this.profileApi;
        if (interfaceC5844cKl != null) {
            return interfaceC5844cKl;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<C5898cMl> e() {
        Lazy<C5898cMl> lazy = this.myNetflixMenuHelper;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        NetflixActivity requireNetflixActivity = requireNetflixActivity();
        C8632dsu.a(requireNetflixActivity, "");
        InterfaceC5844cKl a = a();
        SA sa = new SA(requireContext, null, 0, 6, null);
        sa.setId(R.g.eN);
        dpR dpr = dpR.c;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        C6705ciO c6705ciO = new C6705ciO(requireNetflixActivity, a, sa, viewLifecycleOwner);
        C9935zP d = C9935zP.b.d(this);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner2, "");
        FragmentActivity requireActivity = requireActivity();
        C8632dsu.a(requireActivity, "");
        return new C5956cOq(c6705ciO, d, viewLifecycleOwner2, requireActivity, new drM<View, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.SwitchProfileSheetFragment$onCreateView$1
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
                if (SwitchProfileSheetFragment.this.isStateSaved()) {
                    return;
                }
                SwitchProfileSheetFragment.this.dismiss();
            }
        });
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    @SuppressLint({"CheckResult"})
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        SubscribersKt.subscribeBy$default(C9935zP.b.d(this).d(AbstractC5897cMk.class), (drM) null, (drO) null, new drM<AbstractC5897cMk, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.SwitchProfileSheetFragment$onViewCreated$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC5897cMk abstractC5897cMk) {
                e(abstractC5897cMk);
                return dpR.c;
            }

            public final void e(AbstractC5897cMk abstractC5897cMk) {
                C8632dsu.c((Object) abstractC5897cMk, "");
                if (C8632dsu.c(abstractC5897cMk, AbstractC5897cMk.c.e)) {
                    SwitchProfileSheetFragment.this.e().get().e();
                }
            }
        }, 3, (Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        C5956cOq c5956cOq;
        super.onResume();
        View view = getView();
        if (view == null || (c5956cOq = (C5956cOq) C9726vo.d(view, C5956cOq.class)) == null) {
            return;
        }
        c5956cOq.c();
    }
}
