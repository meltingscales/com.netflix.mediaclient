package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSInputSize;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AP;
import o.BH;
import o.C0764Bt;

/* renamed from: o.Bx  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0768Bx {
    public static final C0768Bx c = new C0768Bx();

    /* renamed from: o.Bx$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<C0764Bt> {
        private static final List<String> a;
        public static final int b;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "trackingInfo", "button", "accessibilityDescription", "loggingViewName", "inputSize", "text", "copyText");
            a = j;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C0764Bt b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            C0764Bt.e eVar = null;
            C0764Bt.b bVar = null;
            String str3 = null;
            CLCSInputSize cLCSInputSize = null;
            C0764Bt.d dVar = null;
            String str4 = null;
            while (true) {
                switch (jsonReader.a(a)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        str2 = (String) C8953gT.d(C8953gT.p).b(jsonReader, c9028hp);
                        break;
                    case 2:
                        eVar = (C0764Bt.e) C8953gT.d(C8953gT.a(d.b, true)).b(jsonReader, c9028hp);
                        break;
                    case 3:
                        bVar = (C0764Bt.b) C8953gT.d(C8953gT.a(b.a, true)).b(jsonReader, c9028hp);
                        break;
                    case 4:
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        cLCSInputSize = (CLCSInputSize) C8953gT.d(EX.b).b(jsonReader, c9028hp);
                        break;
                    case 6:
                        dVar = (C0764Bt.d) C8953gT.d(C8953gT.a(c.c, true)).b(jsonReader, c9028hp);
                        break;
                    case 7:
                        str4 = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (str4 != null) {
                            return new C0764Bt(str, str2, eVar, bVar, str3, cLCSInputSize, dVar, str4);
                        } else {
                            C8956gW.a(jsonReader, "copyText");
                            throw new KotlinNothingValueException();
                        }
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0764Bt c0764Bt) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c0764Bt, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c0764Bt.j());
            interfaceC9069id.e("trackingInfo");
            C8953gT.d(interfaceC8949gP).e(interfaceC9069id, c9028hp, c0764Bt.g());
            interfaceC9069id.e("button");
            C8953gT.d(C8953gT.a(d.b, true)).e(interfaceC9069id, c9028hp, c0764Bt.a());
            interfaceC9069id.e("accessibilityDescription");
            C8953gT.d(C8953gT.a(b.a, true)).e(interfaceC9069id, c9028hp, c0764Bt.e());
            interfaceC9069id.e("loggingViewName");
            C8953gT.t.e(interfaceC9069id, c9028hp, c0764Bt.b());
            interfaceC9069id.e("inputSize");
            C8953gT.d(EX.b).e(interfaceC9069id, c9028hp, c0764Bt.c());
            interfaceC9069id.e("text");
            C8953gT.d(C8953gT.a(c.c, true)).e(interfaceC9069id, c9028hp, c0764Bt.i());
            interfaceC9069id.e("copyText");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c0764Bt.d());
        }
    }

    private C0768Bx() {
    }

    /* renamed from: o.Bx$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<C0764Bt.e> {
        public static final int a;
        public static final d b = new d();
        private static final List<String> c;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0764Bt.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AS b2 = AP.d.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0764Bt.e(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0764Bt.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.a());
            AP.d.b.e(interfaceC9069id, c9028hp, eVar.e());
        }
    }

    /* renamed from: o.Bx$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<C0764Bt.b> {
        public static final b a = new b();
        private static final List<String> b;
        public static final int c;

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0764Bt.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b2 = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0764Bt.b(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0764Bt.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.d());
            BH.b.d.e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    /* renamed from: o.Bx$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<C0764Bt.d> {
        public static final int a;
        public static final c c = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0764Bt.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0764Bt.d(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0764Bt.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.e());
            BH.b.d.e(interfaceC9069id, c9028hp, dVar.d());
        }
    }
}
