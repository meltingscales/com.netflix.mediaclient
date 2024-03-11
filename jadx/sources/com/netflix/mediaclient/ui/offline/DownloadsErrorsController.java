package com.netflix.mediaclient.ui.offline;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;
import com.netflix.mediaclient.ui.offline.CachingSelectableController;
import com.netflix.mediaclient.ui.offline.OfflineAdapterData;
import java.util.Map;
import o.AbstractC3073as;
import o.AbstractC7258csn;
import o.AbstractC7402cvY;
import o.C1045Mp;
import o.C7264cst;
import o.C7266csv;
import o.C7353cuc;
import o.C7457cwa;
import o.C7460cwd;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC4208baF;
import o.InterfaceC4308bc;
import o.InterfaceC4361bd;
import o.InterfaceC5206buQ;
import o.InterfaceC5283bvo;
import o.InterfaceC7281ctJ;

/* loaded from: classes6.dex */
public class DownloadsErrorsController<T extends C7266csv> extends CachingSelectableController<T, AbstractC7258csn<?>> {
    private RecyclerView attachedRecyclerView;
    private final InterfaceC5283bvo currentProfile;
    private final InterfaceC4308bc<C7457cwa, AbstractC7402cvY.a> deleteClickListener;
    private boolean hasVideos;
    private final InterfaceC4308bc<C7457cwa, AbstractC7402cvY.a> renewClickListener;
    private final InterfaceC7281ctJ uiList;
    private final InterfaceC4308bc<C7457cwa, AbstractC7402cvY.a> videoClickListener;
    private final InterfaceC4361bd<C7457cwa, AbstractC7402cvY.a> videoLongClickListener;
    public static final c Companion = new c(null);
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] b;

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
            b = iArr;
        }
    }

    private final boolean shouldShow(DownloadState downloadState, WatchState watchState) {
        return true;
    }

    public final RecyclerView getAttachedRecyclerView() {
        return this.attachedRecyclerView;
    }

    public final InterfaceC5283bvo getCurrentProfile() {
        return this.currentProfile;
    }

    public final boolean getHasVideos() {
        return this.hasVideos;
    }

    public final InterfaceC7281ctJ getUiList() {
        return this.uiList;
    }

    public final void setAttachedRecyclerView(RecyclerView recyclerView) {
        this.attachedRecyclerView = recyclerView;
    }

    public final void setHasVideos(boolean z) {
        this.hasVideos = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.netflix.mediaclient.ui.offline.CachingSelectableController
    public /* bridge */ /* synthetic */ void buildModels(Object obj, boolean z, Map map) {
        buildModels((DownloadsErrorsController<T>) ((C7266csv) obj), z, (Map<Long, AbstractC3073as<?>>) map);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ DownloadsErrorsController(o.InterfaceC5283bvo r1, o.InterfaceC7281ctJ r2, com.netflix.mediaclient.ui.offline.CachingSelectableController.e r3, int r4, o.C8627dsp r5) {
        /*
            r0 = this;
            r4 = r4 & 2
            if (r4 == 0) goto Ld
            o.ctJ r2 = o.C7353cuc.a()
            java.lang.String r4 = ""
            o.C8632dsu.a(r2, r4)
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.offline.DownloadsErrorsController.<init>(o.bvo, o.ctJ, com.netflix.mediaclient.ui.offline.CachingSelectableController$e, int, o.dsp):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DownloadsErrorsController(o.InterfaceC5283bvo r3, o.InterfaceC7281ctJ r4, final com.netflix.mediaclient.ui.offline.CachingSelectableController.e r5) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r3, r0)
            o.C8632dsu.c(r4, r0)
            o.C8632dsu.c(r5, r0)
            android.os.Handler r1 = o.AbstractC2914ap.defaultModelBuildingHandler
            o.C8632dsu.a(r1, r0)
            java.lang.Class<o.bwu> r0 = o.C5342bwu.class
            java.lang.Object r0 = o.C1332Xp.b(r0)
            o.bwu r0 = (o.C5342bwu) r0
            android.os.Handler r0 = r0.c()
            r2.<init>(r1, r0, r5)
            r2.currentProfile = r3
            r2.uiList = r4
            o.csy r3 = new o.csy
            r3.<init>()
            r2.renewClickListener = r3
            o.csw r3 = new o.csw
            r3.<init>()
            r2.deleteClickListener = r3
            o.csx r3 = new o.csx
            r3.<init>()
            r2.videoClickListener = r3
            o.csB r3 = new o.csB
            r3.<init>()
            r2.videoLongClickListener = r3
            r3 = 0
            r2.setDebugLoggingEnabled(r3)
            r3 = 1
            r2.setCachingEnabled$netflix_modules_ui_offline_impl_release(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.offline.DownloadsErrorsController.<init>(o.bvo, o.ctJ, com.netflix.mediaclient.ui.offline.CachingSelectableController$e):void");
    }

    /* loaded from: classes6.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("DownloadsErrorsController");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renewClickListener$lambda$1(DownloadsErrorsController downloadsErrorsController, C7457cwa c7457cwa, AbstractC7402cvY.a aVar, View view, int i) {
        C8632dsu.c((Object) downloadsErrorsController, "");
        if (c7457cwa.F()) {
            C8632dsu.d(c7457cwa);
            downloadsErrorsController.toggleSelectedState(c7457cwa);
            return;
        }
        Companion.getLogTag();
        InterfaceC4208baF c2 = C7353cuc.c();
        if (c2 != null) {
            c2.c(c7457cwa.B());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deleteClickListener$lambda$3(DownloadsErrorsController downloadsErrorsController, C7457cwa c7457cwa, AbstractC7402cvY.a aVar, View view, int i) {
        C8632dsu.c((Object) downloadsErrorsController, "");
        if (c7457cwa.F()) {
            C8632dsu.d(c7457cwa);
            downloadsErrorsController.toggleSelectedState(c7457cwa);
            return;
        }
        Companion.getLogTag();
        InterfaceC4208baF c2 = C7353cuc.c();
        if (c2 != null) {
            c2.d(c7457cwa.B());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void videoClickListener$lambda$4(DownloadsErrorsController downloadsErrorsController, C7457cwa c7457cwa, AbstractC7402cvY.a aVar, View view, int i) {
        C8632dsu.c((Object) downloadsErrorsController, "");
        if (c7457cwa.F()) {
            C8632dsu.d(c7457cwa);
            downloadsErrorsController.toggleSelectedState(c7457cwa);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean videoLongClickListener$lambda$5(DownloadsErrorsController downloadsErrorsController, CachingSelectableController.e eVar, C7457cwa c7457cwa, AbstractC7402cvY.a aVar, View view, int i) {
        C8632dsu.c((Object) downloadsErrorsController, "");
        C8632dsu.c((Object) eVar, "");
        C8632dsu.d(c7457cwa);
        downloadsErrorsController.toggleSelectedState(c7457cwa);
        if (!c7457cwa.K()) {
            eVar.c(true);
        }
        return true;
    }

    @Override // o.AbstractC2914ap
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C8632dsu.c((Object) recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.attachedRecyclerView = recyclerView;
    }

    protected String getIdStringForVideo(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        return str + ":" + str2;
    }

    public void buildModels(T t, boolean z, Map<Long, AbstractC3073as<?>> map) {
        C8632dsu.c((Object) t, "");
        C7264cst c7264cst = new C7264cst();
        for (OfflineAdapterData offlineAdapterData : t.a()) {
            C7460cwd c7460cwd = offlineAdapterData.a().a;
            if (c7460cwd != null) {
                C8632dsu.d(c7460cwd);
                OfflineAdapterData.ViewType viewType = offlineAdapterData.a().b;
                int i = viewType == null ? -1 : a.b[viewType.ordinal()];
                if (i == 1) {
                    C7460cwd[] b = offlineAdapterData.b();
                    C8632dsu.a(b, "");
                    for (C7460cwd c7460cwd2 : b) {
                        if (c7460cwd2.getType() == VideoType.EPISODE) {
                            String str = offlineAdapterData.a().c;
                            C8632dsu.a(str, "");
                            C8632dsu.d(c7460cwd2);
                            addVideoModel(map, c7264cst, str, c7460cwd2);
                        }
                    }
                } else if (i == 2) {
                    String str2 = offlineAdapterData.a().c;
                    C8632dsu.a(str2, "");
                    addVideoModel(map, c7264cst, str2, c7460cwd);
                }
            }
        }
    }

    private final void addVideoModel(Map<Long, AbstractC3073as<?>> map, C7264cst c7264cst, String str, C7460cwd c7460cwd) {
        String aH_;
        InterfaceC5206buQ c2 = this.uiList.c(c7460cwd.aH_());
        if (c2 == null || (aH_ = c7460cwd.aE_().aH_()) == null) {
            return;
        }
        DownloadState au_ = c7460cwd.au_();
        C8632dsu.a(au_, "");
        WatchState C = c2.C();
        C8632dsu.a(C, "");
        if (shouldShow(au_, C)) {
            String idStringForVideo = getIdStringForVideo(str, aH_);
            AbstractC3073as<?> remove = map != null ? map.remove(Long.valueOf(c7264cst.a((CharSequence) idStringForVideo).b())) : null;
            if (remove != null) {
                add(remove);
            } else {
                add(AbstractC7402cvY.c.c(idStringForVideo, c2, c7460cwd).b(this.renewClickListener).d(this.deleteClickListener).c(this.videoClickListener).a(this.videoLongClickListener));
            }
            this.hasVideos = true;
        }
    }

    public final void progressUpdated(String str, InterfaceC5206buQ interfaceC5206buQ) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC5206buQ, "");
        String aH_ = interfaceC5206buQ.aH_();
        C8632dsu.a(aH_, "");
        invalidateCacheForModel(new C7264cst().a((CharSequence) getIdStringForVideo(str, aH_)).b());
        requestModelBuild();
    }
}
