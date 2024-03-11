package o;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebResourceError;
import com.apollographql.apollo3.exception.ApolloException;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.cl.model.event.discrete.secondscreen.BeaconReceived;
import com.netflix.cl.model.secondscreen.ConnectionSource;
import com.netflix.cl.model.secondscreen.SafeAreaSize;
import com.netflix.cl.model.secondscreen.ScreenResolution;
import com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation;
import com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerType;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.C1044Mm;
import o.C1390Zo;
import o.C6783cjn;
import o.C6784cjo;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8737dwr;
import o.C8927fu;
import o.C8954gU;
import o.C8971gl;
import o.InterfaceC1267Vc;
import o.InterfaceC1270Vf;
import o.InterfaceC6778cji;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* renamed from: o.cjo */
/* loaded from: classes4.dex */
public final class C6784cjo extends AbstractC8899fS<C6783cjn> implements InterfaceC6782cjm {
    public static final e b = new e(null);
    private final InterfaceC1267Vc a;
    private final InterfaceC1270Vf d;
    private final InterfaceC6778cji e;

    @AssistedFactory
    /* renamed from: o.cjo$b */
    /* loaded from: classes6.dex */
    public interface b extends InterfaceC8985gz<C6784cjo, C6783cjn> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public C6784cjo(@Assisted C6783cjn c6783cjn, InterfaceC6778cji interfaceC6778cji, InterfaceC1270Vf interfaceC1270Vf, InterfaceC1267Vc interfaceC1267Vc) {
        super(c6783cjn, null, 2, null);
        C8632dsu.c((Object) c6783cjn, "");
        C8632dsu.c((Object) interfaceC6778cji, "");
        C8632dsu.c((Object) interfaceC1270Vf, "");
        C8632dsu.c((Object) interfaceC1267Vc, "");
        this.e = interfaceC6778cji;
        this.d = interfaceC1270Vf;
        this.a = interfaceC1267Vc;
    }

