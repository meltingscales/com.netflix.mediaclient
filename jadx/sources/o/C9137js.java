package o;

import com.apollographql.apollo3.exception.ApolloExceptionHandlerKt$DEFAULT_EXCEPTION_HANDLER$1;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.js  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9137js {
    private static final drM<Throwable, dpR> c;
    private static drM<? super Throwable, dpR> d;

    public static final void c(drM<? super Throwable, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        d = drm;
    }

    public static final drM<Throwable, dpR> d() {
        return d;
    }

    static {
        ApolloExceptionHandlerKt$DEFAULT_EXCEPTION_HANDLER$1 apolloExceptionHandlerKt$DEFAULT_EXCEPTION_HANDLER$1 = new drM<Throwable, dpR>() { // from class: com.apollographql.apollo3.exception.ApolloExceptionHandlerKt$DEFAULT_EXCEPTION_HANDLER$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                C8632dsu.c((Object) th, "");
                System.out.println((Object) "Apollo: unhandled exception");
                th.printStackTrace();
            }
        };
        c = apolloExceptionHandlerKt$DEFAULT_EXCEPTION_HANDLER$1;
        d = apolloExceptionHandlerKt$DEFAULT_EXCEPTION_HANDLER$1;
    }
}
