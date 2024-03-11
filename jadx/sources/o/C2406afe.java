package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* renamed from: o.afe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2406afe {
    public static final C2406afe e = new C2406afe();

    /* renamed from: o.afe$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2405afd> {
        private static final List<String> c;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "genreId", "name", "unifiedEntityId", SignupConstants.Field.VIDEO_TITLE);
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2405afd b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
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
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    str3 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 4) {
                    break;
                } else {
                    str4 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                int intValue = num.intValue();
                if (str3 != null) {
                    return new C2405afd(str, intValue, str2, str3, str4);
                }
                C8956gW.a(jsonReader, "unifiedEntityId");
                throw new KotlinNothingValueException();
            } else {
                C8956gW.a(jsonReader, "genreId");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2405afd c2405afd) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2405afd, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2405afd.a());
            interfaceC9069id.e("genreId");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c2405afd.b()));
            interfaceC9069id.e("name");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, c2405afd.d());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2405afd.c());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            c8994hH.e(interfaceC9069id, c9028hp, c2405afd.e());
        }
    }

    private C2406afe() {
    }
}
