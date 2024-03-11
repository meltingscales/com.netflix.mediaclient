package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2377afB;
import o.C2383afH;

/* renamed from: o.afD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2379afD {
    public static final C2379afD b = new C2379afD();

    /* renamed from: o.afD$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2383afH> {
        public static final c a = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID);
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2383afH b(JsonReader jsonReader, C9028hp c9028hp) {
            C2383afH.f fVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2383afH.h hVar = null;
            String str = null;
            Integer num = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Show"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                fVar = h.c.b(jsonReader, c9028hp);
            } else {
                fVar = null;
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                hVar = g.a.b(jsonReader, c9028hp);
            }
            if (num != null) {
                return new C2383afH(str, num.intValue(), fVar, hVar);
            }
            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2383afH c2383afH) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2383afH, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2383afH.d());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c2383afH.e()));
            if (c2383afH.c() != null) {
                h.c.e(interfaceC9069id, c9028hp, c2383afH.c());
            }
            if (c2383afH.a() != null) {
                g.a.e(interfaceC9069id, c9028hp, c2383afH.a());
            }
        }
    }

    private C2379afD() {
    }

    /* renamed from: o.afD$h */
    /* loaded from: classes3.dex */
    public static final class h implements InterfaceC8949gP<C2383afH.f> {
        public static final h c = new h();
        private static final List<String> e;

        private h() {
        }

        static {
            List<String> j;
            j = C8569dql.j("hasLiveEvent", "nextLiveEvent");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2383afH.f b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Boolean bool = null;
            C2383afH.e eVar = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    eVar = (C2383afH.e) C8953gT.d(C8953gT.a(a.a, true)).b(jsonReader, c9028hp);
                } else {
                    return new C2383afH.f(bool, eVar);
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2383afH.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            interfaceC9069id.e("hasLiveEvent");
            C8953gT.l.e(interfaceC9069id, c9028hp, fVar.e());
            interfaceC9069id.e("nextLiveEvent");
            C8953gT.d(C8953gT.a(a.a, true)).e(interfaceC9069id, c9028hp, fVar.d());
        }
    }

    /* renamed from: o.afD$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2383afH.e> {
        public static final a a = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "event");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2383afH.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2383afH.a aVar = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    aVar = (C2383afH.a) C8953gT.d(C8953gT.a(e.b, true)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2436afz b = C2377afB.d.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2383afH.e(str, aVar, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2383afH.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e("event");
            C8953gT.d(C8953gT.a(e.b, true)).e(interfaceC9069id, c9028hp, eVar.a());
            C2377afB.d.e.e(interfaceC9069id, c9028hp, eVar.b());
        }
    }

    /* renamed from: o.afD$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2383afH.a> {
        private static final List<String> a;
        public static final e b = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2383afH.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2383afH.b bVar = null;
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bVar = b.e.b(jsonReader, c9028hp);
            }
            return new C2383afH.a(str, bVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2383afH.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.b());
            if (aVar.a() != null) {
                b.e.e(interfaceC9069id, c9028hp, aVar.a());
            }
        }
    }

    /* renamed from: o.afD$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2383afH.b> {
        private static final List<String> d;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "number");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2383afH.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            Integer num2 = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2383afH.b(str, num.intValue(), num2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2383afH.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.c());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(bVar.e()));
            interfaceC9069id.e("number");
            C8953gT.n.e(interfaceC9069id, c9028hp, bVar.b());
        }
    }

    /* renamed from: o.afD$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC8949gP<C2383afH.h> {
        public static final g a = new g();
        private static final List<String> c;

        private g() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("liveEvent");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2383afH.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2383afH.d dVar = null;
            C2383afH.c cVar = null;
            while (jsonReader.a(c) == 0) {
                cVar = (C2383afH.c) C8953gT.d(C8953gT.a(d.d, true)).b(jsonReader, c9028hp);
            }
            jsonReader.q();
            if (C9014hb.d(C9014hb.c("Episode"), c9028hp.f, C9070ie.b(jsonReader), c9028hp.d, null)) {
                jsonReader.q();
                dVar = i.b.b(jsonReader, c9028hp);
            }
            return new C2383afH.h(cVar, dVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2383afH.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("liveEvent");
            C8953gT.d(C8953gT.a(d.d, true)).e(interfaceC9069id, c9028hp, hVar.d());
            if (hVar.c() != null) {
                i.b.e(interfaceC9069id, c9028hp, hVar.c());
            }
        }
    }

    /* renamed from: o.afD$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2383afH.c> {
        private static final List<String> c;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2383afH.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2436afz b = C2377afB.d.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2383afH.c(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2383afH.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.b());
            C2377afB.d.e.e(interfaceC9069id, c9028hp, cVar.c());
        }
    }

    /* renamed from: o.afD$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC8949gP<C2383afH.d> {
        public static final i b = new i();
        private static final List<String> d;

        private i() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "number");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2383afH.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            Integer num2 = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2383afH.d(str, num.intValue(), num2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2383afH.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(dVar.d()));
            interfaceC9069id.e("number");
            C8953gT.n.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }
}
