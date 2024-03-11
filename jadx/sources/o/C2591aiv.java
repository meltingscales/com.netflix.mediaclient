package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2590aiu;

/* renamed from: o.aiv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2591aiv {
    public static final C2591aiv a = new C2591aiv();

    /* renamed from: o.aiv$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2590aiu> {
        private static final List<String> a;
        public static final d b = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "preQueryArt");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2590aiu b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2590aiu.a aVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    aVar = (C2590aiu.a) C8953gT.d(C8953gT.c(e.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2590aiu(str, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2590aiu c2590aiu) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2590aiu, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2590aiu.a());
            interfaceC9069id.e("preQueryArt");
            C8953gT.d(C8953gT.c(e.c, false, 1, null)).e(interfaceC9069id, c9028hp, c2590aiu.c());
        }
    }

    private C2591aiv() {
    }

    /* renamed from: o.aiv$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2590aiu.a> {
        private static final List<String> a;
        public static final e c = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY);
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2590aiu.a b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2590aiu.a(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2590aiu.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.e());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, aVar.b());
        }
    }
}
