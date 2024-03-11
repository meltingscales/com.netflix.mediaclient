package o;

import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.datasource.DataSpec;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixdatasource.NetflixNetworkError;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.CurrentNetworkInfo;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.EndPlayJson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;
import o.C4839bnU;
import o.InterfaceC4834bnP;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bnU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4839bnU {
    private CurrentNetworkInfo c;
    private final InterfaceC4834bnP.a d;
    private boolean i;
    private final long n;
    private final Map<DataSpec, C4857bnm> a = new HashMap();
    private final e h = new e();
    private final c f = new c();
    private final a g = new a();
    private final d b = new d();
    private final List<Pair<Long, CurrentNetworkInfo>> j = new CopyOnWriteArrayList();
    private Map<String, Long> e = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.i = true;
    }

    public C4839bnU(long j, InterfaceC4834bnP.a aVar) {
        this.d = aVar;
        this.n = j;
    }

    public void e(long j, CurrentNetworkInfo currentNetworkInfo) {
        this.c = currentNetworkInfo;
        this.j.add(Pair.create(Long.valueOf(j), currentNetworkInfo));
    }

    public long c() {
        return this.g.e();
    }

    public long j() {
        return this.g.a();
    }

    public List<EndPlayJson.j> f() {
        return this.h.d();
    }

    public List<EndPlayJson.f> b(long j) {
        if (this.j.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.j.size());
        Pair<Long, CurrentNetworkInfo> pair = this.j.get(0);
        int i = 1;
        while (i < this.j.size()) {
            Pair<Long, CurrentNetworkInfo> pair2 = this.j.get(i);
            arrayList.add(new EndPlayJson.f(((Long) pair.first).longValue(), ((Long) pair2.first).longValue(), (CurrentNetworkInfo) pair.second));
            i++;
            pair = pair2;
        }
        arrayList.add(new EndPlayJson.f(((Long) pair.first).longValue(), j, (CurrentNetworkInfo) pair.second));
        return arrayList;
    }

    public EndPlayJson.b[] b() {
        return this.f.d();
    }

    public List<EndPlayJson.e> a() {
        return this.b.c();
    }

    public Map<String, Long> d() {
        HashMap hashMap;
        synchronized (this.e) {
            hashMap = new HashMap(this.e);
        }
        return hashMap;
    }

    public Long h() {
        Long l;
        synchronized (this.e) {
            l = this.e.get("network");
        }
        return l;
    }

    public void c(DataSpec dataSpec, NetflixNetworkError netflixNetworkError, long j) {
        if (this.i) {
            C4857bnm c4857bnm = this.a.get(dataSpec);
            if (c4857bnm == null) {
                c4857bnm = new C4857bnm(dataSpec.key);
                this.a.put(dataSpec, c4857bnm);
            }
            c4857bnm.d(netflixNetworkError);
            c4857bnm.a(j, 0L);
        }
    }

    private void d(String str, long j) {
        synchronized (this.e) {
            Long l = this.e.get(str);
            if (l == null) {
                l = 0L;
            }
            this.e.put(str, Long.valueOf(l.longValue() + j));
        }
    }

    public void e(InterfaceC4835bnQ interfaceC4835bnQ, DataSpec dataSpec) {
        boolean z = interfaceC4835bnQ.h() || interfaceC4835bnQ.c() >= 400;
        this.g.e(interfaceC4835bnQ);
        Object obj = dataSpec.customData;
        if (obj instanceof C4794bmc) {
            this.b.d(((C4794bmc) obj).c(), interfaceC4835bnQ);
        }
        this.h.b(this.c, interfaceC4835bnQ);
        this.f.a(this.c, interfaceC4835bnQ);
        if (interfaceC4835bnQ.i() > 0) {
            d("network", interfaceC4835bnQ.i());
        }
        if (this.i || z) {
            C4857bnm c4857bnm = this.a.get(dataSpec);
            if (c4857bnm == null) {
                if (z) {
                    c4857bnm = new C4857bnm(dataSpec.key);
                } else {
                    C1044Mm.e("nf_playreport", "unable to find info for %s -- %s", dataSpec, interfaceC4835bnQ.n());
                    return;
                }
            }
            this.a.remove(dataSpec);
            if (c4857bnm.e() == null && !z) {
                C1044Mm.d("nf_playreport", "ignoring cached request %s", interfaceC4835bnQ.n());
                return;
            }
            c4857bnm.e(interfaceC4835bnQ);
            this.d.b(interfaceC4835bnQ, dataSpec, c4857bnm);
        }
    }

    public void b(DataSpec dataSpec, long j) {
        if (this.i) {
            C4857bnm c4857bnm = new C4857bnm(dataSpec.key);
            c4857bnm.b(j);
            this.a.put(dataSpec, c4857bnm);
        }
    }

    public void e(DataSpec dataSpec, long j, long j2) {
        if (this.i) {
            C4857bnm c4857bnm = this.a.get(dataSpec);
            if (c4857bnm == null) {
                C1044Mm.e("nf_playreport", "unable to find info for trace %s", dataSpec);
            } else {
                c4857bnm.a(j2, j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bnU$a */
    /* loaded from: classes3.dex */
    public static class a {
        private static final long b = TimeUnit.DAYS.toMillis(1);
        private long a;
        private long c;
        private long e = -9223372036854775807L;
        private long d = -9223372036854775807L;

        long a() {
            return this.c;
        }

        long c() {
            return this.a;
        }

        a() {
        }

        public void e(InterfaceC4835bnQ interfaceC4835bnQ) {
            if (interfaceC4835bnQ == null || interfaceC4835bnQ.f() == 0 || interfaceC4835bnQ.i() == 0) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long f = interfaceC4835bnQ.f();
            a(interfaceC4835bnQ.o() + (elapsedRealtime - f), elapsedRealtime, interfaceC4835bnQ.i());
        }

        public void a(long j, long j2, long j3) {
            if (j2 >= this.d && j2 >= j) {
                long j4 = j2 - j;
                long j5 = b;
                if (j4 <= j5) {
                    long j6 = this.e;
                    if (j6 == -9223372036854775807L || Math.abs(j - j6) <= j5) {
                        long j7 = this.d;
                        if (j7 == -9223372036854775807L || Math.abs(j2 - j7) <= j5) {
                            this.a += j3;
                            long j8 = this.c + j4;
                            this.c = j8;
                            long j9 = this.d;
                            int i = (j9 > (-9223372036854775807L) ? 1 : (j9 == (-9223372036854775807L) ? 0 : -1));
                            if (i != 0 && j <= j9) {
                                long j10 = j8 - (j9 - j);
                                this.c = j10;
                                long j11 = this.e;
                                if (j11 != -9223372036854775807L && j < j11) {
                                    this.c = j10 + (j11 - j);
                                }
                            }
                            if (i == 0 || j2 > j9) {
                                this.d = j2;
                            }
                            long j12 = this.e;
                            if (j12 == -9223372036854775807L || j < j12 || j < this.d) {
                                this.e = j;
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            C1044Mm.e("nf_playreport", "invalid network durations: %s, %s, %s, %s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(this.e), Long.valueOf(this.d));
        }

        public long e() {
            long j = this.c;
            if (j > 0) {
                return (this.a * 8) / j;
            }
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bnU$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final Map<CurrentNetworkInfo.NetSpec, a> b;

        private b() {
            this.b = new HashMap();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(CurrentNetworkInfo.NetSpec netSpec, InterfaceC4835bnQ interfaceC4835bnQ) {
            a aVar = this.b.get(netSpec);
            if (aVar == null) {
                aVar = new a();
                this.b.put(netSpec, aVar);
            }
            aVar.e(interfaceC4835bnQ);
        }

        public EndPlayJson.c[] c() {
            EndPlayJson.c[] cVarArr = new EndPlayJson.c[this.b.size()];
            int i = 0;
            for (Map.Entry<CurrentNetworkInfo.NetSpec, a> entry : this.b.entrySet()) {
                cVarArr[i] = new EndPlayJson.c(entry.getKey(), entry.getValue().a(), entry.getValue().c());
                i++;
            }
            return cVarArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bnU$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final Map<CurrentNetworkInfo.NetType, b> e;

        private e() {
            this.e = new HashMap();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(CurrentNetworkInfo currentNetworkInfo, InterfaceC4835bnQ interfaceC4835bnQ) {
            if (currentNetworkInfo == null || interfaceC4835bnQ == null) {
                return;
            }
            b bVar = this.e.get(currentNetworkInfo.j());
            if (bVar == null) {
                bVar = new b();
                this.e.put(currentNetworkInfo.j(), bVar);
            }
            bVar.c(currentNetworkInfo.f(), interfaceC4835bnQ);
        }

        public List<EndPlayJson.j> d() {
            return (List) this.e.entrySet().stream().map(new Function() { // from class: o.bnX
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    EndPlayJson.j c;
                    c = C4839bnU.e.c((Map.Entry) obj);
                    return c;
                }
            }).collect(Collectors.toList());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ EndPlayJson.j c(Map.Entry entry) {
            return new EndPlayJson.j((CurrentNetworkInfo.NetType) entry.getKey(), ((b) entry.getValue()).c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bnU$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final Map<CurrentNetworkInfo.MeteredState, a> a;

        private c() {
            this.a = new HashMap();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(CurrentNetworkInfo currentNetworkInfo, InterfaceC4835bnQ interfaceC4835bnQ) {
            if (currentNetworkInfo == null || interfaceC4835bnQ == null) {
                return;
            }
            a aVar = this.a.get(currentNetworkInfo.g());
            if (aVar == null) {
                aVar = new a();
                this.a.put(currentNetworkInfo.g(), aVar);
            }
            aVar.e(interfaceC4835bnQ);
        }

        public EndPlayJson.b[] d() {
            EndPlayJson.b[] bVarArr = new EndPlayJson.b[this.a.size()];
            int i = 0;
            for (Map.Entry<CurrentNetworkInfo.MeteredState, a> entry : this.a.entrySet()) {
                bVarArr[i] = new EndPlayJson.b(entry.getKey(), entry.getValue().a(), entry.getValue().c());
                i++;
            }
            return bVarArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bnU$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final Map<String, SparseArray<a>> b;

        private d() {
            this.b = new HashMap();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(C4668bip c4668bip, InterfaceC4835bnQ interfaceC4835bnQ) {
            int a = c4668bip.a();
            String f = c4668bip.f();
            if (a == 0 || interfaceC4835bnQ == null) {
                return;
            }
            SparseArray<a> sparseArray = this.b.get(f);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                this.b.put(f, sparseArray);
            }
            a aVar = sparseArray.get(a);
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(a, aVar);
            }
            aVar.e(interfaceC4835bnQ);
        }

        public List<EndPlayJson.e> c() {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, SparseArray<a>> entry : this.b.entrySet()) {
                for (int i = 0; i < entry.getValue().size(); i++) {
                    int keyAt = entry.getValue().keyAt(i);
                    a valueAt = entry.getValue().valueAt(i);
                    arrayList.add(new EndPlayJson.e(entry.getKey(), keyAt, valueAt.e(), valueAt.a()));
                }
            }
            return arrayList;
        }
    }
}
