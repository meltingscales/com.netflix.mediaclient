package o;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Mdx;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.mdx.CastSheetEpoxyController;
import java.util.Collections;
import java.util.List;
import o.AbstractC6571cfn;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.InterfaceC5131bsv;
import o.dpR;

@SuppressLint({"ViewConstructor"})
/* renamed from: o.ceL  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6490ceL extends TH {
    private final CastSheetEpoxyController d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6490ceL(C9935zP c9935zP, final drM<? super View, dpR> drm, final NetflixActivity netflixActivity) {
        super(netflixActivity, com.netflix.mediaclient.ui.R.i.p, new drM<View, dpR>() { // from class: com.netflix.mediaclient.ui.mdx.CastSheet$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(View view) {
                b(view);
                return dpR.c;
            }

            public final void b(View view) {
                InterfaceC5131bsv q;
                C8632dsu.c((Object) view, "");
                if (!Config_FastProperty_Mdx.Companion.b() && (q = NetflixActivity.this.getServiceManager().q()) != null) {
                    q.f();
                }
                drm.invoke(view);
            }
        }, null, 0, 0, 0, 0, netflixActivity.getResources().getDimensionPixelOffset(C9834xU.a.f13911o), true, false, false, false, false, 15608, null);
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) netflixActivity, "");
        Resources resources = netflixActivity.getResources();
        C8632dsu.a(resources, "");
        CastSheetEpoxyController castSheetEpoxyController = new CastSheetEpoxyController(c9935zP, resources);
        this.d = castSheetEpoxyController;
        RecyclerView recyclerView = (RecyclerView) findViewById(com.netflix.mediaclient.ui.R.g.fK);
        recyclerView.setLayoutManager(new LinearLayoutManager(netflixActivity));
        recyclerView.setAdapter(castSheetEpoxyController.getAdapter());
        recyclerView.setItemAnimator(null);
    }

    public final void c(NetflixActivity netflixActivity) {
        InterfaceC5131bsv q;
        String str;
        InterfaceC5160btX b;
        String aI_;
        String c;
        boolean g;
        Throwable th;
        String str2 = "";
        C8632dsu.c((Object) netflixActivity, "");
        ServiceManager serviceManager = netflixActivity.getServiceManager();
        InterfaceC5131bsv q2 = serviceManager.q();
        if (q2 == null) {
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            C1596aHd c1596aHd = new C1596aHd("SPY-35546: Mdx agent was null", null, null, false, null, false, false, 126, null);
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
        InterfaceC6580cfw requireMdxTargetCallback = netflixActivity.requireMdxTargetCallback();
        C8632dsu.a(requireMdxTargetCallback, "");
        C6533cfB c4 = requireMdxTargetCallback.c(q2);
        c4.c(c4.e(q2.i()));
        if (C6539cfH.a(serviceManager)) {
            if (!requireMdxTargetCallback.f() || (b = requireMdxTargetCallback.b()) == null) {
                str = "";
            } else {
                Resources resources = netflixActivity.getResources();
                String string = resources.getString(com.netflix.mediaclient.ui.R.o.hJ, "");
                C8632dsu.a(string, "");
                if (b.aY_()) {
                    String aK_ = b.aK_();
                    if (aK_ != null) {
                        g = C8691duz.g(aK_);
                        if (!g) {
                            c = resources.getString(com.netflix.mediaclient.ui.R.o.hq, b.aC_(), b.aK_(), Integer.valueOf(b.aw_()), b.aI_());
                            aI_ = c;
                            C8632dsu.d((Object) aI_);
                        }
                    }
                    c = C1333Xq.d(com.netflix.mediaclient.ui.R.o.hr).d("showName", b.aC_()).d("episodeName", b.aI_()).c();
                    aI_ = c;
                    C8632dsu.d((Object) aI_);
                } else {
                    aI_ = b.aI_();
                    C8632dsu.d((Object) aI_);
                }
                str = aI_;
                str2 = string;
            }
            String e = C8005dcH.e(serviceManager);
            CastSheetEpoxyController castSheetEpoxyController = this.d;
            C8632dsu.d((Object) e);
            castSheetEpoxyController.setData(new AbstractC6571cfn.c(e, str2, str));
        } else {
            if (!Config_FastProperty_Mdx.Companion.b() && (q = serviceManager.q()) != null) {
                q.b();
            }
            List<String> a = c4.a(getContext());
            if (a == null) {
                a = Collections.emptyList();
            }
            if (a.isEmpty()) {
                this.d.setData(AbstractC6571cfn.b.d);
            } else {
                CastSheetEpoxyController castSheetEpoxyController2 = this.d;
                C8632dsu.d(a);
                castSheetEpoxyController2.setData(new AbstractC6571cfn.d(a));
            }
        }
        open();
    }
}
