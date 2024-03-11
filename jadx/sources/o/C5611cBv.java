package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.util.PlayContext;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC7303ctf;
import org.chromium.net.NetError;

/* renamed from: o.cBv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5611cBv implements InterfaceC5604cBo {
    public static final e a = new e(null);
    private final aLP d;

    /* renamed from: o.cBv$d */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[VideoType.values().length];
            try {
                iArr[VideoType.SUPPLEMENTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoType.MOVIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoType.SHOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoType.EPISODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* renamed from: o.cBv$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("PlayerRepositoryImpl");
        }
    }

    public C5611cBv(aLP alp) {
        C8632dsu.c((Object) alp, "");
        this.d = alp;
    }

    @Override // o.InterfaceC5604cBo
    public Single<C5593cBd> c(String str, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras, TaskMode taskMode, String str2, boolean z) {
        long j;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) playContext, "");
        C8632dsu.c((Object) taskMode, "");
        long e2 = playerExtras != null ? playerExtras.e() : -1L;
        if (e(str)) {
            if (e2 != -1) {
                j = e2;
            } else {
                InterfaceC7303ctf.a aVar = InterfaceC7303ctf.c;
                Context d2 = AbstractApplicationC1040Mh.d();
                C8632dsu.a(d2, "");
                C5096bsM b = aVar.a(d2).b(str2, str);
                j = b != null ? b.c : -1L;
            }
            return e(str, playContext, j);
        }
        return b(str, videoType, playContext, e2, playerExtras, taskMode, z);
    }

    @Override // o.InterfaceC5604cBo
    public Single<C5593cBd> a(String str, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras, TaskMode taskMode) {
        Throwable th;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) playContext, "");
        C8632dsu.c((Object) taskMode, "");
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        C1596aHd c1596aHd = new C1596aHd("PlayerRepositoryImpl requestNextEpisode shouldn't be called in Falcor", null, null, false, null, false, false, 126, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b = c1596aHd.b();
            if (b != null) {
                String c = errorType.c();
                c1596aHd.a(c + " " + b);
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
        } else {
            dVar.e().b(c1596aHd, th);
        }
        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ad;
        C8632dsu.a(netflixImmutableStatus, "");
        Single<C5593cBd> just = Single.just(new C5593cBd(null, netflixImmutableStatus, null, new EmptyPlayContext(a.getLogTag(), NetError.ERR_CONTENT_DECODING_FAILED), 0L, null, null, 117, null));
        C8632dsu.a(just, "");
        return just;
    }

    private final boolean e(String str) {
        InterfaceC7303ctf.a aVar = InterfaceC7303ctf.c;
        Context d2 = AbstractApplicationC1040Mh.d();
        C8632dsu.a(d2, "");
        return aVar.a(d2).c(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f8  */
    @android.annotation.SuppressLint({"CheckResult"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.reactivex.Single<o.C5593cBd> b(final java.lang.String r25, final com.netflix.mediaclient.servicemgr.interface_.VideoType r26, final com.netflix.mediaclient.util.PlayContext r27, final long r28, final com.netflix.mediaclient.ui.player.PlayerExtras r30, final com.netflix.mediaclient.browse.api.task.TaskMode r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5611cBv.b(java.lang.String, com.netflix.mediaclient.servicemgr.interface_.VideoType, com.netflix.mediaclient.util.PlayContext, long, com.netflix.mediaclient.ui.player.PlayerExtras, com.netflix.mediaclient.browse.api.task.TaskMode, boolean):io.reactivex.Single");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    private final Single<C5593cBd> e(String str, PlayContext playContext, long j) {
        InterfaceC7303ctf.a aVar = InterfaceC7303ctf.c;
        Context d2 = AbstractApplicationC1040Mh.d();
        C8632dsu.a(d2, "");
        C7460cwd e2 = aVar.a(d2).e(str);
        NetflixImmutableStatus netflixImmutableStatus = e2 != null ? InterfaceC1078Nw.aJ : InterfaceC1078Nw.am;
        C8632dsu.d(netflixImmutableStatus);
        Single<C5593cBd> just = Single.just(new C5593cBd(e2, netflixImmutableStatus, IPlayer.PlaybackType.OfflinePlayback, playContext, j, null, null, 96, null));
        C8632dsu.a(just, "");
        return just;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r19.j() == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.reactivex.Single<o.C5593cBd> b(final o.InterfaceC5198buI r14, final com.netflix.mediaclient.android.app.Status r15, final com.netflix.mediaclient.util.PlayContext r16, long r17, com.netflix.mediaclient.ui.player.PlayerExtras r19) {
        /*
            r13 = this;
            r1 = r14
            r2 = r15
            r4 = r16
            r5 = r17
            java.lang.String r11 = ""
            o.C8632dsu.c(r15, r11)
            o.C8632dsu.c(r4, r11)
            if (r1 != 0) goto L2a
            o.cBd r12 = new o.cBd
            r3 = 0
            r7 = 0
            r8 = 0
            r9 = 100
            r10 = 0
            r0 = r12
            r1 = r14
            r2 = r15
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            io.reactivex.Single r0 = io.reactivex.Single.just(r12)
            o.C8632dsu.a(r0, r11)
            return r0
        L2a:
            o.cFz r0 = new o.cFz
            r0.<init>()
            if (r19 == 0) goto L39
            boolean r3 = r19.j()
            r7 = 1
            if (r3 != r7) goto L39
            goto L3a
        L39:
            r7 = 0
        L3a:
            io.reactivex.Single r0 = r0.c(r14, r5, r7)
            o.cFr r3 = r13.d()
            io.reactivex.Single r3 = r3.b(r14, r5)
            io.reactivex.Single r0 = io.reactivex.rxkotlin.SinglesKt.zipWith(r0, r3)
            o.cBw r3 = new o.cBw
            com.netflix.mediaclient.ui.player.v2.PlayerRepositoryImpl$handleResponse$1 r5 = new com.netflix.mediaclient.ui.player.v2.PlayerRepositoryImpl$handleResponse$1
            r5.<init>()
            r3.<init>()
            io.reactivex.Single r0 = r0.map(r3)
            o.C8632dsu.a(r0, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5611cBv.b(o.buI, com.netflix.mediaclient.android.app.Status, com.netflix.mediaclient.util.PlayContext, long, com.netflix.mediaclient.ui.player.PlayerExtras):io.reactivex.Single");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5593cBd e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (C5593cBd) drm.invoke(obj);
    }

    public InterfaceC5715cFr d() {
        return new C5713cFp(this.d);
    }
}
