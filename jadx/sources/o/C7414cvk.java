package o;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouRepositoryImpl$fetchBoxArtForList$1;
import com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouRepositoryImpl$fetchDownloadsForYou$1;
import com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouRepositoryImpl$fetchEpisodeDetails$1;
import com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouRepositoryImpl$fetchMovieDetails$1;
import com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouRepositoryImpl$fetchShowDetailsAndSeasons$1;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C6004cQk;
import o.C7414cvk;
import o.C8569dql;
import o.C8576dqs;
import o.C8632dsu;
import o.C9706vU;
import o.InterfaceC1593aHa;
import o.InterfaceC5184btv;
import o.InterfaceC5188btz;

/* renamed from: o.cvk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7414cvk implements InterfaceC7412cvi {
    public static final a a = new a(null);

    /* renamed from: o.cvk$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("DownloadedForYouRepository");
        }
    }

    @Override // o.InterfaceC7412cvi
    public Single<List<String>> b(InterfaceC5283bvo interfaceC5283bvo, int i) {
        C8632dsu.c((Object) interfaceC5283bvo, "");
        C6004cQk c6004cQk = new C6004cQk();
        String profileGuid = interfaceC5283bvo.getProfileGuid();
        C8632dsu.a(profileGuid, "");
        Single<C6004cQk.d<List<InterfaceC5184btv>>> e = c6004cQk.e(profileGuid, i);
        final drM<C6004cQk.d<List<? extends InterfaceC5184btv>>, SingleSource<? extends List<? extends String>>> drm = new drM<C6004cQk.d<List<? extends InterfaceC5184btv>>, SingleSource<? extends List<? extends String>>>() { // from class: com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouRepositoryImpl$fetchBoxArtListForOptIn$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final SingleSource<? extends List<String>> invoke(C6004cQk.d<List<InterfaceC5184btv>> dVar) {
                Single a2;
                List i2;
                C8632dsu.c((Object) dVar, "");
                List<InterfaceC5184btv> c = dVar.c();
                if (c != null) {
                    a2 = C7414cvk.this.a(c);
                    return a2;
                }
                i2 = C8569dql.i();
                Single just = Single.just(i2);
                C8632dsu.d(just);
                return just;
            }
        };
        Single flatMap = e.flatMap(new Function() { // from class: o.cvn
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource i2;
                i2 = C7414cvk.i(drM.this, obj);
                return i2;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource i(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    @Override // o.InterfaceC7412cvi
    public Single<List<InterfaceC5184btv>> d(InterfaceC5283bvo interfaceC5283bvo, int i) {
        C8632dsu.c((Object) interfaceC5283bvo, "");
        return C7680dBj.e(null, new DownloadedForYouRepositoryImpl$fetchDownloadsForYou$1(interfaceC5283bvo, i, null), 1, null);
    }

    @Override // o.InterfaceC7412cvi
    public Single<C6004cQk.b<InterfaceC5238buw>> c(String str, String str2, boolean z, TaskMode taskMode, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) taskMode, "");
        C8632dsu.c((Object) str3, "");
        return C7680dBj.e(null, new DownloadedForYouRepositoryImpl$fetchMovieDetails$1(str, str2, z, taskMode, str3, null), 1, null);
    }

    @Override // o.InterfaceC7412cvi
    public Single<C6004cQk.b<InterfaceC5227bul>> b(String str, String str2, boolean z, TaskMode taskMode, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) taskMode, "");
        C8632dsu.c((Object) str3, "");
        return C7680dBj.e(null, new DownloadedForYouRepositoryImpl$fetchEpisodeDetails$1(str, str2, z, taskMode, str3, null), 1, null);
    }

    @Override // o.InterfaceC7412cvi
    public Single<C6004cQk.c<InterfaceC5194buE, InterfaceC5195buF>> e(String str, String str2, boolean z, TaskMode taskMode, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) taskMode, "");
        C8632dsu.c((Object) str3, "");
        return C7680dBj.e(null, new DownloadedForYouRepositoryImpl$fetchShowDetailsAndSeasons$1(str, str2, z, taskMode, str3, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (List) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<List<String>> a(List<? extends InterfaceC5184btv> list) {
        int d;
        List i;
        ArrayList<InterfaceC5184btv> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InterfaceC5184btv) obj).getParentVideoId() != null) {
                arrayList.add(obj);
            }
        }
        d = C8572dqo.d(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(d);
        for (final InterfaceC5184btv interfaceC5184btv : arrayList) {
            C6004cQk c6004cQk = new C6004cQk();
            String parentVideoId = interfaceC5184btv.getParentVideoId();
            if (parentVideoId == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Single<C6004cQk.d<InterfaceC5188btz>> e = c6004cQk.e(parentVideoId, false);
            final drM<C6004cQk.d<InterfaceC5188btz>, SingleSource<? extends String>> drm = new drM<C6004cQk.d<InterfaceC5188btz>, SingleSource<? extends String>>() { // from class: com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouRepositoryImpl$fetchBoxArtForList$boxshotUrlSingles$2$1
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: c */
                public final SingleSource<? extends String> invoke(C6004cQk.d<InterfaceC5188btz> dVar) {
                    C8632dsu.c((Object) dVar, "");
                    InterfaceC5188btz c = dVar.c();
                    String boxshotUrl = c != null ? c.getBoxshotUrl() : null;
                    if (c == null || boxshotUrl == null) {
                        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                        String parentVideoId2 = InterfaceC5184btv.this.getParentVideoId();
                        boolean z = c == null;
                        boolean z2 = boxshotUrl == null;
                        aVar.a("parentVideoId -> " + parentVideoId2 + ", videoSummary == null -> " + z + ", boxshotUrl == null -> " + z2);
                        String logTag = C7414cvk.a.getLogTag();
                        return Single.error(new RuntimeException(logTag + ": error retrieving video summary or boxshotUrl"));
                    }
                    return Single.just(boxshotUrl);
                }
            };
            arrayList2.add(e.flatMap(new Function() { // from class: o.cvl
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj2) {
                    SingleSource c;
                    c = C7414cvk.c(drM.this, obj2);
                    return c;
                }
            }));
        }
        if (arrayList2.isEmpty()) {
            i = C8569dql.i();
            Single<List<String>> just = Single.just(i);
            C8632dsu.a(just, "");
            return just;
        }
        C9706vU.c cVar = new C9706vU.c();
        Single[] singleArr = (Single[]) arrayList2.toArray(new Single[0]);
        Single zipArray = Single.zipArray(cVar, (SingleSource[]) Arrays.copyOf(singleArr, singleArr.length));
        final DownloadedForYouRepositoryImpl$fetchBoxArtForList$1 downloadedForYouRepositoryImpl$fetchBoxArtForList$1 = new drM<List<? extends String>, List<? extends String>>() { // from class: com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouRepositoryImpl$fetchBoxArtForList$1
            @Override // o.drM
            /* renamed from: c */
            public final List<String> invoke(List<String> list2) {
                List<String> G;
                C8632dsu.c((Object) list2, "");
                G = C8576dqs.G(list2);
                return G;
            }
        };
        Single<List<String>> map = zipArray.map(new Function() { // from class: o.cvo
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                List d2;
                d2 = C7414cvk.d(drM.this, obj2);
                return d2;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }
}
