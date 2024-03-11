package o;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.service.webclient.model.leafs.MembershipChoicesResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.MembershipProductChoice;
import com.netflix.mediaclient.service.webclient.model.leafs.UpdateProductChoiceResponse;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.ums.planselect.PlanSelectEpoxyController;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.ReplaySubject;
import java.text.DateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import o.ActivityC6188cXc;
import o.C1180Rt;
import o.C5087bsD;
import o.C6218cYf;
import o.C6220cYh;
import o.C8632dsu;
import o.InterfaceC1078Nw;
import o.RG;
import o.dpR;

/* renamed from: o.cYf  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6218cYf extends AbstractC1094Ol implements InterfaceC5091bsH {
    private CharSequence l;
    private a m;
    private bEO n;

    /* renamed from: o  reason: collision with root package name */
    private final BroadcastReceiver f13708o;
    private RG p;
    private PlanSelectEpoxyController q;
    private int r = -1;
    private final C1180Rt.d s = new C1180Rt.d() { // from class: o.cYm
        @Override // o.C1180Rt.d
        public final void e() {
            C6218cYf.g(C6218cYf.this);
        }
    };
    private final ReplaySubject<ServiceManager> t;
    private List<MembershipProductChoice> v;
    private Long x;
    private final BehaviorSubject<Integer> y;
    public static final d k = new d(null);
    public static final int j = 8;

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    public C6218cYf() {
        BehaviorSubject<Integer> create = BehaviorSubject.create();
        C8632dsu.a(create, "");
        this.y = create;
        ReplaySubject<ServiceManager> create2 = ReplaySubject.create();
        C8632dsu.a(create2, "");
        this.t = create2;
        this.l = "";
        this.f13708o = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C6218cYf c6218cYf) {
        C8632dsu.c((Object) c6218cYf, "");
        c6218cYf.I();
    }

    private final bEO N() {
        bEO beo = this.n;
        if (beo != null) {
            return beo;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    /* renamed from: o.cYf$c */
    /* loaded from: classes5.dex */
    public static final class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) intent, "");
            C6218cYf.this.bz_().b();
            C6218cYf.this.G();
        }
    }

    /* renamed from: o.cYf$d */
    /* loaded from: classes5.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("PlanSelectFragment");
        }

        public final C6218cYf a(String str) {
            C6218cYf c6218cYf = new C6218cYf();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_MESSAGE_CTA_PARAMS", str);
            c6218cYf.setArguments(bundle);
            return c6218cYf;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.n = bEO.e(layoutInflater, viewGroup, false);
        ConstraintLayout b2 = N().b();
        C8632dsu.a(b2, "");
        return b2;
    }

    @Override // o.AbstractC1094Ol, com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String string;
        C8632dsu.c((Object) view, "");
        Context context = view.getContext();
        C8632dsu.a(context, "");
        this.q = new PlanSelectEpoxyController(context, this.y);
        super.onViewCreated(view, bundle);
        bD_();
        this.p = new RG(view, this.s);
        EpoxyRecyclerView epoxyRecyclerView = N().c;
        PlanSelectEpoxyController planSelectEpoxyController = this.q;
        a aVar = null;
        if (planSelectEpoxyController == null) {
            C8632dsu.d("");
            planSelectEpoxyController = null;
        }
        epoxyRecyclerView.setController(planSelectEpoxyController);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("EXTRA_MESSAGE_CTA_PARAMS")) != null) {
            aVar = (a) C8118deO.a().fromJson(string, (Class<Object>) a.class);
        }
        if (aVar == null) {
            aVar = new a(null, null, false, 7, null);
        }
        this.m = aVar;
        this.r = bundle != null ? bundle.getInt("LAST_SELECTED_PLAN_ID", -1) : -1;
        if (this.v == null) {
            RG rg = this.p;
            if (rg != null) {
                rg.a(true);
            }
        } else {
            N().c.setVisibility(0);
        }
        Observable<Integer> startWith = this.y.startWith(Integer.valueOf(this.r));
        final drM<Integer, CharSequence> drm = new drM<Integer, CharSequence>() { // from class: com.netflix.mediaclient.ui.ums.planselect.PlanSelectFragment$onViewCreated$2
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final CharSequence invoke(Integer num) {
                CharSequence c2;
                C8632dsu.c((Object) num, "");
                c2 = C6218cYf.this.c(num.intValue());
                return c2;
            }
        };
        Observable distinctUntilChanged = startWith.map(new Function() { // from class: o.cYn
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                CharSequence d2;
                d2 = C6218cYf.d(drM.this, obj);
                return d2;
            }
        }).distinctUntilChanged();
        C8632dsu.a(distinctUntilChanged, "");
        DisposableKt.addTo(SubscribersKt.subscribeBy$default(distinctUntilChanged, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.ums.planselect.PlanSelectFragment$onViewCreated$3
            public final void b(Throwable th) {
                C8632dsu.c((Object) th, "");
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                b(th);
                return dpR.c;
            }
        }, (drO) null, new drM<CharSequence, dpR>() { // from class: com.netflix.mediaclient.ui.ums.planselect.PlanSelectFragment$onViewCreated$4
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(CharSequence charSequence) {
                b(charSequence);
                return dpR.c;
            }

            public final void b(CharSequence charSequence) {
                C6218cYf c6218cYf = C6218cYf.this;
                C8632dsu.d(charSequence);
                c6218cYf.l = charSequence;
                C6218cYf.this.e();
            }
        }, 2, (Object) null), this.f);
        L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (CharSequence) drm.invoke(obj);
    }

    @Override // o.AbstractC1094Ol
    public void b(InterfaceC2023aX interfaceC2023aX) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        PlanSelectEpoxyController planSelectEpoxyController = this.q;
        if (planSelectEpoxyController == null) {
            C8632dsu.d("");
            planSelectEpoxyController = null;
        }
        C6217cYe currentData = planSelectEpoxyController.getCurrentData();
        if (currentData == null) {
            return;
        }
        if (currentData.e()) {
            C1781aO c1781aO = new C1781aO();
            c1781aO.e(com.netflix.mediaclient.ui.R.i.aQ);
            cXV cxv = new cXV();
            cxv.e((CharSequence) "confirm-button");
            cxv.b(new View.OnClickListener() { // from class: o.cYk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C6218cYf.this.b(view);
                }
            });
            cxv.d(this.l);
            c1781aO.add(cxv);
            C3814bLq c3814bLq = new C3814bLq();
            c3814bLq.d(com.netflix.mediaclient.ui.R.i.aR);
            c3814bLq.b((CharSequence) "text-2");
            c3814bLq.d((CharSequence) getString(com.netflix.mediaclient.ui.R.o.jw));
            c1781aO.add(c3814bLq);
            C3814bLq c3814bLq2 = new C3814bLq();
            c3814bLq2.d(com.netflix.mediaclient.ui.R.i.ba);
            c3814bLq2.b((CharSequence) "text-3");
            c3814bLq2.d((CharSequence) getString(com.netflix.mediaclient.ui.R.o.jq));
            c1781aO.add(c3814bLq2);
            C3805bLh c3805bLh = new C3805bLh();
            c3805bLh.c(com.netflix.mediaclient.ui.R.i.aM);
            c3805bLh.e((CharSequence) "cancel-button");
            c3805bLh.b((CharSequence) getString(com.netflix.mediaclient.ui.R.o.ju));
            c3805bLh.b(new View.OnClickListener() { // from class: o.cYl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C6218cYf.b(C6218cYf.this, view);
                }
            });
            c1781aO.add(c3805bLh);
            interfaceC2023aX.add(c1781aO);
            return;
        }
        C1781aO c1781aO2 = new C1781aO();
        c1781aO2.e(com.netflix.mediaclient.ui.R.i.aU);
        cXV cxv2 = new cXV();
        cxv2.e((CharSequence) "confirm-button");
        cxv2.b(new View.OnClickListener() { // from class: o.cYk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6218cYf.this.b(view);
            }
        });
        cxv2.d(this.l);
        c1781aO2.add(cxv2);
        C6215cYc c6215cYc = new C6215cYc();
        c6215cYc.e((CharSequence) "footer-text");
        c1781aO2.add(c6215cYc);
        interfaceC2023aX.add(c1781aO2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C6218cYf c6218cYf, View view) {
        C8632dsu.c((Object) c6218cYf, "");
        c6218cYf.F();
    }

    private final void F() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C6220cYh.c.e();
        String str = C1814aPf.b(context) + "/CancelPlan?netflixsource=android&inapp=true&esn=" + Uri.encode(bz_().k().m());
        ActivityC6188cXc.d dVar = ActivityC6188cXc.d;
        dVar.e(str);
        startActivity(dVar.a(context, str, null, null, true));
    }

    @Override // o.NY, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(0);
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        NetflixActivity bj_ = bj_();
        if (bj_ != null) {
            NetflixActionBar netflixActionBar = bj_.getNetflixActionBar();
            if (netflixActionBar != null) {
                netflixActionBar.c(bj_.getActionBarStateBuilder().b(true).b(NetflixActionBar.LogoType.a).e("").c());
            }
            return true;
        }
        return false;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.InterfaceC5091bsH
    public void onManagerReady(ServiceManager serviceManager, Status status) {
        C8632dsu.c((Object) serviceManager, "");
        C8632dsu.c((Object) status, "");
        super.onManagerReady(serviceManager, status);
        this.t.onNext(serviceManager);
        if (this.v == null) {
            I();
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        C8632dsu.c((Object) bundle, "");
        super.onSaveInstanceState(bundle);
        Integer value = this.y.getValue();
        if (value != null) {
            bundle.putInt("LAST_SELECTED_PLAN_ID", value.intValue());
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.n = null;
        this.y.onComplete();
        this.t.onComplete();
        C6220cYh.c.c();
        M();
    }

    private final void L() {
        LocalBroadcastManager.getInstance(requireActivity()).registerReceiver(this.f13708o, new IntentFilter("RefreshUserMessageRequest.ACTION_DISMISS_UMA_MESSAGE"));
    }

    private final void M() {
        LocalBroadcastManager.getInstance(requireActivity()).unregisterReceiver(this.f13708o);
    }

    private final void I() {
        RG rg = this.p;
        if (rg != null) {
            rg.a(true);
        }
        DisposableKt.addTo(SubscribersKt.subscribeBy$default(this.t, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.ums.planselect.PlanSelectFragment$fetchData$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                b(th);
                return dpR.c;
            }

            public final void b(Throwable th) {
                C8632dsu.c((Object) th, "");
                C6218cYf c6218cYf = C6218cYf.this;
                NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ad;
                C8632dsu.a(netflixImmutableStatus, "");
                c6218cYf.d(netflixImmutableStatus);
            }
        }, (drO) null, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.ums.planselect.PlanSelectFragment$fetchData$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                e(serviceManager);
                return dpR.c;
            }

            public final void e(ServiceManager serviceManager) {
                String logTag = C6218cYf.k.getLogTag();
                final C6218cYf c6218cYf = C6218cYf.this;
                serviceManager.d(new C5087bsD(logTag) { // from class: com.netflix.mediaclient.ui.ums.planselect.PlanSelectFragment$fetchData$2.1
                    @Override // o.C5087bsD, o.InterfaceC5094bsK
                    public void c(MembershipChoicesResponse membershipChoicesResponse, Status status) {
                        C8632dsu.c((Object) status, "");
                        super.c(membershipChoicesResponse, status);
                        if (membershipChoicesResponse == null) {
                            RG rg2 = C6218cYf.this.p;
                            if (rg2 != null) {
                                rg2.c(true);
                            }
                            C6218cYf c6218cYf2 = C6218cYf.this;
                            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aP;
                            C8632dsu.a(netflixImmutableStatus, "");
                            c6218cYf2.d(netflixImmutableStatus);
                            return;
                        }
                        C6220cYh.c.a(membershipChoicesResponse.getTrackingInfo());
                        C6218cYf.this.d(membershipChoicesResponse);
                        C6218cYf c6218cYf3 = C6218cYf.this;
                        NetflixImmutableStatus netflixImmutableStatus2 = InterfaceC1078Nw.aJ;
                        C8632dsu.a(netflixImmutableStatus2, "");
                        c6218cYf3.d(netflixImmutableStatus2);
                    }
                });
            }
        }, 2, (Object) null), this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(final MembershipChoicesResponse membershipChoicesResponse) {
        EpoxyRecyclerView epoxyRecyclerView;
        RG rg = this.p;
        if (rg != null) {
            rg.b(true);
        }
        bEO beo = this.n;
        PlanSelectEpoxyController planSelectEpoxyController = null;
        EpoxyRecyclerView epoxyRecyclerView2 = beo != null ? beo.c : null;
        if (epoxyRecyclerView2 != null) {
            epoxyRecyclerView2.setVisibility(0);
        }
        this.v = membershipChoicesResponse.getChoices();
        this.x = Long.valueOf(membershipChoicesResponse.getNextBillingDate());
        a aVar = this.m;
        if (aVar == null) {
            C8632dsu.d("");
            aVar = null;
        }
        boolean b2 = aVar.b();
        C6217cYe c6217cYe = new C6217cYe(membershipChoicesResponse, b2 ? com.netflix.mediaclient.ui.R.o.jv : com.netflix.mediaclient.ui.R.o.jI, b2);
        PlanSelectEpoxyController planSelectEpoxyController2 = this.q;
        if (planSelectEpoxyController2 == null) {
            C8632dsu.d("");
        } else {
            planSelectEpoxyController = planSelectEpoxyController2;
        }
        planSelectEpoxyController.setData(c6217cYe);
        e();
        bEO beo2 = this.n;
        if (beo2 == null || (epoxyRecyclerView = beo2.c) == null) {
            return;
        }
        epoxyRecyclerView.post(new Runnable() { // from class: o.cYj
            @Override // java.lang.Runnable
            public final void run() {
                C6218cYf.a(C6218cYf.this, membershipChoicesResponse);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C6218cYf c6218cYf, MembershipChoicesResponse membershipChoicesResponse) {
        C8632dsu.c((Object) c6218cYf, "");
        C8632dsu.c((Object) membershipChoicesResponse, "");
        int i = c6218cYf.r;
        if (i == -1) {
            c6218cYf.a(membershipChoicesResponse);
        } else {
            c6218cYf.y.onNext(Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(View view) {
        a aVar;
        Object obj;
        List<MembershipProductChoice> list = this.v;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                aVar = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                int latestPlanId = ((MembershipProductChoice) obj).getLatestPlanId();
                Integer value = this.y.getValue();
                if (value != null && latestPlanId == value.intValue()) {
                    break;
                }
            }
            MembershipProductChoice membershipProductChoice = (MembershipProductChoice) obj;
            if (membershipProductChoice == null) {
                return;
            }
            view.setEnabled(false);
            RG rg = this.p;
            if (rg != null) {
                rg.a(true);
            }
            C6220cYh.c.c(membershipProductChoice.getLatestPlanId());
            boolean z = membershipProductChoice.getNewBillingDate() != null;
            ServiceManager bz_ = bz_();
            int latestPlanId2 = membershipProductChoice.getLatestPlanId();
            String latestPriceTier = membershipProductChoice.getLatestPriceTier();
            a aVar2 = this.m;
            if (aVar2 == null) {
                C8632dsu.d("");
                aVar2 = null;
            }
            String e = aVar2.e();
            a aVar3 = this.m;
            if (aVar3 == null) {
                C8632dsu.d("");
            } else {
                aVar = aVar3;
            }
            bz_.a(String.valueOf(latestPlanId2), latestPriceTier, e, aVar.a(), Boolean.valueOf(z), new b(membershipProductChoice, k.getLogTag()));
        }
    }

    /* renamed from: o.cYf$b */
    /* loaded from: classes5.dex */
    public static final class b extends C5087bsD {
        final /* synthetic */ MembershipProductChoice e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MembershipProductChoice membershipProductChoice, String str) {
            super(str);
            this.e = membershipProductChoice;
        }

        @Override // o.C5087bsD, o.InterfaceC5094bsK
        public void c(UpdateProductChoiceResponse updateProductChoiceResponse, Status status) {
            C8632dsu.c((Object) status, "");
            super.c(updateProductChoiceResponse, status);
            RG rg = C6218cYf.this.p;
            if (rg != null) {
                rg.b(false);
            }
            C6220cYh.c.d(updateProductChoiceResponse);
            if (status.j() && updateProductChoiceResponse != null) {
                C6218cYf.this.b(this.e);
            } else {
                d dVar = C6218cYf.k;
                C6218cYf.this.K();
            }
            C6218cYf.this.G();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        requireActivity().setResult(-1);
        requireActivity().finish();
    }

    private final void a(MembershipChoicesResponse membershipChoicesResponse) {
        Object obj;
        Iterator<T> it = membershipChoicesResponse.getChoices().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((MembershipProductChoice) obj).isCurrent()) {
                break;
            }
        }
        MembershipProductChoice membershipProductChoice = (MembershipProductChoice) obj;
        if (membershipProductChoice != null) {
            this.y.onNext(Integer.valueOf(membershipProductChoice.getLatestPlanId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Toast K() {
        return C8054ddD.a(getContext(), getString(com.netflix.mediaclient.ui.R.o.jx), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Toast b(MembershipProductChoice membershipProductChoice) {
        return C8054ddD.a(getContext(), getString(com.netflix.mediaclient.ui.R.o.jy, membershipProductChoice.getPlanName()), 1);
    }

    /* renamed from: o.cYf$a */
    /* loaded from: classes5.dex */
    public static final class a {
        @SerializedName("context")
        private final String a;
        @SerializedName("message_guid")
        private final String b;
        @SerializedName("show_cancel_flow")
        private final boolean c;

        public a() {
            this(null, null, false, 7, null);
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.c;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.b, (Object) aVar.b) && C8632dsu.c((Object) this.a, (Object) aVar.a) && this.c == aVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (((this.b.hashCode() * 31) + this.a.hashCode()) * 31) + Boolean.hashCode(this.c);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.a;
            boolean z = this.c;
            return "PlanSelectParams(messageGuid=" + str + ", requestContext=" + str2 + ", showCancelFlow=" + z + ")";
        }

        public a(String str, String str2, boolean z) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.a = str2;
            this.c = z;
        }

        public /* synthetic */ a(String str, String str2, boolean z, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        C8632dsu.c((Object) view, "");
        view.setPadding(view.getPaddingLeft(), ((NetflixFrag) this).d, view.getPaddingRight(), view.getPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CharSequence c(int i) {
        Object obj;
        int i2;
        List<MembershipProductChoice> list = this.v;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((MembershipProductChoice) obj).getLatestPlanId() == i) {
                    break;
                }
            }
            MembershipProductChoice membershipProductChoice = (MembershipProductChoice) obj;
            if (membershipProductChoice == null) {
                return "";
            }
            Typeface e = C1336Xt.e(getActivity());
            String c2 = C1333Xq.d(MembershipProductChoice.MembershipDuration.WEEK == membershipProductChoice.getPriceDuration() ? com.netflix.mediaclient.ui.R.o.jM : com.netflix.mediaclient.ui.R.o.jL).d("formatted_localized_price", membershipProductChoice.getLatestPriceFormatted()).c();
            DateFormat dateInstance = DateFormat.getDateInstance(3, C4984bqG.b.e().c());
            Long newBillingDate = membershipProductChoice.getNewBillingDate();
            String format = dateInstance.format(new Date((newBillingDate == null && (newBillingDate = this.x) == null) ? 0L : newBillingDate.longValue()));
            Boolean isNewBillingDateApproximate = membershipProductChoice.isNewBillingDateApproximate();
            Boolean bool = Boolean.TRUE;
            boolean z = C8632dsu.c(isNewBillingDateApproximate, bool) || (membershipProductChoice.getNewBillingDate() == null && this.x == null);
            if (membershipProductChoice.isCurrent()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                C8145dep c8145dep = new C8145dep(e);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) C1333Xq.d(z ? com.netflix.mediaclient.ui.R.o.jB : com.netflix.mediaclient.ui.R.o.jC).d("price_per_period", c2).d("billing_date", format).c());
                spannableStringBuilder.setSpan(c8145dep, length, spannableStringBuilder.length(), 17);
                return spannableStringBuilder;
            } else if (membershipProductChoice.isDowngrade()) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                C8145dep c8145dep2 = new C8145dep(e);
                int length2 = spannableStringBuilder2.length();
                spannableStringBuilder2.append((CharSequence) C1333Xq.d(z ? com.netflix.mediaclient.ui.R.o.jz : com.netflix.mediaclient.ui.R.o.jD).d("price_per_period", c2).d("billing_date", format).c());
                spannableStringBuilder2.setSpan(c8145dep2, length2, spannableStringBuilder2.length(), 17);
                return spannableStringBuilder2;
            } else if (membershipProductChoice.isUpgrade()) {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                C8145dep c8145dep3 = new C8145dep(e);
                int length3 = spannableStringBuilder3.length();
                spannableStringBuilder3.append((CharSequence) C1333Xq.d(com.netflix.mediaclient.ui.R.o.jR).c());
                spannableStringBuilder3.setSpan(c8145dep3, length3, spannableStringBuilder3.length(), 17);
                if (C8632dsu.c(membershipProductChoice.getRevokesUouOffer(), bool) && z) {
                    i2 = com.netflix.mediaclient.ui.R.o.jO;
                } else {
                    i2 = C8632dsu.c(membershipProductChoice.getRevokesUouOffer(), bool) ? com.netflix.mediaclient.ui.R.o.jQ : z ? com.netflix.mediaclient.ui.R.o.jS : com.netflix.mediaclient.ui.R.o.jK;
                }
                SpannableStringBuilder append = spannableStringBuilder3.append((CharSequence) C1333Xq.d(i2).d("price_per_period", c2).d("billing_date", format).c());
                C8632dsu.a(append, "");
                return append;
            } else {
                return "";
            }
        }
        return "";
    }
}
