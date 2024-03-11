package o;

import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.internal.MutablePropertyReference2Impl;

/* loaded from: classes5.dex */
public final class Q {
    public static final int a;
    private static final SemanticsPropertyKey c;
    private static final SemanticsPropertyKey<Integer> e;
    static final /* synthetic */ dtC<Object>[] b = {dsA.b(new MutablePropertyReference2Impl(Q.class, "lineCountVal", "getLineCountVal(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 0))};
    public static final Q d = new Q();

    private Q() {
    }

    static {
        SemanticsPropertyKey<Integer> semanticsPropertyKey = new SemanticsPropertyKey<>("lineCount", null, 2, null);
        e = semanticsPropertyKey;
        c = semanticsPropertyKey;
        int i = SemanticsPropertyKey.$stable;
        a = i | i;
    }

    public final void e(SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        C8632dsu.c((Object) semanticsPropertyReceiver, "");
        c.setValue(semanticsPropertyReceiver, b[0], Integer.valueOf(i));
    }
}
