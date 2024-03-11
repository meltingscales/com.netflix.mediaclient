package com.netflix.mediaclient.android.sharing.impl.targets;

import com.netflix.mediaclient.android.sharing.impl.targets.SnapchatVideoDetails$prefetchResourcesForShareable$1;
import com.netflix.mediaclient.api.res.AssetType;
import com.netflix.model.leafs.VideoInfo;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Lambda;
import o.C1332Xp;
import o.C8632dsu;
import o.InterfaceC4942bpR;
import o.QJ;
import o.dpR;
import o.drM;

/* loaded from: classes3.dex */
public final class SnapchatVideoDetails$prefetchResourcesForShareable$1 extends Lambda implements drM<VideoInfo.Sharing, dpR> {
    final /* synthetic */ drM<Throwable, dpR> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapchatVideoDetails$prefetchResourcesForShareable$1(drM<? super Throwable, dpR> drm) {
        super(1);
        this.b = drm;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(VideoInfo.Sharing sharing) {
        b(sharing);
        return dpR.c;
    }

    public final void b(VideoInfo.Sharing sharing) {
        Object b = C1332Xp.b(InterfaceC4942bpR.class);
        final drM<Throwable, dpR> drm = this.b;
        InterfaceC4942bpR interfaceC4942bpR = (InterfaceC4942bpR) b;
        if (sharing.getVerticalBillboardUrl() != null && sharing.getTitleLogoUrl() != null) {
            interfaceC4942bpR.a(sharing.getVerticalBillboardUrl(), AssetType.verticalBillboard).subscribe(new Action() { // from class: o.QV
                @Override // io.reactivex.functions.Action
                public final void run() {
                    SnapchatVideoDetails$prefetchResourcesForShareable$1.c();
                }
            }, new Consumer() { // from class: o.QZ
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SnapchatVideoDetails$prefetchResourcesForShareable$1.c(drM.this, obj);
                }
            });
        } else {
            interfaceC4942bpR.a(sharing.getBoxArtUrl(), AssetType.boxArt).subscribe(new Action() { // from class: o.QX
                @Override // io.reactivex.functions.Action
                public final void run() {
                    SnapchatVideoDetails$prefetchResourcesForShareable$1.d();
                }
            }, new Consumer() { // from class: o.Rb
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SnapchatVideoDetails$prefetchResourcesForShareable$1.e(drM.this, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c() {
        QJ.a.getLogTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d() {
        QJ.a.getLogTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }
}
