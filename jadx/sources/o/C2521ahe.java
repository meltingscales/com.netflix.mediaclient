package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import j$.time.Instant;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* renamed from: o.ahe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2521ahe {
    public static final C2521ahe d = new C2521ahe();

    /* renamed from: o.ahe$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2520ahd> {
        private static final List<String> a;
        public static final b c = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "expires", "createTime", "size", "lolomoId", SignupConstants.Field.VIDEO_TITLE);
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2520ahd b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
            Instant instant = null;
            Instant instant2 = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    instant = (Instant) C8953gT.d(C8950gQ.c).b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    instant2 = (Instant) C8953gT.d(C8950gQ.c).b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 == 4) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 5) {
                    break;
                } else {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                int intValue = num.intValue();
                if (str2 != null) {
                    return new C2520ahd(str, instant, instant2, intValue, str2, str3);
                }
                C8956gW.a(jsonReader, "lolomoId");
                throw new KotlinNothingValueException();
            } else {
                C8956gW.a(jsonReader, "size");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2520ahd c2520ahd) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2520ahd, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2520ahd.f());
            interfaceC9069id.e("expires");
            C8950gQ c8950gQ = C8950gQ.c;
            C8953gT.d(c8950gQ).e(interfaceC9069id, c9028hp, c2520ahd.c());
            interfaceC9069id.e("createTime");
            C8953gT.d(c8950gQ).e(interfaceC9069id, c9028hp, c2520ahd.d());
            interfaceC9069id.e("size");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c2520ahd.a()));
            interfaceC9069id.e("lolomoId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2520ahd.e());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.t.e(interfaceC9069id, c9028hp, c2520ahd.b());
        }
    }

    private C2521ahe() {
    }
}
