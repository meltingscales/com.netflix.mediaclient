package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2333aeK;
import o.C2344aeV;

/* renamed from: o.aeX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2346aeX {
    public static final C2346aeX c = new C2346aeX();

    /* renamed from: o.aeX$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2344aeV> {
        private static final List<String> a;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "gameId", "unifiedEntityId", SignupConstants.Field.VIDEO_TITLE, "tags");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2344aeV b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            List list = null;
            while (true) {
                int a2 = jsonReader.a(a);
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
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(a.a, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2337aeO b = C2333aeK.c.a.b(jsonReader, c9028hp);
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                int intValue = num.intValue();
                if (str2 != null) {
                    return new C2344aeV(str, intValue, str2, str3, list, b);
                }
                C8956gW.a(jsonReader, "unifiedEntityId");
                throw new KotlinNothingValueException();
            } else {
                C8956gW.a(jsonReader, "gameId");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2344aeV c2344aeV) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2344aeV, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2344aeV.i());
            interfaceC9069id.e("gameId");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c2344aeV.a()));
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2344aeV.b());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.t.e(interfaceC9069id, c9028hp, c2344aeV.c());
            interfaceC9069id.e("tags");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(a.a, false, 1, null)))).e(interfaceC9069id, c9028hp, c2344aeV.e());
            C2333aeK.c.a.e(interfaceC9069id, c9028hp, c2344aeV.d());
        }
    }

    private C2346aeX() {
    }

    /* renamed from: o.aeX$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2344aeV.e> {
        public static final a a = new a();
        private static final List<String> c;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "displayName");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2344aeV.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2344aeV.e(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2344aeV.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e("displayName");
            C8953gT.t.e(interfaceC9069id, c9028hp, eVar.d());
        }
    }
}
