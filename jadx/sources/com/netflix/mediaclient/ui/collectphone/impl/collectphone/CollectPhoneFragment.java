package com.netflix.mediaclient.ui.collectphone.impl.collectphone;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.collectphone.api.CollectPhone;
import com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneFragment;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC3498bAb;
import o.AbstractC3503bAg;
import o.AbstractC5475bzU;
import o.AbstractC8882fB;
import o.C1045Mp;
import o.C1596aHd;
import o.C3497bAa;
import o.C3501bAe;
import o.C3502bAf;
import o.C5468bzN;
import o.C5473bzS;
import o.C8054ddD;
import o.C8627dsp;
import o.C8632dsu;
import o.C8903fW;
import o.C8925fs;
import o.C8930fx;
import o.C8931fy;
import o.C8980gu;
import o.C9870yD;
import o.C9935zP;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC8554dpx;
import o.InterfaceC8660dtv;
import o.InterfaceC8890fJ;
import o.InterfaceC8976gq;
import o.dpB;
import o.dpD;
import o.dpR;
import o.dqE;
import o.drI;
import o.drM;
import o.drO;
import o.drX;
import o.dsA;
import o.dtC;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class CollectPhoneFragment extends AbstractC3503bAg {
    static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(CollectPhoneFragment.class, "collectPhoneViewModel", "getCollectPhoneViewModel()Lcom/netflix/mediaclient/ui/collectphone/impl/collectphone/CollectPhoneViewModel;", 0)), dsA.c(new PropertyReference1Impl(CollectPhoneFragment.class, "verifyPhoneViewModel", "getVerifyPhoneViewModel()Lcom/netflix/mediaclient/ui/collectphone/impl/collectphone/VerifyPhoneViewModel;", 0))};
    public static final c e = new c(null);
    private final InterfaceC8554dpx d;
    private final InterfaceC8554dpx g;
    private d h;
    @Inject
    public CollectPhone.e injectedAgent;
    private final InterfaceC8554dpx j;

    /* loaded from: classes4.dex */
    public static final class a extends AbstractC8882fB<CollectPhoneFragment, C3497bAa> {
        final /* synthetic */ InterfaceC8660dtv a;
        final /* synthetic */ InterfaceC8660dtv b;
        final /* synthetic */ drM c;
        final /* synthetic */ boolean e;

        public a(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.b = interfaceC8660dtv;
            this.e = z;
            this.c = drm;
            this.a = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: b */
        public InterfaceC8554dpx<C3497bAa> c(CollectPhoneFragment collectPhoneFragment, dtC<?> dtc) {
            C8632dsu.c((Object) collectPhoneFragment, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.b;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.a;
            return d.d(collectPhoneFragment, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneFragment$special$$inlined$fragmentViewModel$default$2$1
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: a */
                public final String invoke() {
                    String name = drI.e(InterfaceC8660dtv.this).getName();
                    C8632dsu.a(name, "");
                    return name;
                }
            }, dsA.a(C3497bAa.e.class), this.e, this.c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC8882fB<CollectPhoneFragment, C3502bAf> {
        final /* synthetic */ boolean a;
        final /* synthetic */ InterfaceC8660dtv b;
        final /* synthetic */ InterfaceC8660dtv d;
        final /* synthetic */ drM e;

        public b(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.d = interfaceC8660dtv;
            this.a = z;
            this.e = drm;
            this.b = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: a */
        public InterfaceC8554dpx<C3502bAf> c(CollectPhoneFragment collectPhoneFragment, dtC<?> dtc) {
            C8632dsu.c((Object) collectPhoneFragment, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.d;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.b;
            return d.d(collectPhoneFragment, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneFragment$special$$inlined$fragmentViewModel$default$4$1
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: c */
                public final String invoke() {
                    String name = drI.e(InterfaceC8660dtv.this).getName();
                    C8632dsu.a(name, "");
                    return name;
                }
            }, dsA.a(C3502bAf.c.class), this.a, this.e);
        }
    }

    public CollectPhoneFragment() {
        InterfaceC8554dpx b2;
        b2 = dpB.b(new drO<KeyboardController>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneFragment$keyboardController$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final KeyboardController invoke() {
                FragmentActivity requireActivity = CollectPhoneFragment.this.requireActivity();
                C8632dsu.a(requireActivity, "");
                return new KeyboardController(requireActivity);
            }
        });
        this.j = b2;
        final InterfaceC8660dtv a2 = dsA.a(C3497bAa.class);
        a aVar = new a(a2, false, new drM<InterfaceC8890fJ<C3497bAa, C3497bAa.e>, C3497bAa>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneFragment$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.bAa, o.fS] */
            @Override // o.drM
            /* renamed from: b */
            public final C3497bAa invoke(InterfaceC8890fJ<C3497bAa, C3497bAa.e> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a2).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, C3497bAa.e.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a2);
        dtC<?>[] dtcArr = b;
        this.d = aVar.c(this, dtcArr[0]);
        final InterfaceC8660dtv a3 = dsA.a(C3502bAf.class);
        this.g = new b(a3, false, new drM<InterfaceC8890fJ<C3502bAf, C3502bAf.c>, C3502bAf>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneFragment$special$$inlined$fragmentViewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.bAf, o.fS] */
            @Override // o.drM
            /* renamed from: c */
            public final C3502bAf invoke(InterfaceC8890fJ<C3502bAf, C3502bAf.c> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a3).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, C3502bAf.c.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a3).c(this, dtcArr[1]);
    }

    private final KeyboardController j() {
        return (KeyboardController) this.j.getValue();
    }

    public final CollectPhone.e b() {
        CollectPhone.e eVar = this.injectedAgent;
        if (eVar != null) {
            return eVar;
        }
        C8632dsu.d("");
        return null;
    }

    public final CollectPhone.e d() {
        return l() ? new C5468bzN() : b();
    }

    private final boolean l() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("SHOULD_USE_FAKES");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3497bAa g() {
        return (C3497bAa) this.d.getValue();
    }

    private final C3502bAf k() {
        return (C3502bAf) this.g.getValue();
    }

    @Override // o.bMW, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.l.m);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        return layoutInflater.inflate(C5473bzS.e.a, viewGroup, false);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        C9935zP.b bVar = C9935zP.b;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        C9935zP d2 = bVar.d(viewLifecycleOwner);
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        CollectPhoneEpoxyController collectPhoneEpoxyController = new CollectPhoneEpoxyController(requireContext, d2);
        this.h = new d(d2, collectPhoneEpoxyController);
        C3501bAe c2 = C3501bAe.c(view);
        C8632dsu.a(c2, "");
        c2.e.setController(collectPhoneEpoxyController);
        t();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.h = null;
    }

    @Override // o.bMW, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        View decorView;
        super.onStart();
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        C9870yD.c(decorView);
    }

    @Override // o.bMW, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        Window window;
        View decorView;
        super.onStop();
        j().dismissKeyboard();
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        C9870yD.a(decorView);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return ((Boolean) C8980gu.c(g(), new drM<C3497bAa.e, Boolean>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneFragment$isLoadingData$1
            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(C3497bAa.e eVar) {
                C8632dsu.c((Object) eVar, "");
                return Boolean.valueOf(eVar.g());
            }
        })).booleanValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        super.dismissAllowingStateLoss();
        C8980gu.b(g(), k(), new drX<C3497bAa.e, C3502bAf.c, dpR>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneFragment$dismissAllowingStateLoss$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(C3497bAa.e eVar, C3502bAf.c cVar) {
                a(eVar, cVar);
                return dpR.c;
            }

            public final void a(C3497bAa.e eVar, C3502bAf.c cVar) {
                C8632dsu.c((Object) eVar, "");
                C8632dsu.c((Object) cVar, "");
                if (cVar.j()) {
                    C8054ddD.c(CollectPhoneFragment.this.getContext(), C5473bzS.d.n, 1);
                } else if (eVar.h()) {
                    C8054ddD.c(CollectPhoneFragment.this.getContext(), C5473bzS.d.e, 1);
                }
            }
        });
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag
    public boolean handleBackPressed() {
        o();
        return true;
    }

    @Override // o.InterfaceC8894fN
    public void e() {
        C8980gu.b(g(), k(), new drX<C3497bAa.e, C3502bAf.c, dpR>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneFragment$invalidate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            /* renamed from: a */
            public final dpR invoke(C3497bAa.e eVar, C3502bAf.c cVar) {
                CollectPhoneFragment.d dVar;
                CollectPhoneEpoxyController e2;
                C8632dsu.c((Object) eVar, "");
                C8632dsu.c((Object) cVar, "");
                dVar = CollectPhoneFragment.this.h;
                if (dVar == null || (e2 = dVar.e()) == null) {
                    return null;
                }
                e2.setData(eVar, cVar);
                return dpR.c;
            }
        });
    }

    @SuppressLint({"CheckResult"})
    private final void t() {
        C9935zP b2;
        Observable d2;
        d dVar = this.h;
        if (dVar == null || (b2 = dVar.b()) == null || (d2 = b2.d(AbstractC5475bzU.class)) == null) {
            return;
        }
        SubscribersKt.subscribeBy$default(d2, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneFragment$subscribeToEvents$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
                Map d3;
                Map k;
                Throwable th2;
                C8632dsu.c((Object) th, "");
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d3 = dqE.d();
                k = dqE.k(d3);
                C1596aHd c1596aHd = new C1596aHd(null, th, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b3 = c1596aHd.b();
                    if (b3 != null) {
                        String c2 = errorType.c();
                        c1596aHd.a(c2 + " " + b3);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    th2 = c1596aHd.i;
                    if (th2 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar2.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th2);
                } else {
                    dVar2.e().b(c1596aHd, th2);
                }
            }
        }, (drO) null, new drM<AbstractC5475bzU, dpR>() { // from class: com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneFragment$subscribeToEvents$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC5475bzU abstractC5475bzU) {
                b(abstractC5475bzU);
                return dpR.c;
            }

            public final void b(AbstractC5475bzU abstractC5475bzU) {
                C8632dsu.c((Object) abstractC5475bzU, "");
                if (abstractC5475bzU instanceof AbstractC5475bzU.i) {
                    AbstractC5475bzU.i iVar = (AbstractC5475bzU.i) abstractC5475bzU;
                    CollectPhoneFragment.this.c(iVar.b(), iVar.c());
                } else if (abstractC5475bzU instanceof AbstractC5475bzU.c) {
                    CollectPhoneFragment.this.d(((AbstractC5475bzU.c) abstractC5475bzU).c());
                } else if (abstractC5475bzU instanceof AbstractC5475bzU.l) {
                    CollectPhoneFragment.this.b(((AbstractC5475bzU.l) abstractC5475bzU).a());
                } else if (C8632dsu.c(abstractC5475bzU, AbstractC5475bzU.d.e)) {
                    CollectPhoneFragment.this.m();
                } else if (C8632dsu.c(abstractC5475bzU, AbstractC5475bzU.f.b)) {
                    CollectPhoneFragment.this.q();
                } else if (C8632dsu.c(abstractC5475bzU, AbstractC5475bzU.j.b)) {
                    CollectPhoneFragment.this.s();
                } else if (C8632dsu.c(abstractC5475bzU, AbstractC5475bzU.a.a)) {
                    CollectPhoneFragment.this.n();
                } else if (C8632dsu.c(abstractC5475bzU, AbstractC5475bzU.b.a)) {
                    CollectPhoneFragment.this.o();
                } else if (C8632dsu.c(abstractC5475bzU, AbstractC5475bzU.g.d)) {
                    CollectPhoneFragment.this.r();
                } else if (C8632dsu.c(abstractC5475bzU, AbstractC5475bzU.h.a)) {
                    CollectPhoneFragment.this.p();
                } else if (C8632dsu.c(abstractC5475bzU, AbstractC5475bzU.e.c)) {
                    CollectPhoneFragment.this.dismissAllowingStateLoss();
                }
            }
        }, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(AbstractC3498bAb abstractC3498bAb, AbstractC3498bAb abstractC3498bAb2) {
        j().dismissKeyboard();
        if ((abstractC3498bAb instanceof AbstractC3498bAb.b) && (abstractC3498bAb2 instanceof AbstractC3498bAb.c)) {
            k().i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        g().j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        k().j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        k().f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C8980gu.c(g(), new CollectPhoneFragment$onCountryPickerClicked$1(context, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        CollectPhoneEpoxyController e2;
        AbstractC3498bAb currentScreen;
        d dVar = this.h;
        if (dVar == null || (e2 = dVar.e()) == null || (currentScreen = e2.getCurrentScreen()) == null) {
            return;
        }
        if (currentScreen instanceof AbstractC3498bAb.b) {
            dismissAllowingStateLoss();
        } else if (currentScreen instanceof AbstractC3498bAb.c) {
            g().f();
        } else if (currentScreen instanceof AbstractC3498bAb.e) {
            dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(String str) {
        g().e(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str) {
        k().c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        CollectPhoneEpoxyController e2;
        AbstractC3498bAb currentScreen;
        d dVar = this.h;
        if (dVar == null || (e2 = dVar.e()) == null || (currentScreen = e2.getCurrentScreen()) == null) {
            return;
        }
        if (currentScreen instanceof AbstractC3498bAb.b) {
            g().h();
        } else if (currentScreen instanceof AbstractC3498bAb.c) {
            k().n();
        } else if (currentScreen instanceof AbstractC3498bAb.e) {
            dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        k().h();
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("CollectPhoneFragment");
        }

        public final CollectPhoneFragment a(boolean z) {
            CollectPhoneFragment collectPhoneFragment = new CollectPhoneFragment();
            if (z) {
                collectPhoneFragment.setArguments(BundleKt.bundleOf(dpD.a("SHOULD_USE_FAKES", Boolean.valueOf(z))));
            }
            return collectPhoneFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d {
        private final CollectPhoneEpoxyController c;
        private final C9935zP d;

        public final C9935zP b() {
            return this.d;
        }

        public final CollectPhoneEpoxyController e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.d, dVar.d) && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            C9935zP c9935zP = this.d;
            CollectPhoneEpoxyController collectPhoneEpoxyController = this.c;
            return "Holder(eventBusFactory=" + c9935zP + ", controller=" + collectPhoneEpoxyController + ")";
        }

        public d(C9935zP c9935zP, CollectPhoneEpoxyController collectPhoneEpoxyController) {
            C8632dsu.c((Object) c9935zP, "");
            C8632dsu.c((Object) collectPhoneEpoxyController, "");
            this.d = c9935zP;
            this.c = collectPhoneEpoxyController;
        }
    }
}
