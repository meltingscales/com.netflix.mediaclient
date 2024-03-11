package o;

import android.content.Context;
import androidx.media3.common.PlaybackException;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType;
import com.netflix.model.leafs.originals.interactive.Prefetch;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import o.C4768bmC;
import o.C4898boa;
import org.json.JSONObject;

/* renamed from: o.bmr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4809bmr {
    private final InterfaceC4808bmq a;
    private final Context c;
    private C4817bmz f;
    private C4817bmz g;
    private final Gson h;
    private final Map<c, e> i;
    private final Map<Long, Boolean> j;
    private int k;
    private final Map<a, PlaybackException> l;
    private int m;
    private final Map<c, h> n;

    /* renamed from: o  reason: collision with root package name */
    private int f13618o;
    private final ConcurrentHashMap<c, j> p;
    private double q;
    private int r;
    private final Map<a, e> s;
    private final C4898boa.d t;
    public static final d d = new d(null);
    private static int b = -1;
    private static int e = -1;

    public C4809bmr(C4898boa c4898boa, InterfaceC4808bmq interfaceC4808bmq, Gson gson, Context context) {
        C8632dsu.c((Object) c4898boa, "");
        C8632dsu.c((Object) interfaceC4808bmq, "");
        C8632dsu.c((Object) gson, "");
        C8632dsu.c((Object) context, "");
        this.a = interfaceC4808bmq;
        this.h = gson;
        this.c = context;
        this.s = new LinkedHashMap();
        this.q = 1.0d;
        this.r = -1;
        this.k = -1;
        this.f13618o = -1;
        this.m = -1;
        this.n = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.j = new LinkedHashMap();
        this.i = new LinkedHashMap();
        this.p = new ConcurrentHashMap<>();
        C4898boa.d dVar = new C4898boa.d() { // from class: o.bmt
            @Override // o.C4898boa.d
            public final void e(String str, int i2, int i3) {
                C4809bmr.d(C4809bmr.this, str, i2, i3);
            }
        };
        this.t = dVar;
        d dVar2 = d;
        c4898boa.b(dVar);
        this.q = dVar2.d(c4898boa.d());
        this.f13618o = context.getResources().getDisplayMetrics().widthPixels;
        this.m = context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: o.bmr$b */
    /* loaded from: classes3.dex */
    public static final class b {
        @SerializedName("fullScreen")
        private boolean a;
        @SerializedName("cumulativeTimeByVisibilityMs")
        private List<Long> b;
        @SerializedName("maxContinuousTimeByVisibilityMs")
        private List<Long> c;
        @SerializedName("adHeight")
        private int d;
        @SerializedName("adWidth")
        private int e;
        @SerializedName("resizeTrace")
        private List<? extends List<? extends Number>> f;
        @SerializedName("screenHeight")
        private int g;
        @SerializedName("pauseTrace")
        private List<? extends List<Long>> h;
        @SerializedName("screenWidth")
        private int i;
        @SerializedName("reason")
        private String j;
        @SerializedName("volumeChangeTrace")
        private List<? extends List<Double>> k;
        @SerializedName("thirdPartyVerificationToken")
        private String l;
        @SerializedName("visibility")
        private double m;
        @SerializedName("volume")
        private double n;

        public b(double d, double d2, int i, int i2, int i3, String str, int i4, List<Long> list, List<Long> list2, List<? extends List<Double>> list3, List<? extends List<Long>> list4, List<? extends List<? extends Number>> list5, String str2, boolean z) {
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) list2, "");
            C8632dsu.c((Object) list3, "");
            C8632dsu.c((Object) list4, "");
            C8632dsu.c((Object) list5, "");
            this.n = d;
            this.m = d2;
            this.i = i;
            this.g = i2;
            this.e = i3;
            this.l = str;
            this.d = i4;
            this.b = list;
            this.c = list2;
            this.k = list3;
            this.h = list4;
            this.f = list5;
            this.j = str2;
            this.a = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bmr$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final long b;
        private final long d;
        private final SegmentType e;

        public final long c() {
            return this.b;
        }

        public final long d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.e == cVar.e && this.d == cVar.d && this.b == cVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (((this.e.hashCode() * 31) + Long.hashCode(this.d)) * 31) + Long.hashCode(this.b);
        }

        public String toString() {
            SegmentType segmentType = this.e;
            long j = this.d;
            long j2 = this.b;
            return "PlayPositionKey(contentType=" + segmentType + ", viewableId=" + j + ", playbackPosition=" + j2 + ")";
        }

        public c(SegmentType segmentType, long j, long j2) {
            C8632dsu.c((Object) segmentType, "");
            this.e = segmentType;
            this.d = j;
            this.b = j2;
        }
    }

    /* renamed from: o.bmr$a */
    /* loaded from: classes3.dex */
    static final class a {
        private final long c;
        private final SegmentType e;

        public final long a() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.e == aVar.e && this.c == aVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + Long.hashCode(this.c);
        }

        public String toString() {
            SegmentType segmentType = this.e;
            long j = this.c;
            return "EventKey(contentType=" + segmentType + ", viewableId=" + j + ")";
        }

        public a(SegmentType segmentType, long j) {
            C8632dsu.c((Object) segmentType, "");
            this.e = segmentType;
            this.c = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bmr$j */
    /* loaded from: classes3.dex */
    public static final class j {
        private final double c;

        public final double d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Double.compare(this.c, ((j) obj).c) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.c);
        }

        public String toString() {
            double d = this.c;
            return "VolumeLevel(level=" + d + ")";
        }

        public j(double d) {
            this.c = d;
        }
    }

    /* renamed from: o.bmr$h */
    /* loaded from: classes3.dex */
    static final class h {
        private final int a;
        private final int b;

        public final int a() {
            return this.a;
        }

        public final int d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return this.a == hVar.a && this.b == hVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            int i = this.a;
            int i2 = this.b;
            return "ScreenDimension(width=" + i + ", height=" + i2 + ")";
        }

        public h(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* renamed from: o.bmr$e */
    /* loaded from: classes3.dex */
    static final class e {
        private long d;

        public final void c(long j) {
            this.d += j;
        }

        public final long e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.d == ((e) obj).d;
        }

        public int hashCode() {
            return Long.hashCode(this.d);
        }

        public String toString() {
            long j = this.d;
            return "Duration(realtimeMs=" + j + ")";
        }

        public e(long j) {
            this.d = j;
        }
    }

    /* renamed from: o.bmr$f */
    /* loaded from: classes3.dex */
    public static final class f<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues((Long) ((ArrayList) t).get(0), (Long) ((ArrayList) t2).get(0));
            return compareValues;
        }
    }

    /* renamed from: o.bmr$g */
    /* loaded from: classes3.dex */
    public static final class g<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues((Long) ((ArrayList) t).get(0), (Long) ((ArrayList) t2).get(0));
            return compareValues;
        }
    }

    /* renamed from: o.bmr$i */
    /* loaded from: classes3.dex */
    public static final class i<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues((Double) ((ArrayList) t).get(0), (Double) ((ArrayList) t2).get(0));
            return compareValues;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4809bmr c4809bmr, String str, int i2, int i3) {
        C8632dsu.c((Object) c4809bmr, "");
        d dVar = d;
        C4817bmz c4817bmz = c4809bmr.f;
        if (c4817bmz != null) {
            c4809bmr.q = dVar.d(i3);
            c4809bmr.p.put(dVar.d(c4817bmz), new j(c4809bmr.q));
        }
    }

    public final void c(SegmentType segmentType, long j2, C4817bmz c4817bmz, C4817bmz c4817bmz2) {
        C8632dsu.c((Object) segmentType, "");
        C8632dsu.c((Object) c4817bmz, "");
        C8632dsu.c((Object) c4817bmz2, "");
        if (segmentType != SegmentType.c) {
            j2 = -1;
        }
        a aVar = new a(segmentType, j2);
        long b2 = c4817bmz2.b();
        long b3 = c4817bmz.b();
        Map<a, e> map = this.s;
        e eVar = map.get(aVar);
        if (eVar == null) {
            eVar = new e(0L);
            map.put(aVar, eVar);
        }
        eVar.c(b2 - b3);
        this.f = c4817bmz2;
    }

    public final void e(C4817bmz c4817bmz, boolean z) {
        C8632dsu.c((Object) c4817bmz, "");
        if (z) {
            if (c4817bmz.e() == SegmentType.c) {
                Map<Long, Boolean> map = this.j;
                Long valueOf = Long.valueOf(c4817bmz.i());
                if (map.get(valueOf) == null) {
                    this.p.put(d.d(c4817bmz), new j(this.q));
                    map.put(valueOf, Boolean.TRUE);
                }
            }
            C4817bmz c4817bmz2 = this.g;
            if (c4817bmz2 != null) {
                this.i.put(d.d(c4817bmz2), new e(c4817bmz.b() - c4817bmz2.b()));
                this.g = null;
            }
        } else if (this.g == null && c4817bmz.e() == SegmentType.c) {
            this.g = c4817bmz;
        }
    }

    public final JSONObject a(String str, C4817bmz c4817bmz, C4805bmn c4805bmn) {
        String str2;
        ArrayList a2;
        ArrayList a3;
        ArrayList a4;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c4817bmz, "");
        C8632dsu.c((Object) c4805bmn, "");
        long i2 = c4817bmz.i();
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap<c, j> concurrentHashMap = this.p;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<c, j> entry : concurrentHashMap.entrySet()) {
            if (entry.getKey().d() == i2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            a4 = C8569dql.a(Double.valueOf(((c) entry2.getKey()).c() * 1.0d), Double.valueOf(((j) entry2.getValue()).d()));
            arrayList.add(a4);
        }
        if (arrayList.size() > 1) {
            C8575dqr.c(arrayList, new i());
        }
        ArrayList arrayList2 = new ArrayList();
        Map<c, e> map = this.i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<c, e> entry3 : map.entrySet()) {
            if (entry3.getKey().d() == i2) {
                linkedHashMap2.put(entry3.getKey(), entry3.getValue());
            }
        }
        for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
            a3 = C8569dql.a(Long.valueOf(((c) entry4.getKey()).c()), Long.valueOf(((e) entry4.getValue()).e()));
            arrayList2.add(a3);
        }
        if (arrayList2.size() > 1) {
            C8575dqr.c(arrayList2, new g());
        }
        ArrayList arrayList3 = new ArrayList();
        Map<c, h> map2 = this.n;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry<c, h> entry5 : map2.entrySet()) {
            if (entry5.getKey().d() == i2) {
                linkedHashMap3.put(entry5.getKey(), entry5.getValue());
            }
        }
        for (Map.Entry entry6 : linkedHashMap3.entrySet()) {
            h hVar = (h) entry6.getValue();
            a2 = C8569dql.a(Long.valueOf(((c) entry6.getKey()).c()), Long.valueOf(hVar.a()), Long.valueOf(hVar.d()));
            arrayList3.add(a2);
        }
        if (arrayList3.size() > 1) {
            C8575dqr.c(arrayList3, new f());
        }
        if (C8632dsu.c((Object) str, (Object) C4768bmC.c.c.c().h())) {
            str2 = this.l.get(new a(c4817bmz.e(), c4817bmz.e() == SegmentType.c ? c4817bmz.i() : -1L)) == null ? "exit" : UmaAlert.ICON_ERROR;
        } else {
            str2 = null;
        }
        String str3 = str2;
        Map<a, e> map3 = this.s;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry<a, e> entry7 : map3.entrySet()) {
            if (entry7.getKey().a() == i2) {
                linkedHashMap4.put(entry7.getKey(), entry7.getValue());
            }
        }
        ArrayList arrayList4 = new ArrayList(linkedHashMap4.size());
        for (Map.Entry entry8 : linkedHashMap4.entrySet()) {
            arrayList4.add(Long.valueOf(((e) entry8.getValue()).e()));
        }
        int i3 = this.r;
        if (i3 == -1) {
            i3 = b;
        }
        this.r = i3;
        int i4 = this.k;
        if (i4 == -1) {
            i4 = e;
        }
        this.k = i4;
        return new JSONObject(this.h.toJson(new b(this.q, 1.0d, this.f13618o, this.m, this.r, c4805bmn.d(), this.k, arrayList4, arrayList4, arrayList, arrayList2, arrayList3, str3, this.a.e())));
    }

    public final void a(C4817bmz c4817bmz, int i2, int i3) {
        C8632dsu.c((Object) c4817bmz, "");
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        this.r = i2;
        this.k = i3;
        this.n.put(d.d(c4817bmz), new h(i2, i3));
    }

    public final void b(C4817bmz c4817bmz, PlaybackException playbackException) {
        C8632dsu.c((Object) c4817bmz, "");
        this.l.put(new a(c4817bmz.e(), c4817bmz.e() == SegmentType.c ? c4817bmz.i() : -1L), playbackException);
    }

    /* renamed from: o.bmr$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        public final double d(int i) {
            return (i * 1.0d) / ((double) Prefetch.NANOSECONDS_PER_MILLISECOND);
        }

        private d() {
            super("nf_pds_3p");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final c d(C4817bmz c4817bmz) {
            return new c(c4817bmz.e(), c4817bmz.e() == SegmentType.c ? c4817bmz.i() : -1L, c4817bmz.d());
        }

        public final void d(int i, int i2) {
            if (i <= 0 || i2 <= 0) {
                return;
            }
            C4809bmr.b = i;
            C4809bmr.e = i2;
        }
    }
}
