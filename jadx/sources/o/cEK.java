package o;

import android.annotation.SuppressLint;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl;
import com.netflix.mediaclient.ui.player.v2.interactive.Interactivity;
import com.netflix.mediaclient.ui.player.v2.presenter.interactive.PlayerInteractiveDebugPresenter$1;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C8632dsu;
import o.InterfaceC5710cFm;
import o.cBA;
import o.cEW;
import o.dpR;

@SuppressLint({"CheckResult"})
/* loaded from: classes4.dex */
public final class cEK extends cDE implements cEW, InterfaceC5710cFm {
    private IPlaylistControl a;
    private Interactivity b;
    private boolean c;
    private String d;

    @Override // o.cEW
    public void a(Interactivity interactivity) {
        this.b = interactivity;
    }

    @Override // o.InterfaceC5710cFm
    public void b(String str) {
        this.d = str;
    }

    @Override // o.InterfaceC5710cFm
    public String c() {
        return this.d;
    }

    @Override // o.InterfaceC5710cFm
    public void c(Observable<cBA> observable) {
        InterfaceC5710cFm.e.c(this, observable);
    }

    @Override // o.cEW
    public void e(Observable<cBA> observable) {
        cEW.d.a(this, observable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cEK(final InterfaceC5619cCc interfaceC5619cCc, Observable<cBA> observable) {
        super(observable, new InterfaceC5730cGf[]{interfaceC5619cCc}, null, 4, null);
        C8632dsu.c((Object) interfaceC5619cCc, "");
        C8632dsu.c((Object) observable, "");
        final PlayerInteractiveDebugPresenter$1 playerInteractiveDebugPresenter$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.interactive.PlayerInteractiveDebugPresenter$1
            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(cBA cba) {
                C8632dsu.c((Object) cba, "");
                return Boolean.valueOf((cba instanceof cBA.au) || (cba instanceof cBA.C5553o) || (cba instanceof cBA.ai) || (cba instanceof cBA.C5542d));
            }
        };
        Observable<cBA> filter = observable.filter(new Predicate() { // from class: o.cEP
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean e;
                e = cEK.e(drM.this, obj);
                return e;
            }
        });
        C8632dsu.a(filter, "");
        SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.interactive.PlayerInteractiveDebugPresenter$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                d(cba);
                return dpR.c;
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
                if (r1.isInDebug() == true) goto L22;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void d(o.cBA r4) {
                /*
                    r3 = this;
                    boolean r0 = r4 instanceof o.cBA.au
                    if (r0 == 0) goto L14
                    o.cBA$au r4 = (o.cBA.au) r4
                    o.aJY r4 = r4.b()
                    boolean r0 = r4 instanceof com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
                    if (r0 == 0) goto L6f
                    o.cEK r0 = o.cEK.this
                    o.cEK.d(r0, r4)
                    goto L6f
                L14:
                    boolean r0 = r4 instanceof o.cBA.C5553o
                    if (r0 == 0) goto L38
                    o.cEK r0 = o.cEK.this
                    boolean r0 = o.cEK.b(r0)
                    if (r0 == 0) goto L6f
                    o.cCc r0 = r2
                    r0.a()
                    o.cCc r0 = r2
                    o.cBA$o r4 = (o.cBA.C5553o) r4
                    com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp r4 = r4.d()
                    java.lang.String r4 = r4.a
                    java.lang.String r1 = ""
                    o.C8632dsu.a(r4, r1)
                    r0.b(r4)
                    goto L6f
                L38:
                    boolean r0 = r4 instanceof o.cBA.C5542d
                    if (r0 == 0) goto L6f
                    o.cEK r0 = o.cEK.this
                    o.cBA$d r4 = (o.cBA.C5542d) r4
                    o.cxz r1 = r4.e()
                    o.buI r1 = r1.g()
                    com.netflix.model.leafs.originals.interactive.InteractiveSummary r1 = r1.az_()
                    if (r1 == 0) goto L56
                    boolean r1 = r1.isInDebug()
                    r2 = 1
                    if (r1 != r2) goto L56
                    goto L57
                L56:
                    r2 = 0
                L57:
                    o.cEK.c(r0, r2)
                    o.cEK r0 = o.cEK.this
                    boolean r0 = o.cEK.b(r0)
                    if (r0 == 0) goto L6f
                    o.cCc r0 = r2
                    o.cxz r4 = r4.e()
                    java.lang.String r4 = r4.m()
                    r0.e(r4)
                L6f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.player.v2.presenter.interactive.PlayerInteractiveDebugPresenter$2.d(o.cBA):void");
            }
        }, 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }
}
