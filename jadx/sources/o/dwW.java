package o;

import kotlin.Result;

/* loaded from: classes5.dex */
public final class dwW {
    public static final String a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String e(InterfaceC8585dra<?> interfaceC8585dra) {
        String e;
        if (interfaceC8585dra instanceof C7655dAl) {
            return interfaceC8585dra.toString();
        }
        try {
            Result.c cVar = Result.e;
            e = Result.e(interfaceC8585dra + '@' + a(interfaceC8585dra));
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            e = Result.e(C8556dpz.a(th));
        }
        if (Result.d(e) != null) {
            e = interfaceC8585dra.getClass().getName() + '@' + a(interfaceC8585dra);
        }
        return (String) e;
    }

    public static final String c(Object obj) {
        return obj.getClass().getSimpleName();
    }
}
