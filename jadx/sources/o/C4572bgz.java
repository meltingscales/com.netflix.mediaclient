package o;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.media.PreferredLanguageData;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlaybackConfig;
import com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestFlavor;
import com.netflix.mediaclient.servicemgr.PlayerPrefetchSource;
import com.netflix.mediaclient.storage.db.PersistedManifestDatabase;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import o.InterfaceC4522bgB;
import org.json.JSONObject;

/* renamed from: o.bgz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4572bgz implements InterfaceC4524bgD {
    private static final long a = TimeUnit.SECONDS.toMillis(1);
    private final C4469bfB b;
    private final C4390bdc d;
    private final Context f;
    private final Handler g;
    private int j;
    private C4523bgC k;
    private PersistedManifestDatabase l;
    private InterfaceC4421beG n;
    private final HandlerThread p;
    private final Handler r;
    private int i = -1;
    private int h = -1;
    protected final Map<C5331bwj, InterfaceC4525bgE> c = new HashMap();
    private final List<Long> e = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    private final Map<C5331bwj, d> f13595o = new HashMap();
    private Runnable m = new Runnable() { // from class: o.bgz.6
        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList(C4572bgz.this.c.values());
            Collections.sort(arrayList);
            int size = arrayList.size();
            int i = C4572bgz.this.j;
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                InterfaceC4525bgE interfaceC4525bgE = (InterfaceC4525bgE) it.next();
                if (interfaceC4525bgE.aw() || i2 < size - i) {
                    C4572bgz.this.b(interfaceC4525bgE);
                    it.remove();
                    i2++;
                }
            }
            if (C4572bgz.this.l != null) {
                C4572bgz.this.f().d(AbstractC4566bgt.B());
            }
        }
    };

    public void a(InterfaceC4421beG interfaceC4421beG) {
        this.n = interfaceC4421beG;
    }

    public InterfaceC4900boc b() {
        return this.b;
    }

    public static C5331bwj c(List<C5331bwj> list, long j) {
        for (C5331bwj c5331bwj : list) {
            C1044Mm.c("NfManifestCache", "getManifestKey %d", Long.valueOf(c5331bwj.a()));
            if (c5331bwj.a() == j) {
                return c5331bwj;
            }
        }
        return null;
    }

    public void c(ConnectivityUtils.NetType netType) {
        a(netType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bgz$10  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ConnectivityUtils.NetType.values().length];
            c = iArr;
            try {
                iArr[ConnectivityUtils.NetType.wifi.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[ConnectivityUtils.NetType.mobile.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[ConnectivityUtils.NetType.wired.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void a(ConnectivityUtils.NetType netType) {
        if (netType == null) {
            this.i = -1;
            this.h = -1;
            return;
        }
        this.i = netType.ordinal();
        int i = AnonymousClass10.c[netType.ordinal()];
        if (i == 1) {
            this.h = ConnectivityUtils.d(ConnectivityUtils.j(this.f));
        } else if (i != 2) {
            this.h = -1;
        } else {
            this.h = ConnectivityUtils.c((TelephonyManager) this.f.getSystemService("phone"));
        }
        C1044Mm.c("NfManifestCache", "updateCurrentNetworkType %s %s", Integer.valueOf(this.i), Integer.valueOf(this.h));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bgz$d */
    /* loaded from: classes3.dex */
    public static class d {
        private PlayerPrefetchSource b;
        private List<c> d = new ArrayList();

        List<c> a() {
            return this.d;
        }

        void b(PlayerPrefetchSource playerPrefetchSource) {
            this.b = playerPrefetchSource;
        }

        PlayerPrefetchSource d() {
            return this.b;
        }

        d(PlayerPrefetchSource playerPrefetchSource) {
            this.b = playerPrefetchSource;
        }

        void b(InterfaceC4522bgB.c cVar, boolean z) {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            if (cVar != null) {
                this.d.add(new c(cVar, z));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bgz$c */
    /* loaded from: classes3.dex */
    public static class c {
        private final boolean c;
        private final InterfaceC4522bgB.c e;

        public c(InterfaceC4522bgB.c cVar, boolean z) {
            this.e = cVar;
            this.c = z;
        }
    }

    public C4572bgz(Context context, Looper looper, C4390bdc c4390bdc, boolean z) {
        this.j = 20;
        this.f = context;
        this.g = new Handler(looper);
        this.d = c4390bdc;
        HandlerThread handlerThread = new HandlerThread("NfManifestCacheWorkerThread", 0);
        this.p = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.r = handler;
        this.b = new C4469bfB(c4390bdc, new Handler(handlerThread.getLooper()));
        if (z) {
            this.j = 10;
        }
        a(TN.a.d());
        handler.post(new Runnable() { // from class: o.bgy
            @Override // java.lang.Runnable
            public final void run() {
                C4572bgz.this.j();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.l = PersistedManifestDatabase.e(this.f);
        f().d();
    }

    @Override // o.InterfaceC4522bgB
    public void c(Long l, C4877boF c4877boF, InterfaceC4522bgB.c cVar) {
        d(Collections.singletonList(l), cVar, c4877boF, (aHT) null);
    }

    public void c(List<Long> list, InterfaceC4522bgB.c cVar, C4877boF c4877boF, aHT aht) {
        d(list, cVar, c4877boF, aht);
    }

    private void d(final List<Long> list, final InterfaceC4522bgB.c cVar, final C4877boF c4877boF, final aHT aht) {
        this.g.post(new Runnable() { // from class: o.bgz.4
            @Override // java.lang.Runnable
            public void run() {
                for (Long l : list) {
                    C4572bgz.this.e.remove(l);
                }
            }
        });
        this.r.post(new Runnable() { // from class: o.bgz.8
            @Override // java.lang.Runnable
            public void run() {
                InterfaceC4525bgE interfaceC4525bgE;
                ArrayList arrayList = new ArrayList(list.size());
                for (Long l : list) {
                    PreferredLanguageData preferredLanguageData = c4877boF.f;
                    String str = "";
                    String audioCode = (preferredLanguageData == null || preferredLanguageData.getAudioCode() == null) ? "" : preferredLanguageData.getAudioCode();
                    String subtitleCode = (preferredLanguageData == null || preferredLanguageData.getSubtitleCode() == null) ? "" : preferredLanguageData.getSubtitleCode();
                    String bool = (preferredLanguageData == null || preferredLanguageData.isAssistive() == null) ? "" : preferredLanguageData.isAssistive().toString();
                    C4884boM b = c4877boF.b(l);
                    if (b != null && b.d() != null) {
                        str = b.d();
                    }
                    String str2 = str;
                    long longValue = l.longValue();
                    int i = C4572bgz.this.i;
                    int i2 = C4572bgz.this.h;
                    C4877boF c4877boF2 = c4877boF;
                    C5331bwj c5331bwj = new C5331bwj(longValue, i, i2, c4877boF2.e, c4877boF2.i, audioCode, subtitleCode, bool, str2);
                    InterfaceC4525bgE interfaceC4525bgE2 = null;
                    if (b != null && b.e()) {
                        interfaceC4525bgE = null;
                    } else {
                        interfaceC4525bgE = c(c5331bwj);
                        if (interfaceC4525bgE == null && C4572bgz.this.l != null && (interfaceC4525bgE = C4572bgz.this.f().c(c5331bwj, AbstractC4566bgt.B())) != null) {
                            C4572bgz.this.c.put(c5331bwj, interfaceC4525bgE);
                        }
                    }
                    if (!c4877boF.b || interfaceC4525bgE == null || interfaceC4525bgE.n() == null || !Config_FastProperty_PlaybackConfig.nocacheLive()) {
                        interfaceC4525bgE2 = interfaceC4525bgE;
                    } else {
                        C1044Mm.e("NfManifestCache", "ignoring live manifest - refetching from server");
                    }
                    if (interfaceC4525bgE2 != null) {
                        C4572bgz.this.d(c5331bwj, interfaceC4525bgE2, cVar, true);
                        C4572bgz.this.l();
                        C1044Mm.a("NfManifestCache", "manifest available for %d", l);
                    } else {
                        arrayList.add(c5331bwj);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                C4572bgz c4572bgz = C4572bgz.this;
                InterfaceC4522bgB.c cVar2 = cVar;
                C4877boF c4877boF3 = c4877boF;
                c4572bgz.c(arrayList, cVar2, c4877boF3.b, c4877boF3.a, c4877boF3.j, c4877boF3.c, c4877boF3.h, aht, c4877boF3);
            }

            private InterfaceC4525bgE c(C5331bwj c5331bwj) {
                InterfaceC4525bgE interfaceC4525bgE = C4572bgz.this.c.get(c5331bwj);
                if (interfaceC4525bgE == null || !interfaceC4525bgE.aw()) {
                    return interfaceC4525bgE;
                }
                C1044Mm.a("NfManifestCache", "ignoring expired manifest or manifest refresh for language hydration");
                return null;
            }
        });
    }

    public void d(final Long l, PreferredLanguageData preferredLanguageData) {
        C1044Mm.a("NfManifestCache", "remove manifest %s", l);
        final String audioCode = preferredLanguageData != null ? preferredLanguageData.getAudioCode() : null;
        final String subtitleCode = preferredLanguageData != null ? preferredLanguageData.getSubtitleCode() : null;
        final Boolean isAssistive = preferredLanguageData != null ? preferredLanguageData.isAssistive() : null;
        this.r.post(new Runnable() { // from class: o.bgz.9
            /* JADX WARN: Removed duplicated region for block: B:43:0x005e A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:45:0x007b A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:48:0x006e A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0051 A[SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r7 = this;
                    o.bgz r0 = o.C4572bgz.this
                    java.util.Map<o.bwj, o.bgE> r0 = r0.c
                    java.util.Set r0 = r0.entrySet()
                    java.util.Iterator r0 = r0.iterator()
                Lc:
                    boolean r1 = r0.hasNext()
                    java.lang.String r2 = "NfManifestCache"
                    if (r1 == 0) goto L9f
                    java.lang.Object r1 = r0.next()
                    java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                    java.lang.Object r3 = r1.getKey()
                    o.bwj r3 = (o.C5331bwj) r3
                    long r3 = r3.a()
                    java.lang.Long r5 = r2
                    long r5 = r5.longValue()
                    int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r3 != 0) goto Lc
                    java.lang.String r3 = r3
                    java.lang.String r4 = ""
                    if (r3 != 0) goto L41
                    java.lang.Object r3 = r1.getKey()
                    o.bwj r3 = (o.C5331bwj) r3
                    java.lang.String r3 = r3.c()
                    if (r3 != r4) goto Lc
                    goto L4d
                L41:
                    java.lang.Object r5 = r1.getKey()
                    o.bwj r5 = (o.C5331bwj) r5
                    java.lang.String r5 = r5.c()
                    if (r3 != r5) goto Lc
                L4d:
                    java.lang.String r3 = r4
                    if (r3 != 0) goto L5e
                    java.lang.Object r3 = r1.getKey()
                    o.bwj r3 = (o.C5331bwj) r3
                    java.lang.String r3 = r3.j()
                    if (r3 != r4) goto Lc
                    goto L6a
                L5e:
                    java.lang.Object r5 = r1.getKey()
                    o.bwj r5 = (o.C5331bwj) r5
                    java.lang.String r5 = r5.j()
                    if (r3 != r5) goto Lc
                L6a:
                    java.lang.Boolean r3 = r5
                    if (r3 != 0) goto L7b
                    java.lang.Object r1 = r1.getKey()
                    o.bwj r1 = (o.C5331bwj) r1
                    java.lang.String r1 = r1.e()
                    if (r1 != r4) goto Lc
                    goto L8f
                L7b:
                    java.lang.String r3 = r3.toString()
                    java.lang.Object r1 = r1.getKey()
                    o.bwj r1 = (o.C5331bwj) r1
                    java.lang.String r1 = r1.e()
                    boolean r1 = r3.equals(r1)
                    if (r1 == 0) goto Lc
                L8f:
                    java.lang.Long r1 = r2
                    java.lang.Object[] r1 = new java.lang.Object[]{r1}
                    java.lang.String r3 = "M-CACHE, remove %d"
                    o.C1044Mm.a(r2, r3, r1)
                    r0.remove()
                    goto Lc
                L9f:
                    o.bgz r0 = o.C4572bgz.this
                    java.util.Map r0 = o.C4572bgz.h(r0)
                    java.util.Set r0 = r0.entrySet()
                    java.util.Iterator r0 = r0.iterator()
                Lad:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto Ldc
                    java.lang.Object r1 = r0.next()
                    java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                    java.lang.Object r1 = r1.getKey()
                    o.bwj r1 = (o.C5331bwj) r1
                    long r3 = r1.a()
                    java.lang.Long r1 = r2
                    long r5 = r1.longValue()
                    int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r1 != 0) goto Lad
                    java.lang.Long r1 = r2
                    java.lang.Object[] r1 = new java.lang.Object[]{r1}
                    java.lang.String r3 = "M-CACHE, remove pending %d"
                    o.C1044Mm.a(r2, r3, r1)
                    r0.remove()
                    goto Lad
                Ldc:
                    o.bgz r0 = o.C4572bgz.this
                    com.netflix.mediaclient.storage.db.PersistedManifestDatabase r0 = o.C4572bgz.i(r0)
                    if (r0 == 0) goto Lf3
                    o.bgz r0 = o.C4572bgz.this
                    o.bgC r0 = o.C4572bgz.f(r0)
                    java.lang.Long r1 = r2
                    long r1 = r1.longValue()
                    r0.a(r1)
                Lf3:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C4572bgz.AnonymousClass9.run():void");
            }
        });
        this.g.post(new Runnable() { // from class: o.bgz.12
            @Override // java.lang.Runnable
            public void run() {
                C4572bgz.this.e.remove(l);
            }
        });
    }

    public void i() {
        this.r.post(new Runnable() { // from class: o.bgA
            @Override // java.lang.Runnable
            public final void run() {
                C4572bgz.this.h();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        C1044Mm.e("NfManifestCache", "remove non-supplemental manifests");
        this.c.entrySet().removeIf(new Predicate() { // from class: o.bgx
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean c2;
                c2 = C4572bgz.c((Map.Entry) obj);
                return c2;
            }
        });
        if (this.l != null) {
            f().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(Map.Entry entry) {
        return !((InterfaceC4525bgE) entry.getValue()).au();
    }

    public void a(final List<C5102bsS> list) {
        if (list.size() == 0) {
            C1044Mm.e("NfManifestCache", "prepare has list contains no movie");
        } else {
            this.r.post(new Runnable() { // from class: o.bgz.15
                @Override // java.lang.Runnable
                public void run() {
                    C4572bgz.this.c(list);
                }
            });
        }
    }

    public void d() {
        a(true);
    }

    private void a(final boolean z) {
        C1044Mm.e("NfManifestCache", "clear all manifest");
        this.r.post(new Runnable() { // from class: o.bgz.14
            @Override // java.lang.Runnable
            public void run() {
                C4572bgz.this.c.clear();
                C4572bgz.this.f13595o.clear();
                if (!z || C4572bgz.this.l == null) {
                    return;
                }
                C1044Mm.a("NfManifestCache", "M-CACHE-PERSIST, clear, removed %s entries", Integer.valueOf(C4572bgz.this.f().d()));
            }
        });
        this.g.post(new Runnable() { // from class: o.bgz.13
            @Override // java.lang.Runnable
            public void run() {
                C4572bgz.this.e.clear();
            }
        });
    }

    public void c() {
        this.r.post(new Runnable() { // from class: o.bgw
            @Override // java.lang.Runnable
            public final void run() {
                PersistedManifestDatabase.d();
            }
        });
        this.p.quitSafely();
    }

    public void a() {
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<C5331bwj> list, InterfaceC4522bgB.c cVar, boolean z, boolean z2, boolean z3, String str, String str2, aHT aht, C4877boF c4877boF) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (C5331bwj c5331bwj : list) {
            C4419beE c4419beE = null;
            C4884boM b = c4877boF != null ? c4877boF.b(Long.valueOf(c5331bwj.a())) : null;
            if (!z || str2 != null) {
                C1044Mm.a("NfManifestCache", "getLicensedManifestKeyRequest %d", Long.valueOf(c5331bwj.a()));
                c4419beE = e(z3, !z);
            }
            d dVar = this.f13595o.get(c5331bwj);
            C4395bdh d2 = d(str2, c5331bwj, c4419beE, b);
            if (dVar != null) {
                C1044Mm.a("NfManifestCache", "fetchStreamingManifests is pending %d ...", Long.valueOf(c5331bwj.a()));
                if (z) {
                    C1044Mm.a("NfManifestCache", "fetchStreamingManifests is pending %s, try STANDARD request for playback.", c5331bwj);
                    if (!this.d.e(d2, d(Collections.singletonList(c5331bwj), cVar))) {
                    }
                }
                dVar.b(cVar, z);
            } else {
                arrayList2.add(c5331bwj);
                arrayList.add(d2);
                this.f13595o.put(c5331bwj, new d(PlayerPrefetchSource.PlayByUser));
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.d.a((C4395bdh[]) arrayList.toArray(new C4395bdh[0]), z ? ManifestRequestFlavor.STANDARD : ManifestRequestFlavor.PREFETCH, z3, str, z2, c4877boF != null && c4877boF.d, d(arrayList2, cVar), aht);
        this.r.post(new Runnable() { // from class: o.bgz.11
            @Override // java.lang.Runnable
            public void run() {
                C4572bgz.this.l();
            }
        });
    }

    private C4395bdh d(String str, C5331bwj c5331bwj, C4419beE c4419beE, C4884boM c4884boM) {
        if (c4884boM == null) {
            return new C4395bdh(c5331bwj.a(), c5331bwj.h(), c5331bwj.g(), str, c4419beE, c5331bwj.c(), c5331bwj.j(), c5331bwj.e(), null, null, null, null);
        }
        return new C4395bdh(c5331bwj.a(), c5331bwj.h(), c5331bwj.g(), str, c4419beE, c5331bwj.c(), c5331bwj.j(), c5331bwj.e(), c4884boM.b(), c4884boM.c(), c4884boM.a(), c4884boM.d());
    }

    private AbstractC4397bdj d(final List<C5331bwj> list, final InterfaceC4522bgB.c cVar) {
        return new AbstractC4397bdj() { // from class: o.bgz.5
            @Override // o.AbstractC4397bdj, o.InterfaceC4389bdb
            public void a(final JSONObject jSONObject, final Status status) {
                C4572bgz.this.r.post(new Runnable() { // from class: o.bgz.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        JSONObject jSONObject2;
                        if (!status.j() || (jSONObject2 = jSONObject) == null) {
                            C1044Mm.e("NfManifestCache", "fetchStreamingManifests failed");
                            for (C5331bwj c5331bwj : list) {
                                AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                                C4572bgz.this.b(c5331bwj, cVar, status);
                            }
                            return;
                        }
                        try {
                            AnonymousClass5 anonymousClass52 = AnonymousClass5.this;
                            C4572bgz.this.c(list, jSONObject2);
                            for (C5331bwj c5331bwj2 : list) {
                                InterfaceC4525bgE interfaceC4525bgE = C4572bgz.this.c.get(c5331bwj2);
                                if (interfaceC4525bgE != null) {
                                    AnonymousClass5 anonymousClass53 = AnonymousClass5.this;
                                    C4572bgz.this.d(c5331bwj2, interfaceC4525bgE, cVar, false);
                                } else {
                                    AnonymousClass5 anonymousClass54 = AnonymousClass5.this;
                                    C4572bgz.this.b(c5331bwj2, cVar, new NetflixStatus(StatusCode.MANIFEST_PARSE_ERROR));
                                }
                            }
                        } catch (Exception e2) {
                            for (C5331bwj c5331bwj3 : list) {
                                AnonymousClass5 anonymousClass55 = AnonymousClass5.this;
                                C4572bgz.this.b(c5331bwj3, cVar, new NetflixStatus(StatusCode.MANIFEST_PARSE_ERROR, e2));
                            }
                        }
                    }
                });
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(java.util.List<o.C5102bsS> r26) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4572bgz.c(java.util.List):void");
    }

    private C4419beE e(boolean z, boolean z2) {
        boolean licensedManifestStandard;
        if (z) {
            return null;
        }
        if (z2) {
            licensedManifestStandard = Config_FastProperty_PlaybackConfig.licensedManifestPrefetch();
        } else {
            licensedManifestStandard = Config_FastProperty_PlaybackConfig.licensedManifestStandard();
        }
        if (licensedManifestStandard) {
            return this.n.a(z2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<C5331bwj> list, JSONObject jSONObject) {
        try {
            c(list, jSONObject);
        } catch (Exception e2) {
            C1044Mm.b("NfManifestCache", e2, "unable to parse prefetched manifest", new Object[0]);
        }
        for (C5331bwj c5331bwj : list) {
            InterfaceC4525bgE interfaceC4525bgE = this.c.get(c5331bwj);
            d dVar = this.f13595o.get(c5331bwj);
            if (dVar != null) {
                if (interfaceC4525bgE != null) {
                    interfaceC4525bgE.c(dVar.d());
                    e(c5331bwj, interfaceC4525bgE);
                } else {
                    c(c5331bwj, InterfaceC1078Nw.ar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<C5331bwj> list, JSONObject jSONObject) {
        for (InterfaceC4525bgE interfaceC4525bgE : C4563bgq.e(jSONObject)) {
            if (interfaceC4525bgE == null) {
                C1044Mm.e("NfManifestCache", "M-CACHE, processManifestResponse has error");
            } else {
                C5331bwj c2 = c(list, interfaceC4525bgE.aa().longValue());
                try {
                    e(interfaceC4525bgE, c2);
                } catch (Exception unused) {
                    C1044Mm.j("NfManifestCache", "M-CACHE, fail to add AuxiliaryManifests for %d ", interfaceC4525bgE.aa());
                }
                d(interfaceC4525bgE, c2);
            }
        }
    }

    private void e(InterfaceC4525bgE interfaceC4525bgE, C5331bwj c5331bwj) {
        List<? extends InterfaceC4525bgE> J2 = interfaceC4525bgE.J();
        if (J2 != null && !J2.isEmpty()) {
            for (InterfaceC4525bgE interfaceC4525bgE2 : J2) {
                if (!interfaceC4525bgE2.av()) {
                    C5331bwj c5331bwj2 = new C5331bwj(interfaceC4525bgE2.aa().longValue(), c5331bwj.b(), c5331bwj.d(), c5331bwj.h(), c5331bwj.g(), c5331bwj.c(), c5331bwj.j(), c5331bwj.e(), interfaceC4525bgE.K() == null ? "" : interfaceC4525bgE.K());
                    if (interfaceC4525bgE2 instanceof AbstractC4566bgt) {
                        ((AbstractC4566bgt) interfaceC4525bgE2).b(-1L);
                    }
                    d(interfaceC4525bgE2, c5331bwj2);
                }
            }
        }
    }

    private void d(InterfaceC4525bgE interfaceC4525bgE, C5331bwj c5331bwj) {
        if (c5331bwj == null) {
            C1044Mm.e("NfManifestCache", "processManifestResponse got a manifest that we didn't request %d", interfaceC4525bgE.aa());
            c5331bwj = new C5331bwj(interfaceC4525bgE.aa().longValue(), this.i, this.h, false, true, c5331bwj.c(), c5331bwj.j(), c5331bwj.e());
        }
        this.c.put(c5331bwj, interfaceC4525bgE);
        if (this.l != null) {
            if (interfaceC4525bgE instanceof AbstractC4566bgt) {
                this.r.post(new e(c5331bwj, (AbstractC4566bgt) interfaceC4525bgE));
            }
            C1044Mm.a("NfManifestCache", "M-CACHE, add %d", interfaceC4525bgE.aa());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<C5331bwj> list, Status status) {
        for (C5331bwj c5331bwj : list) {
            c(c5331bwj, status);
        }
    }

    private void e(C5331bwj c5331bwj, InterfaceC4525bgE interfaceC4525bgE) {
        List<c> a2;
        d remove = this.f13595o.remove(c5331bwj);
        if (remove == null || (a2 = remove.a()) == null) {
            return;
        }
        for (c cVar : a2) {
            c(c5331bwj, interfaceC4525bgE, cVar.e, false);
        }
    }

    private void c(C5331bwj c5331bwj, Status status) {
        List<c> a2;
        d remove = this.f13595o.remove(c5331bwj);
        if (remove == null || (a2 = remove.a()) == null) {
            return;
        }
        for (c cVar : a2) {
            if (cVar.c) {
                c(Collections.singletonList(c5331bwj), cVar.e, true, false, false, null, null, null, null);
            } else {
                e(c5331bwj, cVar.e, status);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(C5331bwj c5331bwj, InterfaceC4525bgE interfaceC4525bgE, InterfaceC4522bgB.c cVar, boolean z) {
        c(c5331bwj, interfaceC4525bgE, cVar, z);
        e(c5331bwj, interfaceC4525bgE);
    }

    private void c(C5331bwj c5331bwj, final InterfaceC4525bgE interfaceC4525bgE, final InterfaceC4522bgB.c cVar, final boolean z) {
        final long a2 = c5331bwj.a();
        this.g.post(new Runnable() { // from class: o.bgz.3
            @Override // java.lang.Runnable
            public void run() {
                if (C4572bgz.this.e.contains(Long.valueOf(a2))) {
                    C1044Mm.a("NfManifestCache", "callback is aborted for movie %d", Long.valueOf(a2));
                    C4572bgz.this.e.remove(Long.valueOf(a2));
                    return;
                }
                long j = a2;
                C1044Mm.a("NfManifestCache", "manifest success for movie %d %s", Long.valueOf(j), cVar.d());
                cVar.d(interfaceC4525bgE, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(C5331bwj c5331bwj, InterfaceC4522bgB.c cVar, Status status) {
        e(c5331bwj, cVar, status);
        c(c5331bwj, status);
    }

    private void e(C5331bwj c5331bwj, final InterfaceC4522bgB.c cVar, final Status status) {
        final long a2 = c5331bwj.a();
        this.g.post(new Runnable() { // from class: o.bgz.7
            @Override // java.lang.Runnable
            public void run() {
                if (C4572bgz.this.e.contains(Long.valueOf(a2))) {
                    C1044Mm.a("NfManifestCache", "callback is aborted for movie %d", Long.valueOf(a2));
                    C4572bgz.this.e.remove(Long.valueOf(a2));
                    return;
                }
                C1044Mm.a("NfManifestCache", "manifest error for movie %d", Long.valueOf(a2));
                cVar.d(Long.valueOf(a2), status);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.r.removeCallbacks(this.m);
        this.r.postDelayed(this.m, a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(InterfaceC4525bgE interfaceC4525bgE) {
        Iterator<Map.Entry<C5331bwj, InterfaceC4525bgE>> it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().equals(interfaceC4525bgE)) {
                C1044Mm.a("NfManifestCache", "M-CACHE, remove %d", interfaceC4525bgE.aa());
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bgz$e */
    /* loaded from: classes3.dex */
    public class e implements Runnable {
        private final C5331bwj a;
        private final AbstractC4566bgt e;

        public e(C5331bwj c5331bwj, AbstractC4566bgt abstractC4566bgt) {
            this.a = c5331bwj;
            this.e = abstractC4566bgt;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4523bgC f = C4572bgz.this.f();
            C5331bwj c5331bwj = this.a;
            AbstractC4566bgt abstractC4566bgt = this.e;
            f.d(c5331bwj, abstractC4566bgt, abstractC4566bgt.O());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C4523bgC f() {
        if (this.k == null) {
            this.k = new C4523bgC(this.l.c());
        }
        return this.k;
    }
}
