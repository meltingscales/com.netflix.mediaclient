package androidx.compose.foundation.text.selection;

import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.Map;

/* loaded from: classes.dex */
public interface SelectionRegistrar {
    public static final Companion Companion = Companion.$$INSTANCE;

    Map<Long, Selection> getSubselections();

    long nextSelectableId();

    void notifyPositionChange(long j);

    /* renamed from: notifySelectionUpdate-njBpvok  reason: not valid java name */
    boolean m532notifySelectionUpdatenjBpvok(LayoutCoordinates layoutCoordinates, long j, long j2, boolean z, SelectionAdjustment selectionAdjustment, boolean z2);

    void notifySelectionUpdateEnd();

    /* renamed from: notifySelectionUpdateStart-ubNVwUQ  reason: not valid java name */
    void m533notifySelectionUpdateStartubNVwUQ(LayoutCoordinates layoutCoordinates, long j, SelectionAdjustment selectionAdjustment, boolean z);

    Selectable subscribe(Selectable selectable);

    void unsubscribe(Selectable selectable);

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
