package o;

import com.netflix.model.leafs.SearchPageEntity;
import java.util.ArrayList;
import java.util.List;
import o.C2431afu;
import o.C2492ahB;
import o.C2494ahD;
import o.C2504ahN;
import o.C2506ahP;

/* renamed from: o.cTz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6103cTz extends cTD {
    private final String a;
    private final C2504ahN b;
    private final String c;
    private final long d;
    private final String e;
    private final int f;
    private final C2494ahD g;
    private final String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6103cTz(C2494ahD c2494ahD, C2504ahN c2504ahN, int i, String str, String str2, int i2, long j, String str3, String str4) {
        super(c2494ahD, null, i, str, str2, i2, j, str3, str4);
        C8632dsu.c((Object) c2494ahD, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        this.g = c2494ahD;
        this.b = c2504ahN;
        this.c = str;
        this.j = str2;
        this.f = i2;
        this.d = j;
        this.e = str3;
        this.a = str4;
    }

    @Override // o.cTD, o.InterfaceC5272bvd
    public List<InterfaceC5278bvj> getResultsVideos() {
        List<C2494ahD.b> a;
        C1535aEx c1535aEx;
        C2506ahP.c b;
        C2431afu.e a2;
        C2492ahB b2;
        C2492ahB.i b3;
        C2492ahB.j a3;
        C2492ahB.h e;
        ArrayList arrayList = new ArrayList();
        C2494ahD.c a4 = this.g.a();
        if (a4 != null && (a = a4.a()) != null) {
            int i = 0;
            for (Object obj : a) {
                if (i < 0) {
                    C8569dql.h();
                }
                C2494ahD.d d = ((C2494ahD.b) obj).d();
                C2514ahX c2514ahX = null;
                C2630ajh d2 = (d == null || (b2 = d.b()) == null || (b3 = b2.b()) == null || (a3 = b3.a()) == null || (e = a3.e()) == null) ? null : e.d();
                C2431afu c = c(i);
                C2506ahP b4 = b(i);
                if (d2 != null) {
                    aEX aex = new aEX(d2, null, null);
                    if (c != null) {
                        C2431afu.a c2 = c.c();
                        C2514ahX e2 = (c2 == null || (a2 = c2.a()) == null) ? null : a2.e();
                        if (e2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        c1535aEx = new C1535aEx(e2);
                    } else {
                        c1535aEx = null;
                    }
                    if (b4 != null) {
                        C2506ahP.a e3 = b4.e();
                        if (e3 != null && (b = e3.b()) != null) {
                            c2514ahX = b.d();
                        }
                        if (c2514ahX == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        c1535aEx = new C1535aEx(c2514ahX);
                    }
                    arrayList.add(new cTQ(aex, c1535aEx));
                }
                i++;
            }
        }
        return arrayList;
    }

    private final C2506ahP b(int i) {
        C2504ahN.d dVar;
        C2504ahN.b d;
        C2504ahN c2504ahN = this.b;
        if (c2504ahN != null) {
            C2504ahN.c a = c2504ahN.a();
            List<C2504ahN.d> a2 = a != null ? a.a() : null;
            if (a2 == null || a2.get(i) == null || (dVar = a2.get(i)) == null || (d = dVar.d()) == null) {
                return null;
            }
            return d.c();
        }
        return null;
    }

    private final C2431afu c(int i) {
        C2504ahN.c a;
        List<C2504ahN.d> a2;
        C2504ahN.d dVar;
        C2504ahN.b d;
        C2504ahN c2504ahN = this.b;
        if (c2504ahN == null || (a = c2504ahN.a()) == null || (a2 = a.a()) == null || (dVar = a2.get(i)) == null || (d = dVar.d()) == null) {
            return null;
        }
        return d.b();
    }

    @Override // o.cTD, o.InterfaceC5272bvd
    public List<SearchPageEntity> getSearchPageEntities() {
        List<C2494ahD.b> a;
        int d;
        Object ctm;
        C2492ahB b;
        Object ctf;
        C2492ahB b2;
        C2492ahB b3;
        C2494ahD.c a2 = this.g.a();
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
            C2506ahP b4 = b(i);
            C2431afu c = c(i);
            C2494ahD.d d2 = bVar.d();
            C2492ahB.i b5 = (d2 == null || (b3 = d2.b()) == null) ? null : b3.b();
            C2494ahD.d d3 = bVar.d();
            C2492ahB.b a3 = (d3 == null || (b2 = d3.b()) == null) ? null : b2.a();
            if (c == null || b5 == null) {
                if (b4 != null && b5 != null) {
                    String a4 = bVar.a();
                    C2506ahP.a e = b4.e();
                    C2506ahP.c b6 = e != null ? e.b() : null;
                    if (b6 != null) {
                        ctm = new cTB(a4, b5, a3, b6);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (b5 != null) {
                    ctf = new cTF(bVar.a(), b5, a3);
                } else {
                    String a5 = bVar.a();
                    C2494ahD.d d4 = bVar.d();
                    C2492ahB.e e2 = (d4 == null || (b = d4.b()) == null) ? null : b.e();
                    if (e2 != null) {
                        ctm = new cTM(a5, e2);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                ctf = ctm;
            } else {
                ctf = new C6101cTx(bVar.a(), b5, a3, c);
            }
            arrayList.add(ctf);
            i++;
        }
        return arrayList;
    }
}
