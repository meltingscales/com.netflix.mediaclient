package o;

import com.netflix.model.leafs.SearchPageEntity;
import com.netflix.model.leafs.SearchSectionSummary;
import java.util.ArrayList;
import java.util.List;
import o.C2499ahI;
import o.C2502ahL;

/* loaded from: classes4.dex */
public class cTE implements InterfaceC5272bvd {
    private final C2498ahH a;
    private final String b;
    private final long c;
    private final String d;
    private final String e;
    private final C2499ahI g;
    private final int h;
    private final int i;
    private final String j;

    @Override // o.InterfaceC5272bvd
    public int getSectionIndex() {
        return this.h;
    }

    public cTE(C2499ahI c2499ahI, C2498ahH c2498ahH, int i, String str, String str2, int i2, long j, String str3, String str4) {
        C8632dsu.c((Object) c2499ahI, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        this.g = c2499ahI;
        this.a = c2498ahH;
        this.h = i;
        this.d = str;
        this.j = str2;
        this.i = i2;
        this.c = j;
        this.b = str3;
        this.e = str4;
    }

    @Override // o.InterfaceC5272bvd
    public List<InterfaceC5278bvj> getResultsVideos() {
        List<C2499ahI.b> e;
        C2502ahL e2;
        C2502ahL.h b;
        C2502ahL.q d;
        C2502ahL.m c;
        C2502ahL e3;
        C2502ahL.g a;
        C2502ahL.d d2;
        C2502ahL e4;
        C2502ahL.n h;
        C2502ahL.p c2;
        C2502ahL.l a2;
        ArrayList arrayList = new ArrayList();
        C2499ahI.d d3 = this.g.d();
        if (d3 != null && (e = d3.e()) != null) {
            int i = 0;
            for (Object obj : e) {
                if (i < 0) {
                    C8569dql.h();
                }
                C2499ahI.b bVar = (C2499ahI.b) obj;
                C2499ahI.e b2 = bVar.b();
                C2514ahX c2514ahX = null;
                C2630ajh b3 = (b2 == null || (e4 = b2.e()) == null || (h = e4.h()) == null || (c2 = h.c()) == null || (a2 = c2.a()) == null) ? null : a2.b();
                C2499ahI.e b4 = bVar.b();
                C2502ahL.e c3 = (b4 == null || (e3 = b4.e()) == null || (a = e3.a()) == null || (d2 = a.d()) == null) ? null : d2.c();
                if (b3 != null && c3 != null) {
                    arrayList.add(new cTQ(new aEX(b3, c3.a(), c3.c()), null));
                } else if (b3 != null) {
                    aEX aex = new aEX(b3, null, null);
                    C2499ahI.e b5 = bVar.b();
                    if (b5 != null && (e2 = b5.e()) != null && (b = e2.b()) != null && (d = b.d()) != null && (c = d.c()) != null) {
                        c2514ahX = c.a();
                    }
                    if (c2514ahX == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    arrayList.add(new cTQ(aex, new C1535aEx(c2514ahX)));
                } else {
                    continue;
                }
                i++;
            }
        }
        return arrayList;
    }

    @Override // o.InterfaceC5272bvd
    public List<InterfaceC5185btw> getGames() {
        List<C2499ahI.b> e;
        C2502ahL e2;
        C2502ahL.i c;
        C2502ahL.f a;
        C2502ahL e3;
        C2502ahL.n h;
        C2502ahL.p c2;
        C2502ahL.j d;
        ArrayList arrayList = new ArrayList();
        C2499ahI.d d2 = this.g.d();
        if (d2 != null && (e = d2.e()) != null) {
            int i = 0;
            for (Object obj : e) {
                if (i < 0) {
                    C8569dql.h();
                }
                C2499ahI.b bVar = (C2499ahI.b) obj;
                C2499ahI.e b = bVar.b();
                C2344aeV c3 = (b == null || (e3 = b.e()) == null || (h = e3.h()) == null || (c2 = h.c()) == null || (d = c2.d()) == null) ? null : d.c();
                C2499ahI.e b2 = bVar.b();
                C2502ahL.b e4 = (b2 == null || (e2 = b2.e()) == null || (c = e2.c()) == null || (a = c.a()) == null) ? null : a.e();
                if (c3 != null) {
                    arrayList.add(new C1514aEc(null, i, c3, e4 != null ? e4.c() : null, e4 != null ? e4.a() : null));
                }
                i++;
            }
        }
        return arrayList;
    }

    @Override // o.InterfaceC5272bvd
    public List<SearchPageEntity> getSearchPageEntities() {
        List<C2499ahI.b> e;
        int d;
        Object ctj;
        C2502ahL e2;
        C2502ahL e3;
        C2502ahL e4;
        C2502ahL e5;
        C2502ahL e6;
        C2502ahL e7;
        C2502ahL e8;
        C2502ahL e9;
        C2499ahI.d d2 = this.g.d();
        if (d2 == null || (e = d2.e()) == null) {
            return null;
        }
        d = C8572dqo.d(e, 10);
        ArrayList arrayList = new ArrayList(d);
        int i = 0;
        for (Object obj : e) {
            if (i < 0) {
                C8569dql.h();
            }
            C2499ahI.b bVar = (C2499ahI.b) obj;
            C2499ahI.e b = bVar.b();
            C2502ahL.n h = (b == null || (e9 = b.e()) == null) ? null : e9.h();
            C2499ahI.e b2 = bVar.b();
            C2502ahL.g a = (b2 == null || (e8 = b2.e()) == null) ? null : e8.a();
            C2499ahI.e b3 = bVar.b();
            C2502ahL.h b4 = (b3 == null || (e7 = b3.e()) == null) ? null : e7.b();
            C2499ahI.e b5 = bVar.b();
            C2502ahL.i c = (b5 == null || (e6 = b5.e()) == null) ? null : e6.c();
            C2499ahI.e b6 = bVar.b();
            C2502ahL.k d3 = (b6 == null || (e5 = b6.e()) == null) ? null : e5.d();
            C2499ahI.e b7 = bVar.b();
            C2502ahL.o e10 = (b7 == null || (e4 = b7.e()) == null) ? null : e4.e();
            if (h != null) {
                if (a != null) {
                    String e11 = bVar.e();
                    C2499ahI.e b8 = bVar.b();
                    ctj = new cTA(e11, h, (b8 == null || (e3 = b8.e()) == null) ? null : e3.a());
                } else if (b4 != null) {
                    ctj = new cTC(bVar.e(), h, b4);
                } else if (c != null) {
                    ctj = new C6097cTt(bVar.e(), h, c);
                } else {
                    String e12 = bVar.e();
                    C2499ahI.e b9 = bVar.b();
                    ctj = new cTA(e12, h, (b9 == null || (e2 = b9.e()) == null) ? null : e2.a());
                }
            } else if (d3 != null) {
                ctj = new cTL(bVar.e(), d3);
            } else {
                String e13 = bVar.e();
                if (e10 != null) {
                    ctj = new cTJ(e13, e10);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            arrayList.add(ctj);
            i++;
        }
        return arrayList;
    }

    @Override // o.InterfaceC5272bvd
    public SearchSectionSummary getSearchSectionSummary() {
        return new cTK(this.g, this.a, this.h, this.d, this.i, this.j, this.c, this.b, this.e);
    }
}
