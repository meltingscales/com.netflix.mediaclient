package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Pair;

/* renamed from: o.iN  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9053iN implements Map<String, Object>, dsK {
    public static final a a = new a(null);
    private final Map<String, Object> b;
    private final UUID c;
    private Map<String, Long> d;
    private final String e;

    public boolean a(String str) {
        C8632dsu.c((Object) str, "");
        return this.b.containsKey(str);
    }

    public Set<Map.Entry<String, Object>> b() {
        return this.b.entrySet();
    }

    public Set<String> c() {
        return this.b.keySet();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ Object compute(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ Object computeIfAbsent(String str, Function<? super String, ? extends Object> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ Object computeIfPresent(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.b.containsValue(obj);
    }

    public Object d(String str) {
        C8632dsu.c((Object) str, "");
        return this.b.get(str);
    }

    public final Map<String, Object> d() {
        return this.b;
    }

    public final String e() {
        return this.e;
    }

    public int f() {
        return this.b.size();
    }

    public Collection<Object> g() {
        return this.b.values();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.b.isEmpty();
    }

    public final UUID j() {
        return this.c;
    }

    @Override // java.util.Map
    public /* synthetic */ Object merge(String str, Object obj, BiFunction<? super Object, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ Object put(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends Object> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ Object putIfAbsent(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ Object replace(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ boolean replace(String str, Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C9053iN(String str, Map<String, ? extends Object> map, UUID uuid) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) map, "");
        this.e = str;
        this.b = map;
        this.c = uuid;
    }

    public /* synthetic */ C9053iN(String str, Map map, UUID uuid, int i, C8627dsp c8627dsp) {
        this(str, map, (i & 4) != 0 ? null : uuid);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return a((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, Object>> entrySet() {
        return b();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof String) {
            return d((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return c();
    }

    @Override // java.util.Map
    public final int size() {
        return f();
    }

    @Override // java.util.Map
    public final Collection<Object> values() {
        return g();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9053iN(String str, Map<String, ? extends Object> map, UUID uuid, Map<String, Long> map2) {
        this(str, map, uuid);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) map2, "");
        this.d = map2;
    }

    public final int h() {
        Map<String, Long> map = this.d;
        return C9064iY.d(this) + (map != null ? map.size() * 8 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
        r2 = o.dqE.k(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.Pair<o.C9053iN, java.util.Set<java.lang.String>> d(o.C9053iN r9, java.lang.Long r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r9, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.b
            java.util.Map r1 = o.dqF.d(r1)
            java.util.Map<java.lang.String, java.lang.Long> r2 = r8.d
            if (r2 == 0) goto L1a
            java.util.Map r2 = o.dqF.d(r2)
            if (r2 != 0) goto L1f
        L1a:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
        L1f:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.b
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L29:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L75
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.b
            boolean r6 = r6.containsKey(r5)
            java.util.Map<java.lang.String, java.lang.Object> r7 = r8.b
            java.lang.Object r7 = r7.get(r5)
            if (r6 == 0) goto L53
            boolean r6 = o.C8632dsu.c(r7, r4)
            if (r6 != 0) goto L6f
        L53:
            r1.put(r5, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = r8.e
            r4.append(r6)
            r6 = 46
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.add(r4)
        L6f:
            if (r10 == 0) goto L29
            r2.put(r5, r10)
            goto L29
        L75:
            java.lang.String r10 = r8.e
            java.util.UUID r9 = r9.c
            o.iN r3 = new o.iN
            r3.<init>(r10, r1, r9, r2)
            kotlin.Pair r9 = o.dpD.a(r3, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9053iN.d(o.iN, java.lang.Long):kotlin.Pair");
    }

    public final Pair<C9053iN, Set<String>> d(C9053iN c9053iN) {
        C8632dsu.c((Object) c9053iN, "");
        return d(c9053iN, null);
    }

    public final Set<String> a() {
        int d;
        Set<String> W;
        Set<String> keySet = this.b.keySet();
        d = C8572dqo.d(keySet, 10);
        ArrayList arrayList = new ArrayList(d);
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(this.e + '.' + ((String) it.next()));
        }
        W = C8576dqs.W(arrayList);
        return W;
    }

    /* renamed from: o.iN$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final Set<String> a(C9053iN c9053iN, C9053iN c9053iN2) {
            Set j;
            Set d;
            Set d2;
            Set c;
            Set c2;
            int d3;
            Set<String> W;
            C8632dsu.c((Object) c9053iN, "");
            C8632dsu.c((Object) c9053iN2, "");
            if (!C8632dsu.c((Object) c9053iN.e(), (Object) c9053iN2.e())) {
                throw new IllegalStateException(("Cannot compute changed keys on record with different keys: '" + c9053iN.e() + "' - '" + c9053iN2.e() + '\'').toString());
            }
            Set<String> keySet = c9053iN.d().keySet();
            Set<String> keySet2 = c9053iN2.d().keySet();
            j = C8576dqs.j((Iterable) keySet, (Iterable) keySet2);
            Set set = j;
            d = dqM.d(keySet, set);
            d2 = dqM.d(keySet2, set);
            c = dqM.c(d, d2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                String str = (String) obj;
                if (!C8632dsu.c(c9053iN.d().get(str), c9053iN2.d().get(str))) {
                    arrayList.add(obj);
                }
            }
            c2 = dqM.c(c, arrayList);
            Set set2 = c2;
            d3 = C8572dqo.d(set2, 10);
            ArrayList arrayList2 = new ArrayList(d3);
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                arrayList2.add(c9053iN.e() + '.' + ((String) it.next()));
            }
            W = C8576dqs.W(arrayList2);
            return W;
        }
    }
}
