package o;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.netflix.android.widgetry.widget.TrackedGridLayoutManager;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.lomo.LoMoUtils;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import o.AbstractC6337cbR;
import o.C1180Rt;
import o.InterfaceC6419ccu;
import o.aIB;

@AndroidEntryPoint
/* renamed from: o.cck  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6409cck extends AbstractC6411ccm implements bFO {
    public GenreItem b;
    public C6388ccP e;
    protected String j;
    protected final C1180Rt.d k = new C1180Rt.d() { // from class: o.cck.2
        @Override // o.C1180Rt.d
        public void e() {
            C6388ccP c6388ccP;
            C6409cck c6409cck = C6409cck.this;
            RG rg = c6409cck.n;
            if (rg == null || (c6388ccP = c6409cck.e) == null) {
                return;
            }
            c6388ccP.d(rg.e());
        }
    };
    protected TrackedGridLayoutManager l;
    public LoMo m;
    protected RG n;

    /* renamed from: o  reason: collision with root package name */
    protected C9909yq f13718o;
    private String p;
    private Parcelable q;
    private String r;

    public LoMo I() {
        return this.m;
    }

    protected int L() {
        return com.netflix.mediaclient.ui.R.i.ak;
    }

    protected boolean M() {
        return true;
    }

    public String N() {
        return this.r;
    }

    @Override // com.netflix.mediaclient.ui.home.HomeFragment, o.bRZ
    public void a(int i, int i2, String str) {
    }

    @Override // o.bRZ
    public void aa_() {
    }

    @Override // o.bRZ
    public InterfaceC6373ccA ab_() {
        return null;
    }

    @Override // o.bRZ
    public boolean ac_() {
        return false;
    }

    @Override // o.bRZ
    public void ad_() {
    }

    @Override // o.bRZ
    public boolean ae_() {
        return false;
    }

    @Override // o.bFO
    public void e(Parcelable parcelable) {
        this.q = parcelable;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    public static boolean a(String str) {
        return "queue".equals(str);
    }

    public static C6409cck a(LoMo loMo, String str) {
        C6409cck c6409cck = new C6409cck();
        Bundle bundle = new Bundle();
        bundle.putString("list_id", loMo.getId());
        bundle.putParcelable("lomo_parcel", loMo);
        bundle.putString("genre_from_lolomo", str);
        c6409cck.setArguments(bundle);
        return c6409cck;
    }

    public static C6409cck c(LoMo loMo) {
        return a(loMo, "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void F() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.setClassLoader(C6409cck.class.getClassLoader());
            this.r = arguments.getString("list_id");
            this.m = (LoMo) arguments.getParcelable("lomo_parcel");
            this.b = (GenreItem) arguments.getParcelable("genre_parcel");
            this.j = arguments.getString("genre_from_lolomo");
            this.p = arguments.getString("similars_videotype");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(L(), viewGroup, false);
        F();
        return inflate;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        d(view);
        b(view);
        super.onViewCreated(view, bundle);
    }

    @Override // com.netflix.mediaclient.ui.home.HomeFragment, o.bRZ
    public void a(boolean z) {
        C9909yq c9909yq = this.f13718o;
        if (c9909yq != null) {
            if (z) {
                c9909yq.smoothScrollToPosition(0);
            } else {
                c9909yq.scrollToPosition(0);
            }
        }
    }

    protected void b(View view) {
        this.f13718o = (C9909yq) view.findViewById(com.netflix.mediaclient.ui.R.g.bZ);
        if (C8171dfO.e()) {
            this.f13718o.setItemAnimator(null);
        }
        int a = LoMoUtils.a(bj_());
        e(a);
        d(bj_(), a);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        NetflixActivity bj_ = bj_();
        if (this.e == null || this.l == null || bj_ == null) {
            return;
        }
        int a = LoMoUtils.a(bj_);
        this.e.b(InterfaceC6419ccu.d.b(bj_, 1, a));
        this.l.setSpanCount(a);
    }

    protected void d(View view) {
        this.n = new C1164Rd(view, this.k, C1164Rd.e);
    }

    private void e(int i) {
        TrackedGridLayoutManager trackedGridLayoutManager = new TrackedGridLayoutManager(getActivity(), i) { // from class: o.cck.3
            @Override // com.netflix.android.widgetry.widget.TrackedLayoutManager
            public void a(String str) {
            }

            @Override // com.netflix.android.widgetry.widget.TrackedLayoutManager
            public String c() {
                return "GalleryLoMoFrag";
            }
        };
        this.l = trackedGridLayoutManager;
        trackedGridLayoutManager.setSpanCount(i);
        this.f13718o.setLayoutManager(this.l);
    }

    private void d(final NetflixActivity netflixActivity, final int i) {
        aIB.b(netflixActivity, new aIB.e() { // from class: o.ccg
            @Override // o.aIB.e
            public final void run(ServiceManager serviceManager) {
                C6409cck.this.e(netflixActivity, i, serviceManager);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(NetflixActivity netflixActivity, int i, ServiceManager serviceManager) {
        C1729aMb b = InterfaceC6419ccu.d.b(netflixActivity, 1, i);
        C6388ccP c6388ccP = this.e;
        if (c6388ccP == null || c6388ccP.getItemCount() == 0) {
            if (TextUtils.equals(this.r, "queue")) {
                String d = InterfaceC5135bsz.c(serviceManager).d();
                LoMo a = serviceManager.j().a(LoMoType.INSTANT_QUEUE.a());
                if (a != null) {
                    this.m = a;
                    C6393ccU c = C6393ccU.c();
                    TrackingInfoHolder trackingInfoHolder = new TrackingInfoHolder(PlayLocationType.VIDEO_VIEW);
                    if (d != null) {
                        trackingInfoHolder = trackingInfoHolder.c(d);
                    } else {
                        InterfaceC1598aHf.a("home lolomoId is null");
                    }
                    this.e = new C6406cch(this.f13718o.getContext(), a, d, serviceManager, b, a.getListPos(), c, trackingInfoHolder);
                } else {
                    InterfaceC1593aHa.b("missing queue (lolomo='" + d + "' activity='" + netflixActivity.getClass().getSimpleName() + "') ");
                    InterfaceC1598aHf.a(new C1596aHd("My List gallery requested but not loaded in cmp").b(false));
                    ActivityC6433cdH activityC6433cdH = (ActivityC6433cdH) C8141del.d(netflixActivity, ActivityC6433cdH.class);
                    if (activityC6433cdH != null && !C8054ddD.l(activityC6433cdH)) {
                        activityC6433cdH.finish();
                        return;
                    }
                    b(false);
                    if (this.n != null) {
                        this.f13718o.setVisibility(8);
                        this.n.c(true);
                        return;
                    }
                    return;
                }
            } else {
                ArrayList arrayList = new ArrayList();
                GenreItem genreItem = this.b;
                if (genreItem != null && genreItem.getTrackId() > 0) {
                    arrayList.add(Integer.valueOf(this.b.getTrackId()));
                }
                GenreItem genreItem2 = this.b;
                C6396ccX c6396ccX = new C6396ccX(genreItem2 != null ? genreItem2.getId() : this.r, arrayList);
                TrackingInfoHolder trackingInfoHolder2 = new TrackingInfoHolder(PlayLocationType.VIDEO_VIEW);
                if (this.p != null) {
                    this.e = new C6407cci(this.f13718o.getContext(), I(), VideoType.create(this.p), netflixActivity.getServiceManager(), b, I().getListPos(), c6396ccX, trackingInfoHolder2);
                } else {
                    b(netflixActivity, b, c6396ccX, trackingInfoHolder2, this.b);
                }
            }
            RG rg = this.n;
            if (rg != null) {
                rg.b(false);
            }
            S();
            C6388ccP c6388ccP2 = this.e;
            if (c6388ccP2 != null) {
                c6388ccP2.b(new AbstractC6337cbR.d() { // from class: o.cck.5
                    @Override // o.AbstractC6337cbR.d
                    public void d(AbstractC6337cbR abstractC6337cbR) {
                        if (abstractC6337cbR.g().size() == 0) {
                            C6409cck.this.b(false);
                            RG rg2 = C6409cck.this.n;
                            if (rg2 != null) {
                                rg2.a(true);
                            }
                        }
                    }

                    @Override // o.AbstractC6337cbR.d
                    public void c(AbstractC6337cbR abstractC6337cbR, int i2) {
                        C1044Mm.e("GalleryLoMoFrag", "onFetchError");
                        if (abstractC6337cbR.g().size() == 0) {
                            C6409cck c6409cck = C6409cck.this;
                            if (c6409cck.n != null) {
                                c6409cck.f13718o.setVisibility(8);
                                C6409cck.this.n.c(true);
                            }
                        }
                        C6409cck.this.d(IClientLogging.CompletionReason.failed);
                    }

                    @Override // o.AbstractC6337cbR.d
                    public void d(AbstractC6337cbR abstractC6337cbR, int i2) {
                        C1044Mm.e("GalleryLoMoFrag", "onFetchSuccess");
                        RG rg2 = C6409cck.this.n;
                        if (rg2 != null) {
                            rg2.b(false);
                        }
                        C6409cck.this.f13718o.setVisibility(0);
                        C6409cck.this.J();
                        C6409cck.this.d(IClientLogging.CompletionReason.success);
                    }
                });
                if (this.e.g().size() == 0) {
                    this.f13718o.setVisibility(4);
                }
            }
        } else {
            RG rg2 = this.n;
            if (rg2 != null) {
                rg2.b(false);
            }
        }
        C9870yD.b((View) this.f13718o, 0, b.a());
        C9870yD.b((View) this.f13718o, 2, b.a());
        this.f13718o.setAdapter(this.e);
        this.e.d(this.f13718o.getContext());
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onResume() {
        C9909yq c9909yq;
        super.onResume();
        C6388ccP c6388ccP = this.e;
        if (c6388ccP == null || (c9909yq = this.f13718o) == null) {
            return;
        }
        c6388ccP.a(c9909yq.getContext());
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onPause() {
        C9909yq c9909yq;
        C6388ccP c6388ccP = this.e;
        if (c6388ccP != null && (c9909yq = this.f13718o) != null) {
            c6388ccP.e(c9909yq.getContext());
        }
        super.onPause();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        GenreItem genreItem;
        C9909yq c9909yq;
        C6388ccP c6388ccP = this.e;
        if (c6388ccP != null && (c9909yq = this.f13718o) != null) {
            c6388ccP.c(c9909yq.getContext());
        }
        if (C8151dev.f() && (genreItem = this.b) != null && genreItem.getId() != null && "queue".equals(this.b.getId())) {
            this.e = null;
        }
        super.onDestroyView();
    }

    private void S() {
        C6388ccP c6388ccP = this.e;
        if (c6388ccP != null) {
            b(c6388ccP.getItemCount() == 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        String str;
        ViewStub viewStub;
        if (bn_()) {
            View view = getView();
            if (view == null) {
                InterfaceC1598aHf.a("SPY-14825: setEmptyVisibility( " + z + " ) called and getView() returned null");
                return;
            }
            C1181Ru c1181Ru = (C1181Ru) view.findViewById(com.netflix.mediaclient.ui.R.g.bw);
            if (c1181Ru == null && z && (viewStub = (ViewStub) view.findViewById(com.netflix.mediaclient.ui.R.g.br)) != null) {
                c1181Ru = (C1181Ru) viewStub.inflate();
            }
            if (c1181Ru != null) {
                e(view);
                c1181Ru.setVisibility(z ? 0 : 8);
                if (!z || (str = this.r) == null) {
                    return;
                }
                str.hashCode();
                if (str.equals("queue")) {
                    this.f13718o.setVisibility(4);
                    c1181Ru.setIconDrawable(com.netflix.mediaclient.ui.R.e.D);
                    c1181Ru.setMessageText(getString(com.netflix.mediaclient.ui.R.o.hA));
                    c1181Ru.setButtonText(getString(com.netflix.mediaclient.ui.R.o.hy));
                    c1181Ru.setButtonClickListener(new View.OnClickListener() { // from class: o.cck.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            if (C6409cck.this.isDetached()) {
                                return;
                            }
                            NetflixActivity bj_ = C6409cck.this.bj_();
                            if (bj_ instanceof HomeActivity) {
                                ((HomeActivity) bj_).t();
                            } else {
                                C6409cck.this.startActivity(HomeActivity.d((Context) bj_, AppView.browseTitlesGallery, false));
                            }
                        }
                    });
                }
            }
        }
    }

    public void J() {
        S();
        K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(IClientLogging.CompletionReason completionReason) {
        NetflixActivity bj_ = bj_();
        if (bj_ != null) {
            bj_.endRenderNavigationLevelSession(completionReason, null);
        }
    }

    protected void K() {
        Parcelable parcelable = this.q;
        if (parcelable == null || this.f13718o == null) {
            return;
        }
        C1044Mm.d("GalleryLoMoFrag", "Restoring layout manager state: %s", parcelable);
        this.f13718o.getLayoutManager().onRestoreInstanceState(this.q);
        this.q = null;
    }

    @Override // o.bFO
    public Parcelable a() {
        C9909yq c9909yq = this.f13718o;
        if (c9909yq == null || c9909yq.getLayoutManager() == null) {
            return null;
        }
        return this.f13718o.getLayoutManager().onSaveInstanceState();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        int i = this.i + ((NetflixFrag) this).d + this.g;
        C9870yD.b(view.findViewById(com.netflix.mediaclient.ui.R.g.bw), 1, i);
        C9909yq c9909yq = this.f13718o;
        if (c9909yq != null) {
            c9909yq.setPadding(c9909yq.getPaddingLeft(), i, this.f13718o.getPaddingRight(), this.h + this.f13718o.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.q));
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        NetflixActivity bj_ = bj_();
        InterfaceC5178btp interfaceC5178btp = this.b;
        String title = (interfaceC5178btp == null && (interfaceC5178btp = this.m) == null) ? null : interfaceC5178btp.getTitle();
        if (title != null && bj_ != null) {
            bj_.setTitle(title);
            NetflixActionBar netflixActionBar = bj_.getNetflixActionBar();
            if (netflixActionBar != null) {
                netflixActionBar.c(bj_.getActionBarStateBuilder().e((CharSequence) title).l(M()).b(false).h(true).f(true).c());
                return true;
            }
        }
        return false;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" - id: ");
        InterfaceC5178btp interfaceC5178btp = this.b;
        sb.append((interfaceC5178btp == null && (interfaceC5178btp = this.m) == null) ? null : interfaceC5178btp.getId());
        return sb.toString();
    }

    protected void b(NetflixActivity netflixActivity, C1729aMb c1729aMb, InterfaceC6394ccV interfaceC6394ccV, TrackingInfoHolder trackingInfoHolder, GenreItem genreItem) {
        LoMo I = I();
        this.e = new C6401ccc(this.f13718o.getContext(), I, netflixActivity.getServiceManager(), c1729aMb, I.getListPos(), interfaceC6394ccV, trackingInfoHolder.a(I));
    }
}
