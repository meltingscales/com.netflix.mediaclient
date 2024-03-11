package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public interface RemeasurementModifier extends Modifier.Element {
    void onRemeasurementAvailable(Remeasurement remeasurement);
}
