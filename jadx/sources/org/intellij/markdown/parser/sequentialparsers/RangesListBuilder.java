package org.intellij.markdown.parser.sequentialparsers;

import java.util.ArrayList;
import java.util.List;
import o.C8654dtp;

/* loaded from: classes5.dex */
public final class RangesListBuilder {
    private final ArrayList<C8654dtp> list = new ArrayList<>();
    private int lastStart = -239;
    private int lastEnd = -239;

    public final void put(int i) {
        if (this.lastEnd + 1 == i) {
            this.lastEnd = i;
            return;
        }
        if (this.lastStart != -239) {
            this.list.add(new C8654dtp(this.lastStart, this.lastEnd));
        }
        this.lastStart = i;
        this.lastEnd = i;
    }

    public final List<C8654dtp> get() {
        if (this.lastStart != -239) {
            this.list.add(new C8654dtp(this.lastStart, this.lastEnd));
        }
        this.lastStart = -239;
        this.lastEnd = -239;
        return this.list;
    }
}
