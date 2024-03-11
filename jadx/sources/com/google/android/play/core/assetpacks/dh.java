package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class dh {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("ExtractorTaskFinder");
    private final de b;
    private final bh c;
    private final bu d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dh(de deVar, bh bhVar, bu buVar) {
        this.b = deVar;
        this.c = bhVar;
        this.d = buVar;
    }

    private final boolean b(db dbVar, dc dcVar) {
        bh bhVar = this.c;
        da daVar = dbVar.c;
        return new eo(bhVar, daVar.a, dbVar.b, daVar.b, dcVar.a).m();
    }

    private static boolean c(dc dcVar) {
        int i = dcVar.f;
        return i == 1 || i == 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dg a() {
        int i;
        dg dgVar;
        char c;
        dg dgVar2;
        de deVar;
        int i2;
        try {
            this.b.j();
            ArrayList arrayList = new ArrayList();
            for (db dbVar : this.b.g().values()) {
                if (bg.b(dbVar.c.d)) {
                    arrayList.add(dbVar);
                }
            }
            if (!arrayList.isEmpty()) {
                Map t = this.c.t();
                Iterator it = arrayList.iterator();
                while (true) {
                    i = 0;
                    if (!it.hasNext()) {
                        dgVar = null;
                        break;
                    }
                    db dbVar2 = (db) it.next();
                    Long l = (Long) t.get(dbVar2.c.a);
                    if (l != null && dbVar2.c.b == l.longValue()) {
                        a.a("Found promote pack task for session %s with pack %s.", Integer.valueOf(dbVar2.a), dbVar2.c.a);
                        int i3 = dbVar2.a;
                        String str = dbVar2.c.a;
                        dgVar = new ei(i3, str, this.c.a(str), dbVar2.b, dbVar2.c.b);
                        break;
                    }
                }
                if (dgVar == null) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            dgVar = null;
                            break;
                        }
                        db dbVar3 = (db) it2.next();
                        try {
                            bh bhVar = this.c;
                            da daVar = dbVar3.c;
                            if (bhVar.b(daVar.a, dbVar3.b, daVar.b) == dbVar3.c.f.size()) {
                                a.a("Found final move task for session %s with pack %s.", Integer.valueOf(dbVar3.a), dbVar3.c.a);
                                int i4 = dbVar3.a;
                                da daVar2 = dbVar3.c;
                                dgVar = new dw(i4, daVar2.a, dbVar3.b, daVar2.b, daVar2.c);
                                break;
                            }
                        } catch (IOException e) {
                            throw new ck(String.format("Failed to check number of completed merges for session %s, pack %s", Integer.valueOf(dbVar3.a), dbVar3.c.a), e, dbVar3.a);
                        }
                    }
                    if (dgVar == null) {
                        Iterator it3 = arrayList.iterator();
                        loop3: while (true) {
                            c = 3;
                            if (!it3.hasNext()) {
                                dgVar = null;
                                break;
                            }
                            db dbVar4 = (db) it3.next();
                            da daVar3 = dbVar4.c;
                            if (bg.b(daVar3.d)) {
                                for (dc dcVar : daVar3.f) {
                                    bh bhVar2 = this.c;
                                    da daVar4 = dbVar4.c;
                                    if (bhVar2.q(daVar4.a, dbVar4.b, daVar4.b, dcVar.a).exists()) {
                                        a.a("Found merge task for session %s with pack %s and slice %s.", Integer.valueOf(dbVar4.a), dbVar4.c.a, dcVar.a);
                                        int i5 = dbVar4.a;
                                        da daVar5 = dbVar4.c;
                                        dgVar = new dt(i5, daVar5.a, dbVar4.b, daVar5.b, dcVar.a);
                                        break loop3;
                                    }
                                }
                                continue;
                            }
                        }
                        if (dgVar == null) {
                            Iterator it4 = arrayList.iterator();
                            loop5: while (true) {
                                if (!it4.hasNext()) {
                                    dgVar = null;
                                    break;
                                }
                                db dbVar5 = (db) it4.next();
                                da daVar6 = dbVar5.c;
                                if (bg.b(daVar6.d)) {
                                    for (dc dcVar2 : daVar6.f) {
                                        if (b(dbVar5, dcVar2)) {
                                            bh bhVar3 = this.c;
                                            da daVar7 = dbVar5.c;
                                            if (bhVar3.p(daVar7.a, dbVar5.b, daVar7.b, dcVar2.a).exists()) {
                                                a.a("Found verify task for session %s with pack %s and slice %s.", Integer.valueOf(dbVar5.a), dbVar5.c.a, dcVar2.a);
                                                int i6 = dbVar5.a;
                                                da daVar8 = dbVar5.c;
                                                dgVar = new er(i6, daVar8.a, dbVar5.b, daVar8.b, dcVar2.a, dcVar2.b, dcVar2.c);
                                                break loop5;
                                            }
                                        }
                                    }
                                    continue;
                                }
                            }
                            if (dgVar == null) {
                                Iterator it5 = arrayList.iterator();
                                loop7: while (true) {
                                    if (!it5.hasNext()) {
                                        dgVar2 = null;
                                        break;
                                    }
                                    db dbVar6 = (db) it5.next();
                                    da daVar9 = dbVar6.c;
                                    if (bg.b(daVar9.d)) {
                                        for (dc dcVar3 : daVar9.f) {
                                            if (!c(dcVar3)) {
                                                bh bhVar4 = this.c;
                                                da daVar10 = dbVar6.c;
                                                Iterator it6 = it5;
                                                try {
                                                    i2 = new eo(bhVar4, daVar10.a, dbVar6.b, daVar10.b, dcVar3.a).a();
                                                } catch (IOException e2) {
                                                    a.b("Slice checkpoint corrupt, restarting extraction. %s", e2);
                                                    i2 = i;
                                                }
                                                if (i2 != -1 && ((cz) dcVar3.d.get(i2)).a) {
                                                    com.google.android.play.core.assetpacks.internal.o oVar = a;
                                                    Object[] objArr = new Object[5];
                                                    objArr[i] = Integer.valueOf(dcVar3.e);
                                                    objArr[1] = Integer.valueOf(dbVar6.a);
                                                    objArr[2] = dbVar6.c.a;
                                                    objArr[c] = dcVar3.a;
                                                    objArr[4] = Integer.valueOf(i2);
                                                    oVar.a("Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.", objArr);
                                                    InputStream a2 = this.d.a(dbVar6.a, dbVar6.c.a, dcVar3.a, i2);
                                                    int i7 = dbVar6.a;
                                                    da daVar11 = dbVar6.c;
                                                    String str2 = daVar11.a;
                                                    int i8 = dbVar6.b;
                                                    long j = daVar11.b;
                                                    String str3 = daVar11.c;
                                                    String str4 = dcVar3.a;
                                                    int i9 = dcVar3.e;
                                                    int size = dcVar3.d.size();
                                                    da daVar12 = dbVar6.c;
                                                    dgVar2 = new ce(i7, str2, i8, j, str3, str4, i9, i2, size, daVar12.e, daVar12.d, a2);
                                                    break loop7;
                                                }
                                                it5 = it6;
                                                c = 3;
                                                i = 0;
                                            }
                                        }
                                        continue;
                                    }
                                }
                                if (dgVar2 == null) {
                                    Iterator it7 = arrayList.iterator();
                                    loop9: while (true) {
                                        if (!it7.hasNext()) {
                                            dgVar2 = null;
                                            break;
                                        }
                                        db dbVar7 = (db) it7.next();
                                        da daVar13 = dbVar7.c;
                                        if (bg.b(daVar13.d)) {
                                            for (dc dcVar4 : daVar13.f) {
                                                if (c(dcVar4) && ((cz) dcVar4.d.get(0)).a && !b(dbVar7, dcVar4)) {
                                                    a.a("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", Integer.valueOf(dcVar4.f), Integer.valueOf(dbVar7.a), dbVar7.c.a, dcVar4.a);
                                                    InputStream a3 = this.d.a(dbVar7.a, dbVar7.c.a, dcVar4.a, 0);
                                                    int i10 = dbVar7.a;
                                                    String str5 = dbVar7.c.a;
                                                    dgVar2 = new ef(i10, str5, this.c.a(str5), this.c.c(dbVar7.c.a), dbVar7.b, dbVar7.c.b, dcVar4.f, dcVar4.a, dcVar4.c, a3);
                                                    break loop9;
                                                }
                                            }
                                            continue;
                                        }
                                    }
                                    if (dgVar2 != null) {
                                        deVar = this.b;
                                    }
                                } else {
                                    deVar = this.b;
                                }
                                deVar.l();
                                return dgVar2;
                            }
                        }
                    }
                }
                return dgVar;
            }
            this.b.l();
            return null;
        } finally {
            this.b.l();
        }
    }
}
