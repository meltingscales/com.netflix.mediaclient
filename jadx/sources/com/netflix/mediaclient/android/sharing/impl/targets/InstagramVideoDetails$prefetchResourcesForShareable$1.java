package com.netflix.mediaclient.android.sharing.impl.targets;

import com.netflix.mediaclient.android.sharing.impl.targets.InstagramVideoDetails$prefetchResourcesForShareable$1;
import com.netflix.mediaclient.api.res.AssetType;
import com.netflix.model.leafs.VideoInfo;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Lambda;
import o.AbstractC1153Qs;
import o.C1332Xp;
import o.C8632dsu;
import o.InterfaceC4942bpR;
import o.dpR;
import o.drM;

/* loaded from: classes3.dex */
public final class InstagramVideoDetails$prefetchResourcesForShareable$1 extends Lambda implements drM<VideoInfo.Sharing, dpR> {
    final /* synthetic */ drM<Throwable, dpR> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstagramVideoDetails$prefetchResourcesForShareable$1(drM<? super Throwable, dpR> drm) {
        super(1);
        this.c = drm;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(VideoInfo.Sharing sharing) {
        d(sharing);
        return dpR.c;
    }

    public final void d(VideoInfo.Sharing sharing) {
        Object b = C1332Xp.b(InterfaceC4942bpR.class);
        final drM<Throwable, dpR> drm = this.c;
        InterfaceC4942bpR interfaceC4942bpR = (InterfaceC4942bpR) b;
        if (sharing.getVerticalBillboardUrl() != null && sharing.getTitleLogoUrl() != null) {
            interfaceC4942bpR.a(sharing.getVerticalBillboardUrl(), AssetType.verticalBillboard).subscribe(new Action() { // from class: o.QA
                @Override // io.reactivex.functions.Action
                public final void run() {
                    InstagramVideoDetails$prefetchResourcesForShareable$1.c();
                }
            }, new Consumer() { // from class: o.QC
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    InstagramVideoDetails$prefetchResourcesForShareable$1.c(drM.this, obj);
                }
            });
            interfaceC4942bpR.a(sharing.getTitleLogoUrl(), AssetType.titleLogo).subscribe(new Action() { // from class: o.QD
                @Override // io.reactivex.functions.Action
                public final void run() {
                    InstagramVideoDetails$prefetchResourcesForShareable$1.b();
                }
            }, new Consumer() { // from class: o.QE
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    InstagramVideoDetails$prefetchResourcesForShareable$1.b(drM.this, obj);
                }
            });
            return;
        }
        interfaceC4942bpR.a(sharing.getBoxArtUrl(), AssetType.boxArt).subscribe(new Action() { // from class: o.QF
            @Override // io.reactivex.functions.Action
            public final void run() {
                InstagramVideoDetails$prefetchResourcesForShareable$1.f();
            }
        }, new Consumer() { // from class: o.QG
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                InstagramVideoDetails$prefetchResourcesForShareable$1.j(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c() {
        AbstractC1153Qs.b.getLogTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
        AbstractC1153Qs.b.getLogTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f() {
        AbstractC1153Qs.b.getLogTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }
}
