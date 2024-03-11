package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AC;
import o.AE;
import o.BH;

/* loaded from: classes2.dex */
public final class AH {
    public static final AH c = new AH();

    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<AE> {
        private static final List<String> b;
        public static final e d = new e();
        public static final int e;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_TITLE, "message", "dismissAction", "secondaryAction", "errorCode");
            b = j;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public AE b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            AE.e eVar = null;
            AE.c cVar = null;
            AE.b bVar = null;
            AE.a aVar = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    eVar = (AE.e) C8953gT.d(C8953gT.a(c.d, true)).b(jsonReader, c9028hp);
                } else if (a == 2) {
                    cVar = (AE.c) C8953gT.d(C8953gT.a(d.b, true)).b(jsonReader, c9028hp);
                } else if (a == 3) {
                    bVar = (AE.b) C8953gT.d(C8953gT.a(a.b, true)).b(jsonReader, c9028hp);
                } else if (a == 4) {
                    aVar = (AE.a) C8953gT.d(C8953gT.a(b.c, true)).b(jsonReader, c9028hp);
                } else if (a != 5) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new AE(str, eVar, cVar, bVar, aVar, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AE ae) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) ae, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, ae.f());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.d(C8953gT.a(c.d, true)).e(interfaceC9069id, c9028hp, ae.c());
            interfaceC9069id.e("message");
            C8953gT.d(C8953gT.a(d.b, true)).e(interfaceC9069id, c9028hp, ae.e());
            interfaceC9069id.e("dismissAction");
            C8953gT.d(C8953gT.a(a.b, true)).e(interfaceC9069id, c9028hp, ae.b());
            interfaceC9069id.e("secondaryAction");
            C8953gT.d(C8953gT.a(b.c, true)).e(interfaceC9069id, c9028hp, ae.a());
            interfaceC9069id.e("errorCode");
            C8953gT.t.e(interfaceC9069id, c9028hp, ae.d());
        }
    }

    private AH() {
    }

    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<AE.e> {
        private static final List<String> a;
        public static final c d = new c();
        public static final int e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            a = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public AE.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new AE.e(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AE.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.b());
            BH.b.d.e(interfaceC9069id, c9028hp, eVar.d());
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<AE.c> {
        private static final List<String> a;
        public static final d b = new d();
        public static final int e;

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            a = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public AE.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b2 = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new AE.c(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AE.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.d());
            BH.b.d.e(interfaceC9069id, c9028hp, cVar.e());
        }
    }

    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<AE.b> {
        public static final a b = new a();
        private static final List<String> c;
        public static final int d;

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public AE.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AB b2 = AC.a.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new AE.b(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AE.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            AC.a.b.e(interfaceC9069id, c9028hp, bVar.a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<AE.a> {
        private static final List<String> a;
        public static final int b;
        public static final b c = new b();

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public AE.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AB b2 = AC.a.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new AE.a(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AE.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.a());
            AC.a.b.e(interfaceC9069id, c9028hp, aVar.c());
        }
    }
}
