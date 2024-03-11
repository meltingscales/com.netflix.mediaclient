package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSIconSize;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AX;
import o.BH;
import o.C0748Bd;
import o.C0762Br;

/* renamed from: o.Bq  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0761Bq {
    public static final C0761Bq e = new C0761Bq();

    /* renamed from: o.Bq$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<C0762Br> {
        private static final List<String> a;
        public static final int b;
        public static final e c = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "accessibilityDescription", "icon", "iconSize", "color");
            a = j;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0762Br b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C0762Br.a aVar = null;
            C0762Br.e eVar = null;
            CLCSIconSize cLCSIconSize = null;
            C0762Br.b bVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    aVar = (C0762Br.a) C8953gT.d(C8953gT.a(d.c, true)).b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    eVar = (C0762Br.e) C8953gT.d(C8953gT.a(c.e, true)).b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    cLCSIconSize = (CLCSIconSize) C8953gT.d(ET.a).b(jsonReader, c9028hp);
                } else if (a2 != 4) {
                    break;
                } else {
                    bVar = (C0762Br.b) C8953gT.d(C8953gT.a(b.e, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C0762Br(str, aVar, eVar, cLCSIconSize, bVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0762Br c0762Br) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c0762Br, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c0762Br.a());
            interfaceC9069id.e("accessibilityDescription");
            C8953gT.d(C8953gT.a(d.c, true)).e(interfaceC9069id, c9028hp, c0762Br.b());
            interfaceC9069id.e("icon");
            C8953gT.d(C8953gT.a(c.e, true)).e(interfaceC9069id, c9028hp, c0762Br.c());
            interfaceC9069id.e("iconSize");
            C8953gT.d(ET.a).e(interfaceC9069id, c9028hp, c0762Br.e());
            interfaceC9069id.e("color");
            C8953gT.d(C8953gT.a(b.e, true)).e(interfaceC9069id, c9028hp, c0762Br.d());
        }
    }

    private C0761Bq() {
    }

    /* renamed from: o.Bq$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<C0762Br.a> {
        private static final List<String> b;
        public static final d c = new d();
        public static final int d;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0762Br.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b2 = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0762Br.a(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0762Br.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.c());
            BH.b.d.e(interfaceC9069id, c9028hp, aVar.e());
        }
    }

    /* renamed from: o.Bq$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<C0762Br.e> {
        private static final List<String> b;
        public static final int d;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            b = e2;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0762Br.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0746Bb b2 = C0748Bd.a.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0762Br.e(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0762Br.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.b());
            C0748Bd.a.d.e(interfaceC9069id, c9028hp, eVar.d());
        }
    }

    /* renamed from: o.Bq$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<C0762Br.b> {
        private static final List<String> a;
        public static final int b;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            a = e2;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0762Br.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AW b2 = AX.a.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0762Br.b(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0762Br.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.d());
            AX.a.e.e(interfaceC9069id, c9028hp, bVar.a());
        }
    }
}
