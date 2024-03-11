package o;

import com.apollographql.apollo3.api.json.JsonReader;
import j$.time.Instant;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2295adZ;

/* renamed from: o.adY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2294adY {
    public static final C2294adY c = new C2294adY();

    /* renamed from: o.adY$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2295adZ> {
        public static final c c = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "runtimeSec", "displayRuntimeSec", "logicalEndOffsetSec", "bookmark");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2295adZ b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            C2295adZ.e eVar = null;
            while (true) {
                int a = jsonReader.a(d);
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
                    eVar = (C2295adZ.e) C8953gT.d(C8953gT.c(a.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2295adZ(str, num, num2, num3, eVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2295adZ c2295adZ) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2295adZ, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2295adZ.a());
            interfaceC9069id.e("runtimeSec");
            C8994hH<Integer> c8994hH = C8953gT.n;
            c8994hH.e(interfaceC9069id, c9028hp, c2295adZ.d());
            interfaceC9069id.e("displayRuntimeSec");
            c8994hH.e(interfaceC9069id, c9028hp, c2295adZ.e());
            interfaceC9069id.e("logicalEndOffsetSec");
            c8994hH.e(interfaceC9069id, c9028hp, c2295adZ.c());
            interfaceC9069id.e("bookmark");
            C8953gT.d(C8953gT.c(a.a, false, 1, null)).e(interfaceC9069id, c9028hp, c2295adZ.b());
        }
    }

    private C2294adY() {
    }

    /* renamed from: o.adY$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2295adZ.e> {
        public static final a a = new a();
        private static final List<String> d;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "interactivePlaybackProgressPercentage", "lastModified", "position");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2295adZ.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            Instant instant = null;
            Double d2 = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    instant = (Instant) C8953gT.d(C8950gQ.c).b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    d2 = C8953gT.k.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2295adZ.e(str, num, instant, d2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2295adZ.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.e());
            interfaceC9069id.e("interactivePlaybackProgressPercentage");
            C8953gT.n.e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e("lastModified");
            C8953gT.d(C8950gQ.c).e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("position");
            C8953gT.k.e(interfaceC9069id, c9028hp, eVar.c());
        }
    }
}
