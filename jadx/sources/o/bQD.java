package o;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.games.impl.identity.IdentityEpoxyController;
import com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import o.C1333Xq;
import o.C3895bOq;
import o.C8632dsu;
import o.C8903fW;
import o.C8925fs;
import o.C8931fy;
import o.C8980gu;
import o.C9834xU;
import o.C9935zP;
import o.InterfaceC1078Nw;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC8660dtv;
import o.InterfaceC8890fJ;
import o.bQC;
import o.bQD;
import o.bQI;
import o.dpR;
import o.drI;
import o.drM;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public class bQD extends AbstractC3953bQu {
    static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(bQD.class, "identityViewModel", "getIdentityViewModel()Lcom/netflix/mediaclient/ui/games/impl/identity/IdentityViewModel;", 0))};
    public static final d e = new d(null);
    private final AppView j;
    private final boolean k;
    private c l;
    private final InterfaceC8554dpx m;
    private final BroadcastReceiver n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13531o = true;

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return this.j;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bo_() {
        return this.k;
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC8882fB<bQD, IdentityViewModel> {
        final /* synthetic */ boolean a;
        final /* synthetic */ InterfaceC8660dtv b;
        final /* synthetic */ InterfaceC8660dtv c;
        final /* synthetic */ drM e;

        public b(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.b = interfaceC8660dtv;
            this.a = z;
            this.e = drm;
            this.c = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: b */
        public InterfaceC8554dpx<IdentityViewModel> c(bQD bqd, dtC<?> dtc) {
            C8632dsu.c((Object) bqd, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.b;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.c;
            return d.d(bqd, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityFragment$special$$inlined$fragmentViewModel$default$2$1
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
            }, dsA.a(IdentityViewModel.b.class), this.a, this.e);
        }
    }

    public bQD() {
        final InterfaceC8660dtv a2 = dsA.a(IdentityViewModel.class);
        this.m = new b(a2, false, new drM<InterfaceC8890fJ<IdentityViewModel, IdentityViewModel.b>, IdentityViewModel>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityFragment$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel, o.fS] */
            @Override // o.drM
            /* renamed from: d */
            public final IdentityViewModel invoke(InterfaceC8890fJ<IdentityViewModel, IdentityViewModel.b> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a2).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, IdentityViewModel.b.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a2).c(this, b[0]);
        this.n = new a();
        this.j = AppView.editPublicHandle;
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("IdentityFragment");
        }

        public final bQD e(Bundle bundle) {
            bQD bqd = new bQD();
            Bundle bundle2 = new Bundle();
            bundle2.putBundle("mavericks:arg", bundle);
            bqd.setArguments(bundle2);
            return bqd;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {
        private final IdentityEpoxyController b;

        public final IdentityEpoxyController a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.b, ((c) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            IdentityEpoxyController identityEpoxyController = this.b;
            return "Holder(epoxyController=" + identityEpoxyController + ")";
        }

        public c(IdentityEpoxyController identityEpoxyController) {
            C8632dsu.c((Object) identityEpoxyController, "");
            this.b = identityEpoxyController;
        }
    }

    public final IdentityViewModel I() {
        return (IdentityViewModel) this.m.getValue();
    }

    /* loaded from: classes4.dex */
    public static final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) intent, "");
            bQD.this.F();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        View inflate = layoutInflater.inflate(C3895bOq.c.S, viewGroup, false);
        C8632dsu.a(inflate, "");
        return inflate;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Map b2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        C9935zP.b bVar = C9935zP.b;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        C9935zP d2 = bVar.d(viewLifecycleOwner);
        IdentityEpoxyController identityEpoxyController = new IdentityEpoxyController(by_(), d2);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C3895bOq.b.x);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(identityEpoxyController.getAdapter());
        this.l = new c(identityEpoxyController);
        d(d2);
        d(this.n, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        G();
        if (C8126deW.a()) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            b2 = dqD.b(dpD.a("appView", String.valueOf(bh_())));
            k = dqE.k(b2);
            C1596aHd c1596aHd = new C1596aHd("GUI-373 Game is shown to kids profile.", null, null, true, k, false, false, 96, null);
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
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    private final void G() {
        I().i();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.l = null;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return ((Boolean) C8980gu.c(I(), new drM<IdentityViewModel.b, Boolean>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityFragment$isLoadingData$1
            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(IdentityViewModel.b bVar) {
                C8632dsu.c((Object) bVar, "");
                return Boolean.valueOf(bVar.g());
            }
        })).booleanValue();
    }

    @Override // o.InterfaceC8894fN
    public void e() {
        C8980gu.c(I(), new drM<IdentityViewModel.b, dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityFragment$invalidate$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final dpR invoke(IdentityViewModel.b bVar) {
                boolean z;
                bQD.c cVar;
                IdentityEpoxyController a2;
                C8632dsu.c((Object) bVar, "");
                z = bQD.this.f13531o;
                if (z && !bVar.g()) {
                    bQD.this.f13531o = false;
                    bQD bqd = bQD.this;
                    NetflixImmutableStatus netflixImmutableStatus = bVar.i() ? InterfaceC1078Nw.ad : InterfaceC1078Nw.aJ;
                    C8632dsu.d(netflixImmutableStatus);
                    bqd.d(netflixImmutableStatus);
                }
                bQD.this.bD_();
                cVar = bQD.this.l;
                if (cVar == null || (a2 = cVar.a()) == null) {
                    return null;
                }
                a2.setData(bVar);
                return dpR.c;
            }
        });
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        NetflixActivity bj_ = bj_();
        NetflixActivity bj_2 = bj_();
        NetflixActionBar netflixActionBar = bj_2 != null ? bj_2.getNetflixActionBar() : null;
        NetflixActivity bj_3 = bj_();
        C9726vo.d(bj_, netflixActionBar, bj_3 != null ? bj_3.getActionBarStateBuilder() : null, new InterfaceC8612dsa<NetflixActivity, NetflixActionBar, NetflixActionBar.b.C0051b, dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityFragment$updateActionBar$1
            private static int c = 1;
            private static int e = 0;
            private static byte e$ss2$42 = 24;

            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(NetflixActivity netflixActivity, NetflixActionBar netflixActionBar2, NetflixActionBar.b.C0051b c0051b) {
                a(netflixActivity, netflixActionBar2, c0051b);
                return dpR.c;
            }

            public final void a(NetflixActivity netflixActivity, NetflixActionBar netflixActionBar2, NetflixActionBar.b.C0051b c0051b) {
                int i = 2 % 2;
                C8632dsu.c((Object) netflixActivity, "");
                C8632dsu.c((Object) netflixActionBar2, "");
                C8632dsu.c((Object) c0051b, "");
                final Ref.IntRef intRef = new Ref.IntRef();
                intRef.b = C3895bOq.e.R;
                C8980gu.c(bQD.this.I(), new drM<IdentityViewModel.b, dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityFragment$updateActionBar$1.1
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(IdentityViewModel.b bVar) {
                        d(bVar);
                        return dpR.c;
                    }

                    public final void d(IdentityViewModel.b bVar) {
                        String a2;
                        C8632dsu.c((Object) bVar, "");
                        if (bVar.g() || (a2 = bVar.a()) == null || a2.length() == 0) {
                            return;
                        }
                        Ref.IntRef.this.b = C3895bOq.e.S;
                    }
                });
                NetflixActionBar.b.C0051b k = c0051b.k(true);
                String string = netflixActivity.getString(R.o.D);
                if (string.startsWith("'!#+")) {
                    Object[] objArr = new Object[1];
                    b(string.substring(4), objArr);
                    string = ((String) objArr[0]).intern();
                    int i2 = e + 105;
                    c = i2 % 128;
                    int i3 = i2 % 2;
                }
                NetflixActionBar.b.C0051b b2 = k.b(string);
                String string2 = netflixActivity.getString(intRef.b);
                if (string2.startsWith("'!#+")) {
                    int i4 = e + 87;
                    c = i4 % 128;
                    int i5 = i4 % 2;
                    String substring = string2.substring(4);
                    Object[] objArr2 = new Object[1];
                    if (i5 == 0) {
                        b(substring, objArr2);
                        string2 = ((String) objArr2[0]).intern();
                        int i6 = 11 / 0;
                    } else {
                        b(substring, objArr2);
                        string2 = ((String) objArr2[0]).intern();
                    }
                }
                b2.e((CharSequence) string2);
                netflixActionBar2.c(c0051b.c());
            }

            private void b(String str, Object[] objArr) {
                byte[] decode = Base64.decode(str, 0);
                byte[] bArr = new byte[decode.length];
                for (int i = 0; i < decode.length; i++) {
                    bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$42);
                }
                objArr[0] = new String(bArr, StandardCharsets.UTF_8);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(String str, String str2) {
        AlertDialog create = new AlertDialog.Builder(requireContext(), C9834xU.o.c).setTitle(str).setMessage(str2).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, (DialogInterface.OnClickListener) null).create();
        C8632dsu.a(create, "");
        FragmentActivity activity = getActivity();
        C8632dsu.d(activity);
        ((NetflixActivity) activity).displayDialog(create);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        I().h();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        C8632dsu.c((Object) view, "");
        view.setPadding(view.getPaddingLeft(), ((NetflixFrag) this).d, view.getPaddingRight(), this.h);
    }

    @SuppressLint({"AutoDispose"})
    private final void d(final C9935zP c9935zP) {
        CompositeDisposable compositeDisposable = this.f;
        Observable observeOn = c9935zP.d(bQC.class).observeOn(AndroidSchedulers.mainThread());
        final drM<bQC, dpR> drm = new drM<bQC, dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityFragment$subscribeToEvents$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(bQC bqc) {
                e(bqc);
                return dpR.c;
            }

            public final void e(bQC bqc) {
                String string;
                String string2;
                if (bqc instanceof bQC.d) {
                    bQD.this.I().c(((bQC.d) bqc).c());
                } else if (bqc instanceof bQC.c) {
                    bQD.this.I().c(c9935zP, ((bQC.c) bqc).d());
                } else if (bqc instanceof bQC.a) {
                    bQC.a aVar = (bQC.a) bqc;
                    IdentityViewModel.d b2 = aVar.b();
                    if (b2 == null || (string = b2.d()) == null) {
                        string = bQD.this.getString(C3895bOq.e.K);
                        C8632dsu.a(string, "");
                    }
                    IdentityViewModel.d b3 = aVar.b();
                    if (b3 == null || (string2 = b3.a()) == null) {
                        string2 = bQD.this.getString(C3895bOq.e.E);
                        C8632dsu.a(string2, "");
                    }
                    String str = string2 + System.getProperty("line.separator");
                    C1333Xq d2 = C1333Xq.d(C3895bOq.e.T);
                    IdentityViewModel.d b4 = aVar.b();
                    bQD.this.e(string, str + d2.d("errorCode", (b4 == null || (r5 = b4.c()) == null) ? "UNKNOWN" : "UNKNOWN").c());
                } else if (C8632dsu.c(bqc, bQC.e.a)) {
                    FragmentActivity activity = bQD.this.getActivity();
                    if (activity != null) {
                        activity.setResult(-1, new Intent());
                    }
                    FragmentActivity activity2 = bQD.this.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                } else if (C8632dsu.c(bqc, bQC.b.a)) {
                    FragmentActivity activity3 = bQD.this.getActivity();
                    NetflixActivity netflixActivity = activity3 instanceof NetflixActivity ? (NetflixActivity) activity3 : null;
                    if (netflixActivity != null) {
                        netflixActivity.showDialog(new bQI());
                    }
                }
            }
        };
        Disposable subscribe = observeOn.subscribe(new Consumer() { // from class: o.bQF
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                bQD.a(drM.this, obj);
            }
        });
        C8632dsu.a(subscribe, "");
        DisposableKt.plusAssign(compositeDisposable, subscribe);
    }
}
