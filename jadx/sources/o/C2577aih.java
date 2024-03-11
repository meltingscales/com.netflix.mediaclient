package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2573aid;

/* renamed from: o.aih  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2577aih {
    public static final C2577aih e = new C2577aih();

    /* renamed from: o.aih$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2573aid> {
        private static final List<String> b;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "protected");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2573aid b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2573aid.a aVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    aVar = (C2573aid.a) C8953gT.d(C8953gT.c(b.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2573aid(str, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2573aid c2573aid) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2573aid, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2573aid.c());
            interfaceC9069id.e("protected");
            C8953gT.d(C8953gT.c(b.b, false, 1, null)).e(interfaceC9069id, c9028hp, c2573aid.e());
        }
    }

    private C2577aih() {
    }

    /* renamed from: o.aih$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2573aid.a> {
        public static final b b = new b();
        private static final List<String> d;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "isPinProtected", "isAgeVerificationProtected", "isPreReleasePinProtected");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2573aid.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            while (true) {
                int a = jsonReader.a(d);
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
                return new C2573aid.a(str, bool, bool2, bool3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2573aid.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.e());
            interfaceC9069id.e("isPinProtected");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e("isAgeVerificationProtected");
            c8994hH.e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e("isPreReleasePinProtected");
            c8994hH.e(interfaceC9069id, c9028hp, aVar.a());
        }
    }
}
