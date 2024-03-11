package androidx.compose.ui.autofill;

import java.util.LinkedHashMap;
import java.util.Map;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class AutofillTree {
    private final Map<Integer, AutofillNode> children = new LinkedHashMap();

    public final Map<Integer, AutofillNode> getChildren() {
        return this.children;
    }

    public final dpR performAutofill(int i, String str) {
        drM<String, dpR> onFill;
        AutofillNode autofillNode = this.children.get(Integer.valueOf(i));
        if (autofillNode == null || (onFill = autofillNode.getOnFill()) == null) {
            return null;
        }
        onFill.invoke(str);
        return dpR.c;
    }
}
