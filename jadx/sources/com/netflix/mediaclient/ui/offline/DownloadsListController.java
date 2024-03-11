package com.netflix.mediaclient.ui.offline;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.offline.CachingSelectableController;
import com.netflix.mediaclient.ui.offline.DownloadsListController;
import com.netflix.mediaclient.ui.offline.OfflineAdapterData;
import com.netflix.mediaclient.ui.offline.OfflineFragmentV2;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import o.AbstractApplicationC1040Mh;
import o.AbstractC3073as;
import o.AbstractC7258csn;
import o.AbstractC7259cso;
import o.AbstractC7260csp;
import o.AbstractC7379cvB;
import o.C1045Mp;
import o.C1332Xp;
import o.C1596aHd;
import o.C5096bsM;
import o.C5839cKg;
import o.C7169crD;
import o.C7230csL;
import o.C7237csS;
import o.C7256csl;
import o.C7264cst;
import o.C7266csv;
import o.C7270csz;
import o.C7301ctd;
import o.C7353cuc;
import o.C7372cuv;
import o.C7375cuy;
import o.C7381cvD;
import o.C7384cvG;
import o.C7409cvf;
import o.C7460cwd;
import o.C8004dcG;
import o.C8116deM;
import o.C8126deW;
import o.C8168dfL;
import o.C8258dgw;
import o.C8572dqo;
import o.C8627dsp;
import o.C8632dsu;
import o.C9726vo;
import o.C9911ys;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC4308bc;
import o.InterfaceC4361bd;
import o.InterfaceC5160btX;
import o.InterfaceC5206buQ;
import o.InterfaceC5283bvo;
import o.InterfaceC7221csC;
import o.InterfaceC7281ctJ;
import o.InterfaceC7365cuo;
import o.InterfaceC7371cuu;
import o.InterfaceC7464cwh;
import o.InterfaceC8612dsa;
import o.dpR;
import o.dqE;
import o.drM;

/* loaded from: classes4.dex */
public class DownloadsListController<T extends C7266csv> extends CachingSelectableController<T, AbstractC7258csn<?>> {
    public static final int MERCH_BOXART_COUNT = 3;
    private final HashSet<String> allEpisodesList;
    private RecyclerView attachedRecyclerView;
    private boolean buildingDownloadedForYouModels;
    private final InterfaceC5283bvo currentProfile;
    private final String currentProfileGuid;
    private final Observable<dpR> destroyObservable;
    private final BroadcastReceiver downloadedForYouOptInReceiver;
    private final InterfaceC7221csC downloadsFeatures;
    private final C9911ys footerItemDecorator;
    private boolean hasVideos;
    private final b listener;
    private final NetflixActivity netflixActivity;
    private List<String> optInBoxArtList;
    private final C5839cKg presentationTracking;
    private Map<String, C7375cuy> profileModelCache;
    private final InterfaceC7371cuu profileProvider;
    private final OfflineFragmentV2.b screenLauncher;
    private final CachingSelectableController.e selectionChangesListener;
    private final View.OnClickListener showAllDownloadableClickListener;
    private final View.OnClickListener showAllProfilesClickListener;
    private final InterfaceC4308bc<C7256csl, AbstractC7259cso.b> showClickListener;
    private final InterfaceC4361bd<C7256csl, AbstractC7259cso.b> showLongClickListener;
    private boolean showOnlyCurrentProfile;
    private final InterfaceC7281ctJ uiList;
    private final InterfaceC4308bc<C7264cst, AbstractC7260csp.c> videoClickListener;
    private final InterfaceC4361bd<C7264cst, AbstractC7260csp.c> videoLongClickListener;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    /* loaded from: classes4.dex */
    public interface b {
        void c(List<String> list);
    }

