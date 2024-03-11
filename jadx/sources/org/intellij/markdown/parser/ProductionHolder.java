package org.intellij.markdown.parser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.C8632dsu;
import o.C8654dtp;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes5.dex */
public final class ProductionHolder {
    private final List<SequentialParser.Node> _production = new ArrayList();
    private int currentPosition;

    public final int getCurrentPosition() {
        return this.currentPosition;
    }

    public final List<SequentialParser.Node> getProduction() {
        return this._production;
    }

    public final void updatePosition(int i) {
        this.currentPosition = i;
    }

    public final void addProduction(Collection<SequentialParser.Node> collection) {
        C8632dsu.c((Object) collection, "");
        this._production.addAll(collection);
    }

    public final Marker mark() {
        return new Marker(this);
    }

    /* loaded from: classes5.dex */
    public final class Marker {
        private final int startPos;
        final /* synthetic */ ProductionHolder this$0;

        public Marker(ProductionHolder productionHolder) {
            C8632dsu.c((Object) productionHolder, "");
            this.this$0 = productionHolder;
            this.startPos = productionHolder.getCurrentPosition();
        }

        public final void done(IElementType iElementType) {
            C8632dsu.c((Object) iElementType, "");
            this.this$0._production.add(new SequentialParser.Node(new C8654dtp(this.startPos, this.this$0.getCurrentPosition()), iElementType));
        }
    }
}
