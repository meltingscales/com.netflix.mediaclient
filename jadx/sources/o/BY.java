package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.BH;
import o.BZ;

/* loaded from: classes2.dex */
public final class BY {
    public static final BY d = new BY();

    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<BZ> {
        private static final List<String> a;
        public static final a d = new a();
        public static final int e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "check", "errorMessage");
            a = j;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BZ b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            BZ.a aVar = null;
            BZ.d dVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    aVar = (BZ.a) C8953gT.a(b.d, true).b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    dVar = (BZ.d) C8953gT.a(d.a, true).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (aVar == null) {
                C8956gW.a(jsonReader, "check");
                throw new KotlinNothingValueException();
            } else if (dVar != null) {
                return new BZ(str, aVar, dVar);
            } else {
                C8956gW.a(jsonReader, "errorMessage");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BZ bz) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bz, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bz.e());
            interfaceC9069id.e("check");
            C8953gT.a(b.d, true).e(interfaceC9069id, c9028hp, bz.d());
            interfaceC9069id.e("errorMessage");
            C8953gT.a(d.a, true).e(interfaceC9069id, c9028hp, bz.c());
        }
    }

    private BY() {
    }

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<BZ.a> {
        public static final int c;
        public static final b d = new b();
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public BZ.a b(JsonReader jsonReader, C9028hp c9028hp) {
            BZ.b bVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            BZ.e eVar = null;
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("CLCSStringValueCheckLength"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bVar = c.d.b(jsonReader, c9028hp);
            } else {
                bVar = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSStringValueCheckPattern"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                eVar = e.d.b(jsonReader, c9028hp);
            }
            return new BZ.a(str, bVar, eVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BZ.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.a());
            if (aVar.b() != null) {
                c.d.e(interfaceC9069id, c9028hp, aVar.b());
            }
            if (aVar.c() != null) {
                e.d.e(interfaceC9069id, c9028hp, aVar.c());
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<BZ.b> {
        private static final List<String> b;
        public static final int c;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("minLength", "maxLength");
            b = j;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BZ.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            Integer num2 = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else {
                    return new BZ.b(num, num2);
                }
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BZ.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("minLength");
            C8994hH<Integer> c8994hH = C8953gT.n;
            c8994hH.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e("maxLength");
            c8994hH.e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<BZ.e> {
        public static final int b;
        public static final e d = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("pattern");
            e = e2;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BZ.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str != null) {
                return new BZ.e(str);
            }
            C8956gW.a(jsonReader, "pattern");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BZ.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("pattern");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<BZ.d> {
        public static final d a = new d();
        public static final int b;
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BZ.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b2 = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BZ.d(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BZ.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            BH.b.d.e(interfaceC9069id, c9028hp, dVar.e());
        }
    }
}
