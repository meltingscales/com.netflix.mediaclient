package o;

import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.util.PlayContext;
import com.netflix.model.leafs.PrePlayExperience;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.List;
import o.C5713cFp;
import o.C7535cxz;
import o.C8632dsu;
import o.InterfaceC1078Nw;
import o.InterfaceC8366diy;

/* renamed from: o.cFp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5713cFp implements InterfaceC5715cFr {
    private static final d a;
    public static final a e = new a(null);
    private final aLP d;

    /* JADX INFO: Access modifiers changed from: private */
    public static final d a(Throwable th) {
        C8632dsu.c((Object) th, "");
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d b(Throwable th) {
        C8632dsu.c((Object) th, "");
        return a;
    }

    /* renamed from: o.cFp$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("PreplayRepository");
        }

        public final d c() {
            return C5713cFp.a;
        }
    }

    public C5713cFp(aLP alp) {
        C8632dsu.c((Object) alp, "");
        this.d = alp;
    }

    static {
        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ad;
        C8632dsu.a(netflixImmutableStatus, "");
        a = new d(null, netflixImmutableStatus, 1, null);
    }

    /* renamed from: o.cFp$d */
    /* loaded from: classes4.dex */
    public static final class d {
        private final C7535cxz b;
        private final Status d;

        public final C7535cxz b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.b, dVar.b) && C8632dsu.c(this.d, dVar.d);
            }
            return false;
        }

        public int hashCode() {
            C7535cxz c7535cxz = this.b;
            return ((c7535cxz == null ? 0 : c7535cxz.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            C7535cxz c7535cxz = this.b;
            Status status = this.d;
            return "Response(prePlayPlaybackWrapper=" + c7535cxz + ", status=" + status + ")";
        }

        public d(C7535cxz c7535cxz, Status status) {
            C8632dsu.c((Object) status, "");
            this.b = c7535cxz;
            this.d = status;
        }

        public /* synthetic */ d(C7535cxz c7535cxz, Status status, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? null : c7535cxz, status);
        }
    }

    @Override // o.InterfaceC5715cFr
    public Single<d> b(InterfaceC5198buI interfaceC5198buI, long j) {
        C8632dsu.c((Object) interfaceC5198buI, "");
        String aH_ = interfaceC5198buI.aE_().aH_();
        if (aH_ == null || !a(interfaceC5198buI, j)) {
            Single<d> just = Single.just(a);
            C8632dsu.a(just, "");
            return just;
        }
        e.getLogTag();
        return d(aH_);
    }

    public Single<d> d(String str) {
        List j;
        C8632dsu.c((Object) str, "");
        aLP alp = this.d;
        j = C8569dql.j(IE.b("prePlayExperience"), IE.b("prePlayVideo", IE.c("summary", "detail", "timeCodes", "advisories")));
        Single singleOrError = alp.e(new C0969Jo(str, j, TaskMode.FROM_NETWORK, false, null, "PreplayRepo", 24, null)).singleOrError();
        final drM<InterfaceC8366diy, SingleSource<? extends d>> drm = new drM<InterfaceC8366diy, SingleSource<? extends d>>() { // from class: com.netflix.mediaclient.ui.player.v2.repository.PreplayRepositoryImpl$fetchPrePlayExperienceData$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final SingleSource<? extends C5713cFp.d> invoke(InterfaceC8366diy interfaceC8366diy) {
                C8632dsu.c((Object) interfaceC8366diy, "");
                PrePlayExperience aG = interfaceC8366diy.aG();
                String prePlayVideoId = aG != null ? aG.getPrePlayVideoId() : null;
                if (aG == null || prePlayVideoId == null || prePlayVideoId.length() == 0) {
                    Single just = Single.just(C5713cFp.e.c());
                    C8632dsu.d(just);
                    return just;
                }
                PlayContextImp playContextImp = new PlayContextImp(aG.getType(), aG.getTrackId(), 0, 0);
                playContextImp.b(aG.getAutoPlay());
                return C5713cFp.this.c(prePlayVideoId, playContextImp, aG.getUiLabel(), aG.getImpressionData());
            }
        };
        Single<d> onErrorReturn = singleOrError.flatMap(new Function() { // from class: o.cFx
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource b;
                b = C5713cFp.b(drM.this, obj);
                return b;
            }
        }).onErrorReturn(new Function() { // from class: o.cFy
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                C5713cFp.d a2;
                a2 = C5713cFp.a((Throwable) obj);
                return a2;
            }
        });
        C8632dsu.a(onErrorReturn, "");
        return onErrorReturn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public Single<d> c(String str, final PlayContext playContext, final String str2, final String str3) {
        List e2;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) playContext, "");
        aLP alp = this.d;
        e2 = C8566dqi.e(IE.b(IE.c("summary", "detail", "timeCodes", "advisories")));
        Single singleOrError = alp.e(new C0969Jo(str, e2, TaskMode.FROM_CACHE_ONLY, false, null, "PreplayRepo", 24, null)).singleOrError();
        final drM<InterfaceC8366diy, SingleSource<? extends d>> drm = new drM<InterfaceC8366diy, SingleSource<? extends d>>() { // from class: com.netflix.mediaclient.ui.player.v2.repository.PreplayRepositoryImpl$getPrePlayVideoWrapperResponse$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final SingleSource<? extends C5713cFp.d> invoke(InterfaceC8366diy interfaceC8366diy) {
                C8632dsu.c((Object) interfaceC8366diy, "");
                C7535cxz c7535cxz = new C7535cxz(interfaceC8366diy, PlayContext.this, 0L, str2, str3, null);
                NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                C8632dsu.a(netflixImmutableStatus, "");
                return Single.just(new C5713cFp.d(c7535cxz, netflixImmutableStatus));
            }
        };
        Single<d> onErrorReturn = singleOrError.flatMap(new Function() { // from class: o.cFu
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource d2;
                d2 = C5713cFp.d(drM.this, obj);
                return d2;
            }
        }).onErrorReturn(new Function() { // from class: o.cFv
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                C5713cFp.d b;
                b = C5713cFp.b((Throwable) obj);
                return b;
            }
        });
        C8632dsu.a(onErrorReturn, "");
        return onErrorReturn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    private final boolean a(InterfaceC5198buI interfaceC5198buI, long j) {
        return j <= 0 && interfaceC5198buI.aE_().N();
    }
}
