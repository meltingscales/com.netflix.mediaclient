package o;

import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: o.iR  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9057iR<Key, Value> {
    private int a;
    private a<Key, Value> b;
    private final LinkedHashMap<Key, a<Key, Value>> c;
    private a<Key, Value> d;
    private final int e;
    private final drX<Key, Value, Integer> i;

    /* JADX WARN: Multi-variable type inference failed */
    public C9057iR(int i, drX<? super Key, ? super Value, Integer> drx) {
        C8632dsu.c((Object) drx, "");
        this.e = i;
        this.i = drx;
        this.c = new LinkedHashMap<>(0, 0.75f);
    }

    public final Value a(Key key) {
        a<Key, Value> aVar = this.c.get(key);
        if (aVar != null) {
            e(aVar);
        }
        if (aVar != null) {
            return aVar.e();
        }
        return null;
    }

    public final void d(Key key, Value value) {
        a<Key, Value> aVar = this.c.get(key);
        if (aVar == null) {
            this.c.put(key, a(key, value));
        } else {
            aVar.a((a<Key, Value>) value);
            e(aVar);
        }
        b();
    }

    public final Value d(Key key) {
        return c(key);
    }

    public final Set<Key> a() {
        Set<Key> keySet = this.c.keySet();
        C8632dsu.a(keySet, "");
        return keySet;
    }

    private final Value c(Key key) {
        a<Key, Value> remove = this.c.remove(key);
        Value e = remove != null ? remove.e() : null;
        if (remove != null) {
            d((a) remove);
        }
        return e;
    }

    public final void c() {
        this.c.clear();
        this.d = null;
        this.b = null;
        this.a = 0;
    }

    private final void b() {
        a<Key, Value> aVar = this.b;
        while (aVar != null && this.a > this.e) {
            LinkedHashMap<Key, a<Key, Value>> linkedHashMap = this.c;
            dsH.d(linkedHashMap).remove(aVar.b());
            d((a) aVar);
            aVar = this.b;
        }
    }

    private final a<Key, Value> a(Key key, Value value) {
        a<Key, Value> aVar = new a<>(key, value, this.d, null);
        this.d = aVar;
        if (aVar.d() == null) {
            this.b = this.d;
        } else {
            a<Key, Value> d = aVar.d();
            if (d != null) {
                d.c((a) this.d);
            }
        }
        this.a += this.i.invoke(key, value).intValue();
        return aVar;
    }

    private final void e(a<Key, Value> aVar) {
        if (aVar.a() == null) {
            return;
        }
        a<Key, Value> a2 = aVar.a();
        if (a2 != null) {
            a2.a((a) aVar.d());
        }
        if (aVar.d() == null) {
            this.b = aVar.a();
        } else {
            a<Key, Value> d = aVar.d();
            if (d != null) {
                d.c((a) aVar.a());
            }
        }
        aVar.a((a) this.d);
        aVar.c((a) null);
        a<Key, Value> aVar2 = this.d;
        if (aVar2 != null) {
            aVar2.c((a) aVar);
        }
        this.d = aVar;
    }

    private final void d(a<Key, Value> aVar) {
        if (aVar.a() == null) {
            this.d = aVar.d();
        } else {
            a<Key, Value> a2 = aVar.a();
            if (a2 != null) {
                a2.a((a) aVar.d());
            }
        }
        if (aVar.d() == null) {
            this.b = aVar.a();
        } else {
            a<Key, Value> d = aVar.d();
            if (d != null) {
                d.c((a) aVar.a());
            }
        }
        int i = this.a;
        drX<Key, Value, Integer> drx = this.i;
        Key b = aVar.b();
        C8632dsu.d(b);
        this.a = i - drx.invoke(b, aVar.e()).intValue();
        aVar.c((a<Key, Value>) null);
        aVar.a((a<Key, Value>) null);
        aVar.a((a) null);
        aVar.c((a) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.iR$a */
    /* loaded from: classes2.dex */
    public static final class a<Key, Value> {
        private a<Key, Value> a;
        private Key b;
        private a<Key, Value> c;
        private Value d;

        public final a<Key, Value> a() {
            return this.c;
        }

        public final void a(Value value) {
            this.d = value;
        }

        public final void a(a<Key, Value> aVar) {
            this.a = aVar;
        }

        public final Key b() {
            return this.b;
        }

        public final void c(Key key) {
            this.b = key;
        }

        public final void c(a<Key, Value> aVar) {
            this.c = aVar;
        }

        public final a<Key, Value> d() {
            return this.a;
        }

        public final Value e() {
            return this.d;
        }

        public a(Key key, Value value, a<Key, Value> aVar, a<Key, Value> aVar2) {
            this.b = key;
            this.d = value;
            this.a = aVar;
            this.c = aVar2;
        }
    }
}
