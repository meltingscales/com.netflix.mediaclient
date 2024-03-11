package o;

import com.netflix.model.leafs.SearchPageEntity;
import com.netflix.model.leafs.SearchSectionSummary;
import java.util.ArrayList;
import java.util.List;
import o.C2415afn;
import o.C2416afo;

/* loaded from: classes4.dex */
public class cTT implements InterfaceC5272bvd {
    private final C2411afj a;
    private final long b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final int h;
    private final C2415afn i;
    private final int j;

    @Override // o.InterfaceC5272bvd
    public int getSectionIndex() {
        return this.h;
    }

    public cTT(C2415afn c2415afn, C2411afj c2411afj, int i, String str, String str2, int i2, long j, String str3, String str4) {
        C8632dsu.c((Object) c2415afn, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        this.i = c2415afn;
        this.a = c2411afj;
        this.h = i;
        this.e = str;
        this.f = str2;
        this.j = i2;
        this.b = j;
        this.d = str3;
        this.c = str4;
    }

    @Override // o.InterfaceC5272bvd
    public List<InterfaceC5278bvj> getResultsVideos() {
        List<C2415afn.d> c;
        C2630ajh c2;
        C2416afo b;
        C2416afo.u k;
        C2416afo.C b2;
        C2416afo.A b3;
        C2416afo b4;
        C2416afo.r j;
        C2416afo.B c3;
        C2416afo.w c4;
        C2416afo b5;
        C2416afo.m b6;
        C2416afo.D e;
        C2416afo.y a;
        C2514ahX d;
        String e2;
        String b7;
        C2416afo b8;
        C2416afo.p f;
        C2416afo.C2419c e3;
        C2416afo b9;
        C2416afo.o e4;
        C2416afo b10;
        C2416afo.q c5;
        C2416afo.z b11;
        C2416afo.v e5;
        ArrayList arrayList = new ArrayList();
        C2415afn.e c6 = this.i.c();
        if (c6 != null && (c = c6.c()) != null) {
            int i = 0;
            for (Object obj : c) {
                if (i < 0) {
                    C8569dql.h();
                }
                C2415afn.d dVar = (C2415afn.d) obj;
                C2415afn.b e6 = dVar.e();
                C2514ahX c2514ahX = null;
                if (e6 == null || (b10 = e6.b()) == null || (c5 = b10.c()) == null || (b11 = c5.b()) == null || (e5 = b11.e()) == null || (c2 = e5.c()) == null) {
                    C2415afn.b e7 = dVar.e();
                    c2 = (e7 == null || (b = e7.b()) == null || (k = b.k()) == null || (b2 = k.b()) == null || (b3 = b2.b()) == null) ? null : b3.c();
                }
                C2415afn.b e8 = dVar.e();
                C2416afo.f e9 = (e8 == null || (b9 = e8.b()) == null || (e4 = b9.e()) == null) ? null : e4.e();
                C2415afn.b e10 = dVar.e();
                C2416afo.e c7 = (e10 == null || (b8 = e10.b()) == null || (f = b8.f()) == null || (e3 = f.e()) == null) ? null : e3.c();
                if (c2 != null && (e9 != null || c7 != null)) {
                    if (e9 == null || (e2 = e9.b()) == null) {
                        e2 = c7 != null ? c7.e() : null;
                    }
                    if (e9 == null || (b7 = e9.e()) == null) {
                        b7 = c7 != null ? c7.b() : null;
                    }
                    arrayList.add(new cTQ(new aEX(c2, e2, b7), null));
                } else if (c2 != null) {
                    aEX aex = new aEX(c2, null, null);
                    C2415afn.b e11 = dVar.e();
                    if (e11 == null || (b5 = e11.b()) == null || (b6 = b5.b()) == null || (e = b6.e()) == null || (a = e.a()) == null || (d = a.d()) == null) {
                        C2415afn.b e12 = dVar.e();
                        if (e12 != null && (b4 = e12.b()) != null && (j = b4.j()) != null && (c3 = j.c()) != null && (c4 = c3.c()) != null) {
                            c2514ahX = c4.a();
                        }
                    } else {
                        c2514ahX = d;
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

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00da A[SYNTHETIC] */
    @Override // o.InterfaceC5272bvd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<o.InterfaceC5185btw> getGames() {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            o.afn r1 = r10.i
            o.afn$e r1 = r1.c()
            if (r1 == 0) goto Lde
            java.util.List r1 = r1.c()
            if (r1 == 0) goto Lde
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L18:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lde
            java.lang.Object r3 = r1.next()
            if (r2 >= 0) goto L27
            o.C8570dqm.e()
        L27:
            o.afn$d r3 = (o.C2415afn.d) r3
            o.afn$b r4 = r3.e()
            r5 = 0
            if (r4 == 0) goto L4e
            o.afo r4 = r4.b()
            if (r4 == 0) goto L4e
            o.afo$q r4 = r4.c()
            if (r4 == 0) goto L4e
            o.afo$z r4 = r4.b()
            if (r4 == 0) goto L4e
            o.afo$j r4 = r4.c()
            if (r4 == 0) goto L4e
            o.aeV r4 = r4.d()
            if (r4 != 0) goto L70
        L4e:
            o.afn$b r4 = r3.e()
            if (r4 == 0) goto L72
            o.afo r4 = r4.b()
            if (r4 == 0) goto L72
            o.afo$u r4 = r4.k()
            if (r4 == 0) goto L72
            o.afo$C r4 = r4.b()
            if (r4 == 0) goto L72
            o.afo$k r4 = r4.d()
            if (r4 == 0) goto L72
            o.aeV r4 = r4.d()
        L70:
            r6 = r4
            goto L73
        L72:
            r6 = r5
        L73:
            o.afn$b r4 = r3.e()
            if (r4 == 0) goto L8a
            o.afo r4 = r4.b()
            if (r4 == 0) goto L8a
            o.afo$l r4 = r4.a()
            if (r4 == 0) goto L8a
            o.afo$g r4 = r4.d()
            goto L8b
        L8a:
            r4 = r5
        L8b:
            o.afn$b r3 = r3.e()
            if (r3 == 0) goto La8
            o.afo r3 = r3.b()
            if (r3 == 0) goto La8
            o.afo$t r3 = r3.g()
            if (r3 == 0) goto La8
            o.afo$h r3 = r3.c()
            if (r3 == 0) goto La8
            o.afo$b r3 = r3.c()
            goto La9
        La8:
            r3 = r5
        La9:
            if (r6 == 0) goto Lda
            if (r4 == 0) goto Lb3
            java.lang.String r7 = r4.e()
            if (r7 != 0) goto Lbb
        Lb3:
            if (r3 == 0) goto Lba
            java.lang.String r7 = r3.c()
            goto Lbb
        Lba:
            r7 = r5
        Lbb:
            if (r4 == 0) goto Lc6
            java.lang.String r4 = r4.b()
            if (r4 != 0) goto Lc4
            goto Lc6
        Lc4:
            r8 = r4
            goto Lcf
        Lc6:
            if (r3 == 0) goto Lce
            java.lang.String r3 = r3.d()
            r8 = r3
            goto Lcf
        Lce:
            r8 = r5
        Lcf:
            o.aEc r9 = new o.aEc
            r4 = 0
            r3 = r9
            r5 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            r0.add(r9)
        Lda:
            int r2 = r2 + 1
            goto L18
        Lde:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cTT.getGames():java.util.List");
    }

    private final cTO c(String str, C2416afo.q qVar, C2416afo c2416afo) {
        C2416afo.o e = c2416afo != null ? c2416afo.e() : null;
        C2416afo.m b = c2416afo != null ? c2416afo.b() : null;
        C2416afo.l a = c2416afo != null ? c2416afo.a() : null;
        if (e != null) {
            return new cTR(str, qVar, e);
        }
        if (b != null) {
            return new cTN(str, qVar, b);
        }
        cTP ctp = a != null ? new cTP(str, qVar, a) : null;
        return ctp != null ? ctp : new cTR(str, qVar, e);
    }

    private final cTX b(String str, C2416afo.u uVar, C2416afo c2416afo) {
        cTX cty;
        C2416afo.p f = c2416afo != null ? c2416afo.f() : null;
        C2416afo.r j = c2416afo != null ? c2416afo.j() : null;
        C2416afo.t g = c2416afo != null ? c2416afo.g() : null;
        if (f != null) {
            return new C6106cUb(str, uVar, f);
        }
        if (g != null) {
            cty = new C6105cUa(str, uVar, g);
        } else {
            cty = j != null ? new cTY(str, uVar, j) : null;
            if (cty == null) {
                return new C6106cUb(str, uVar, f);
            }
        }
        return cty;
    }

    @Override // o.InterfaceC5272bvd
    public List<SearchPageEntity> getSearchPageEntities() {
        List<C2415afn.d> c;
        int d;
        Object ctw;
        C2416afo b;
        C2416afo b2;
        C2416afo b3;
        C2416afo b4;
        C2415afn.e c2 = this.i.c();
        if (c2 == null || (c = c2.c()) == null) {
            return null;
        }
        d = C8572dqo.d(c, 10);
        ArrayList arrayList = new ArrayList(d);
        int i = 0;
        for (Object obj : c) {
            if (i < 0) {
                C8569dql.h();
            }
            C2415afn.d dVar = (C2415afn.d) obj;
            C2415afn.b e = dVar.e();
            C2416afo.q c3 = (e == null || (b4 = e.b()) == null) ? null : b4.c();
            C2415afn.b e2 = dVar.e();
            C2416afo.u k = (e2 == null || (b3 = e2.b()) == null) ? null : b3.k();
            C2415afn.b e3 = dVar.e();
            C2416afo.s h = (e3 == null || (b2 = e3.b()) == null) ? null : b2.h();
            C2415afn.b e4 = dVar.e();
            C2416afo.x i2 = (e4 == null || (b = e4.b()) == null) ? null : b.i();
            if (c3 != null) {
                String d2 = dVar.d();
                C2415afn.b e5 = dVar.e();
                ctw = c(d2, c3, e5 != null ? e5.b() : null);
                if (ctw != null) {
                    continue;
                    arrayList.add(ctw);
                    i++;
                }
            }
            if (k != null) {
                String d3 = dVar.d();
                C2415afn.b e6 = dVar.e();
                ctw = b(d3, k, e6 != null ? e6.b() : null);
            } else {
                ctw = h != null ? new cTW(dVar.d(), h) : null;
                if (ctw != null) {
                    continue;
                } else {
                    String d4 = dVar.d();
                    if (i2 != null) {
                        ctw = new cTU(d4, i2);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
            }
            arrayList.add(ctw);
            i++;
        }
        return arrayList;
    }

    @Override // o.InterfaceC5272bvd
    public SearchSectionSummary getSearchSectionSummary() {
        return new cTV(this.i, this.a, this.h, this.e, this.j, this.f, this.b, this.d, this.c);
    }
}
