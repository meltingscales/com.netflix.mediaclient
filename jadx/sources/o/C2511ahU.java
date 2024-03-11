package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2413afl;
import o.C2510ahT;
import o.C2514ahX;
import o.C2632ajj;
import o.C2641ajs;

/* renamed from: o.ahU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2511ahU {
    public static final C2511ahU c = new C2511ahU();

    /* renamed from: o.ahU$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2514ahX> {
        private static final List<String> c;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID);
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2514ahX b(JsonReader jsonReader, C9028hp c9028hp) {
            C2514ahX.c cVar;
            C2514ahX.d dVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2514ahX.a aVar = null;
            Integer num = null;
            String str = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Movie"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                cVar = b.b.b(jsonReader, c9028hp);
            } else {
                cVar = null;
            }
            if (C9014hb.d(C9014hb.c("Show"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                dVar = c.d.b(jsonReader, c9028hp);
            } else {
                dVar = null;
            }
            if (C9014hb.d(C9014hb.c("Episode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                aVar = a.e.b(jsonReader, c9028hp);
            }
            C2514ahX.a aVar2 = aVar;
            if (num != null) {
                return new C2514ahX(str, num.intValue(), cVar, dVar, aVar2);
            }
            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2514ahX c2514ahX) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2514ahX, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2514ahX.c());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c2514ahX.e()));
            if (c2514ahX.b() != null) {
                b.b.e(interfaceC9069id, c9028hp, c2514ahX.b());
            }
            if (c2514ahX.d() != null) {
                c.d.e(interfaceC9069id, c9028hp, c2514ahX.d());
            }
            if (c2514ahX.a() != null) {
                a.e.e(interfaceC9069id, c9028hp, c2514ahX.a());
            }
        }
    }

    private C2511ahU() {
    }

    /* renamed from: o.ahU$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2514ahX.c> {
        public static final b b = new b();

        private b() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2514ahX.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            C2630ajh b2 = C2632ajj.e.b.b(jsonReader, c9028hp);
            jsonReader.q();
            C2638ajp b3 = C2641ajs.c.b.b(jsonReader, c9028hp);
            jsonReader.q();
            return new C2514ahX.c(b2, b3, C2413afl.d.a.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2514ahX.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            C2632ajj.e.b.e(interfaceC9069id, c9028hp, cVar.a());
            C2641ajs.c.b.e(interfaceC9069id, c9028hp, cVar.b());
            C2413afl.d.a.e(interfaceC9069id, c9028hp, cVar.d());
        }
    }

    /* renamed from: o.ahU$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2514ahX.d> {
        private static final List<String> a;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, SignupConstants.Field.VIDEO_TITLE, "currentEpisode");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2514ahX.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            String str2 = null;
            C2514ahX.b bVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    bVar = (C2514ahX.b) C8953gT.d(C8953gT.a(d.a, true)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2514ahX.d(str, num.intValue(), str2, bVar);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2514ahX.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(dVar.b()));
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.t.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e("currentEpisode");
            C8953gT.d(C8953gT.a(d.a, true)).e(interfaceC9069id, c9028hp, dVar.d());
        }
    }

    /* renamed from: o.ahU$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2514ahX.b> {
        public static final d a = new d();
        private static final List<String> b;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2514ahX.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2513ahW b2 = C2510ahT.e.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2514ahX.b(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2514ahX.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.c());
            C2510ahT.e.d.e(interfaceC9069id, c9028hp, bVar.d());
        }
    }

    /* renamed from: o.ahU$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2514ahX.a> {
        public static final a e = new a();

        private a() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2514ahX.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C2514ahX.a(C2510ahT.e.d.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2514ahX.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            C2510ahT.e.d.e(interfaceC9069id, c9028hp, aVar.d());
        }
    }
}
