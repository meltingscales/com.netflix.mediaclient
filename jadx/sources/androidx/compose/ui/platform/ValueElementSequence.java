package androidx.compose.ui.platform;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.dtQ;

/* loaded from: classes.dex */
public final class ValueElementSequence implements dtQ<ValueElement> {
    private final List<ValueElement> elements = new ArrayList();

    @Override // o.dtQ
    public Iterator<ValueElement> iterator() {
        return this.elements.iterator();
    }

    public final void set(String str, Object obj) {
        this.elements.add(new ValueElement(str, obj));
    }
}
