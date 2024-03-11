package o;

import java.util.ArrayList;
import java.util.List;
import o.C2328aeF;
import o.C5239bux;
import o.aDQ;
import o.aDT;

/* loaded from: classes3.dex */
public final class aDQ implements InterfaceC5233bur {
    private final C2328aeF a;
    private final InterfaceC8554dpx d;
    private final String e;

    @Override // o.InterfaceC5233bur
    public String b() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aDQ) {
            aDQ adq = (aDQ) obj;
            return C8632dsu.c((Object) this.e, (Object) adq.e) && C8632dsu.c(this.a, adq.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.e;
        C2328aeF c2328aeF = this.a;
        return "GraphQLDpEpisodesPage(seasonId=" + str + ", page=" + c2328aeF + ")";
    }

    public aDQ(String str, C2328aeF c2328aeF) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2328aeF, "");
        this.e = str;
        this.a = c2328aeF;
        b = dpB.b(new drO<C5239bux>() { // from class: com.netflix.mediaclient.graphqlrepo.transformers.GraphQLDpEpisodesPage$pageInfo$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final C5239bux invoke() {
                C2328aeF c2328aeF2;
                c2328aeF2 = aDQ.this.a;
                return aDT.c(c2328aeF2);
            }
        });
        this.d = b;
    }

    @Override // o.InterfaceC5233bur
    public List<InterfaceC5227bul> e() {
        int d;
        List<C2328aeF.b> a = this.a.a();
        List<C2328aeF.e> list = null;
        if (a != null) {
            ArrayList arrayList = new ArrayList();
            for (C2328aeF.b bVar : a) {
                C2328aeF.e e = bVar != null ? bVar.e() : null;
                if (e != null) {
                    arrayList.add(e);
                }
            }
            list = arrayList;
        }
        if (list == null) {
            list = C8569dql.i();
        }
        d = C8572dqo.d(list, 10);
        ArrayList arrayList2 = new ArrayList(d);
        for (C2328aeF.e eVar : list) {
            arrayList2.add(new aDL(eVar));
        }
        return arrayList2;
    }

    @Override // o.InterfaceC5233bur
    public C5239bux d() {
        return (C5239bux) this.d.getValue();
    }
}
