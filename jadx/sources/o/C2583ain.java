package o;

import com.apollographql.apollo3.api.json.JsonReader;
import j$.time.Instant;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2587air;

/* renamed from: o.ain  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2583ain {
    public static final C2583ain c = new C2583ain();

    /* renamed from: o.ain$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2587air> {
        public static final a b = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "runtimeSec", "displayRuntimeSec", "logicalEndOffsetSec", "bookmark");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2587air b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            C2587air.b bVar = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    num3 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 4) {
                    break;
                } else {
                    bVar = (C2587air.b) C8953gT.d(C8953gT.c(b.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2587air(str, num, num2, num3, bVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2587air c2587air) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2587air, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2587air.a());
            interfaceC9069id.e("runtimeSec");
            C8994hH<Integer> c8994hH = C8953gT.n;
            c8994hH.e(interfaceC9069id, c9028hp, c2587air.d());
            interfaceC9069id.e("displayRuntimeSec");
            c8994hH.e(interfaceC9069id, c9028hp, c2587air.c());
            interfaceC9069id.e("logicalEndOffsetSec");
            c8994hH.e(interfaceC9069id, c9028hp, c2587air.e());
            interfaceC9069id.e("bookmark");
            C8953gT.d(C8953gT.c(b.b, false, 1, null)).e(interfaceC9069id, c9028hp, c2587air.b());
        }
    }

    private C2583ain() {
    }

    /* renamed from: o.ain$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2587air.b> {
        private static final List<String> a;
        public static final b b = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "interactivePlaybackProgressPercentage", "lastModified", "position");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2587air.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            Instant instant = null;
            Double d = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    instant = (Instant) C8953gT.d(C8950gQ.c).b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    d = C8953gT.k.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2587air.b(str, num, instant, d);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2587air.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e("interactivePlaybackProgressPercentage");
            C8953gT.n.e(interfaceC9069id, c9028hp, bVar.c());
            interfaceC9069id.e("lastModified");
            C8953gT.d(C8950gQ.c).e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e("position");
            C8953gT.k.e(interfaceC9069id, c9028hp, bVar.a());
        }
    }
}
