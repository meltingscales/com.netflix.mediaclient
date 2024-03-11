package com.netflix.mediaclient.ui.offline;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.offline.CachingSelectableController;
import com.netflix.mediaclient.ui.offline.OfflineAdapterData;
import com.netflix.mediaclient.ui.offline.OfflineFragmentV2;
import com.netflix.mediaclient.util.PlayContext;
import java.util.Map;
import o.AbstractApplicationC1040Mh;
import o.AbstractC3073as;
import o.AbstractC7258csn;
import o.AbstractC7260csp;
import o.C1045Mp;
import o.C5096bsM;
import o.C5839cKg;
import o.C7186crU;
import o.C7230csL;
import o.C7237csS;
import o.C7264cst;
import o.C7301ctd;
import o.C7329cuE;
import o.C7353cuc;
import o.C7372cuv;
import o.C7460cwd;
import o.C8004dcG;
import o.C8168dfL;
import o.C8627dsp;
import o.C8632dsu;
import o.C9911ys;
import o.InterfaceC4308bc;
import o.InterfaceC4361bd;
import o.InterfaceC5160btX;
import o.InterfaceC5206buQ;
import o.InterfaceC5283bvo;
import o.InterfaceC7281ctJ;
import o.InterfaceC7365cuo;

/* loaded from: classes4.dex */
public final class DownloadedEpisodesController<T extends C7186crU> extends CachingSelectableController<T, AbstractC7258csn<?>> {
    private RecyclerView attachedRecyclerView;
    private final View.OnClickListener findMoreEpisodesClickListener;
    private final C9911ys footerItemDecorator;
    private boolean hasVideos;
    private final C7264cst idConverterModel;
    private final C5839cKg presentationTracking;
    private final String profileGuid;
    private final OfflineFragmentV2.b screenLauncher;
    private final CachingSelectableController.e selectionChangesListener;
    private final String titleId;
    private final InterfaceC7281ctJ uiList;
    private final InterfaceC4308bc<C7264cst, AbstractC7260csp.c> videoClickListener;
    private final InterfaceC4361bd<C7264cst, AbstractC7260csp.c> videoLongClickListener;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public final boolean getHasVideos() {
        return this.hasVideos;
    }

    public final String getProfileGuid() {
        return this.profileGuid;
    }

    public final InterfaceC7281ctJ getUiList() {
        return this.uiList;
    }

