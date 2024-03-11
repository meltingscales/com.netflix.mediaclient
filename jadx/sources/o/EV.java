package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSDesignTheme;

/* loaded from: classes2.dex */
public final class EV implements InterfaceC8949gP<CLCSDesignTheme> {
    public static final EV d = new EV();

    private EV() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public CLCSDesignTheme b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSDesignTheme.d.e(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSDesignTheme cLCSDesignTheme) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSDesignTheme, "");
        interfaceC9069id.d(cLCSDesignTheme.b());
    }
}
