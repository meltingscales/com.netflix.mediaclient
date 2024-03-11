package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import o.dpR;
import o.dqZ;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public interface Composer {
    public static final Companion Companion = Companion.$$INSTANCE;

    <V, T> void apply(V v, drX<? super T, ? super V, dpR> drx);

    CompositionContext buildContext();

    boolean changed(Object obj);

    void collectParameterInformation();

    <T> T consume(CompositionLocal<T> compositionLocal);

    <T> void createNode(drO<? extends T> dro);

    void deactivateToEndGroup(boolean z);

    void disableReusing();

    void enableReusing();

    void endDefaults();

    void endMovableGroup();

    void endNode();

    void endProvider();

    void endProviders();

    void endReplaceableGroup();

    ScopeUpdateScope endRestartGroup();

    void endReusableGroup();

    void endToMarker(int i);

    Applier<?> getApplier();

    dqZ getApplyCoroutineContext();

    CompositionData getCompositionData();

    int getCompoundKeyHash();

    CompositionLocalMap getCurrentCompositionLocalMap();

    int getCurrentMarker();

    boolean getDefaultsInvalid();

    boolean getInserting();

    RecomposeScope getRecomposeScope();

    boolean getSkipping();

    void insertMovableContent(MovableContent<?> movableContent, Object obj);

    void recordSideEffect(drO<dpR> dro);

    void recordUsed(RecomposeScope recomposeScope);

    Object rememberedValue();

    void skipToGroupEnd();

    void startDefaults();

    void startMovableGroup(int i, Object obj);

    void startNode();

    void startProvider(ProvidedValue<?> providedValue);

    void startProviders(ProvidedValue<?>[] providedValueArr);

    void startReplaceableGroup(int i);

    Composer startRestartGroup(int i);

    void startReusableGroup(int i, Object obj);

    void startReusableNode();

    void updateRememberedValue(Object obj);

    void useNode();

    default boolean changed(boolean z) {
        return changed(z);
    }

    default boolean changed(int i) {
        return changed(i);
    }

    default boolean changed(float f) {
        return changed(f);
    }

    default boolean changed(long j) {
        return changed(j);
    }

    default boolean changedInstance(Object obj) {
        return changed(obj);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Object Empty = new Object() { // from class: androidx.compose.runtime.Composer$Companion$Empty$1
            public String toString() {
                return "Empty";
            }
        };

        public final Object getEmpty() {
            return Empty;
        }

        private Companion() {
        }
    }
}
