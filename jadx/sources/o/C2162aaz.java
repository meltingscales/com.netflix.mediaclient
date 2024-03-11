package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1356Yn;
import o.C2369aeu;

/* renamed from: o.aaz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2162aaz {
    public static final C2162aaz e = new C2162aaz();

    /* renamed from: o.aaz$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1356Yn.a> {
        private static final List<String> a;
        public static final a b = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j(SignupConstants.Field.VIDEOS, "currentProfile");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1356Yn.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            C1356Yn.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(e.b, true)))).b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    cVar = (C1356Yn.c) C8953gT.d(C8953gT.c(d.c, false, 1, null)).b(jsonReader, c9028hp);
                } else {
                    return new C1356Yn.a(list, cVar);
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1356Yn.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(e.b, true)))).e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e("currentProfile");
            C8953gT.d(C8953gT.c(d.c, false, 1, null)).e(interfaceC9069id, c9028hp, aVar.e());
        }
    }

    private C2162aaz() {
    }

    /* renamed from: o.aaz$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1356Yn.e> {
        public static final e b = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1356Yn.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2368aet b2 = C2369aeu.e.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1356Yn.e(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1356Yn.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.b());
            C2369aeu.e.a.e(interfaceC9069id, c9028hp, eVar.c());
        }
    }

    /* renamed from: o.aaz$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1356Yn.c> {
        private static final List<String> a;
        public static final d c = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "isAutoStartEnabled");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1356Yn.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1356Yn.c(str, bool);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1356Yn.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.c());
            interfaceC9069id.e("isAutoStartEnabled");
            C8953gT.l.e(interfaceC9069id, c9028hp, cVar.b());
        }
    }
}
