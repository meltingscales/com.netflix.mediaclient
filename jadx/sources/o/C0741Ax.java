package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.BP;
import o.C0724Ag;
import o.C0749Be;

/* renamed from: o.Ax  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0741Ax {
    public static final C0741Ax d = new C0741Ax();

    /* renamed from: o.Ax$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<C0724Ag.a> {
        public static final d a = new d();
        private static final List<String> b;
        public static final int e;

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("clcsScreenUpdate");
            b = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0724Ag.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C0724Ag.d dVar = null;
            while (jsonReader.a(b) == 0) {
                dVar = (C0724Ag.d) C8953gT.d(C8953gT.a(b.d, true)).b(jsonReader, c9028hp);
            }
            return new C0724Ag.a(dVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0724Ag.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("clcsScreenUpdate");
            C8953gT.d(C8953gT.a(b.d, true)).e(interfaceC9069id, c9028hp, aVar.c());
        }
    }

    private C0741Ax() {
    }

    /* renamed from: o.Ax$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<C0724Ag.d> {
        private static final List<String> a;
        public static final int c;
        public static final b d = new b();

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0724Ag.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C0724Ag.c cVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C0724Ag.j jVar = null;
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("CLCSScreenUpdateEffect"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                cVar = c.a.b(jsonReader, c9028hp);
            } else {
                cVar = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSScreenUpdateTransition"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                jVar = a.b.b(jsonReader, c9028hp);
            }
            return new C0724Ag.d(str, cVar, jVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0724Ag.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            if (dVar.e() != null) {
                c.a.e(interfaceC9069id, c9028hp, dVar.e());
            }
            if (dVar.d() != null) {
                a.b.e(interfaceC9069id, c9028hp, dVar.d());
            }
        }
    }

    /* renamed from: o.Ax$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<C0724Ag.c> {
        public static final c a = new c();
        public static final int c;
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("effect");
            e = e2;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0724Ag.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C0724Ag.e eVar = null;
            while (jsonReader.a(e) == 0) {
                eVar = (C0724Ag.e) C8953gT.a(e.a, true).b(jsonReader, c9028hp);
            }
            if (eVar != null) {
                return new C0724Ag.c(eVar);
            }
            C8956gW.a(jsonReader, "effect");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0724Ag.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("effect");
            C8953gT.a(e.a, true).e(interfaceC9069id, c9028hp, cVar.b());
        }
    }

    /* renamed from: o.Ax$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<C0724Ag.e> {
        public static final e a = new e();
        public static final int b;
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0724Ag.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0753Bi b2 = C0749Be.c.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0724Ag.e(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0724Ag.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.a());
            C0749Be.c.c.e(interfaceC9069id, c9028hp, eVar.c());
        }
    }

    /* renamed from: o.Ax$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<C0724Ag.j> {
        public static final a b = new a();
        public static final int c;
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("screen", "replaceCurrentScreen");
            e = j;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C0724Ag.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C0724Ag.i iVar = null;
            Boolean bool = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    iVar = (C0724Ag.i) C8953gT.a(h.e, true).b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (iVar != null) {
                return new C0724Ag.j(iVar, bool);
            }
            C8956gW.a(jsonReader, "screen");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0724Ag.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("screen");
            C8953gT.a(h.e, true).e(interfaceC9069id, c9028hp, jVar.c());
            interfaceC9069id.e("replaceCurrentScreen");
            C8953gT.l.e(interfaceC9069id, c9028hp, jVar.d());
        }
    }

    /* renamed from: o.Ax$h */
    /* loaded from: classes2.dex */
    public static final class h implements InterfaceC8949gP<C0724Ag.i> {
        public static final int b;
        private static final List<String> c;
        public static final h e = new h();

        private h() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0724Ag.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BR b2 = BP.j.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0724Ag.i(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0724Ag.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, iVar.a());
            BP.j.e.e(interfaceC9069id, c9028hp, iVar.d());
        }
    }
}
