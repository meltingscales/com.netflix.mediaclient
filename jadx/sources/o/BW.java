package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSIconSize;
import com.netflix.clcs.codegen.type.CLCSStaticListType;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AX;
import o.BF;
import o.BH;
import o.BT;
import o.C0748Bd;

/* loaded from: classes2.dex */
public final class BW {
    public static final BW c = new BW();

    /* loaded from: classes2.dex */
    public static final class j implements InterfaceC8949gP<BT> {
        private static final List<String> a;
        public static final int c;
        public static final j e = new j();

        private j() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "items", "listType");
            a = j;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BT b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            CLCSStaticListType cLCSStaticListType = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    list = C8953gT.a(C8953gT.c(h.a, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    cLCSStaticListType = (CLCSStaticListType) C8953gT.d(C0864Fn.c).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (list != null) {
                return new BT(str, list, cLCSStaticListType);
            } else {
                C8956gW.a(jsonReader, "items");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BT bt) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bt, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bt.d());
            interfaceC9069id.e("items");
            C8953gT.a(C8953gT.c(h.a, false, 1, null)).e(interfaceC9069id, c9028hp, bt.b());
            interfaceC9069id.e("listType");
            C8953gT.d(C0864Fn.c).e(interfaceC9069id, c9028hp, bt.a());
        }
    }

    private BW() {
    }

    /* loaded from: classes2.dex */
    public static final class h implements InterfaceC8949gP<BT.g> {
        public static final h a = new h();
        public static final int d;
        private static final List<String> e;

        private h() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "icon", SignupConstants.Field.VIDEO_TITLE, "body");
            e = j;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BT.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            BT.d dVar = null;
            BT.j jVar = null;
            BT.a aVar = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    dVar = (BT.d) C8953gT.d(C8953gT.c(a.b, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    jVar = (BT.j) C8953gT.d(C8953gT.a(g.c, true)).b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    aVar = (BT.a) C8953gT.d(C8953gT.a(e.c, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new BT.g(str, dVar, jVar, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BT.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.d());
            interfaceC9069id.e("icon");
            C8953gT.d(C8953gT.c(a.b, false, 1, null)).e(interfaceC9069id, c9028hp, gVar.e());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.d(C8953gT.a(g.c, true)).e(interfaceC9069id, c9028hp, gVar.c());
            interfaceC9069id.e("body");
            C8953gT.d(C8953gT.a(e.c, true)).e(interfaceC9069id, c9028hp, gVar.a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<BT.d> {
        public static final a b = new a();
        private static final List<String> c;
        public static final int e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "accessibilityDescription", "icon", "color", "size");
            c = j;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BT.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            BT.b bVar = null;
            BT.c cVar = null;
            BT.e eVar = null;
            CLCSIconSize cLCSIconSize = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    bVar = (BT.b) C8953gT.d(C8953gT.a(b.d, true)).b(jsonReader, c9028hp);
                } else if (a == 2) {
                    cVar = (BT.c) C8953gT.d(C8953gT.a(d.a, true)).b(jsonReader, c9028hp);
                } else if (a == 3) {
                    eVar = (BT.e) C8953gT.d(C8953gT.a(c.d, true)).b(jsonReader, c9028hp);
                } else if (a != 4) {
                    break;
                } else {
                    cLCSIconSize = (CLCSIconSize) C8953gT.d(ET.a).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new BT.d(str, bVar, cVar, eVar, cLCSIconSize);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BT.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e("accessibilityDescription");
            C8953gT.d(C8953gT.a(b.d, true)).e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e("icon");
            C8953gT.d(C8953gT.a(d.a, true)).e(interfaceC9069id, c9028hp, dVar.b());
            interfaceC9069id.e("color");
            C8953gT.d(C8953gT.a(c.d, true)).e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e("size");
            C8953gT.d(ET.a).e(interfaceC9069id, c9028hp, dVar.c());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<BT.b> {
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
        /* renamed from: e */
        public BT.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BT.b(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BT.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.c());
            BH.b.d.e(interfaceC9069id, c9028hp, bVar.b());
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<BT.c> {
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
        /* renamed from: d */
        public BT.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0746Bb b2 = C0748Bd.a.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BT.c(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BT.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.c());
            C0748Bd.a.d.e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<BT.e> {
        private static final List<String> b;
        public static final int c;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BT.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AW b2 = AX.a.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new BT.e(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BT.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.b());
            AX.a.e.e(interfaceC9069id, c9028hp, eVar.d());
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements InterfaceC8949gP<BT.j> {
        public static final int a;
        public static final g c = new g();
        private static final List<String> d;

        private g() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BT.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BB b = BF.e.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new BT.j(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BT.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, jVar.d());
            BF.e.a.e(interfaceC9069id, c9028hp, jVar.c());
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<BT.a> {
        public static final int b;
        public static final e c = new e();
        private static final List<String> d;

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BT.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BB b2 = BF.e.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new BT.a(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BT.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.d());
            BF.e.a.e(interfaceC9069id, c9028hp, aVar.a());
        }
    }
}
