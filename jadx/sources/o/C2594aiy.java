package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2545aiB;

/* renamed from: o.aiy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2594aiy {
    public static final C2594aiy b = new C2594aiy();

    /* renamed from: o.aiy$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2545aiB> {
        private static final List<String> c;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.LANG_ID, "language", "languageTag", "localizedDisplayName");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2545aiB b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            C2545aiB.e eVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    str4 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 4) {
                    break;
                } else {
                    eVar = (C2545aiB.e) C8953gT.d(C8953gT.c(c.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2545aiB(str, str2, str3, str4, eVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2545aiB c2545aiB) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2545aiB, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2545aiB.d());
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, c2545aiB.b());
            interfaceC9069id.e("language");
            c8994hH.e(interfaceC9069id, c9028hp, c2545aiB.c());
            interfaceC9069id.e("languageTag");
            c8994hH.e(interfaceC9069id, c9028hp, c2545aiB.e());
            interfaceC9069id.e("localizedDisplayName");
            C8953gT.d(C8953gT.c(c.c, false, 1, null)).e(interfaceC9069id, c9028hp, c2545aiB.a());
        }
    }

    private C2594aiy() {
    }

    /* renamed from: o.aiy$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2545aiB.e> {
        private static final List<String> b;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "value");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2545aiB.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2545aiB.e(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2545aiB.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.e());
            interfaceC9069id.e("value");
            C8953gT.t.e(interfaceC9069id, c9028hp, eVar.c());
        }
    }
}
