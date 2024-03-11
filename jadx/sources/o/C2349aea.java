package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2289adT;

/* renamed from: o.aea  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2349aea {
    public static final C2349aea e = new C2349aea();

    /* renamed from: o.aea$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2289adT> {
        private static final List<String> a;
        public static final d c = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "protected");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2289adT b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2289adT.d dVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    dVar = (C2289adT.d) C8953gT.d(C8953gT.c(c.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2289adT(str, dVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2289adT c2289adT) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2289adT, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2289adT.c());
            interfaceC9069id.e("protected");
            C8953gT.d(C8953gT.c(c.c, false, 1, null)).e(interfaceC9069id, c9028hp, c2289adT.d());
        }
    }

    private C2349aea() {
    }

    /* renamed from: o.aea$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2289adT.d> {
        private static final List<String> b;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "isPinProtected", "isAgeVerificationProtected", "isPreReleasePinProtected");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2289adT.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    bool2 = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    bool3 = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2289adT.d(str, bool, bool2, bool3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2289adT.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e("isPinProtected");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("isAgeVerificationProtected");
            c8994hH.e(interfaceC9069id, c9028hp, dVar.b());
            interfaceC9069id.e("isPreReleasePinProtected");
            c8994hH.e(interfaceC9069id, c9028hp, dVar.a());
        }
    }
}
