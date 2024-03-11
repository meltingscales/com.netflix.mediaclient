package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2506ahP;
import o.C2511ahU;
import o.C2591aiv;

/* renamed from: o.ahO  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2505ahO {
    public static final C2505ahO b = new C2505ahO();

    /* renamed from: o.ahO$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2506ahP> {
        private static final List<String> b;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntity");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2506ahP b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2506ahP.a aVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    aVar = (C2506ahP.a) C8953gT.d(C8953gT.a(b.c, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2506ahP(str, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2506ahP c2506ahP) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2506ahP, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2506ahP.a());
            interfaceC9069id.e("unifiedEntity");
            C8953gT.d(C8953gT.a(b.c, true)).e(interfaceC9069id, c9028hp, c2506ahP.e());
        }
    }

    private C2505ahO() {
    }

    /* renamed from: o.ahO$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2506ahP.a> {
        private static final List<String> b;
        public static final b c = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntityId");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2506ahP.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2506ahP.c cVar = null;
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                cVar = c.c.b(jsonReader, c9028hp);
            }
            if (str2 != null) {
                return new C2506ahP.a(str, str2, cVar);
            }
            C8956gW.a(jsonReader, "unifiedEntityId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2506ahP.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.a());
            if (aVar.b() != null) {
                c.c.e(interfaceC9069id, c9028hp, aVar.b());
            }
        }
    }

    /* renamed from: o.ahO$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2506ahP.c> {
        public static final c c = new c();

        private c() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2506ahP.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            C2514ahX b = C2511ahU.e.e.b(jsonReader, c9028hp);
            jsonReader.q();
            return new C2506ahP.c(b, C2591aiv.d.b.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2506ahP.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            C2511ahU.e.e.e(interfaceC9069id, c9028hp, cVar.d());
            C2591aiv.d.b.e(interfaceC9069id, c9028hp, cVar.b());
        }
    }
}
