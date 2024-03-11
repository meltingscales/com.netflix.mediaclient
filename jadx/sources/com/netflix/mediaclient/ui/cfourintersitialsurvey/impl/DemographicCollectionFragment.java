package com.netflix.mediaclient.ui.cfourintersitialsurvey.impl;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.android.moneyball.fields.BooleanField;
import com.netflix.android.moneyball.fields.ChoiceField;
import com.netflix.android.moneyball.fields.NumberField;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.Request;
import com.netflix.mediaclient.acquisition.lib.Response;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.rowconfig.layoutmanager.FillerGridLayoutManager;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionFragment;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC5492bzl;
import o.AbstractC5495bzo;
import o.AbstractC8882fB;
import o.AbstractC8899fS;
import o.AbstractC8928fv;
import o.C1596aHd;
import o.C3786bKp;
import o.C5458bzD;
import o.C5460bzF;
import o.C5466bzL;
import o.C5487bzg;
import o.C5496bzp;
import o.C5498bzr;
import o.C5499bzs;
import o.C5503bzw;
import o.C5504bzx;
import o.C8168dfL;
import o.C8572dqo;
import o.C8632dsu;
import o.C8903fW;
import o.C8925fs;
import o.C8930fx;
import o.C8931fy;
import o.C8980gu;
import o.C9935zP;
import o.DialogInterface$OnClickListenerC5486bzf;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5427byZ;
import o.InterfaceC8554dpx;
import o.InterfaceC8585dra;
import o.InterfaceC8660dtv;
import o.InterfaceC8888fH;
import o.InterfaceC8890fJ;
import o.InterfaceC8894fN;
import o.InterfaceC8976gq;
import o.dpR;
import o.dqE;
import o.drI;
import o.drM;
import o.drO;
import o.drX;
import o.dsA;
import o.dtC;
import o.dxD;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class DemographicCollectionFragment extends AbstractC5495bzo implements InterfaceC8894fN {
    static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(DemographicCollectionFragment.class, "viewModel", "getViewModel()Lcom/netflix/mediaclient/ui/cfourintersitialsurvey/impl/DemographicCollectionViewModel;", 0))};
    private C5458bzD a;
    private final C5487bzg c;
    private d d;
    public SignupErrorReporter e;
    private final InterfaceC8554dpx i;
    @Inject
    public MoneyballDataSource moneyballDataSource;
    @Inject
    public InterfaceC5427byZ moneyballEntryPoint;

    public final void d(SignupErrorReporter signupErrorReporter) {
        C8632dsu.c((Object) signupErrorReporter, "");
        this.e = signupErrorReporter;
    }

    /* loaded from: classes4.dex */
    public static final class a extends AbstractC8882fB<DemographicCollectionFragment, C5499bzs> {
        final /* synthetic */ InterfaceC8660dtv a;
        final /* synthetic */ boolean c;
        final /* synthetic */ InterfaceC8660dtv d;
        final /* synthetic */ drM e;

        public a(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.a = interfaceC8660dtv;
            this.c = z;
            this.e = drm;
            this.d = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: d */
        public InterfaceC8554dpx<C5499bzs> c(DemographicCollectionFragment demographicCollectionFragment, dtC<?> dtc) {
            C8632dsu.c((Object) demographicCollectionFragment, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.a;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.d;
            return d.d(demographicCollectionFragment, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionFragment$special$$inlined$fragmentViewModel$default$2$1
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: b */
                public final String invoke() {
                    String name = drI.e(InterfaceC8660dtv.this).getName();
                    C8632dsu.a(name, "");
                    return name;
                }
            }, dsA.a(C5496bzp.class), this.c, this.e);
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

    public DemographicCollectionFragment() {
        final InterfaceC8660dtv a2 = dsA.a(C5499bzs.class);
        this.i = new a(a2, false, new drM<InterfaceC8890fJ<C5499bzs, C5496bzp>, C5499bzs>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionFragment$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.bzs, o.fS] */
            @Override // o.drM
            /* renamed from: a */
            public final C5499bzs invoke(InterfaceC8890fJ<C5499bzs, C5496bzp> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a2).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, C5496bzp.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a2).c(this, b[0]);
        this.c = new C5487bzg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C5499bzs i() {
        return (C5499bzs) this.i.getValue();
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private final DemographicCollectionEpoxyController a;
        private final C5504bzx d;

        public final DemographicCollectionEpoxyController c() {
            return this.a;
        }

        public final C5504bzx d() {
            return this.d;
        }

        public d(DemographicCollectionEpoxyController demographicCollectionEpoxyController, C5504bzx c5504bzx) {
            C8632dsu.c((Object) demographicCollectionEpoxyController, "");
            C8632dsu.c((Object) c5504bzx, "");
            this.a = demographicCollectionEpoxyController;
            this.d = c5504bzx;
        }
    }

    public final InterfaceC5427byZ b() {
        InterfaceC5427byZ interfaceC5427byZ = this.moneyballEntryPoint;
        if (interfaceC5427byZ != null) {
            return interfaceC5427byZ;
        }
        C8632dsu.d("");
        return null;
    }

    public final MoneyballDataSource d() {
        MoneyballDataSource moneyballDataSource = this.moneyballDataSource;
        if (moneyballDataSource != null) {
            return moneyballDataSource;
        }
        C8632dsu.d("");
        return null;
    }

    public final SignupErrorReporter f() {
        SignupErrorReporter signupErrorReporter = this.e;
        if (signupErrorReporter != null) {
            return signupErrorReporter;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC5495bzo, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        d(b().signupErrorReporter());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        return layoutInflater.inflate(C5503bzw.d.i, viewGroup, false);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    @SuppressLint({"CheckResult"})
    public void onViewCreated(View view, Bundle bundle) {
        C3786bKp c3786bKp;
        DemographicCollectionEpoxyController c2;
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        setCancelable(false);
        C9935zP.b bVar = C9935zP.b;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        C9935zP d2 = bVar.d(viewLifecycleOwner);
        SubscribersKt.subscribeBy$default(d2.d(AbstractC5492bzl.class), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionFragment$onViewCreated$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                e(th);
                return dpR.c;
            }

            public final void e(Throwable th) {
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
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        String c3 = errorType.c();
                        c1596aHd.a(c3 + " " + b2);
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
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
            }
        }, (drO) null, new drM<AbstractC5492bzl, dpR>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionFragment$onViewCreated$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC5492bzl abstractC5492bzl) {
                c(abstractC5492bzl);
                return dpR.c;
            }

            public final void c(AbstractC5492bzl abstractC5492bzl) {
                BooleanField f;
                C8632dsu.c((Object) abstractC5492bzl, "");
                if (abstractC5492bzl instanceof AbstractC5492bzl.c) {
                    DemographicCollectionFragment.this.j();
                } else if (abstractC5492bzl instanceof AbstractC5492bzl.e) {
                    DemographicCollectionFragment.this.h();
                } else if (abstractC5492bzl instanceof AbstractC5492bzl.a) {
                    DemographicCollectionFragment.this.i().j();
                    C5458bzD c5458bzD = DemographicCollectionFragment.this.a;
                    if (c5458bzD != null) {
                        final DemographicCollectionFragment demographicCollectionFragment = DemographicCollectionFragment.this;
                        c5458bzD.d(new NetworkRequestResponseListener() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionFragment$onViewCreated$2.1
                            @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
                            public void onBeforeNetworkAction(Request request) {
                                C8632dsu.c((Object) request, "");
                            }

                            @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
                            public void onAfterNetworkAction(Response response) {
                                C8632dsu.c((Object) response, "");
                                DemographicCollectionFragment.this.c.a();
                                DemographicCollectionFragment.this.dismiss();
                            }
                        });
                    }
                    DemographicCollectionFragment.this.c.d();
                } else {
                    boolean z = false;
                    if (abstractC5492bzl instanceof AbstractC5492bzl.b) {
                        C5458bzD c5458bzD2 = DemographicCollectionFragment.this.a;
                        f = c5458bzD2 != null ? c5458bzD2.j() : null;
                        if (f != null) {
                            f.setValue(Boolean.valueOf(((AbstractC5492bzl.b) abstractC5492bzl).a()));
                        }
                        C5499bzs i = DemographicCollectionFragment.this.i();
                        C5458bzD c5458bzD3 = DemographicCollectionFragment.this.a;
                        if (c5458bzD3 != null && c5458bzD3.m()) {
                            z = true;
                        }
                        i.c(z);
                    } else if (abstractC5492bzl instanceof AbstractC5492bzl.d) {
                        C5458bzD c5458bzD4 = DemographicCollectionFragment.this.a;
                        f = c5458bzD4 != null ? c5458bzD4.f() : null;
                        if (f != null) {
                            f.setValue(Boolean.valueOf(((AbstractC5492bzl.d) abstractC5492bzl).c()));
                        }
                        C5499bzs i2 = DemographicCollectionFragment.this.i();
                        C5458bzD c5458bzD5 = DemographicCollectionFragment.this.a;
                        if (c5458bzD5 != null && c5458bzD5.m()) {
                            z = true;
                        }
                        i2.c(z);
                    }
                }
            }
        }, 2, (Object) null);
        NetflixActivity requireNetflixActivity = requireNetflixActivity();
        C8632dsu.a(requireNetflixActivity, "");
        DemographicCollectionEpoxyController demographicCollectionEpoxyController = new DemographicCollectionEpoxyController(requireNetflixActivity, d2);
        C5504bzx e2 = C5504bzx.e(view);
        C8632dsu.a(e2, "");
        d dVar = new d(demographicCollectionEpoxyController, e2);
        this.d = dVar;
        C5504bzx d3 = dVar.d();
        if (d3 != null && (c3786bKp = d3.e) != null) {
            Context requireContext = requireContext();
            C8632dsu.a(requireContext, "");
            c3786bKp.setLayoutManager(new FillerGridLayoutManager(requireContext, 0, 0, false, false, 30, null));
            d dVar2 = this.d;
            c3786bKp.setAdapter((dVar2 == null || (c2 = dVar2.c()) == null) ? null : c2.getAdapter());
        }
        i().a(new e());
        C5499bzs i = i();
        NetflixActivity requireNetflixActivity2 = requireNetflixActivity();
        C8632dsu.a(requireNetflixActivity2, "");
        i.d(requireNetflixActivity2);
        this.c.j();
    }

    /* loaded from: classes4.dex */
    public static final class e implements C5499bzs.d {
        e() {
        }

        @Override // o.C5499bzs.d
        public void b(MoneyballData moneyballData) {
            C8632dsu.c((Object) moneyballData, "");
            if (DemographicCollectionFragment.this.getActivity() == null) {
                return;
            }
            if (!C8632dsu.c((Object) SignupConstants.Mode.COLLECT_DEMOGRAPHIC_INFO, (Object) moneyballData.getMode())) {
                if (!C8632dsu.c((Object) "memberHome", (Object) moneyballData.getMode())) {
                    SignupErrorReporter.onDataError$default(DemographicCollectionFragment.this.f(), SignupConstants.Error.UNKNOWN_MODE, moneyballData.getFlow() + "." + moneyballData.getMode(), null, 4, null);
                }
                DemographicCollectionFragment.this.dismiss();
                return;
            }
            DemographicCollectionFragment.this.d().getLiveMoneyballData().setValue(moneyballData);
            DemographicCollectionFragment demographicCollectionFragment = DemographicCollectionFragment.this;
            C5460bzF e = demographicCollectionFragment.b().e();
            NetflixActivity requireNetflixActivity = DemographicCollectionFragment.this.requireNetflixActivity();
            C8632dsu.a(requireNetflixActivity, "");
            demographicCollectionFragment.a = e.d(requireNetflixActivity);
            C5499bzs i = DemographicCollectionFragment.this.i();
            C5458bzD c5458bzD = DemographicCollectionFragment.this.a;
            boolean z = false;
            boolean z2 = c5458bzD != null && c5458bzD.l();
            C5458bzD c5458bzD2 = DemographicCollectionFragment.this.a;
            if (c5458bzD2 != null && c5458bzD2.o()) {
                z = true;
            }
            C5458bzD c5458bzD3 = DemographicCollectionFragment.this.a;
            i.b(z2, z, c5458bzD3 != null ? c5458bzD3.k() : null);
            DemographicCollectionFragment.this.c.e();
            DemographicCollectionFragment.this.c.g();
        }

        @Override // o.C5499bzs.d
        public void e(Throwable th) {
            C8632dsu.c((Object) th, "");
            DemographicCollectionFragment.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        int d2;
        Window window;
        Map k;
        Throwable th;
        final C5458bzD c5458bzD = this.a;
        if (c5458bzD == null) {
            return;
        }
        final List<C5466bzL> b2 = c5458bzD.b();
        if (b2.isEmpty()) {
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            k = dqE.k(new LinkedHashMap());
            C1596aHd c1596aHd = new C1596aHd("Gender options for demographic collection is empty", null, null, true, k, false, false, 96, null);
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
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c3 = dVar2.c();
            if (c3 != null) {
                c3.d(c1596aHd, th);
                return;
            } else {
                dVar2.e().b(c1596aHd, th);
                return;
            }
        }
        final Dialog dialog = new Dialog(new ContextThemeWrapper(requireNetflixActivity(), C5503bzw.b.e));
        dialog.setContentView(C5503bzw.d.c);
        if (dialog.getWindow() != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        ListView listView = (ListView) dialog.findViewById(C5503bzw.c.j);
        NetflixActivity requireNetflixActivity = requireNetflixActivity();
        C8632dsu.a(requireNetflixActivity, "");
        int i = C5503bzw.d.k;
        List<C5466bzL> b4 = c5458bzD.b();
        d2 = C8572dqo.d(b4, 10);
        ArrayList arrayList = new ArrayList(d2);
        for (C5466bzL c5466bzL : b4) {
            arrayList.add(c5466bzL.d());
        }
        listView.setAdapter((ListAdapter) new C5498bzr(requireNetflixActivity, i, arrayList));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o.bzk
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                DemographicCollectionFragment.d(C5458bzD.this, b2, this, dialog, adapterView, view, i2, j);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C5458bzD c5458bzD, List list, DemographicCollectionFragment demographicCollectionFragment, Dialog dialog, AdapterView adapterView, View view, int i, long j) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) demographicCollectionFragment, "");
        C8632dsu.c((Object) dialog, "");
        ChoiceField a2 = c5458bzD.a();
        if (a2 != null) {
            a2.setValue(((C5466bzL) list.get(i)).b());
        }
        demographicCollectionFragment.i().c(((C5466bzL) list.get(i)).d());
        demographicCollectionFragment.i().c(c5458bzD.m());
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        Map k;
        Throwable th;
        C5458bzD c5458bzD = this.a;
        if ((c5458bzD != null ? c5458bzD.g() : null) == null) {
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            k = dqE.k(new LinkedHashMap());
            C1596aHd c1596aHd = new C1596aHd("Demographic collection moneyball data null or invalid", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b2);
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
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c3 = dVar2.c();
            if (c3 != null) {
                c3.d(c1596aHd, th);
                return;
            } else {
                dVar2.e().b(c1596aHd, th);
                return;
            }
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(c5458bzD.g().longValue());
        calendar.add(1, -c5458bzD.i());
        Object clone = calendar.clone();
        C8632dsu.d(clone);
        Calendar calendar2 = (Calendar) clone;
        calendar2.add(1, -1);
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        DialogInterface$OnClickListenerC5486bzf dialogInterface$OnClickListenerC5486bzf = new DialogInterface$OnClickListenerC5486bzf(requireContext, C5503bzw.b.d, new c(c5458bzD, this), calendar2.get(1), calendar2.get(2), calendar2.get(5));
        dialogInterface$OnClickListenerC5486bzf.setTitle(C8168dfL.d(C5503bzw.a.i));
        dialogInterface$OnClickListenerC5486bzf.a().setMaxDate(calendar.getTimeInMillis());
        dialogInterface$OnClickListenerC5486bzf.show();
    }

    /* loaded from: classes4.dex */
    public static final class c implements DialogInterface$OnClickListenerC5486bzf.a {
        final /* synthetic */ DemographicCollectionFragment b;
        final /* synthetic */ C5458bzD e;

        c(C5458bzD c5458bzD, DemographicCollectionFragment demographicCollectionFragment) {
            this.e = c5458bzD;
            this.b = demographicCollectionFragment;
        }

        @Override // o.DialogInterface$OnClickListenerC5486bzf.a
        public void e(DatePicker datePicker, int i, int i2, int i3) {
            C8632dsu.c((Object) datePicker, "");
            NumberField e = this.e.e();
            if (e != null) {
                e.setValue(Integer.valueOf(i3));
            }
            NumberField d = this.e.d();
            if (d != null) {
                d.setValue(Integer.valueOf(i2 + 1));
            }
            NumberField c = this.e.c();
            if (c != null) {
                c.setValue(Integer.valueOf(i));
            }
            Calendar calendar = Calendar.getInstance();
            calendar.set(i, i2, i3);
            String format = new SimpleDateFormat("d MMMM yyyy").format(calendar.getTime());
            C5499bzs i4 = this.b.i();
            C8632dsu.d((Object) format);
            i4.b(format);
            this.b.i().c(this.e.m());
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.d = null;
        this.c.b();
    }

    /* loaded from: classes4.dex */
    public static final class b extends Dialog {
        b(NetflixActivity netflixActivity, int i) {
            super(netflixActivity, i);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            DemographicCollectionFragment.this.requireNetflixActivity().moveTaskToBack(true);
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new b(requireNetflixActivity(), R.l.m);
    }

    @Override // o.InterfaceC8894fN
    public void e() {
        C8980gu.c(i(), new drM<C5496bzp, dpR>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionFragment$invalidate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final dpR invoke(C5496bzp c5496bzp) {
                DemographicCollectionFragment.d dVar;
                DemographicCollectionEpoxyController c2;
                C8632dsu.c((Object) c5496bzp, "");
                dVar = DemographicCollectionFragment.this.d;
                if (dVar == null || (c2 = dVar.c()) == null) {
                    return null;
                }
                c2.setData(c5496bzp);
                return dpR.c;
            }
        });
    }
}
