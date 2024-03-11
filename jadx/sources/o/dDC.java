package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.Map;
import o.AbstractC7716dCs;
import o.C7703dCf;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes5.dex */
public final class dDC<K, V> extends AbstractC7742dDr<K, V, Map.Entry<? extends K, ? extends V>> {
    private final InterfaceC7707dCj b;

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b<K, V> implements Map.Entry<K, V>, dsK {
        private final V c;
        private final K e;

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c(this.e, bVar.e) && C8632dsu.c(this.c, bVar.c);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.e;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.e;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.c;
            return (hashCode * 31) + (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.e + ", value=" + this.c + ')';
        }

        public b(K k, V v) {
            this.e = k;
            this.c = v;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dDC(final dBT<K> dbt, final dBT<V> dbt2) {
        super(dbt, dbt2, null);
        C8632dsu.c((Object) dbt, "");
        C8632dsu.c((Object) dbt2, "");
        this.b = C7713dCp.a("kotlin.collections.Map.Entry", AbstractC7716dCs.e.a, new InterfaceC7707dCj[0], new drM<C7703dCf, dpR>() { // from class: kotlinx.serialization.internal.MapEntrySerializer$descriptor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7703dCf c7703dCf) {
                a(c7703dCf);
                return dpR.c;
            }

            public final void a(C7703dCf c7703dCf) {
                C8632dsu.c((Object) c7703dCf, "");
                C7703dCf.e(c7703dCf, SignupConstants.Error.DEBUG_FIELD_KEY, dbt.e(), null, false, 12, null);
                C7703dCf.e(c7703dCf, "value", dbt2.e(), null, false, 12, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7742dDr
    /* renamed from: a */
    public K b(Map.Entry<? extends K, ? extends V> entry) {
        C8632dsu.c((Object) entry, "");
        return entry.getKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7742dDr
    /* renamed from: d */
    public V e(Map.Entry<? extends K, ? extends V> entry) {
        C8632dsu.c((Object) entry, "");
        return entry.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7742dDr
    /* renamed from: a */
    public Map.Entry<K, V> c(K k, V v) {
        return new b(k, v);
    }
}
