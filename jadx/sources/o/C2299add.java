package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.ZJ;

/* renamed from: o.add  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2299add {
    public static final C2299add c = new C2299add();

    /* renamed from: o.add$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<ZJ.d> {
        private static final List<String> b;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("verifyPassword");
            b = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public ZJ.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            ZJ.a aVar = null;
            while (jsonReader.a(b) == 0) {
                aVar = (ZJ.a) C8953gT.d(C8953gT.c(a.a, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new ZJ.d(aVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZJ.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("verifyPassword");
            C8953gT.d(C8953gT.c(a.a, false, 1, null)).e(interfaceC9069id, c9028hp, dVar.d());
        }
    }

    private C2299add() {
    }

    /* renamed from: o.add$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<ZJ.a> {
        public static final a a = new a();
        private static final List<String> c;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "verified");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public ZJ.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new ZJ.a(str, bool);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZJ.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e("verified");
            C8953gT.l.e(interfaceC9069id, c9028hp, aVar.b());
        }
    }
}
