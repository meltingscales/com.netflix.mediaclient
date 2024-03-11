package o;

import java.util.List;
import o.C9035hw;
import o.aCR;

/* loaded from: classes3.dex */
public final class aCS {
    private final InterfaceC8554dpx a;
    private final InterfaceC8554dpx b;
    private final InterfaceC8554dpx c;
    private final InterfaceC8554dpx d;

    public aCS(final C9035hw c9035hw) {
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        InterfaceC8554dpx b3;
        InterfaceC8554dpx b4;
        C8632dsu.c((Object) c9035hw, "");
        b = dpB.b(new drO<String>() { // from class: com.netflix.mediaclient.graphqlrepo.api.errors.NetflixGraphQLError$message$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final String invoke() {
                return C9035hw.this.c();
            }
        });
        this.d = b;
        b2 = dpB.b(new drO<List<? extends C9035hw.a>>() { // from class: com.netflix.mediaclient.graphqlrepo.api.errors.NetflixGraphQLError$locations$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final List<C9035hw.a> invoke() {
                return C9035hw.this.e();
            }
        });
        this.c = b2;
        b3 = dpB.b(new drO<List<? extends Object>>() { // from class: com.netflix.mediaclient.graphqlrepo.api.errors.NetflixGraphQLError$path$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final List<Object> invoke() {
                return C9035hw.this.b();
            }
        });
        this.b = b3;
        b4 = dpB.b(new drO<aCR>() { // from class: com.netflix.mediaclient.graphqlrepo.api.errors.NetflixGraphQLError$typedError$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final aCR invoke() {
                return new aCR(C9035hw.this.a());
            }
        });
        this.a = b4;
    }

    public final String a() {
        return (String) this.d.getValue();
    }

    public final List<C9035hw.a> d() {
        return (List) this.c.getValue();
    }

    public final List<Object> e() {
        return (List) this.b.getValue();
    }

    public final aCR b() {
        return (aCR) this.a.getValue();
    }

    public String toString() {
        String a = a();
        List<C9035hw.a> d = d();
        List<Object> e = e();
        aCR b = b();
        return "Error(message = " + a + ", locations = " + d + ", path = " + e + ", typedError = " + b + ")";
    }
}
