package o;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.service.job.NetflixJob;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.storage.db.OfflineDatabase;
import com.netflix.mediaclient.ui.offline.SmartDownloadController$scheduleSmartDownloadsResumeJobIfQueueNotEmpty$1;
import com.netflix.mediaclient.util.PlayContext;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.C5103bsT;
import o.C5334bwm;
import o.C7333cuI;
import o.C8576dqs;
import o.C8632dsu;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC4208baF;
import o.dpR;

@SuppressLint({"CheckResult"})
/* renamed from: o.cuI  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7333cuI extends AbstractC5166btd implements InterfaceC4251baw {
    public static final b c = new b(null);
    public static final int e = 8;
    private final Runnable a;
    private final InterfaceC7221csC b;
    private final Handler d;
    private final InterfaceC4208baF f;
    private final C8165dfI g;
    private final BroadcastReceiver h;
    private final C7332cuH i;
    private final C7340cuP j;
    private String l;
    private C5246bvD n;

    /* renamed from: o  reason: collision with root package name */
    private final NetflixJob f13773o;

    /* renamed from: o.cuI$d */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[NetflixJob.NetflixJobId.values().length];
            try {
                iArr[NetflixJob.NetflixJobId.SMART_DOWNLOAD_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            b = iArr;
        }
    }

    @Override // o.InterfaceC4209baG
    public boolean c() {
        return false;
    }

    public final void d(String str) {
        this.l = str;
    }

    public final C5246bvD g() {
        return this.n;
    }

    @Override // com.netflix.mediaclient.service.job.NetflixJobExecutor
    public void onNetflixStopJob(NetflixJob.NetflixJobId netflixJobId) {
        C8632dsu.c((Object) netflixJobId, "");
    }

    public C7333cuI(Context context, InterfaceC4208baF interfaceC4208baF, C7332cuH c7332cuH, InterfaceC7221csC interfaceC7221csC, C7340cuP c7340cuP) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC4208baF, "");
        C8632dsu.c((Object) c7332cuH, "");
        C8632dsu.c((Object) interfaceC7221csC, "");
        C8632dsu.c((Object) c7340cuP, "");
        this.f = interfaceC4208baF;
        this.i = c7332cuH;
        this.b = interfaceC7221csC;
        this.j = c7340cuP;
        this.n = C5246bvD.c.e(OfflineDatabase.d.c(context));
        this.d = new Handler(Looper.getMainLooper());
        this.g = new C8165dfI(10, TimeUnit.MINUTES.toMillis(10L));
        NetflixJob a2 = NetflixJob.a();
        C8632dsu.a(a2, "");
        this.f13773o = a2;
        this.a = new Runnable() { // from class: o.cuK
            @Override // java.lang.Runnable
            public final void run() {
                C7333cuI.o();
            }
        };
        this.h = new c();
    }

    @Override // o.InterfaceC4251baw
    public void a() {
        if (m()) {
            C8187dfe.c(new Runnable() { // from class: o.cuM
                @Override // java.lang.Runnable
                public final void run() {
                    C7333cuI.f(C7333cuI.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C7333cuI c7333cuI) {
        C8632dsu.c((Object) c7333cuI, "");
        c7333cuI.l();
        c7333cuI.t();
    }

    /* renamed from: o.cuI$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("SmartDownloadController");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o() {
        AbstractApplicationC1040Mh.getInstance().h().e(NetflixJob.NetflixJobId.SMART_DOWNLOAD_RESUME, false);
    }

    /* renamed from: o.cuI$c */
    /* loaded from: classes4.dex */
    public static final class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            if (intent == null || !C7333cuI.this.m()) {
                return;
            }
            String action = intent.getAction();
            C5103bsT.c e = C5103bsT.e(intent);
            C8632dsu.a(e, "");
            if (e.d == IPlayer.PlaybackType.OfflinePlayback) {
                C7333cuI.c.getLogTag();
                if (C8632dsu.c((Object) "com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_STARTED", (Object) action)) {
                    C7333cuI.this.d(e.c);
                } else if (C8632dsu.c((Object) "com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_ENDED", (Object) action)) {
                    C7333cuI.this.d((String) null);
                    C7333cuI.this.c(e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(C5103bsT.c cVar) {
        String str = cVar.c;
        C8632dsu.a(str, "");
        a(this, str, cVar.e, 0, 4, null);
    }

    static /* synthetic */ void a(C7333cuI c7333cuI, String str, long j, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueueWatchedEpisodeForSmartDownloads");
        }
        if ((i2 & 4) != 0) {
            i = PlayContextImp.q;
        }
        c7333cuI.c(str, j, i);
    }

    private final void c(String str, long j, int i) {
        C7460cwd d2;
        Map d3;
        Map k;
        Throwable th;
        if (this.f.s() && (d2 = this.j.d(str)) != null && d2.getType() == VideoType.EPISODE && !d2.aT_()) {
            b bVar = c;
            bVar.getLogTag();
            if (TimeUnit.MILLISECONDS.toSeconds(j) >= d2.aE_().av_()) {
                bVar.getLogTag();
                InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                VideoType type = d2.getType();
                aVar.a("SmartDownloadController.playStartStopReceiver storing WatchedEpisode of type: " + type + " for Video " + str);
                InterfaceC5160btX aE_ = d2.aE_();
                C8632dsu.a(aE_, "");
                if (aE_.aH_() == null) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d3 = dqE.d();
                    k = dqE.k(d3);
                    C1596aHd c1596aHd = new C1596aHd("SmartDownloadController tried to download a playable with no id.", null, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b2 = c1596aHd.b();
                        if (b2 != null) {
                            String c2 = errorType.c();
                            c1596aHd.a(c2 + " " + b2);
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
                }
                String aH_ = aE_.aH_();
                if (aH_ != null) {
                    this.n.e(new C5334bwm(aH_, true, aE_.x(), aE_.aw_(), aE_.aO_(), i));
                    h();
                }
            }
        }
    }

    @Override // o.InterfaceC4251baw
    public void f() {
        C8166dfJ.b(null, false, 3, null);
        c.getLogTag();
        q();
    }

    @Override // o.InterfaceC4251baw
    public void d() {
        C8166dfJ.b(null, false, 3, null);
        b bVar = c;
        bVar.getLogTag();
        if (m()) {
            bVar.getLogTag();
            l();
        }
    }

    private final void t() {
        Flowable<List<C5334bwm>> subscribeOn = this.n.d().observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io());
        final SmartDownloadController$scheduleSmartDownloadsResumeJobIfQueueNotEmpty$1 smartDownloadController$scheduleSmartDownloadsResumeJobIfQueueNotEmpty$1 = new drM<List<? extends C5334bwm>, Boolean>() { // from class: com.netflix.mediaclient.ui.offline.SmartDownloadController$scheduleSmartDownloadsResumeJobIfQueueNotEmpty$1
            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(List<C5334bwm> list) {
                C8632dsu.c((Object) list, "");
                return Boolean.valueOf(!list.isEmpty());
            }
        };
        Flowable take = subscribeOn.map(new Function() { // from class: o.cuO
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean b2;
                b2 = C7333cuI.b(drM.this, obj);
                return b2;
            }
        }).take(1L);
        C8632dsu.a(take, "");
        SubscribersKt.subscribeBy$default(take, (drM) null, (drO) null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.offline.SmartDownloadController$scheduleSmartDownloadsResumeJobIfQueueNotEmpty$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Boolean bool) {
                c(bool);
                return dpR.c;
            }

            public final void c(Boolean bool) {
                C8632dsu.d(bool);
                if (bool.booleanValue()) {
                    C7333cuI.this.k();
                }
            }
        }, 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (Boolean) drm.invoke(obj);
    }

    public final void h() {
        if (C4338bcd.d(TN.a.d())) {
            Flowable<List<String>> take = this.n.a().observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).take(1L);
            C8632dsu.a(take, "");
            SubscribersKt.subscribeBy$default(take, (drM) null, (drO) null, new drM<List<? extends String>, dpR>() { // from class: com.netflix.mediaclient.ui.offline.SmartDownloadController$startSmartDownloadIfConnectivity$1
                {
                    super(1);
                }

                public final void e(List<String> list) {
                    C7333cuI c7333cuI = C7333cuI.this;
                    C8632dsu.d(list);
                    c7333cuI.b(list);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(List<? extends String> list) {
                    e(list);
                    return dpR.c;
                }
            }, 3, (Object) null);
            return;
        }
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(List<String> list) {
        this.f.e((InterfaceC4208baF) this);
        for (final String str : list) {
            Flowable<List<C5334bwm>> take = this.n.b(str).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).take(1L);
            C8632dsu.a(take, "");
            SubscribersKt.subscribeBy$default(take, (drM) null, (drO) null, new drM<List<? extends C5334bwm>, dpR>() { // from class: com.netflix.mediaclient.ui.offline.SmartDownloadController$downloadNextEpisodesForWatchedEntities$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(List<? extends C5334bwm> list2) {
                    c(list2);
                    return dpR.c;
                }

                public final void c(List<C5334bwm> list2) {
                    String a2;
                    if (!list2.isEmpty()) {
                        C8632dsu.d(list2);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list2) {
                            if (((C5334bwm) obj).b() == null) {
                                arrayList.add(obj);
                            }
                        }
                        if (arrayList.isEmpty() || (a2 = C7333cuI.this.a(str, list2)) == null) {
                            return;
                        }
                        C7333cuI.this.e(0, arrayList, a2, str);
                        return;
                    }
                    C7333cuI.c.getLogTag();
                    C7333cuI.this.g().d(str);
                }
            }, 3, (Object) null);
        }
    }

    public final void e(int i, List<C5334bwm> list, String str, String str2) {
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        if (i >= list.size()) {
            return;
        }
        if (i >= 50) {
            InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
            aVar.a("List of episodes was " + list + " for show " + str2);
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("SmartDownloads tried to download more than 50 videos", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b2);
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
                return;
            } else {
                dVar.e().b(c1596aHd, th);
                return;
            }
        }
        this.i.c(str, new a(list.get(i), i, list, str2));
    }

    /* renamed from: o.cuI$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC1761aNg {
        final /* synthetic */ int a;
        final /* synthetic */ List<C5334bwm> c;
        final /* synthetic */ C5334bwm d;
        final /* synthetic */ String e;

        a(C5334bwm c5334bwm, int i, List<C5334bwm> list, String str) {
            this.d = c5334bwm;
            this.a = i;
            this.c = list;
            this.e = str;
        }

        @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
        public void a(InterfaceC5227bul interfaceC5227bul, Status status) {
            Map d;
            Map k;
            Throwable th;
            Map d2;
            Map k2;
            Throwable th2;
            C8632dsu.c((Object) status, "");
            if (status.i()) {
                b bVar = C7333cuI.c;
            } else if (interfaceC5227bul == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k2 = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("SmartDownloadController onEpisodeDetailsFetched episodeDetails was null", null, null, true, k2, false, false, 96, null);
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
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    Throwable th3 = c1596aHd.i;
                    if (th3 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th3 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    } else {
                        th2 = th3;
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
            } else if (interfaceC5227bul.getId() == null) {
                InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd2 = new C1596aHd("SPY-18618 SmartDownloadController onEpisodeDetailsFetched episodeDetails.id was null", null, null, true, k, false, false, 96, null);
                ErrorType errorType2 = c1596aHd2.a;
                if (errorType2 != null) {
                    c1596aHd2.e.put("errorType", errorType2.c());
                    String b2 = c1596aHd2.b();
                    if (b2 != null) {
                        String c2 = errorType2.c();
                        c1596aHd2.a(c2 + " " + b2);
                    }
                }
                if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                    th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                } else if (c1596aHd2.b() != null) {
                    th = new Throwable(c1596aHd2.b());
                } else {
                    Throwable th4 = c1596aHd2.i;
                    if (th4 == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th4 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    } else {
                        th = th4;
                    }
                }
                InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar2.a();
                if (a2 != null) {
                    a2.e(c1596aHd2, th);
                } else {
                    dVar2.e().b(c1596aHd2, th);
                }
            } else {
                String cb_ = interfaceC5227bul.cb_();
                if (cb_ != null) {
                    C7333cuI.this.c(this.d, cb_);
                    C7333cuI.this.e(this.a + 1, this.c, cb_, this.e);
                    return;
                }
                C7333cuI.this.g().a(this.d);
                InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                C5334bwm c5334bwm = this.d;
                aVar.a("SmartDownloadController.downloadNextEpisodesForShow nextEpisodeId was null after watching episode " + c5334bwm);
            }
        }
    }

    private final PlayContext a(C5334bwm c5334bwm) {
        long currentTimeMillis = System.currentTimeMillis();
        return new PlayContextImp("SmartDownloaded_" + currentTimeMillis, c5334bwm.f(), 0, 0, PlayLocationType.DOWNLOADS, null, null, null, null, null);
    }

    public final String a(String str, List<C5334bwm> list) {
        Object B;
        Object B2;
        Object B3;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list, "");
        List<C7460cwd> a2 = this.j.a(str);
        if (a2.isEmpty()) {
            B3 = C8576dqs.B((List<? extends Object>) list);
            return ((C5334bwm) B3).a();
        }
        B = C8576dqs.B((List<? extends Object>) list);
        C5334bwm c5334bwm = (C5334bwm) B;
        B2 = C8576dqs.B((List<? extends Object>) a2);
        InterfaceC5160btX aE_ = ((C7460cwd) B2).aE_();
        C8632dsu.a(aE_, "");
        if (c5334bwm.c() >= aE_.x() && c5334bwm.e() >= aE_.aw_()) {
            return c5334bwm.a();
        }
        return aE_.aH_();
    }

    public final void c(C5334bwm c5334bwm, String str) {
        C8632dsu.c((Object) c5334bwm, "");
        C8632dsu.c((Object) str, "");
        PlayContext a2 = a(c5334bwm);
        this.n.b(c5334bwm, str);
        this.f.b(new CreateRequest(str, VideoType.EPISODE, a2, C8126deW.c(), CreateRequest.DownloadRequestType.SmartDownload));
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        aVar.a("SmartDownloadController just enqueued a videoId " + str + " for " + c5334bwm + " in downloadNextEpisodeForWatchedEpisode");
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void b(final String str, Status status) {
        super.b(str, status);
        b bVar = c;
        bVar.getLogTag();
        if (str == null || status == null || status.c() != StatusCode.DL_NOT_ENOUGH_FREE_SPACE) {
            return;
        }
        bVar.getLogTag();
        Flowable<List<C5334bwm>> take = this.n.a(str).observeOn(AndroidSchedulers.mainThread()).take(1L);
        C8632dsu.a(take, "");
        SubscribersKt.subscribeBy$default(take, (drM) null, (drO) null, new drM<List<? extends C5334bwm>, dpR>() { // from class: com.netflix.mediaclient.ui.offline.SmartDownloadController$onCreateRequestResponse$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(List<? extends C5334bwm> list) {
                c(list);
                return dpR.c;
            }

            public final void c(List<C5334bwm> list) {
                Object y;
                InterfaceC4208baF interfaceC4208baF;
                C8632dsu.d(list);
                if (!list.isEmpty()) {
                    y = C8576dqs.y(list);
                    C5334bwm c5334bwm = (C5334bwm) y;
                    String b2 = c5334bwm.b();
                    if (b2 != null) {
                        C7333cuI.c.getLogTag();
                        if (C7333cuI.this.a(c5334bwm.a())) {
                            interfaceC4208baF = C7333cuI.this.f;
                            interfaceC4208baF.e(b2, VideoType.EPISODE, PlayContextImp.p);
                            InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                            String str2 = str;
                            aVar.a("SmartDownloadController just deleted and retried a download in onCreateRequestResponse for playable " + str2);
                        }
                    }
                }
            }
        }, 3, (Object) null);
    }

    @Override // o.InterfaceC4251baw
    public void e(final String str) {
        this.d.post(new Runnable() { // from class: o.cuL
            @Override // java.lang.Runnable
            public final void run() {
                C7333cuI.d(C7333cuI.this, str);
            }
        });
    }

    @Override // o.InterfaceC4251baw
    public void e() {
        this.d.post(new Runnable() { // from class: o.cuJ
            @Override // java.lang.Runnable
            public final void run() {
                C7333cuI.i(C7333cuI.this);
            }
        });
    }

    private final void a(final String str, final boolean z) {
        if (str != null) {
            Flowable<List<C5334bwm>> take = this.n.a(str).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).take(1L);
            C8632dsu.a(take, "");
            SubscribersKt.subscribeBy$default(take, (drM) null, (drO) null, new drM<List<? extends C5334bwm>, dpR>() { // from class: com.netflix.mediaclient.ui.offline.SmartDownloadController$deleteWatchedEpisodeByPlayableId$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(List<? extends C5334bwm> list) {
                    b(list);
                    return dpR.c;
                }

                public final void b(List<C5334bwm> list) {
                    Object y;
                    C8632dsu.d(list);
                    if (!list.isEmpty()) {
                        y = C8576dqs.y(list);
                        C5334bwm c5334bwm = (C5334bwm) y;
                        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                        String str2 = str;
                        aVar.a("SmartDownloadController.onDownloadCompleted received for a downloading episode. Will delete the associated watched episode for " + str2 + ".");
                        C7333cuI.c.getLogTag();
                        if (z) {
                            this.a(c5334bwm.a());
                        }
                        this.g().a(c5334bwm);
                    }
                }
            }, 3, (Object) null);
        }
    }

    public boolean a(String str) {
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) str, "");
        if (this.j.d(str) == null) {
            return false;
        }
        if (C8632dsu.c((Object) str, (Object) this.l)) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("SPY-13954 SmartDownloadController deleteOfflinePlayable: the playableId was used by the Player. Not deleting.", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b2);
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
            return false;
        }
        this.f.d(str);
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        aVar.a("SmartDownloadController just deleted a playable in deleteOfflinePlayable for " + str);
        return true;
    }

    @Override // o.InterfaceC4251baw
    public void d(boolean z) {
        synchronized (this) {
            boolean b2 = b();
            c.getLogTag();
            if (b2 != z) {
                C8157dfA.d(AbstractApplicationC1040Mh.d(), "smart_downloads_preference", z);
            }
            if (z) {
                l();
                C8632dsu.d(this.f.e((InterfaceC4208baF) this));
            } else {
                q();
                this.f.d(this);
                this.n.c();
                this.f.i();
                dpR dpr = dpR.c;
            }
        }
    }

    @Override // o.InterfaceC4251baw
    public boolean b() {
        boolean b2;
        synchronized (this) {
            b2 = C8157dfA.b(AbstractApplicationC1040Mh.d(), "smart_downloads_preference", true);
        }
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m() {
        return this.b.d() && b();
    }

    @Override // o.InterfaceC4251baw
    public void j() {
        this.n.c();
    }

    @Override // com.netflix.mediaclient.service.job.NetflixJobExecutor
    public void onNetflixStartJob(NetflixJob.NetflixJobId netflixJobId) {
        C8632dsu.c((Object) netflixJobId, "");
        if (d.b[netflixJobId.ordinal()] != 1 || this.g.d()) {
            return;
        }
        this.d.removeCallbacks(this.a);
        this.d.postDelayed(this.a, 10000L);
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        if (AbstractApplicationC1040Mh.getInstance().h().d(this.f13773o.b())) {
            n();
        }
        this.f13773o.b(5000L);
        AbstractApplicationC1040Mh.getInstance().h().a(this.f13773o);
    }

    private final void n() {
        if (AbstractApplicationC1040Mh.getInstance().h().d(this.f13773o.b())) {
            AbstractApplicationC1040Mh.getInstance().h().b(this.f13773o.b());
        }
    }

    private final void l() {
        c.getLogTag();
        this.j.b(this.h);
    }

    private final void q() {
        c.getLogTag();
        C8116deM.a(AbstractApplicationC1040Mh.d(), this.h);
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void a(InterfaceC5206buQ interfaceC5206buQ) {
        C8632dsu.c((Object) interfaceC5206buQ, "");
        c.getLogTag();
        a(interfaceC5206buQ.aH_(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C7333cuI c7333cuI, String str) {
        C8632dsu.c((Object) c7333cuI, "");
        c.getLogTag();
        c7333cuI.a(str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C7333cuI c7333cuI) {
        C8632dsu.c((Object) c7333cuI, "");
        c.getLogTag();
        c7333cuI.n.c();
    }
}
