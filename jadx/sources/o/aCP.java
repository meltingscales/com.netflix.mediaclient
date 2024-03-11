package o;

import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.ApolloHttpException;
import com.apollographql.apollo3.exception.ApolloNetworkException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aCP {
    public static final boolean a(Throwable th) {
        List d;
        List d2;
        C8632dsu.c((Object) th, "");
        if (th instanceof ApolloNetworkException) {
            return true;
        }
        if (th instanceof ApolloException) {
            d = C8553dpw.d(th);
            if (!d.isEmpty()) {
                d2 = C8553dpw.d(th);
                if (!(d2 instanceof Collection) || !d2.isEmpty()) {
                    Iterator it = d2.iterator();
                    while (it.hasNext() && !a((Throwable) it.next())) {
                    }
                }
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                return a(cause);
            }
        }
        return false;
    }

    public static final boolean c(Throwable th) {
        List d;
        List d2;
        C8632dsu.c((Object) th, "");
        if (th instanceof ApolloHttpException) {
            return true;
        }
        if (th instanceof ApolloException) {
            d = C8553dpw.d(th);
            if (!d.isEmpty()) {
                d2 = C8553dpw.d(th);
                if (!(d2 instanceof Collection) || !d2.isEmpty()) {
                    Iterator it = d2.iterator();
                    while (it.hasNext() && !c((Throwable) it.next())) {
                    }
                }
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                return c(cause);
            }
        }
        return false;
    }
}