    public final void setHasVideos(boolean z) {
        this.hasVideos = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.netflix.mediaclient.ui.offline.CachingSelectableController
    public /* bridge */ /* synthetic */ void buildModels(Object obj, boolean z, Map map) {
        buildModels((DownloadedEpisodesController<T>) ((C7186crU) obj), z, (Map<Long, AbstractC3073as<?>>) map);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ DownloadedEpisodesController(java.lang.String r7, com.netflix.mediaclient.ui.offline.OfflineFragmentV2.b r8, o.InterfaceC7281ctJ r9, com.netflix.mediaclient.ui.offline.CachingSelectableController.e r10, java.lang.String r11, int r12, o.C8627dsp r13) {
        /*
            r6 = this;
            r12 = r12 & 4
            if (r12 == 0) goto Ld
            o.ctJ r9 = o.C7353cuc.a()
            java.lang.String r12 = ""
            o.C8632dsu.a(r9, r12)
        Ld:
            r3 = r9
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.offline.DownloadedEpisodesController.<init>(java.lang.String, com.netflix.mediaclient.ui.offline.OfflineFragmentV2$b, o.ctJ, com.netflix.mediaclient.ui.offline.CachingSelectableController$e, java.lang.String, int, o.dsp):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DownloadedEpisodesController(java.lang.String r3, com.netflix.mediaclient.ui.offline.OfflineFragmentV2.b r4, o.InterfaceC7281ctJ r5, com.netflix.mediaclient.ui.offline.CachingSelectableController.e r6, java.lang.String r7) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r3, r0)
            o.C8632dsu.c(r4, r0)
            o.C8632dsu.c(r5, r0)
            o.C8632dsu.c(r6, r0)
            o.C8632dsu.c(r7, r0)
            android.os.Handler r1 = o.AbstractC2914ap.defaultModelBuildingHandler
            o.C8632dsu.a(r1, r0)
            java.lang.Class<o.bwu> r0 = o.C5342bwu.class
            java.lang.Object r0 = o.C1332Xp.b(r0)
            o.bwu r0 = (o.C5342bwu) r0
            android.os.Handler r0 = r0.c()
            r2.<init>(r1, r0, r6)
            r2.profileGuid = r3
            r2.screenLauncher = r4
            r2.uiList = r5
            r2.selectionChangesListener = r6
            r2.titleId = r7
            o.ys r3 = new o.ys
            r3.<init>()
            r2.footerItemDecorator = r3
            o.cst r3 = new o.cst
            r3.<init>()
            r2.idConverterModel = r3
            o.cKg r3 = new o.cKg
            r3.<init>()
            r2.presentationTracking = r3
            o.csd r3 = new o.csd
            r3.<init>()
            r2.findMoreEpisodesClickListener = r3
            o.csj r3 = new o.csj
            r3.<init>()
            r2.videoClickListener = r3
            o.csh r3 = new o.csh
            r3.<init>()
            r2.videoLongClickListener = r3
            r3 = 0
            r2.setDebugLoggingEnabled(r3)
            r3 = 1
            r2.setCachingEnabled$netflix_modules_ui_offline_impl_release(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.offline.DownloadedEpisodesController.<init>(java.lang.String, com.netflix.mediaclient.ui.offline.OfflineFragmentV2$b, o.ctJ, com.netflix.mediaclient.ui.offline.CachingSelectableController$e, java.lang.String):void");
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("DownloadedEpisodesController");
        }

        public static /* synthetic */ DownloadedEpisodesController b(a aVar, String str, OfflineFragmentV2.b bVar, InterfaceC7281ctJ interfaceC7281ctJ, CachingSelectableController.e eVar, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                interfaceC7281ctJ = C7353cuc.a();
                C8632dsu.a(interfaceC7281ctJ, "");
            }
            return aVar.a(str, bVar, interfaceC7281ctJ, eVar, str2);
        }

        public final DownloadedEpisodesController<C7186crU> a(String str, OfflineFragmentV2.b bVar, InterfaceC7281ctJ interfaceC7281ctJ, CachingSelectableController.e eVar, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bVar, "");
            C8632dsu.c((Object) interfaceC7281ctJ, "");
            C8632dsu.c((Object) eVar, "");
            C8632dsu.c((Object) str2, "");
            return new DownloadedEpisodesController<>(str, bVar, interfaceC7281ctJ, eVar, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void findMoreEpisodesClickListener$lambda$0(DownloadedEpisodesController downloadedEpisodesController, View view) {
        C8632dsu.c((Object) downloadedEpisodesController, "");
        OfflineFragmentV2.b bVar = downloadedEpisodesController.screenLauncher;
        VideoType videoType = VideoType.SHOW;
        String str = downloadedEpisodesController.titleId;
        PlayContext c2 = PlayContextImp.c();
        C8632dsu.a(c2, "");
        bVar.a(videoType, str, "", c2, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void videoClickListener$lambda$1(DownloadedEpisodesController downloadedEpisodesController, C7264cst c7264cst, AbstractC7260csp.c cVar, View view, int i) {
        C8632dsu.c((Object) downloadedEpisodesController, "");
        if (c7264cst.H()) {
            C8632dsu.d(c7264cst);
            downloadedEpisodesController.toggleSelectedState(c7264cst);
            return;
        }
        C7372cuv.a.c(view.getContext(), c7264cst.F(), new c(downloadedEpisodesController, c7264cst));
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC7365cuo {
        final /* synthetic */ C7264cst c;
        final /* synthetic */ DownloadedEpisodesController<T> e;

        c(DownloadedEpisodesController<T> downloadedEpisodesController, C7264cst c7264cst) {
            this.e = downloadedEpisodesController;
            this.c = c7264cst;
        }

        @Override // o.InterfaceC7365cuo
        public void b() {
            OfflineFragmentV2.b bVar = ((DownloadedEpisodesController) this.e).screenLauncher;
            String F = this.c.F();
            C8632dsu.a(F, "");
            VideoType M = this.c.M();
            C8632dsu.a(M, "");
            TrackingInfoHolder E = this.c.E();
            C8632dsu.a(E, "");
            bVar.c(F, M, TrackingInfoHolder.b(E, PlayLocationType.DOWNLOADS, false, 2, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean videoLongClickListener$lambda$2(DownloadedEpisodesController downloadedEpisodesController, C7264cst c7264cst, AbstractC7260csp.c cVar, View view, int i) {
        C8632dsu.c((Object) downloadedEpisodesController, "");
        C8632dsu.d(c7264cst);
        downloadedEpisodesController.toggleSelectedState(c7264cst);
        if (!c7264cst.K()) {
            downloadedEpisodesController.selectionChangesListener.c(true);
        }
        return true;
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
    }

    public void buildModels(T t, boolean z, Map<Long, AbstractC3073as<?>> map) {
        C7460cwd[] b;
        String str;
        InterfaceC5206buQ c2;
        int i;
        Map<Long, AbstractC3073as<?>> map2 = map;
        String str2 = "";
        C8632dsu.c((Object) t, "");
        OfflineAdapterData d = t.d();
        if (d != null && d.a().b != OfflineAdapterData.ViewType.SHOW) {
            throw new IllegalArgumentException("data type must be a SHOW");
        }
        C7264cst c7264cst = new C7264cst();
        boolean z2 = false;
        if (d != null && (b = d.b()) != null) {
            int length = b.length;
            int i2 = Integer.MIN_VALUE;
            int i3 = 0;
            while (i3 < length) {
                C7460cwd c7460cwd = b[i3];
                if (c7460cwd.getType() != VideoType.EPISODE || (c2 = this.uiList.c(c7460cwd.aE_().aH_())) == null) {
                    str = str2;
                } else {
                    int x = c7460cwd.aE_().x();
                    if (x != i2) {
                        String a2 = d.a().a.a(x);
                        if (a2 != null) {
                            add(new C7329cuE().a((CharSequence) ("season:" + a2)).e((CharSequence) a2));
                        }
                        i = x;
                    } else {
                        i = i2;
                    }
                    String aH_ = c7460cwd.aE_().aH_();
                    if (aH_ != null) {
                        C8632dsu.d((Object) aH_);
                        String idString = getIdString(aH_);
                        Integer num = null;
                        AbstractC3073as<?> remove = map2 != null ? map2.remove(Long.valueOf(c7264cst.a((CharSequence) idString).b())) : null;
                        if (remove != null) {
                            add(remove);
                            str = str2;
                        } else {
                            InterfaceC5160btX aE_ = c7460cwd.aE_();
                            C8632dsu.a(aE_, str2);
                            C5096bsM a3 = C7353cuc.a(this.profileGuid, aH_);
                            if (a3 != null) {
                                str = str2;
                                num = Integer.valueOf(C8004dcG.e.a(a3.c, aE_.g(), aE_.ay_()));
                            } else {
                                str = str2;
                            }
                            C8632dsu.d(c2);
                            C8632dsu.d(c7460cwd);
                            addVideoModel(idString, c2, c7460cwd, num, this.presentationTracking);
                        }
                        z2 = true;
                    } else {
                        str = str2;
                    }
                    i2 = i;
                }
                i3++;
                str2 = str;
                map2 = map;
            }
        }
        addOtherItems(z2);
        this.hasVideos = z2;
    }

    private final String getIdString(String str) {
        String str2 = this.profileGuid;
        return str2 + ":" + str;
    }

    private final void addVideoModel(String str, InterfaceC5206buQ interfaceC5206buQ, C7460cwd c7460cwd, Integer num, C5839cKg c5839cKg) {
        C7230csL.a(c7460cwd);
        add(AbstractC7260csp.b.e(str, interfaceC5206buQ, c7460cwd, num, c5839cKg).d(this.videoClickListener).b(this.videoLongClickListener));
    }

    public final void progressUpdated(String str) {
        C8632dsu.c((Object) str, "");
        invalidateCacheForModel(this.idConverterModel.a((CharSequence) getIdString(str)).b());
        requestModelBuild();
    }

    private final void addOtherItems(boolean z) {
        this.footerItemDecorator.d(false);
        if (!z) {
            C7237csS e = new C7237csS().e((CharSequence) "empty").c(R.e.R).e(R.o.iN);
            if (okayToAddMoreEpisodesButton()) {
                e.d(R.o.hQ);
                e.c(this.findMoreEpisodesClickListener);
            }
            add(e);
            return;
        }
        addFindMoreButtonToModel();
    }

    private final boolean okayToAddMoreEpisodesButton() {
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        if (k != null) {
            if (!C8632dsu.c((Object) k.g(), (Object) this.profileGuid)) {
                InterfaceC5283bvo b = k.b(this.profileGuid);
                if (C8168dfL.g(b != null ? b.getProfileLockPin() : null)) {
                }
            }
            return true;
        }
        return false;
    }

    private final void addFindMoreButtonToModel() {
        if (okayToAddMoreEpisodesButton()) {
            add(new C7301ctd().d((CharSequence) "findMore").c((CharSequence) C8168dfL.d(R.o.hQ)).a(this.findMoreEpisodesClickListener));
            this.footerItemDecorator.d(true);
        }
    }
}
