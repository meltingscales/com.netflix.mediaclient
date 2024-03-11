package androidx.compose.runtime.tooling;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.Set;
import o.drO;

/* loaded from: classes.dex */
public final class InspectionTablesKt {
    private static final ProvidableCompositionLocal<Set<CompositionData>> LocalInspectionTables = CompositionLocalKt.staticCompositionLocalOf(new drO<Set<CompositionData>>() { // from class: androidx.compose.runtime.tooling.InspectionTablesKt$LocalInspectionTables$1
        @Override // o.drO
        public final Set<CompositionData> invoke() {
            return null;
        }
    });

    public static final ProvidableCompositionLocal<Set<CompositionData>> getLocalInspectionTables() {
        return LocalInspectionTables;
    }
}
