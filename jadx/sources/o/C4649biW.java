package o;

import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.contentplaygraph.AdvertsManager$AdBreakHydrationRequestCallbackHandler$onAdBreakHydrationRequestResult$1;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.contentplaygraph.AdvertsManager$requestHydration$2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C4642biP;
import o.C4649biW;
import o.C8632dsu;
import o.InterfaceC4652biZ;

/* renamed from: o.biW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4649biW implements InterfaceC4640biN {
    public static final d d = new d(null);
    private final Map<Long, InterfaceC4652biZ> a;
    private final InterfaceC4900boc b;
    private InterfaceC4634biH c;
    private InterfaceC4639biM e;
    private final int g;
    private final Map<Long, List<InterfaceC4643biQ>> h;

    public final void d(InterfaceC4634biH interfaceC4634biH) {
        C8632dsu.c((Object) interfaceC4634biH, "");
        this.c = interfaceC4634biH;
    }

    public final void e(InterfaceC4639biM interfaceC4639biM) {
        C8632dsu.c((Object) interfaceC4639biM, "");
        this.e = interfaceC4639biM;
    }

    public C4649biW(InterfaceC4900boc interfaceC4900boc) {
        C8632dsu.c((Object) interfaceC4900boc, "");
        this.b = interfaceC4900boc;
        this.g = 2;
        Map<Long, InterfaceC4652biZ> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap<Long, InterfaceC4652biZ>(4) { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.contentplaygraph.AdvertsManager$advertsDataProviders$1
            public int a() {
                return super.size();
            }

            public boolean a(Long l) {
                return super.containsKey(l);
            }

            public boolean a(InterfaceC4652biZ interfaceC4652biZ) {
                return super.containsValue(interfaceC4652biZ);
            }

            public Set<Long> b() {
                return super.keySet();
            }

            public Collection<InterfaceC4652biZ> c() {
                return super.values();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final boolean containsKey(Object obj) {
                if (obj instanceof Long) {
                    return a((Long) obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final boolean containsValue(Object obj) {
                if (obj instanceof InterfaceC4652biZ) {
                    return a((InterfaceC4652biZ) obj);
                }
                return false;
            }

            public InterfaceC4652biZ d(Long l) {
                return (InterfaceC4652biZ) super.remove(l);
            }

            public InterfaceC4652biZ d(Long l, InterfaceC4652biZ interfaceC4652biZ) {
                return (InterfaceC4652biZ) super.getOrDefault(l, interfaceC4652biZ);
            }

            public Set<Map.Entry<Long, InterfaceC4652biZ>> e() {
                return super.entrySet();
            }

            public InterfaceC4652biZ e(Long l) {
                return (InterfaceC4652biZ) super.get(l);
            }

            public boolean e(Long l, InterfaceC4652biZ interfaceC4652biZ) {
                return super.remove(l, interfaceC4652biZ);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final Set<Map.Entry<Long, InterfaceC4652biZ>> entrySet() {
                return e();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* synthetic */ Object get(Object obj) {
                if (obj instanceof Long) {
                    return e((Long) obj);
                }
                return null;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                return !(obj instanceof Long) ? obj2 : d((Long) obj, (InterfaceC4652biZ) obj2);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final Set<Long> keySet() {
                return b();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* synthetic */ Object remove(Object obj) {
                if (obj instanceof Long) {
                    return d((Long) obj);
                }
                return null;
            }

            @Override // java.util.HashMap, java.util.Map
            public final boolean remove(Object obj, Object obj2) {
                if ((obj instanceof Long) && (obj2 instanceof InterfaceC4652biZ)) {
                    return e((Long) obj, (InterfaceC4652biZ) obj2);
                }
                return false;
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final int size() {
                return a();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final Collection<InterfaceC4652biZ> values() {
                return c();
            }

            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry<Long, InterfaceC4652biZ> entry) {
                int i;
                C8632dsu.c((Object) entry, "");
                int size = size();
                i = C4649biW.this.g;
                return size > i;
            }
        });
        C8632dsu.a(synchronizedMap, "");
        this.a = synchronizedMap;
        this.h = new LinkedHashMap();
    }

    /* renamed from: o.biW$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("AdvertsManager");
        }
    }

    public final InterfaceC4652biZ d(long j, AbstractC4473bfF abstractC4473bfF, String str, String str2, C4877boF c4877boF) {
        List<AbstractC4470bfC> b;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c4877boF, "");
        if (abstractC4473bfF == null || (b = abstractC4473bfF.b()) == null || !(!b.isEmpty())) {
            return null;
        }
        C4650biX c4650biX = new C4650biX(j, abstractC4473bfF, str, str2, c4877boF);
        this.a.put(Long.valueOf(j), c4650biX);
        return c4650biX;
    }

    public final InterfaceC4652biZ c(long j) {
        return this.a.get(Long.valueOf(j));
    }

    public final List<InterfaceC4652biZ> c() {
        List<InterfaceC4652biZ> U;
        U = C8576dqs.U(this.a.values());
        return U;
    }

    public void c(long j, long j2) {
        ArrayList<C4642biP.d> arrayList;
        InterfaceC4639biM interfaceC4639biM;
        List<C4642biP.e> i;
        List<C4642biP.d> e2;
        InterfaceC4652biZ c = c(j);
        if (c == null || (e2 = c.e()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : e2) {
                C4642biP.d dVar = (C4642biP.d) obj;
                if (dVar.f() != j2 && !dVar.h() && !dVar.j() && dVar.e()) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList != null) {
            for (C4642biP.d dVar2 : arrayList) {
                d.getLogTag();
                i = C8569dql.i();
                dVar2.d(i);
                dVar2.e(false);
            }
        }
        if (arrayList == null || !(!arrayList.isEmpty()) || (interfaceC4639biM = this.e) == null) {
            return;
        }
        interfaceC4639biM.c(j, arrayList);
    }

    /* renamed from: o.biW$e */
    /* loaded from: classes3.dex */
    public final class e implements InterfaceC4901bod {
        private final C4650biX a;
        final /* synthetic */ C4649biW d;
        private final C4642biP.d e;

        public e(C4649biW c4649biW, C4650biX c4650biX, C4642biP.d dVar) {
            C8632dsu.c((Object) c4650biX, "");
            C8632dsu.c((Object) dVar, "");
            this.d = c4649biW;
            this.a = c4650biX;
            this.e = dVar;
        }

        @Override // o.InterfaceC4901bod
        public void e(C4902boe c4902boe) {
            InterfaceC4634biH interfaceC4634biH;
            C8632dsu.c((Object) c4902boe, "");
            boolean j = c4902boe.c().j();
            if (j && (interfaceC4634biH = this.d.c) != null) {
                interfaceC4634biH.e(this.a.d(), c4902boe.e());
            }
            C8737dwr.c(dwY.c(GF.e()), null, null, new AdvertsManager$AdBreakHydrationRequestCallbackHandler$onAdBreakHydrationRequestResult$1(this, j, (c4902boe.c() instanceof InterfaceC4413bdz) && C8632dsu.c((Object) ((InterfaceC4413bdz) c4902boe.c()).q(), (Object) "AD_BREAK_UNAVAILABLE"), c4902boe, this.d, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(AbstractC4473bfF abstractC4473bfF) {
            List<AbstractC4470bfC> b;
            Object obj;
            if (abstractC4473bfF == null || (b = abstractC4473bfF.b()) == null) {
                return;
            }
            Iterator<T> it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((AbstractC4470bfC) obj).b() == this.e.f()) {
                    break;
                }
            }
            AbstractC4470bfC abstractC4470bfC = (AbstractC4470bfC) obj;
            if (abstractC4470bfC != null) {
                this.e.d(C4642biP.b.d(abstractC4470bfC));
                for (C4642biP.e eVar : this.e.a()) {
                    eVar.a(this.e);
                }
                C4642biP.d dVar = this.e;
                Map<String, AbstractC4518bfy> c = abstractC4470bfC.c();
                C8632dsu.a(c, "");
                dVar.d(new C4813bmv(c, abstractC4470bfC.d(), false, 4, null));
                this.e.e(true);
            }
        }
    }

    @Override // o.InterfaceC4640biN
    public boolean d(long j, long j2, InterfaceC4643biQ interfaceC4643biQ) {
        d.getLogTag();
        C8737dwr.c(dwY.c(GF.e()), null, null, new AdvertsManager$requestHydration$2(this, j, j2, interfaceC4643biQ, null), 3, null);
        return true;
    }
}
