package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.CancelCommand;
import com.netflix.cl.model.event.session.command.PlayCommand;
import com.netflix.cl.model.event.session.command.SelectCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.PlayerPrefetchSource;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.details.LiveState;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag;
import com.netflix.mediaclient.ui.lomo.qddp.QuickDrawDialogFrag;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import com.netflix.model.leafs.RecommendedTrailer;
import com.netflix.model.leafs.originals.ContentWarning;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC3179au;
import o.AbstractC3664bGf;
import o.AbstractC3725bIi;
import o.AbstractC6719cic;
import o.AbstractC8882fB;
import o.C1045Mp;
import o.C1163Rc;
import o.C1234Tv;
import o.C1332Xp;
import o.C1596aHd;
import o.C1619aI;
import o.C1645aIz;
import o.C2755am;
import o.C3644bFm;
import o.C3654bFw;
import o.C3670bGh;
import o.C3672bGj;
import o.C3705bHp;
import o.C3706bHq;
import o.C3726bIj;
import o.C3727bIk;
import o.C3729bIm;
import o.C3732bIp;
import o.C3738bIv;
import o.C5105bsV;
import o.C6648chK;
import o.C6652chO;
import o.C6692ciB;
import o.C6717cia;
import o.C8006dcI;
import o.C8054ddD;
import o.C8067ddQ;
import o.C8126deW;
import o.C8141del;
import o.C8150deu;
import o.C8153dex;
import o.C8171dfO;
import o.C8556dpz;
import o.C8586drb;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.C8737dwr;
import o.C8749dxc;
import o.C8903fW;
import o.C8925fs;
import o.C8930fx;
import o.C8931fy;
import o.C8980gu;
import o.C9737vz;
import o.C9834xU;
import o.C9935zP;
import o.DialogC1237Ty;
import o.GF;
import o.InterfaceC1126Pr;
import o.InterfaceC1270Vf;
import o.InterfaceC1593aHa;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.InterfaceC3643bFl;
import o.InterfaceC3825bMa;
import o.InterfaceC3829bMe;
import o.InterfaceC4208baF;
import o.InterfaceC4209baG;
import o.InterfaceC4255bb;
import o.InterfaceC5125bsp;
import o.InterfaceC5157btU;
import o.InterfaceC5160btX;
import o.InterfaceC5194buE;
import o.InterfaceC5195buF;
import o.InterfaceC5198buI;
import o.InterfaceC5227bul;
import o.InterfaceC5303bwH;
import o.InterfaceC5344bww;
import o.InterfaceC7303ctf;
import o.InterfaceC7365cuo;
import o.InterfaceC8366diy;
import o.InterfaceC8554dpx;
import o.InterfaceC8585dra;
import o.InterfaceC8660dtv;
import o.InterfaceC8890fJ;
import o.InterfaceC8976gq;
import o.RunnableC8122deS;
import o.bDE;
import o.bFO;
import o.bFP;
import o.bJB;
import o.bLU;
import o.bZK;
import o.cPL;
import o.cPU;
import o.cWC;
import o.dpB;
import o.dpR;
import o.dqE;
import o.drI;
import o.drM;
import o.drO;
import o.drX;
import o.dsA;
import o.dtC;
import o.dwU;
import org.json.JSONObject;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class FullDpFrag extends AbstractC3725bIi implements bFP, bFO {
    static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(FullDpFrag.class, "videoViewModel", "getVideoViewModel()Lcom/netflix/mediaclient/ui/detailspage/impl/fulldp/ShowViewModel;", 0)), dsA.c(new PropertyReference1Impl(FullDpFrag.class, "fullDpViewModel", "getFullDpViewModel()Lcom/netflix/mediaclient/ui/detailspage/impl/fulldp/FullDpViewModel;", 0))};
    public static final c e = new c(null);
    private static final C5105bsV j;
    private final h A;
    private String B;
    private InterfaceC4209baG C;
    private TrackingInfoHolder D;
    private VideoType F;
    private final InterfaceC8554dpx H;
    @Inject
    public InterfaceC5303bwH adsPlan;
    @Inject
    public InterfaceC1270Vf clock;
    @Inject
    public C3705bHp fullDpCl;
    private final InterfaceC5344bww.d l;
    private InterfaceC4209baG m;
    @Inject
    public C3706bHq migrationFeature;
    private C3644bFm n;

    /* renamed from: o  reason: collision with root package name */
    private final AppView f13269o;
    @Inject
    public InterfaceC7303ctf offlineApi;
    private final boolean p;
    @Inject
    public Lazy<PlaybackLauncher> playbackLauncher;
    private final InterfaceC8554dpx q;
    private e r;
    private boolean s;
    @Inject
    public InterfaceC1126Pr sharing;
    private d t;
    private final InterfaceC8554dpx u;
    @Inject
    public cWC uma;
    private Parcelable v;
    private final g w;
    private final InterfaceC8554dpx x;
    private final j z;
    private int y = AppView.UNKNOWN.ordinal();
    private final CompositeDisposable k = new CompositeDisposable();

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return this.f13269o;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bo_() {
        return this.p;
    }

    @Override // o.bFO
    public void e(Parcelable parcelable) {
        this.v = parcelable;
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC8882fB<FullDpFrag, C3726bIj> {
        final /* synthetic */ drM a;
        final /* synthetic */ InterfaceC8660dtv c;
        final /* synthetic */ boolean d;
        final /* synthetic */ InterfaceC8660dtv e;

        public f(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.e = interfaceC8660dtv;
            this.d = z;
            this.a = drm;
            this.c = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: d */
        public InterfaceC8554dpx<C3726bIj> c(FullDpFrag fullDpFrag, dtC<?> dtc) {
            C8632dsu.c((Object) fullDpFrag, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.e;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.c;
            return d.d(fullDpFrag, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$special$$inlined$fragmentViewModel$default$4$1
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
            }, dsA.a(C3727bIk.class), this.d, this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC8882fB<FullDpFrag, C3732bIp> {
        final /* synthetic */ drM a;
        final /* synthetic */ boolean c;
        final /* synthetic */ InterfaceC8660dtv d;
        final /* synthetic */ InterfaceC8660dtv e;

        public i(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.e = interfaceC8660dtv;
            this.c = z;
            this.a = drm;
            this.d = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        public /* bridge */ /* synthetic */ InterfaceC8554dpx<C3732bIp> c(FullDpFrag fullDpFrag, dtC dtc) {
            return c(fullDpFrag, (dtC<?>) dtc);
        }

        public InterfaceC8554dpx<C3732bIp> c(FullDpFrag fullDpFrag, dtC<?> dtc) {
            C8632dsu.c((Object) fullDpFrag, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.e;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.d;
            return d.d(fullDpFrag, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$special$$inlined$fragmentViewModel$default$2$1
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
            }, dsA.a(C3729bIm.class), this.c, this.a);
        }
    }

    public FullDpFrag() {
        InterfaceC8554dpx b2;
        InterfaceC8554dpx b3;
        final InterfaceC8660dtv a2 = dsA.a(C3732bIp.class);
        i iVar = new i(a2, false, new drM<InterfaceC8890fJ<C3732bIp, C3729bIm>, C3732bIp>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.bIp, o.fS] */
            @Override // o.drM
            /* renamed from: e */
            public final C3732bIp invoke(InterfaceC8890fJ<C3732bIp, C3729bIm> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a2).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, C3729bIm.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a2);
        dtC<?>[] dtcArr = b;
        this.H = iVar.c((i) this, dtcArr[0]);
        final InterfaceC8660dtv a3 = dsA.a(C3726bIj.class);
        this.q = new f(a3, false, new drM<InterfaceC8890fJ<C3726bIj, C3727bIk>, C3726bIj>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$special$$inlined$fragmentViewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.bIj, o.fS] */
            @Override // o.drM
            /* renamed from: a */
            public final C3726bIj invoke(InterfaceC8890fJ<C3726bIj, C3727bIk> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a3).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, C3727bIk.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a3).c(this, dtcArr[1]);
        this.F = VideoType.UNKNOWN;
        this.D = TrackingInfoHolder.a.b();
        this.l = new b();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.e;
        b2 = dpB.b(lazyThreadSafetyMode, new drO<MiniPlayerVideoGroupViewModel>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$miniPlayerViewModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final MiniPlayerVideoGroupViewModel invoke() {
                C5105bsV c5105bsV;
                MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel = (MiniPlayerVideoGroupViewModel) new ViewModelProvider(FullDpFrag.this.by_()).get(MiniPlayerVideoGroupViewModel.class);
                c5105bsV = FullDpFrag.j;
                miniPlayerVideoGroupViewModel.a(c5105bsV);
                miniPlayerVideoGroupViewModel.a(true);
                return miniPlayerVideoGroupViewModel;
            }
        });
        this.x = b2;
        b3 = dpB.b(lazyThreadSafetyMode, new drO<C6717cia>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$playerOrientationManager$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final C6717cia invoke() {
                if (C8150deu.w(FullDpFrag.this.by_()) || C8067ddQ.c()) {
                    return null;
                }
                C6652chO c6652chO = new C6652chO(null);
                final FullDpFrag fullDpFrag = FullDpFrag.this;
                return new C6717cia(c6652chO, new C6648chK() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$playerOrientationManager$2.1
                    @Override // o.C6648chK, o.C6720cid, o.C6717cia.a
                    public void e(Fragment fragment, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel) {
                        C8632dsu.c((Object) fragment, "");
                        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
                        if (C8150deu.w(FullDpFrag.this.by_())) {
                            return;
                        }
                        super.e(fragment, miniPlayerVideoGroupViewModel);
                        e(false);
                    }

                    @Override // o.C6648chK, o.C6720cid, o.C6717cia.a
                    public void b(Fragment fragment, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel) {
                        C8632dsu.c((Object) fragment, "");
                        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
                        if (C8150deu.w(FullDpFrag.this.by_())) {
                            return;
                        }
                        super.b(fragment, miniPlayerVideoGroupViewModel);
                        e(true);
                    }

                    private final void e(boolean z) {
                        FullDpFrag.d dVar;
                        C3672bGj e2;
                        FullDpFrag.this.s = z;
                        dVar = FullDpFrag.this.t;
                        bJB bjb = (dVar == null || (e2 = dVar.e()) == null) ? null : e2.b;
                        if (bjb == null) {
                            return;
                        }
                        bjb.setScrollingLocked(z);
                    }
                });
            }
        });
        this.u = b3;
        this.w = new g();
        this.z = new j();
        this.A = new h();
        this.f13269o = AppView.movieDetails;
        this.p = true;
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("FullDpFrag");
        }

        public final FullDpFrag d(String str, VideoType videoType, String str2, String str3, Long l, TrackingInfoHolder trackingInfoHolder, int i, PlayerExtras playerExtras) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) videoType, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            FullDpFrag fullDpFrag = new FullDpFrag();
            Bundle bundle = new Bundle();
            bundle.putParcelable("tracking_info_holder", trackingInfoHolder);
            Bundle bundle2 = new Bundle();
            bundle2.putString(NetflixActivity.EXTRA_VIDEO_ID, str);
            bundle2.putString(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE, videoType.getValue());
            bundle2.putString("extra_video_title", str2);
            bundle2.putInt("extra_model_view_id", i);
            if (str3 != null) {
                bundle2.putString(NetflixActivity.EXTRA_TRAILER_ID, str3);
            }
            if (l != null) {
                bundle2.putLong(NetflixActivity.EXTRA_TRAILER_BOOKMARK_MS, l.longValue());
            }
            bundle.putBundle("mavericks:arg", bundle2);
            bundle.putParcelable(NetflixActivity.EXTRA_PLAYER_EXTRAS, playerExtras);
            fullDpFrag.setArguments(bundle);
            return fullDpFrag;
        }

        public final boolean c(Context context) {
            C8632dsu.c((Object) context, "");
            return (!C6692ciB.a.e() || AccessibilityUtils.a(context) || C8067ddQ.c()) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d {
        private final C1619aI a;
        private final C9935zP b;
        private final FullDpEpoxyController c;
        private final C3672bGj d;
        private final InterfaceC4255bb e;

        public final C1619aI a() {
            return this.a;
        }

        public final FullDpEpoxyController b() {
            return this.c;
        }

        public final InterfaceC4255bb c() {
            return this.e;
        }

        public final C9935zP d() {
            return this.b;
        }

        public final C3672bGj e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.d, dVar.d) && C8632dsu.c(this.b, dVar.b) && C8632dsu.c(this.e, dVar.e) && C8632dsu.c(this.c, dVar.c) && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.d.hashCode() * 31) + this.b.hashCode()) * 31) + this.e.hashCode()) * 31) + this.c.hashCode()) * 31) + this.a.hashCode();
        }

        public String toString() {
            C3672bGj c3672bGj = this.d;
            C9935zP c9935zP = this.b;
            InterfaceC4255bb interfaceC4255bb = this.e;
            FullDpEpoxyController fullDpEpoxyController = this.c;
            C1619aI c1619aI = this.a;
            return "Holder(layoutBinding=" + c3672bGj + ", eventBusFactory=" + c9935zP + ", modelBuildListener=" + interfaceC4255bb + ", epoxyController=" + fullDpEpoxyController + ", visibilityTracker=" + c1619aI + ")";
        }

        public d(C3672bGj c3672bGj, C9935zP c9935zP, InterfaceC4255bb interfaceC4255bb, FullDpEpoxyController fullDpEpoxyController, C1619aI c1619aI) {
            C8632dsu.c((Object) c3672bGj, "");
            C8632dsu.c((Object) c9935zP, "");
            C8632dsu.c((Object) interfaceC4255bb, "");
            C8632dsu.c((Object) fullDpEpoxyController, "");
            C8632dsu.c((Object) c1619aI, "");
            this.d = c3672bGj;
            this.b = c9935zP;
            this.e = interfaceC4255bb;
            this.c = fullDpEpoxyController;
            this.a = c1619aI;
        }
    }

    static {
        j = new C5105bsV(C8150deu.h() ? "TrailerDPTablet" : "TrailerDP", false, new drO<String>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$Companion$trailerPlaybackExperience$1
            @Override // o.drO
            /* renamed from: e */
            public final String invoke() {
                String d2 = C8126deW.d();
                C8632dsu.a(d2, "");
                return d2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3732bIp U() {
        return (C3732bIp) this.H.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3726bIj R() {
        return (C3726bIj) this.q.getValue();
    }

    public final C3705bHp J() {
        C3705bHp c3705bHp = this.fullDpCl;
        if (c3705bHp != null) {
            return c3705bHp;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC5344bww.d {
        b() {
        }
    }

    private final MiniPlayerVideoGroupViewModel S() {
        return (MiniPlayerVideoGroupViewModel) this.x.getValue();
    }

    private final C6717cia X() {
        return (C6717cia) this.u.getValue();
    }

    /* loaded from: classes4.dex */
    public static final class g extends BroadcastReceiver {
        g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            FullDpFrag.e.getLogTag();
            if (intent == null || !C8632dsu.c((Object) FullDpFrag.this.B, (Object) intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_ID))) {
                return;
            }
            C3732bIp.c(FullDpFrag.this.U(), false, false, 3, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends BroadcastReceiver {
        j() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            FullDpFrag.e.getLogTag();
            if (intent == null || !C8632dsu.c((Object) FullDpFrag.this.B, (Object) intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_ID))) {
                return;
            }
            FullDpFrag.this.e();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends BroadcastReceiver {
        h() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra;
            String str = "";
            C8632dsu.c((Object) context, "");
            FullDpFrag.e.getLogTag();
            if (intent != null && (stringExtra = intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_ID)) != null) {
                str = stringExtra;
            }
            if (!C8632dsu.c((Object) FullDpFrag.this.B, (Object) str) || FullDpFrag.this.M().e()) {
                return;
            }
            C3732bIp.c(FullDpFrag.this.U(), false, false, 3, null);
        }
    }

    public final InterfaceC7303ctf K() {
        InterfaceC7303ctf interfaceC7303ctf = this.offlineApi;
        if (interfaceC7303ctf != null) {
            return interfaceC7303ctf;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC1126Pr N() {
        InterfaceC1126Pr interfaceC1126Pr = this.sharing;
        if (interfaceC1126Pr != null) {
            return interfaceC1126Pr;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC1270Vf I() {
        InterfaceC1270Vf interfaceC1270Vf = this.clock;
        if (interfaceC1270Vf != null) {
            return interfaceC1270Vf;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<PlaybackLauncher> L() {
        Lazy<PlaybackLauncher> lazy = this.playbackLauncher;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final cWC O() {
        cWC cwc = this.uma;
        if (cwc != null) {
            return cwc;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC5303bwH G() {
        InterfaceC5303bwH interfaceC5303bwH = this.adsPlan;
        if (interfaceC5303bwH != null) {
            return interfaceC5303bwH;
        }
        C8632dsu.d("");
        return null;
    }

    public final C3706bHq M() {
        C3706bHq c3706bHq = this.migrationFeature;
        if (c3706bHq != null) {
            return c3706bHq;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public InteractiveTrackerInterface bi_() {
        e eVar;
        if (getActivity() == null) {
            eVar = null;
        } else {
            ImageLoader requireImageLoader = NetflixActivity.requireImageLoader(requireActivity());
            C8632dsu.a(requireImageLoader, "");
            eVar = new e(requireImageLoader);
        }
        this.r = eVar;
        return eVar;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        if (M().e()) {
            return ((Boolean) C8980gu.b(R(), U(), new drX<C3727bIk, C3729bIm, Boolean>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$isLoadingData$1
                @Override // o.drX
                /* renamed from: e */
                public final Boolean invoke(C3727bIk c3727bIk, C3729bIm c3729bIm) {
                    C8632dsu.c((Object) c3727bIk, "");
                    C8632dsu.c((Object) c3729bIm, "");
                    return Boolean.valueOf(!c3727bIk.e().e() && c3729bIm.k());
                }
            })).booleanValue();
        }
        return ((Boolean) C8980gu.c(U(), new drM<C3729bIm, Boolean>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$isLoadingData$2
            @Override // o.drM
            /* renamed from: a */
            public final Boolean invoke(C3729bIm c3729bIm) {
                C8632dsu.c((Object) c3729bIm, "");
                return Boolean.valueOf(c3729bIm.k());
            }
        })).booleanValue();
    }

    @Override // o.bMX, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        C6717cia X = X();
        if (X != null) {
            X.b(this, S());
        }
        S().k();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        C3644bFm c3644bFm = this.n;
        if (c3644bFm != null) {
            c3644bFm.c();
        }
        this.n = null;
        S().n();
        super.onStop();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C6717cia X = X();
        if (X != null) {
            X.b(this, S());
        }
        C8980gu.c(R(), new drM<C3727bIk, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$onResume$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3727bIk c3727bIk) {
                d(c3727bIk);
                return dpR.c;
            }

            public final void d(C3727bIk c3727bIk) {
                FullDpFrag.d dVar;
                C9935zP d2;
                C8632dsu.c((Object) c3727bIk, "");
                if (c3727bIk.a()) {
                    FullDpFrag.c cVar = FullDpFrag.e;
                    Context requireContext = FullDpFrag.this.requireContext();
                    C8632dsu.a(requireContext, "");
                    if (cVar.c(requireContext)) {
                        cVar.getLogTag();
                        dVar = FullDpFrag.this.t;
                        if (dVar == null || (d2 = dVar.d()) == null) {
                            return;
                        }
                        d2.b(AbstractC6719cic.class, new AbstractC6719cic.e.C0117e(0, 41));
                    }
                }
            }
        });
        C1332Xp c1332Xp = C1332Xp.b;
        ((InterfaceC5344bww) C1332Xp.b(InterfaceC5344bww.class)).d(this.l);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onPause() {
        C9935zP d2;
        C6717cia X = X();
        if (X != null) {
            X.b();
        }
        e.getLogTag();
        d dVar = this.t;
        if (dVar != null && (d2 = dVar.d()) != null) {
            d2.b(AbstractC6719cic.class, new AbstractC6719cic.e.C0117e(0, 40));
        }
        C1332Xp c1332Xp = C1332Xp.b;
        ((InterfaceC5344bww) C1332Xp.b(InterfaceC5344bww.class)).c(this.l);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        C6717cia X;
        C8632dsu.c((Object) configuration, "");
        super.onConfigurationChanged(configuration);
        if (C8150deu.w(by_()) || (X = X()) == null) {
            return;
        }
        X.a(this, S(), configuration);
    }

    @Override // o.bMX, com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        C8632dsu.a(arguments, "");
        Bundle bundle2 = arguments.getBundle("mavericks:arg");
        if (bundle2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        C8632dsu.a(bundle2, "");
        this.B = bundle2.getString(NetflixActivity.EXTRA_VIDEO_ID);
        this.y = bundle2.getInt("extra_model_view_id", AppView.UNKNOWN.ordinal());
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        String str = this.B;
        aVar.a("FullDpFrag - videoId: " + str);
        if (bundle != null) {
            aVar.a("Restoring from state");
        }
        if (this.B == null) {
            throw new IllegalArgumentException("videoId can't be null".toString());
        }
        String string = bundle2.getString(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE);
        if (string == null) {
            throw new IllegalArgumentException("videoTypeString extra not set!".toString());
        }
        C8632dsu.a(string, "");
        VideoType create = VideoType.create(string);
        C8632dsu.a(create, "");
        this.F = create;
        if (create != VideoType.SHOW && create != VideoType.MOVIE) {
            throw new IllegalStateException("Invalid topLevelVideoType found".toString());
        }
        TrackingInfoHolder trackingInfoHolder = (TrackingInfoHolder) arguments.getParcelable("tracking_info_holder");
        if (trackingInfoHolder == null) {
            trackingInfoHolder = TrackingInfoHolder.a.b();
        }
        this.D = trackingInfoHolder;
        this.n = new C3644bFm(by_(), this.F);
        if (bundle == null || (parcelable = bundle.getParcelable("fdp_ss_layout_manager")) == null) {
            return;
        }
        e(parcelable);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(C3670bGh.e.k, viewGroup, false);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        C9935zP.b bVar = C9935zP.b;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        C9935zP d2 = bVar.d(viewLifecycleOwner);
        C3672bGj c2 = C3672bGj.c(view);
        C8632dsu.a(c2, "");
        final bJB bjb = c2.b;
        Objects.requireNonNull(bjb);
        bjb.setHasFixedSize(true);
        bjb.setItemAnimator(null);
        bjb.setLayoutManager(new LinearLayoutManager(bjb.getContext()));
        C1619aI c1619aI = new C1619aI();
        c1619aI.b((Integer) 50);
        C8632dsu.d(bjb);
        c1619aI.d(bjb);
        dwU e2 = U().e();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner2, "");
        FullDpEpoxyController fullDpEpoxyController = new FullDpEpoxyController(by_(), d2, new bLU(e2, c1619aI, viewLifecycleOwner2, new drX<InterfaceC3825bMa, AbstractC3179au, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$onViewCreated$epoxyPresentationTracking$1
            @Override // o.drX
            public /* synthetic */ dpR invoke(InterfaceC3825bMa interfaceC3825bMa, AbstractC3179au abstractC3179au) {
                b(interfaceC3825bMa, abstractC3179au);
                return dpR.c;
            }

            public final void b(InterfaceC3825bMa interfaceC3825bMa, AbstractC3179au abstractC3179au) {
                C8632dsu.c((Object) interfaceC3825bMa, "");
                C8632dsu.c((Object) abstractC3179au, "");
                if (interfaceC3825bMa instanceof InterfaceC3829bMe) {
                    InterfaceC3829bMe interfaceC3829bMe = (InterfaceC3829bMe) interfaceC3825bMa;
                    CLv2Utils.b(!interfaceC3829bMe.h(abstractC3179au), interfaceC3829bMe.aj_(), interfaceC3829bMe.m().invoke(), null);
                }
            }
        }, 0L, 0, null, null, 240, null), this.D, S(), G(), M(), I());
        bjb.setAdapter(fullDpEpoxyController.getAdapter());
        InterfaceC4255bb interfaceC4255bb = new InterfaceC4255bb() { // from class: o.bHW
            @Override // o.InterfaceC4255bb
            public final void b(C2755am c2755am) {
                FullDpFrag.b(FullDpFrag.this, bjb, c2755am);
            }
        };
        fullDpEpoxyController.addModelBuildListener(interfaceC4255bb);
        if (C8153dex.l()) {
            bjb.addOnScrollListener(new a());
        }
        this.t = new d(c2, d2, interfaceC4255bb, fullDpEpoxyController, c1619aI);
        Q();
        a(d2);
        Context context = getContext();
        if (context != null) {
            e.getLogTag();
            LocalBroadcastManager.getInstance(context).registerReceiver(this.w, new IntentFilter("com.netflix.falkor.ACTION_NOTIFY_OF_RATINGS_CHANGE"));
            LocalBroadcastManager.getInstance(context).registerReceiver(this.z, new IntentFilter("com.netflix.mediaclient.intent.action.UPDATE_CAPABILITIES_BADGES"));
            if (M().e()) {
                return;
            }
            LocalBroadcastManager.getInstance(context).registerReceiver(this.A, new IntentFilter("action_notify_of_remind_me"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(FullDpFrag fullDpFrag, bJB bjb, C2755am c2755am) {
        RecyclerView.LayoutManager layoutManager;
        C8632dsu.c((Object) fullDpFrag, "");
        C8632dsu.c((Object) c2755am, "");
        fullDpFrag.bD_();
        if (fullDpFrag.v == null || fullDpFrag.isLoadingData() || (layoutManager = bjb.getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(fullDpFrag.v);
        fullDpFrag.v = null;
    }

    /* loaded from: classes4.dex */
    public static final class a extends RecyclerView.OnScrollListener {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C8632dsu.c((Object) recyclerView, "");
            NetflixActivity bj_ = FullDpFrag.this.bj_();
            if (bj_ != null) {
                bj_.onScrolled(i2);
            }
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        C8632dsu.c((Object) bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("fdp_ss_layout_manager", a());
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        d dVar = this.t;
        if (dVar != null) {
            dVar.b().removeModelBuildListener(dVar.c());
        }
        this.t = null;
        e eVar = this.r;
        if (eVar != null) {
            eVar.d();
        }
        this.r = null;
        ag();
        P();
        Context context = getContext();
        if (context != null) {
            e.getLogTag();
            LocalBroadcastManager.getInstance(context).unregisterReceiver(this.w);
            LocalBroadcastManager.getInstance(context).unregisterReceiver(this.z);
            LocalBroadcastManager.getInstance(context).unregisterReceiver(this.A);
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void bq_() {
        ab();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(FullDpFrag fullDpFrag) {
        C1619aI a2;
        C8632dsu.c((Object) fullDpFrag, "");
        d dVar = fullDpFrag.t;
        if (dVar == null || (a2 = dVar.a()) == null) {
            return;
        }
        a2.b();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void bu_() {
        View view = getView();
        if (view != null) {
            view.postDelayed(new Runnable() { // from class: o.bIb
                @Override // java.lang.Runnable
                public final void run() {
                    FullDpFrag.s(FullDpFrag.this);
                }
            }, 50L);
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void bv_() {
        C1619aI a2;
        d dVar = this.t;
        if (dVar == null || (a2 = dVar.a()) == null) {
            return;
        }
        a2.b();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        super.bD_();
        C8980gu.c(U(), new drM<C3729bIm, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$updateActionBar$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final dpR invoke(C3729bIm c3729bIm) {
                boolean T;
                C8632dsu.c((Object) c3729bIm, "");
                NetflixActivity bj_ = FullDpFrag.this.bj_();
                if (bj_ != null) {
                    FullDpFrag fullDpFrag = FullDpFrag.this;
                    NetflixActionBar netflixActionBar = bj_.getNetflixActionBar();
                    if (netflixActionBar != null) {
                        NetflixActionBar.b.C0051b actionBarStateBuilder = bj_.getActionBarStateBuilder();
                        T = fullDpFrag.T();
                        NetflixActionBar.b.C0051b e2 = actionBarStateBuilder.k(!T).e(true);
                        InterfaceC8366diy c2 = c3729bIm.g().c();
                        netflixActionBar.c(e2.e((CharSequence) (c2 != null ? c2.getTitle() : null)).l(false).g(false).f(true).h(true).b(C8150deu.h() ? fullDpFrag.getResources().getDimensionPixelSize(R.b.X) : Integer.MAX_VALUE).c());
                        return dpR.c;
                    }
                    return null;
                }
                return null;
            }
        });
        return true;
    }

    @Override // o.bFO
    public Parcelable a() {
        C3672bGj e2;
        bJB bjb;
        RecyclerView.LayoutManager layoutManager;
        d dVar = this.t;
        if (dVar == null || (e2 = dVar.e()) == null || (bjb = e2.b) == null || (layoutManager = bjb.getLayoutManager()) == null) {
            return null;
        }
        return layoutManager.onSaveInstanceState();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public String toString() {
        String netflixFrag = super.toString();
        String str = this.B;
        return netflixFrag + " : " + str;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        C8632dsu.c((Object) view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (!this.s) {
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = this.i + ((NetflixFrag) this).d + this.g;
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), this.h);
        } else if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = 0;
        }
        view.requestLayout();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.bFP
    public boolean o() {
        if (S().f()) {
            ah();
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC8894fN
    public void e() {
        C8980gu.b(U(), R(), new drX<C3729bIm, C3727bIk, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$invalidate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            /* renamed from: a */
            public final dpR invoke(C3729bIm c3729bIm, C3727bIk c3727bIk) {
                FullDpFrag.d dVar;
                FullDpEpoxyController b2;
                C8632dsu.c((Object) c3729bIm, "");
                C8632dsu.c((Object) c3727bIk, "");
                dVar = FullDpFrag.this.t;
                if (dVar == null || (b2 = dVar.b()) == null) {
                    return null;
                }
                b2.setData(c3729bIm, c3727bIk);
                return dpR.c;
            }
        });
    }

    private final void Q() {
        C1645aIz.a(this, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$addOfflineAgentListenerWhenManagerIsReady$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                b(serviceManager);
                return dpR.c;
            }

            public final void b(ServiceManager serviceManager) {
                C8632dsu.c((Object) serviceManager, "");
                View view = FullDpFrag.this.getView();
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    FullDpFrag.this.b(viewGroup);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(ViewGroup viewGroup) {
        ag();
        InterfaceC4208baF offlineAgentOrNull = NetflixActivity.getOfflineAgentOrNull(bj_());
        if (offlineAgentOrNull == null) {
            return;
        }
        this.m = offlineAgentOrNull.e((InterfaceC4208baF) K().a(viewGroup));
        InterfaceC4209baG a2 = K().a(by_(), viewGroup);
        this.C = a2;
        offlineAgentOrNull.e((InterfaceC4208baF) a2);
    }

    private final void ag() {
        InterfaceC4208baF offlineAgentOrNull = NetflixActivity.getOfflineAgentOrNull(bj_());
        if (offlineAgentOrNull != null) {
            offlineAgentOrNull.d(this.m);
        }
        if (offlineAgentOrNull != null) {
            offlineAgentOrNull.d(this.C);
        }
        this.m = null;
        this.C = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    private final void P() {
        this.k.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(AbstractC3664bGf.k kVar) {
        C3672bGj e2;
        bJB bjb;
        if (C8632dsu.c((Object) kVar.c(), (Object) this.B)) {
            d dVar = this.t;
            if (dVar == null || (e2 = dVar.e()) == null || (bjb = e2.b) == null) {
                return;
            }
            bjb.scrollToPosition(0);
            return;
        }
        NetflixActivity by_ = by_();
        TrackingInfoHolder e3 = kVar.e();
        TrackingInfo e4 = TrackingInfoHolder.e(e3, null, 1, null);
        if (C8171dfO.c()) {
            J().b(AppView.boxArt, e4, false);
            QuickDrawDialogFrag.d.a(QuickDrawDialogFrag.e, by_, kVar.c(), e3, false, null, 24, null);
            return;
        }
        J().b(AppView.boxArt, e4, true);
        InterfaceC3643bFl.c.a(InterfaceC3643bFl.c.a(by_), by_, kVar.d(), kVar.c(), kVar.a(), e3, "sims", null, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z() {
        if (M().e()) {
            C8980gu.c(R(), new drM<C3727bIk, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$onShareButtonClicked$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: e */
                public final dpR invoke(C3727bIk c3727bIk) {
                    C8632dsu.c((Object) c3727bIk, "");
                    InterfaceC5198buI c2 = c3727bIk.e().c();
                    if (c2 != null) {
                        InterfaceC1126Pr N = FullDpFrag.this.N();
                        RecommendedTrailer O = c2.O();
                        InterfaceC1126Pr.c.b(N, c2, O != null ? O.getSupplementalVideoId() : null, null, 4, null);
                        return dpR.c;
                    }
                    return null;
                }
            });
        } else {
            C8980gu.c(U(), new drM<C3729bIm, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$onShareButtonClicked$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: b */
                public final dpR invoke(C3729bIm c3729bIm) {
                    C8632dsu.c((Object) c3729bIm, "");
                    InterfaceC8366diy c2 = c3729bIm.g().c();
                    if (c2 != null) {
                        InterfaceC1126Pr N = FullDpFrag.this.N();
                        RecommendedTrailer ci_ = c2.ci_();
                        InterfaceC1126Pr.c.b(N, c2, ci_ != null ? ci_.getSupplementalVideoId() : null, null, 4, null);
                        return dpR.c;
                    }
                    return null;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final int i2) {
        final NetflixActivity bj_ = bj_();
        if (bj_ != null) {
            bj_.getHandler().postDelayed(new Runnable() { // from class: o.bIa
                @Override // java.lang.Runnable
                public final void run() {
                    FullDpFrag.d(i2, bj_);
                }
            }, 1000L);
        }
        C1645aIz.a(this, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$onUserRatingUpdated$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                c(serviceManager);
                return dpR.c;
            }

            public final void c(ServiceManager serviceManager) {
                TrackingInfoHolder trackingInfoHolder;
                VideoType videoType;
                TrackingInfoHolder trackingInfoHolder2;
                C3726bIj R;
                TrackingInfoHolder trackingInfoHolder3;
                C8632dsu.c((Object) serviceManager, "");
                C3705bHp J2 = FullDpFrag.this.J();
                int i3 = i2;
                trackingInfoHolder = FullDpFrag.this.D;
                Long c2 = J2.c(i3, TrackingInfoHolder.a(trackingInfoHolder, null, 1, null));
                if (FullDpFrag.this.M().e()) {
                    R = FullDpFrag.this.R();
                    String str = FullDpFrag.this.B;
                    C8632dsu.d((Object) str);
                    int i4 = i2;
                    trackingInfoHolder3 = FullDpFrag.this.D;
                    R.e(str, i4, trackingInfoHolder3.a());
                    return;
                }
                InterfaceC5125bsp j2 = serviceManager.j();
                String str2 = FullDpFrag.this.B;
                videoType = FullDpFrag.this.F;
                int i5 = i2;
                trackingInfoHolder2 = FullDpFrag.this.D;
                int a2 = trackingInfoHolder2.a();
                String logTag = FullDpFrag.e.getLogTag();
                final FullDpFrag fullDpFrag = FullDpFrag.this;
                j2.d(str2, videoType, i5, a2, new cPL(c2, logTag) { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$onUserRatingUpdated$2.3
                    @Override // o.cPL
                    public void e(Status status) {
                    }

                    @Override // o.cPL
                    public void c(InterfaceC5157btU interfaceC5157btU) {
                        C8632dsu.c((Object) interfaceC5157btU, "");
                        fullDpFrag.e();
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(int i2, NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        if (i2 != 0 && netflixActivity.getTutorialHelper().g() && netflixActivity.showDialog(cPU.e.e(netflixActivity).c())) {
            netflixActivity.getTutorialHelper().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void aa() {
        Object b2;
        NetflixActivity bj_ = bj_();
        if (C9737vz.a(bj_) || (b2 = C9737vz.b(bj_, NetflixActivity.class)) == null) {
            return;
        }
        final NetflixActivity netflixActivity = (NetflixActivity) b2;
        if (M().e()) {
            C8980gu.c(R(), new drM<C3727bIk, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$onInteractiveRestartButtonClicked$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C3727bIk c3727bIk) {
                    e(c3727bIk);
                    return dpR.c;
                }

                public final void e(C3727bIk c3727bIk) {
                    C8632dsu.c((Object) c3727bIk, "");
                    InterfaceC5198buI c2 = c3727bIk.e().c();
                    FullDpFrag.this.e(c2 != null ? c2.aE_() : null, netflixActivity);
                }
            });
        } else {
            C8980gu.c(U(), new drM<C3729bIm, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$onInteractiveRestartButtonClicked$1$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C3729bIm c3729bIm) {
                    c(c3729bIm);
                    return dpR.c;
                }

                public final void c(C3729bIm c3729bIm) {
                    C8632dsu.c((Object) c3729bIm, "");
                    InterfaceC8366diy c2 = c3729bIm.g().c();
                    FullDpFrag.this.e(c2 != null ? c2.aE_() : null, netflixActivity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(final InterfaceC5160btX interfaceC5160btX, NetflixActivity netflixActivity) {
        final Long a2 = J().a();
        netflixActivity.displayDialog(C1163Rc.e(netflixActivity, new Handler(), new C1163Rc.e(getString(R.o.lj), getString(R.o.lk), getString(R.o.f13253fi), new Runnable() { // from class: o.bHX
            @Override // java.lang.Runnable
            public final void run() {
                FullDpFrag.b(FullDpFrag.this, a2, interfaceC5160btX);
            }
        }, getString(R.o.cL), new Runnable() { // from class: o.bHY
            @Override // java.lang.Runnable
            public final void run() {
                FullDpFrag.d(FullDpFrag.this, a2);
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(FullDpFrag fullDpFrag, Long l, InterfaceC5160btX interfaceC5160btX) {
        C8632dsu.c((Object) fullDpFrag, "");
        fullDpFrag.J().b(l, new SelectCommand());
        if (interfaceC5160btX != null) {
            PlaybackLauncher playbackLauncher = fullDpFrag.L().get();
            C8632dsu.a(playbackLauncher, "");
            PlaybackLauncher.b.a(playbackLauncher, interfaceC5160btX, fullDpFrag.F, TrackingInfoHolder.b(fullDpFrag.D, PlayLocationType.IKO_RESTART_STATE_BUTTON, false, 2, null), new PlayerExtras(0L, 0L, 0, false, false, null, true, null, 0L, 0.0f, null, null, null, null, null, 32703, null), null, 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(FullDpFrag fullDpFrag, Long l) {
        C8632dsu.c((Object) fullDpFrag, "");
        fullDpFrag.J().b(l, new CancelCommand());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ac() {
        if (M().e()) {
            C8980gu.c(R(), new drM<C3727bIk, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$onPlayClicked$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: a */
                public final dpR invoke(C3727bIk c3727bIk) {
                    C3726bIj R;
                    TrackingInfoHolder trackingInfoHolder;
                    C8632dsu.c((Object) c3727bIk, "");
                    InterfaceC5198buI c2 = c3727bIk.e().c();
                    if (c2 != null) {
                        FullDpFrag fullDpFrag = FullDpFrag.this;
                        R = fullDpFrag.R();
                        R.e(false);
                        PlayLocationType playLocationType = PlayLocationType.STORY_ART;
                        trackingInfoHolder = fullDpFrag.D;
                        FullDpFrag.d(fullDpFrag, c2, playLocationType, trackingInfoHolder, null, 8, null);
                        return dpR.c;
                    }
                    return null;
                }
            });
        } else {
            C8980gu.b(U(), R(), new drX<C3729bIm, C3727bIk, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$onPlayClicked$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                @Override // o.drX
                /* renamed from: b */
                public final dpR invoke(C3729bIm c3729bIm, C3727bIk c3727bIk) {
                    C3726bIj R;
                    TrackingInfoHolder trackingInfoHolder;
                    C8632dsu.c((Object) c3729bIm, "");
                    C8632dsu.c((Object) c3727bIk, "");
                    InterfaceC8366diy c2 = c3729bIm.g().c();
                    if (c2 != null) {
                        FullDpFrag fullDpFrag = FullDpFrag.this;
                        R = fullDpFrag.R();
                        R.e(false);
                        PlayLocationType playLocationType = PlayLocationType.STORY_ART;
                        trackingInfoHolder = fullDpFrag.D;
                        FullDpFrag.d(fullDpFrag, c2, playLocationType, trackingInfoHolder, null, 8, null);
                        return dpR.c;
                    }
                    return null;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y() {
        if (M().e()) {
            C8980gu.c(R(), new drM<C3727bIk, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$onUnavailableButtonClick$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: b */
                public final dpR invoke(C3727bIk c3727bIk) {
                    C8632dsu.c((Object) c3727bIk, "");
                    InterfaceC5198buI c2 = c3727bIk.e().c();
                    if (c2 != null) {
                        FullDpFrag.this.e(c2);
                        return dpR.c;
                    }
                    return null;
                }
            });
        } else {
            C8980gu.c(R(), new drM<C3727bIk, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$onUnavailableButtonClick$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: d */
                public final dpR invoke(C3727bIk c3727bIk) {
                    C8632dsu.c((Object) c3727bIk, "");
                    InterfaceC5198buI c2 = c3727bIk.e().c();
                    if (c2 != null) {
                        FullDpFrag.this.e(c2);
                        return dpR.c;
                    }
                    return null;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(InterfaceC5198buI interfaceC5198buI) {
        R().e(false);
        e(interfaceC5198buI, PlayLocationType.STORY_ART, this.D, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$onUnavailableButtonClick$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Boolean bool) {
                c(bool.booleanValue());
                return dpR.c;
            }

            public final void c(boolean z) {
                TrackingInfoHolder trackingInfoHolder;
                C3705bHp J2 = FullDpFrag.this.J();
                trackingInfoHolder = FullDpFrag.this.D;
                J2.c(TrackingInfoHolder.e(trackingInfoHolder, null, 1, null));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W() {
        if (M().e()) {
            C8980gu.c(R(), new drM<C3727bIk, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$onChangePlanToWatchButtonClick$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: a */
                public final dpR invoke(C3727bIk c3727bIk) {
                    C8632dsu.c((Object) c3727bIk, "");
                    InterfaceC5198buI c2 = c3727bIk.e().c();
                    if (c2 != null) {
                        FullDpFrag.this.d(c2);
                        return dpR.c;
                    }
                    return null;
                }
            });
        } else {
            C8980gu.c(U(), new drM<C3729bIm, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$onChangePlanToWatchButtonClick$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: b */
                public final dpR invoke(C3729bIm c3729bIm) {
                    C8632dsu.c((Object) c3729bIm, "");
                    InterfaceC8366diy c2 = c3729bIm.g().c();
                    if (c2 != null) {
                        FullDpFrag.this.d((InterfaceC5198buI) c2);
                        return dpR.c;
                    }
                    return null;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(InterfaceC5198buI interfaceC5198buI) {
        R().e(false);
        e(interfaceC5198buI, PlayLocationType.STORY_ART, this.D, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$onChangePlanToWatchButtonClick$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Boolean bool) {
                d(bool.booleanValue());
                return dpR.c;
            }

            public final void d(boolean z) {
                TrackingInfoHolder trackingInfoHolder;
                C3705bHp J2 = FullDpFrag.this.J();
                trackingInfoHolder = FullDpFrag.this.D;
                J2.e(TrackingInfoHolder.e(trackingInfoHolder, null, 1, null));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ae() {
        if (M().e()) {
            C8980gu.c(R(), new drM<C3727bIk, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$showSeasonSelector$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: a */
                public final dpR invoke(C3727bIk c3727bIk) {
                    FullDpFrag.d dVar;
                    CompositeDisposable compositeDisposable;
                    InterfaceC5194buE P;
                    C8632dsu.c((Object) c3727bIk, "");
                    dVar = FullDpFrag.this.t;
                    if (dVar != null) {
                        final FullDpFrag fullDpFrag = FullDpFrag.this;
                        InterfaceC5198buI c2 = c3727bIk.e().c();
                        List<InterfaceC5195buF> at = (c2 == null || (P = c2.P()) == null) ? null : P.at();
                        if (at != null && !at.isEmpty()) {
                            fullDpFrag.ab();
                            C1234Tv c1234Tv = new C1234Tv(at);
                            Observable<Integer> take = c1234Tv.e().takeUntil(dVar.d().d()).skip(1L).take(1L);
                            C8632dsu.a(take, "");
                            SubscribersKt.subscribeBy$default(take, (drM) null, (drO) null, new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$showSeasonSelector$1$1$model$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                public /* synthetic */ dpR invoke(Integer num) {
                                    e(num);
                                    return dpR.c;
                                }

                                public final void e(Integer num) {
                                    FullDpFrag fullDpFrag2 = FullDpFrag.this;
                                    C8632dsu.d(num);
                                    fullDpFrag2.c(num.intValue());
                                }
                            }, 3, (Object) null);
                            c1234Tv.d(c3727bIk.b());
                            compositeDisposable = fullDpFrag.k;
                            DialogC1237Ty.a aVar = DialogC1237Ty.d;
                            FragmentActivity requireActivity = fullDpFrag.requireActivity();
                            C8632dsu.a(requireActivity, "");
                            Completable d2 = aVar.d(requireActivity, c1234Tv, null, true);
                            AndroidLifecycleScopeProvider a2 = AndroidLifecycleScopeProvider.a(fullDpFrag, Lifecycle.Event.ON_DESTROY);
                            C8632dsu.a(a2, "");
                            Object as = d2.as(AutoDispose.b(a2));
                            C8632dsu.b(as, "");
                            Disposable b2 = ((CompletableSubscribeProxy) as).b();
                            C8632dsu.a(b2, "");
                            DisposableKt.plusAssign(compositeDisposable, b2);
                        }
                        return dpR.c;
                    }
                    return null;
                }
            });
        } else {
            C8980gu.c(U(), new drM<C3729bIm, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$showSeasonSelector$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: c */
                public final dpR invoke(C3729bIm c3729bIm) {
                    FullDpFrag.d dVar;
                    CompositeDisposable compositeDisposable;
                    C8632dsu.c((Object) c3729bIm, "");
                    dVar = FullDpFrag.this.t;
                    if (dVar != null) {
                        final FullDpFrag fullDpFrag = FullDpFrag.this;
                        List<InterfaceC5195buF> c2 = c3729bIm.f().c();
                        if (c2 != null && (!c2.isEmpty())) {
                            fullDpFrag.ab();
                            C1234Tv c1234Tv = new C1234Tv(c2);
                            Observable<Integer> take = c1234Tv.e().takeUntil(dVar.d().d()).skip(1L).take(1L);
                            C8632dsu.a(take, "");
                            SubscribersKt.subscribeBy$default(take, (drM) null, (drO) null, new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$showSeasonSelector$2$1$model$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                public /* synthetic */ dpR invoke(Integer num) {
                                    e(num);
                                    return dpR.c;
                                }

                                public final void e(Integer num) {
                                    FullDpFrag fullDpFrag2 = FullDpFrag.this;
                                    C8632dsu.d(num);
                                    fullDpFrag2.c(num.intValue());
                                }
                            }, 3, (Object) null);
                            c1234Tv.d(c3729bIm.j());
                            compositeDisposable = fullDpFrag.k;
                            DialogC1237Ty.a aVar = DialogC1237Ty.d;
                            FragmentActivity requireActivity = fullDpFrag.requireActivity();
                            C8632dsu.a(requireActivity, "");
                            Completable d2 = aVar.d(requireActivity, c1234Tv, null, true);
                            AndroidLifecycleScopeProvider a2 = AndroidLifecycleScopeProvider.a(fullDpFrag, Lifecycle.Event.ON_DESTROY);
                            C8632dsu.a(a2, "");
                            Object as = d2.as(AutoDispose.b(a2));
                            C8632dsu.b(as, "");
                            Disposable b2 = ((CompletableSubscribeProxy) as).b();
                            C8632dsu.a(b2, "");
                            DisposableKt.plusAssign(compositeDisposable, b2);
                        }
                        return dpR.c;
                    }
                    return null;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(final int i2) {
        C8980gu.c(U(), new drM<C3729bIm, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$onSeasonSelected$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3729bIm c3729bIm) {
                a(c3729bIm);
                return dpR.c;
            }

            public final void a(C3729bIm c3729bIm) {
                C3726bIj R;
                C8632dsu.c((Object) c3729bIm, "");
                FullDpFrag.e.getLogTag();
                Integer d2 = c3729bIm.d();
                int i3 = i2;
                if (d2 != null && d2.intValue() == i3) {
                    return;
                }
                if (this.M().e()) {
                    R = this.R();
                    R.b(i2);
                }
                this.U().a(i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ab() {
        C9935zP d2;
        d dVar = this.t;
        if (dVar == null || (d2 = dVar.d()) == null) {
            return;
        }
        d2.b(AbstractC6719cic.class, new AbstractC6719cic.e.C0117e(0, 30));
    }

    private final void ah() {
        C9935zP d2;
        if (S().f()) {
            e.getLogTag();
            d dVar = this.t;
            if (dVar == null || (d2 = dVar.d()) == null) {
                return;
            }
            d2.b(AbstractC6719cic.class, new AbstractC6719cic.e.d(false, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V() {
        ah();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(final FullDpFrag fullDpFrag, InterfaceC5198buI interfaceC5198buI, PlayLocationType playLocationType, final TrackingInfoHolder trackingInfoHolder, drM drm, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            drm = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$launchPlayback$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    b(bool.booleanValue());
                    return dpR.c;
                }

                public final void b(boolean z) {
                    FullDpFrag.this.J().d(AppView.playButton, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null), z);
                }
            };
        }
        fullDpFrag.e(interfaceC5198buI, playLocationType, trackingInfoHolder, drm);
    }

    private final void e(InterfaceC5198buI interfaceC5198buI, PlayLocationType playLocationType, TrackingInfoHolder trackingInfoHolder, drM<? super Boolean, dpR> drm) {
        VideoType type = interfaceC5198buI.getType();
        C8632dsu.a(type, "");
        VideoType type2 = interfaceC5198buI.getType();
        C8632dsu.a(type2, "");
        b(playLocationType, trackingInfoHolder, type, d(this, interfaceC5198buI, type2, false, 4, null), drm);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(final FullDpFrag fullDpFrag, PlayLocationType playLocationType, final TrackingInfoHolder trackingInfoHolder, VideoType videoType, InterfaceC5160btX interfaceC5160btX, drM drm, int i2, Object obj) {
        drM<Boolean, dpR> drm2 = drm;
        if ((i2 & 16) != 0) {
            drm2 = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$launchPlayback$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    a(bool.booleanValue());
                    return dpR.c;
                }

                public final void a(boolean z) {
                    FullDpFrag.this.J().d(AppView.playButton, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null), z);
                }
            };
        }
        fullDpFrag.b(playLocationType, trackingInfoHolder, videoType, interfaceC5160btX, drm2);
    }

    private final void b(final PlayLocationType playLocationType, final TrackingInfoHolder trackingInfoHolder, final VideoType videoType, final InterfaceC5160btX interfaceC5160btX, drM<? super Boolean, dpR> drm) {
        PlayerExtras playerExtras;
        String aH_;
        if (C8141del.c(bj_()) || T()) {
            return;
        }
        drm.invoke(Boolean.valueOf(L().get().c() == PlaybackLauncher.PlaybackTarget.e));
        Bundle arguments = getArguments();
        if (arguments == null || (playerExtras = (PlayerExtras) arguments.getParcelable(NetflixActivity.EXTRA_PLAYER_EXTRAS)) == null) {
            playerExtras = new PlayerExtras(0L, 0L, 0, false, false, null, false, null, 0L, 0.0f, null, null, null, null, null, 32767, null);
        }
        final PlayerExtras playerExtras2 = playerExtras;
        final Integer valueOf = (interfaceC5160btX == null || (aH_ = interfaceC5160btX.aH_()) == null) ? null : Integer.valueOf(Integer.parseInt(aH_));
        if (valueOf != null) {
            C8980gu.c(U(), new drM<C3729bIm, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$launchPlayback$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C3729bIm c3729bIm) {
                    a(c3729bIm);
                    return dpR.c;
                }

                public final void a(C3729bIm c3729bIm) {
                    C8632dsu.c((Object) c3729bIm, "");
                    PlayerExtras.this.b(c3729bIm.a().a(valueOf));
                    PlaybackLauncher playbackLauncher = this.L().get();
                    C8632dsu.a(playbackLauncher, "");
                    PlaybackLauncher.b.a(playbackLauncher, interfaceC5160btX, videoType == VideoType.SHOW ? VideoType.EPISODE : VideoType.MOVIE, TrackingInfoHolder.b(trackingInfoHolder, playLocationType, "detailsPage", false, 4, null), PlayerExtras.this, null, 16, null);
                }
            });
        }
    }

    static /* synthetic */ InterfaceC5160btX d(FullDpFrag fullDpFrag, InterfaceC5198buI interfaceC5198buI, VideoType videoType, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = fullDpFrag.L().get().c() == PlaybackLauncher.PlaybackTarget.e;
        }
        return fullDpFrag.e(interfaceC5198buI, videoType, z);
    }

    private final InterfaceC5160btX e(InterfaceC5198buI interfaceC5198buI, VideoType videoType, boolean z) {
        InterfaceC8366diy i2;
        if (M().e()) {
            return interfaceC5198buI.aE_();
        }
        if (videoType == VideoType.SHOW && !z) {
            InterfaceC8366diy interfaceC8366diy = interfaceC5198buI instanceof InterfaceC8366diy ? (InterfaceC8366diy) interfaceC5198buI : null;
            if (interfaceC8366diy == null || (i2 = interfaceC8366diy.i()) == null) {
                return null;
            }
            return i2.aE_();
        }
        return interfaceC5198buI.aE_();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(final InterfaceC5227bul interfaceC5227bul) {
        final PlayerExtras playerExtras;
        if (C8141del.c(bj_()) || T()) {
            return;
        }
        CLv2Utils cLv2Utils = CLv2Utils.INSTANCE;
        AppView appView = AppView.episodesSelector;
        cLv2Utils.d(appView, CommandValue.PlayCommand, null, new Focus(appView, null), new PlayCommand(null), true, null);
        final PlayContextImp b2 = TrackingInfoHolder.b(this.D, false, 1, null);
        b2.d(PlayLocationType.EPISODE);
        Bundle arguments = getArguments();
        if (arguments == null || (playerExtras = (PlayerExtras) arguments.getParcelable(NetflixActivity.EXTRA_PLAYER_EXTRAS)) == null) {
            playerExtras = new PlayerExtras(0L, 0L, 0, false, false, null, false, null, 0L, 0.0f, null, null, null, null, null, 32767, null);
        }
        C8980gu.c(U(), new drM<C3729bIm, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$playEpisode$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3729bIm c3729bIm) {
                b(c3729bIm);
                return dpR.c;
            }

            public final void b(C3729bIm c3729bIm) {
                C8632dsu.c((Object) c3729bIm, "");
                PlayerExtras playerExtras2 = PlayerExtras.this;
                bZK a2 = c3729bIm.a();
                String aH_ = interfaceC5227bul.aE_().aH_();
                playerExtras2.b(a2.a(aH_ != null ? Integer.valueOf(Integer.parseInt(aH_)) : null));
                InterfaceC7303ctf K = this.K();
                Context context = this.getContext();
                String aH_2 = interfaceC5227bul.aE_().aH_();
                final FullDpFrag fullDpFrag = this;
                final InterfaceC5227bul interfaceC5227bul2 = interfaceC5227bul;
                final PlayContextImp playContextImp = b2;
                final PlayerExtras playerExtras3 = PlayerExtras.this;
                K.a(context, aH_2, new InterfaceC7365cuo() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$playEpisode$1.4
                    @Override // o.InterfaceC7365cuo
                    public void b() {
                        PlaybackLauncher playbackLauncher = FullDpFrag.this.L().get();
                        C8632dsu.a(playbackLauncher, "");
                        InterfaceC5160btX aE_ = interfaceC5227bul2.aE_();
                        C8632dsu.a(aE_, "");
                        PlaybackLauncher.b.a(playbackLauncher, aE_, VideoType.SHOW, playContextImp, playerExtras3, null, 16, null);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(ContentWarning contentWarning) {
        boolean g2;
        final NetflixActivity bj_ = bj_();
        if (bj_ != null) {
            ab();
            final String url = contentWarning.url();
            String message = contentWarning.message();
            AlertDialog create = new AlertDialog.Builder(bj_, C9834xU.o.c).create();
            C8632dsu.a(create, "");
            create.setTitle(getString(R.o.cT));
            create.setMessage(message);
            create.setButton(-1, getString(R.o.f13253fi), new DialogInterface.OnClickListener() { // from class: o.bHT
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    FullDpFrag.d(dialogInterface, i2);
                }
            });
            if (url != null) {
                g2 = C8691duz.g(url);
                if (!g2) {
                    create.setButton(-2, getString(R.o.gK), new DialogInterface.OnClickListener() { // from class: o.bHR
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            FullDpFrag.e(NetflixActivity.this, url, dialogInterface, i2);
                        }
                    });
                }
            }
            create.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(NetflixActivity netflixActivity, String str, DialogInterface dialogInterface, int i2) {
        C8632dsu.c((Object) netflixActivity, "");
        netflixActivity.getHandler().post(new RunnableC8122deS(netflixActivity, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(final InterfaceC8366diy interfaceC8366diy) {
        if (interfaceC8366diy == null || !interfaceC8366diy.isAvailableToPlay() || T()) {
            return;
        }
        AndroidSchedulers.mainThread().scheduleDirect(new Runnable() { // from class: o.bHZ
            @Override // java.lang.Runnable
            public final void run() {
                FullDpFrag.c(FullDpFrag.this, interfaceC8366diy);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(FullDpFrag fullDpFrag, InterfaceC8366diy interfaceC8366diy) {
        C8632dsu.c((Object) fullDpFrag, "");
        C8632dsu.c((Object) interfaceC8366diy, "");
        if (fullDpFrag.y == AppView.search.ordinal()) {
            InterfaceC5160btX aE_ = interfaceC8366diy.aE_();
            C8632dsu.a(aE_, "");
            C8006dcI.e(aE_, PlayerPrefetchSource.DetailsPageFromSearch);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean T() {
        return C8126deW.e((Context) bj_());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ad() {
        if (C8153dex.O()) {
            C8980gu.c(U(), new drM<C3729bIm, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$reportPrimaryDetailsPresentedEvent$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C3729bIm c3729bIm) {
                    d(c3729bIm);
                    return dpR.c;
                }

                public final void d(C3729bIm c3729bIm) {
                    TrackingInfoHolder trackingInfoHolder;
                    C8632dsu.c((Object) c3729bIm, "");
                    C3654bFw c3654bFw = C3654bFw.c;
                    JSONObject e2 = c3654bFw.e((JSONObject) null, c3654bFw.b(c3729bIm.g().c()));
                    C3705bHp J2 = FullDpFrag.this.J();
                    trackingInfoHolder = FullDpFrag.this.D;
                    J2.d(trackingInfoHolder.d(e2));
                }
            });
        } else {
            J().d(TrackingInfoHolder.a(this.D, null, 1, null));
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends bDE {
        private final ImageLoader d;

        @Override // com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface
        public String a() {
            return "fulldp-imagelatencyTracker";
        }

        @Override // o.bDE
        public boolean a(Activity activity) {
            return true;
        }

        @Override // o.bDE
        public boolean c() {
            return true;
        }

        public e(ImageLoader imageLoader) {
            C8632dsu.c((Object) imageLoader, "");
            this.d = imageLoader;
            imageLoader.b(this);
        }

        public final void d() {
            this.d.e(this);
        }
    }

    @SuppressLint({"AutoDispose", "CheckResult"})
    private final void a(C9935zP c9935zP) {
        CompositeDisposable compositeDisposable = this.k;
        Observable d2 = c9935zP.d(AbstractC3664bGf.class);
        final drM<AbstractC3664bGf, dpR> drm = new drM<AbstractC3664bGf, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$setupEventHandler$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC3664bGf abstractC3664bGf) {
                a(abstractC3664bGf);
                return dpR.c;
            }

            public final void a(final AbstractC3664bGf abstractC3664bGf) {
                TrackingInfoHolder trackingInfoHolder;
                C3726bIj R;
                TrackingInfoHolder trackingInfoHolder2;
                C3726bIj R2;
                C3726bIj R3;
                C3726bIj R4;
                C3726bIj R5;
                VideoType videoType;
                TrackingInfoHolder trackingInfoHolder3;
                TrackingInfoHolder trackingInfoHolder4;
                VideoType videoType2;
                TrackingInfoHolder trackingInfoHolder5;
                TrackingInfoHolder trackingInfoHolder6;
                TrackingInfoHolder trackingInfoHolder7;
                C3644bFm c3644bFm;
                C3726bIj R6;
                if (abstractC3664bGf instanceof AbstractC3664bGf.v) {
                    if (FullDpFrag.this.M().e()) {
                        R6 = FullDpFrag.this.R();
                        R6.f();
                        return;
                    }
                    FullDpFrag.this.U().c(true);
                    C3732bIp.c(FullDpFrag.this.U(), true, false, 2, null);
                } else if (abstractC3664bGf instanceof AbstractC3664bGf.x) {
                    FullDpFrag.this.U().b(true);
                } else if (abstractC3664bGf instanceof AbstractC3664bGf.y) {
                    C3732bIp.a(FullDpFrag.this.U(), true, false, null, 6, null);
                } else if (abstractC3664bGf instanceof AbstractC3664bGf.A) {
                    if (FullDpFrag.this.bn_()) {
                        dwU e2 = FullDpFrag.this.U().e();
                        GF gf = GF.e;
                        Context requireContext = FullDpFrag.this.requireContext();
                        C8632dsu.a(requireContext, "");
                        C8737dwr.c(e2, gf.d(requireContext), null, new AnonymousClass1(FullDpFrag.this, abstractC3664bGf, null), 2, null);
                        c3644bFm = FullDpFrag.this.n;
                        if (c3644bFm != null) {
                            c3644bFm.b(((AbstractC3664bGf.A) abstractC3664bGf).b());
                        }
                        FullDpFrag.this.n = null;
                        if (((AbstractC3664bGf.A) abstractC3664bGf).b().j()) {
                            FullDpFrag.this.ad();
                            C3732bIp U = FullDpFrag.this.U();
                            final FullDpFrag fullDpFrag = FullDpFrag.this;
                            C8980gu.c(U, new drM<C3729bIm, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$setupEventHandler$1.2
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                public /* synthetic */ dpR invoke(C3729bIm c3729bIm) {
                                    d(c3729bIm);
                                    return dpR.c;
                                }

                                public final void d(C3729bIm c3729bIm) {
                                    InterfaceC5160btX aE_;
                                    String aH_;
                                    C8632dsu.c((Object) c3729bIm, "");
                                    InterfaceC8366diy c2 = c3729bIm.g().c();
                                    if (c3729bIm.a().a((c2 == null || (aE_ = c2.aE_()) == null || (aH_ = aE_.aH_()) == null) ? null : Integer.valueOf(Integer.parseInt(aH_))) == LiveState.e) {
                                        FullDpFrag.this.d(c3729bIm.g().c());
                                    }
                                }
                            });
                        }
                    }
                } else if (abstractC3664bGf instanceof AbstractC3664bGf.r) {
                    FullDpFrag.this.ac();
                } else if (abstractC3664bGf instanceof AbstractC3664bGf.B) {
                    FullDpFrag.this.Y();
                } else if (abstractC3664bGf instanceof AbstractC3664bGf.e) {
                    FullDpFrag.this.W();
                } else if (abstractC3664bGf instanceof AbstractC3664bGf.D) {
                    C3705bHp J2 = FullDpFrag.this.J();
                    trackingInfoHolder7 = FullDpFrag.this.D;
                    J2.a(trackingInfoHolder7);
                } else if (abstractC3664bGf instanceof AbstractC3664bGf.C3665a) {
                    C3705bHp J3 = FullDpFrag.this.J();
                    trackingInfoHolder6 = FullDpFrag.this.D;
                    J3.b(trackingInfoHolder6);
                } else if (abstractC3664bGf instanceof AbstractC3664bGf.C3666b) {
                    C3732bIp U2 = FullDpFrag.this.U();
                    final FullDpFrag fullDpFrag2 = FullDpFrag.this;
                    C8980gu.c(U2, new drM<C3729bIm, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$setupEventHandler$1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(C3729bIm c3729bIm) {
                            a(c3729bIm);
                            return dpR.c;
                        }

                        public final void a(C3729bIm c3729bIm) {
                            C8632dsu.c((Object) c3729bIm, "");
                            FullDpFrag.b(FullDpFrag.this, PlayLocationType.VIDEO_VIEW, ((AbstractC3664bGf.C3666b) abstractC3664bGf).a(), ((AbstractC3664bGf.C3666b) abstractC3664bGf).b(), ((AbstractC3664bGf.C3666b) abstractC3664bGf).d(), null, 16, null);
                        }
                    });
                } else if (abstractC3664bGf instanceof AbstractC3664bGf.C3667c) {
                    FullDpFrag.this.c(((AbstractC3664bGf.C3667c) abstractC3664bGf).e());
                } else if (abstractC3664bGf instanceof AbstractC3664bGf.o) {
                    String str = FullDpFrag.this.B;
                    if (str != null) {
                        FullDpFrag fullDpFrag3 = FullDpFrag.this;
                        fullDpFrag3.ab();
                        NetflixActivity by_ = fullDpFrag3.by_();
                        trackingInfoHolder4 = fullDpFrag3.D;
                        TrackingInfo e3 = TrackingInfoHolder.e(trackingInfoHolder4, null, 1, null);
                        CLv2Utils cLv2Utils = CLv2Utils.INSTANCE;
                        AppView appView = AppView.moreInfoButton;
                        cLv2Utils.d(appView, CommandValue.SelectCommand, e3, new Focus(appView, e3), new SelectCommand(), false, null);
                        C3738bIv.e eVar = C3738bIv.e;
                        videoType2 = fullDpFrag3.F;
                        trackingInfoHolder5 = fullDpFrag3.D;
                        C3738bIv.e.d(eVar, by_, str, videoType2, trackingInfoHolder5, ((AbstractC3664bGf.o) abstractC3664bGf).d(), false, null, 96, null);
                    }
                } else if (abstractC3664bGf instanceof AbstractC3664bGf.n) {
                    NetflixActivity by_2 = FullDpFrag.this.by_();
                    C3738bIv.e eVar2 = C3738bIv.e;
                    AbstractC3664bGf.n nVar = (AbstractC3664bGf.n) abstractC3664bGf;
                    String b2 = nVar.b();
                    videoType = FullDpFrag.this.F;
                    trackingInfoHolder3 = FullDpFrag.this.D;
                    eVar2.d(by_2, b2, videoType, trackingInfoHolder3, true, true, nVar.c());
                } else if (abstractC3664bGf instanceof AbstractC3664bGf.f) {
                    FullDpFrag.this.e(((AbstractC3664bGf.f) abstractC3664bGf).d());
                } else if (abstractC3664bGf instanceof AbstractC3664bGf.s) {
                    FullDpFrag.this.b(((AbstractC3664bGf.s) abstractC3664bGf).b());
                } else if (abstractC3664bGf instanceof AbstractC3664bGf.C3668d) {
                    R5 = FullDpFrag.this.R();
                    AbstractC3664bGf.C3668d c3668d = (AbstractC3664bGf.C3668d) abstractC3664bGf;
                    R5.b(c3668d.c(), c3668d.b(), c3668d.d());
                } else if (abstractC3664bGf instanceof AbstractC3664bGf.g) {
                    R4 = FullDpFrag.this.R();
                    AbstractC3664bGf.g gVar = (AbstractC3664bGf.g) abstractC3664bGf;
                    R4.a(gVar.a(), gVar.d(), gVar.b());
                } else if (C8632dsu.c(abstractC3664bGf, AbstractC3664bGf.h.c)) {
                    FullDpFrag.this.Z();
                } else if (C8632dsu.c(abstractC3664bGf, AbstractC3664bGf.j.d)) {
                    FullDpFrag.this.aa();
                } else if (abstractC3664bGf instanceof AbstractC3664bGf.m) {
                    C3705bHp J4 = FullDpFrag.this.J();
                    AbstractC3664bGf.m mVar = (AbstractC3664bGf.m) abstractC3664bGf;
                    int d3 = mVar.d();
                    TrackingInfoHolder c2 = mVar.c();
                    J4.e(d3, c2 != null ? TrackingInfoHolder.e(c2, null, 1, null) : null);
                    R3 = FullDpFrag.this.R();
                    R3.a(mVar.d());
                } else if (abstractC3664bGf instanceof AbstractC3664bGf.k) {
                    FullDpFrag fullDpFrag4 = FullDpFrag.this;
                    C8632dsu.d(abstractC3664bGf);
                    fullDpFrag4.c((AbstractC3664bGf.k) abstractC3664bGf);
                } else if (C8632dsu.c(abstractC3664bGf, AbstractC3664bGf.l.c)) {
                    FullDpFrag.this.ae();
                } else if (abstractC3664bGf instanceof AbstractC3664bGf.i) {
                    FullDpFrag.this.c(((AbstractC3664bGf.i) abstractC3664bGf).b());
                } else if (abstractC3664bGf instanceof AbstractC3664bGf.q) {
                    if (FullDpFrag.this.M().e()) {
                        R2 = FullDpFrag.this.R();
                        R2.h();
                        return;
                    }
                    C3732bIp.a(FullDpFrag.this.U(), false, false, null, 7, null);
                } else if (C8632dsu.c(abstractC3664bGf, AbstractC3664bGf.w.d)) {
                    FullDpFrag.this.V();
                } else if (C8632dsu.c(abstractC3664bGf, AbstractC3664bGf.C.b)) {
                    FullDpFrag.this.V();
                    FullDpFrag.this.ac();
                } else if (C8632dsu.c(abstractC3664bGf, AbstractC3664bGf.t.e) || C8632dsu.c(abstractC3664bGf, AbstractC3664bGf.p.d)) {
                    final FullDpFrag fullDpFrag5 = FullDpFrag.this;
                    C1645aIz.a(fullDpFrag5, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$setupEventHandler$1.5
                        {
                            super(1);
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* renamed from: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$setupEventHandler$1$5$1  reason: invalid class name */
                        /* loaded from: classes4.dex */
                        public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                            final /* synthetic */ FullDpFrag c;
                            int d;
                            final /* synthetic */ ServiceManager e;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(ServiceManager serviceManager, FullDpFrag fullDpFrag, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                                super(2, interfaceC8585dra);
                                this.e = serviceManager;
                                this.c = fullDpFrag;
                            }

                            @Override // o.drX
                            /* renamed from: a */
                            public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                                return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                                return new AnonymousClass1(this.e, this.c, interfaceC8585dra);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object e;
                                e = C8586drb.e();
                                int i = this.d;
                                if (i == 0) {
                                    C8556dpz.d(obj);
                                    this.d = 1;
                                    if (C8749dxc.b(1000L, this) == e) {
                                        return e;
                                    }
                                } else if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                } else {
                                    C8556dpz.d(obj);
                                }
                                UmaAlert x = this.e.x();
                                if (x != null) {
                                    this.c.O().c(x);
                                }
                                return dpR.c;
                            }
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                            b(serviceManager);
                            return dpR.c;
                        }

                        public final void b(ServiceManager serviceManager) {
                            C8632dsu.c((Object) serviceManager, "");
                            C8737dwr.c(LifecycleOwnerKt.getLifecycleScope(FullDpFrag.this), null, null, new AnonymousClass1(serviceManager, FullDpFrag.this, null), 3, null);
                        }
                    });
                } else if (abstractC3664bGf instanceof AbstractC3664bGf.u) {
                    AbstractC3664bGf.u uVar = (AbstractC3664bGf.u) abstractC3664bGf;
                    if (uVar.a()) {
                        C8054ddD.c(FullDpFrag.this.bj_(), C3670bGh.d.e, 1);
                    }
                    if (FullDpFrag.this.M().e()) {
                        R = FullDpFrag.this.R();
                        int e4 = uVar.e();
                        trackingInfoHolder2 = FullDpFrag.this.D;
                        R.a(String.valueOf(e4), trackingInfoHolder2, uVar.a());
                        return;
                    }
                    C3732bIp U3 = FullDpFrag.this.U();
                    int e5 = uVar.e();
                    VideoType c3 = uVar.c();
                    boolean a2 = uVar.a();
                    AppView bh_ = FullDpFrag.this.bh_();
                    trackingInfoHolder = FullDpFrag.this.D;
                    U3.a(e5, c3, a2, bh_, trackingInfoHolder);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$setupEventHandler$1$1  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                final /* synthetic */ AbstractC3664bGf a;
                final /* synthetic */ FullDpFrag c;
                int e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FullDpFrag fullDpFrag, AbstractC3664bGf abstractC3664bGf, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.c = fullDpFrag;
                    this.a = abstractC3664bGf;
                }

                @Override // o.drX
                /* renamed from: a */
                public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass1(this.c, this.a, interfaceC8585dra);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C8586drb.e();
                    if (this.e == 0) {
                        C8556dpz.d(obj);
                        this.c.d(((AbstractC3664bGf.A) this.a).b());
                        return dpR.c;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        };
        Consumer consumer = new Consumer() { // from class: o.bIc
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FullDpFrag.e(drM.this, obj);
            }
        };
        final FullDpFrag$setupEventHandler$2 fullDpFrag$setupEventHandler$2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$setupEventHandler$2
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
                Map k;
                Throwable th2;
                InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                k = dqE.k(new LinkedHashMap());
                C1596aHd c1596aHd = new C1596aHd("Error in FullDPFrag eventBus subscribe", th, null, true, k, false, false, 96, null);
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
                InterfaceC1597aHe c3 = dVar2.c();
                if (c3 != null) {
                    c3.d(c1596aHd, th2);
                } else {
                    dVar2.e().b(c1596aHd, th2);
                }
            }
        };
        Disposable subscribe = d2.subscribe(consumer, new Consumer() { // from class: o.bIf
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FullDpFrag.c(drM.this, obj);
            }
        });
        C8632dsu.a(subscribe, "");
        DisposableKt.plusAssign(compositeDisposable, subscribe);
        DisposableKt.plusAssign(this.k, SubscribersKt.subscribeBy$default(c9935zP.d(AbstractC6719cic.class), (drM) null, (drO) null, new drM<AbstractC6719cic, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag$setupEventHandler$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6719cic abstractC6719cic) {
                c(abstractC6719cic);
                return dpR.c;
            }

            public final void c(AbstractC6719cic abstractC6719cic) {
                C3726bIj R;
                C8632dsu.c((Object) abstractC6719cic, "");
                if (abstractC6719cic instanceof AbstractC6719cic.b) {
                    R = FullDpFrag.this.R();
                    R.e(false);
                }
            }
        }, 3, (Object) null));
    }
}
