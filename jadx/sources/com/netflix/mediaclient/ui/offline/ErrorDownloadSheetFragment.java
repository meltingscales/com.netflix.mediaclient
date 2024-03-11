package com.netflix.mediaclient.ui.offline;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC7298cta;
import o.AbstractC8882fB;
import o.AbstractC8899fS;
import o.AbstractC8928fv;
import o.C1045Mp;
import o.C7238csT;
import o.C7239csU;
import o.C7243csY;
import o.C8627dsp;
import o.C8632dsu;
import o.C8903fW;
import o.C8925fs;
import o.C8930fx;
import o.C8931fy;
import o.C8983gx;
import o.InterfaceC7303ctf;
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
public final class ErrorDownloadSheetFragment extends AbstractC7298cta implements InterfaceC8894fN {
    private final InterfaceC8554dpx c;
    @Inject
    public Lazy<InterfaceC7303ctf> offlineApiImpl;
    static final /* synthetic */ dtC<Object>[] d = {dsA.c(new PropertyReference1Impl(ErrorDownloadSheetFragment.class, "viewModel", "getViewModel()Lcom/netflix/mediaclient/ui/offline/ErrorDownloadSheetViewModel;", 0))};
    public static final b e = new b(null);
    public static final int a = 8;

    @Override // o.InterfaceC8894fN
    public void e() {
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC8882fB<ErrorDownloadSheetFragment, C7239csU> {
        final /* synthetic */ boolean a;
        final /* synthetic */ InterfaceC8660dtv b;
        final /* synthetic */ drM c;
        final /* synthetic */ InterfaceC8660dtv e;

        public c(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.e = interfaceC8660dtv;
            this.a = z;
            this.c = drm;
            this.b = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: b */
        public InterfaceC8554dpx<C7239csU> c(ErrorDownloadSheetFragment errorDownloadSheetFragment, dtC<?> dtc) {
            C8632dsu.c((Object) errorDownloadSheetFragment, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.e;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.b;
            return d.d(errorDownloadSheetFragment, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.offline.ErrorDownloadSheetFragment$special$$inlined$fragmentViewModel$default$2$1
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
            }, dsA.a(C7243csY.class), this.a, this.c);
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

    public ErrorDownloadSheetFragment() {
        final InterfaceC8660dtv a2 = dsA.a(C7239csU.class);
        this.c = new c(a2, false, new drM<InterfaceC8890fJ<C7239csU, C7243csY>, C7239csU>() { // from class: com.netflix.mediaclient.ui.offline.ErrorDownloadSheetFragment$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.csU, o.fS] */
            @Override // o.drM
            /* renamed from: b */
            public final C7239csU invoke(InterfaceC8890fJ<C7239csU, C7243csY> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a2).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, C7243csY.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a2).c(this, d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C7239csU d() {
        return (C7239csU) this.c.getValue();
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("ErrorDownloadSheetFragment");
        }

        public final ErrorDownloadSheetFragment b(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str3, "");
            Bundle bundle = new Bundle();
            bundle.putString(SignupConstants.Field.VIDEO_TITLE, str);
            bundle.putString("error_info_text", str3);
            bundle.putString("episode_info_text", str2);
            ErrorDownloadSheetFragment errorDownloadSheetFragment = new ErrorDownloadSheetFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putBundle("mavericks:arg", bundle);
            errorDownloadSheetFragment.setArguments(bundle2);
            return errorDownloadSheetFragment;
        }

        public final c a(Bundle bundle) {
            C8632dsu.c((Object) bundle, "");
            String string = bundle.getString(SignupConstants.Field.VIDEO_TITLE);
            String string2 = bundle.getString("episode_info_text");
            String string3 = bundle.getString("error_info_text");
            if (string != null) {
                if (string3 != null) {
                    return new c(string, string2, string3);
                }
                throw new IllegalArgumentException("Error status inside of the ErrorDownload Fragment sheet is null.".toString());
            }
            throw new IllegalArgumentException("Title inside of the ErrorDownload Fragment sheet is null.".toString());
        }

        /* loaded from: classes6.dex */
        public static final class c {
            private final String a;
            private final String b;
            private final String e;

            public final String a() {
                return this.a;
            }

            public final String c() {
                return this.b;
            }

            public final String e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    return C8632dsu.c((Object) this.e, (Object) cVar.e) && C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c((Object) this.a, (Object) cVar.a);
                }
                return false;
            }

            public int hashCode() {
                int hashCode = this.e.hashCode();
                String str = this.b;
                return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.a.hashCode();
            }

            public String toString() {
                String str = this.e;
                String str2 = this.b;
                String str3 = this.a;
                return "ErrorDownloadSheetArgs(title=" + str + ", episodeInfoText=" + str2 + ", errorStatus=" + str3 + ")";
            }

            public c(String str, String str2, String str3) {
                C8632dsu.c((Object) str, "");
                C8632dsu.c((Object) str3, "");
                this.e = str;
                this.b = str2;
                this.a = str3;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: c */
    public ComposeView onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.DisposeOnLifecycleDestroyed(viewLifecycleOwner));
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-346874001, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.offline.ErrorDownloadSheetFragment$onCreateView$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return dpR.c;
            }

            public final void b(Composer composer, int i) {
                C7239csU d2;
                C7239csU d3;
                C7239csU d4;
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-346874001, i, -1, "com.netflix.mediaclient.ui.offline.ErrorDownloadSheetFragment.onCreateView.<anonymous>.<anonymous> (ErrorDownloadSheetFragment.kt:77)");
                    }
                    d2 = ErrorDownloadSheetFragment.this.d();
                    State a2 = C8983gx.a(d2, new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.offline.ErrorDownloadSheetFragment$onCreateView$1$1$title$2
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
                        public Object get(Object obj) {
                            return ((C7243csY) obj).a();
                        }
                    }, composer, 64);
                    d3 = ErrorDownloadSheetFragment.this.d();
                    State a3 = C8983gx.a(d3, new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.offline.ErrorDownloadSheetFragment$onCreateView$1$1$episodeInfoText$2
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
                        public Object get(Object obj) {
                            return ((C7243csY) obj).d();
                        }
                    }, composer, 64);
                    d4 = ErrorDownloadSheetFragment.this.d();
                    State a4 = C8983gx.a(d4, new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.offline.ErrorDownloadSheetFragment$onCreateView$1$1$errorStatus$2
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
                        public Object get(Object obj) {
                            return ((C7243csY) obj).e();
                        }
                    }, composer, 64);
                    C7238csT.a(c(a2), e(a4), new drO<dpR>() { // from class: com.netflix.mediaclient.ui.offline.ErrorDownloadSheetFragment$onCreateView$1$1.2
                        public final void a() {
                        }

                        @Override // o.drO
                        public /* synthetic */ dpR invoke() {
                            a();
                            return dpR.c;
                        }
                    }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.offline.ErrorDownloadSheetFragment$onCreateView$1$1.3
                        public final void e() {
                        }

                        @Override // o.drO
                        public /* synthetic */ dpR invoke() {
                            e();
                            return dpR.c;
                        }
                    }, new AnonymousClass1(ErrorDownloadSheetFragment.this), null, b(a3), composer, 3456, 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.ui.offline.ErrorDownloadSheetFragment$onCreateView$1$1$1  reason: invalid class name */
            /* loaded from: classes4.dex */
            public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements drO<dpR> {
                AnonymousClass1(Object obj) {
                    super(0, obj, ErrorDownloadSheetFragment.class, "dismiss", "dismiss()V", 0);
                }

                public final void e() {
                    ((ErrorDownloadSheetFragment) this.receiver).dismiss();
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    e();
                    return dpR.c;
                }
            }

            private static final String c(State<String> state) {
                return state.getValue();
            }

            private static final String b(State<String> state) {
                return state.getValue();
            }

            private static final String e(State<String> state) {
                return state.getValue();
            }
        }));
        return composeView;
    }
}
