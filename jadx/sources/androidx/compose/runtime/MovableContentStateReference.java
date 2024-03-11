package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class MovableContentStateReference {
    private final Anchor anchor;
    private final ControlledComposition composition;
    private final MovableContent<Object> content;
    private List<Pair<RecomposeScopeImpl, IdentityArraySet<Object>>> invalidations;
    private final PersistentCompositionLocalMap locals;
    private final Object parameter;
    private final SlotTable slotTable;

    public final Anchor getAnchor$runtime_release() {
        return this.anchor;
    }

    public final ControlledComposition getComposition$runtime_release() {
        return this.composition;
    }

    public final MovableContent<Object> getContent$runtime_release() {
        return this.content;
    }

    public final List<Pair<RecomposeScopeImpl, IdentityArraySet<Object>>> getInvalidations$runtime_release() {
        return this.invalidations;
    }

    public final PersistentCompositionLocalMap getLocals$runtime_release() {
        return this.locals;
    }

    public final Object getParameter$runtime_release() {
        return this.parameter;
    }

    public final SlotTable getSlotTable$runtime_release() {
        return this.slotTable;
    }

    public final void setInvalidations$runtime_release(List<Pair<RecomposeScopeImpl, IdentityArraySet<Object>>> list) {
        this.invalidations = list;
    }

    public MovableContentStateReference(MovableContent<Object> movableContent, Object obj, ControlledComposition controlledComposition, SlotTable slotTable, Anchor anchor, List<Pair<RecomposeScopeImpl, IdentityArraySet<Object>>> list, PersistentCompositionLocalMap persistentCompositionLocalMap) {
        this.content = movableContent;
        this.parameter = obj;
        this.composition = controlledComposition;
        this.slotTable = slotTable;
        this.anchor = anchor;
        this.invalidations = list;
        this.locals = persistentCompositionLocalMap;
    }
}
