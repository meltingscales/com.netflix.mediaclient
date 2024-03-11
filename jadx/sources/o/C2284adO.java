package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2283adN;
import o.C2548aiE;

/* renamed from: o.adO  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2284adO {
    public static final C2284adO e = new C2284adO();

    /* renamed from: o.adO$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2283adN> {
        private static final List<String> b;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "currentEpisode");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2283adN b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2283adN.c cVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    cVar = (C2283adN.c) C8953gT.d(C8953gT.c(b.e, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2283adN(str, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2283adN c2283adN) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2283adN, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2283adN.e());
            interfaceC9069id.e("currentEpisode");
            C8953gT.d(C8953gT.c(b.e, false, 1, null)).e(interfaceC9069id, c9028hp, c2283adN.a());
        }
    }

    private C2284adO() {
    }

    /* renamed from: o.adO$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2283adN.c> {
        private static final List<String> d;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "number", SignupConstants.Field.VIDEO_TITLE, "parentSeason");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2283adN.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
            Integer num2 = null;
            String str2 = null;
            C2283adN.b bVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 4) {
                    break;
                } else {
                    bVar = (C2283adN.b) C8953gT.d(C8953gT.a(a.e, true)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2283adN.c(str, num.intValue(), num2, str2, bVar);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2283adN.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.b());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(cVar.a()));
            interfaceC9069id.e("number");
            C8953gT.n.e(interfaceC9069id, c9028hp, cVar.d());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.t.e(interfaceC9069id, c9028hp, cVar.c());
            interfaceC9069id.e("parentSeason");
            C8953gT.d(C8953gT.a(a.e, true)).e(interfaceC9069id, c9028hp, cVar.e());
        }
    }

    /* renamed from: o.adO$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2283adN.b> {
        private static final List<String> a;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            a = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2283adN.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2547aiD b = C2548aiE.b.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2283adN.b(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2283adN.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.e());
            C2548aiE.b.b.e(interfaceC9069id, c9028hp, bVar.d());
        }
    }
}
