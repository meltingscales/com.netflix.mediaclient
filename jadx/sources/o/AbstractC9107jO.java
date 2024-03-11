package o;

import com.apollographql.apollo3.network.ws.WsFrameType;
import java.util.Map;
import o.InterfaceC8991hE;
import okio.ByteString;

/* renamed from: o.jO  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9107jO {
    private final InterfaceC9106jN b;
    private final e d;

    /* renamed from: o.jO$c */
    /* loaded from: classes2.dex */
    public interface c {
        AbstractC9107jO a(InterfaceC9106jN interfaceC9106jN, e eVar, dwU dwu);

        String d();
    }

    /* renamed from: o.jO$d */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[WsFrameType.values().length];
            try {
                iArr[WsFrameType.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WsFrameType.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            d = iArr;
        }
    }

    /* renamed from: o.jO$e */
    /* loaded from: classes2.dex */
    public interface e {
        void a(String str, Map<String, ? extends Object> map);

        void b(String str);

        void c(String str, Map<String, ? extends Object> map);

        void d(Throwable th);

        void d(Map<String, ? extends Object> map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final e a() {
        return this.d;
    }

    public abstract void a(Map<String, ? extends Object> map);

    public abstract <D extends InterfaceC8991hE.b> void a(C8951gR<D> c8951gR);

    public Object c(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return d(this, interfaceC8585dra);
    }

    public abstract <D extends InterfaceC8991hE.b> void c(C8951gR<D> c8951gR);

    public abstract Object e(InterfaceC8585dra<? super dpR> interfaceC8585dra);

    public AbstractC9107jO(InterfaceC9106jN interfaceC9106jN, e eVar) {
        C8632dsu.c((Object) interfaceC9106jN, "");
        C8632dsu.c((Object) eVar, "");
        this.b = interfaceC9106jN;
        this.d = eVar;
    }

    protected final Map<String, Object> b(String str) {
        C8632dsu.c((Object) str, "");
        try {
            Object b = C8953gT.e.b(new C9068ic(new C7872dIo().b(str)), C9028hp.c);
            if (b instanceof Map) {
                return (Map) b;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    protected final void b(Map<String, ? extends Object> map) {
        C8632dsu.c((Object) map, "");
        this.b.b(d(map));
    }

    protected final void e(Map<String, ? extends Object> map) {
        C8632dsu.c((Object) map, "");
        this.b.d(c(map));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(Map<String, ? extends Object> map, WsFrameType wsFrameType) {
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) wsFrameType, "");
        int i = d.d[wsFrameType.ordinal()];
        if (i == 1) {
            e(map);
        } else if (i != 2) {
        } else {
            b(map);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004c -> B:19:0x004d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(o.InterfaceC8585dra<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.apollographql.apollo3.network.ws.WsProtocol$receiveMessageMap$1
            if (r0 == 0) goto L13
            r0 = r6
            com.apollographql.apollo3.network.ws.WsProtocol$receiveMessageMap$1 r0 = (com.apollographql.apollo3.network.ws.WsProtocol$receiveMessageMap$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.c = r1
            goto L18
        L13:
            com.apollographql.apollo3.network.ws.WsProtocol$receiveMessageMap$1 r0 = new com.apollographql.apollo3.network.ws.WsProtocol$receiveMessageMap$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.d
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r2 = r0.b
            o.jO r2 = (o.AbstractC9107jO) r2
            java.lang.Object r4 = r0.e
            o.jO r4 = (o.AbstractC9107jO) r4
            o.C8556dpz.d(r6)
            goto L4d
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L39:
            o.C8556dpz.d(r6)
            r2 = r5
        L3d:
            o.jN r6 = r2.b
            r0.e = r2
            r0.b = r2
            r0.c = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r4 = r2
        L4d:
            java.lang.String r6 = (java.lang.String) r6
            java.util.Map r6 = r2.b(r6)
            if (r6 == 0) goto L56
            return r6
        L56:
            r2 = r4
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC9107jO.a(o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0050 -> B:35:0x0053). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object d(o.AbstractC9107jO r5, o.InterfaceC8585dra<? super o.dpR> r6) {
        /*
            boolean r0 = r6 instanceof com.apollographql.apollo3.network.ws.WsProtocol$run$1
            if (r0 == 0) goto L13
            r0 = r6
            com.apollographql.apollo3.network.ws.WsProtocol$run$1 r0 = (com.apollographql.apollo3.network.ws.WsProtocol$run$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.e = r1
            goto L18
        L13:
            com.apollographql.apollo3.network.ws.WsProtocol$run$1 r0 = new com.apollographql.apollo3.network.ws.WsProtocol$run$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.d
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r5 = r0.a
            o.jO r5 = (o.AbstractC9107jO) r5
            java.lang.Object r2 = r0.b
            o.jO r2 = (o.AbstractC9107jO) r2
            o.C8556dpz.d(r6)     // Catch: java.lang.Exception -> L36 java.util.concurrent.CancellationException -> L69
            r4 = r6
            r6 = r5
            r5 = r2
            r2 = r0
            r0 = r4
            goto L53
        L36:
            r5 = move-exception
            goto L5d
        L38:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L40:
            o.C8556dpz.d(r6)
        L43:
            r0.b = r5     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L69
            r0.a = r5     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L69
            r0.e = r3     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L69
            java.lang.Object r6 = r5.a(r0)     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L69
            if (r6 != r1) goto L50
            return r1
        L50:
            r2 = r0
            r0 = r6
            r6 = r5
        L53:
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> L5a java.util.concurrent.CancellationException -> L69
            r6.a(r0)     // Catch: java.lang.Exception -> L5a java.util.concurrent.CancellationException -> L69
            r0 = r2
            goto L43
        L5a:
            r6 = move-exception
            r2 = r5
            r5 = r6
        L5d:
            r6 = r5
            r5 = r2
            goto L61
        L60:
            r6 = move-exception
        L61:
            o.jO$e r5 = r5.d
            r5.d(r6)
            o.dpR r5 = o.dpR.c
            return r5
        L69:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC9107jO.d(o.jO, o.dra):java.lang.Object");
    }

    public void c() {
        this.b.b();
    }

    protected final ByteString d(Map<String, ? extends Object> map) {
        C8632dsu.c((Object) map, "");
        C7872dIo c7872dIo = new C7872dIo();
        C9012hZ.c(new C9072ig(c7872dIo, null), map);
        return c7872dIo.r();
    }

    protected final String c(Map<String, ? extends Object> map) {
        C8632dsu.c((Object) map, "");
        C7872dIo c7872dIo = new C7872dIo();
        C9012hZ.c(new C9072ig(c7872dIo, null), map);
        return c7872dIo.v();
    }
}
