package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* renamed from: o.ads  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2314ads {
    public static final C2314ads e = new C2314ads();

    /* renamed from: o.ads$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2316adu> {
        public static final c a = new c();
        private static final List<String> b;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, SignupConstants.Field.VIDEO_TITLE, "releaseYear");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2316adu b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            String str2 = null;
            Integer num2 = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2316adu(str, num.intValue(), str2, num2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2316adu c2316adu) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2316adu, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2316adu.e());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c2316adu.b()));
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.t.e(interfaceC9069id, c9028hp, c2316adu.d());
            interfaceC9069id.e("releaseYear");
            C8953gT.n.e(interfaceC9069id, c9028hp, c2316adu.a());
        }
    }

    private C2314ads() {
    }
}
