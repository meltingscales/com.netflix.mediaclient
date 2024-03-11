package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSButtonSize;
import com.netflix.clcs.codegen.type.CLCSButtonType;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AS;
import o.BH;
import o.C0748Bd;
import o.C0749Be;

/* loaded from: classes2.dex */
public final class AP {
    public static final AP c = new AP();

    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<AS> {
        public static final int a;
        public static final d b = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "label", "buttonSize", "type", "icon", "onPress");
            d = j;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public AS b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            AS.a aVar = null;
            CLCSButtonSize cLCSButtonSize = null;
            CLCSButtonType cLCSButtonType = null;
            AS.e eVar = null;
            AS.b bVar = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    aVar = (AS.a) C8953gT.d(C8953gT.a(b.b, true)).b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    cLCSButtonSize = (CLCSButtonSize) C8953gT.d(EQ.d).b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    cLCSButtonType = (CLCSButtonType) C8953gT.d(EP.c).b(jsonReader, c9028hp);
                } else if (a2 == 4) {
                    eVar = (AS.e) C8953gT.d(C8953gT.a(a.b, true)).b(jsonReader, c9028hp);
                } else if (a2 != 5) {
                    break;
                } else {
                    bVar = (AS.b) C8953gT.d(C8953gT.a(e.c, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new AS(str, aVar, cLCSButtonSize, cLCSButtonType, eVar, bVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AS as) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) as, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, as.g());
            interfaceC9069id.e("label");
            C8953gT.d(C8953gT.a(b.b, true)).e(interfaceC9069id, c9028hp, as.b());
            interfaceC9069id.e("buttonSize");
            C8953gT.d(EQ.d).e(interfaceC9069id, c9028hp, as.e());
            interfaceC9069id.e("type");
            C8953gT.d(EP.c).e(interfaceC9069id, c9028hp, as.c());
            interfaceC9069id.e("icon");
            C8953gT.d(C8953gT.a(a.b, true)).e(interfaceC9069id, c9028hp, as.a());
            interfaceC9069id.e("onPress");
            C8953gT.d(C8953gT.a(e.c, true)).e(interfaceC9069id, c9028hp, as.d());
        }
    }

    private AP() {
    }

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<AS.a> {
        private static final List<String> a;
        public static final b b = new b();
        public static final int e;

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            a = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public AS.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b2 = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new AS.a(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AS.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.d());
            BH.b.d.e(interfaceC9069id, c9028hp, aVar.b());
        }
    }

    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<AS.e> {
        public static final int a;
        public static final a b = new a();
        private static final List<String> d;

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public AS.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0746Bb b2 = C0748Bd.a.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new AS.e(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AS.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.e());
            C0748Bd.a.d.e(interfaceC9069id, c9028hp, eVar.d());
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<AS.b> {
        public static final int a;
        public static final e c = new e();
        private static final List<String> d;

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public AS.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0753Bi b = C0749Be.c.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new AS.b(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AS.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.c());
            C0749Be.c.c.e(interfaceC9069id, c9028hp, bVar.b());
        }
    }
}
