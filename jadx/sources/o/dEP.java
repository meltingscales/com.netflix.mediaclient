package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import o.C8632dsu;
import o.dEI;
import o.dFK;

@InterfaceC7700dCc(e = dEW.class)
/* loaded from: classes5.dex */
public final class dEP extends dEI implements Map<String, dEI>, dsK {
    public static final a Companion = new a(null);
    private final Map<String, dEI> c;

    public int a() {
        return this.c.size();
    }

    public boolean a(String str) {
        C8632dsu.c((Object) str, "");
        return this.c.containsKey(str);
    }

    public Set<String> b() {
        return this.c.keySet();
    }

    public dEI b(String str) {
        C8632dsu.c((Object) str, "");
        return this.c.get(str);
    }

    public boolean b(dEI dei) {
        C8632dsu.c((Object) dei, "");
        return this.c.containsValue(dei);
    }

    public Set<Map.Entry<String, dEI>> c() {
        return this.c.entrySet();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ dEI compute(String str, BiFunction<? super String, ? super dEI, ? extends dEI> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ dEI computeIfAbsent(String str, Function<? super String, ? extends dEI> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ dEI computeIfPresent(String str, BiFunction<? super String, ? super dEI, ? extends dEI> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Collection<dEI> d() {
        return this.c.values();
    }

    @Override // java.util.Map
    /* renamed from: e */
    public dEI remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // java.util.Map
    public /* synthetic */ dEI merge(String str, dEI dei, BiFunction<? super dEI, ? super dEI, ? extends dEI> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ dEI put(String str, dEI dei) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends dEI> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ dEI putIfAbsent(String str, dEI dei) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ dEI replace(String str, dEI dei) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ boolean replace(String str, dEI dei, dEI dei2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super dEI, ? extends dEI> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* loaded from: classes5.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return a((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof dEI) {
            return b((dEI) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, dEI>> entrySet() {
        return c();
    }

    @Override // java.util.Map
    public final /* synthetic */ dEI get(Object obj) {
        if (obj instanceof String) {
            return b((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return b();
    }

    @Override // java.util.Map
    public final int size() {
        return a();
    }

    @Override // java.util.Map
    public final Collection<dEI> values() {
        return d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dEP(Map<String, ? extends dEI> map) {
        super(null);
        C8632dsu.c((Object) map, "");
        this.c = map;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return C8632dsu.c(this.c, obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        String d;
        d = C8576dqs.d(this.c.entrySet(), ",", "{", "}", 0, null, new drM<Map.Entry<? extends String, ? extends dEI>, CharSequence>() { // from class: kotlinx.serialization.json.JsonObject$toString$1
            @Override // o.drM
            /* renamed from: b */
            public final CharSequence invoke(Map.Entry<String, ? extends dEI> entry) {
                C8632dsu.c((Object) entry, "");
                StringBuilder sb = new StringBuilder();
                dFK.c(sb, entry.getKey());
                sb.append(':');
                sb.append(entry.getValue());
                String sb2 = sb.toString();
                C8632dsu.a(sb2, "");
                return sb2;
            }
        }, 24, null);
        return d;
    }
}
