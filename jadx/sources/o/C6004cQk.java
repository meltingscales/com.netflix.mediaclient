package o;

import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.app.StatusError;
import com.netflix.mediaclient.android.app.StatusException;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.browse.api.task.enums.CmpTaskMode;
import com.netflix.mediaclient.service.webclient.volley.StatusCodeError;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.PlaybackContext;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.mediaclient.ui.repository.BrowseRepository$agreeToTermsOfUse$1;
import com.netflix.mediaclient.ui.repository.BrowseRepository$fetchCWVideos$1;
import com.netflix.model.leafs.advisory.ContentAction;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.condition.Snapshots;
import com.netflix.model.leafs.originals.interactive.condition.State;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.List;
import o.AbstractC1761aNg;
import o.AbstractC1762aNh;
import o.C0961Jg;
import o.C0970Jp;
import o.C0975Ju;
import o.C0976Jv;
import o.C0981Ka;
import o.C0983Kc;
import o.C0996Kp;
import o.C6004cQk;
import o.C8576dqs;
import o.C8632dsu;
import o.C9698vM;
import o.C9707vV;
import o.C9726vo;
import o.IP;
import o.InterfaceC0989Ki;
import o.InterfaceC1242Ud;
import o.InterfaceC1757aNc;
import o.InterfaceC1912aSw;
import o.InterfaceC5184btv;
import o.InterfaceC5188btz;
import o.InterfaceC5190buA;
import o.InterfaceC5194buE;
import o.InterfaceC5195buF;
import o.InterfaceC5227bul;
import o.InterfaceC5238buw;
import o.InterfaceC8366diy;
import o.JJ;
import o.dpR;
import o.drM;
import o.drX;

