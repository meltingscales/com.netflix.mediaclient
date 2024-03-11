package o;

import com.netflix.model.leafs.SearchPageEntity;
import com.netflix.model.leafs.SearchSectionSummary;
import java.util.ArrayList;
import java.util.List;
import o.C2331aeI;
import o.C2492ahB;
import o.C2494ahD;

/* loaded from: classes4.dex */
public class cTD implements InterfaceC5272bvd {
    private final C2542ahz a;
    private final long b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final int g;
    private final String h;
    private final C2494ahD j;

    @Override // o.InterfaceC5272bvd
    public int getSectionIndex() {
        return this.g;
    }

    public cTD(C2494ahD c2494ahD, C2542ahz c2542ahz, int i, String str, String str2, int i2, long j, String str3, String str4) {
        C8632dsu.c((Object) c2494ahD, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        this.j = c2494ahD;
        this.a = c2542ahz;
        this.g = i;
        this.c = str;
        this.h = str2;
        this.f = i2;
        this.b = j;
        this.e = str3;
        this.d = str4;
    }

    @Override // o.InterfaceC5272bvd
    public List<InterfaceC5278bvj> getResultsVideos() {
        List<C2494ahD.b> a;
        C2492ahB b;
        C2492ahB.b a2;
        C2492ahB b2;
        C2492ahB.i b3;
        C2492ahB.j a3;
        C2492ahB.h e;
        ArrayList arrayList = new ArrayList();
        C2494ahD.c a4 = this.j.a();
        if (a4 != null && (a = a4.a()) != null) {
            int i = 0;
            for (Object obj : a) {
                if (i < 0) {
                    C8569dql.h();
                }
                C2494ahD.b bVar = (C2494ahD.b) obj;
                C2494ahD.d d = bVar.d();
                C2630ajh d2 = (d == null || (b2 = d.b()) == null || (b3 = b2.b()) == null || (a3 = b3.a()) == null || (e = a3.e()) == null) ? null : e.d();
                C2494ahD.d d3 = bVar.d();
                C2492ahB.c e2 = (d3 == null || (b = d3.b()) == null || (a2 = b.a()) == null) ? null : a2.e();
                if (d2 != null && e2 != null) {
                    arrayList.add(new cTQ(new aEX(d2, e2.c(), e2.a()), null));
                }
                i++;
            }
        }
        return arrayList;
    }

    @Override // o.InterfaceC5272bvd
    public List<InterfaceC5185btw> getGames() {
        List<C2494ahD.b> a;
        C2492ahB b;
        C2492ahB.i b2;
        C2492ahB.j a2;
        C2492ahB.a c;
        C2492ahB b3;
        C2492ahB.i b4;
        C2492ahB.j a3;
        C2492ahB.a c2;
        ArrayList arrayList = new ArrayList();
        C2494ahD.c a4 = this.j.a();
        if (a4 != null && (a = a4.a()) != null) {
            int i = 0;
            for (Object obj : a) {
                if (i < 0) {
                    C8569dql.h();
                }
                C2494ahD.b bVar = (C2494ahD.b) obj;
                C2494ahD.d d = bVar.d();
                C2344aeV d2 = (d == null || (b3 = d.b()) == null || (b4 = b3.b()) == null || (a3 = b4.a()) == null || (c2 = a3.c()) == null) ? null : c2.d();
                C2494ahD.d d3 = bVar.d();
                C2331aeI c3 = (d3 == null || (b = d3.b()) == null || (b2 = b.b()) == null || (a2 = b2.a()) == null || (c = a2.c()) == null) ? null : c.c();
                if (d2 != null && c3 != null) {
                    C2331aeI.a a5 = c3.a();
                    String b5 = a5 != null ? a5.b() : null;
                    C2331aeI.a a6 = c3.a();
                    arrayList.add(new C1514aEc(null, i, d2, b5, a6 != null ? a6.d() : null));
                }
                i++;
            }
        }
        return arrayList;
    }

    @Override // o.InterfaceC5272bvd
    public List<SearchPageEntity> getSearchPageEntities() {
        List<C2494ahD.b> a;
        int d;
        Object ctm;
        C2492ahB b;
        C2492ahB b2;
        C2492ahB b3;
        C2494ahD.c a2 = this.j.a();
        if (a2 == null || (a = a2.a()) == null) {
            return null;
        }
        d = C8572dqo.d(a, 10);
        ArrayList arrayList = new ArrayList(d);
        int i = 0;
        for (Object obj : a) {
            if (i < 0) {
                C8569dql.h();
            }
            C2494ahD.b bVar = (C2494ahD.b) obj;
            C2494ahD.d d2 = bVar.d();
            C2492ahB.i b4 = (d2 == null || (b3 = d2.b()) == null) ? null : b3.b();
            if (b4 != null) {
                String a3 = bVar.a();
                C2494ahD.d d3 = bVar.d();
                ctm = new cTF(a3, b4, (d3 == null || (b2 = d3.b()) == null) ? null : b2.a());
            } else {
                String a4 = bVar.a();
                C2494ahD.d d4 = bVar.d();
                C2492ahB.e e = (d4 == null || (b = d4.b()) == null) ? null : b.e();
                if (e != null) {
                    ctm = new cTM(a4, e);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            arrayList.add(ctm);
            i++;
        }
        return arrayList;
    }

    @Override // o.InterfaceC5272bvd
    public SearchSectionSummary getSearchSectionSummary() {
        return new cTI(this.j, this.a, this.g, this.c, this.f, this.h, this.b, this.e, this.d);
    }
}
