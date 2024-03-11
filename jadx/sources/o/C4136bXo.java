package o;

import com.netflix.mediaclient.graphqlrepo.transformers.GraphQLLoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.TrailerItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.C1371Yv;
import o.C1387Zl;
import o.C2305adj;
import o.C2325aeC;
import o.C2342aeT;
import o.C2365aeq;
import o.C2372aex;
import o.C2386afK;
import o.C2387afL;
import o.C2389afN;
import o.C2392afQ;
import o.C2394afS;
import o.C2395afT;
import o.C2438agA;
import o.C2451agN;
import o.C2453agP;
import o.C2454agQ;
import o.C2458agU;
import o.C2463agZ;
import o.C2465agb;
import o.C2467agd;
import o.C2471agh;
import o.C2475agl;
import o.C2476agm;
import o.C2482ags;
import o.C2489agz;
import o.C2519ahc;
import o.C2522ahf;
import o.C2526ahj;
import o.C2527ahk;
import o.C2529ahm;
import o.YL;

/* renamed from: o.bXo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4136bXo {
    private final bSG d;

    /* renamed from: o.bXo$e */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LoMoType.values().length];
            try {
                iArr[LoMoType.ROAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoMoType.TOP_TEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoMoType.CONTINUE_WATCHING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoMoType.BILLBOARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LoMoType.DOWNLOADS_FOR_YOU.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LoMoType.KIDS_FAVORITES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LoMoType.GALLERY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LoMoType.BULK_RATER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LoMoType.BULK_RATER_RECOMMENDATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LoMoType.INSTANT_QUEUE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[LoMoType.COMING_SOON.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[LoMoType.TRENDING_NOW.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[LoMoType.RECENTLY_WATCHED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[LoMoType.REMINDERS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[LoMoType.TRAILERS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[LoMoType.FAVORITE_TITLES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[LoMoType.BEHIND_THE_SCENES.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[LoMoType.CATEGORIES.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[LoMoType.FEED.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            a = iArr;
        }
    }

    @Inject
    public C4136bXo(bSG bsg) {
        C8632dsu.c((Object) bsg, "");
        this.d = bsg;
    }

    public final List<C4002bSp> c(C2463agZ.d dVar) {
        C8632dsu.c((Object) dVar, "");
        C2458agU.c c = dVar.e().c();
        return d(c != null ? c.a() : null);
    }

    public final List<C4002bSp> a(YL.b bVar) {
        C2458agU a;
        C2458agU.c c;
        C8632dsu.c((Object) bVar, "");
        YL.a b = bVar.b();
        return d((b == null || (a = b.a()) == null || (c = a.c()) == null) ? null : c.a());
    }

    public final List<C4002bSp> d(C1387Zl.c cVar) {
        C2458agU e2;
        C2458agU.c c;
        C8632dsu.c((Object) cVar, "");
        C1387Zl.b e3 = cVar.e();
        return d((e3 == null || (e2 = e3.e()) == null || (c = e2.c()) == null) ? null : c.a());
    }

    public final List<C4002bSp> c(C1371Yv.e eVar) {
        C2458agU a;
        C2458agU.c c;
        C8632dsu.c((Object) eVar, "");
        C1371Yv.d b = eVar.b();
        return d((b == null || (a = b.a()) == null || (c = a.c()) == null) ? null : c.a());
    }

    private final List<C4002bSp> d(C2457agT c2457agT) {
        List<C4002bSp> i;
        C2454agQ I;
        C2454agQ.e d;
        List<C2454agQ.d> a;
        C2454agQ.d dVar;
        C2395afT g;
        C2395afT.d e2;
        List<C2395afT.c> b;
        C2395afT.c cVar;
        C2395afT.e a2;
        C2395afT.b b2;
        C2348aeZ e3;
        C4002bSp c4002bSp;
        C2519ahc E;
        C2529ahm e4;
        C2529ahm.n c;
        List<C2529ahm.e> d2;
        C2529ahm.e eVar;
        C2519ahc E2;
        C2519ahc.d c2;
        List<C2519ahc.c> d3;
        C2519ahc.c cVar2;
        aEV aeq;
        C2522ahf J2;
        C2529ahm c3;
        C2529ahm.n c4;
        List<C2529ahm.e> d4;
        C2529ahm.e eVar2;
        C2522ahf J3;
        C2522ahf.a d5;
        List<C2522ahf.e> c5;
        C2522ahf.e eVar3;
        C2394afS f;
        C2529ahm b3;
        C2529ahm.n c6;
        List<C2529ahm.e> d6;
        C2529ahm.e eVar4;
        C2394afS f2;
        C2394afS.e d7;
        List<C2394afS.d> d8;
        C2394afS.d dVar2;
        C2386afK c7;
        C2529ahm e5;
        C2529ahm.n c8;
        List<C2529ahm.e> d9;
        C2529ahm.e eVar5;
        C2386afK c9;
        C2386afK.d d10;
        C2386afK.a e6;
        List<C2386afK.b> a3;
        C2386afK.b bVar;
        C2465agb n;
        C2529ahm a4;
        C2529ahm.n c10;
        List<C2529ahm.e> d11;
        C2529ahm.e eVar6;
        C2465agb.c d12;
        List<C2465agb.b> e7;
        C2438agA w;
        C2529ahm e8;
        C2529ahm.n c11;
        List<C2529ahm.e> d13;
        C2529ahm.e eVar7;
        C2438agA w2;
        C2438agA.b b4;
        List<C2438agA.a> c12;
        C2438agA.a aVar;
        C2484agu v;
        C2529ahm c13;
        C2529ahm.n c14;
        List<C2529ahm.e> d14;
        C2529ahm.e eVar8;
        aEV aev;
        C2309adn a5;
        C2529ahm e9;
        C2529ahm.n c15;
        List<C2529ahm.e> d15;
        C2529ahm.e eVar9;
        C2305adj b5;
        C2529ahm a6;
        C2529ahm.n c16;
        List<C2529ahm.e> d16;
        C2529ahm.e eVar10;
        C2305adj b6;
        C2305adj.b d17;
        List<C2305adj.e> c17;
        C2305adj.e eVar11;
        C2439agB z;
        C2529ahm e10;
        C2529ahm.n c18;
        List<C2529ahm.e> d18;
        C2529ahm.e eVar12;
        C2393afR i2;
        C2529ahm d19;
        C2529ahm.n c19;
        List<C2529ahm.e> d20;
        C2529ahm.e eVar13;
        C2454agQ I2;
        C2454agQ.e d21;
        List<C2454agQ.d> a7;
        C2454agQ.d dVar3;
        C4002bSp c4002bSp2;
        C2527ahk K;
        C2527ahk.a b7;
        List<C2527ahk.e> c20;
        C2527ahk.e eVar14;
        C2527ahk.b e11;
        C2527ahk.c e12;
        C2527ahk K2;
        C2529ahm d22;
        C2529ahm.n c21;
        List<C2529ahm.e> d23;
        C2451agN H;
        C2529ahm a8;
        C2529ahm.n c22;
        List<C2529ahm.e> d24;
        C2529ahm.e eVar15;
        C2451agN H2;
        C2451agN.f b8;
        List<C2451agN.d> c23;
        C2451agN.d dVar4;
        C2451agN.a e13;
        C2451agN.g d25;
        C2451agN.e b9;
        C2451agN.j b10;
        C2451agN.e b11;
        C2451agN.c a9;
        C2630ajh b12;
        C2446agI D;
        C2529ahm a10;
        C2529ahm.n c24;
        List<C2529ahm.e> d26;
        C2529ahm.e eVar16;
        C2525ahi L;
        C2529ahm c25;
        C2529ahm.n c26;
        List<C2529ahm.e> d27;
        C2529ahm.e eVar17;
        C2469agf o2;
        C2529ahm e14;
        C2529ahm.n c27;
        List<C2529ahm.e> d28;
        C2529ahm.e eVar18;
        C2387afL d29;
        C2529ahm c28;
        C2529ahm.n c29;
        List<C2529ahm.e> d30;
        C2529ahm.e eVar19;
        C2387afL.i b13;
        List<C2387afL.e> e15;
        C2387afL.e eVar20;
        C2387afL.c c30;
        C2387afL.a c31;
        C2387afL.d c32;
        C2387afL.j c33;
        C2387afL.i b14;
        List<C2387afL.e> e16;
        C2387afL.e eVar21;
        C2387afL.c c34;
        C2387afL.a c35;
        C2387afL.b b15;
        C2387afL.g d31;
        C2454agQ I3;
        C2454agQ.e d32;
        List<C2454agQ.d> a11;
        C2454agQ.d dVar5;
        C2389afN j;
        C2389afN.c d33;
        List<C2389afN.d> a12;
        C2389afN.d dVar6;
        C2389afN.a d34;
        C2389afN.b e17;
        C2454agQ I4;
        C2454agQ.e d35;
        List<C2454agQ.d> a13;
        C2454agQ.d dVar7;
        C2526ahj.c b16;
        C2526ahj.e d36;
        List<C2526ahj.a> a14;
        C2526ahj.a aVar2;
        C2365aeq c36;
        C2409afh e18;
        C2526ahj.d c37;
        String e19;
        String b17;
        C2325aeC b18;
        C2325aeC.b d37;
        C2372aex c38;
        C2467agd.e d38;
        C2467agd.b a15;
        C2467agd.c a16;
        List<C2467agd.a> b19;
        C2467agd.a aVar3;
        C2399afX m;
        C2529ahm a17;
        C2529ahm.n c39;
        List<C2529ahm.e> d39;
        C2529ahm.e eVar22;
        C2454agQ I5;
        C2454agQ.e d40;
        List<C2454agQ.d> a18;
        C2454agQ.d dVar8;
        C2482ags.a b20;
        List<C2482ags.d> e20;
        C2482ags.d dVar9;
        C2482ags.e b21;
        C2482ags.b c40;
        C2347aeY d41;
        C2475agl.c a19;
        C2475agl.f e21;
        C2475agl.m a20;
        C2475agl.i a21;
        C2344aeV c41;
        C4002bSp c4002bSp3;
        C2475agl d42;
        C2475agl.d a22;
        List<C2475agl.b> e22;
        C2454agQ I6;
        C2454agQ.e d43;
        List<C2454agQ.d> a23;
        C2454agQ.d dVar10;
        C2471agh.a d44;
        List<C2471agh.c> b22;
        C2471agh.c cVar3;
        C2475agl.c a24;
        C2475agl.h d45;
        C2475agl.k b23;
        C2475agl.a c42;
        C2344aeV b24;
        C2475agl e23;
        C2475agl.d a25;
        List<C2475agl.b> e24;
        C2454agQ I7;
        C2454agQ.e d46;
        List<C2454agQ.d> a26;
        C2454agQ.d dVar11;
        C2453agP F;
        C2475agl e25;
        C2475agl.d a27;
        List<C2475agl.b> e26;
        C2475agl.b bVar2;
        C2453agP F2;
        C2453agP.b d47;
        List<C2453agP.d> d48;
        C2453agP.d dVar12;
        C2475agl.c a28;
        C2475agl.f e27;
        C2475agl.m a29;
        C2475agl.i a30;
        C2344aeV c43;
        C2454agQ I8;
        C2454agQ.e d49;
        List<C2454agQ.d> a31;
        C2454agQ.d dVar13;
        C2481agr q;
        C2475agl c44;
        C2475agl.d a32;
        List<C2475agl.b> e28;
        C2475agl.b bVar3;
        C2475agl.c a33;
        C2475agl.f e29;
        C2475agl.m a34;
        C2475agl.i a35;
        C2344aeV c45;
        C4002bSp c4002bSp4;
        C2454agQ I9;
        C2454agQ.e d50;
        List<C2454agQ.d> a36;
        C2454agQ.d dVar14;
        C2400afY l;
        C2475agl a37;
        C2475agl.d a38;
        List<C2475agl.b> e30;
        C2475agl.b bVar4;
        C2475agl.c a39;
        C2475agl.j c46;
        C2475agl.g d51;
        C2475agl.e e31;
        C2344aeV d52;
        C2454agQ I10;
        C2454agQ.e d53;
        List<C2454agQ.d> a40;
        C2454agQ.d dVar15;
        C2476agm r;
        C2475agl a41;
        C2475agl.d a42;
        List<C2475agl.b> e32;
        C2475agl.b bVar5;
        C2475agl.c a43;
        C2475agl.j c47;
        C2475agl.g d54;
        C2475agl.e e33;
        C2344aeV d55;
        C2476agm r2;
        C2476agm.d e34;
        List<C2476agm.c> c48;
        C2476agm.c cVar4;
        C2454agQ I11;
        C2454agQ.e d56;
        List<C2454agQ.d> a44;
        C2454agQ.d dVar16;
        C2489agz x;
        C2475agl d57;
        C2475agl.d a45;
        List<C2475agl.b> e35;
        C2475agl.b bVar6;
        C2475agl.c a46;
        C2475agl.f e36;
        C2475agl.m a47;
        C2475agl.i a48;
        C2344aeV c49;
        C2489agz.e c50;
        C2489agz.i a49;
        C2489agz.c e37;
        List<C2489agz.b> b25;
        C2454agQ I12;
        C2454agQ.e d58;
        List<C2454agQ.d> a50;
        C2454agQ.d dVar17;
        C2450agM B;
        C2475agl c51;
        C2475agl.d a51;
        List<C2475agl.b> e38;
        C2475agl.b bVar7;
        C2475agl.c a52;
        C2475agl.j c52;
        C2475agl.g d59;
        C2475agl.e e39;
        C2344aeV d60;
        C2454agQ I13;
        C2454agQ.e d61;
        List<C2454agQ.d> a53;
        C2454agQ.d dVar18;
        C2392afQ h;
        C2392afQ.b b26;
        List<C2392afQ.d> d62;
        C2392afQ.d dVar19;
        C2392afQ.c a54;
        C2392afQ.e a55;
        C2454agQ I14;
        C2454agQ.e d63;
        LoMoType c53 = GraphQLLoMo.b.c(c2457agT);
        List<C2454agQ.d> a56 = (c2457agT == null || (I14 = c2457agT.I()) == null || (d63 = I14.d()) == null) ? null : d63.a();
        if (a56 == null || a56.isEmpty()) {
            i = C8569dql.i();
            return i;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj : a56) {
            if (i3 < 0) {
                C8569dql.h();
            }
            C2454agQ.d dVar20 = (C2454agQ.d) obj;
            if (c53 == LoMoType.CHARACTERS) {
                if (c2457agT != null && (I13 = c2457agT.I()) != null && (d61 = I13.d()) != null && (a53 = d61.a()) != null && (dVar18 = a53.get(i3)) != null && (h = c2457agT.h()) != null && (b26 = h.b()) != null && (d62 = b26.d()) != null && (dVar19 = d62.get(i3)) != null && (a54 = dVar19.a()) != null && (a55 = a54.a()) != null && a55.b() != null) {
                    c4002bSp2 = new C4002bSp(new aDG(dVar18, dVar19));
                    c4002bSp = c4002bSp2;
                }
                c4002bSp = null;
            } else if (c53 == LoMoType.POPULAR_GAMES) {
                if (c2457agT != null && (I12 = c2457agT.I()) != null && (d58 = I12.d()) != null && (a50 = d58.a()) != null && (dVar17 = a50.get(i3)) != null && (B = c2457agT.B()) != null && (c51 = B.c()) != null && (a51 = c51.a()) != null && (e38 = a51.e()) != null && (bVar7 = e38.get(i3)) != null && (a52 = bVar7.a()) != null && (c52 = a52.c()) != null && (d59 = c52.d()) != null && (e39 = d59.e()) != null && (d60 = e39.d()) != null) {
                    String c54 = dVar17.c();
                    Integer b27 = dVar17.b();
                    int intValue = b27 != null ? b27.intValue() : -1;
                    C2342aeT.e c55 = bVar7.b().c();
                    String e40 = c55 != null ? c55.e() : null;
                    C2342aeT.e c56 = bVar7.b().c();
                    c4002bSp4 = new C4002bSp(new C1514aEc(c54, intValue, d60, e40, c56 != null ? c56.a() : null));
                    c4002bSp2 = c4002bSp4;
                    c4002bSp = c4002bSp2;
                }
                c4002bSp = null;
            } else if (c53 == LoMoType.IP_BASED_GAMES) {
                if (c2457agT != null && (I11 = c2457agT.I()) != null && (d56 = I11.d()) != null && (a44 = d56.a()) != null && (dVar16 = a44.get(i3)) != null && (x = c2457agT.x()) != null && (d57 = x.d()) != null && (a45 = d57.a()) != null && (e35 = a45.e()) != null && (bVar6 = e35.get(i3)) != null && (a46 = bVar6.a()) != null && (e36 = a46.e()) != null && (a47 = e36.a()) != null && (a48 = a47.a()) != null && (c49 = a48.c()) != null) {
                    C2489agz x2 = c2457agT.x();
                    C2489agz.b bVar8 = (x2 == null || (e37 = x2.e()) == null || (b25 = e37.b()) == null) ? null : b25.get(i3);
                    C2347aeY d64 = (bVar8 == null || (c50 = bVar8.c()) == null || (a49 = c50.a()) == null) ? null : a49.d();
                    if (bVar8 != null && d64 != null) {
                        c4002bSp = new C4002bSp(new C1527aEp(dVar16, c49, bVar6.b(), bVar8, d64));
                    }
                }
                c4002bSp = null;
            } else if (c53 == LoMoType.EDITORIAL_GAMES) {
                if (c2457agT != null && (I10 = c2457agT.I()) != null && (d53 = I10.d()) != null && (a40 = d53.a()) != null && (dVar15 = a40.get(i3)) != null && (r = c2457agT.r()) != null && (a41 = r.a()) != null && (a42 = a41.a()) != null && (e32 = a42.e()) != null && (bVar5 = e32.get(i3)) != null && (a43 = bVar5.a()) != null && (c47 = a43.c()) != null && (d54 = c47.d()) != null && (e33 = d54.e()) != null && (d55 = e33.d()) != null && (r2 = c2457agT.r()) != null && (e34 = r2.e()) != null && (c48 = e34.c()) != null && (cVar4 = c48.get(i3)) != null) {
                    String c57 = dVar15.c();
                    Integer b28 = dVar15.b();
                    c4002bSp = new C4002bSp(new C1519aEh(c57, b28 != null ? b28.intValue() : -1, d55, bVar5.b(), cVar4));
                }
                c4002bSp = null;
            } else if (c53 == LoMoType.DEFAULT_GAMES) {
                if (c2457agT != null && (I9 = c2457agT.I()) != null && (d50 = I9.d()) != null && (a36 = d50.a()) != null && (dVar14 = a36.get(i3)) != null && (l = c2457agT.l()) != null && (a37 = l.a()) != null && (a38 = a37.a()) != null && (e30 = a38.e()) != null && (bVar4 = e30.get(i3)) != null && (a39 = bVar4.a()) != null && (c46 = a39.c()) != null && (d51 = c46.d()) != null && (e31 = d51.e()) != null && (d52 = e31.d()) != null) {
                    String c58 = dVar14.c();
                    Integer b29 = dVar14.b();
                    int intValue2 = b29 != null ? b29.intValue() : 0;
                    C2342aeT.e c59 = bVar4.b().c();
                    String e41 = c59 != null ? c59.e() : null;
                    C2342aeT.e c60 = bVar4.b().c();
                    c4002bSp4 = new C4002bSp(new C1514aEc(c58, intValue2, d52, e41, c60 != null ? c60.a() : null));
                    c4002bSp2 = c4002bSp4;
                    c4002bSp = c4002bSp2;
                }
                c4002bSp = null;
            } else {
                if (c53 != LoMoType.MY_GAMES) {
                    if (c53 != LoMoType.READY_TO_PLAY) {
                        if (c53 != LoMoType.GAME_BILLBOARD) {
                            if (c53 != LoMoType.GAMES_TRAILERS) {
                                if (c53 != LoMoType.COLLECTION_VIDEO_PAGE_EVIDENCE && c53 != LoMoType.COLLECTION_PAGE_EVIDENCE) {
                                    switch (e.a[c53.ordinal()]) {
                                        case 1:
                                            if (c2457agT != null && (E = c2457agT.E()) != null && (e4 = E.e()) != null && (c = e4.c()) != null && (d2 = c.d()) != null && (eVar = d2.get(i3)) != null && (E2 = c2457agT.E()) != null && (c2 = E2.c()) != null && (d3 = c2.d()) != null && (cVar2 = d3.get(i3)) != null && aEV.c.a(eVar) != null) {
                                                aeq = new aEQ(eVar, cVar2);
                                                c4002bSp = new C4002bSp(aeq);
                                                break;
                                            }
                                            c4002bSp = null;
                                            break;
                                        case 2:
                                            if (c2457agT != null && (J2 = c2457agT.J()) != null && (c3 = J2.c()) != null && (c4 = c3.c()) != null && (d4 = c4.d()) != null && (eVar2 = d4.get(i3)) != null && (J3 = c2457agT.J()) != null && (d5 = J3.d()) != null && (c5 = d5.c()) != null && (eVar3 = c5.get(i3)) != null && aEV.c.a(eVar2) != null) {
                                                aeq = new aET(eVar2, eVar3);
                                                c4002bSp = new C4002bSp(aeq);
                                                break;
                                            }
                                            c4002bSp = null;
                                            break;
                                        case 3:
                                            if (c2457agT != null && (f = c2457agT.f()) != null && (b3 = f.b()) != null && (c6 = b3.c()) != null && (d6 = c6.d()) != null && (eVar4 = d6.get(i3)) != null && (f2 = c2457agT.f()) != null && (d7 = f2.d()) != null && (d8 = d7.d()) != null && (dVar2 = d8.get(i3)) != null && aEV.c.a(eVar4) != null) {
                                                aeq = new C1508aDx(eVar4, dVar2);
                                                c4002bSp = new C4002bSp(aeq);
                                                break;
                                            }
                                            c4002bSp = null;
                                            break;
                                        case 4:
                                            if (c2457agT != null && (c7 = c2457agT.c()) != null && (e5 = c7.e()) != null && (c8 = e5.c()) != null && (d9 = c8.d()) != null && (eVar5 = d9.get(i3)) != null && (c9 = c2457agT.c()) != null && (d10 = c9.d()) != null && (e6 = d10.e()) != null && (a3 = e6.a()) != null && (bVar = a3.get(i3)) != null && aEV.c.a(eVar5) != null) {
                                                aeq = new aDA(eVar5, bVar, C8171dfO.e(), this.d.a());
                                                c4002bSp = new C4002bSp(aeq);
                                                break;
                                            }
                                            break;
                                        case 5:
                                            if (c2457agT != null && (n = c2457agT.n()) != null && (a4 = n.a()) != null && (c10 = a4.c()) != null && (d11 = c10.d()) != null && (eVar6 = d11.get(i3)) != null && aEV.c.a(eVar6) != null) {
                                                Integer d65 = eVar6.d();
                                                if (d65 != null && d65.intValue() == 0) {
                                                    C2465agb n2 = c2457agT.n();
                                                    C2465agb.b bVar9 = (n2 == null || (d12 = n2.d()) == null || (e7 = d12.e()) == null) ? null : e7.get(i3);
                                                    if (bVar9 == null) {
                                                        InterfaceC1593aHa.c.a("DL4U missing edge at row " + i3);
                                                    }
                                                    aeq = new aDK(eVar6, bVar9);
                                                } else {
                                                    aeq = new aEV(eVar6);
                                                }
                                                c4002bSp = new C4002bSp(aeq);
                                                break;
                                            }
                                            break;
                                        case 6:
                                            if (c2457agT != null && (w = c2457agT.w()) != null && (e8 = w.e()) != null && (c11 = e8.c()) != null && (d13 = c11.d()) != null && (eVar7 = d13.get(i3)) != null && (w2 = c2457agT.w()) != null && (b4 = w2.b()) != null && (c12 = b4.c()) != null && (aVar = c12.get(i3)) != null && aEV.c.a(eVar7) != null) {
                                                aeq = new C1530aEs(eVar7, aVar);
                                                c4002bSp = new C4002bSp(aeq);
                                                break;
                                            }
                                            break;
                                        case 7:
                                            if (c2457agT != null && (v = c2457agT.v()) != null && (c13 = v.c()) != null && (c14 = c13.c()) != null && (d14 = c14.d()) != null && (eVar8 = d14.get(i3)) != null && aEV.c.a(eVar8) != null) {
                                                aev = new aEV(eVar8);
                                                aeq = aev;
                                                c4002bSp = new C4002bSp(aeq);
                                                break;
                                            }
                                            break;
                                        case 8:
                                            if (c2457agT != null && (a5 = c2457agT.a()) != null && (e9 = a5.e()) != null && (c15 = e9.c()) != null && (d15 = c15.d()) != null && (eVar9 = d15.get(i3)) != null && aEV.c.a(eVar9) != null) {
                                                aev = new aEV(eVar9);
                                                aeq = aev;
                                                c4002bSp = new C4002bSp(aeq);
                                                break;
                                            }
                                            break;
                                        case 9:
                                            if (c2457agT != null && (b5 = c2457agT.b()) != null && (a6 = b5.a()) != null && (c16 = a6.c()) != null && (d16 = c16.d()) != null && (eVar10 = d16.get(i3)) != null && (b6 = c2457agT.b()) != null && (d17 = b6.d()) != null && (c17 = d17.c()) != null && (eVar11 = c17.get(i3)) != null && aEV.c.a(eVar10) != null) {
                                                aeq = new aDF(eVar10, eVar11);
                                                c4002bSp = new C4002bSp(aeq);
                                                break;
                                            }
                                            break;
                                        case 10:
                                            if (c2457agT != null && (z = c2457agT.z()) != null && (e10 = z.e()) != null && (c18 = e10.c()) != null && (d18 = c18.d()) != null && (eVar12 = d18.get(i3)) != null && aEV.c.a(eVar12) != null) {
                                                aev = new aEV(eVar12);
                                                aeq = aev;
                                                c4002bSp = new C4002bSp(aeq);
                                                break;
                                            }
                                            break;
                                        case 11:
                                            if (c2457agT != null && (i2 = c2457agT.i()) != null && (d19 = i2.d()) != null && (c19 = d19.c()) != null && (d20 = c19.d()) != null && (eVar13 = d20.get(i3)) != null && aEV.c.a(eVar13) != null) {
                                                aev = new aEV(eVar13);
                                                aeq = aev;
                                                c4002bSp = new C4002bSp(aeq);
                                                break;
                                            }
                                            break;
                                        case 12:
                                            C2529ahm.e eVar23 = (c2457agT == null || (K2 = c2457agT.K()) == null || (d22 = K2.d()) == null || (c21 = d22.c()) == null || (d23 = c21.d()) == null) ? null : d23.get(i3);
                                            C2561aiR c61 = (c2457agT == null || (K = c2457agT.K()) == null || (b7 = K.b()) == null || (c20 = b7.c()) == null || (eVar14 = c20.get(i3)) == null || (e11 = eVar14.e()) == null || (e12 = e11.e()) == null) ? null : e12.c();
                                            if (c61 != null) {
                                                if (c2457agT != null && (I2 = c2457agT.I()) != null && (d21 = I2.d()) != null && (a7 = d21.a()) != null && (dVar3 = a7.get(i3)) != null) {
                                                    c4002bSp2 = new C4002bSp(new C4139bXr(dVar3, c61.c(), c61.b(), eVar23 != null ? eVar23.e() : null));
                                                    c4002bSp = c4002bSp2;
                                                    break;
                                                }
                                            } else if (eVar23 != null && aEV.c.a(eVar23) != null) {
                                                aeq = new aEV(eVar23);
                                                c4002bSp = new C4002bSp(aeq);
                                                break;
                                            }
                                            break;
                                        case 13:
                                            if (c2457agT != null && (H = c2457agT.H()) != null && (a8 = H.a()) != null && (c22 = a8.c()) != null && (d24 = c22.d()) != null && (eVar15 = d24.get(i3)) != null && aEV.c.a(eVar15) != null && (H2 = c2457agT.H()) != null && (b8 = H2.b()) != null && (c23 = b8.c()) != null && (dVar4 = c23.get(i3)) != null && (e13 = dVar4.e()) != null && (d25 = e13.d()) != null && (b9 = d25.b()) != null && (b10 = b9.b()) != null && (b11 = d25.b()) != null && (a9 = b11.a()) != null) {
                                                C2451agN.b e42 = d25.e();
                                                if (e42 != null) {
                                                    C2451agN.h c62 = e42.c();
                                                    if (c62 != null && (b12 = c62.b()) != null) {
                                                        aev = new aEH(eVar15, b10, a9, e42, new aEX(b12, null, null));
                                                    }
                                                } else {
                                                    aev = new aEM(eVar15, b10, a9);
                                                }
                                                aeq = aev;
                                                c4002bSp = new C4002bSp(aeq);
                                                break;
                                            }
                                            break;
                                        case 14:
                                            if (c2457agT != null && (D = c2457agT.D()) != null && (a10 = D.a()) != null && (c24 = a10.c()) != null && (d26 = c24.d()) != null && (eVar16 = d26.get(i3)) != null && aEV.c.a(eVar16) != null) {
                                                aev = new aEV(eVar16);
                                                aeq = aev;
                                                c4002bSp = new C4002bSp(aeq);
                                                break;
                                            }
                                            break;
                                        case 15:
                                            if (c2457agT != null && (L = c2457agT.L()) != null && (c25 = L.c()) != null && (c26 = c25.c()) != null && (d27 = c26.d()) != null && (eVar17 = d27.get(i3)) != null && aEV.c.a(eVar17) != null) {
                                                aev = new aEV(eVar17);
                                                aeq = aev;
                                                c4002bSp = new C4002bSp(aeq);
                                                break;
                                            }
                                            break;
                                        case 16:
                                            if (c2457agT != null && (o2 = c2457agT.o()) != null && (e14 = o2.e()) != null && (c27 = e14.c()) != null && (d28 = c27.d()) != null && (eVar18 = d28.get(i3)) != null && aEV.c.a(eVar18) != null) {
                                                aev = new aEV(eVar18);
                                                aeq = aev;
                                                c4002bSp = new C4002bSp(aeq);
                                                break;
                                            }
                                            break;
                                        case 17:
                                            if (c2457agT != null && (d29 = c2457agT.d()) != null && (c28 = d29.c()) != null && (c29 = c28.c()) != null && (d30 = c29.d()) != null && (eVar19 = d30.get(i3)) != null && aEV.c.a(eVar19) != null) {
                                                C2387afL d66 = c2457agT.d();
                                                C2563aiT c63 = (d66 == null || (b14 = d66.b()) == null || (e16 = b14.e()) == null || (eVar21 = e16.get(i3)) == null || (c34 = eVar21.c()) == null || (c35 = c34.c()) == null || (b15 = c35.b()) == null || (d31 = b15.d()) == null) ? null : d31.c();
                                                C2387afL d67 = c2457agT.d();
                                                C2563aiT b30 = (d67 == null || (b13 = d67.b()) == null || (e15 = b13.e()) == null || (eVar20 = e15.get(i3)) == null || (c30 = eVar20.c()) == null || (c31 = c30.c()) == null || (c32 = c31.c()) == null || (c33 = c32.c()) == null) ? null : c33.b();
                                                if (c63 == null) {
                                                    if (b30 != null) {
                                                        c63 = b30;
                                                    }
                                                }
                                                if (c63.b() != null) {
                                                    aeq = new C1510aDz(eVar19, c63);
                                                    c4002bSp = new C4002bSp(aeq);
                                                    break;
                                                }
                                            }
                                            break;
                                        case 18:
                                            if (c2457agT != null && (I3 = c2457agT.I()) != null && (d32 = I3.d()) != null && (a11 = d32.a()) != null && (dVar5 = a11.get(i3)) != null && (j = c2457agT.j()) != null && (d33 = j.d()) != null && (a12 = d33.a()) != null && (dVar6 = a12.get(i3)) != null && (d34 = dVar6.d()) != null && (e17 = d34.e()) != null && e17.e() != null) {
                                                c4002bSp2 = new C4002bSp(new C4142bXu(dVar5, dVar6));
                                                c4002bSp = c4002bSp2;
                                                break;
                                            }
                                            break;
                                        case 19:
                                            if (c2457agT != null && (I4 = c2457agT.I()) != null && (d35 = I4.d()) != null && (a13 = d35.a()) != null && (dVar7 = a13.get(i3)) != null) {
                                                C2467agd k = c2457agT.k();
                                                if (k == null || (a15 = k.a()) == null || (a16 = a15.a()) == null || (b19 = a16.b()) == null || (aVar3 = b19.get(i3)) == null || (c36 = aVar3.d()) == null) {
                                                    C2526ahj G = c2457agT.G();
                                                    if (G != null && (b16 = G.b()) != null && (d36 = b16.d()) != null && (a14 = d36.a()) != null && (aVar2 = a14.get(i3)) != null) {
                                                        c36 = aVar2.c();
                                                    }
                                                }
                                                if (c36.b().f() != null) {
                                                    C2467agd k2 = c2457agT.k();
                                                    if (k2 == null || (d38 = k2.d()) == null || (e18 = d38.e()) == null) {
                                                        C2526ahj G2 = c2457agT.G();
                                                        e18 = (G2 == null || (c37 = G2.c()) == null) ? null : c37.e();
                                                    }
                                                    if (e18 != null && (e19 = e18.e()) != null && (b17 = e18.b()) != null) {
                                                        TrailerItem.a aVar4 = new TrailerItem.a(e19, b17, c2457agT.e());
                                                        C2365aeq.a e43 = c36.e();
                                                        if (e43 != null && (b18 = e43.b()) != null && (d37 = b18.d()) != null && (c38 = d37.c()) != null) {
                                                            C2372aex.d a57 = c38.a();
                                                            if (a57 == null || a57.b() == null) {
                                                                C2372aex.e c64 = c38.c();
                                                                if (c64 != null) {
                                                                    c64.c();
                                                                }
                                                            }
                                                            c4002bSp2 = new C4002bSp(new aES(dVar7, c36.b(), c38, aVar4));
                                                            c4002bSp = c4002bSp2;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            if (c2457agT != null && (m = c2457agT.m()) != null && (a17 = m.a()) != null && (c39 = a17.c()) != null && (d39 = c39.d()) != null && (eVar22 = d39.get(i3)) != null && aEV.c.a(eVar22) != null) {
                                                aev = new aEV(eVar22);
                                                aeq = aev;
                                                c4002bSp = new C4002bSp(aeq);
                                                break;
                                            }
                                            c4002bSp = null;
                                            break;
                                    }
                                } else {
                                    if (c2457agT != null && (I = c2457agT.I()) != null && (d = I.d()) != null && (a = d.a()) != null && (dVar = a.get(i3)) != null && (g = c2457agT.g()) != null && (e2 = g.e()) != null && (b = e2.b()) != null && (cVar = b.get(i3)) != null && (a2 = cVar.a()) != null && (b2 = a2.b()) != null && (e3 = b2.e()) != null) {
                                        c4002bSp = new C4002bSp(new C1525aEn(e3.c(), e3.e(), dVar));
                                    }
                                    c4002bSp = null;
                                }
                            } else if (c2457agT != null && (I5 = c2457agT.I()) != null && (d40 = I5.d()) != null && (a18 = d40.a()) != null && (dVar8 = a18.get(i3)) != null) {
                                C2482ags u = c2457agT.u();
                                C2475agl.b bVar10 = (u == null || (d42 = u.d()) == null || (a22 = d42.a()) == null || (e22 = a22.e()) == null) ? null : e22.get(i3);
                                C2482ags u2 = c2457agT.u();
                                if (u2 != null && (b20 = u2.b()) != null && (e20 = b20.e()) != null && (dVar9 = e20.get(i3)) != null && (b21 = dVar9.b()) != null && (c40 = b21.c()) != null && (d41 = c40.d()) != null && bVar10 != null && (a19 = bVar10.a()) != null && (e21 = a19.e()) != null && (a20 = e21.a()) != null && (a21 = a20.a()) != null && (c41 = a21.c()) != null) {
                                    c4002bSp3 = new C4002bSp(new C1518aEg(dVar8, c41, bVar10.b(), d41));
                                    c4002bSp = c4002bSp3;
                                }
                            }
                        } else if (c2457agT != null && (I6 = c2457agT.I()) != null && (d43 = I6.d()) != null && (a23 = d43.a()) != null && (dVar10 = a23.get(i3)) != null) {
                            C2471agh t = c2457agT.t();
                            C2475agl.b bVar11 = (t == null || (e23 = t.e()) == null || (a25 = e23.a()) == null || (e24 = a25.e()) == null) ? null : e24.get(i3);
                            C2471agh t2 = c2457agT.t();
                            if (t2 != null && (d44 = t2.d()) != null && (b22 = d44.b()) != null && (cVar3 = b22.get(i3)) != null && bVar11 != null && (a24 = bVar11.a()) != null && (d45 = a24.d()) != null && (b23 = d45.b()) != null && (c42 = b23.c()) != null && (b24 = c42.b()) != null) {
                                c4002bSp3 = new C4002bSp(new C1517aEf(dVar10, b24, bVar11.b(), cVar3));
                                c4002bSp = c4002bSp3;
                            }
                        }
                    } else if (c2457agT != null && (I7 = c2457agT.I()) != null && (d46 = I7.d()) != null && (a26 = d46.a()) != null && (dVar11 = a26.get(i3)) != null && (F = c2457agT.F()) != null && (e25 = F.e()) != null && (a27 = e25.a()) != null && (e26 = a27.e()) != null && (bVar2 = e26.get(i3)) != null && (F2 = c2457agT.F()) != null && (d47 = F2.d()) != null && (d48 = d47.d()) != null && (dVar12 = d48.get(i3)) != null && (a28 = bVar2.a()) != null && (e27 = a28.e()) != null && (a29 = e27.a()) != null && (a30 = a29.a()) != null && (c43 = a30.c()) != null) {
                        c4002bSp3 = new C4002bSp(new aEI(dVar11, c43, bVar2.b(), dVar12));
                        c4002bSp = c4002bSp3;
                    }
                } else if (c2457agT != null && (I8 = c2457agT.I()) != null && (d49 = I8.d()) != null && (a31 = d49.a()) != null && (dVar13 = a31.get(i3)) != null && (q = c2457agT.q()) != null && (c44 = q.c()) != null && (a32 = c44.a()) != null && (e28 = a32.e()) != null && (bVar3 = e28.get(i3)) != null && (a33 = bVar3.a()) != null && (e29 = a33.e()) != null && (a34 = e29.a()) != null && (a35 = a34.a()) != null && (c45 = a35.c()) != null) {
                    String c65 = dVar13.c();
                    Integer b31 = dVar13.b();
                    int intValue3 = b31 != null ? b31.intValue() : 0;
                    C2342aeT.e c66 = bVar3.b().c();
                    String e44 = c66 != null ? c66.e() : null;
                    C2342aeT.e c67 = bVar3.b().c();
                    c4002bSp4 = new C4002bSp(new C1514aEc(c65, intValue3, c45, e44, c67 != null ? c67.a() : null));
                    c4002bSp2 = c4002bSp4;
                    c4002bSp = c4002bSp2;
                }
                c4002bSp = null;
            }
            if (c4002bSp != null) {
                arrayList.add(c4002bSp);
            }
            i3++;
        }
        return arrayList;
    }
}
