package o;

import com.netflix.mediaclient.servicemgr.interface_.details.LiveState;
import com.netflix.mediaclient.ui.live.impl.LiveStateManagerImpl$observeLiveState$2;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.inject.Inject;

/* loaded from: classes4.dex */
public final class bZM implements bZI {
    public static final b c = new b(null);
    private final InterfaceC1270Vf a;
    private final InterfaceC9638uF b;
    private final Set<Integer> d;
    private final bZB e;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[LiveState.values().length];
            try {
                iArr[LiveState.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LiveState.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LiveState.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LiveState.c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            c = iArr;
        }
    }

    @Inject
    public bZM(bZB bzb, InterfaceC1270Vf interfaceC1270Vf, InterfaceC9638uF interfaceC9638uF) {
        C8632dsu.c((Object) bzb, "");
        C8632dsu.c((Object) interfaceC1270Vf, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        this.e = bzb;
        this.a = interfaceC1270Vf;
        this.b = interfaceC9638uF;
        this.d = Collections.synchronizedSet(new LinkedHashSet());
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("LiveStateManagerImpl");
        }
    }

    @Override // o.bZI
    public dyS<bZK> c(Set<Integer> set, C2865aoD c2865aoD, boolean z) {
        C8632dsu.c((Object) set, "");
        if (set.isEmpty()) {
            return dyR.c(new bZK(null, null, null, 7, null));
        }
        return dyR.d(new LiveStateManagerImpl$observeLiveState$2(z, this, set, c2865aoD, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(2:18|(2:20|21)(5:22|(2:25|23)|26|27|(1:29)))|11|12|13))|31|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // o.bZI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(java.util.Set<java.lang.String> r6, o.InterfaceC8585dra<? super o.dpR> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.netflix.mediaclient.ui.live.impl.LiveStateManagerImpl$prefetchLiveBoxArts$1
            if (r0 == 0) goto L13
            r0 = r7
            com.netflix.mediaclient.ui.live.impl.LiveStateManagerImpl$prefetchLiveBoxArts$1 r0 = (com.netflix.mediaclient.ui.live.impl.LiveStateManagerImpl$prefetchLiveBoxArts$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.c = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.live.impl.LiveStateManagerImpl$prefetchLiveBoxArts$1 r0 = new com.netflix.mediaclient.ui.live.impl.LiveStateManagerImpl$prefetchLiveBoxArts$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.e
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            o.C8556dpz.d(r7)     // Catch: java.lang.Throwable -> L7b
            goto L7b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            o.C8556dpz.d(r7)
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L3d
            o.dpR r6 = o.dpR.c
            return r6
        L3d:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r2 = 10
            int r2 = o.C8570dqm.a(r6, r2)
            r7.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L4e:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            o.uN$a r4 = o.C9646uN.d
            o.uN r4 = r4.a()
            o.uN r2 = r4.e(r2)
            o.uN$b r2 = r2.b()
            r7.add(r2)
            goto L4e
        L6c:
            com.netflix.mediaclient.ui.live.impl.LiveStateManagerImpl$prefetchLiveBoxArts$2 r6 = new com.netflix.mediaclient.ui.live.impl.LiveStateManagerImpl$prefetchLiveBoxArts$2     // Catch: java.lang.Throwable -> L7b
            r2 = 0
            r6.<init>(r7, r5, r2)     // Catch: java.lang.Throwable -> L7b
            r0.c = r3     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r6 = o.dwY.b(r6, r0)     // Catch: java.lang.Throwable -> L7b
            if (r6 != r1) goto L7b
            return r1
        L7b:
            o.dpR r6 = o.dpR.c
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bZM.c(java.util.Set, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0161  */
    /* JADX WARN: Type inference failed for: r5v12, types: [T, java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, j$.time.Instant] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b8 -> B:24:0x00cb). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00e8 -> B:28:0x00f3). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.util.Set<java.lang.Integer> r20, o.C2865aoD r21, o.InterfaceC8585dra<? super kotlin.Pair<o.bZK, java.lang.Long>> r22) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bZM.d(java.util.Set, o.aoD, o.dra):java.lang.Object");
    }
}
