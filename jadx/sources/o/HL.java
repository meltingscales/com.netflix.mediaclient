package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes.dex */
public abstract class HL extends HG implements Map<String, HZ>, dsK {
    public /* synthetic */ HL(C8627dsp c8627dsp) {
        this();
    }

    public abstract Set a();

    public abstract int c();

    public abstract boolean c(HZ hz);

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ HZ compute(String str, BiFunction<? super String, ? super HZ, ? extends HZ> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ HZ computeIfAbsent(String str, Function<? super String, ? extends HZ> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ HZ computeIfPresent(String str, BiFunction<? super String, ? super HZ, ? extends HZ> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract Collection d();

    @Override // java.util.Map
    /* renamed from: d */
    public HZ remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract HZ d(String str);

    public abstract Set e();

    public abstract boolean e(String str);

    @Override // o.HZ
    public boolean f() {
        return true;
    }

    @Override // java.util.Map
    public /* synthetic */ HZ merge(String str, HZ hz, BiFunction<? super HZ, ? super HZ, ? extends HZ> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ HZ put(String str, HZ hz) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends HZ> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ HZ putIfAbsent(String str, HZ hz) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ HZ replace(String str, HZ hz) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ boolean replace(String str, HZ hz, HZ hz2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super HZ, ? extends HZ> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private HL() {
        super(null);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return e((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof HZ) {
            return c((HZ) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, HZ>> entrySet() {
        return a();
    }

    @Override // java.util.Map
    public final /* synthetic */ HZ get(Object obj) {
        if (obj instanceof String) {
            return d((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return e();
    }

    @Override // java.util.Map
    public final int size() {
        return c();
    }

    @Override // java.util.Map
    public final Collection<HZ> values() {
        return d();
    }

    public HZ b(GW gw) {
        C8632dsu.c((Object) gw, "");
        return (HZ) get(gw.b());
    }

    public String toString() {
        return HE.b(this);
    }
}
