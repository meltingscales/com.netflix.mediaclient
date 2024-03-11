package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.ApolloParseException;
import java.util.Set;
import java.util.UUID;
import o.C8954gU;
import o.InterfaceC8991hE;

/* renamed from: o.hL */
/* loaded from: classes2.dex */
public final class C8998hL {
    public static final <D extends InterfaceC8991hE.b> C8954gU<D> d(InterfaceC8991hE<D> interfaceC8991hE, JsonReader jsonReader, UUID uuid, C9028hp c9028hp, Set<C9031hs> set) {
        ApolloException apolloParseException;
        C8632dsu.c((Object) interfaceC8991hE, "");
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        try {
            return C9066ia.e.c(jsonReader, interfaceC8991hE, uuid, c9028hp, set);
        } catch (Throwable th) {
            if (th instanceof ApolloException) {
                apolloParseException = th;
            } else {
                apolloParseException = new ApolloParseException("Failed to parse GraphQL http network response", th);
            }
            if (uuid == null) {
                uuid = UUID.randomUUID();
                C8632dsu.a(uuid, "");
            }
            return new C8954gU.c(interfaceC8991hE, uuid).c(apolloParseException).a(true).e();
        }
    }

    public static /* synthetic */ C8954gU b(JsonReader jsonReader, InterfaceC8991hE interfaceC8991hE, UUID uuid, C9028hp c9028hp, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            uuid = null;
        }
        if ((i & 4) != 0) {
            c9028hp = C9028hp.c;
        }
        if ((i & 8) != 0) {
            set = null;
        }
        return c(jsonReader, interfaceC8991hE, uuid, c9028hp, set);
    }

    public static final <D extends InterfaceC8991hE.b> C8954gU<D> c(JsonReader jsonReader, InterfaceC8991hE<D> interfaceC8991hE, UUID uuid, C9028hp c9028hp, Set<C9031hs> set) {
        C8954gU<D> c8954gU;
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) interfaceC8991hE, "");
        C8632dsu.c((Object) c9028hp, "");
        Throwable th = null;
        try {
            c8954gU = d(interfaceC8991hE, jsonReader, uuid, c9028hp, set);
            try {
                jsonReader.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                jsonReader.close();
            } catch (Throwable th4) {
                C8553dpw.c(th3, th4);
            }
            th = th3;
            c8954gU = null;
        }
        if (th != null) {
            throw th;
        }
        C8632dsu.d(c8954gU);
        return c8954gU;
    }
}
