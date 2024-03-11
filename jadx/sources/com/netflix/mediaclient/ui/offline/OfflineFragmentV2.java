package com.netflix.mediaclient.ui.offline;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.session.command.RemoveCachedVideoCommand;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.offline.OfflineFragmentV2;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.PlayContext;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractC7299ctb;
import o.C1045Mp;
import o.C1596aHd;
import o.C1619aI;
import o.C1645aIz;
import o.C7178crM;
import o.C7279ctH;
import o.C7353cuc;
import o.C7357cug;
import o.C7359cui;
import o.C8054ddD;
import o.C8627dsp;
import o.C8632dsu;
import o.C9737vz;
import o.InterfaceC1078Nw;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC3643bFl;
import o.InterfaceC4208baF;
import o.InterfaceC5091bsH;
import o.InterfaceC5206buQ;
import o.InterfaceC5298bwC;
import o.InterfaceC7221csC;
import o.InterfaceC7281ctJ;
import o.bFO;
import o.dpR;
import o.dqE;
import o.drM;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public abstract class OfflineFragmentV2 extends AbstractC7299ctb implements InterfaceC5091bsH, bFO, InterfaceC7281ctJ.a {
    private boolean b;
    @Inject
    public InterfaceC7221csC downloadsFeatures;
    private final C1619aI e;
    private final C7359cui k;
    private InterfaceC4208baF l;
    private RecyclerView n;

    /* renamed from: o  reason: collision with root package name */
    private C7279ctH f13297o;
    private Parcelable p;
    private final b q;
    private boolean r;
    public static final a m = new a(null);
    public static final int j = 8;

    /* loaded from: classes4.dex */
    public interface b {
        void a(VideoType videoType, String str, String str2, PlayContext playContext, String str3);

        void c(String str, VideoType videoType, PlayContext playContext);

        void d();

        void d(String str, String str2);
    }

    private final void V() {
    }

    protected abstract int F();

    protected abstract void G();

    public void J() {
    }

    protected abstract void K();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean L();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void N();

    public final b P() {
        return this.q;
    }

    public final RecyclerView Q() {
        return this.n;
    }

    public final boolean S() {
        return this.r;
    }

    public abstract void c(InterfaceC5206buQ interfaceC5206buQ, int i);

    @Override // o.bFO
    public void e(Parcelable parcelable) {
        this.p = parcelable;
    }

    protected abstract boolean e();

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.InterfaceC5091bsH
    public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
        C8632dsu.c((Object) status, "");
    }

    public OfflineFragmentV2() {
        InterfaceC5298bwC u = NetflixApplication.getInstance().u();
        C8632dsu.d(u);
        this.k = (C7359cui) u;
        this.f13297o = new C7279ctH(this);
        this.e = new C1619aI();
        this.q = new d();
        setHasOptionsMenu(true);
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("OfflineFragmentV2");
        }
    }

    public final InterfaceC7221csC R() {
        InterfaceC7221csC interfaceC7221csC = this.downloadsFeatures;
        if (interfaceC7221csC != null) {
            return interfaceC7221csC;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class d implements b {
        d() {
        }

        @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2.b
        public void a(VideoType videoType, String str, String str2, PlayContext playContext, String str3) {
            C8632dsu.c((Object) videoType, "");
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) playContext, "");
            C8632dsu.c((Object) str3, "");
            NetflixActivity bj_ = OfflineFragmentV2.this.bj_();
            if (bj_ != null) {
                PlayLocationType j = playContext.j();
                C8632dsu.a(j, "");
                InterfaceC3643bFl.c.a(InterfaceC3643bFl.c.a(bj_), bj_, videoType, str, "", new TrackingInfoHolder(j).d(Integer.parseInt(str), playContext), "", null, 64, null);
            }
        }

        @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2.b
        public void d(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C7357cug.e.getLogTag();
            NetflixActivity bj_ = OfflineFragmentV2.this.bj_();
            if (bj_ != null) {
                bj_.startActivity(OfflineActivityV2.b.a(bj_, str, str2, false));
            }
        }

        @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2.b
        public void d() {
            C7353cuc.c(OfflineFragmentV2.this.bj_());
        }

        @Override // com.netflix.mediaclient.ui.offline.OfflineFragmentV2.b
        public void c(String str, VideoType videoType, PlayContext playContext) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) videoType, "");
            C8632dsu.c((Object) playContext, "");
            C7357cug.e.getLogTag();
            C7353cuc.c(OfflineFragmentV2.this.bj_(), str, videoType, playContext);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Parcelable parcelable;
        C8632dsu.c((Object) layoutInflater, "");
        C7353cuc.a().b(false);
        InterfaceC4208baF interfaceC4208baF = this.l;
        if (interfaceC4208baF != null) {
            interfaceC4208baF.q();
        }
        m.getLogTag();
        View inflate = layoutInflater.inflate(R.i.K, viewGroup, false);
        C8632dsu.d(inflate);
        RecyclerView recyclerView = (RecyclerView) inflate;
        this.n = recyclerView;
        if (recyclerView != null) {
            recyclerView.setClipToPadding(false);
        }
        b(recyclerView);
        Context context = recyclerView.getContext();
        C8632dsu.a(context, "");
        RecyclerView.LayoutManager c = c(context);
        RecyclerView recyclerView2 = this.n;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(c);
        }
        if (bundle != null && (parcelable = bundle.getParcelable("layout_manager_state")) != null) {
            c.onRestoreInstanceState(parcelable);
        }
        Parcelable parcelable2 = this.p;
        if (parcelable2 != null) {
            c.onRestoreInstanceState(parcelable2);
            this.p = null;
        }
        O();
        this.k.d().e(this);
        return inflate;
    }

    private final RecyclerView.LayoutManager c(Context context) {
        return new LinearLayoutManager(context);
    }

    public void b(RecyclerView recyclerView) {
        C8632dsu.c((Object) recyclerView, "");
        this.e.d(recyclerView);
    }

    public void d(RecyclerView recyclerView) {
        C8632dsu.c((Object) recyclerView, "");
        this.e.c(recyclerView);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        C8632dsu.c((Object) bundle, "");
        super.onSaveInstanceState(bundle);
        Parcelable a2 = a();
        if (a2 != null) {
            bundle.putParcelable("layout_manager_state", a2);
        }
    }

    @Override // o.bFO
    public Parcelable a() {
        RecyclerView.LayoutManager layoutManager;
        RecyclerView recyclerView = this.n;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return null;
        }
        return layoutManager.onSaveInstanceState();
    }

    public final void d(boolean z) {
        this.r = z;
        K();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
    }

    public final void T() {
        RecyclerView recyclerView = this.n;
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(0);
        }
    }

    private final void U() {
        final NetflixActivity bj_ = bj_();
        if (bj_ != null) {
            C1645aIz.a(bj_, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.offline.OfflineFragmentV2$setupAdapter$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                    d(serviceManager);
                    return dpR.c;
                }

                public final void d(ServiceManager serviceManager) {
                    C8632dsu.c((Object) serviceManager, "");
                    OfflineFragmentV2.this.M();
                    OfflineFragmentV2.this.N();
                    bj_.updateActionBar();
                    OfflineFragmentV2 offlineFragmentV2 = OfflineFragmentV2.this;
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                    C8632dsu.a(netflixImmutableStatus, "");
                    offlineFragmentV2.d(netflixImmutableStatus);
                    if (OfflineFragmentV2.this.L() || !OfflineFragmentV2.this.bo_()) {
                        return;
                    }
                    OfflineFragmentV2.this.bB_();
                }
            });
        }
    }

    public void M() {
        FragmentActivity activity;
        Intent intent;
        if (!bn_() || (activity = getActivity()) == null || (intent = activity.getIntent()) == null) {
            return;
        }
        d(intent);
    }

    private final void d(Intent intent) {
        ServiceManager bl_ = bl_();
        if (bl_ != null) {
            String stringExtra = intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_ID);
            VideoType create = VideoType.create(intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE));
            InterfaceC4208baF t = bl_.t();
            FragmentActivity activity = getActivity();
            if (activity == null || stringExtra == null || t == null) {
                return;
            }
            boolean o2 = t.o();
            boolean m2 = ConnectivityUtils.m(activity);
            if (!ConnectivityUtils.o(activity)) {
                C7178crM.e(activity, stringExtra, false).show();
                return;
            }
            PlayContext playContext = (PlayContext) intent.getParcelableExtra(NetflixActivity.EXTRA_PLAY_CONTEXT);
            if (!o2 || m2) {
                if (playContext != null) {
                    t.b(new CreateRequest(stringExtra, create, playContext));
                    return;
                }
                return;
            }
            C7178crM.a(activity, stringExtra, 0).show();
            if (playContext != null) {
                t.b(C7353cuc.b(stringExtra, create, playContext, true));
            }
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        RecyclerView recyclerView = this.n;
        if (recyclerView != null) {
            recyclerView.invalidateItemDecorations();
        }
        InterfaceC4208baF interfaceC4208baF = this.l;
        if (interfaceC4208baF != null) {
            C7279ctH c7279ctH = (C7279ctH) interfaceC4208baF.e((InterfaceC4208baF) this.f13297o);
        }
        if (this.b) {
            X();
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onPause() {
        InterfaceC4208baF interfaceC4208baF = this.l;
        if (interfaceC4208baF != null) {
            interfaceC4208baF.d(this.f13297o);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        I();
    }

    public final void X() {
        Map d2;
        Map k;
        Throwable th;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("SPY-13205: Activity should not be null when calling refreshData", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b2);
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
                return;
            } else {
                dVar.e().b(c1596aHd, th);
                return;
            }
        }
        boolean e = e();
        K();
        if (!e) {
            activity.invalidateOptionsMenu();
        }
    }

    public final void e(boolean z) {
        if (C9737vz.a(bj_())) {
            return;
        }
        C8054ddD.c(bj_(), R.o.iz, 1);
        if (z) {
            X();
        } else {
            by_().finish();
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.k.d().c(this);
        super.onDestroyView();
        RecyclerView recyclerView = this.n;
        if (recyclerView != null) {
            d(recyclerView);
        }
        this.b = false;
    }

    private final boolean I() {
        if (this.r) {
            d(false);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.invalidateOptionsMenu();
            }
            return true;
        }
        return false;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.bFP
    public boolean o() {
        return I();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean y() {
        return I();
    }

    @Override // o.InterfaceC7281ctJ.a
    public void W() {
        K();
    }

    public final void d(Menu menu, boolean z) {
        C8632dsu.c((Object) menu, "");
        if (z) {
            if (F() > 0) {
                MenuItem add = menu.add(0, R.g.bg, 0, R.o.bb);
                add.setIcon(R.e.X);
                add.setShowAsAction(2);
                add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: o.ctG
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        boolean d2;
                        d2 = OfflineFragmentV2.d(OfflineFragmentV2.this, menuItem);
                        return d2;
                    }
                });
                return;
            }
            return;
        }
        J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(OfflineFragmentV2 offlineFragmentV2, MenuItem menuItem) {
        C8632dsu.c((Object) offlineFragmentV2, "");
        C8632dsu.c((Object) menuItem, "");
        Logger logger = Logger.INSTANCE;
        Long startSession = logger.startSession(new RemoveCachedVideoCommand());
        offlineFragmentV2.G();
        logger.endSession(startSession);
        offlineFragmentV2.d(false);
        offlineFragmentV2.V();
        return true;
    }

    protected void O() {
        if (this.b) {
            return;
        }
        if (this.n != null) {
            ServiceManager bl_ = bl_();
            if (bl_ != null && bl_.c()) {
                if (bl_.H()) {
                    InterfaceC4208baF t = bl_.t();
                    this.l = t;
                    if (t != null) {
                        C7279ctH c7279ctH = (C7279ctH) t.e((InterfaceC4208baF) this.f13297o);
                    }
                    U();
                    this.b = true;
                    return;
                }
                return;
            }
            m.getLogTag();
            return;
        }
        m.getLogTag();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.InterfaceC5091bsH
    public void onManagerReady(ServiceManager serviceManager, Status status) {
        C8632dsu.c((Object) serviceManager, "");
        C8632dsu.c((Object) status, "");
        m.getLogTag();
        if (status.i()) {
            return;
        }
        O();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        C8632dsu.c((Object) view, "");
        view.setPadding(view.getPaddingLeft(), ((NetflixFrag) this).d + this.i + this.g, view.getPaddingRight(), view.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.bottomMargin = this.h;
    }
}