    /* renamed from: o.cjo$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC8906fZ<C6784cjo, C6783cjn> {
        private final /* synthetic */ C8982gw<C6784cjo, C6783cjn> e;

        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        public C6784cjo create(AbstractC8979gt abstractC8979gt, C6783cjn c6783cjn) {
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) c6783cjn, "");
            return this.e.create(abstractC8979gt, c6783cjn);
        }

        private e() {
            this.e = new C8982gw<>(C6784cjo.class);
        }

        /* renamed from: initialState */
        public C6783cjn m3179initialState(AbstractC8979gt abstractC8979gt) {
            int w;
            Map<String, String> d;
            C8632dsu.c((Object) abstractC8979gt, "");
            Object b = abstractC8979gt.b();
            Bundle bundle = b instanceof Bundle ? (Bundle) b : null;
            if (bundle == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            if (bundle.containsKey("controllerUiUrl")) {
                Set<String> keySet = bundle.keySet();
                C8632dsu.a(keySet, "");
                ArrayList arrayList = new ArrayList();
                for (String str : keySet) {
                    String string = bundle.getString(str);
                    Pair pair = string != null ? new Pair(str, string) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                d = dqE.d(arrayList);
                return a(d);
            }
            String string2 = bundle.getString("EXTRA_BEACON_CODE");
            if (string2 == null) {
                throw new IllegalArgumentException("EXTRA_BEACON_CODE must be specified".toString());
            }
            C8632dsu.a(string2, "");
            ConnectionSource connectionSource = ConnectionSource.qrCode;
            int i = bundle.getInt("EXTRA_CONNECTION_SOURCE", connectionSource.ordinal());
            ConnectionSource[] values = ConnectionSource.values();
            if (i >= 0) {
                w = C8563dqf.w(values);
                if (i <= w) {
                    connectionSource = values[i];
                }
            }
            ConnectionSource connectionSource2 = connectionSource;
            C5343bwv.d.getLogTag();
            return new C6783cjn(string2, connectionSource2, null, null, false, false, null, null, null, false, null, null, null, null, 16380, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0067, code lost:
            r6 = o.C8566dqi.e(com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation.a.c(r6));
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.List<com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation> e(java.util.Map<java.lang.String, java.lang.String> r6) {
            /*
                r5 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = 0
            L6:
                r2 = 4
                if (r1 >= r2) goto L56
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "controllerUiOrientations["
                r2.append(r3)
                r2.append(r1)
                java.lang.String r3 = "]"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.Object r2 = r6.get(r2)
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L53
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Found controllerUiOrientations["
                r3.append(r4)
                r3.append(r1)
                java.lang.String r4 = "]: "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r4 = " "
                r3.append(r4)
                java.lang.String r4 = "GameControllerViewModel"
                java.lang.String r3 = r3.toString()
                o.C1044Mm.e(r4, r3)
                com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation$a r3 = com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation.a
                com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation r2 = r3.c(r2)
                r0.add(r2)
            L53:
                int r1 = r1 + 1
                goto L6
            L56:
                int r1 = r0.size()
                if (r1 <= 0) goto L5d
                return r0
            L5d:
                java.lang.String r0 = "controllerUiOrientations"
                java.lang.Object r6 = r6.get(r0)
                java.lang.String r6 = (java.lang.String) r6
                if (r6 == 0) goto L73
                com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation$a r0 = com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation.a
                com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation r6 = r0.c(r6)
                java.util.List r6 = o.C8570dqm.c(r6)
                if (r6 != 0) goto L7d
            L73:
                com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation$a r6 = com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation.a
                com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation[] r6 = r6.c()
                java.util.List r6 = o.C8561dqd.o(r6)
            L7d:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C6784cjo.e.e(java.util.Map):java.util.List");
        }

        public final C6783cjn a(Map<String, String> map) {
            List j;
            C8632dsu.c((Object) map, "");
            List<NGPBeaconControllerOrientation> e = e(map);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                j = C8569dql.j("connectionUrl", "connectionSecret", "controllerUiUrl", "controllerUiOrientations", "gameplaySessionId", "gameId");
                if (!j.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                arrayList.add(new C1390Zo.a(C2989aqV.e.e().b(), (String) entry2.getKey(), (String) entry2.getValue()));
            }
            C1044Mm.e("GameControllerViewModel", "extractStateFromOverrides...");
            ConnectionSource connectionSource = ConnectionSource.deepLink;
            String str = map.get("connectionSecret");
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String str2 = str;
            String str3 = map.get("gameId");
            int parseInt = str3 != null ? Integer.parseInt(str3) : -1;
            String str4 = map.get("gameplaySessionId");
            if (str4 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String str5 = str4;
            String str6 = map.get("connectionUrl");
            if (str6 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String str7 = str6;
            String str8 = map.get("controllerUiUrl");
            if (str8 != null) {
                return new C6783cjn("INTERNAL", connectionSource, null, new C8971gl(new C1390Zo.e("NGPRedeemBeaconSuccess", new C1390Zo.h(str2, parseInt, str5, str7, str8, arrayList, e, NGPBeaconControllerType.a, "00000000-0000-0000-0000-000000000000"), null)), false, false, null, null, null, false, null, null, null, null, 16372, null);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: o.cjo$a */
    /* loaded from: classes4.dex */
    public static final class a extends dqT implements CoroutineExceptionHandler {
        final /* synthetic */ C6784cjo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.c cVar, C6784cjo c6784cjo) {
            super(cVar);
            this.a = c6784cjo;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, final Throwable th) {
            C1044Mm.e("GameControllerViewModel", "setState on network error");
            this.a.b(new drM<C6783cjn, C6783cjn>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$doRedeemBeacon$handler$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: d */
                public final C6783cjn invoke(C6783cjn c6783cjn) {
                    C6783cjn a;
                    C8632dsu.c((Object) c6783cjn, "");
                    a = c6783cjn.a((r30 & 1) != 0 ? c6783cjn.c : null, (r30 & 2) != 0 ? c6783cjn.d : null, (r30 & 4) != 0 ? c6783cjn.e : null, (r30 & 8) != 0 ? c6783cjn.a : new C8927fu(th, null, 2, null), (r30 & 16) != 0 ? c6783cjn.l : false, (r30 & 32) != 0 ? c6783cjn.k : false, (r30 & 64) != 0 ? c6783cjn.f13741o : null, (r30 & 128) != 0 ? c6783cjn.f : null, (r30 & JSONzip.end) != 0 ? c6783cjn.g : null, (r30 & 512) != 0 ? c6783cjn.b : false, (r30 & 1024) != 0 ? c6783cjn.i : null, (r30 & 2048) != 0 ? c6783cjn.h : null, (r30 & 4096) != 0 ? c6783cjn.n : null, (r30 & 8192) != 0 ? c6783cjn.j : null);
                    return a;
                }
            });
        }
    }

    public static /* synthetic */ void c(C6784cjo c6784cjo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c6784cjo.a(z);
    }

    @SuppressLint({"CheckResult"})
    public final void a(final boolean z) {
        e(new drM<C6783cjn, dpR>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$redeemBeacon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C6783cjn c6783cjn) {
                d(c6783cjn);
                return dpR.c;
            }

            public final void d(C6783cjn c6783cjn) {
                C8632dsu.c((Object) c6783cjn, "");
                if (!C8632dsu.c((Object) c6783cjn.j(), (Object) "INTERNAL")) {
                    C6784cjo.this.d(z);
                } else {
                    C1044Mm.e("GameControllerViewModel", "Debug only: Internal, do not launch query ");
                }
            }
        });
    }

    public final void c(final String str) {
        C8632dsu.c((Object) str, "");
        b(new drM<C6783cjn, C6783cjn>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$setEsn$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final C6783cjn invoke(C6783cjn c6783cjn) {
                C6783cjn a2;
                C8632dsu.c((Object) c6783cjn, "");
                a2 = c6783cjn.a((r30 & 1) != 0 ? c6783cjn.c : null, (r30 & 2) != 0 ? c6783cjn.d : null, (r30 & 4) != 0 ? c6783cjn.e : str, (r30 & 8) != 0 ? c6783cjn.a : null, (r30 & 16) != 0 ? c6783cjn.l : false, (r30 & 32) != 0 ? c6783cjn.k : false, (r30 & 64) != 0 ? c6783cjn.f13741o : null, (r30 & 128) != 0 ? c6783cjn.f : null, (r30 & JSONzip.end) != 0 ? c6783cjn.g : null, (r30 & 512) != 0 ? c6783cjn.b : false, (r30 & 1024) != 0 ? c6783cjn.i : null, (r30 & 2048) != 0 ? c6783cjn.h : null, (r30 & 4096) != 0 ? c6783cjn.n : null, (r30 & 8192) != 0 ? c6783cjn.j : null);
                return a2;
            }
        });
        e(new drM<C6783cjn, dpR>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$setEsn$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C6783cjn c6783cjn) {
                d(c6783cjn);
                return dpR.c;
            }

            public final void d(C6783cjn c6783cjn) {
                InterfaceC1267Vc interfaceC1267Vc;
                InterfaceC1270Vf interfaceC1270Vf;
                C8632dsu.c((Object) c6783cjn, "");
                interfaceC1267Vc = C6784cjo.this.a;
                ConnectionSource g = c6783cjn.g();
                String j = c6783cjn.j();
                interfaceC1270Vf = C6784cjo.this.d;
                long c = interfaceC1270Vf.c();
                interfaceC1267Vc.b(new BeaconReceived(g, j, null, Long.valueOf(c), str, null, null));
            }
        });
    }

    public final void d(boolean z) {
        if (z) {
            C1044Mm.e("GameControllerViewModel", "setState on retry");
            e(new drM<C6783cjn, dpR>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$doRedeemBeacon$1
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C6783cjn c6783cjn) {
                    d(c6783cjn);
                    return dpR.c;
                }

                public final void d(final C6783cjn c6783cjn) {
                    C8632dsu.c((Object) c6783cjn, "");
                    C6784cjo.this.b(new drM<C6783cjn, C6783cjn>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$doRedeemBeacon$1.1
                        {
                            super(1);
                        }

                        @Override // o.drM
                        /* renamed from: d */
                        public final C6783cjn invoke(C6783cjn c6783cjn2) {
                            C8632dsu.c((Object) c6783cjn2, "");
                            return new C6783cjn(c6783cjn2.j(), c6783cjn2.g(), C6783cjn.this.h(), null, false, false, null, null, null, false, null, null, null, null, 16376, null);
                        }
                    });
                }
            });
        }
        final a aVar = new a(CoroutineExceptionHandler.Key, this);
        final long b2 = this.d.b();
        b(new drM<C6783cjn, C6783cjn>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$doRedeemBeacon$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final C6783cjn invoke(C6783cjn c6783cjn) {
                C6783cjn a2;
                C8632dsu.c((Object) c6783cjn, "");
                a2 = c6783cjn.a((r30 & 1) != 0 ? c6783cjn.c : null, (r30 & 2) != 0 ? c6783cjn.d : null, (r30 & 4) != 0 ? c6783cjn.e : null, (r30 & 8) != 0 ? c6783cjn.a : null, (r30 & 16) != 0 ? c6783cjn.l : false, (r30 & 32) != 0 ? c6783cjn.k : false, (r30 & 64) != 0 ? c6783cjn.f13741o : null, (r30 & 128) != 0 ? c6783cjn.f : null, (r30 & JSONzip.end) != 0 ? c6783cjn.g : null, (r30 & 512) != 0 ? c6783cjn.b : false, (r30 & 1024) != 0 ? c6783cjn.i : Long.valueOf(b2), (r30 & 2048) != 0 ? c6783cjn.h : null, (r30 & 4096) != 0 ? c6783cjn.n : null, (r30 & 8192) != 0 ? c6783cjn.j : null);
                return a2;
            }
        });
        e(new drM<C6783cjn, dpR>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$doRedeemBeacon$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$doRedeemBeacon$3$1  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                final /* synthetic */ C6783cjn a;
                int b;
                final /* synthetic */ C6784cjo d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(C6783cjn c6783cjn, C6784cjo c6784cjo, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.a = c6783cjn;
                    this.d = c6784cjo;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass1(this.a, this.d, interfaceC8585dra);
                }

                @Override // o.drX
                /* renamed from: e */
                public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object e;
                    InterfaceC6778cji interfaceC6778cji;
                    InterfaceC1270Vf interfaceC1270Vf;
                    e = C8586drb.e();
                    int i = this.b;
                    if (i == 0) {
                        C8556dpz.d(obj);
                        C6783cjn c6783cjn = this.a;
                        C1044Mm.e("GameControllerViewModel", "redeemBeacon: launch query " + c6783cjn);
                        interfaceC6778cji = this.d.e;
                        String j = this.a.j();
                        this.b = 1;
                        obj = interfaceC6778cji.c(j, this);
                        if (obj == e) {
                            return e;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C8556dpz.d(obj);
                    }
                    final C8954gU c8954gU = (C8954gU) obj;
                    interfaceC1270Vf = this.d.d;
                    final long b = interfaceC1270Vf.b();
                    this.d.b(new drM<C6783cjn, C6783cjn>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel.doRedeemBeacon.3.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        /* renamed from: e */
                        public final C6783cjn invoke(C6783cjn c6783cjn2) {
                            C6783cjn a;
                            C8632dsu.c((Object) c6783cjn2, "");
                            a = c6783cjn2.a((r30 & 1) != 0 ? c6783cjn2.c : null, (r30 & 2) != 0 ? c6783cjn2.d : null, (r30 & 4) != 0 ? c6783cjn2.e : null, (r30 & 8) != 0 ? c6783cjn2.a : null, (r30 & 16) != 0 ? c6783cjn2.l : false, (r30 & 32) != 0 ? c6783cjn2.k : false, (r30 & 64) != 0 ? c6783cjn2.f13741o : null, (r30 & 128) != 0 ? c6783cjn2.f : null, (r30 & JSONzip.end) != 0 ? c6783cjn2.g : null, (r30 & 512) != 0 ? c6783cjn2.b : false, (r30 & 1024) != 0 ? c6783cjn2.i : null, (r30 & 2048) != 0 ? c6783cjn2.h : Long.valueOf(b), (r30 & 4096) != 0 ? c6783cjn2.n : null, (r30 & 8192) != 0 ? c6783cjn2.j : null);
                            return a;
                        }
                    });
                    if (c8954gU.d != 0) {
                        this.d.b(new drM<C6783cjn, C6783cjn>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel.doRedeemBeacon.3.1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            /* renamed from: a */
                            public final C6783cjn invoke(C6783cjn c6783cjn2) {
                                C6783cjn a;
                                C8632dsu.c((Object) c6783cjn2, "");
                                C1390Zo.c cVar = c8954gU.d;
                                C1390Zo.e b2 = cVar != null ? cVar.b() : null;
                                C1044Mm.e("GameControllerViewModel", "setState: " + b2);
                                C1390Zo.c cVar2 = c8954gU.d;
                                a = c6783cjn2.a((r30 & 1) != 0 ? c6783cjn2.c : null, (r30 & 2) != 0 ? c6783cjn2.d : null, (r30 & 4) != 0 ? c6783cjn2.e : null, (r30 & 8) != 0 ? c6783cjn2.a : new C8971gl(cVar2 != null ? cVar2.b() : null), (r30 & 16) != 0 ? c6783cjn2.l : false, (r30 & 32) != 0 ? c6783cjn2.k : false, (r30 & 64) != 0 ? c6783cjn2.f13741o : null, (r30 & 128) != 0 ? c6783cjn2.f : null, (r30 & JSONzip.end) != 0 ? c6783cjn2.g : null, (r30 & 512) != 0 ? c6783cjn2.b : false, (r30 & 1024) != 0 ? c6783cjn2.i : null, (r30 & 2048) != 0 ? c6783cjn2.h : null, (r30 & 4096) != 0 ? c6783cjn2.n : null, (r30 & 8192) != 0 ? c6783cjn2.j : null);
                                return a;
                            }
                        });
                    } else {
                        final ApolloException apolloException = c8954gU.a;
                        if (apolloException != null) {
                            this.d.b(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0077: INVOKE  
                                  (wrap: o.cjo : 0x0070: IGET  (r0v5 o.cjo A[REMOVE]) = (r4v0 'this' com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$doRedeemBeacon$3$1 A[IMMUTABLE_TYPE, THIS]) com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$doRedeemBeacon$3.1.d o.cjo)
                                  (wrap: o.drM<o.cjn, o.cjn> : 0x0074: CONSTRUCTOR  (r1v5 o.drM<o.cjn, o.cjn> A[REMOVE]) = (r5v8 'apolloException' com.apollographql.apollo3.exception.ApolloException A[DONT_INLINE]) call: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$doRedeemBeacon$3$1$3$1.<init>(com.apollographql.apollo3.exception.ApolloException):void type: CONSTRUCTOR)
                                 type: VIRTUAL call: o.fS.b(o.drM):void in method: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$doRedeemBeacon$3.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes4.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:137)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$doRedeemBeacon$3$1$3$1, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                	... 27 more
                                */
                            /*
                                this = this;
                                java.lang.Object r0 = o.C8588drd.c()
                                int r1 = r4.b
                                r2 = 1
                                if (r1 == 0) goto L17
                                if (r1 != r2) goto Lf
                                o.C8556dpz.d(r5)
                                goto L47
                            Lf:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r0)
                                throw r5
                            L17:
                                o.C8556dpz.d(r5)
                                o.cjn r5 = r4.a
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                r1.<init>()
                                java.lang.String r3 = "redeemBeacon: launch query "
                                r1.append(r3)
                                r1.append(r5)
                                java.lang.String r5 = "GameControllerViewModel"
                                java.lang.String r1 = r1.toString()
                                o.C1044Mm.e(r5, r1)
                                o.cjo r5 = r4.d
                                o.cji r5 = o.C6784cjo.e(r5)
                                o.cjn r1 = r4.a
                                java.lang.String r1 = r1.j()
                                r4.b = r2
                                java.lang.Object r5 = r5.c(r1, r4)
                                if (r5 != r0) goto L47
                                return r0
                            L47:
                                o.gU r5 = (o.C8954gU) r5
                                o.cjo r0 = r4.d
                                o.Vf r0 = o.C6784cjo.d(r0)
                                long r0 = r0.b()
                                o.cjo r2 = r4.d
                                com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$doRedeemBeacon$3$1$1 r3 = new com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$doRedeemBeacon$3$1$1
                                r3.<init>()
                                o.C6784cjo.d(r2, r3)
                                D extends o.hE$b r0 = r5.d
                                if (r0 == 0) goto L6c
                                o.cjo r0 = r4.d
                                com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$doRedeemBeacon$3$1$2 r1 = new com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$doRedeemBeacon$3$1$2
                                r1.<init>()
                                o.C6784cjo.d(r0, r1)
                                goto L7a
                            L6c:
                                com.apollographql.apollo3.exception.ApolloException r5 = r5.a
                                if (r5 == 0) goto L7a
                                o.cjo r0 = r4.d
                                com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$doRedeemBeacon$3$1$3$1 r1 = new com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$doRedeemBeacon$3$1$3$1
                                r1.<init>(r5)
                                o.C6784cjo.d(r0, r1)
                            L7a:
                                o.dpR r5 = o.dpR.c
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$doRedeemBeacon$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C6783cjn c6783cjn) {
                        b(c6783cjn);
                        return dpR.c;
                    }

                    public final void b(C6783cjn c6783cjn) {
                        C8632dsu.c((Object) c6783cjn, "");
                        C8737dwr.c(C6784cjo.this.e(), aVar, null, new AnonymousClass1(c6783cjn, C6784cjo.this, null), 2, null);
                    }
                });
            }

            public final void f() {
                b(new drM<C6783cjn, C6783cjn>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$onWebviewLoadStarted$1
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: c */
                    public final C6783cjn invoke(C6783cjn c6783cjn) {
                        InterfaceC1270Vf interfaceC1270Vf;
                        C6783cjn a2;
                        C8632dsu.c((Object) c6783cjn, "");
                        interfaceC1270Vf = C6784cjo.this.d;
                        a2 = c6783cjn.a((r30 & 1) != 0 ? c6783cjn.c : null, (r30 & 2) != 0 ? c6783cjn.d : null, (r30 & 4) != 0 ? c6783cjn.e : null, (r30 & 8) != 0 ? c6783cjn.a : null, (r30 & 16) != 0 ? c6783cjn.l : true, (r30 & 32) != 0 ? c6783cjn.k : false, (r30 & 64) != 0 ? c6783cjn.f13741o : null, (r30 & 128) != 0 ? c6783cjn.f : null, (r30 & JSONzip.end) != 0 ? c6783cjn.g : null, (r30 & 512) != 0 ? c6783cjn.b : false, (r30 & 1024) != 0 ? c6783cjn.i : null, (r30 & 2048) != 0 ? c6783cjn.h : null, (r30 & 4096) != 0 ? c6783cjn.n : Long.valueOf(interfaceC1270Vf.b()), (r30 & 8192) != 0 ? c6783cjn.j : null);
                        return a2;
                    }
                });
            }

            @Override // o.InterfaceC6782cjm
            public void a(final WebResourceError webResourceError) {
                C8632dsu.c((Object) webResourceError, "");
                b(new drM<C6783cjn, C6783cjn>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$onWebviewPageError$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: d */
                    public final C6783cjn invoke(C6783cjn c6783cjn) {
                        InterfaceC1270Vf interfaceC1270Vf;
                        C6783cjn a2;
                        C8632dsu.c((Object) c6783cjn, "");
                        WebResourceError webResourceError2 = webResourceError;
                        interfaceC1270Vf = this.d;
                        a2 = c6783cjn.a((r30 & 1) != 0 ? c6783cjn.c : null, (r30 & 2) != 0 ? c6783cjn.d : null, (r30 & 4) != 0 ? c6783cjn.e : null, (r30 & 8) != 0 ? c6783cjn.a : null, (r30 & 16) != 0 ? c6783cjn.l : false, (r30 & 32) != 0 ? c6783cjn.k : false, (r30 & 64) != 0 ? c6783cjn.f13741o : webResourceError2, (r30 & 128) != 0 ? c6783cjn.f : null, (r30 & JSONzip.end) != 0 ? c6783cjn.g : null, (r30 & 512) != 0 ? c6783cjn.b : false, (r30 & 1024) != 0 ? c6783cjn.i : null, (r30 & 2048) != 0 ? c6783cjn.h : null, (r30 & 4096) != 0 ? c6783cjn.n : null, (r30 & 8192) != 0 ? c6783cjn.j : Long.valueOf(interfaceC1270Vf.b()));
                        return a2;
                    }
                });
            }

            @Override // o.InterfaceC6782cjm
            public void e(final String str) {
                C8632dsu.c((Object) str, "");
                b(new drM<C6783cjn, C6783cjn>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$onWebviewLoadingError$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: d */
                    public final C6783cjn invoke(C6783cjn c6783cjn) {
                        InterfaceC1270Vf interfaceC1270Vf;
                        C6783cjn a2;
                        C8632dsu.c((Object) c6783cjn, "");
                        String str2 = str;
                        interfaceC1270Vf = this.d;
                        a2 = c6783cjn.a((r30 & 1) != 0 ? c6783cjn.c : null, (r30 & 2) != 0 ? c6783cjn.d : null, (r30 & 4) != 0 ? c6783cjn.e : null, (r30 & 8) != 0 ? c6783cjn.a : null, (r30 & 16) != 0 ? c6783cjn.l : false, (r30 & 32) != 0 ? c6783cjn.k : false, (r30 & 64) != 0 ? c6783cjn.f13741o : null, (r30 & 128) != 0 ? c6783cjn.f : str2, (r30 & JSONzip.end) != 0 ? c6783cjn.g : null, (r30 & 512) != 0 ? c6783cjn.b : false, (r30 & 1024) != 0 ? c6783cjn.i : null, (r30 & 2048) != 0 ? c6783cjn.h : null, (r30 & 4096) != 0 ? c6783cjn.n : null, (r30 & 8192) != 0 ? c6783cjn.j : Long.valueOf(interfaceC1270Vf.b()));
                        return a2;
                    }
                });
            }

            @Override // o.InterfaceC6782cjm
            public void h() {
                b(new drM<C6783cjn, C6783cjn>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$onWebviewLoadingComplete$1
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: b */
                    public final C6783cjn invoke(C6783cjn c6783cjn) {
                        InterfaceC1270Vf interfaceC1270Vf;
                        C6783cjn a2;
                        C8632dsu.c((Object) c6783cjn, "");
                        interfaceC1270Vf = C6784cjo.this.d;
                        a2 = c6783cjn.a((r30 & 1) != 0 ? c6783cjn.c : null, (r30 & 2) != 0 ? c6783cjn.d : null, (r30 & 4) != 0 ? c6783cjn.e : null, (r30 & 8) != 0 ? c6783cjn.a : null, (r30 & 16) != 0 ? c6783cjn.l : false, (r30 & 32) != 0 ? c6783cjn.k : true, (r30 & 64) != 0 ? c6783cjn.f13741o : null, (r30 & 128) != 0 ? c6783cjn.f : null, (r30 & JSONzip.end) != 0 ? c6783cjn.g : null, (r30 & 512) != 0 ? c6783cjn.b : false, (r30 & 1024) != 0 ? c6783cjn.i : null, (r30 & 2048) != 0 ? c6783cjn.h : null, (r30 & 4096) != 0 ? c6783cjn.n : null, (r30 & 8192) != 0 ? c6783cjn.j : Long.valueOf(interfaceC1270Vf.b()));
                        return a2;
                    }
                });
            }

            public final void b(final List<? extends NGPBeaconControllerOrientation> list) {
                C8632dsu.c((Object) list, "");
                b(new drM<C6783cjn, C6783cjn>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$overrideOrientations$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: b */
                    public final C6783cjn invoke(C6783cjn c6783cjn) {
                        C6783cjn a2;
                        C8632dsu.c((Object) c6783cjn, "");
                        a2 = c6783cjn.a((r30 & 1) != 0 ? c6783cjn.c : null, (r30 & 2) != 0 ? c6783cjn.d : null, (r30 & 4) != 0 ? c6783cjn.e : null, (r30 & 8) != 0 ? c6783cjn.a : null, (r30 & 16) != 0 ? c6783cjn.l : false, (r30 & 32) != 0 ? c6783cjn.k : false, (r30 & 64) != 0 ? c6783cjn.f13741o : null, (r30 & 128) != 0 ? c6783cjn.f : null, (r30 & JSONzip.end) != 0 ? c6783cjn.g : list, (r30 & 512) != 0 ? c6783cjn.b : false, (r30 & 1024) != 0 ? c6783cjn.i : null, (r30 & 2048) != 0 ? c6783cjn.h : null, (r30 & 4096) != 0 ? c6783cjn.n : null, (r30 & 8192) != 0 ? c6783cjn.j : null);
                        return a2;
                    }
                });
            }

            public final void g() {
                b(new drM<C6783cjn, C6783cjn>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$allowSleep$1
                    @Override // o.drM
                    /* renamed from: c */
                    public final C6783cjn invoke(C6783cjn c6783cjn) {
                        C6783cjn a2;
                        C8632dsu.c((Object) c6783cjn, "");
                        a2 = c6783cjn.a((r30 & 1) != 0 ? c6783cjn.c : null, (r30 & 2) != 0 ? c6783cjn.d : null, (r30 & 4) != 0 ? c6783cjn.e : null, (r30 & 8) != 0 ? c6783cjn.a : null, (r30 & 16) != 0 ? c6783cjn.l : false, (r30 & 32) != 0 ? c6783cjn.k : false, (r30 & 64) != 0 ? c6783cjn.f13741o : null, (r30 & 128) != 0 ? c6783cjn.f : null, (r30 & JSONzip.end) != 0 ? c6783cjn.g : null, (r30 & 512) != 0 ? c6783cjn.b : true, (r30 & 1024) != 0 ? c6783cjn.i : null, (r30 & 2048) != 0 ? c6783cjn.h : null, (r30 & 4096) != 0 ? c6783cjn.n : null, (r30 & 8192) != 0 ? c6783cjn.j : null);
                        return a2;
                    }
                });
            }

            public final void j() {
                b(new drM<C6783cjn, C6783cjn>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$disallowSleep$1
                    @Override // o.drM
                    /* renamed from: e */
                    public final C6783cjn invoke(C6783cjn c6783cjn) {
                        C6783cjn a2;
                        C8632dsu.c((Object) c6783cjn, "");
                        a2 = c6783cjn.a((r30 & 1) != 0 ? c6783cjn.c : null, (r30 & 2) != 0 ? c6783cjn.d : null, (r30 & 4) != 0 ? c6783cjn.e : null, (r30 & 8) != 0 ? c6783cjn.a : null, (r30 & 16) != 0 ? c6783cjn.l : false, (r30 & 32) != 0 ? c6783cjn.k : false, (r30 & 64) != 0 ? c6783cjn.f13741o : null, (r30 & 128) != 0 ? c6783cjn.f : null, (r30 & JSONzip.end) != 0 ? c6783cjn.g : null, (r30 & 512) != 0 ? c6783cjn.b : false, (r30 & 1024) != 0 ? c6783cjn.i : null, (r30 & 2048) != 0 ? c6783cjn.h : null, (r30 & 4096) != 0 ? c6783cjn.n : null, (r30 & 8192) != 0 ? c6783cjn.j : null);
                        return a2;
                    }
                });
            }

            public final void e(final SafeAreaSize safeAreaSize, final ScreenResolution screenResolution) {
                C8632dsu.c((Object) safeAreaSize, "");
                C8632dsu.c((Object) screenResolution, "");
                e(new drM<C6783cjn, dpR>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$logConnection$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C6783cjn c6783cjn) {
                        c(c6783cjn);
                        return dpR.c;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
                    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
                    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
                    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
                    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
                    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
                    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x0107  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void c(o.C6783cjn r28) {
                        /*
                            Method dump skipped, instructions count: 286
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.mssi.impl.GameControllerViewModel$logConnection$1.c(o.cjn):void");
                    }
                });
            }
        }
