package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSToastPosition;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C0745Ba;
import o.C0749Be;
import o.C0776Cd;

/* renamed from: o.Cf  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0778Cf {
    public static final C0778Cf a = new C0778Cf();

    /* renamed from: o.Cf$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<C0776Cd> {
        private static final List<String> a;
        public static final e b = new e();
        public static final int d;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "trackingInfo", "loggingViewName", "style", "position", "timerMs", "onTimerComplete", "content");
            a = j;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0776Cd b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            C0776Cd.a aVar = null;
            CLCSToastPosition cLCSToastPosition = null;
            Integer num = null;
            C0776Cd.d dVar = null;
            C0776Cd.c cVar = null;
            while (true) {
                switch (jsonReader.a(a)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        str2 = (String) C8953gT.d(C8953gT.p).b(jsonReader, c9028hp);
                        break;
                    case 2:
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        aVar = (C0776Cd.a) C8953gT.d(C8953gT.a(d.c, true)).b(jsonReader, c9028hp);
                        break;
                    case 4:
                        cLCSToastPosition = (CLCSToastPosition) C8953gT.d(C0863Fm.d).b(jsonReader, c9028hp);
                        break;
                    case 5:
                        num = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        dVar = (C0776Cd.d) C8953gT.d(C8953gT.a(b.b, true)).b(jsonReader, c9028hp);
                        break;
                    case 7:
                        cVar = (C0776Cd.c) C8953gT.c(a.b, false, 1, null).b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (cVar != null) {
                            return new C0776Cd(str, str2, str3, aVar, cLCSToastPosition, num, dVar, cVar);
                        } else {
                            C8956gW.a(jsonReader, "content");
                            throw new KotlinNothingValueException();
                        }
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0776Cd c0776Cd) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c0776Cd, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c0776Cd.i());
            interfaceC9069id.e("trackingInfo");
            C8953gT.d(interfaceC8949gP).e(interfaceC9069id, c9028hp, c0776Cd.f());
            interfaceC9069id.e("loggingViewName");
            C8953gT.t.e(interfaceC9069id, c9028hp, c0776Cd.b());
            interfaceC9069id.e("style");
            C8953gT.d(C8953gT.a(d.c, true)).e(interfaceC9069id, c9028hp, c0776Cd.a());
            interfaceC9069id.e("position");
            C8953gT.d(C0863Fm.d).e(interfaceC9069id, c9028hp, c0776Cd.d());
            interfaceC9069id.e("timerMs");
            C8953gT.n.e(interfaceC9069id, c9028hp, c0776Cd.j());
            interfaceC9069id.e("onTimerComplete");
            C8953gT.d(C8953gT.a(b.b, true)).e(interfaceC9069id, c9028hp, c0776Cd.e());
            interfaceC9069id.e("content");
            C8953gT.c(a.b, false, 1, null).e(interfaceC9069id, c9028hp, c0776Cd.c());
        }
    }

    private C0778Cf() {
    }

    /* renamed from: o.Cf$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<C0776Cd.a> {
        public static final int b;
        public static final d c = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0776Cd.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AU b2 = C0745Ba.f.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0776Cd.a(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0776Cd.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.d());
            C0745Ba.f.e.e(interfaceC9069id, c9028hp, aVar.c());
        }
    }

    /* renamed from: o.Cf$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<C0776Cd.d> {
        public static final b b = new b();
        private static final List<String> c;
        public static final int d;

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0776Cd.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0753Bi b2 = C0749Be.c.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0776Cd.d(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0776Cd.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.e());
            C0749Be.c.c.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    /* renamed from: o.Cf$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<C0776Cd.c> {
        private static final List<String> a;
        public static final a b = new a();
        public static final int d;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY);
            a = j;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0776Cd.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C0776Cd.c(str, str2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Error.DEBUG_FIELD_KEY);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0776Cd.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, cVar.d());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, cVar.b());
        }
    }
}
