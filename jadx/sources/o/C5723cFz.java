package o;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.ui.player.v2.repository.interactive.InteractiveMomentsPlayerRepository$resetInteractiveState$1;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import o.C5723cFz;
import o.C6004cQk;
import o.C8632dsu;
import o.InterfaceC5160btX;

/* renamed from: o.cFz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5723cFz {
    public static final e c = new e(null);

    /* renamed from: o.cFz$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("InteractiveMomentsPlayerRepository");
        }
    }

    /* renamed from: o.cFz$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private final InteractiveMoments a;
        private final Status b;
        private final long d;

        public final InteractiveMoments a() {
            return this.a;
        }

        public final long e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c(this.a, aVar.a) && this.d == aVar.d && C8632dsu.c(this.b, aVar.b);
            }
            return false;
        }

        public int hashCode() {
            InteractiveMoments interactiveMoments = this.a;
            return ((((interactiveMoments == null ? 0 : interactiveMoments.hashCode()) * 31) + Long.hashCode(this.d)) * 31) + this.b.hashCode();
        }

        public String toString() {
            InteractiveMoments interactiveMoments = this.a;
            long j = this.d;
            Status status = this.b;
            return "Response(interactiveMoments=" + interactiveMoments + ", bookmark=" + j + ", status=" + status + ")";
        }

        public a(InteractiveMoments interactiveMoments, long j, Status status) {
            C8632dsu.c((Object) status, "");
            this.a = interactiveMoments;
            this.d = j;
            this.b = status;
        }

        public /* synthetic */ a(InteractiveMoments interactiveMoments, long j, Status status, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? null : interactiveMoments, j, status);
        }
    }

    public final Single<a> c(InterfaceC5198buI interfaceC5198buI, long j, boolean z) {
        InteractiveSummary az_;
        InteractiveSummary az_2;
        InteractiveSummary.Features features;
        Long valueOf;
        InteractiveSummary.Features features2;
        InteractiveSummary.Features features3;
        C8632dsu.c((Object) interfaceC5198buI, "");
        if (interfaceC5198buI.az_() == null || !((az_ = interfaceC5198buI.az_()) == null || (features3 = az_.features()) == null || features3.videoMoments())) {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ad;
            C8632dsu.a(netflixImmutableStatus, "");
            Single<a> just = Single.just(new a(null, j, netflixImmutableStatus, 1, null));
            C8632dsu.a(just, "");
            return just;
        }
        if (j == -1) {
            InteractiveSummary az_3 = interfaceC5198buI.az_();
            if (az_3 == null || (features2 = az_3.features()) == null || (valueOf = features2.bookmarkOverrideMs()) == null) {
                valueOf = Long.valueOf(j);
            }
            j = valueOf.longValue();
        }
        if (z && (az_2 = interfaceC5198buI.az_()) != null && (features = az_2.features()) != null && features.resetUserState()) {
            InterfaceC5160btX aE_ = interfaceC5198buI.aE_();
            C8632dsu.a(aE_, "");
            return b(aE_);
        }
        InterfaceC5160btX aE_2 = interfaceC5198buI.aE_();
        C8632dsu.a(aE_2, "");
        return a(aE_2, j);
    }

    private final Single<a> b(InterfaceC5160btX interfaceC5160btX) {
        String aH_ = interfaceC5160btX.aH_();
        if (aH_ == null) {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.af;
            C8632dsu.a(netflixImmutableStatus, "");
            Single<a> just = Single.just(new a(null, -1L, netflixImmutableStatus, 1, null));
            C8632dsu.a(just, "");
            return just;
        }
        Single<C6004cQk.d<StateHistory>> a2 = new C6004cQk().a(aH_);
        final InteractiveMomentsPlayerRepository$resetInteractiveState$1 interactiveMomentsPlayerRepository$resetInteractiveState$1 = new InteractiveMomentsPlayerRepository$resetInteractiveState$1(aH_);
        Single flatMap = a2.flatMap(new Function() { // from class: o.cFC
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource h;
                h = C5723cFz.h(drM.this, obj);
                return h;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource h(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (a) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource i(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a g(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (a) drm.invoke(obj);
    }

    private final Single<a> a(final InterfaceC5160btX interfaceC5160btX, final long j) {
        Single d;
        c.getLogTag();
        final String aH_ = interfaceC5160btX.aH_();
        if (aH_ == null) {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ad;
            C8632dsu.a(netflixImmutableStatus, "");
            Single<a> just = Single.just(new a(null, -1L, netflixImmutableStatus, 1, null));
            C8632dsu.a(just, "");
            return just;
        } else if (j == -1) {
            Single<C6004cQk.d<Boolean>> e2 = new C6004cQk().e(aH_, interfaceC5160btX.aF_(), interfaceC5160btX.aG_());
            final drM<C6004cQk.d<Boolean>, SingleSource<? extends C6004cQk.d<InteractiveMoments>>> drm = new drM<C6004cQk.d<Boolean>, SingleSource<? extends C6004cQk.d<InteractiveMoments>>>() { // from class: com.netflix.mediaclient.ui.player.v2.repository.interactive.InteractiveMomentsPlayerRepository$fetchInteractiveMoments$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: c */
                public final SingleSource<? extends C6004cQk.d<InteractiveMoments>> invoke(C6004cQk.d<Boolean> dVar) {
                    Single d2;
                    C8632dsu.c((Object) dVar, "");
                    d2 = new C6004cQk().d(aH_, "IntPlayerRepo", Moment.InteractiveIntent.PLAYBACK_START, interfaceC5160btX.aF_(), (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & JSONzip.end) != 0 ? null : null, (r27 & 512) != 0 ? null : null);
                    return d2;
                }
            };
            Single<R> flatMap = e2.flatMap(new Function() { // from class: o.cFA
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    SingleSource i;
                    i = C5723cFz.i(drM.this, obj);
                    return i;
                }
            });
            final drM<C6004cQk.d<InteractiveMoments>, a> drm2 = new drM<C6004cQk.d<InteractiveMoments>, a>() { // from class: com.netflix.mediaclient.ui.player.v2.repository.interactive.InteractiveMomentsPlayerRepository$fetchInteractiveMoments$4
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: a */
                public final C5723cFz.a invoke(C6004cQk.d<InteractiveMoments> dVar) {
                    C8632dsu.c((Object) dVar, "");
                    return new C5723cFz.a(dVar.c(), InterfaceC5160btX.this.aF_(), dVar.d());
                }
            };
            Single<a> map = flatMap.map(new Function() { // from class: o.cFD
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    C5723cFz.a g;
                    g = C5723cFz.g(drM.this, obj);
                    return g;
                }
            });
            C8632dsu.a(map, "");
            return map;
        } else {
            d = new C6004cQk().d(aH_, "IntPlayerRepo", Moment.InteractiveIntent.PLAYBACK_START, j, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & JSONzip.end) != 0 ? null : null, (r27 & 512) != 0 ? null : null);
            final drM<C6004cQk.d<InteractiveMoments>, a> drm3 = new drM<C6004cQk.d<InteractiveMoments>, a>() { // from class: com.netflix.mediaclient.ui.player.v2.repository.interactive.InteractiveMomentsPlayerRepository$fetchInteractiveMoments$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: d */
                public final C5723cFz.a invoke(C6004cQk.d<InteractiveMoments> dVar) {
                    C8632dsu.c((Object) dVar, "");
                    return new C5723cFz.a(dVar.c(), j, dVar.d());
                }
            };
            Single<a> map2 = d.map(new Function() { // from class: o.cFB
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    C5723cFz.a b;
                    b = C5723cFz.b(drM.this, obj);
                    return b;
                }
            });
            C8632dsu.a(map2, "");
            return map2;
        }
    }
}
