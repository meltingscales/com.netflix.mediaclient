package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.media.BookmarkStore;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.storage.db.OfflineDatabase;
import com.netflix.mediaclient.ui.offline.OfflineVideoImageUtil;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AbstractC4213baK;
import o.C6004cQk;

/* renamed from: o.ctl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7309ctl {
    private final C5291bvw a;
    private Handler c;
    private final Context d;
    private final OfflineVideoImageUtil f;
    private final a g;
    private final C7285ctN i;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13770o;
    private final AtomicBoolean h = new AtomicBoolean(true);
    private Map<String, InterfaceC5206buQ> j = new HashMap();
    private List<C5327bwf> e = new ArrayList();
    private List<C5336bwo> b = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.ctl$a */
    /* loaded from: classes4.dex */
    public interface a {
        void e(Map<String, InterfaceC5206buQ> map, List<C7460cwd> list, List<InterfaceC7464cwh> list2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Handler handler) {
        this.c = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7309ctl(Context context, a aVar) {
        this.d = context;
        this.a = C5291bvw.b.c(OfflineDatabase.d.c(context));
        this.g = aVar;
        this.f = OfflineVideoImageUtil.c(context);
        this.i = C7285ctN.a(context);
        NetflixApplication.getInstance().i().b(new Runnable() { // from class: o.ctr
            @Override // java.lang.Runnable
            public final void run() {
                C7309ctl.this.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Handler handler = this.c;
        if (handler != null) {
            handler.post(new Runnable() { // from class: o.ctn
                @Override // java.lang.Runnable
                public final void run() {
                    C7309ctl.this.d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AbstractC4213baK abstractC4213baK) {
        InterfaceC4208baF l = NetflixApplication.getInstance().i().l();
        if (l != null) {
            l.c(abstractC4213baK);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        String str;
        for (InterfaceC5206buQ interfaceC5206buQ : this.j.values()) {
            C5327bwf a2 = a(interfaceC5206buQ.aH_());
            if (a2 == null) {
                C1044Mm.c("offlineData", "falkor data missing %s", interfaceC5206buQ.aH_());
            } else if (c(a2) && (str = a2.T) != null && b(str)) {
                C1044Mm.c("offlineData", "episodeData missing %s", interfaceC5206buQ.aH_());
            } else if (a(a2)) {
                C1044Mm.c("offlineData", "isImageMissing %s", interfaceC5206buQ.aH_());
            }
            int bc_ = interfaceC5206buQ.bc_();
            if (bc_ == VideoType.EPISODE.getKey() || bc_ == VideoType.MOVIE.getKey()) {
                C1044Mm.c("offlineData", "recover %s", interfaceC5206buQ.aH_());
                e(interfaceC5206buQ.aH_(), interfaceC5206buQ.y(), VideoType.create(bc_), interfaceC5206buQ.u(), interfaceC5206buQ.aN_(), new Runnable() { // from class: o.ctk
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7309ctl.this.g();
                    }
                });
            }
        }
        for (C5336bwo c5336bwo : this.b) {
            if (!C8168dfL.g(c5336bwo.d)) {
                this.i.d(c5336bwo.d, c5336bwo.e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Map<String, InterfaceC5206buQ> map) {
        C1044Mm.c("offlineData", "onOfflinePlayableListUpdated %d", Integer.valueOf(map.size()));
        synchronized (this) {
            this.j = map;
            this.f13770o = b();
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Map<String, InterfaceC5206buQ> map, List<InterfaceC5206buQ> list) {
        C1044Mm.c("offlineData", "onPlayablesDeleted %d", Integer.valueOf(map.size()));
        synchronized (this) {
            this.j = map;
            e(this.a, C7322cty.c(list));
            a();
            h();
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(InterfaceC5283bvo interfaceC5283bvo, CreateRequest createRequest, int i) {
        if (interfaceC5283bvo != null) {
            C7272ctA.e(this.c, interfaceC5283bvo, this.a);
            this.h.set(true);
            if (interfaceC5283bvo.getAvatarUrl() == null || interfaceC5283bvo.getAvatarUrl().isEmpty()) {
                InterfaceC1597aHe.b(new C1596aHd("SPY-35474 - current profile avatar url is empty").e("currentProfileAvatarUrl", interfaceC5283bvo.getAvatarUrl()));
            } else {
                this.i.d(interfaceC5283bvo.getAvatarUrl(), interfaceC5283bvo.getProfileGuid());
            }
            e(createRequest.e, createRequest.d(), createRequest.a, interfaceC5283bvo.getProfileGuid(), i, new Runnable() { // from class: o.ctq
                @Override // java.lang.Runnable
                public final void run() {
                    C7309ctl.this.e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        if (this.f13770o) {
            g();
        }
    }

    @SuppressLint({"CheckResult"})
    private void e(final String str, final String str2, VideoType videoType, final String str3, final int i, final Runnable runnable) {
        final InterfaceC7412cvi d = new C7409cvf().d();
        C1044Mm.a("offlineData", "fetchOfflineFalkorItemAndSave %s", str);
        b(new AbstractC4213baK.a(str, str2));
        if (videoType == VideoType.MOVIE) {
            d.c(str, null, false, TaskMode.FROM_CACHE_OR_NETWORK, "OfflineDataProvider").subscribe(new SingleObserver<C6004cQk.b<InterfaceC5238buw>>() { // from class: o.ctl.5
                @Override // io.reactivex.SingleObserver
                public void onSubscribe(Disposable disposable) {
                }

                @Override // io.reactivex.SingleObserver
                /* renamed from: e */
                public void onSuccess(C6004cQk.b<InterfaceC5238buw> bVar) {
                    InterfaceC5238buw b = bVar.b();
                    if (b == null) {
                        C7309ctl.this.b(new AbstractC4213baK.b(str, str2, StatusCode.INTERNAL_ERROR));
                        C7309ctl.a(InterfaceC1078Nw.ad, null);
                        return;
                    }
                    C7309ctl.this.b(new AbstractC4213baK.b(str, str2, StatusCode.OK));
                    C1044Mm.e("offlineData", "Saving movie details");
                    ((BookmarkStore) C1332Xp.b(BookmarkStore.class)).createOrUpdateBookmark(b, str3);
                    C7272ctA.e(C7309ctl.this.c, b, null, str3, i, C7309ctl.this.a, runnable);
                    C7309ctl.this.f.c(b.bM_(), b.getId(), OfflineVideoImageUtil.ImageType.a, C7309ctl.this.d(str, str2, b.bM_()));
                }

                @Override // io.reactivex.SingleObserver
                public void onError(Throwable th) {
                    C7309ctl.this.b(new AbstractC4213baK.b(str, str2, StatusCode.INTERNAL_ERROR));
                    C7309ctl.a(InterfaceC1078Nw.ad, null);
                }
            });
        } else if (videoType == VideoType.EPISODE) {
            d.b(str, null, false, TaskMode.FROM_CACHE_OR_NETWORK, "OfflineDataProvider").subscribe(new SingleObserver<C6004cQk.b<InterfaceC5227bul>>() { // from class: o.ctl.1
                @Override // io.reactivex.SingleObserver
                public void onSubscribe(Disposable disposable) {
                }

                @Override // io.reactivex.SingleObserver
                /* renamed from: e */
                public void onSuccess(C6004cQk.b<InterfaceC5227bul> bVar) {
                    final InterfaceC5227bul a2 = bVar.a();
                    Status e = bVar.e();
                    if (a2 == null) {
                        C7309ctl.this.b(new AbstractC4213baK.b(str, str2, e.c()));
                        C7309ctl.a(e, a2);
                        return;
                    }
                    String cd_ = a2.cd_();
                    if (cd_ == null) {
                        InterfaceC1598aHf.a("SPY-16890 ShowId missing for " + str);
                        C7309ctl.this.b(new AbstractC4213baK.b(str, str2, StatusCode.INTERNAL_ERROR));
                    } else if (C7309ctl.this.b(cd_)) {
                        d.e(cd_, str, false, TaskMode.FROM_CACHE_OR_NETWORK, "OfflineDataProvider").subscribe(new SingleObserver<C6004cQk.c<InterfaceC5194buE, InterfaceC5195buF>>() { // from class: o.ctl.1.2
                            @Override // io.reactivex.SingleObserver
                            public void onSubscribe(Disposable disposable) {
                            }

                            @Override // io.reactivex.SingleObserver
                            /* renamed from: a */
                            public void onSuccess(C6004cQk.c<InterfaceC5194buE, InterfaceC5195buF> cVar) {
                                InterfaceC5194buE c = cVar.c();
                                List<InterfaceC5195buF> e2 = cVar.e();
                                Status d2 = cVar.d();
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                C7309ctl.this.b(new AbstractC4213baK.b(str, str2, d2.c()));
                                if (c == null) {
                                    C7309ctl.a(d2, c);
                                    return;
                                }
                                C1044Mm.e("offlineData", "Saving episode details and season details");
                                ((BookmarkStore) C1332Xp.b(BookmarkStore.class)).createOrUpdateBookmark(a2, str3);
                                InterfaceC5227bul interfaceC5227bul = a2;
                                AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                C5327bwf e3 = C7272ctA.e(interfaceC5227bul, e2, str3, i);
                                AnonymousClass1 anonymousClass13 = AnonymousClass1.this;
                                C7272ctA.c(C7309ctl.this.c, e3, C7272ctA.e(c, e2, str3, i), C7309ctl.this.a, runnable);
                                OfflineVideoImageUtil offlineVideoImageUtil = C7309ctl.this.f;
                                String w = a2.w();
                                String id = a2.getId();
                                OfflineVideoImageUtil.ImageType imageType = OfflineVideoImageUtil.ImageType.a;
                                AnonymousClass1 anonymousClass14 = AnonymousClass1.this;
                                offlineVideoImageUtil.c(w, id, imageType, C7309ctl.this.d(str, str2, a2.w()));
                                OfflineVideoImageUtil offlineVideoImageUtil2 = C7309ctl.this.f;
                                String bM_ = c.bM_();
                                String id2 = c.getId();
                                AnonymousClass1 anonymousClass15 = AnonymousClass1.this;
                                offlineVideoImageUtil2.c(bM_, id2, imageType, C7309ctl.this.d(str, str2, c.bM_()));
                            }

                            @Override // io.reactivex.SingleObserver
                            public void onError(Throwable th) {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                C7309ctl.this.b(new AbstractC4213baK.b(str, str2, StatusCode.INTERNAL_ERROR));
                                C7309ctl.a(InterfaceC1078Nw.ad, null);
                            }
                        });
                    } else {
                        C1044Mm.e("offlineData", "Saving episode details, season details already saved");
                        ((BookmarkStore) C1332Xp.b(BookmarkStore.class)).createOrUpdateBookmark(a2, str3);
                        C7272ctA.e(C7309ctl.this.c, a2, null, str3, i, C7309ctl.this.a, runnable);
                        C7309ctl.this.f.c(a2.w(), a2.getId(), OfflineVideoImageUtil.ImageType.a, C7309ctl.this.d(str, str2, a2.w()));
                    }
                }

                @Override // io.reactivex.SingleObserver
                public void onError(Throwable th) {
                    C7309ctl.this.b(new AbstractC4213baK.b(str, str2, StatusCode.INTERNAL_ERROR));
                    C7309ctl.a(InterfaceC1078Nw.ad, null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Status status, InterfaceC5198buI interfaceC5198buI) {
        String str = "serializeMetadataToDisc() got an error: " + status + " videoDetails" + interfaceC5198buI;
        C1044Mm.j("offlineData", str);
        if (status.g()) {
            return;
        }
        InterfaceC1598aHf.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.c.post(new Runnable() { // from class: o.cto
            @Override // java.lang.Runnable
            public final void run() {
                C7309ctl.this.i();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        C1044Mm.a("offlineData", "updateDataAndNotify");
        synchronized (this) {
            if (this.h.getAndSet(false)) {
                this.b = this.a.b();
            }
            this.e = this.a.c();
            C1044Mm.c("offlineData", "updateDataAndNotify profileCount=%d falkorCount=%d offlineCount=%d", Integer.valueOf(this.b.size()), Integer.valueOf(this.e.size()), Integer.valueOf(this.j.size()));
            final List<C7460cwd> a2 = C7322cty.a(this.j, this.e);
            final List<InterfaceC7464cwh> a3 = C7322cty.a(this.b);
            C8187dfe.c(new Runnable() { // from class: o.ctj
                @Override // java.lang.Runnable
                public final void run() {
                    C7309ctl.this.c(a2, a3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(List list, List list2) {
        this.g.e(this.j, list, list2);
    }

    private void h() {
        if (this.b.size() < 6) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C5336bwo> it = this.b.iterator();
        while (it.hasNext()) {
            C5336bwo next = it.next();
            if (d(next.e)) {
                arrayList.add(next);
                it.remove();
            }
        }
        C7272ctA.c(this.a, arrayList);
    }

    private void a() {
        HashMap hashMap = new HashMap();
        for (C5327bwf c5327bwf : this.e) {
            if (c5327bwf.ao == VideoType.SHOW.getKey()) {
                hashMap.put(c5327bwf.aq, c5327bwf);
            }
        }
        for (C5327bwf c5327bwf2 : this.e) {
            if (c(c5327bwf2)) {
                hashMap.remove(c5327bwf2.T);
            }
            if (hashMap.isEmpty()) {
                break;
            }
        }
        if (hashMap.isEmpty()) {
            return;
        }
        C1044Mm.c("offlineData", "deleteShowsWithNoEpisodes %d shows", Integer.valueOf(hashMap.size()));
        e(this.a, new ArrayList(hashMap.values()));
    }

    private void e(C5291bvw c5291bvw, List<C5327bwf> list) {
        C7272ctA.a(c5291bvw, list);
        for (C5327bwf c5327bwf : list) {
            C1044Mm.c("offlineData", "deleteVideosAndImages videoId = %s", c5327bwf.aq);
            this.f.a(c5327bwf.aq);
        }
    }

    private boolean d(String str) {
        for (C5327bwf c5327bwf : this.e) {
            if (str.equals(c5327bwf.Y)) {
                return false;
            }
        }
        return true;
    }

    private boolean b() {
        for (InterfaceC5206buQ interfaceC5206buQ : this.j.values()) {
            if (a(interfaceC5206buQ.aH_()) == null) {
                return true;
            }
        }
        return false;
    }

    private C5327bwf a(String str) {
        for (C5327bwf c5327bwf : this.e) {
            if (str.equals(c5327bwf.aq)) {
                return c5327bwf;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        for (C5327bwf c5327bwf : this.e) {
            if (c5327bwf.ao == VideoType.SHOW.getKey() && str.equals(c5327bwf.aq)) {
                return false;
            }
        }
        return true;
    }

    private boolean a(C5327bwf c5327bwf) {
        String str;
        OfflineVideoImageUtil offlineVideoImageUtil = this.f;
        String str2 = c5327bwf.aq;
        OfflineVideoImageUtil.ImageType imageType = OfflineVideoImageUtil.ImageType.a;
        if (offlineVideoImageUtil.a(str2, imageType)) {
            return !((!c(c5327bwf) || (str = c5327bwf.T) == null) ? true : this.f.a(str, imageType));
        }
        return true;
    }

    private static boolean c(C5327bwf c5327bwf) {
        return c5327bwf.ao == VideoType.EPISODE.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OfflineVideoImageUtil.c d(final String str, final String str2, final String str3) {
        if (str3 == null || str3.isEmpty()) {
            return null;
        }
        return new OfflineVideoImageUtil.c() { // from class: o.ctl.4
            @Override // com.netflix.mediaclient.ui.offline.OfflineVideoImageUtil.c
            public void d() {
                C7309ctl.this.b(new AbstractC4213baK.d(str, str2, str3));
            }

            @Override // com.netflix.mediaclient.ui.offline.OfflineVideoImageUtil.c
            public void c() {
                C7309ctl.this.b(new AbstractC4213baK.c(str, str2, str3, StatusCode.OK));
            }
        };
    }
}
