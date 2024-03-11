package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.apollographql.apollo3.exception.DefaultApolloException;

/* renamed from: o.gY  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final /* synthetic */ class C8958gY {
    public static final Void e(JsonReader jsonReader, String str) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) str, "");
        throw new DefaultApolloException("Field '" + str + "' is missing or null at path " + jsonReader.d(), null, 2, null);
    }
}
