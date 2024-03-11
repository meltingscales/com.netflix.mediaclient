package o;

import com.apollographql.apollo3.network.ws.SubscriptionWsProtocol$Factory$1;
import com.apollographql.apollo3.network.ws.WsFrameType;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import java.util.Map;
import o.AbstractC9107jO;
import o.InterfaceC8991hE;

/* renamed from: o.jL  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9104jL extends AbstractC9107jO {
    private final long a;
    private final WsFrameType b;
    private final drM<InterfaceC8585dra<? super Map<String, ? extends Object>>, Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C9104jL(InterfaceC9106jN interfaceC9106jN, AbstractC9107jO.e eVar, long j, drM<? super InterfaceC8585dra<? super Map<String, ? extends Object>>, ? extends Object> drm, WsFrameType wsFrameType) {
        super(interfaceC9106jN, eVar);
        C8632dsu.c((Object) interfaceC9106jN, "");
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) wsFrameType, "");
        this.a = j;
        this.d = drm;
        this.b = wsFrameType;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086 A[RETURN] */
    @Override // o.AbstractC9107jO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(o.InterfaceC8585dra<? super o.dpR> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.apollographql.apollo3.network.ws.SubscriptionWsProtocol$connectionInit$1
            if (r0 == 0) goto L13
            r0 = r8
            com.apollographql.apollo3.network.ws.SubscriptionWsProtocol$connectionInit$1 r0 = (com.apollographql.apollo3.network.ws.SubscriptionWsProtocol$connectionInit$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.b = r1
            goto L18
        L13:
            com.apollographql.apollo3.network.ws.SubscriptionWsProtocol$connectionInit$1 r0 = new com.apollographql.apollo3.network.ws.SubscriptionWsProtocol$connectionInit$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.e
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            o.C8556dpz.d(r8)
            goto L87
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            java.lang.Object r2 = r0.d
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r4 = r0.a
            o.jL r4 = (o.C9104jL) r4
            o.C8556dpz.d(r8)
            goto L64
        L40:
            o.C8556dpz.d(r8)
            java.lang.String r8 = "type"
            java.lang.String r2 = "connection_init"
            kotlin.Pair r8 = o.dpD.a(r8, r2)
            kotlin.Pair[] r2 = new kotlin.Pair[r4]
            r5 = 0
            r2[r5] = r8
            java.util.Map r2 = o.dqF.a(r2)
            o.drM<o.dra<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, java.lang.Object> r8 = r7.d
            r0.a = r7
            r0.d = r2
            r0.b = r4
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L63
            return r1
        L63:
            r4 = r7
        L64:
            java.util.Map r8 = (java.util.Map) r8
            if (r8 == 0) goto L6d
            java.lang.String r5 = "payload"
            r2.put(r5, r8)
        L6d:
            com.apollographql.apollo3.network.ws.WsFrameType r8 = r4.b
            r4.e(r2, r8)
            long r5 = r4.a
            com.apollographql.apollo3.network.ws.SubscriptionWsProtocol$connectionInit$2 r8 = new com.apollographql.apollo3.network.ws.SubscriptionWsProtocol$connectionInit$2
            r2 = 0
            r8.<init>(r4, r2)
            r0.a = r2
            r0.d = r2
            r0.b = r3
            java.lang.Object r8 = o.C8779dyf.a(r5, r8, r0)
            if (r8 != r1) goto L87
            return r1
        L87:
            o.dpR r8 = o.dpR.c
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9104jL.e(o.dra):java.lang.Object");
    }

    @Override // o.AbstractC9107jO
    public void a(Map<String, ? extends Object> map) {
        C8632dsu.c((Object) map, "");
        Object obj = map.get("type");
        if (C8632dsu.c(obj, (Object) NotificationFactory.DATA)) {
            AbstractC9107jO.e a = a();
            Object obj2 = map.get(SignupConstants.Field.LANG_ID);
            C8632dsu.d(obj2);
            Object obj3 = map.get("payload");
            C8632dsu.d(obj3);
            a.c((String) obj2, (Map) obj3);
        } else if (C8632dsu.c(obj, (Object) UmaAlert.ICON_ERROR)) {
            Object obj4 = map.get(SignupConstants.Field.LANG_ID);
            if (obj4 instanceof String) {
                a().a((String) obj4, (Map) map.get("payload"));
            } else {
                a().d((Map) map.get("payload"));
            }
        } else if (C8632dsu.c(obj, (Object) "complete")) {
            AbstractC9107jO.e a2 = a();
            Object obj5 = map.get(SignupConstants.Field.LANG_ID);
            C8632dsu.d(obj5);
            a2.b((String) obj5);
        }
    }

    @Override // o.AbstractC9107jO
    public <D extends InterfaceC8991hE.b> void a(C8951gR<D> c8951gR) {
        Map<String, ? extends Object> c;
        C8632dsu.c((Object) c8951gR, "");
        c = dqE.c(dpD.a("type", "start"), dpD.a(SignupConstants.Field.LANG_ID, c8951gR.j().toString()), dpD.a("payload", C9003hQ.a.d(c8951gR)));
        e(c, this.b);
    }

    @Override // o.AbstractC9107jO
    public <D extends InterfaceC8991hE.b> void c(C8951gR<D> c8951gR) {
        Map<String, ? extends Object> c;
        C8632dsu.c((Object) c8951gR, "");
        c = dqE.c(dpD.a("type", "stop"), dpD.a(SignupConstants.Field.LANG_ID, c8951gR.j().toString()));
        e(c, this.b);
    }

    /* renamed from: o.jL$b */
    /* loaded from: classes2.dex */
    public static final class b implements AbstractC9107jO.c {
        private final long a;
        private final WsFrameType c;
        private final drM<InterfaceC8585dra<? super Map<String, ? extends Object>>, Object> e;

        public b() {
            this(0L, null, null, 7, null);
        }

        @Override // o.AbstractC9107jO.c
        public String d() {
            return "graphql-ws";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(long j, drM<? super InterfaceC8585dra<? super Map<String, ? extends Object>>, ? extends Object> drm, WsFrameType wsFrameType) {
            C8632dsu.c((Object) drm, "");
            C8632dsu.c((Object) wsFrameType, "");
            this.a = j;
            this.e = drm;
            this.c = wsFrameType;
        }

        public /* synthetic */ b(long j, drM drm, WsFrameType wsFrameType, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? 10000L : j, (i & 2) != 0 ? new SubscriptionWsProtocol$Factory$1(null) : drm, (i & 4) != 0 ? WsFrameType.a : wsFrameType);
        }

        @Override // o.AbstractC9107jO.c
        public AbstractC9107jO a(InterfaceC9106jN interfaceC9106jN, AbstractC9107jO.e eVar, dwU dwu) {
            C8632dsu.c((Object) interfaceC9106jN, "");
            C8632dsu.c((Object) eVar, "");
            C8632dsu.c((Object) dwu, "");
            return new C9104jL(interfaceC9106jN, eVar, this.a, this.e, this.c);
        }
    }
}
