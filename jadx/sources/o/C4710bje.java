package o;

import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyC4PlayerControls;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.C4592bhS;
import o.C4642biP;
import o.C4651biY;

/* renamed from: o.bje  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4710bje {
    private static final long a;
    private static final long b;
    private static final long d;
    public static final d e = new d(null);
    private final String c;
    private final Map<String, C4592bhS.a> f;
    private String h;
    private final long i;
    private final a j;

    public final Map<String, C4592bhS.a> a() {
        return this.f;
    }

    public final long b() {
        return this.i;
    }

    public final String e() {
        return this.c;
    }

    public C4710bje(long j, String str) {
        C8632dsu.c((Object) str, "");
        this.i = j;
        this.c = str;
        this.j = new a();
        this.f = new LinkedHashMap();
        this.h = null;
    }

    public final void b(long j, C4642biP.d dVar) {
        C8632dsu.c((Object) dVar, "");
        String c = c(dVar);
        if (dVar.a().isEmpty()) {
            if (dVar.h()) {
                e.getLogTag();
                return;
            }
            e.getLogTag();
            this.j.c(c(j, c, dVar.f()));
            return;
        }
        this.j.c(a(j, c, dVar));
    }

    public final void c(C4651biY.e eVar) {
        C8632dsu.c((Object) eVar, "");
        eVar.d(this.h);
        String str = this.c;
        long f = eVar.f();
        this.h = str + "-@" + f;
        if (eVar.e() != eVar.g()) {
            String str2 = this.h;
            long g = eVar.g();
            this.h = str2 + "-" + g;
        }
        a aVar = this.j;
        String str3 = this.h;
        C8632dsu.d((Object) str3);
        aVar.c(str3, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, C5273bve> c() {
        List<String> N;
        List<Map.Entry> N2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        N = C8576dqs.N(this.j.d());
        String str = null;
        for (String str2 : N) {
            C4651biY.e a2 = this.j.a(str2);
            C8632dsu.d(a2);
            if (str != null) {
                a2.b(str);
                a2.a(new C5213buX(str, 100));
            }
            C4651biY a3 = a2.a();
            linkedHashMap.put(str2, a3);
            if ((a3 instanceof C4651biY) && ((C5273bve) a3).g != SegmentType.a) {
                linkedHashMap2.put(str2, new C4592bhS.a(a3, new C4592bhS.e(a3.d(), a3.d(), 0.0f)));
            } else {
                linkedHashMap2.put(str2, new C4592bhS.a(a3, new C4592bhS.e(a3.c, a3.b, 1.0f)));
            }
            str = str2;
        }
        this.f.clear();
        N2 = C8576dqs.N(linkedHashMap2.entrySet());
        for (Map.Entry entry : N2) {
            this.f.put(entry.getKey(), entry.getValue());
            e.getLogTag();
        }
        return linkedHashMap;
    }

    public final Pair<String, Long> e(long j, long j2) {
        return this.j.d(j, j2);
    }

    private final Map<String, C4651biY.e> a(long j, String str, C4642biP.d dVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(a(this, j, str, true, dVar.f(), false, 16, null));
        for (C4642biP.e eVar : dVar.a()) {
            if (!eVar.i()) {
                C4651biY.e b2 = new C4651biY.e(j, eVar.h().e()).d(eVar).b(0L).c(eVar.e()).d(this.h).d(SegmentType.c).a(dVar.f()).b(Long.valueOf(dVar.f()));
                String str2 = str + eVar.h().e();
                this.h = str2;
                C8632dsu.d((Object) str2);
                linkedHashMap.put(str2, b2);
            }
        }
        linkedHashMap.putAll(a(this, j, str, false, dVar.f(), false, 16, null));
        return linkedHashMap;
    }

    static /* synthetic */ Map a(C4710bje c4710bje, long j, String str, boolean z, long j2, boolean z2, int i, Object obj) {
        return c4710bje.a(j, str, z, j2, (i & 16) != 0 ? false : z2);
    }

    private final Map<String, C4651biY.e> a(long j, String str, boolean z, long j2, boolean z2) {
        SegmentType segmentType;
        String e2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j3 = z ? b : d;
        if (j3 <= 0 && z2) {
            j3 = a;
        }
        if (j3 > 0 && (z2 || this.h != null)) {
            if (z) {
                segmentType = SegmentType.e;
            } else {
                segmentType = SegmentType.d;
            }
            if (z) {
                e2 = a(str);
            } else {
                e2 = e(str);
            }
            C4651biY.e b2 = new C4651biY.e(j, 2147483647L).b(0L).c(j3).d(this.h).d(segmentType).a(j2).b(Long.valueOf(j2));
            if (z2) {
                b2.e(true);
            }
            this.h = e2;
            C8632dsu.d((Object) e2);
            linkedHashMap.put(e2, b2);
        }
        return linkedHashMap;
    }

    private final String c(C4642biP.d dVar) {
        String str = this.c;
        long f = dVar.f();
        return str + "-" + f + "-";
    }

    private final String a(String str) {
        SegmentType segmentType = SegmentType.e;
        return str + segmentType;
    }

    private final String e(String str) {
        SegmentType segmentType = SegmentType.d;
        return str + segmentType;
    }

    private final Map<String, C4651biY.e> c(long j, String str, long j2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(a(j, str, true, j2, true));
        linkedHashMap.putAll(a(this, j, str, false, j2, false, 16, null));
        return linkedHashMap;
    }

    /* renamed from: o.bje$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final List<String> d = new ArrayList();
        private final Map<String, C4651biY.e> c = new LinkedHashMap();

        public final List<String> d() {
            return this.d;
        }

        public final void c(String str, C4651biY.e eVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) eVar, "");
            if (!this.d.contains(str)) {
                this.d.add(str);
            }
            this.c.put(str, eVar);
        }

        public final void c(Map<String, C4651biY.e> map) {
            C8632dsu.c((Object) map, "");
            this.d.addAll(map.keySet());
            this.c.putAll(map);
        }

        public final C4651biY.e a(String str) {
            C8632dsu.c((Object) str, "");
            return this.c.get(str);
        }

        public final boolean e(String str, String str2, Map<String, C4651biY.e> map) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) map, "");
            int indexOf = this.d.indexOf(str);
            int indexOf2 = this.d.indexOf(str2);
            if (indexOf >= 0 || indexOf2 >= 0) {
                if (indexOf < 0) {
                    indexOf = 0;
                } else if (indexOf2 < 0) {
                    indexOf2 = this.d.size() - 1;
                }
                if (indexOf <= indexOf2) {
                    while (true) {
                        this.c.remove(this.d.remove(indexOf2));
                        if (indexOf2 == indexOf) {
                            break;
                        }
                        indexOf2--;
                    }
                }
                this.d.addAll(indexOf, map.keySet());
                this.c.putAll(map);
                return true;
            }
            return false;
        }

        public final Pair<String, Long> d(long j, long j2) {
            Pair<String, Long> pair;
            Pair<String, Long> pair2 = null;
            for (String str : this.d) {
                if (this.c.get(str) != null) {
                    C4651biY.e eVar = this.c.get(str);
                    C8632dsu.d(eVar);
                    C4651biY.e eVar2 = eVar;
                    if (eVar2.j() == SegmentType.e) {
                        Long c = eVar2.c();
                        if (c == null || c.longValue() != j2) {
                            C8652dtn c8652dtn = new C8652dtn(1 + j, j2);
                            Long c2 = eVar2.c();
                            if (c2 != null && c8652dtn.e(c2.longValue())) {
                                Long c3 = eVar2.c();
                                C8632dsu.d(c3);
                                pair = new Pair<>(str, c3);
                            }
                        } else {
                            C4710bje.e.getLogTag();
                            Long c4 = eVar2.c();
                            C8632dsu.d(c4);
                            pair = new Pair<>(str, c4);
                        }
                        pair2 = pair;
                    }
                }
            }
            C4710bje.e.getLogTag();
            return pair2;
        }
    }

    /* renamed from: o.bje$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("AdsPlaygraphBroker");
        }
    }

    static {
        ConfigFastPropertyC4PlayerControls.e eVar = ConfigFastPropertyC4PlayerControls.Companion;
        b = eVar.a();
        d = eVar.d();
        a = 10L;
    }

    public final Map<String, C5273bve> e(long j, List<C4642biP.d> list, List<C4642biP.d> list2) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) list2, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C4642biP.d dVar = (C4642biP.d) obj;
            if (!dVar.j() && !dVar.h() && (!dVar.a().isEmpty())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            C4642biP.d dVar2 = (C4642biP.d) it.next();
            String c = c(dVar2);
            String a2 = a(c);
            String e2 = e(c);
            e.getLogTag();
            C4651biY.e a3 = this.j.a(a2);
            if (a3 != null) {
                str = a3.d();
            }
            this.h = str;
            this.j.e(a2, e2, a(j, c, dVar2));
        }
        for (C4642biP.d dVar3 : list2) {
            String c2 = c(dVar3);
            String a4 = a(c2);
            C4651biY.e a5 = this.j.a(a4);
            this.h = a5 != null ? a5.d() : null;
            this.j.e(a4, e(c2), c(j, c2, dVar3.f()));
        }
        Map<String, C5273bve> c3 = c();
        ArrayList<C4642biP.d> arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            C4642biP.d dVar4 = (C4642biP.d) obj2;
            if (!dVar4.j() && !dVar4.h() && dVar4.a().isEmpty()) {
                arrayList2.add(obj2);
            }
        }
        for (C4642biP.d dVar5 : arrayList2) {
            String c4 = c(dVar5);
            String a6 = a(c4);
            String e3 = e(c4);
            C4651biY.e a7 = this.j.a(a6);
            String d2 = a7 != null ? a7.d() : null;
            C4651biY.e a8 = this.j.a(e3);
            String b2 = a8 != null ? a8.b() : null;
            if (d2 != null) {
                C5273bve c5273bve = c3.get(d2);
                if (c5273bve instanceof C4651biY) {
                    ((C4651biY) c5273bve).e(b2);
                    e.getLogTag();
                }
            }
            e.getLogTag();
        }
        return c3;
    }
}
