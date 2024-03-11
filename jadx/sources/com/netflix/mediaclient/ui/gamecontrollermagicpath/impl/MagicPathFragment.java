package com.netflix.mediaclient.ui.gamecontrollermagicpath.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.netflix.mediaclient.ui.gamecontrollermagicpath.api.MagicPathUiType;
import com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.MagicPathFragment;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC3866bNo;
import o.AbstractC8882fB;
import o.AbstractC8899fS;
import o.AbstractC8928fv;
import o.C1045Mp;
import o.C3860bNi;
import o.C3869bNr;
import o.C3871bNt;
import o.C8627dsp;
import o.C8632dsu;
import o.C8737dwr;
import o.C8903fW;
import o.C8925fs;
import o.C8930fx;
import o.C8931fy;
import o.C8980gu;
import o.InterfaceC3861bNj;
import o.InterfaceC8554dpx;
import o.InterfaceC8585dra;
import o.InterfaceC8660dtv;
import o.InterfaceC8888fH;
import o.InterfaceC8890fJ;
import o.InterfaceC8894fN;
import o.InterfaceC8976gq;
import o.dpR;
import o.drI;
import o.drM;
import o.drO;
import o.drX;
import o.dsA;
import o.dtC;
import o.dxD;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public class MagicPathFragment extends AbstractC3866bNo implements InterfaceC8894fN {
    private final InterfaceC8554dpx e;
    @Inject
    public InterfaceC3861bNj magicPathOutboundNavigation;
    static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(MagicPathFragment.class, "magicPathViewModel", "getMagicPathViewModel()Lcom/netflix/mediaclient/ui/gamecontrollermagicpath/impl/MagicPathViewModel;", 0))};
    public static final c a = new c(null);
    public static final int d = 8;

    /* loaded from: classes4.dex */
    public static final class a extends AbstractC8882fB<MagicPathFragment, C3869bNr> {
        final /* synthetic */ InterfaceC8660dtv a;
        final /* synthetic */ boolean b;
        final /* synthetic */ drM c;
        final /* synthetic */ InterfaceC8660dtv d;

        public a(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.a = interfaceC8660dtv;
            this.b = z;
            this.c = drm;
            this.d = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: a */
        public InterfaceC8554dpx<C3869bNr> c(MagicPathFragment magicPathFragment, dtC<?> dtc) {
            C8632dsu.c((Object) magicPathFragment, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.a;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.d;
            return d.d(magicPathFragment, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.MagicPathFragment$special$$inlined$fragmentViewModel$default$2$1
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
            }, dsA.a(C3871bNt.class), this.b, this.c);
        }
    }

    @Override // o.InterfaceC8894fN
    public LifecycleOwner X_() {
        return InterfaceC8894fN.b.d(this);
    }

    @Override // o.InterfaceC8894fN
    public <S extends InterfaceC8888fH> dxD c(AbstractC8899fS<S> abstractC8899fS, AbstractC8928fv abstractC8928fv, drX<? super S, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return InterfaceC8894fN.b.e(this, abstractC8899fS, abstractC8928fv, drx);
    }

    @Override // o.InterfaceC8894fN
    public void i_() {
        InterfaceC8894fN.b.e(this);
    }

    public MagicPathFragment() {
        final InterfaceC8660dtv a2 = dsA.a(C3869bNr.class);
        this.e = new a(a2, false, new drM<InterfaceC8890fJ<C3869bNr, C3871bNt>, C3869bNr>() { // from class: com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.MagicPathFragment$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.bNr, o.fS] */
            @Override // o.drM
            /* renamed from: c */
            public final C3869bNr invoke(InterfaceC8890fJ<C3869bNr, C3871bNt> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a2).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e, C3871bNt.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a2).c(this, c[0]);
    }

    public final InterfaceC3861bNj j() {
        InterfaceC3861bNj interfaceC3861bNj = this.magicPathOutboundNavigation;
        if (interfaceC3861bNj != null) {
            return interfaceC3861bNj;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("GameControllerFragment");
        }

        public final MagicPathFragment d(Bundle bundle) {
            C8632dsu.c((Object) bundle, "");
            MagicPathFragment magicPathFragment = new MagicPathFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putBundle("mavericks:arg", bundle);
            magicPathFragment.setArguments(bundle2);
            return magicPathFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C3869bNr f() {
        return (C3869bNr) this.e.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(C3860bNi.e.b());
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        C8737dwr.c(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MagicPathFragment$onViewCreated$1(this, null), 3, null);
    }

    @Override // o.InterfaceC8894fN
    public void e() {
        C8980gu.c(f(), new drM<C3871bNt, dpR>() { // from class: com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.MagicPathFragment$invalidate$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(C3871bNt c3871bNt) {
                a(c3871bNt);
                return dpR.c;
            }

            public final void a(C3871bNt c3871bNt) {
                C8632dsu.c((Object) c3871bNt, "");
                MagicPathFragment.c cVar = MagicPathFragment.a;
            }
        });
    }

    public final void a(String str) {
        C8632dsu.c((Object) str, "");
        f().d(str);
    }

    public final void c(MagicPathUiType magicPathUiType) {
        C8632dsu.c((Object) magicPathUiType, "");
        f().b(magicPathUiType);
    }
}
