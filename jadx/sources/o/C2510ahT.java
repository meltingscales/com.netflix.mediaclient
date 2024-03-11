package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2413afl;
import o.C2513ahW;
import o.C2632ajj;
import o.C2641ajs;

/* renamed from: o.ahT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2510ahT {
    public static final C2510ahT a = new C2510ahT();

    /* renamed from: o.ahT$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2513ahW> {
        private static final List<String> c;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "hiddenEpisodeNumbers", "number", "parentShow", "parentSeason");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2513ahW b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            Integer num = null;
            C2513ahW.d dVar = null;
            C2513ahW.e eVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    dVar = (C2513ahW.d) C8953gT.d(C8953gT.c(b.b, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a != 4) {
                    break;
                } else {
                    eVar = (C2513ahW.e) C8953gT.d(C8953gT.c(c.d, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2630ajh b = C2632ajj.e.b.b(jsonReader, c9028hp);
            jsonReader.q();
            C2638ajp b2 = C2641ajs.c.b.b(jsonReader, c9028hp);
            jsonReader.q();
            C2412afk b3 = C2413afl.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2513ahW(str, bool, num, dVar, eVar, b, b2, b3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2513ahW c2513ahW) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2513ahW, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2513ahW.j());
            interfaceC9069id.e("hiddenEpisodeNumbers");
            C8953gT.l.e(interfaceC9069id, c9028hp, c2513ahW.b());
            interfaceC9069id.e("number");
            C8953gT.n.e(interfaceC9069id, c9028hp, c2513ahW.a());
            interfaceC9069id.e("parentShow");
            C8953gT.d(C8953gT.c(b.b, false, 1, null)).e(interfaceC9069id, c9028hp, c2513ahW.e());
            interfaceC9069id.e("parentSeason");
            C8953gT.d(C8953gT.c(c.d, false, 1, null)).e(interfaceC9069id, c9028hp, c2513ahW.c());
            C2632ajj.e.b.e(interfaceC9069id, c9028hp, c2513ahW.h());
            C2641ajs.c.b.e(interfaceC9069id, c9028hp, c2513ahW.f());
            C2413afl.d.a.e(interfaceC9069id, c9028hp, c2513ahW.d());
        }
    }

    private C2510ahT() {
    }

    /* renamed from: o.ahT$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2513ahW.d> {
        public static final b b = new b();
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, SignupConstants.Field.VIDEO_TITLE);
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2513ahW.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2513ahW.d(str, num.intValue(), str2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2513ahW.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(dVar.a()));
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.t.e(interfaceC9069id, c9028hp, dVar.c());
        }
    }

    /* renamed from: o.ahT$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2513ahW.e> {
        private static final List<String> c;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "number", "numberLabelV2", "longNumberLabel", SignupConstants.Field.VIDEO_TITLE);
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2513ahW.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
            Integer num2 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 4) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 5) {
                    break;
                } else {
                    str4 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2513ahW.e(str, num.intValue(), num2, str2, str3, str4);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2513ahW.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.j());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(eVar.a()));
            interfaceC9069id.e("number");
            C8953gT.n.e(interfaceC9069id, c9028hp, eVar.d());
            interfaceC9069id.e("numberLabelV2");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e("longNumberLabel");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.e());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            c8994hH.e(interfaceC9069id, c9028hp, eVar.b());
        }
    }
}