/* renamed from: o.cQk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6004cQk extends AbstractC5999cQf<InterfaceC1912aSw> {
    public static final a b = new a(null);

    /* renamed from: o.cQk$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("BrowseRepository");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5999cQf
    /* renamed from: c */
    public InterfaceC1912aSw a() {
        InterfaceC1912aSw b2 = AbstractApplicationC1040Mh.getInstance().i().b();
        if (b2 != null) {
            return b2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: o.cQk$c */
    /* loaded from: classes4.dex */
    public static final class c<T extends InterfaceC5194buE, V extends InterfaceC5195buF> {
        private final Status a;
        private final List<InterfaceC5195buF> b;
        private final T e;

        public final T c() {
            return this.e;
        }

        public final Status d() {
            return this.a;
        }

        public final List<InterfaceC5195buF> e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c(this.e, cVar.e) && C8632dsu.c(this.b, cVar.b) && C8632dsu.c(this.a, cVar.a);
            }
            return false;
        }

        public int hashCode() {
            T t = this.e;
            return ((((t == null ? 0 : t.hashCode()) * 31) + this.b.hashCode()) * 31) + this.a.hashCode();
        }

        public String toString() {
            T t = this.e;
            List<InterfaceC5195buF> list = this.b;
            Status status = this.a;
            return "ShowDetailsAndSeasonsResponse(showDetails=" + t + ", seasons=" + list + ", status=" + status + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(T t, List<? extends InterfaceC5195buF> list, Status status) {
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) status, "");
            this.e = t;
            this.b = list;
            this.a = status;
        }
    }

    /* renamed from: o.cQk$b */
    /* loaded from: classes4.dex */
    public static final class b<T extends InterfaceC5198buI> {
        private final Status a;
        private final T b;

        public final T a() {
            return this.b;
        }

        public final T b() {
            return this.b;
        }

        public final Status e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c(this.b, bVar.b) && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            T t = this.b;
            return ((t == null ? 0 : t.hashCode()) * 31) + this.a.hashCode();
        }

        public String toString() {
            T t = this.b;
            Status status = this.a;
            return "VideoDetailsResponse(videoDetails=" + t + ", status=" + status + ")";
        }

        public b(T t, Status status) {
            C8632dsu.c((Object) status, "");
            this.b = t;
            this.a = status;
        }
    }

    /* renamed from: o.cQk$d */
    /* loaded from: classes4.dex */
    public static final class d<T> {
        private final T a;
        private final Status e;

        public final T c() {
            return this.a;
        }

        public final Status d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.a, dVar.a) && C8632dsu.c(this.e, dVar.e);
            }
            return false;
        }

        public int hashCode() {
            T t = this.a;
            return ((t == null ? 0 : t.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            T t = this.a;
            Status status = this.e;
            return "FetchResponse(data=" + t + ", status=" + status + ")";
        }

        public d(T t, Status status) {
            C8632dsu.c((Object) status, "");
            this.a = t;
            this.e = status;
        }
    }

    public final <T> Observable<T> d(final InterfaceC0989Ki<T> interfaceC0989Ki) {
        C8632dsu.c((Object) interfaceC0989Ki, "");
        Single<InterfaceC1912aSw> h = h();
        final drM<InterfaceC1912aSw, SingleSource<? extends T>> drm = new drM<InterfaceC1912aSw, SingleSource<? extends T>>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchTask$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final SingleSource<? extends T> invoke(final InterfaceC1912aSw interfaceC1912aSw) {
                C8632dsu.c((Object) interfaceC1912aSw, "");
                final InterfaceC0989Ki<T> interfaceC0989Ki2 = interfaceC0989Ki;
                return C9698vM.e(new drM<C9707vV<T>, dpR>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchTask$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Object obj) {
                        c((C9707vV) obj);
                        return dpR.c;
                    }

                    public final void c(final C9707vV<T> c9707vV) {
                        C8632dsu.c((Object) c9707vV, "");
                        InterfaceC1912aSw interfaceC1912aSw2 = InterfaceC1912aSw.this;
                        InterfaceC0989Ki<T> interfaceC0989Ki3 = interfaceC0989Ki2;
                        final InterfaceC0989Ki<T> interfaceC0989Ki4 = interfaceC0989Ki2;
                        interfaceC1912aSw2.d(interfaceC0989Ki3, new AbstractC1762aNh<T>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository.fetchTask.1.1.5
                            @Override // o.AbstractC1762aNh, o.InterfaceC1755aNa
                            public void c(T t, Status status) {
                                C8632dsu.c((Object) status, "");
                                super.c((AnonymousClass5) t, status);
                                if (status.i()) {
                                    c9707vV.d(new StatusError(status));
                                } else if (t == null) {
                                    C9707vV<T> c9707vV2 = c9707vV;
                                    StatusCode c2 = status.c();
                                    String h2 = interfaceC0989Ki4.h();
                                    c9707vV2.d(new StatusCodeError(c2, "Error onGenericResponseFetched empty response for " + h2));
                                } else {
                                    c9707vV.c(t);
                                }
                            }
                        });
                    }
                });
            }
        };
        Observable<T> observable = h.flatMap(new Function() { // from class: o.cQC
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource D;
                D = C6004cQk.D(drM.this, obj);
                return D;
            }
        }).toObservable();
        C8632dsu.a(observable, "");
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource D(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource B(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource C(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource w(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource A(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource x(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final Single<List<InterfaceC5222bug<? extends InterfaceC5223buh>>> d(LoMo loMo, int i, int i2, boolean z, String str) {
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) str, "");
        Single<InterfaceC1912aSw> h = h();
        final BrowseRepository$fetchCWVideos$1 browseRepository$fetchCWVideos$1 = new BrowseRepository$fetchCWVideos$1(loMo, i, i2, z, str);
        Single flatMap = h.flatMap(new Function() { // from class: o.cQs
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource t;
                t = C6004cQk.t(drM.this, obj);
                return t;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource t(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final Single<d<List<InterfaceC5184btv>>> e(final String str, final int i) {
        C8632dsu.c((Object) str, "");
        Single<InterfaceC1912aSw> h = h();
        final drM<InterfaceC1912aSw, SingleSource<? extends d<List<? extends InterfaceC5184btv>>>> drm = new drM<InterfaceC1912aSw, SingleSource<? extends d<List<? extends InterfaceC5184btv>>>>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchDownloadedForYou$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final SingleSource<? extends C6004cQk.d<List<InterfaceC5184btv>>> invoke(final InterfaceC1912aSw interfaceC1912aSw) {
                C8632dsu.c((Object) interfaceC1912aSw, "");
                final String str2 = str;
                final int i2 = i;
                return C9698vM.e(new drM<C9707vV<C6004cQk.d<List<? extends InterfaceC5184btv>>>, dpR>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchDownloadedForYou$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C9707vV<C6004cQk.d<List<? extends InterfaceC5184btv>>> c9707vV) {
                        e(c9707vV);
                        return dpR.c;
                    }

                    public final void e(final C9707vV<C6004cQk.d<List<InterfaceC5184btv>>> c9707vV) {
                        C8632dsu.c((Object) c9707vV, "");
                        InterfaceC1912aSw.this.d((InterfaceC1912aSw) new C0961Jg(str2, i2), (InterfaceC1757aNc) new AbstractC1761aNg() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository.fetchDownloadedForYou.1.1.3
                            @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
                            public void c(List<? extends InterfaceC5184btv> list, Status status) {
                                C8632dsu.c((Object) status, "");
                                c9707vV.c(new C6004cQk.d<>(list, status));
                            }
                        });
                    }
                });
            }
        };
        Single flatMap = h.flatMap(new Function() { // from class: o.cQo
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource q;
                q = C6004cQk.q(drM.this, obj);
                return q;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource q(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final Single<d<InterfaceC5188btz>> e(final String str, final boolean z) {
        C8632dsu.c((Object) str, "");
        Single<InterfaceC1912aSw> h = h();
        final drM<InterfaceC1912aSw, SingleSource<? extends d<InterfaceC5188btz>>> drm = new drM<InterfaceC1912aSw, SingleSource<? extends d<InterfaceC5188btz>>>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchVideoSummary$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final SingleSource<? extends C6004cQk.d<InterfaceC5188btz>> invoke(final InterfaceC1912aSw interfaceC1912aSw) {
                C8632dsu.c((Object) interfaceC1912aSw, "");
                final String str2 = str;
                final boolean z2 = z;
                return C9698vM.e(new drM<C9707vV<C6004cQk.d<InterfaceC5188btz>>, dpR>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchVideoSummary$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C9707vV<C6004cQk.d<InterfaceC5188btz>> c9707vV) {
                        c(c9707vV);
                        return dpR.c;
                    }

                    public final void c(final C9707vV<C6004cQk.d<InterfaceC5188btz>> c9707vV) {
                        C8632dsu.c((Object) c9707vV, "");
                        InterfaceC1912aSw.this.d((InterfaceC1912aSw) new C0981Ka(str2, z2), (InterfaceC1757aNc) new AbstractC1761aNg() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository.fetchVideoSummary.1.1.1
                            @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
                            public void d(InterfaceC5188btz interfaceC5188btz, Status status) {
                                C8632dsu.c((Object) status, "");
                                c9707vV.c(new C6004cQk.d<>(interfaceC5188btz, status));
                            }
                        });
                    }
                });
            }
        };
        Single flatMap = h.flatMap(new Function() { // from class: o.cQz
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource F;
                F = C6004cQk.F(drM.this, obj);
                return F;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource F(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final Completable a(final String str, final ContentAction contentAction) {
        Single<InterfaceC1912aSw> h = h();
        final drM<InterfaceC1912aSw, CompletableSource> drm = new drM<InterfaceC1912aSw, CompletableSource>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$updateExpiredContentAdvisoryStatus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final CompletableSource invoke(InterfaceC1912aSw interfaceC1912aSw) {
                C8632dsu.c((Object) interfaceC1912aSw, "");
                interfaceC1912aSw.b(str, contentAction);
                return Completable.complete();
            }
        };
        Completable flatMapCompletable = h.flatMapCompletable(new Function() { // from class: o.cQB
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                CompletableSource H;
                H = C6004cQk.H(drM.this, obj);
                return H;
            }
        });
        C8632dsu.a(flatMapCompletable, "");
        return flatMapCompletable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompletableSource H(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (CompletableSource) drm.invoke(obj);
    }

    public final Completable d() {
        Single<InterfaceC1912aSw> h = h();
        final BrowseRepository$agreeToTermsOfUse$1 browseRepository$agreeToTermsOfUse$1 = new drM<InterfaceC1912aSw, CompletableSource>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$agreeToTermsOfUse$1
            @Override // o.drM
            /* renamed from: d */
            public final CompletableSource invoke(InterfaceC1912aSw interfaceC1912aSw) {
                C8632dsu.c((Object) interfaceC1912aSw, "");
                interfaceC1912aSw.d((InterfaceC1912aSw) new IP(), (InterfaceC1757aNc) new AbstractC1761aNg() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$agreeToTermsOfUse$1.4
                });
                return Completable.complete();
            }
        };
        Completable flatMapCompletable = h.flatMapCompletable(new Function() { // from class: o.cQw
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                CompletableSource s;
                s = C6004cQk.s(drM.this, obj);
                return s;
            }
        });
        C8632dsu.a(flatMapCompletable, "");
        return flatMapCompletable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompletableSource s(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (CompletableSource) drm.invoke(obj);
    }

    public final Single<d<InteractiveMoments>> d(final String str, final String str2, final String str3, final long j, final String str4, final String str5, final String str6, final List<String> list, final String str7, final StateHistory stateHistory) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        Single<InterfaceC1912aSw> h = h();
        final drM<InterfaceC1912aSw, SingleSource<? extends d<InteractiveMoments>>> drm = new drM<InterfaceC1912aSw, SingleSource<? extends d<InteractiveMoments>>>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchInteractiveMoments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final SingleSource<? extends C6004cQk.d<InteractiveMoments>> invoke(final InterfaceC1912aSw interfaceC1912aSw) {
                C8632dsu.c((Object) interfaceC1912aSw, "");
                final String str8 = str;
                final String str9 = str3;
                final String str10 = str7;
                final String str11 = str2;
                final long j2 = j;
                final String str12 = str4;
                final String str13 = str5;
                final String str14 = str6;
                final List<String> list2 = list;
                final StateHistory stateHistory2 = stateHistory;
                return C9698vM.e(new drM<C9707vV<C6004cQk.d<InteractiveMoments>>, dpR>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchInteractiveMoments$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C9707vV<C6004cQk.d<InteractiveMoments>> c9707vV) {
                        c(c9707vV);
                        return dpR.c;
                    }

                    public final void c(final C9707vV<C6004cQk.d<InteractiveMoments>> c9707vV) {
                        C8632dsu.c((Object) c9707vV, "");
                        InterfaceC1912aSw.this.d((InterfaceC1912aSw) new C0975Ju(str8, str9, str10, str11, j2, str12, str13, str14, list2, stateHistory2), (InterfaceC1757aNc) new AbstractC1761aNg() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository.fetchInteractiveMoments.1.1.4
                            @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
                            public void b(InteractiveMoments interactiveMoments, Status status) {
                                C8632dsu.c((Object) status, "");
                                c9707vV.c(new C6004cQk.d<>(interactiveMoments, status));
                            }
                        });
                    }
                });
            }
        };
        Single flatMap = h.flatMap(new Function() { // from class: o.cQp
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource y;
                y = C6004cQk.y(drM.this, obj);
                return y;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource y(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final Single<d<InterfaceC5190buA>> b(final String str, final VideoType videoType, final PlayLocationType playLocationType, final boolean z, final boolean z2, final PlaybackContext playbackContext, final boolean z3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) playLocationType, "");
        C8632dsu.c((Object) playbackContext, "");
        Single<InterfaceC1912aSw> h = h();
        final drM<InterfaceC1912aSw, SingleSource<? extends d<InterfaceC5190buA>>> drm = new drM<InterfaceC1912aSw, SingleSource<? extends d<InterfaceC5190buA>>>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchPostPlayVideosV2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final SingleSource<? extends C6004cQk.d<InterfaceC5190buA>> invoke(final InterfaceC1912aSw interfaceC1912aSw) {
                C8632dsu.c((Object) interfaceC1912aSw, "");
                final String str2 = str;
                final VideoType videoType2 = videoType;
                final PlayLocationType playLocationType2 = playLocationType;
                final boolean z4 = z;
                final boolean z5 = z2;
                final PlaybackContext playbackContext2 = playbackContext;
                final boolean z6 = z3;
                return C9698vM.e(new drM<C9707vV<C6004cQk.d<InterfaceC5190buA>>, dpR>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchPostPlayVideosV2$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C9707vV<C6004cQk.d<InterfaceC5190buA>> c9707vV) {
                        c(c9707vV);
                        return dpR.c;
                    }

                    public final void c(final C9707vV<C6004cQk.d<InterfaceC5190buA>> c9707vV) {
                        C8632dsu.c((Object) c9707vV, "");
                        InterfaceC1912aSw.this.d((InterfaceC1912aSw) new JJ(str2, videoType2, playLocationType2, z4, z5, playbackContext2, z6), (InterfaceC1757aNc) new AbstractC1761aNg() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository.fetchPostPlayVideosV2.1.1.2
                            @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
                            public void b(InterfaceC5190buA interfaceC5190buA, Status status) {
                                C8632dsu.c((Object) status, "");
                                c9707vV.c(new C6004cQk.d<>(interfaceC5190buA, status));
                            }
                        });
                    }
                });
            }
        };
        Single flatMap = h.flatMap(new Function() { // from class: o.cQn
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource z4;
                z4 = C6004cQk.z(drM.this, obj);
                return z4;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource z(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final Single<d<Boolean>> b(final String str, final StateHistory stateHistory, final Snapshots snapshots, final State state) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) stateHistory, "");
        C8632dsu.c((Object) snapshots, "");
        Single<InterfaceC1912aSw> h = h();
        final drM<InterfaceC1912aSw, SingleSource<? extends d<Boolean>>> drm = new drM<InterfaceC1912aSw, SingleSource<? extends d<Boolean>>>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$logInteractiveStateSnapshotsTask$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final SingleSource<? extends C6004cQk.d<Boolean>> invoke(final InterfaceC1912aSw interfaceC1912aSw) {
                C8632dsu.c((Object) interfaceC1912aSw, "");
                final String str2 = str;
                final StateHistory stateHistory2 = stateHistory;
                final Snapshots snapshots2 = snapshots;
                final State state2 = state;
                return C9698vM.e(new drM<C9707vV<C6004cQk.d<Boolean>>, dpR>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$logInteractiveStateSnapshotsTask$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C9707vV<C6004cQk.d<Boolean>> c9707vV) {
                        d(c9707vV);
                        return dpR.c;
                    }

                    public final void d(final C9707vV<C6004cQk.d<Boolean>> c9707vV) {
                        C8632dsu.c((Object) c9707vV, "");
                        InterfaceC1912aSw.this.d((InterfaceC1912aSw) new C0996Kp(str2, stateHistory2, snapshots2, state2), (InterfaceC1757aNc) new AbstractC1761aNg() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository.logInteractiveStateSnapshotsTask.1.1.5
                            @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
                            public void a(boolean z, Status status) {
                                C8632dsu.c((Object) status, "");
                                c9707vV.c(new C6004cQk.d<>(Boolean.valueOf(z), status));
                            }
                        });
                    }
                });
            }
        };
        Single flatMap = h.flatMap(new Function() { // from class: o.cQv
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource E;
                E = C6004cQk.E(drM.this, obj);
                return E;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource E(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final Single<d<StateHistory>> a(final String str) {
        C8632dsu.c((Object) str, "");
        Single<InterfaceC1912aSw> h = h();
        final drM<InterfaceC1912aSw, SingleSource<? extends d<StateHistory>>> drm = new drM<InterfaceC1912aSw, SingleSource<? extends d<StateHistory>>>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchInteractiveResetState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final SingleSource<? extends C6004cQk.d<StateHistory>> invoke(final InterfaceC1912aSw interfaceC1912aSw) {
                C8632dsu.c((Object) interfaceC1912aSw, "");
                final String str2 = str;
                return C9698vM.e(new drM<C9707vV<C6004cQk.d<StateHistory>>, dpR>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchInteractiveResetState$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C9707vV<C6004cQk.d<StateHistory>> c9707vV) {
                        b(c9707vV);
                        return dpR.c;
                    }

                    public final void b(final C9707vV<C6004cQk.d<StateHistory>> c9707vV) {
                        C8632dsu.c((Object) c9707vV, "");
                        InterfaceC1912aSw.this.d((InterfaceC1912aSw) new C0976Jv(str2), (InterfaceC1757aNc) new AbstractC1761aNg() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository.fetchInteractiveResetState.1.1.2
                            @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
                            public void b(StateHistory stateHistory, Status status) {
                                C8632dsu.c((Object) status, "");
                                c9707vV.c(new C6004cQk.d<>(stateHistory, status));
                            }
                        });
                    }
                });
            }
        };
        Single flatMap = h.flatMap(new Function() { // from class: o.cQm
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource u;
                u = C6004cQk.u(drM.this, obj);
                return u;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource u(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final Single<d<Boolean>> e(final String str, final long j, final long j2) {
        C8632dsu.c((Object) str, "");
        Single<InterfaceC1912aSw> h = h();
        final drM<InterfaceC1912aSw, SingleSource<? extends d<Boolean>>> drm = new drM<InterfaceC1912aSw, SingleSource<? extends d<Boolean>>>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$forceBookmarkRefresh$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final SingleSource<? extends C6004cQk.d<Boolean>> invoke(final InterfaceC1912aSw interfaceC1912aSw) {
                C8632dsu.c((Object) interfaceC1912aSw, "");
                final String str2 = str;
                final long j3 = j;
                final long j4 = j2;
                return C9698vM.e(new drM<C9707vV<C6004cQk.d<Boolean>>, dpR>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$forceBookmarkRefresh$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C9707vV<C6004cQk.d<Boolean>> c9707vV) {
                        e(c9707vV);
                        return dpR.c;
                    }

                    public final void e(final C9707vV<C6004cQk.d<Boolean>> c9707vV) {
                        C8632dsu.c((Object) c9707vV, "");
                        InterfaceC1912aSw.this.d((InterfaceC1912aSw) new C0983Kc(str2, j3, Long.valueOf(j4)), (InterfaceC1757aNc) new AbstractC1761aNg() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository.forceBookmarkRefresh.1.1.4
                            @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
                            public void a(boolean z, Status status) {
                                C8632dsu.c((Object) status, "");
                                c9707vV.c(new C6004cQk.d<>(Boolean.valueOf(z), status));
                            }
                        });
                    }
                });
            }
        };
        Single flatMap = h.flatMap(new Function() { // from class: o.cQu
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource I;
                I = C6004cQk.I(drM.this, obj);
                return I;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource I(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final Single<d<List<GenreItem>>> d(final String str, final TaskMode taskMode) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) taskMode, "");
        Single<InterfaceC1912aSw> h = h();
        final drM<InterfaceC1912aSw, SingleSource<? extends d<List<? extends GenreItem>>>> drm = new drM<InterfaceC1912aSw, SingleSource<? extends d<List<? extends GenreItem>>>>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchFilteredGenreList$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final SingleSource<? extends C6004cQk.d<List<GenreItem>>> invoke(final InterfaceC1912aSw interfaceC1912aSw) {
                C8632dsu.c((Object) interfaceC1912aSw, "");
                final String str2 = str;
                final TaskMode taskMode2 = taskMode;
                return C9698vM.e(new drM<C9707vV<C6004cQk.d<List<? extends GenreItem>>>, dpR>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchFilteredGenreList$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C9707vV<C6004cQk.d<List<? extends GenreItem>>> c9707vV) {
                        e(c9707vV);
                        return dpR.c;
                    }

                    public final void e(final C9707vV<C6004cQk.d<List<GenreItem>>> c9707vV) {
                        C8632dsu.c((Object) c9707vV, "");
                        InterfaceC1912aSw.this.d(str2, taskMode2, new AbstractC1761aNg() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository.fetchFilteredGenreList.1.1.4
                            @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
                            public void j(List<? extends GenreItem> list, Status status) {
                                C8632dsu.c((Object) status, "");
                                if (status.i()) {
                                    c9707vV.d(new StatusException(status));
                                } else {
                                    c9707vV.c(new C6004cQk.d<>(list, status));
                                }
                            }
                        });
                    }
                });
            }
        };
        Single flatMap = h.flatMap(new Function() { // from class: o.cQr
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource v;
                v = C6004cQk.v(drM.this, obj);
                return v;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource v(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final Single<b<InterfaceC5238buw>> a(final String str, final String str2, final boolean z, final TaskMode taskMode, final String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) taskMode, "");
        C8632dsu.c((Object) str3, "");
        b.getLogTag();
        Single<InterfaceC1912aSw> h = h();
        final drM<InterfaceC1912aSw, SingleSource<? extends b<InterfaceC5238buw>>> drm = new drM<InterfaceC1912aSw, SingleSource<? extends b<InterfaceC5238buw>>>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchMovieDetails$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final SingleSource<? extends C6004cQk.b<InterfaceC5238buw>> invoke(final InterfaceC1912aSw interfaceC1912aSw) {
                C8632dsu.c((Object) interfaceC1912aSw, "");
                final String str4 = str;
                final String str5 = str2;
                final boolean z2 = z;
                final TaskMode taskMode2 = taskMode;
                final String str6 = str3;
                return C9698vM.e(new drM<C9707vV<C6004cQk.b<InterfaceC5238buw>>, dpR>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchMovieDetails$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C9707vV<C6004cQk.b<InterfaceC5238buw>> c9707vV) {
                        b(c9707vV);
                        return dpR.c;
                    }

                    public final void b(final C9707vV<C6004cQk.b<InterfaceC5238buw>> c9707vV) {
                        C8632dsu.c((Object) c9707vV, "");
                        InterfaceC1912aSw.this.e(str4, str5, z2, taskMode2, new AbstractC1761aNg() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository.fetchMovieDetails.2.1.5
                            @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
                            public void a(InterfaceC5238buw interfaceC5238buw, Status status) {
                                C8632dsu.c((Object) status, "");
                                C6004cQk.b.getLogTag();
                                c9707vV.c(new C6004cQk.b<>(interfaceC5238buw, status));
                            }
                        }, str6, Boolean.FALSE);
                    }
                });
            }
        };
        Single flatMap = h.flatMap(new Function() { // from class: o.cQy
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource B;
                B = C6004cQk.B(drM.this, obj);
                return B;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    public final Single<b<InterfaceC5194buE>> d(final String str, final String str2, final TaskMode taskMode, final String str3) {
        C8632dsu.c((Object) taskMode, "");
        C8632dsu.c((Object) str3, "");
        b.getLogTag();
        Single<InterfaceC1912aSw> h = h();
        final drM<InterfaceC1912aSw, SingleSource<? extends b<InterfaceC5194buE>>> drm = new drM<InterfaceC1912aSw, SingleSource<? extends b<InterfaceC5194buE>>>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchShowDetails$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final SingleSource<? extends C6004cQk.b<InterfaceC5194buE>> invoke(final InterfaceC1912aSw interfaceC1912aSw) {
                C8632dsu.c((Object) interfaceC1912aSw, "");
                final String str4 = str;
                final String str5 = str2;
                final TaskMode taskMode2 = taskMode;
                final String str6 = str3;
                return C9698vM.e(new drM<C9707vV<C6004cQk.b<InterfaceC5194buE>>, dpR>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchShowDetails$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C9707vV<C6004cQk.b<InterfaceC5194buE>> c9707vV) {
                        e(c9707vV);
                        return dpR.c;
                    }

                    public final void e(final C9707vV<C6004cQk.b<InterfaceC5194buE>> c9707vV) {
                        C8632dsu.c((Object) c9707vV, "");
                        InterfaceC1912aSw.this.e(str4, str5, taskMode2, new AbstractC1761aNg() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository.fetchShowDetails.2.1.1
                            @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
                            public void c(InterfaceC5194buE interfaceC5194buE, Status status) {
                                C8632dsu.c((Object) status, "");
                                C6004cQk.b.getLogTag();
                                c9707vV.c(new C6004cQk.b<>(interfaceC5194buE, status));
                            }
                        }, str6);
                    }
                });
            }
        };
        Single flatMap = h.flatMap(new Function() { // from class: o.cQD
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource C;
                C = C6004cQk.C(drM.this, obj);
                return C;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    public final Observable<d<InterfaceC8366diy>> e(final String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final List<? extends InterfaceC1242Ud> list, final boolean z10, final CmpTaskMode cmpTaskMode) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) cmpTaskMode, "");
        b.getLogTag();
        Single<InterfaceC1912aSw> h = h();
        final drM<InterfaceC1912aSw, SingleSource<? extends d<InterfaceC8366diy>>> drm = new drM<InterfaceC1912aSw, SingleSource<? extends d<InterfaceC8366diy>>>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchFalkorVideoV2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final SingleSource<? extends C6004cQk.d<InterfaceC8366diy>> invoke(final InterfaceC1912aSw interfaceC1912aSw) {
                C8632dsu.c((Object) interfaceC1912aSw, "");
                final String str2 = str;
                final boolean z11 = z;
                final boolean z12 = z2;
                final boolean z13 = z3;
                final boolean z14 = z4;
                final boolean z15 = z5;
                final boolean z16 = z6;
                final boolean z17 = z7;
                final boolean z18 = z8;
                final boolean z19 = z9;
                final List<InterfaceC1242Ud> list2 = list;
                final boolean z20 = z10;
                final CmpTaskMode cmpTaskMode2 = cmpTaskMode;
                return C9698vM.e(new drM<C9707vV<C6004cQk.d<InterfaceC8366diy>>, dpR>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchFalkorVideoV2$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C9707vV<C6004cQk.d<InterfaceC8366diy>> c9707vV) {
                        a(c9707vV);
                        return dpR.c;
                    }

                    public final void a(final C9707vV<C6004cQk.d<InterfaceC8366diy>> c9707vV) {
                        C8632dsu.c((Object) c9707vV, "");
                        interfaceC1912aSw.d((InterfaceC1912aSw) new C0970Jp(str2, z11, z12, z13, z14, z15, z16, z17, z18, z19, list2, z20, cmpTaskMode2), (InterfaceC1757aNc) new AbstractC1761aNg() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository.fetchFalkorVideoV2.2.1.2
                            @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
                            public void d(InterfaceC8366diy interfaceC8366diy, Status status) {
                                C8632dsu.c((Object) status, "");
                                C6004cQk.b.getLogTag();
                                if (status.g()) {
                                    c9707vV.d(new StatusException(status));
                                } else {
                                    c9707vV.c(new C6004cQk.d<>(interfaceC8366diy, status));
                                }
                            }
                        });
                    }
                });
            }
        };
        Observable<d<InterfaceC8366diy>> observable = h.flatMap(new Function() { // from class: o.cQq
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource w;
                w = C6004cQk.w(drM.this, obj);
                return w;
            }
        }).toObservable();
        C8632dsu.a(observable, "");
        return observable;
    }

    public final Single<c<InterfaceC5194buE, InterfaceC5195buF>> b(final String str, final String str2, final boolean z, final TaskMode taskMode, final String str3) {
        C8632dsu.c((Object) taskMode, "");
        C8632dsu.c((Object) str3, "");
        b.getLogTag();
        Single<InterfaceC1912aSw> h = h();
        final drM<InterfaceC1912aSw, SingleSource<? extends c<InterfaceC5194buE, InterfaceC5195buF>>> drm = new drM<InterfaceC1912aSw, SingleSource<? extends c<InterfaceC5194buE, InterfaceC5195buF>>>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchShowDetailsAndSeasons$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final SingleSource<? extends C6004cQk.c<InterfaceC5194buE, InterfaceC5195buF>> invoke(final InterfaceC1912aSw interfaceC1912aSw) {
                C8632dsu.c((Object) interfaceC1912aSw, "");
                final String str4 = str;
                final String str5 = str2;
                final boolean z2 = z;
                final TaskMode taskMode2 = taskMode;
                final String str6 = str3;
                return C9698vM.e(new drM<C9707vV<C6004cQk.c<InterfaceC5194buE, InterfaceC5195buF>>, dpR>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchShowDetailsAndSeasons$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C9707vV<C6004cQk.c<InterfaceC5194buE, InterfaceC5195buF>> c9707vV) {
                        e(c9707vV);
                        return dpR.c;
                    }

                    public final void e(final C9707vV<C6004cQk.c<InterfaceC5194buE, InterfaceC5195buF>> c9707vV) {
                        C8632dsu.c((Object) c9707vV, "");
                        InterfaceC1912aSw.this.b(str4, str5, z2, taskMode2, new AbstractC1761aNg() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository.fetchShowDetailsAndSeasons.2.1.2
                            @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
                            public void e(final InterfaceC5194buE interfaceC5194buE, List<? extends InterfaceC5195buF> list, Status status) {
                                C6004cQk.b.getLogTag();
                                final C9707vV<C6004cQk.c<InterfaceC5194buE, InterfaceC5195buF>> c9707vV2 = c9707vV;
                                C9726vo.d(list, status, new drX<List<? extends InterfaceC5195buF>, Status, dpR>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchShowDetailsAndSeasons$2$1$1$onShowDetailsAndSeasonsFetched$2
                                    /* JADX INFO: Access modifiers changed from: package-private */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // o.drX
                                    public /* synthetic */ dpR invoke(List<? extends InterfaceC5195buF> list2, Status status2) {
                                        e(list2, status2);
                                        return dpR.c;
                                    }

                                    public final void e(List<? extends InterfaceC5195buF> list2, Status status2) {
                                        List G;
                                        C8632dsu.c((Object) list2, "");
                                        C8632dsu.c((Object) status2, "");
                                        C9707vV<C6004cQk.c<InterfaceC5194buE, InterfaceC5195buF>> c9707vV3 = c9707vV2;
                                        InterfaceC5194buE interfaceC5194buE2 = interfaceC5194buE;
                                        G = C8576dqs.G(list2);
                                        c9707vV3.c(new C6004cQk.c<>(interfaceC5194buE2, G, status2));
                                    }
                                });
                            }
                        }, str6, Boolean.FALSE);
                    }
                });
            }
        };
        Single flatMap = h.flatMap(new Function() { // from class: o.cQt
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource A;
                A = C6004cQk.A(drM.this, obj);
                return A;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    public final Single<b<InterfaceC5227bul>> e(final String str, final String str2, final boolean z, final TaskMode taskMode, final String str3) {
        C8632dsu.c((Object) taskMode, "");
        C8632dsu.c((Object) str3, "");
        b.getLogTag();
        Single<InterfaceC1912aSw> h = h();
        final drM<InterfaceC1912aSw, SingleSource<? extends b<InterfaceC5227bul>>> drm = new drM<InterfaceC1912aSw, SingleSource<? extends b<InterfaceC5227bul>>>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchEpisodeDetails$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final SingleSource<? extends C6004cQk.b<InterfaceC5227bul>> invoke(final InterfaceC1912aSw interfaceC1912aSw) {
                C8632dsu.c((Object) interfaceC1912aSw, "");
                final String str4 = str;
                final String str5 = str2;
                final boolean z2 = z;
                final TaskMode taskMode2 = taskMode;
                final String str6 = str3;
                return C9698vM.e(new drM<C9707vV<C6004cQk.b<InterfaceC5227bul>>, dpR>() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository$fetchEpisodeDetails$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C9707vV<C6004cQk.b<InterfaceC5227bul>> c9707vV) {
                        c(c9707vV);
                        return dpR.c;
                    }

                    public final void c(final C9707vV<C6004cQk.b<InterfaceC5227bul>> c9707vV) {
                        C8632dsu.c((Object) c9707vV, "");
                        InterfaceC1912aSw.this.c(str4, str5, z2, taskMode2, new AbstractC1761aNg() { // from class: com.netflix.mediaclient.ui.repository.BrowseRepository.fetchEpisodeDetails.2.1.3
                            @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
                            public void a(InterfaceC5227bul interfaceC5227bul, Status status) {
                                C8632dsu.c((Object) status, "");
                                C6004cQk.b.getLogTag();
                                c9707vV.c(new C6004cQk.b<>(interfaceC5227bul, status));
                            }
                        }, str6);
                    }
                });
            }
        };
        Single flatMap = h.flatMap(new Function() { // from class: o.cQx
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource x;
                x = C6004cQk.x(drM.this, obj);
                return x;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }
}
