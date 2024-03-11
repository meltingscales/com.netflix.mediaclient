package o;

import com.apollographql.apollo3.exception.ApolloNetworkException;
import com.apollographql.apollo3.exception.ApolloWebSocketClosedException;
import o.InterfaceC7830dGy;
import o.dyI;
import okio.ByteString;

/* renamed from: o.jM  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9105jM implements InterfaceC9111jS {
    private final InterfaceC7830dGy.b e;

    public C9105jM(InterfaceC7830dGy.b bVar) {
        C8632dsu.c((Object) bVar, "");
        this.e = bVar;
    }

    public C9105jM() {
        this(new C7823dGr());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    @Override // o.InterfaceC9111jS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(java.lang.String r6, java.util.List<o.C9006hT> r7, o.InterfaceC8585dra<? super o.InterfaceC9106jN> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.apollographql.apollo3.network.ws.DefaultWebSocketEngine$open$1
            if (r0 == 0) goto L13
            r0 = r8
            com.apollographql.apollo3.network.ws.DefaultWebSocketEngine$open$1 r0 = (com.apollographql.apollo3.network.ws.DefaultWebSocketEngine$open$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.c = r1
            goto L18
        L13:
            com.apollographql.apollo3.network.ws.DefaultWebSocketEngine$open$1 r0 = new com.apollographql.apollo3.network.ws.DefaultWebSocketEngine$open$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.d
            o.dGy r6 = (o.InterfaceC7830dGy) r6
            java.lang.Object r7 = r0.e
            o.dys r7 = (o.InterfaceC8792dys) r7
            o.C8556dpz.d(r8)
            goto L77
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            o.C8556dpz.d(r8)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r2 = 6
            r4 = 0
            o.dys r8 = o.C8799dyz.e(r8, r4, r4, r2, r4)
            o.dwF r2 = o.dwH.d(r4, r3, r4)
            o.dGu$b r4 = new o.dGu$b
            r4.<init>()
            o.dGu$b r6 = r4.a(r6)
            o.dGn r7 = o.C9099jG.c(r7)
            o.dGu$b r6 = r6.b(r7)
            o.dGu r6 = r6.a()
            o.dGy$b r7 = r5.e
            o.jM$b r4 = new o.jM$b
            r4.<init>(r2, r8)
            o.dGy r6 = r7.b(r6, r4)
            r0.e = r8
            r0.d = r6
            r0.c = r3
            java.lang.Object r7 = r2.b(r0)
            if (r7 != r1) goto L76
            return r1
        L76:
            r7 = r8
        L77:
            com.apollographql.apollo3.network.ws.DefaultWebSocketEngine$open$2 r8 = new com.apollographql.apollo3.network.ws.DefaultWebSocketEngine$open$2
            r8.<init>()
            r7.d(r8)
            o.jM$d r8 = new o.jM$d
            r8.<init>(r7, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9105jM.c(java.lang.String, java.util.List, o.dra):java.lang.Object");
    }

    /* renamed from: o.jM$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC7827dGv {
        final /* synthetic */ InterfaceC8792dys<String> c;
        final /* synthetic */ dwF<dpR> d;

        b(dwF<dpR> dwf, InterfaceC8792dys<String> interfaceC8792dys) {
            this.d = dwf;
            this.c = interfaceC8792dys;
        }

        @Override // o.AbstractC7827dGv
        public void d(InterfaceC7830dGy interfaceC7830dGy, C7824dGs c7824dGs) {
            C8632dsu.c((Object) interfaceC7830dGy, "");
            C8632dsu.c((Object) c7824dGs, "");
            this.d.a((dwF<dpR>) dpR.c);
        }

        @Override // o.AbstractC7827dGv
        public void d(InterfaceC7830dGy interfaceC7830dGy, String str) {
            C8632dsu.c((Object) interfaceC7830dGy, "");
            C8632dsu.c((Object) str, "");
            this.c.d((InterfaceC8792dys<String>) str);
        }

        @Override // o.AbstractC7827dGv
        public void a(InterfaceC7830dGy interfaceC7830dGy, ByteString byteString) {
            C8632dsu.c((Object) interfaceC7830dGy, "");
            C8632dsu.c((Object) byteString, "");
            this.c.d((InterfaceC8792dys<String>) byteString.m());
        }

        @Override // o.AbstractC7827dGv
        public void b(InterfaceC7830dGy interfaceC7830dGy, Throwable th, C7824dGs c7824dGs) {
            C8632dsu.c((Object) interfaceC7830dGy, "");
            C8632dsu.c((Object) th, "");
            this.d.a((dwF<dpR>) dpR.c);
            this.c.b(new ApolloNetworkException("Web socket communication error", th));
        }

        @Override // o.AbstractC7827dGv
        public void a(InterfaceC7830dGy interfaceC7830dGy, int i, String str) {
            C8632dsu.c((Object) interfaceC7830dGy, "");
            C8632dsu.c((Object) str, "");
            this.d.a((dwF<dpR>) dpR.c);
            this.c.b(new ApolloWebSocketClosedException(i, str, null, 4, null));
        }

        @Override // o.AbstractC7827dGv
        public void c(InterfaceC7830dGy interfaceC7830dGy, int i, String str) {
            C8632dsu.c((Object) interfaceC7830dGy, "");
            C8632dsu.c((Object) str, "");
            dyI.e.a(this.c, null, 1, null);
        }
    }

    /* renamed from: o.jM$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC9106jN {
        final /* synthetic */ InterfaceC8792dys<String> a;
        final /* synthetic */ InterfaceC7830dGy d;

        d(InterfaceC8792dys<String> interfaceC8792dys, InterfaceC7830dGy interfaceC7830dGy) {
            this.a = interfaceC8792dys;
            this.d = interfaceC7830dGy;
        }

        @Override // o.InterfaceC9106jN
        public Object b(InterfaceC8585dra<? super String> interfaceC8585dra) {
            return this.a.c(interfaceC8585dra);
        }

        @Override // o.InterfaceC9106jN
        public void b(ByteString byteString) {
            C8632dsu.c((Object) byteString, "");
            if (this.d.b(byteString)) {
                return;
            }
            dyI.e.a(this.a, null, 1, null);
        }

        @Override // o.InterfaceC9106jN
        public void d(String str) {
            C8632dsu.c((Object) str, "");
            if (this.d.a(str)) {
                return;
            }
            dyI.e.a(this.a, null, 1, null);
        }

        @Override // o.InterfaceC9106jN
        public void b() {
            this.d.a(1000, null);
        }
    }
}
