package com.netflix.mediaclient.ui.lomo.qddp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.browse.api.task.enums.CmpTaskMode;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.lomo.qddp.QuickDrawDialogFrag;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.model.leafs.advisory.AdvisoryBoard;
import com.netflix.model.leafs.advisory.RatingDetails;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractC6524cet;
import o.C1045Mp;
import o.C1203Sq;
import o.C1204Sr;
import o.C1206St;
import o.C1332Xp;
import o.C1596aHd;
import o.C6004cQk;
import o.C6488ceJ;
import o.C6522cer;
import o.C6906cmD;
import o.C6950cmv;
import o.C8054ddD;
import o.C8140dek;
import o.C8178dfV;
import o.C8566dqi;
import o.C8627dsp;
import o.C8632dsu;
import o.C9935zP;
import o.IE;
import o.InterfaceC1242Ud;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC1610aHr;
import o.InterfaceC3643bFl;
import o.InterfaceC5160btX;
import o.InterfaceC5176btn;
import o.InterfaceC5205buP;
import o.InterfaceC5241buz;
import o.InterfaceC5303bwH;
import o.InterfaceC7303ctf;
import o.InterfaceC7365cuo;
import o.InterfaceC8366diy;
import o.bEW;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;
import o.dsE;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class QuickDrawDialogFrag extends AbstractC6524cet {
    @Inject
    public InterfaceC5303bwH adsPlan;
    private bEW b;
    private ViewGroup d;
    private View g;
    private C6950cmv i;
    private TrackingInfoHolder j;
    @Inject
    public InterfaceC7303ctf offlineApi;
    @Inject
    public Lazy<PlaybackLauncher> playbackLauncher;
    @Inject
    public C6488ceJ quickDrawRepo;
    public static final d e = new d(null);
    public static final int c = 8;
    private final CompositeDisposable a = new CompositeDisposable();
    private boolean h = true;

    public static final QuickDrawDialogFrag a(NetflixActivity netflixActivity, String str, TrackingInfoHolder trackingInfoHolder, boolean z) {
        return e.d(netflixActivity, str, trackingInfoHolder, z);
    }

    public static final void b(View view) {
    }

    public static final QuickDrawDialogFrag c(NetflixActivity netflixActivity, String str, TrackingInfoHolder trackingInfoHolder) {
        return e.e(netflixActivity, str, trackingInfoHolder);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return this.h;
    }

    public final bEW i() {
        bEW bew = this.b;
        if (bew != null) {
            return bew;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final InterfaceC7303ctf b() {
        InterfaceC7303ctf interfaceC7303ctf = this.offlineApi;
        if (interfaceC7303ctf != null) {
            return interfaceC7303ctf;
        }
        C8632dsu.d("");
        return null;
    }

    public final C6488ceJ e() {
        C6488ceJ c6488ceJ = this.quickDrawRepo;
        if (c6488ceJ != null) {
            return c6488ceJ;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC5303bwH a() {
        InterfaceC5303bwH interfaceC5303bwH = this.adsPlan;
        if (interfaceC5303bwH != null) {
            return interfaceC5303bwH;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<PlaybackLauncher> d() {
        Lazy<PlaybackLauncher> lazy = this.playbackLauncher;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        public final QuickDrawDialogFrag d(NetflixActivity netflixActivity, String str, TrackingInfoHolder trackingInfoHolder, boolean z) {
            C8632dsu.c((Object) netflixActivity, "");
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            return a(this, netflixActivity, str, trackingInfoHolder, z, null, 16, null);
        }

        public final QuickDrawDialogFrag e(NetflixActivity netflixActivity, String str, TrackingInfoHolder trackingInfoHolder) {
            C8632dsu.c((Object) netflixActivity, "");
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            return a(this, netflixActivity, str, trackingInfoHolder, false, null, 24, null);
        }

        private d() {
            super("QuickDrawDialogFrag");
        }

        public static /* synthetic */ QuickDrawDialogFrag a(d dVar, NetflixActivity netflixActivity, String str, TrackingInfoHolder trackingInfoHolder, boolean z, PlayerExtras playerExtras, int i, Object obj) {
            return dVar.a(netflixActivity, str, trackingInfoHolder, (i & 8) != 0 ? false : z, (i & 16) != 0 ? new PlayerExtras(0L, 0L, 0, false, false, null, false, null, 0L, 0.0f, null, null, null, null, null, 32767, null) : playerExtras);
        }

        public final QuickDrawDialogFrag a(NetflixActivity netflixActivity, String str, TrackingInfoHolder trackingInfoHolder, boolean z, PlayerExtras playerExtras) {
            C8632dsu.c((Object) netflixActivity, "");
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            C8632dsu.c((Object) playerExtras, "");
            Bundle bundle = new Bundle();
            bundle.putString("video_id", str);
            bundle.putParcelable("tracking_info_holder", trackingInfoHolder);
            bundle.putBoolean("opened_from_lolomo", z);
            bundle.putParcelable(NetflixActivity.EXTRA_PLAYER_EXTRAS, playerExtras);
            QuickDrawDialogFrag quickDrawDialogFrag = new QuickDrawDialogFrag();
            quickDrawDialogFrag.setArguments(bundle);
            if (netflixActivity.showFullScreenDPLiteDialog(quickDrawDialogFrag)) {
                return quickDrawDialogFrag;
            }
            return null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        View inflate = layoutInflater.inflate(R.i.bl, viewGroup, false);
        C8632dsu.d(inflate);
        this.g = inflate;
        if (inflate == null) {
            C8632dsu.d("");
            inflate = null;
        }
        this.b = bEW.b(inflate);
        View view = this.g;
        if (view == null) {
            C8632dsu.d("");
            view = null;
        }
        View findViewById = view.findViewById(R.g.fb);
        C8632dsu.a(findViewById, "");
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        this.d = viewGroup2;
        if (viewGroup2 == null) {
            C8632dsu.d("");
            viewGroup2 = null;
        }
        viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: o.ceF
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                QuickDrawDialogFrag.a(QuickDrawDialogFrag.this, view2);
            }
        });
        View view2 = this.g;
        if (view2 == null) {
            C8632dsu.d("");
            return null;
        }
        return view2;
    }

    public static final void a(QuickDrawDialogFrag quickDrawDialogFrag, View view) {
        C8632dsu.c((Object) quickDrawDialogFrag, "");
        C6522cer c6522cer = C6522cer.b;
        TrackingInfoHolder trackingInfoHolder = quickDrawDialogFrag.j;
        if (trackingInfoHolder == null) {
            C8632dsu.d("");
            trackingInfoHolder = null;
        }
        c6522cer.f(trackingInfoHolder);
        quickDrawDialogFrag.dismiss();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String string;
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        ProgressBar progressBar = i().e;
        C8632dsu.a(progressBar, "");
        progressBar.setVisibility(0);
        Bundle arguments = getArguments();
        TrackingInfoHolder trackingInfoHolder = arguments != null ? (TrackingInfoHolder) arguments.getParcelable("tracking_info_holder") : null;
        if (trackingInfoHolder == null) {
            throw new IllegalStateException();
        }
        this.j = trackingInfoHolder;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("video_id")) == null) {
            throw new IllegalStateException();
        }
        Bundle arguments3 = getArguments();
        Single<InterfaceC5241buz> a2 = e().a(arguments3 != null ? arguments3.getBoolean("opened_from_lolomo") : false, string);
        final drM<InterfaceC5241buz, dpR> drm = new drM<InterfaceC5241buz, dpR>() { // from class: com.netflix.mediaclient.ui.lomo.qddp.QuickDrawDialogFrag$onViewCreated$disposable$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(InterfaceC5241buz interfaceC5241buz) {
                b(interfaceC5241buz);
                return dpR.c;
            }

            public final void b(InterfaceC5241buz interfaceC5241buz) {
                NetflixActivity requireNetflixActivity = QuickDrawDialogFrag.this.requireNetflixActivity();
                C8632dsu.a(requireNetflixActivity, "");
                ProgressBar progressBar2 = QuickDrawDialogFrag.this.i().e;
                C8632dsu.a(progressBar2, "");
                progressBar2.setVisibility(8);
                QuickDrawDialogFrag.this.h = false;
                QuickDrawDialogFrag quickDrawDialogFrag = QuickDrawDialogFrag.this;
                C8632dsu.d(interfaceC5241buz);
                quickDrawDialogFrag.c(requireNetflixActivity, interfaceC5241buz);
                QuickDrawDialogFrag.this.b(interfaceC5241buz);
                QuickDrawDialogFrag.this.d(requireNetflixActivity, interfaceC5241buz);
            }
        };
        Consumer<? super InterfaceC5241buz> consumer = new Consumer() { // from class: o.ceD
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                QuickDrawDialogFrag.d(drM.this, obj);
            }
        };
        final drM<Throwable, dpR> drm2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.lomo.qddp.QuickDrawDialogFrag$onViewCreated$disposable$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                e(th);
                return dpR.c;
            }

            public final void e(Throwable th) {
                QuickDrawDialogFrag.this.dismiss();
            }
        };
        Disposable subscribe = a2.subscribe(consumer, new Consumer() { // from class: o.ceE
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                QuickDrawDialogFrag.a(drM.this, obj);
            }
        });
        C8632dsu.a(subscribe, "");
        this.a.add(subscribe);
    }

    public static final void d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public static final void a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final void c(NetflixActivity netflixActivity, InterfaceC5241buz interfaceC5241buz) {
        TrackingInfoHolder trackingInfoHolder;
        C9935zP d2 = C9935zP.b.d(this);
        C1206St c1206St = i().a;
        C8632dsu.a(c1206St, "");
        C6950cmv c6950cmv = new C6950cmv(netflixActivity, new C6906cmD(c1206St, false, 2, null), d2.d());
        String id = interfaceC5241buz.getId();
        C8632dsu.a(id, "");
        VideoType type = interfaceC5241buz.getType();
        C8632dsu.a(type, "");
        TrackingInfoHolder trackingInfoHolder2 = this.j;
        if (trackingInfoHolder2 == null) {
            C8632dsu.d("");
            trackingInfoHolder = null;
        } else {
            trackingInfoHolder = trackingInfoHolder2;
        }
        C6950cmv.b(c6950cmv, id, type, trackingInfoHolder, false, null, 24, null);
        c6950cmv.e(interfaceC5241buz.getQuickDrawInQueue());
        this.i = c6950cmv;
    }

    public final void b(InterfaceC5241buz interfaceC5241buz) {
        String quickDrawSeasonNumLabel;
        i().b.showImage(new ShowImageRequest().a(interfaceC5241buz.getBoxshotUrl()).b(true).c(ShowImageRequest.Priority.a));
        NetflixImageView netflixImageView = i().b;
        C8140dek c8140dek = C8140dek.a;
        View view = this.g;
        if (view == null) {
            C8632dsu.d("");
            view = null;
        }
        Context context = view.getContext();
        C8632dsu.a(context, "");
        netflixImageView.setContentDescription(c8140dek.d(context, interfaceC5241buz));
        i().m.setText(interfaceC5241buz.getTitle());
        i().f13499o.setText(interfaceC5241buz.getQuickDrawSynopsis());
        Drawable b2 = ((InterfaceC1610aHr) C1332Xp.b(InterfaceC1610aHr.class)).b(new b(interfaceC5241buz), true);
        if (b2 != null) {
            NetflixImageView netflixImageView2 = i().k;
            netflixImageView2.setVisibility(0);
            netflixImageView2.setImageDrawable(b2);
            netflixImageView2.setContentDescription(interfaceC5241buz.getQuickDrawCertificationValue());
            i().g.setText(interfaceC5241buz.getQuickDrawYear());
        } else {
            i().k.setVisibility(8);
            C1204Sr c1204Sr = i().g;
            dsE dse = dsE.b;
            String format = String.format("%s    %s    ", Arrays.copyOf(new Object[]{interfaceC5241buz.getQuickDrawYear(), interfaceC5241buz.getQuickDrawCertificationValue()}, 2));
            C8632dsu.a(format, "");
            c1204Sr.setText(format);
        }
        C1204Sr c1204Sr2 = i().l;
        VideoType type = interfaceC5241buz.getType();
        VideoType videoType = VideoType.SHOW;
        if (type != videoType) {
            int quickDrawRuntime = interfaceC5241buz.getQuickDrawRuntime();
            View view2 = this.g;
            if (view2 == null) {
                C8632dsu.d("");
                view2 = null;
            }
            quickDrawSeasonNumLabel = C8178dfV.d(quickDrawRuntime, view2.getContext());
        } else {
            quickDrawSeasonNumLabel = interfaceC5241buz.getQuickDrawSeasonNumLabel();
        }
        c1204Sr2.setText(quickDrawSeasonNumLabel);
        DownloadButton downloadButton = i().h;
        if (b().c(getActivity(), interfaceC5241buz)) {
            downloadButton.setVisibility(0);
            downloadButton.setEnabled(true);
            if (interfaceC5241buz.getType() == videoType) {
                downloadButton.e(downloadButton.getContext().getString(R.o.bc));
            } else {
                NetflixActivity netflixActivity = (NetflixActivity) C8054ddD.a(downloadButton.getContext(), NetflixActivity.class);
                if (netflixActivity != null) {
                    downloadButton.setStateFromPlayable(new e(interfaceC5241buz), netflixActivity);
                }
            }
        } else {
            downloadButton.setVisibility(4);
        }
        KeyEvent.Callback callback = this.g;
        if (callback == null) {
            C8632dsu.d("");
            callback = null;
        }
        ViewGroup viewGroup = callback instanceof ViewGroup ? (ViewGroup) callback : null;
        if (viewGroup != null) {
            e(viewGroup, interfaceC5241buz);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements RatingDetails {
        final /* synthetic */ InterfaceC5241buz a;

        @Override // com.netflix.model.leafs.advisory.RatingDetails
        public String getRatingDescription() {
            return null;
        }

        @Override // com.netflix.model.leafs.advisory.RatingDetails
        public String getRatingShortDescription() {
            return null;
        }

        b(InterfaceC5241buz interfaceC5241buz) {
            this.a = interfaceC5241buz;
        }

        @Override // com.netflix.model.leafs.advisory.RatingDetails
        public AdvisoryBoard getAdvisoryBoard() {
            String quickDrawCertificationBoardId = this.a.getQuickDrawCertificationBoardId();
            if (quickDrawCertificationBoardId == null) {
                quickDrawCertificationBoardId = "";
            }
            return AdvisoryBoard.getAdvisoryBoardById(quickDrawCertificationBoardId);
        }

        @Override // com.netflix.model.leafs.advisory.RatingDetails
        public String getRatingLevel() {
            return this.a.getQuickDrawCertificationLevel();
        }

        @Override // com.netflix.model.leafs.advisory.RatingDetails
        public String getRatingValue() {
            return this.a.getQuickDrawCertificationValue();
        }

        @Override // com.netflix.model.leafs.advisory.RatingDetails
        public String getRatingId() {
            return this.a.getQuickDrawCertificationRatingId();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC5176btn {
        final /* synthetic */ InterfaceC5241buz a;

        e(InterfaceC5241buz interfaceC5241buz) {
            this.a = interfaceC5241buz;
        }

        @Override // o.InterfaceC5176btn
        public String aH_() {
            return this.a.aH_();
        }

        @Override // o.InterfaceC5176btn
        public boolean aY_() {
            return this.a.getType() == VideoType.SHOW;
        }

        @Override // o.InterfaceC5176btn
        public boolean d() {
            return this.a.isAvailableForDownload();
        }

        @Override // o.InterfaceC5176btn
        public boolean isPlayable() {
            return this.a.isPlayable();
        }
    }

    private final void e(ViewGroup viewGroup, final InterfaceC5241buz interfaceC5241buz) {
        if (c(interfaceC5241buz)) {
            boolean g = a().g();
            TrackingInfoHolder trackingInfoHolder = null;
            View b2 = g ? a().b(viewGroup, new View.OnClickListener() { // from class: o.cez
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QuickDrawDialogFrag.a(QuickDrawDialogFrag.this, interfaceC5241buz, view);
                }
            }) : null;
            if (b2 != null) {
                int indexOfChild = i().n.indexOfChild(i().f13499o);
                if (indexOfChild >= 0) {
                    i().n.addView(b2, indexOfChild + 1);
                }
                if (g) {
                    C6522cer c6522cer = C6522cer.b;
                    TrackingInfoHolder trackingInfoHolder2 = this.j;
                    if (trackingInfoHolder2 == null) {
                        C8632dsu.d("");
                    } else {
                        trackingInfoHolder = trackingInfoHolder2;
                    }
                    c6522cer.i(trackingInfoHolder);
                }
            }
        }
    }

    public static final void a(QuickDrawDialogFrag quickDrawDialogFrag, InterfaceC5241buz interfaceC5241buz, View view) {
        C8632dsu.c((Object) quickDrawDialogFrag, "");
        C8632dsu.c((Object) interfaceC5241buz, "");
        quickDrawDialogFrag.a(interfaceC5241buz);
    }

    private final boolean c(InterfaceC5241buz interfaceC5241buz) {
        return !interfaceC5241buz.isPlayable() && a().g();
    }

    /* loaded from: classes4.dex */
    public static final class c extends NetflixDialogFrag.a {
        c() {
        }

        @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag.a
        public void b(NetflixDialogFrag netflixDialogFrag) {
            C8632dsu.c((Object) netflixDialogFrag, "");
            super.b(netflixDialogFrag);
            C6522cer.b.c();
        }
    }

    public final void d(final NetflixActivity netflixActivity, final InterfaceC5241buz interfaceC5241buz) {
        addDismissOrCancelListener(new c());
        View view = this.g;
        if (view == null) {
            C8632dsu.d("");
            view = null;
        }
        if (interfaceC5241buz.isAvailableForDownload() && interfaceC5241buz.getType() == VideoType.SHOW) {
            i().h.setOnClickListener(new View.OnClickListener() { // from class: o.ces
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    QuickDrawDialogFrag.c(QuickDrawDialogFrag.this, netflixActivity, interfaceC5241buz, view2);
                }
            });
        }
        C1203Sq c1203Sq = i().j;
        C8632dsu.a(c1203Sq, "");
        c1203Sq.setVisibility(0);
        i().j.setOnClickListener(new View.OnClickListener() { // from class: o.cex
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                QuickDrawDialogFrag.a(QuickDrawDialogFrag.this, netflixActivity, interfaceC5241buz, view2);
            }
        });
        if (Build.VERSION.SDK_INT >= 28) {
            view.setAccessibilityPaneTitle(interfaceC5241buz.getTitle());
        }
        if (!interfaceC5241buz.isAvailableToPlay()) {
            i().c.setVisibility(8);
        } else {
            i().b.setImportantForAccessibility(1);
            ImageView imageView = i().c;
            C8632dsu.a(imageView, "");
            imageView.setVisibility(true ^ c(interfaceC5241buz) ? 0 : 8);
            NetflixImageView netflixImageView = i().b;
            C8140dek c8140dek = C8140dek.a;
            Context context = view.getContext();
            C8632dsu.a(context, "");
            netflixImageView.setContentDescription(c8140dek.b(context, interfaceC5241buz));
            i().b.setOnClickListener(new View.OnClickListener() { // from class: o.cew
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    QuickDrawDialogFrag.e(QuickDrawDialogFrag.this, interfaceC5241buz, view2);
                }
            });
        }
        i().n.setOnClickListener(new View.OnClickListener() { // from class: o.cey
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                QuickDrawDialogFrag.b(view2);
            }
        });
        i().i.setOnClickListener(new View.OnClickListener() { // from class: o.ceA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                QuickDrawDialogFrag.c(QuickDrawDialogFrag.this, view2);
            }
        });
    }

    public static final void c(QuickDrawDialogFrag quickDrawDialogFrag, NetflixActivity netflixActivity, InterfaceC5241buz interfaceC5241buz, View view) {
        C8632dsu.c((Object) quickDrawDialogFrag, "");
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) interfaceC5241buz, "");
        quickDrawDialogFrag.e(netflixActivity, interfaceC5241buz, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.lomo.qddp.QuickDrawDialogFrag$setupClickHandlers$2$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                d();
                return dpR.c;
            }

            public final void d() {
                TrackingInfoHolder trackingInfoHolder;
                C6522cer c6522cer = C6522cer.b;
                trackingInfoHolder = QuickDrawDialogFrag.this.j;
                if (trackingInfoHolder == null) {
                    C8632dsu.d("");
                    trackingInfoHolder = null;
                }
                c6522cer.d(trackingInfoHolder);
            }
        });
    }

    public static final void a(QuickDrawDialogFrag quickDrawDialogFrag, NetflixActivity netflixActivity, InterfaceC5241buz interfaceC5241buz, View view) {
        C8632dsu.c((Object) quickDrawDialogFrag, "");
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) interfaceC5241buz, "");
        quickDrawDialogFrag.e(netflixActivity, interfaceC5241buz, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.lomo.qddp.QuickDrawDialogFrag$setupClickHandlers$2$2$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                b();
                return dpR.c;
            }

            public final void b() {
                TrackingInfoHolder trackingInfoHolder;
                C6522cer c6522cer = C6522cer.b;
                trackingInfoHolder = QuickDrawDialogFrag.this.j;
                if (trackingInfoHolder == null) {
                    C8632dsu.d("");
                    trackingInfoHolder = null;
                }
                c6522cer.e(trackingInfoHolder);
            }
        });
    }

    public static final void e(QuickDrawDialogFrag quickDrawDialogFrag, InterfaceC5241buz interfaceC5241buz, View view) {
        C8632dsu.c((Object) quickDrawDialogFrag, "");
        C8632dsu.c((Object) interfaceC5241buz, "");
        quickDrawDialogFrag.e(interfaceC5241buz);
    }

    public static final void c(QuickDrawDialogFrag quickDrawDialogFrag, View view) {
        C8632dsu.c((Object) quickDrawDialogFrag, "");
        C6522cer c6522cer = C6522cer.b;
        TrackingInfoHolder trackingInfoHolder = quickDrawDialogFrag.j;
        if (trackingInfoHolder == null) {
            C8632dsu.d("");
            trackingInfoHolder = null;
        }
        c6522cer.c(trackingInfoHolder);
        quickDrawDialogFrag.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C6522cer c6522cer = C6522cer.b;
        TrackingInfoHolder trackingInfoHolder = this.j;
        if (trackingInfoHolder == null) {
            C8632dsu.d("");
            trackingInfoHolder = null;
        }
        c6522cer.b(trackingInfoHolder);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C6522cer.b.c();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onDestroy() {
        C6950cmv c6950cmv = this.i;
        if (c6950cmv != null) {
            c6950cmv.b();
        }
        this.i = null;
        this.a.dispose();
        super.onDestroy();
    }

    private final PlayContextImp j() {
        TrackingInfoHolder trackingInfoHolder = this.j;
        if (trackingInfoHolder == null) {
            C8632dsu.d("");
            trackingInfoHolder = null;
        }
        return TrackingInfoHolder.b(trackingInfoHolder, PlayLocationType.QUICK_DRAW_DP, "detailsPageOverlay", false, 4, null);
    }

    private final void e(NetflixActivity netflixActivity, InterfaceC5241buz interfaceC5241buz, drO<dpR> dro) {
        dro.invoke();
        InterfaceC3643bFl a2 = InterfaceC3643bFl.c.a(netflixActivity);
        TrackingInfoHolder trackingInfoHolder = this.j;
        if (trackingInfoHolder == null) {
            C8632dsu.d("");
            trackingInfoHolder = null;
        }
        a2.d(netflixActivity, interfaceC5241buz, trackingInfoHolder, "QuickDrawClickListener");
        dismiss();
    }

    private final void e(InterfaceC5241buz interfaceC5241buz) {
        if (!c(interfaceC5241buz)) {
            C6522cer c6522cer = C6522cer.b;
            TrackingInfoHolder trackingInfoHolder = this.j;
            if (trackingInfoHolder == null) {
                C8632dsu.d("");
                trackingInfoHolder = null;
            }
            c6522cer.a(trackingInfoHolder);
        }
        d(interfaceC5241buz);
    }

    private final void a(InterfaceC5241buz interfaceC5241buz) {
        C6522cer c6522cer = C6522cer.b;
        TrackingInfoHolder trackingInfoHolder = this.j;
        if (trackingInfoHolder == null) {
            C8632dsu.d("");
            trackingInfoHolder = null;
        }
        c6522cer.a(TrackingInfoHolder.a(trackingInfoHolder, null, 1, null));
        d(interfaceC5241buz);
    }

    private final void d(InterfaceC5241buz interfaceC5241buz) {
        b().a(getContext(), (interfaceC5241buz.getType() != VideoType.SHOW || interfaceC5241buz.aY_()) ? interfaceC5241buz.aH_() : interfaceC5241buz.getId(), new a(interfaceC5241buz));
    }

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC7365cuo {
        final /* synthetic */ InterfaceC5241buz b;

        a(InterfaceC5241buz interfaceC5241buz) {
            QuickDrawDialogFrag.this = r1;
            this.b = interfaceC5241buz;
        }

        @Override // o.InterfaceC7365cuo
        public void b() {
            QuickDrawDialogFrag.this.f(this.b);
        }
    }

    public final void f(InterfaceC5241buz interfaceC5241buz) {
        String id;
        List list;
        Observable e2;
        if (interfaceC5241buz.getType() == VideoType.SHOW && !interfaceC5241buz.aY_() && d().get().c() != PlaybackLauncher.PlaybackTarget.e) {
            InterfaceC5205buP cj_ = interfaceC5241buz.cj_();
            if (cj_ == null || (id = cj_.getPlayableId()) == null) {
                id = interfaceC5241buz.getId();
                C8632dsu.a(id, "");
            }
            String str = id;
            if (C8632dsu.c((Object) str, (Object) interfaceC5241buz.getId())) {
                InterfaceC1242Ud b2 = IE.b(SignupConstants.Field.VIDEOS, interfaceC5241buz.getId(), "episodes", "current", IE.c("detail", "bookmark", "offlineAvailable"));
                C8632dsu.a(b2, "");
                list = C8566dqi.e(b2);
            } else {
                list = null;
            }
            List list2 = list;
            CompositeDisposable compositeDisposable = this.a;
            e2 = new C6004cQk().e(str, (r27 & 2) != 0 ? true : true, (r27 & 4) != 0 ? false : true, (r27 & 8) != 0 ? false : true, (r27 & 16) != 0 ? false : false, (r27 & 32) != 0 ? false : false, (r27 & 64) != 0 ? false : false, (r27 & 128) != 0 ? false : false, (r27 & JSONzip.end) != 0 ? false : false, (r27 & 512) != 0 ? false : false, (r27 & 1024) != 0 ? null : list2, (r27 & 2048) == 0 ? false : false, (r27 & 4096) != 0 ? CmpTaskMode.FROM_CACHE_OR_NETWORK : CmpTaskMode.FROM_CACHE_OR_NETWORK);
            compositeDisposable.add(SubscribersKt.subscribeBy$default(e2, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.lomo.qddp.QuickDrawDialogFrag$startFullPlayer$2
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    a(th);
                    return dpR.c;
                }

                public final void a(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    QuickDrawDialogFrag.d dVar = QuickDrawDialogFrag.e;
                }
            }, (drO) null, new drM<C6004cQk.d<InterfaceC8366diy>, dpR>() { // from class: com.netflix.mediaclient.ui.lomo.qddp.QuickDrawDialogFrag$startFullPlayer$3
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C6004cQk.d<InterfaceC8366diy> dVar) {
                    d(dVar);
                    return dpR.c;
                }

                public final void d(C6004cQk.d<InterfaceC8366diy> dVar) {
                    Map d2;
                    Map k;
                    Throwable th;
                    C8632dsu.c((Object) dVar, "");
                    InterfaceC8366diy c2 = dVar.c();
                    if (dVar.d().j() && c2 != null && c2.aY_()) {
                        QuickDrawDialogFrag.this.i(c2);
                        return;
                    }
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d2 = dqE.d();
                    k = dqE.k(d2);
                    C1596aHd c1596aHd = new C1596aHd("QDDP - Unable to fetch playable episode", null, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b3 = c1596aHd.b();
                        if (b3 != null) {
                            String c3 = errorType.c();
                            c1596aHd.a(c3 + " " + b3);
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
                    InterfaceC1598aHf a2 = dVar2.a();
                    if (a2 != null) {
                        a2.e(c1596aHd, th);
                    } else {
                        dVar2.e().b(c1596aHd, th);
                    }
                }
            }, 2, (Object) null));
            return;
        }
        i(interfaceC5241buz);
    }

    public final void i(InterfaceC5241buz interfaceC5241buz) {
        InterfaceC5160btX i;
        InterfaceC5160btX interfaceC5160btX = (interfaceC5241buz.getType() != VideoType.SHOW || d().get().c() == PlaybackLauncher.PlaybackTarget.e || (i = interfaceC5241buz.i()) == null) ? interfaceC5241buz : i;
        Bundle arguments = getArguments();
        PlayerExtras playerExtras = arguments != null ? (PlayerExtras) arguments.getParcelable(NetflixActivity.EXTRA_PLAYER_EXTRAS) : null;
        PlaybackLauncher playbackLauncher = d().get();
        C8632dsu.a(playbackLauncher, "");
        PlaybackLauncher playbackLauncher2 = playbackLauncher;
        VideoType type = interfaceC5241buz.getType();
        C8632dsu.a(type, "");
        PlayContextImp j = j();
        if (playerExtras == null) {
            playerExtras = new PlayerExtras(0L, 0L, 0, false, false, null, false, null, 0L, 0.0f, null, null, null, null, null, 32767, null);
        }
        PlaybackLauncher.b.a(playbackLauncher2, interfaceC5160btX, type, j, playerExtras, null, 16, null);
    }
}
