package androidx.compose.runtime;

import java.util.List;
import java.util.Set;
import kotlin.Pair;
import o.dpR;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public interface ControlledComposition extends Composition {
    void applyChanges();

    void applyLateChanges();

    void changesApplied();

    void composeContent(drX<? super Composer, ? super Integer, dpR> drx);

    <R> R delegateInvalidations(ControlledComposition controlledComposition, int i, drO<? extends R> dro);

    void disposeUnusedMovableContent(MovableContentState movableContentState);

    void insertMovableContent(List<Pair<MovableContentStateReference, MovableContentStateReference>> list);

    void invalidateAll();

    boolean isComposing();

    boolean observesAnyOf(Set<? extends Object> set);

    void prepareCompose(drO<dpR> dro);

    boolean recompose();

    void recordModificationsOf(Set<? extends Object> set);

    void recordReadOf(Object obj);

    void recordWriteOf(Object obj);
}
