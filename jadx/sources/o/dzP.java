package o;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes5.dex */
public final class dzP {
    public static final void a(AbortFlowException abortFlowException, dyQ<?> dyq) {
        if (abortFlowException.c != dyq) {
            throw abortFlowException;
        }
    }
}
