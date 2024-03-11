package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import j$.time.Instant;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* renamed from: o.ajj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2632ajj {
    public static final C2632ajj e = new C2632ajj();

    /* renamed from: o.ajj$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2630ajh> {
        private static final List<String> a;
        public static final e b = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "unifiedEntityId", SignupConstants.Field.VIDEO_TITLE, "hasOriginalTreatment", "isAvailable", "isAvailableForDownload", "availabilityStartTime", "isPlayable");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2630ajh b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Instant instant = null;
            Boolean bool4 = null;
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
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        bool = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        bool2 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        bool3 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 7:
                        instant = (Instant) C8953gT.d(C8950gQ.c).b(jsonReader, c9028hp);
                        break;
                    case 8:
                        bool4 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (num != null) {
                            int intValue = num.intValue();
                            if (str2 != null) {
                                return new C2630ajh(str, intValue, str2, str3, bool, bool2, bool3, instant, bool4);
                            }
                            C8956gW.a(jsonReader, "unifiedEntityId");
                            throw new KotlinNothingValueException();
                        } else {
                            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                            throw new KotlinNothingValueException();
                        }
                }
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2630ajh c2630ajh) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2630ajh, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2630ajh.h());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c2630ajh.e()));
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2630ajh.b());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.t.e(interfaceC9069id, c9028hp, c2630ajh.c());
            interfaceC9069id.e("hasOriginalTreatment");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, c2630ajh.d());
            interfaceC9069id.e("isAvailable");
            c8994hH.e(interfaceC9069id, c9028hp, c2630ajh.i());
            interfaceC9069id.e("isAvailableForDownload");
            c8994hH.e(interfaceC9069id, c9028hp, c2630ajh.f());
            interfaceC9069id.e("availabilityStartTime");
            C8953gT.d(C8950gQ.c).e(interfaceC9069id, c9028hp, c2630ajh.a());
            interfaceC9069id.e("isPlayable");
            c8994hH.e(interfaceC9069id, c9028hp, c2630ajh.g());
        }
    }

    private C2632ajj() {
    }
}
