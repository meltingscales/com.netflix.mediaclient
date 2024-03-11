package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2625ajc;

/* renamed from: o.ajd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2626ajd {
    public static final C2626ajd c = new C2626ajd();

    /* renamed from: o.ajd$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2625ajc> {
        private static final List<String> a;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "boxArt");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2625ajc b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2625ajc.b bVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    bVar = (C2625ajc.b) C8953gT.d(C8953gT.c(e.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2625ajc(str, bVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2625ajc c2625ajc) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2625ajc, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2625ajc.b());
            interfaceC9069id.e("boxArt");
            C8953gT.d(C8953gT.c(e.a, false, 1, null)).e(interfaceC9069id, c9028hp, c2625ajc.e());
        }
    }

    private C2626ajd() {
    }

    /* renamed from: o.ajd$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2625ajc.b> {
        public static final e a = new e();
        private static final List<String> c;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL);
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2625ajc.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a2 = jsonReader.a(c);
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
                return new C2625ajc.b(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2625ajc.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, bVar.e());
        }
    }
}
