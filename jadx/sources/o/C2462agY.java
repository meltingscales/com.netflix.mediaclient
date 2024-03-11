package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2455agR;
import o.C2458agU;
import o.C2459agV;

/* renamed from: o.agY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2462agY {
    public static final C2462agY c = new C2462agY();

    /* renamed from: o.agY$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2458agU> {
        private static final List<String> b;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "lolomoId", "index", "cursor", "node");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2458agU b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            C2458agU.c cVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 4) {
                    break;
                } else {
                    cVar = (C2458agU.c) C8953gT.d(C8953gT.a(e.e, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2458agU(str, str2, num, str3, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2458agU c2458agU) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2458agU, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2458agU.a());
            interfaceC9069id.e("lolomoId");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, c2458agU.e());
            interfaceC9069id.e("index");
            C8953gT.n.e(interfaceC9069id, c9028hp, c2458agU.d());
            interfaceC9069id.e("cursor");
            c8994hH.e(interfaceC9069id, c9028hp, c2458agU.b());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(e.e, true)).e(interfaceC9069id, c9028hp, c2458agU.c());
        }
    }

    private C2462agY() {
    }

    /* renamed from: o.agY$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2458agU.c> {
        private static final List<String> c;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2458agU.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2461agX b = C2459agV.b.c.b(jsonReader, c9028hp);
            jsonReader.q();
            C2457agT b2 = C2455agR.a.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2458agU.c(str, b, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2458agU.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.e());
            C2459agV.b.c.e(interfaceC9069id, c9028hp, cVar.b());
            C2455agR.a.b.e(interfaceC9069id, c9028hp, cVar.a());
        }
    }
}
