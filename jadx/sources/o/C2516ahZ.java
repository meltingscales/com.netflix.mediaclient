package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2572aic;
import o.C2581ail;

/* renamed from: o.ahZ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2516ahZ {
    public static final C2516ahZ c = new C2516ahZ();

    /* renamed from: o.ahZ$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2572aic> {
        private static final List<String> d;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "hiddenEpisodeNumbers", "number", "parentSeason", "parentShow", "hasOriginalTreatment");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2572aic b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            Integer num = null;
            C2572aic.c cVar = null;
            C2572aic.b bVar = null;
            Boolean bool2 = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    cVar = (C2572aic.c) C8953gT.d(C8953gT.a(e.b, true)).b(jsonReader, c9028hp);
                } else if (a == 4) {
                    bVar = (C2572aic.b) C8953gT.d(C8953gT.a(c.c, true)).b(jsonReader, c9028hp);
                } else if (a != 5) {
                    break;
                } else {
                    bool2 = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2572aic(str, bool, num, cVar, bVar, bool2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2572aic c2572aic) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2572aic, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2572aic.g());
            interfaceC9069id.e("hiddenEpisodeNumbers");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, c2572aic.a());
            interfaceC9069id.e("number");
            C8953gT.n.e(interfaceC9069id, c9028hp, c2572aic.c());
            interfaceC9069id.e("parentSeason");
            C8953gT.d(C8953gT.a(e.b, true)).e(interfaceC9069id, c9028hp, c2572aic.d());
            interfaceC9069id.e("parentShow");
            C8953gT.d(C8953gT.a(c.c, true)).e(interfaceC9069id, c9028hp, c2572aic.e());
            interfaceC9069id.e("hasOriginalTreatment");
            c8994hH.e(interfaceC9069id, c9028hp, c2572aic.b());
        }
    }

    private C2516ahZ() {
    }

    /* renamed from: o.ahZ$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2572aic.c> {
        public static final e b = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2572aic.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2572aic.d b2 = b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2572aic.c(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2572aic.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.e());
            b.d.e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    /* renamed from: o.ahZ$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2572aic.d> {
        private static final List<String> b;
        public static final b d = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "number", "numberLabel", "longNumberLabelForPlayer", SignupConstants.Field.VIDEO_TITLE);
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2572aic.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
            Integer num2 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int a = jsonReader.a(b);
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
                return new C2572aic.d(str, num.intValue(), num2, str2, str3, str4);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2572aic.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.g());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(dVar.d()));
            interfaceC9069id.e("number");
            C8953gT.n.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e("numberLabel");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, dVar.b());
            interfaceC9069id.e("longNumberLabelForPlayer");
            c8994hH.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            c8994hH.e(interfaceC9069id, c9028hp, dVar.e());
        }
    }

    /* renamed from: o.ahZ$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2572aic.b> {
        private static final List<String> b;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2572aic.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2576aig b2 = C2581ail.a.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2572aic.b(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2572aic.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.a());
            C2581ail.a.c.e(interfaceC9069id, c9028hp, bVar.d());
        }
    }
}
