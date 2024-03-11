package o;

import com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.bmE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4770bmE {
    public static final c b = new c(null);
    private final Map<e, b> a = new LinkedHashMap();
    private final Map<e, d> d = new LinkedHashMap();

    public final void e(SegmentType segmentType, long j, String str, String str2, String str3, C4817bmz c4817bmz, C4817bmz c4817bmz2) {
        C8632dsu.c((Object) segmentType, "");
        C8632dsu.c((Object) c4817bmz, "");
        C8632dsu.c((Object) c4817bmz2, "");
        e eVar = new e(segmentType, segmentType == SegmentType.c ? j : -1L, c4817bmz.j());
        long b2 = c4817bmz2.b() - c4817bmz.b();
        long d2 = c4817bmz2.d() - c4817bmz.d();
        Map<e, b> map = this.a;
        b bVar = map.get(eVar);
        if (bVar == null) {
            bVar = new b(0L, 0L, 3, null);
            map.put(eVar, bVar);
        }
        bVar.b(b2, d2);
        Map<e, d> map2 = this.d;
        d dVar = map2.get(eVar);
        if (dVar == null) {
            dVar = new d();
            map2.put(eVar, dVar);
        }
        d dVar2 = dVar;
        if (str != null) {
            dVar2.c(1, str, b2, d2);
        }
        if (str2 != null) {
            dVar2.c(2, str2, b2, d2);
        }
        if (str3 != null) {
            dVar2.c(3, str3, b2, d2);
        }
    }

    public static /* synthetic */ a e(C4770bmE c4770bmE, boolean z, Long l, C4911bon c4911bon, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            c4911bon = null;
        }
        return c4770bmE.b(z, l, c4911bon);
    }

    public final a b(boolean z, Long l, C4911bon c4911bon) {
        return new a(this, z, l, c4911bon);
    }

    /* renamed from: o.bmE$d */
    /* loaded from: classes3.dex */
    static final class d {
        private final Map<Integer, Map<String, b>> a = new LinkedHashMap();

        public final void c(int i, String str, long j, long j2) {
            C8632dsu.c((Object) str, "");
            Map<String, b> map = this.a.get(Integer.valueOf(i));
            if (map == null) {
                map = new HashMap<>();
                this.a.put(Integer.valueOf(i), map);
            }
            b bVar = map.get(str);
            if (bVar == null) {
                bVar = new b(0L, 0L, 3, null);
                map.put(str, bVar);
            }
            bVar.b(j, j2);
        }

        public final Map<String, b> c(int i) {
            return this.a.get(Integer.valueOf(i));
        }

        public String toString() {
            return this.a.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bmE$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private long b;
        private long c;

        public b() {
            this(0L, 0L, 3, null);
        }

        public final long b() {
            return this.b;
        }

        public final void b(long j, long j2) {
            this.b += j;
            this.c += j2;
        }

        public final long c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.b == bVar.b && this.c == bVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (Long.hashCode(this.b) * 31) + Long.hashCode(this.c);
        }

        public String toString() {
            long j = this.b;
            long j2 = this.c;
            return "Timers(realtimeMs=" + j + ", contentMs=" + j2 + ")";
        }

        public b(long j, long j2) {
            this.b = j;
            this.c = j2;
        }

        public /* synthetic */ b(long j, long j2, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2);
        }
    }

    /* renamed from: o.bmE$e */
    /* loaded from: classes3.dex */
    static final class e {
        private final long a;
        private final boolean d;
        private final SegmentType e;

        public final SegmentType a() {
            return this.e;
        }

        public final long c() {
            return this.a;
        }

        public final boolean d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.e == eVar.e && this.a == eVar.a && this.d == eVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (((this.e.hashCode() * 31) + Long.hashCode(this.a)) * 31) + Boolean.hashCode(this.d);
        }

        public String toString() {
            SegmentType segmentType = this.e;
            long j = this.a;
            boolean z = this.d;
            return "TimerKey(contentType=" + segmentType + ", viewableId=" + j + ", isLiveEdge=" + z + ")";
        }

        public e(SegmentType segmentType, long j, boolean z) {
            C8632dsu.c((Object) segmentType, "");
            this.e = segmentType;
            this.a = j;
            this.d = z;
        }
    }

    /* renamed from: o.bmE$a */
    /* loaded from: classes3.dex */
    public static final class a extends JSONObject {
        private final Long e;

        public a(C4770bmE c4770bmE, boolean z, Long l, C4911bon c4911bon) {
            Collection values;
            Iterable<b> i;
            Iterable<b> i2;
            Iterable<b> i3;
            Iterable<b> i4;
            Collection values2;
            int d;
            int d2;
            int d3;
            C8632dsu.c((Object) c4770bmE, "");
            this.e = l;
            if (l == null) {
                Map map = c4770bmE.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    e eVar = (e) entry.getKey();
                    if (eVar.a() == SegmentType.a || eVar.a() == SegmentType.b) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                values = linkedHashMap.values();
            } else {
                Map map2 = c4770bmE.a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : map2.entrySet()) {
                    e eVar2 = (e) entry2.getKey();
                    if (eVar2.a() == SegmentType.c) {
                        long c = eVar2.c();
                        Long l2 = this.e;
                        if (l2 != null && c == l2.longValue()) {
                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                }
                values = linkedHashMap2.values();
            }
            if (this.e == null) {
                Map map3 = c4770bmE.a;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry3 : map3.entrySet()) {
                    if (((e) entry3.getKey()).a() == SegmentType.c) {
                        linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                    }
                }
                i = linkedHashMap3.values();
            } else {
                i = C8569dql.i();
            }
            if (this.e == null) {
                Map map4 = c4770bmE.a;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry4 : map4.entrySet()) {
                    e eVar3 = (e) entry4.getKey();
                    if (eVar3.a() == SegmentType.e || eVar3.a() == SegmentType.d) {
                        linkedHashMap4.put(entry4.getKey(), entry4.getValue());
                    }
                }
                i2 = linkedHashMap4.values();
            } else {
                i2 = C8569dql.i();
            }
            if (this.e == null) {
                Map map5 = c4770bmE.a;
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                for (Map.Entry entry5 : map5.entrySet()) {
                    if (((e) entry5.getKey()).a() == SegmentType.b) {
                        linkedHashMap5.put(entry5.getKey(), entry5.getValue());
                    }
                }
                i3 = linkedHashMap5.values();
            } else {
                i3 = C8569dql.i();
            }
            if (this.e == null) {
                Map map6 = c4770bmE.a;
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                for (Map.Entry entry6 : map6.entrySet()) {
                    if (((e) entry6.getKey()).d()) {
                        linkedHashMap6.put(entry6.getKey(), entry6.getValue());
                    }
                }
                i4 = linkedHashMap6.values();
            } else {
                i4 = C8569dql.i();
            }
            if (this.e == null) {
                Map map7 = c4770bmE.d;
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                for (Map.Entry entry7 : map7.entrySet()) {
                    e eVar4 = (e) entry7.getKey();
                    if (eVar4.a() == SegmentType.a || eVar4.a() == SegmentType.b) {
                        linkedHashMap7.put(entry7.getKey(), entry7.getValue());
                    }
                }
                values2 = linkedHashMap7.values();
            } else {
                Map map8 = c4770bmE.d;
                LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                for (Map.Entry entry8 : map8.entrySet()) {
                    e eVar5 = (e) entry8.getKey();
                    if (eVar5.a() == SegmentType.c) {
                        long c2 = eVar5.c();
                        Long l3 = this.e;
                        if (l3 != null && c2 == l3.longValue()) {
                            linkedHashMap8.put(entry8.getKey(), entry8.getValue());
                        }
                    }
                }
                values2 = linkedHashMap8.values();
            }
            Collection<b> collection = values;
            long j = 0;
            long j2 = 0;
            for (b bVar : collection) {
                j2 += bVar.b();
            }
            put("total", j2);
            if (z) {
                long j3 = 0;
                for (b bVar2 : collection) {
                    j3 += bVar2.c();
                }
                put("totalContentDuration", j3);
            }
            long j4 = 0;
            for (b bVar3 : i) {
                j4 += bVar3.b();
            }
            int i5 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
            if (i5 > 0) {
                put("totalAdDuration", j4);
            }
            for (b bVar4 : i2) {
                j += bVar4.b();
            }
            int i6 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i6 > 0) {
                put("totalOtherDuration", j);
            }
            if (i5 > 0 || i6 > 0) {
                put("totalCombinedDuration", j2 + j4 + j);
            }
            long j5 = 0;
            for (b bVar5 : i3) {
                j5 += bVar5.b();
            }
            if (j5 > 0) {
                put("totalStartSlateDuration", j5);
            }
            long j6 = 0;
            for (b bVar6 : i4) {
                j6 += bVar6.b();
            }
            if (j6 > 0) {
                put("totalLiveEdgeDuration", j6);
            }
            Collection<d> collection2 = values2;
            d = C8572dqo.d(collection2, 10);
            ArrayList arrayList = new ArrayList(d);
            for (d dVar : collection2) {
                arrayList.add(dVar.c(1));
            }
            put("audio", a(arrayList, z, c4911bon));
            d2 = C8572dqo.d(collection2, 10);
            ArrayList arrayList2 = new ArrayList(d2);
            for (d dVar2 : collection2) {
                arrayList2.add(dVar2.c(2));
            }
            put("video", a(arrayList2, z, c4911bon));
            d3 = C8572dqo.d(collection2, 10);
            ArrayList arrayList3 = new ArrayList(d3);
            for (d dVar3 : collection2) {
                arrayList3.add(dVar3.c(3));
            }
            put("text", a(arrayList3, z, c4911bon));
        }

        private final JSONArray a(List<? extends Map<String, b>> list, boolean z, C4911bon c4911bon) {
            String e;
            Set entrySet;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList<Map.Entry> arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                C8571dqn.b(arrayList, (map == null || (entrySet = map.entrySet()) == null) ? C8569dql.i() : entrySet);
            }
            for (Map.Entry entry : arrayList) {
                Object key = entry.getKey();
                Object key2 = entry.getKey();
                Object obj = linkedHashMap.get(key2);
                if (obj == null) {
                    obj = new b(0L, 0L, 3, null);
                    linkedHashMap.put(key2, obj);
                }
                ((b) obj).b(((b) entry.getValue()).b(), ((b) entry.getValue()).c());
                linkedHashMap.put(key, obj);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (((b) entry2.getValue()).b() > 0) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str = (String) entry3.getKey();
                b bVar = (b) entry3.getValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("downloadableId", str);
                jSONObject.put("duration", bVar.b());
                if (z) {
                    jSONObject.put("contentDuration", bVar.c());
                }
                if (c4911bon != null && (e = c4911bon.e(str)) != null) {
                    jSONObject.put("cdnId", e);
                }
                arrayList2.add(jSONObject);
            }
            return new JSONArray((Collection) arrayList2);
        }
    }

    /* renamed from: o.bmE$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("nf_pds");
        }
    }
}
