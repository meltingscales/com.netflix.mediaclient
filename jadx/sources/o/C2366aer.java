package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2364aep;

/* renamed from: o.aer  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2366aer {
    public static final C2366aer b = new C2366aer();

    /* renamed from: o.aer$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2364aep> {
        public static final a a = new a();
        private static final List<String> d;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "isInRemindMeList");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2364aep b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2364aep.d dVar = null;
            String str = null;
            Boolean bool = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                dVar = e.e.b(jsonReader, c9028hp);
            }
            return new C2364aep(str, bool, dVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2364aep c2364aep) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2364aep, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2364aep.b());
            interfaceC9069id.e("isInRemindMeList");
            C8953gT.l.e(interfaceC9069id, c9028hp, c2364aep.c());
            if (c2364aep.d() != null) {
                e.e.e(interfaceC9069id, c9028hp, c2364aep.d());
            }
        }
    }

    private C2366aer() {
    }

    /* renamed from: o.aer$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2364aep.d> {
        private static final List<String> a;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("parentSeason");
            a = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2364aep.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2364aep.b bVar = null;
            while (jsonReader.a(a) == 0) {
                bVar = (C2364aep.b) C8953gT.d(C8953gT.a(c.c, true)).b(jsonReader, c9028hp);
            }
            return new C2364aep.d(bVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2364aep.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("parentSeason");
            C8953gT.d(C8953gT.a(c.c, true)).e(interfaceC9069id, c9028hp, dVar.c());
        }
    }

    /* renamed from: o.aer$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2364aep.b> {
        private static final List<String> b;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID);
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2364aep.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2364aep.e b2 = d.d.b(jsonReader, c9028hp);
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2364aep.b(str, num.intValue(), b2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2364aep.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(bVar.a()));
            d.d.e(interfaceC9069id, c9028hp, bVar.d());
        }
    }

    /* renamed from: o.aer$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2364aep.e> {
        private static final List<String> b;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("longNumberLabel");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2364aep.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.t.b(jsonReader, c9028hp);
            }
            return new C2364aep.e(str);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2364aep.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("longNumberLabel");
            C8953gT.t.e(interfaceC9069id, c9028hp, eVar.e());
        }
    }
}
