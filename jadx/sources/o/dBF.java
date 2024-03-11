package o;

import kotlinx.coroutines.selects.TrySelectDetailedResult;

/* loaded from: classes5.dex */
public final class dBF {
    private static final InterfaceC8612dsa<Object, Object, Object, Object> e = new InterfaceC8612dsa() { // from class: kotlinx.coroutines.selects.SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1
        @Override // o.InterfaceC8612dsa
        /* renamed from: d */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    };
    private static final dAH h = new dAH("STATE_REG");
    private static final dAH a = new dAH("STATE_COMPLETED");
    private static final dAH b = new dAH("STATE_CANCELLED");
    private static final dAH d = new dAH("NO_RESULT");
    private static final dAH c = new dAH("PARAM_CLAUSE_0");

    public static final dAH j() {
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(InterfaceC8743dwx<? super dpR> interfaceC8743dwx, drM<? super Throwable, dpR> drm) {
        Object e2 = interfaceC8743dwx.e(dpR.c, null, drm);
        if (e2 == null) {
            return false;
        }
        interfaceC8743dwx.b(e2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrySelectDetailedResult a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return TrySelectDetailedResult.ALREADY_SELECTED;
                    }
                    throw new IllegalStateException(("Unexpected internal result: " + i).toString());
                }
                return TrySelectDetailedResult.CANCELLED;
            }
            return TrySelectDetailedResult.REREGISTER;
        }
        return TrySelectDetailedResult.SUCCESSFUL;
    }
}
