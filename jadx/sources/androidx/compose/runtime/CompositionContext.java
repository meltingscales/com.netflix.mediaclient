package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import java.util.Set;
import o.dpR;
import o.dqZ;
import o.drX;

/* loaded from: classes.dex */
public abstract class CompositionContext {
    public abstract void composeInitial$runtime_release(ControlledComposition controlledComposition, drX<? super Composer, ? super Integer, dpR> drx);

    public abstract void deletedMovableContent$runtime_release(MovableContentStateReference movableContentStateReference);

    public void doneComposing$runtime_release() {
    }

    public abstract boolean getCollectingParameterInformation$runtime_release();

    public abstract boolean getCollectingSourceInformation$runtime_release();

    public abstract int getCompoundHashKey$runtime_release();

    public abstract dqZ getEffectCoroutineContext();

    public CompositionObserverHolder getObserverHolder$runtime_release() {
        return null;
    }

    public abstract void insertMovableContent$runtime_release(MovableContentStateReference movableContentStateReference);

    public abstract void invalidate$runtime_release(ControlledComposition controlledComposition);

    public abstract void movableContentStateReleased$runtime_release(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState);

    public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference movableContentStateReference) {
        return null;
    }

    public void recordInspectionTable$runtime_release(Set<CompositionData> set) {
    }

    public void registerComposer$runtime_release(Composer composer) {
    }

    public abstract void reportRemovedComposition$runtime_release(ControlledComposition controlledComposition);

    public void startComposing$runtime_release() {
    }

    public void unregisterComposer$runtime_release(Composer composer) {
    }

    public abstract void unregisterComposition$runtime_release(ControlledComposition controlledComposition);

    public PersistentCompositionLocalMap getCompositionLocalScope$runtime_release() {
        return CompositionContextKt.access$getEmptyPersistentCompositionLocalMap$p();
    }
}
