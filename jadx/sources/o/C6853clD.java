package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaCta;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.multimonth.MultiMonthEpoxyController;
import com.netflix.mediaclient.ui.multimonth.MultiMonthOfferFragment$epoxyController$1;
import com.netflix.mediaclient.ui.multimonth.MultiMonthOfferFragment$epoxyController$2;
import com.netflix.mediaclient.ui.multimonth.MultiMonthOfferFragment$epoxyController$3;
import java.util.Iterator;
import java.util.List;
import o.C1180Rt;
import o.C6853clD;
import o.C6899clx;
import o.C9834xU;

/* renamed from: o.clD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6853clD extends NetflixFrag {
    public static final c e = new c(null);
    private C6865clP b;
    private C6861clL j;
    private RG k;
    private final InterfaceC8554dpx m;

    /* renamed from: o  reason: collision with root package name */
    private int f13746o;
    private UmaAlert t;
    private final C1180Rt.d n = new C1180Rt.d() { // from class: o.clJ
        @Override // o.C1180Rt.d
        public final void e() {
            C6853clD.G();
        }
    };
    private final MultiMonthEpoxyController l = new MultiMonthEpoxyController(new MultiMonthOfferFragment$epoxyController$1(this), new MultiMonthOfferFragment$epoxyController$2(this), new MultiMonthOfferFragment$epoxyController$3(this));

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G() {
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    public C6853clD() {
        InterfaceC8554dpx b;
        b = dpB.b(new drO<C6899clx>() { // from class: com.netflix.mediaclient.ui.multimonth.MultiMonthOfferFragment$multiMonthOfferViewModel$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final C6899clx invoke() {
                return (C6899clx) new ViewModelProvider(C6853clD.this).get(C6899clx.class);
            }
        });
        this.m = b;
    }

    public final C6865clP a() {
        C6865clP c6865clP = this.b;
        if (c6865clP != null) {
            return c6865clP;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    /* renamed from: o.clD$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("MultiMonthOfferFragment");
        }

        public final Fragment d() {
            return new C6853clD();
        }
    }

    private final C6899clx I() {
        return (C6899clx) this.m.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.b = C6865clP.b(layoutInflater, viewGroup, false);
        FrameLayout c2 = a().c();
        C8632dsu.a(c2, "");
        return c2;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String string;
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        RG rg = new RG(view, this.n);
        rg.a(true);
        this.k = rg;
        a().b.setController(this.l);
        if (bundle == null || (string = bundle.getString("SELECTED_OFFER_ID_KEY")) == null) {
            return;
        }
        this.l.setSelectedOfferId(string);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.b = null;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        C8632dsu.c((Object) bundle, "");
        super.onSaveInstanceState(bundle);
        C6861clL c6861clL = this.j;
        if (c6861clL != null) {
            bundle.putString("SELECTED_OFFER_ID_KEY", c6861clL.d());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        J();
    }

    private final void J() {
        String trackingInfo;
        UmaAlert umaAlert = this.t;
        if (umaAlert == null || (trackingInfo = umaAlert.trackingInfo()) == null) {
            return;
        }
        C6900cly.d.d(trackingInfo);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        N();
    }

    private final void N() {
        C6900cly.d.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(C6861clL c6861clL) {
        this.j = c6861clL;
        C6900cly.d.c(c6861clL.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        L();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private final void L() {
        List<UmaCta> ctas;
        Object obj;
        UmaAlert umaAlert = this.t;
        if (umaAlert == null || (ctas = umaAlert.ctas()) == null) {
            return;
        }
        Iterator<T> it = ctas.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            UmaCta umaCta = (UmaCta) next;
            if (C8632dsu.c(umaCta != null ? umaCta.action() : null, (Object) "DISMISS")) {
                obj = next;
                break;
            }
        }
        UmaCta umaCta2 = (UmaCta) obj;
        if (umaCta2 != null) {
            C6900cly.d.b(umaCta2.trackingInfo());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            startActivityForResult(ActivityC6857clH.a.d(activity, str), 0);
            M();
        }
    }

    private final void M() {
        List<UmaCta> ctas;
        Object obj;
        UmaAlert umaAlert = this.t;
        if (umaAlert == null || (ctas = umaAlert.ctas()) == null) {
            return;
        }
        Iterator<T> it = ctas.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            UmaCta umaCta = (UmaCta) next;
            if (!C8632dsu.c(umaCta != null ? umaCta.action() : null, (Object) "DISMISS")) {
                obj = next;
                break;
            }
        }
        UmaCta umaCta2 = (UmaCta) obj;
        if (umaCta2 != null) {
            C6900cly.d.e(umaCta2.trackingInfo());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        NetflixActivity bj_;
        if ((i2 == -1 || i2 > 1) && (bj_ = bj_()) != null) {
            if (bj_.isTaskRoot()) {
                Intent d = HomeActivity.d((Context) bj_, (AppView) null, false);
                d.setFlags(268468224);
                C6861clL c6861clL = this.j;
                d.putExtra("MULTI_MONTH_OFFER_DURATION", c6861clL != null ? c6861clL.c() : null);
                C8632dsu.a(d, "");
                bj_.startActivity(d);
            }
            Intent intent2 = new Intent();
            C6861clL c6861clL2 = this.j;
            intent2.putExtra("MULTI_MONTH_OFFER_DURATION", c6861clL2 != null ? c6861clL2.c() : null);
            dpR dpr = dpR.c;
            bj_.setResult(i2, intent2);
            bj_.finish();
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.InterfaceC5091bsH
    public void onManagerReady(ServiceManager serviceManager, Status status) {
        C8632dsu.c((Object) serviceManager, "");
        C8632dsu.c((Object) status, "");
        super.onManagerReady(serviceManager, status);
        b(serviceManager);
    }

    public final void b(ServiceManager serviceManager) {
        dpR dpr;
        C8632dsu.c((Object) serviceManager, "");
        UmaAlert x = serviceManager.x();
        if (x != null) {
            this.t = x;
            J();
            I().b(x);
            if (I().g()) {
                if (I().f()) {
                    a().c.setBackgroundResource(C9834xU.c.I);
                }
                this.l.setData(I());
                RG rg = this.k;
                if (rg != null) {
                    rg.b(true);
                }
                a().b.setVisibility(0);
                String umsAlertRenderFeedback = x.umsAlertRenderFeedback();
                if (umsAlertRenderFeedback != null) {
                    serviceManager.c(umsAlertRenderFeedback);
                    dpr = dpR.c;
                }
            } else {
                e(serviceManager);
                dpr = dpR.c;
            }
            if (dpr == null || this.t != null) {
            }
            e(serviceManager);
            return;
        }
        dpr = null;
        if (dpr == null) {
        }
    }

    private final void e(ServiceManager serviceManager) {
        int i = this.f13746o;
        if (i > 1) {
            F();
            return;
        }
        this.f13746o = i + 1;
        RG rg = this.k;
        if (rg != null) {
            rg.a(true);
        }
        serviceManager.e(true, "IGNORE_SNOOZING");
    }

    private final void F() {
        onActivityResult(MP.d, Integer.MAX_VALUE, null);
    }
}
