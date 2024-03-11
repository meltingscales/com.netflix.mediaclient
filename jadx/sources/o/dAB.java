package o;

import kotlinx.coroutines.internal.UndeliveredElementException;
import o.dAB;
import o.dpR;

/* loaded from: classes5.dex */
public final class dAB {
    public static /* synthetic */ UndeliveredElementException d(drM drm, Object obj, UndeliveredElementException undeliveredElementException, int i, Object obj2) {
        if ((i & 2) != 0) {
            undeliveredElementException = null;
        }
        return b(drm, obj, undeliveredElementException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> UndeliveredElementException b(drM<? super E, dpR> drm, E e, UndeliveredElementException undeliveredElementException) {
        try {
            drm.invoke(e);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e, th);
            }
            C8553dpw.c(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    public static final <E> void b(drM<? super E, dpR> drm, E e, dqZ dqz) {
        UndeliveredElementException b = b(drm, e, (UndeliveredElementException) null);
        if (b != null) {
            dwS.a(dqz, b);
        }
    }

    public static final <E> drM<Throwable, dpR> e(final drM<? super E, dpR> drm, final E e, final dqZ dqz) {
        return new drM<Throwable, dpR>() { // from class: kotlinx.coroutines.internal.OnUndeliveredElementKt$bindCancellationFun$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void d(Throwable th) {
                dAB.b(drm, e, dqz);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                d(th);
                return dpR.c;
            }
        };
    }
}
