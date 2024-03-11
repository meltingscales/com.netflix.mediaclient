package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.YP;

/* renamed from: o.abC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2166abC {
    public static final C2166abC d = new C2166abC();

    /* renamed from: o.abC$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<YP.c> {
        public static final c b = new c();
        private static final List<String> c;

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("oAuth2PKCEInit");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public YP.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YP.a aVar = null;
            while (jsonReader.a(c) == 0) {
                aVar = (YP.a) C8953gT.c(d.c, false, 1, null).b(jsonReader, c9028hp);
            }
            if (aVar != null) {
                return new YP.c(aVar);
            }
            C8956gW.a(jsonReader, "oAuth2PKCEInit");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YP.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("oAuth2PKCEInit");
            C8953gT.c(d.c, false, 1, null).e(interfaceC9069id, c9028hp, cVar.e());
        }
    }

    private C2166abC() {
    }

    /* renamed from: o.abC$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<YP.a> {
        public static final d c = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "state", "codeChallenge");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public YP.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new YP.a(str, str3, str2);
            } else {
                C8956gW.a(jsonReader, "codeChallenge");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YP.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.b());
            interfaceC9069id.e("state");
            C8953gT.t.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e("codeChallenge");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.d());
        }
    }
}
