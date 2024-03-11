package o;

import java.util.List;

/* renamed from: o.bwe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5326bwe {
    Object a(String str, InterfaceC8585dra<? super Long> interfaceC8585dra);

    void a(String str);

    Object c(String str, InterfaceC8585dra<? super List<C5341bwt>> interfaceC8585dra);

    void d(String str, long j);

    void d(List<C5341bwt> list);

    Object e(C5341bwt c5341bwt, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    void e(String str);

    void e(C5341bwt c5341bwt);

    /* renamed from: o.bwe$a */
    /* loaded from: classes6.dex */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object d(o.InterfaceC5326bwe r4, o.C5341bwt r5, o.InterfaceC8585dra<? super o.dpR> r6) {
            /*
                boolean r0 = r6 instanceof com.netflix.mediaclient.storage.db.dao.UserMarkStoreDao$insertLastPosition$1
                if (r0 == 0) goto L13
                r0 = r6
                com.netflix.mediaclient.storage.db.dao.UserMarkStoreDao$insertLastPosition$1 r0 = (com.netflix.mediaclient.storage.db.dao.UserMarkStoreDao$insertLastPosition$1) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.c = r1
                goto L18
            L13:
                com.netflix.mediaclient.storage.db.dao.UserMarkStoreDao$insertLastPosition$1 r0 = new com.netflix.mediaclient.storage.db.dao.UserMarkStoreDao$insertLastPosition$1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.a
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.c
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r4 = r0.b
                r5 = r4
                o.bwt r5 = (o.C5341bwt) r5
                java.lang.Object r4 = r0.e
                o.bwe r4 = (o.InterfaceC5326bwe) r4
                o.C8556dpz.d(r6)
                goto L4e
            L32:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L3a:
                o.C8556dpz.d(r6)
                java.lang.String r6 = r5.e()
                r0.e = r4
                r0.b = r5
                r0.c = r3
                java.lang.Object r6 = r4.a(r6, r0)
                if (r6 != r1) goto L4e
                return r1
            L4e:
                java.lang.Number r6 = (java.lang.Number) r6
                long r0 = r6.longValue()
                r5.e(r0)
                r4.e(r5)
                o.dpR r4 = o.dpR.c
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.InterfaceC5326bwe.a.d(o.bwe, o.bwt, o.dra):java.lang.Object");
        }

        public static void e(InterfaceC5326bwe interfaceC5326bwe, List<C5341bwt> list) {
            C8632dsu.c((Object) list, "");
            for (C5341bwt c5341bwt : list) {
                interfaceC5326bwe.d(c5341bwt.a(), c5341bwt.c());
            }
        }
    }
}
