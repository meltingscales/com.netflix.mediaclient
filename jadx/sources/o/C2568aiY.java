package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2563aiT;

/* renamed from: o.aiY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2568aiY {
    public static final C2568aiY b = new C2568aiY();

    /* renamed from: o.aiY$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2563aiT> {
        private static final List<String> b;
        public static final a c = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "boxshotImage", "theme", "slug");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2563aiT b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2563aiT.b bVar = null;
            C2563aiT.a aVar = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    bVar = (C2563aiT.b) C8953gT.d(C8953gT.c(d.a, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a == 2) {
                    aVar = (C2563aiT.a) C8953gT.d(C8953gT.c(e.c, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2563aiT(str, bVar, aVar, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2563aiT c2563aiT) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2563aiT, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2563aiT.c());
            interfaceC9069id.e("boxshotImage");
            C8953gT.d(C8953gT.c(d.a, false, 1, null)).e(interfaceC9069id, c9028hp, c2563aiT.e());
            interfaceC9069id.e("theme");
            C8953gT.d(C8953gT.c(e.c, false, 1, null)).e(interfaceC9069id, c9028hp, c2563aiT.a());
            interfaceC9069id.e("slug");
            C8953gT.t.e(interfaceC9069id, c9028hp, c2563aiT.b());
        }
    }

    private C2568aiY() {
    }

    /* renamed from: o.aiY$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2563aiT.b> {
        public static final d a = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL);
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2563aiT.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2563aiT.b(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2563aiT.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8953gT.t.e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    /* renamed from: o.aiY$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2563aiT.a> {
        private static final List<String> b;
        public static final e c = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "accentColor", "backgroundColor");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2563aiT.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2563aiT.c cVar = null;
            C2563aiT.e eVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    cVar = (C2563aiT.c) C8953gT.d(C8953gT.c(c.d, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    eVar = (C2563aiT.e) C8953gT.d(C8953gT.c(b.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2563aiT.a(str, cVar, eVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2563aiT.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.e());
            interfaceC9069id.e("accentColor");
            C8953gT.d(C8953gT.c(c.d, false, 1, null)).e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e("backgroundColor");
            C8953gT.d(C8953gT.c(b.b, false, 1, null)).e(interfaceC9069id, c9028hp, aVar.c());
        }
    }

    /* renamed from: o.aiY$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2563aiT.c> {
        public static final c d = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "hexString");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2563aiT.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2563aiT.c(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2563aiT.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.c());
            interfaceC9069id.e("hexString");
            C8953gT.t.e(interfaceC9069id, c9028hp, cVar.e());
        }
    }

    /* renamed from: o.aiY$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2563aiT.e> {
        public static final b b = new b();
        private static final List<String> c;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "hexString");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2563aiT.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2563aiT.e(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2563aiT.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.e());
            interfaceC9069id.e("hexString");
            C8953gT.t.e(interfaceC9069id, c9028hp, eVar.c());
        }
    }
}
