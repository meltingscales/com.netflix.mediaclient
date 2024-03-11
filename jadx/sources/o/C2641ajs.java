package o;

import com.apollographql.apollo3.api.json.JsonReader;
import j$.time.Instant;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2638ajp;

/* renamed from: o.ajs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2641ajs {
    public static final C2641ajs a = new C2641ajs();

    /* renamed from: o.ajs$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2638ajp> {
        public static final c b = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "bookmark", "displayRuntime", "runtime", "logicalEndOffset", "protected");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2638ajp b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2638ajp.d dVar = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            C2638ajp.c cVar = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    dVar = (C2638ajp.d) C8953gT.d(C8953gT.c(e.b, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a == 2) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 4) {
                    num3 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 5) {
                    break;
                } else {
                    cVar = (C2638ajp.c) C8953gT.d(C8953gT.c(a.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2638ajp(str, dVar, num, num2, num3, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2638ajp c2638ajp) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2638ajp, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2638ajp.h());
            interfaceC9069id.e("bookmark");
            C8953gT.d(C8953gT.c(e.b, false, 1, null)).e(interfaceC9069id, c9028hp, c2638ajp.b());
            interfaceC9069id.e("displayRuntime");
            C8994hH<Integer> c8994hH = C8953gT.n;
            c8994hH.e(interfaceC9069id, c9028hp, c2638ajp.d());
            interfaceC9069id.e("runtime");
            c8994hH.e(interfaceC9069id, c9028hp, c2638ajp.c());
            interfaceC9069id.e("logicalEndOffset");
            c8994hH.e(interfaceC9069id, c9028hp, c2638ajp.a());
            interfaceC9069id.e("protected");
            C8953gT.d(C8953gT.c(a.c, false, 1, null)).e(interfaceC9069id, c9028hp, c2638ajp.e());
        }
    }

    private C2641ajs() {
    }

    /* renamed from: o.ajs$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2638ajp.d> {
        private static final List<String> a;
        public static final e b = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "position", "lastModified");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2638ajp.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Double d = null;
            Instant instant = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    d = C8953gT.k.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    instant = (Instant) C8953gT.d(C8950gQ.c).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2638ajp.d(str, d, instant);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2638ajp.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("position");
            C8953gT.k.e(interfaceC9069id, c9028hp, dVar.b());
            interfaceC9069id.e("lastModified");
            C8953gT.d(C8950gQ.c).e(interfaceC9069id, c9028hp, dVar.a());
        }
    }

    /* renamed from: o.ajs$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2638ajp.c> {
        private static final List<String> b;
        public static final a c = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "isPinProtected", "isAgeVerificationProtected", "isPreReleasePinProtected");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2638ajp.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    bool2 = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    bool3 = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2638ajp.c(str, bool, bool2, bool3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2638ajp.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.e());
            interfaceC9069id.e("isPinProtected");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, cVar.c());
            interfaceC9069id.e("isAgeVerificationProtected");
            c8994hH.e(interfaceC9069id, c9028hp, cVar.d());
            interfaceC9069id.e("isPreReleasePinProtected");
            c8994hH.e(interfaceC9069id, c9028hp, cVar.b());
        }
    }
}