    /* loaded from: classes4.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[OfflineAdapterData.ViewType.values().length];
            try {
                iArr[OfflineAdapterData.ViewType.SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OfflineAdapterData.ViewType.MOVIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            c = iArr;
        }
    }

    protected void addTopModels(T t, boolean z) {
        C8632dsu.c((Object) t, "");
    }

    public final RecyclerView getAttachedRecyclerView() {
        return this.attachedRecyclerView;
    }

    public final boolean getHasVideos() {
        return this.hasVideos;
    }

    public final NetflixActivity getNetflixActivity() {
        return this.netflixActivity;
    }

    protected final Map<String, C7375cuy> getProfileModelCache() {
        return this.profileModelCache;
    }

    public final boolean getShowOnlyCurrentProfile() {
        return this.showOnlyCurrentProfile;
    }

    public final void setAttachedRecyclerView(RecyclerView recyclerView) {
        this.attachedRecyclerView = recyclerView;
    }

    public final void setHasVideos(boolean z) {
        this.hasVideos = z;
    }

    protected final void setProfileModelCache(Map<String, C7375cuy> map) {
        C8632dsu.c((Object) map, "");
        this.profileModelCache = map;
    }

    public final void setShowOnlyCurrentProfile(boolean z) {
        this.showOnlyCurrentProfile = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.netflix.mediaclient.ui.offline.CachingSelectableController
    public /* bridge */ /* synthetic */ void buildModels(Object obj, boolean z, Map map) {
        buildModels((DownloadsListController<T>) ((C7266csv) obj), z, (Map<Long, AbstractC3073as<?>>) map);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ DownloadsListController(com.netflix.mediaclient.android.activity.NetflixActivity r13, o.InterfaceC5283bvo r14, o.InterfaceC7371cuu r15, boolean r16, com.netflix.mediaclient.ui.offline.OfflineFragmentV2.b r17, o.InterfaceC7281ctJ r18, com.netflix.mediaclient.ui.offline.CachingSelectableController.e r19, com.netflix.mediaclient.ui.offline.DownloadsListController.b r20, o.InterfaceC7221csC r21, io.reactivex.Observable r22, int r23, o.C8627dsp r24) {
        /*
            r12 = this;
            r0 = r23 & 4
            if (r0 == 0) goto Lb
            o.cuu$d r0 = new o.cuu$d
            r0.<init>()
            r4 = r0
            goto Lc
        Lb:
            r4 = r15
        Lc:
            r0 = r23 & 32
            if (r0 == 0) goto L1b
            o.ctJ r0 = o.C7353cuc.a()
            java.lang.String r1 = ""
            o.C8632dsu.a(r0, r1)
            r7 = r0
            goto L1d
        L1b:
            r7 = r18
        L1d:
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.offline.DownloadsListController.<init>(com.netflix.mediaclient.android.activity.NetflixActivity, o.bvo, o.cuu, boolean, com.netflix.mediaclient.ui.offline.OfflineFragmentV2$b, o.ctJ, com.netflix.mediaclient.ui.offline.CachingSelectableController$e, com.netflix.mediaclient.ui.offline.DownloadsListController$b, o.csC, io.reactivex.Observable, int, o.dsp):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DownloadsListController(com.netflix.mediaclient.android.activity.NetflixActivity r4, o.InterfaceC5283bvo r5, o.InterfaceC7371cuu r6, boolean r7, com.netflix.mediaclient.ui.offline.OfflineFragmentV2.b r8, o.InterfaceC7281ctJ r9, com.netflix.mediaclient.ui.offline.CachingSelectableController.e r10, com.netflix.mediaclient.ui.offline.DownloadsListController.b r11, o.InterfaceC7221csC r12, io.reactivex.Observable<o.dpR> r13) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r4, r0)
            o.C8632dsu.c(r5, r0)
            o.C8632dsu.c(r6, r0)
            o.C8632dsu.c(r8, r0)
            o.C8632dsu.c(r9, r0)
            o.C8632dsu.c(r10, r0)
            o.C8632dsu.c(r11, r0)
            o.C8632dsu.c(r12, r0)
            o.C8632dsu.c(r13, r0)
            android.os.Handler r1 = o.AbstractC2914ap.defaultModelBuildingHandler
            o.C8632dsu.a(r1, r0)
            java.lang.Class<o.bwu> r2 = o.C5342bwu.class
            java.lang.Object r2 = o.C1332Xp.b(r2)
            o.bwu r2 = (o.C5342bwu) r2
            android.os.Handler r2 = r2.c()
            r3.<init>(r1, r2, r10)
            r3.netflixActivity = r4
            r3.currentProfile = r5
            r3.profileProvider = r6
            r3.showOnlyCurrentProfile = r7
            r3.screenLauncher = r8
            r3.uiList = r9
            r3.selectionChangesListener = r10
            r3.listener = r11
            r3.downloadsFeatures = r12
            r3.destroyObservable = r13
            o.ys r4 = new o.ys
            r4.<init>()
            r3.footerItemDecorator = r4
            java.lang.String r4 = r5.getProfileGuid()
            o.C8632dsu.a(r4, r0)
            r3.currentProfileGuid = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r3.profileModelCache = r4
            o.cKg r4 = new o.cKg
            r4.<init>()
            r3.presentationTracking = r4
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r3.allEpisodesList = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.optInBoxArtList = r4
            com.netflix.mediaclient.ui.offline.DownloadsListController$d r4 = new com.netflix.mediaclient.ui.offline.DownloadsListController$d
            r4.<init>(r3)
            r3.downloadedForYouOptInReceiver = r4
            o.csA r4 = new o.csA
            r4.<init>()
            r3.videoClickListener = r4
            o.csI r4 = new o.csI
            r4.<init>()
            r3.showClickListener = r4
            o.csF r4 = new o.csF
            r4.<init>()
            r3.showLongClickListener = r4
            o.csH r4 = new o.csH
            r4.<init>()
            r3.videoLongClickListener = r4
            o.csG r4 = new o.csG
            r4.<init>()
            r3.showAllDownloadableClickListener = r4
            o.csJ r4 = new o.csJ
            r4.<init>()
            r3.showAllProfilesClickListener = r4
            r4 = 0
            r3.setDebugLoggingEnabled(r4)
            r4 = 1
            r3.setCachingEnabled$netflix_modules_ui_offline_impl_release(r4)
            boolean r4 = r12.a()
            if (r4 == 0) goto Lb3
            r3.requestDownloadsForYouMerchBoxarts()
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.offline.DownloadsListController.<init>(com.netflix.mediaclient.android.activity.NetflixActivity, o.bvo, o.cuu, boolean, com.netflix.mediaclient.ui.offline.OfflineFragmentV2$b, o.ctJ, com.netflix.mediaclient.ui.offline.CachingSelectableController$e, com.netflix.mediaclient.ui.offline.DownloadsListController$b, o.csC, io.reactivex.Observable):void");
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("DownloadsListController");
        }

        public final DownloadsListController<C7266csv> c(NetflixActivity netflixActivity, InterfaceC5283bvo interfaceC5283bvo, boolean z, OfflineFragmentV2.b bVar, CachingSelectableController.e eVar, b bVar2, InterfaceC7221csC interfaceC7221csC, Observable<dpR> observable) {
            C8632dsu.c((Object) netflixActivity, "");
            C8632dsu.c((Object) interfaceC5283bvo, "");
            C8632dsu.c((Object) bVar, "");
            C8632dsu.c((Object) eVar, "");
            C8632dsu.c((Object) bVar2, "");
            C8632dsu.c((Object) interfaceC7221csC, "");
            C8632dsu.c((Object) observable, "");
            return new DownloadsListController<>(netflixActivity, interfaceC5283bvo, null, z, bVar, null, eVar, bVar2, interfaceC7221csC, observable, 36, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends BroadcastReceiver {
        final /* synthetic */ DownloadsListController<T> c;

        d(DownloadsListController<T> downloadsListController) {
            this.c = downloadsListController;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            this.c.requestModelBuild();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void videoClickListener$lambda$0(DownloadsListController downloadsListController, C7264cst c7264cst, AbstractC7260csp.c cVar, View view, int i) {
        C8632dsu.c((Object) downloadsListController, "");
        if (c7264cst.H()) {
            C8632dsu.d(c7264cst);
            downloadsListController.toggleSelectedState(c7264cst);
            return;
        }
        C7372cuv.a.c(view.getContext(), c7264cst.F(), new c(downloadsListController, c7264cst));
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC7365cuo {
        final /* synthetic */ C7264cst d;
        final /* synthetic */ DownloadsListController<T> e;

        c(DownloadsListController<T> downloadsListController, C7264cst c7264cst) {
            this.e = downloadsListController;
            this.d = c7264cst;
        }

        @Override // o.InterfaceC7365cuo
        public void b() {
            OfflineFragmentV2.b bVar = ((DownloadsListController) this.e).screenLauncher;
            String F = this.d.F();
            C8632dsu.a(F, "");
            VideoType M = this.d.M();
            C8632dsu.a(M, "");
            TrackingInfoHolder E = this.d.E();
            C8632dsu.a(E, "");
            bVar.c(F, M, TrackingInfoHolder.b(E, PlayLocationType.DOWNLOADS, false, 2, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showClickListener$lambda$1(DownloadsListController downloadsListController, C7256csl c7256csl, AbstractC7259cso.b bVar, View view, int i) {
        C8632dsu.c((Object) downloadsListController, "");
        if (c7256csl.K()) {
            C8632dsu.d(c7256csl);
            downloadsListController.toggleSelectedState(c7256csl);
            return;
        }
        downloadsListController.screenLauncher.d(c7256csl.t(), c7256csl.p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showLongClickListener$lambda$2(DownloadsListController downloadsListController, C7256csl c7256csl, AbstractC7259cso.b bVar, View view, int i) {
        C8632dsu.c((Object) downloadsListController, "");
        C8632dsu.d(c7256csl);
        downloadsListController.toggleSelectedState(c7256csl);
        if (!c7256csl.K()) {
            downloadsListController.toggleSelectedState(c7256csl);
            downloadsListController.selectionChangesListener.c(true);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean videoLongClickListener$lambda$3(DownloadsListController downloadsListController, C7264cst c7264cst, AbstractC7260csp.c cVar, View view, int i) {
        C8632dsu.c((Object) downloadsListController, "");
        C8632dsu.d(c7264cst);
        downloadsListController.toggleSelectedState(c7264cst);
        if (!c7264cst.K()) {
            downloadsListController.selectionChangesListener.c(true);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAllDownloadableClickListener$lambda$4(DownloadsListController downloadsListController, View view) {
        C8632dsu.c((Object) downloadsListController, "");
        downloadsListController.screenLauncher.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAllProfilesClickListener$lambda$5(DownloadsListController downloadsListController, View view) {
        C8632dsu.c((Object) downloadsListController, "");
        downloadsListController.showOnlyCurrentProfile = !downloadsListController.showOnlyCurrentProfile;
        downloadsListController.requestModelBuild();
    }

    @Override // o.AbstractC2914ap
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C8632dsu.c((Object) recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.attachedRecyclerView = recyclerView;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(this.footerItemDecorator);
        }
        recyclerView.setItemAnimator(null);
        C8258dgw.a.e().e(this.downloadedForYouOptInReceiver);
    }

    @Override // o.AbstractC2914ap
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C8632dsu.c((Object) recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        C8116deM.a(AbstractApplicationC1040Mh.d(), this.downloadedForYouOptInReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getIdStringForVideo(String str, String str2) {
        return str + ":" + str2;
    }

    private final void addProfileViewModel(String str) {
        AbstractC3073as<?> createProfileView = createProfileView(str);
        if (createProfileView != null) {
            add(createProfileView);
        }
    }

    private final void buildBaseModels(T t, boolean z, final Map<Long, AbstractC3073as<?>> map) {
        boolean z2;
        String str;
        C7264cst c7264cst;
        C7264cst c7264cst2 = new C7264cst();
        C7256csl c7256csl = new C7256csl();
        List<OfflineAdapterData> a2 = t.a();
        ArrayList<OfflineAdapterData> arrayList = new ArrayList();
        for (Object obj : a2) {
            if (((OfflineAdapterData) obj).a().a != null) {
                arrayList.add(obj);
            }
        }
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        String str2 = null;
        for (final OfflineAdapterData offlineAdapterData : arrayList) {
            final C7460cwd c7460cwd = offlineAdapterData.a().a;
            String str3 = offlineAdapterData.a().c;
            if (z4) {
                z2 = z4;
            } else {
                addTopModels(t, z);
                z2 = true;
            }
            if (this.currentProfile.isKidsProfile() && !C8632dsu.c((Object) str3, (Object) this.currentProfileGuid)) {
                if (!z5) {
                    addAllProfilesButton();
                    z5 = true;
                }
                if (this.showOnlyCurrentProfile) {
                    c7264cst = c7264cst2;
                    z4 = z2;
                    c7264cst2 = c7264cst;
                    z3 = true;
                }
            }
            boolean z6 = z5;
            if (C8632dsu.c((Object) str3, (Object) str2)) {
                str = str2;
            } else {
                C8632dsu.d((Object) str3);
                addProfileViewModel(str3);
                str = str3;
            }
            OfflineAdapterData.ViewType viewType = offlineAdapterData.a().b;
            int i = viewType == null ? -1 : e.c[viewType.ordinal()];
            if (i == 1) {
                c7264cst = c7264cst2;
                String str4 = offlineAdapterData.a().c;
                C8632dsu.a(str4, "");
                String id = c7460cwd.getId();
                C8632dsu.a(id, "");
                String idStringForVideo = getIdStringForVideo(str4, id);
                AbstractC3073as<?> remove = map != null ? map.remove(Long.valueOf(c7256csl.a((CharSequence) idStringForVideo).b())) : null;
                if (remove != null) {
                    add(remove);
                } else {
                    C8632dsu.d(c7460cwd);
                    addShowModel(idStringForVideo, offlineAdapterData, c7460cwd);
                }
            } else if (i != 2) {
                c7264cst = c7264cst2;
            } else {
                final C7264cst c7264cst3 = c7264cst2;
                c7264cst = c7264cst2;
                dpR dpr = (dpR) C9726vo.d(c7460cwd.aE_(), c7460cwd.aE_().aH_(), this.uiList.c(c7460cwd.getId()), new InterfaceC8612dsa<InterfaceC5160btX, String, InterfaceC5206buQ, dpR>(this) { // from class: com.netflix.mediaclient.ui.offline.DownloadsListController$buildBaseModels$2$1$1
                    final /* synthetic */ DownloadsListController<T> a;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                        this.a = this;
                    }

                    @Override // o.InterfaceC8612dsa
                    public /* synthetic */ dpR invoke(InterfaceC5160btX interfaceC5160btX, String str5, InterfaceC5206buQ interfaceC5206buQ) {
                        c(interfaceC5160btX, str5, interfaceC5206buQ);
                        return dpR.c;
                    }

                    public final void c(InterfaceC5160btX interfaceC5160btX, String str5, InterfaceC5206buQ interfaceC5206buQ) {
                        String idStringForVideo2;
                        C8632dsu.c((Object) interfaceC5160btX, "");
                        C8632dsu.c((Object) str5, "");
                        C8632dsu.c((Object) interfaceC5206buQ, "");
                        DownloadsListController<T> downloadsListController = this.a;
                        String str6 = offlineAdapterData.a().c;
                        C8632dsu.a(str6, "");
                        idStringForVideo2 = downloadsListController.getIdStringForVideo(str6, str5);
                        long b2 = c7264cst3.a((CharSequence) idStringForVideo2).b();
                        Map<Long, AbstractC3073as<?>> map2 = map;
                        AbstractC3073as<?> remove2 = map2 != null ? map2.remove(Long.valueOf(b2)) : null;
                        if (remove2 != null) {
                            this.a.add(remove2);
                            return;
                        }
                        DownloadsListController<T> downloadsListController2 = this.a;
                        C7460cwd c7460cwd2 = c7460cwd;
                        C8632dsu.a(c7460cwd2, "");
                        downloadsListController2.addVideoModel(idStringForVideo2, c7460cwd2, interfaceC5160btX, interfaceC5206buQ);
                    }
                });
            }
            z5 = z6;
            str2 = str;
            z4 = z2;
            c7264cst2 = c7264cst;
            z3 = true;
        }
        if (z3) {
            this.hasVideos = z3;
        }
    }

    public void buildModels(T t, boolean z, Map<Long, AbstractC3073as<?>> map) {
        C8632dsu.c((Object) t, "");
        this.footerItemDecorator.d(true);
        this.hasVideos = false;
        C7270csz c7270csz = (C7270csz) t;
        c7270csz.c(false);
        this.buildingDownloadedForYouModels = false;
        buildBaseModels(t, z, map);
        c7270csz.c(true);
        this.buildingDownloadedForYouModels = true;
        buildBaseModels(t, z, map);
        if (this.downloadsFeatures.a()) {
            addDownloadsForYouMerchModel(c7270csz);
            addFindMoreButtonModel(t);
        } else if (c7270csz.c() && !this.hasVideos) {
            addEmptyStateEpoxyViewModel(t);
        } else {
            addFindMoreButtonModel(t);
        }
    }

    private final AbstractC3073as<?> createProfileView(String str) {
        InterfaceC7464cwh a2;
        String str2 = null;
        if (this.buildingDownloadedForYouModels) {
            C7381cvD c7381cvD = new C7381cvD();
            c7381cvD.d((CharSequence) ("downloaded_for_you_header" + str));
            c7381cvD.b(C8258dgw.a.e().h());
            c7381cvD.a(false);
            if (!C8632dsu.c((Object) str, (Object) this.currentProfile.getProfileGuid()) && (a2 = this.profileProvider.a(str)) != null) {
                str2 = a2.d();
            }
            c7381cvD.d(str2);
            return c7381cvD;
        }
        InterfaceC7464cwh a3 = this.profileProvider.a(str);
        if (a3 != null) {
            C7375cuy c7375cuy = new C7375cuy();
            String a4 = a3.a();
            C7375cuy c2 = c7375cuy.a((CharSequence) ("profile:" + a4)).c((CharSequence) a3.d());
            C1332Xp c1332Xp = C1332Xp.b;
            return c2.a(a3.a((Context) C1332Xp.b(Context.class))).e(0);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addVideoModel(String str, C7460cwd c7460cwd, InterfaceC5160btX interfaceC5160btX, InterfaceC5206buQ interfaceC5206buQ) {
        C5096bsM a2 = C7353cuc.a(this.currentProfileGuid, interfaceC5160btX.aH_());
        Integer valueOf = a2 != null ? Integer.valueOf(C8004dcG.e.a(a2.c, interfaceC5160btX.g(), interfaceC5160btX.ay_())) : null;
        C7230csL.a(c7460cwd);
        add(AbstractC7260csp.b.e(str, interfaceC5206buQ, c7460cwd, valueOf, this.presentationTracking).d(this.videoClickListener).b(this.videoLongClickListener));
    }

    private final void addShowModel(String str, OfflineAdapterData offlineAdapterData, C7460cwd c7460cwd) {
        int d2;
        int d3;
        AbstractC7259cso.e eVar;
        C7230csL.a(c7460cwd);
        C7256csl c7256csl = new C7256csl();
        c7256csl.a((CharSequence) str);
        c7256csl.i(c7460cwd.getId());
        c7256csl.b(c7460cwd.k());
        c7256csl.d(offlineAdapterData.a().c);
        c7256csl.b((CharSequence) c7460cwd.getTitle());
        c7256csl.a(c7460cwd.aA());
        C7460cwd[] b2 = offlineAdapterData.b();
        C8632dsu.a(b2, "");
        ArrayList<C7460cwd> arrayList = new ArrayList();
        for (C7460cwd c7460cwd2 : b2) {
            if (c7460cwd2.getType() == VideoType.EPISODE) {
                arrayList.add(c7460cwd2);
            }
        }
        d2 = C8572dqo.d(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(d2);
        for (C7460cwd c7460cwd3 : arrayList) {
            arrayList2.add(this.uiList.c(c7460cwd3.aE_().aH_()));
        }
        ArrayList<InterfaceC5206buQ> arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((InterfaceC5206buQ) obj) != null) {
                arrayList3.add(obj);
            }
        }
        d3 = C8572dqo.d(arrayList3, 10);
        ArrayList arrayList4 = new ArrayList(d3);
        long j = 0;
        for (InterfaceC5206buQ interfaceC5206buQ : arrayList3) {
            if (interfaceC5206buQ != null) {
                j += interfaceC5206buQ.aP_();
                eVar = getEpisodeInfo(interfaceC5206buQ);
            } else {
                eVar = null;
            }
            arrayList4.add(eVar);
        }
        c7256csl.a((List<AbstractC7259cso.e>) arrayList4);
        c7256csl.d(j);
        c7256csl.d(this.showClickListener);
        c7256csl.b(this.showLongClickListener);
        add(c7256csl);
    }

    private final AbstractC7259cso.e getEpisodeInfo(InterfaceC5206buQ interfaceC5206buQ) {
        String aH_ = interfaceC5206buQ.aH_();
        C8632dsu.a(aH_, "");
        Status aA_ = interfaceC5206buQ.aA_();
        C8632dsu.a(aA_, "");
        WatchState C = interfaceC5206buQ.C();
        C8632dsu.a(C, "");
        DownloadState au_ = interfaceC5206buQ.au_();
        C8632dsu.a(au_, "");
        StopReason aM_ = interfaceC5206buQ.aM_();
        C8632dsu.a(aM_, "");
        return new AbstractC7259cso.e(aH_, aA_, C, au_, aM_, interfaceC5206buQ.aD_(), interfaceC5206buQ.aP_());
    }

    public final void progressUpdated(String str, InterfaceC5206buQ interfaceC5206buQ) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC5206buQ, "");
        String aH_ = interfaceC5206buQ.aH_();
        C8632dsu.a(aH_, "");
        invalidateCacheForModel(new C7264cst().a((CharSequence) getIdStringForVideo(str, aH_)).b());
        requestModelBuild();
    }

    public final void clearAllDropdowns() {
        this.allEpisodesList.clear();
    }

    @SuppressLint({"CheckResult"})
    private final void requestDownloadsForYouMerchBoxarts() {
        Single<List<String>> subscribeOn = new C7409cvf().d().b(this.currentProfile, 3).takeUntil(this.destroyObservable.ignoreElements()).subscribeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(subscribeOn, "");
        SubscribersKt.subscribeBy(subscribeOn, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.offline.DownloadsListController$requestDownloadsForYouMerchBoxarts$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                d(th);
                return dpR.c;
            }

            public final void d(Throwable th) {
                Map d2;
                Map k;
                Throwable th2;
                C8632dsu.c((Object) th, "");
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("SPY-34028: DownloadsListController::requestMerchBoxarts: failed to retrieve merch boxarts", th, null, false, k, false, false, 96, null);
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
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
            }
        }, new drM<List<? extends String>, dpR>(this) { // from class: com.netflix.mediaclient.ui.offline.DownloadsListController$requestDownloadsForYouMerchBoxarts$2
            final /* synthetic */ DownloadsListController<T> d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.d = this;
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(List<? extends String> list) {
                a(list);
                return dpR.c;
            }

            public final void a(List<String> list) {
                DownloadsListController<T> downloadsListController = this.d;
                C8632dsu.d(list);
                ((DownloadsListController) downloadsListController).optInBoxArtList = list;
                this.d.requestModelBuild();
            }
        });
    }

    private final void addEmptyStateEpoxyViewModel(C7266csv c7266csv) {
        this.footerItemDecorator.d(false);
        C7237csS c7237csS = new C7237csS();
        c7237csS.e((CharSequence) "empty");
        c7237csS.c(R.e.R);
        c7237csS.e(R.o.iN);
        if (c7266csv.d()) {
            c7237csS.d(R.o.hU);
            c7237csS.c(this.showAllDownloadableClickListener);
        }
        add(c7237csS);
    }

    private final void addFindMoreButtonModel(C7266csv c7266csv) {
        if (!c7266csv.d()) {
            this.footerItemDecorator.d(false);
            return;
        }
        C7301ctd c7301ctd = new C7301ctd();
        c7301ctd.d((CharSequence) "findMore");
        c7301ctd.c((CharSequence) C8168dfL.d(R.o.hR));
        c7301ctd.a(this.showAllDownloadableClickListener);
        add(c7301ctd);
    }

    private final void addDownloadsForYouMerchModel(C7270csz c7270csz) {
        if (c7270csz.e().isEmpty() || !this.hasVideos) {
            C8258dgw.a aVar = C8258dgw.a;
            if (aVar.e().j()) {
                InterfaceC5283bvo a2 = C8126deW.a(this.netflixActivity);
                String profileGuid = a2 != null ? a2.getProfileGuid() : null;
                if (profileGuid != null && aVar.e().d(profileGuid) <= 0.0f) {
                    addDownloadedForYouMerchView();
                    return;
                }
                C7381cvD c7381cvD = new C7381cvD();
                c7381cvD.d((CharSequence) "downloaded_for_you_header");
                c7381cvD.b(aVar.e().h());
                c7381cvD.a(true);
                add(c7381cvD);
                return;
            }
            addDownloadedForYouMerchView();
        }
    }

    private final void addDownloadedForYouMerchView() {
        if (this.optInBoxArtList.size() < 3) {
            return;
        }
        this.footerItemDecorator.d(false);
        C7384cvG c7384cvG = new C7384cvG();
        c7384cvG.a((CharSequence) "downloaded_for_you_merch");
        c7384cvG.c(!this.hasVideos);
        c7384cvG.b(this.optInBoxArtList.get(0));
        c7384cvG.c(this.optInBoxArtList.get(1));
        c7384cvG.h(this.optInBoxArtList.get(2));
        c7384cvG.c(new InterfaceC4308bc() { // from class: o.csE
            @Override // o.InterfaceC4308bc
            public final void c(AbstractC3073as abstractC3073as, Object obj, View view, int i) {
                DownloadsListController.addDownloadedForYouMerchView$lambda$24$lambda$23(DownloadsListController.this, (C7384cvG) abstractC3073as, (AbstractC7379cvB.a) obj, view, i);
            }
        });
        add(c7384cvG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addDownloadedForYouMerchView$lambda$24$lambda$23(DownloadsListController downloadsListController, C7384cvG c7384cvG, AbstractC7379cvB.a aVar, View view, int i) {
        C8632dsu.c((Object) downloadsListController, "");
        downloadsListController.listener.c(downloadsListController.optInBoxArtList);
    }

    private final void addAllProfilesButton() {
        C7169crD c7169crD = new C7169crD();
        c7169crD.d((CharSequence) "allProfiles");
        c7169crD.c(!this.showOnlyCurrentProfile);
        c7169crD.e(this.showAllProfilesClickListener);
        add(c7169crD);
    }
}
