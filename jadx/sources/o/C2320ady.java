package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2270adA;

/* renamed from: o.ady  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2320ady {
    public static final C2320ady c = new C2320ady();

    /* renamed from: o.ady$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2270adA> {
        public static final e a = new e();
        private static final List<String> d;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "characterId", "unifiedEntityId", SignupConstants.Field.VIDEO_TITLE, "artwork");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2270adA b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            C2270adA.a aVar = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 4) {
                    break;
                } else {
                    aVar = (C2270adA.a) C8953gT.d(C8953gT.c(c.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                int intValue = num.intValue();
                if (str2 != null) {
                    return new C2270adA(str, intValue, str2, str3, aVar);
                }
                C8956gW.a(jsonReader, "unifiedEntityId");
                throw new KotlinNothingValueException();
            } else {
                C8956gW.a(jsonReader, "characterId");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2270adA c2270adA) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2270adA, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2270adA.b());
            interfaceC9069id.e("characterId");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c2270adA.d()));
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2270adA.a());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.t.e(interfaceC9069id, c9028hp, c2270adA.e());
            interfaceC9069id.e("artwork");
            C8953gT.d(C8953gT.c(c.b, false, 1, null)).e(interfaceC9069id, c9028hp, c2270adA.c());
        }
    }

    private C2320ady() {
    }

    /* renamed from: o.ady$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2270adA.a> {
        public static final c b = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL);
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2270adA.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2270adA.a(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2270adA.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, aVar.b());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, aVar.c());
        }
    }
}
