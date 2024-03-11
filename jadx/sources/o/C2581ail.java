package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* renamed from: o.ail  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2581ail {
    public static final C2581ail a = new C2581ail();

    /* renamed from: o.ail$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2576aig> {
        public static final a c = new a();
        private static final List<String> d;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, SignupConstants.Field.VIDEO_TITLE);
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2576aig b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(d);
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
                return new C2576aig(str, num.intValue(), str2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2576aig c2576aig) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2576aig, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2576aig.e());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c2576aig.a()));
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.t.e(interfaceC9069id, c9028hp, c2576aig.d());
        }
    }

    private C2581ail() {
    }
}
