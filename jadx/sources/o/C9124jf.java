package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.C8632dsu;
import o.InterfaceC9092j;
import o.InterfaceC9251m;

/* renamed from: o.jf  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9124jf implements InterfaceC9126jh {
    private final C9132jn b;

    public C9124jf(C9132jn c9132jn) {
        C8632dsu.c((Object) c9132jn, "");
        this.b = c9132jn;
    }

    @Override // o.InterfaceC9126jh
    public C9053iN d(String str) {
        int d;
        Object z;
        C8632dsu.c((Object) str, "");
        List<C9130jl> c = this.b.b(str).c();
        d = C8572dqo.d(c, 10);
        ArrayList arrayList = new ArrayList(d);
        for (C9130jl c9130jl : c) {
            arrayList.add(C9058iS.e.e(c9130jl.c(), c9130jl.b()));
        }
        z = C8576dqs.z((List<? extends Object>) arrayList);
        return (C9053iN) z;
    }

    @Override // o.InterfaceC9126jh
    public List<C9053iN> a(Collection<String> collection) {
        int d;
        C8632dsu.c((Object) collection, "");
        List<C9129jk> c = this.b.d(collection).c();
        d = C8572dqo.d(c, 10);
        ArrayList arrayList = new ArrayList(d);
        for (C9129jk c9129jk : c) {
            arrayList.add(C9058iS.e.e(c9129jk.c(), c9129jk.e()));
        }
        return arrayList;
    }

    @Override // o.InterfaceC9126jh
    public <T> T d(boolean z, final drO<? extends T> dro) {
        C8632dsu.c((Object) dro, "");
        return (T) InterfaceC9092j.d.e(this.b, false, new drM<InterfaceC9251m<T>, T>() { // from class: com.apollographql.apollo3.cache.normalized.sql.internal.JsonRecordDatabase$transaction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final T invoke(InterfaceC9251m<T> interfaceC9251m) {
                C8632dsu.c((Object) interfaceC9251m, "");
                return dro.invoke();
            }
        }, 1, null);
    }

    @Override // o.InterfaceC9126jh
    public void b(String str) {
        C8632dsu.c((Object) str, "");
        this.b.e(str);
    }

    @Override // o.InterfaceC9126jh
    public void a(String str) {
        C8632dsu.c((Object) str, "");
        this.b.b(str, "\\");
    }

    @Override // o.InterfaceC9126jh
    public void c() {
        this.b.d();
    }

    @Override // o.InterfaceC9126jh
    public long e() {
        return this.b.c().d().longValue();
    }

    @Override // o.InterfaceC9126jh
    public void c(C9053iN c9053iN) {
        C8632dsu.c((Object) c9053iN, "");
        this.b.d(c9053iN.e(), C9058iS.e.c(c9053iN));
    }

    @Override // o.InterfaceC9126jh
    public void a(C9053iN c9053iN) {
        C8632dsu.c((Object) c9053iN, "");
        this.b.a(C9058iS.e.c(c9053iN), c9053iN.e());
    }
}
