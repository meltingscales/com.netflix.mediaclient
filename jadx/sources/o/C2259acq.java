package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerType;
import com.netflix.mediaclient.graphql.models.type.NGPRedeemBeaconFailureReason;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1390Zo;

/* renamed from: o.acq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2259acq {
    public static final C2259acq d = new C2259acq();

    /* renamed from: o.acq$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1390Zo.c> {
        public static final a b = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("ngpRedeemBeacon");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1390Zo.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1390Zo.e eVar = null;
            while (jsonReader.a(e) == 0) {
                eVar = (C1390Zo.e) C8953gT.d(C8953gT.a(b.a, true)).b(jsonReader, c9028hp);
            }
            return new C1390Zo.c(eVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1390Zo.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("ngpRedeemBeacon");
            C8953gT.d(C8953gT.a(b.a, true)).e(interfaceC9069id, c9028hp, cVar.b());
        }
    }

    private C2259acq() {
    }

    /* renamed from: o.acq$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1390Zo.e> {
        public static final b a = new b();
        private static final List<String> b;

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1390Zo.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C1390Zo.h hVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1390Zo.b bVar = null;
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("NGPRedeemBeaconSuccess"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                hVar = d.e.b(jsonReader, c9028hp);
            } else {
                hVar = null;
            }
            if (C9014hb.d(C9014hb.c("NGPRedeemBeaconFailed"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bVar = e.a.b(jsonReader, c9028hp);
            }
            return new C1390Zo.e(str, hVar, bVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1390Zo.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.e());
            if (eVar.d() != null) {
                d.e.e(interfaceC9069id, c9028hp, eVar.d());
            }
            if (eVar.c() != null) {
                e.a.e(interfaceC9069id, c9028hp, eVar.c());
            }
        }
    }

    /* renamed from: o.acq$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1390Zo.h> {
        private static final List<String> a;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("connectionSecret", "gameId", "gameplaySessionId", "connectionUrl", "controllerUiUrl", "controllerUiParameters", "controllerUiOrientations", "controllerUiType", "ocgaUuid");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1390Zo.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            List list = null;
            List list2 = null;
            NGPBeaconControllerType nGPBeaconControllerType = null;
            String str5 = null;
            while (true) {
                switch (jsonReader.a(a)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        num = C8953gT.j.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        str2 = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        str3 = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        str4 = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        list = C8953gT.a(C8953gT.c(c.e, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 6:
                        list2 = C8953gT.a(C3424ayi.d).b(jsonReader, c9028hp);
                        break;
                    case 7:
                        nGPBeaconControllerType = C3427ayl.b.b(jsonReader, c9028hp);
                        break;
                    case 8:
                        str5 = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str == null) {
                            C8956gW.a(jsonReader, "connectionSecret");
                            throw new KotlinNothingValueException();
                        } else if (num != null) {
                            int intValue = num.intValue();
                            if (str2 == null) {
                                C8956gW.a(jsonReader, "gameplaySessionId");
                                throw new KotlinNothingValueException();
                            } else if (str3 == null) {
                                C8956gW.a(jsonReader, "connectionUrl");
                                throw new KotlinNothingValueException();
                            } else if (str4 == null) {
                                C8956gW.a(jsonReader, "controllerUiUrl");
                                throw new KotlinNothingValueException();
                            } else if (list == null) {
                                C8956gW.a(jsonReader, "controllerUiParameters");
                                throw new KotlinNothingValueException();
                            } else if (list2 == null) {
                                C8956gW.a(jsonReader, "controllerUiOrientations");
                                throw new KotlinNothingValueException();
                            } else if (nGPBeaconControllerType == null) {
                                C8956gW.a(jsonReader, "controllerUiType");
                                throw new KotlinNothingValueException();
                            } else if (str5 != null) {
                                return new C1390Zo.h(str, intValue, str2, str3, str4, list, list2, nGPBeaconControllerType, str5);
                            } else {
                                C8956gW.a(jsonReader, "ocgaUuid");
                                throw new KotlinNothingValueException();
                            }
                        } else {
                            C8956gW.a(jsonReader, "gameId");
                            throw new KotlinNothingValueException();
                        }
                }
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1390Zo.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("connectionSecret");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, hVar.d());
            interfaceC9069id.e("gameId");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(hVar.g()));
            interfaceC9069id.e("gameplaySessionId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, hVar.f());
            interfaceC9069id.e("connectionUrl");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, hVar.a());
            interfaceC9069id.e("controllerUiUrl");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, hVar.i());
            interfaceC9069id.e("controllerUiParameters");
            C8953gT.a(C8953gT.c(c.e, false, 1, null)).e(interfaceC9069id, c9028hp, hVar.e());
            interfaceC9069id.e("controllerUiOrientations");
            C8953gT.a(C3424ayi.d).e(interfaceC9069id, c9028hp, hVar.b());
            interfaceC9069id.e("controllerUiType");
            C3427ayl.b.e(interfaceC9069id, c9028hp, hVar.c());
            interfaceC9069id.e("ocgaUuid");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, hVar.h());
        }
    }

    /* renamed from: o.acq$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1390Zo.a> {
        private static final List<String> a;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, "value");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1390Zo.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    str3 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 == null) {
                C8956gW.a(jsonReader, SignupConstants.Error.DEBUG_FIELD_KEY);
                throw new KotlinNothingValueException();
            } else if (str3 != null) {
                return new C1390Zo.a(str, str2, str3);
            } else {
                C8956gW.a(jsonReader, "value");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1390Zo.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.b());
            interfaceC9069id.e("value");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.c());
        }
    }

    /* renamed from: o.acq$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1390Zo.b> {
        public static final e a = new e();
        private static final List<String> b;

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("reason");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1390Zo.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            NGPRedeemBeaconFailureReason nGPRedeemBeaconFailureReason = null;
            while (jsonReader.a(b) == 0) {
                nGPRedeemBeaconFailureReason = C3425ayj.b.b(jsonReader, c9028hp);
            }
            if (nGPRedeemBeaconFailureReason != null) {
                return new C1390Zo.b(nGPRedeemBeaconFailureReason);
            }
            C8956gW.a(jsonReader, "reason");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1390Zo.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("reason");
            C3425ayj.b.e(interfaceC9069id, c9028hp, bVar.a());
        }
    }
}
