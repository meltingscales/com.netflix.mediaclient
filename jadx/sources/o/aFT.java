package o;

import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class aFT {
    private final ConcurrentHashMap<String, aFV<Object>> d = new ConcurrentHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(o.dEP r6, o.dEP r7, o.InterfaceC8585dra<? super java.util.Set<java.lang.String>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.netflix.mediaclient.hendrixconfig.impl.VolatileConfigManager$diffFieldJson$1
            if (r0 == 0) goto L13
            r0 = r8
            com.netflix.mediaclient.hendrixconfig.impl.VolatileConfigManager$diffFieldJson$1 r0 = (com.netflix.mediaclient.hendrixconfig.impl.VolatileConfigManager$diffFieldJson$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.c = r1
            goto L18
        L13:
            com.netflix.mediaclient.hendrixconfig.impl.VolatileConfigManager$diffFieldJson$1 r0 = new com.netflix.mediaclient.hendrixconfig.impl.VolatileConfigManager$diffFieldJson$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.a
            java.util.Set r6 = (java.util.Set) r6
            o.C8556dpz.d(r8)
            goto L5c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            o.C8556dpz.d(r8)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, o.aFV<java.lang.Object>> r8 = r5.d
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L45
            java.util.Set r6 = o.dqL.a()
            return r6
        L45:
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            com.netflix.mediaclient.hendrixconfig.impl.VolatileConfigManager$diffFieldJson$2 r2 = new com.netflix.mediaclient.hendrixconfig.impl.VolatileConfigManager$diffFieldJson$2
            r4 = 0
            r2.<init>(r8, r5, r4)
            r0.a = r8
            r0.c = r3
            java.lang.Object r6 = r5.e(r6, r7, r2, r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            r6 = r8
        L5c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aFT.a(o.dEP, o.dEP, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(o.dEP r10, o.dEP r11, o.InterfaceC8613dsb<? super java.lang.String, ? super o.dEI, ? super o.dEI, ? super o.InterfaceC8585dra<? super o.dpR>, ? extends java.lang.Object> r12, o.InterfaceC8585dra<? super o.dpR> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.netflix.mediaclient.hendrixconfig.impl.VolatileConfigManager$diffJsonObject$1
            if (r0 == 0) goto L13
            r0 = r13
            com.netflix.mediaclient.hendrixconfig.impl.VolatileConfigManager$diffJsonObject$1 r0 = (com.netflix.mediaclient.hendrixconfig.impl.VolatileConfigManager$diffJsonObject$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.b = r1
            goto L18
        L13:
            com.netflix.mediaclient.hendrixconfig.impl.VolatileConfigManager$diffJsonObject$1 r0 = new com.netflix.mediaclient.hendrixconfig.impl.VolatileConfigManager$diffJsonObject$1
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L5b
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r10 = r0.e
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r11 = r0.d
            o.dsb r11 = (o.InterfaceC8613dsb) r11
            java.lang.Object r12 = r0.c
            o.dEP r12 = (o.dEP) r12
            java.lang.Object r2 = r0.a
            o.dEP r2 = (o.dEP) r2
            o.C8556dpz.d(r13)
            goto La8
        L3d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L45:
            java.lang.Object r10 = r0.e
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r11 = r0.d
            o.dsb r11 = (o.InterfaceC8613dsb) r11
            java.lang.Object r12 = r0.c
            o.dEP r12 = (o.dEP) r12
            java.lang.Object r2 = r0.a
            o.dEP r2 = (o.dEP) r2
            o.C8556dpz.d(r13)
            r13 = r11
            r11 = r2
            goto L6d
        L5b:
            o.C8556dpz.d(r13)
            java.util.Set r13 = r10.keySet()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r13 = r13.iterator()
            r8 = r11
            r11 = r10
            r10 = r13
            r13 = r12
            r12 = r8
        L6d:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L9c
            java.lang.Object r2 = r10.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r11.get(r2)
            o.dEI r5 = (o.dEI) r5
            java.lang.Object r6 = r12.get(r2)
            o.dEI r6 = (o.dEI) r6
            boolean r7 = o.C8632dsu.c(r5, r6)
            if (r7 != 0) goto L6d
            r0.a = r11
            r0.c = r12
            r0.d = r13
            r0.e = r10
            r0.b = r4
            java.lang.Object r2 = r13.invoke(r2, r5, r6, r0)
            if (r2 != r1) goto L6d
            return r1
        L9c:
            java.util.Set r10 = r12.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r2 = r11
            r11 = r13
        La8:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto Ld3
            java.lang.Object r13 = r10.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r4 = r2.get(r13)
            o.dEI r4 = (o.dEI) r4
            if (r4 != 0) goto La8
            java.lang.Object r5 = r12.get(r13)
            o.dEI r5 = (o.dEI) r5
            r0.a = r2
            r0.c = r12
            r0.d = r11
            r0.e = r10
            r0.b = r3
            java.lang.Object r13 = r11.invoke(r13, r4, r5, r0)
            if (r13 != r1) goto La8
            return r1
        Ld3:
            o.dpR r10 = o.dpR.c
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aFT.e(o.dEP, o.dEP, o.dsb, o.dra):java.lang.Object");
    }

    public final <T> InterfaceC1551aFm<T> a(String str, Provider<T> provider) {
        aFV<Object> putIfAbsent;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) provider, "");
        ConcurrentHashMap<String, aFV<Object>> concurrentHashMap = this.d;
        aFV<Object> afv = concurrentHashMap.get(str);
        if (afv == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (afv = new aFV<>(provider)))) != null) {
            afv = putIfAbsent;
        }
        C8632dsu.d(afv);
        return afv;
    }
}
