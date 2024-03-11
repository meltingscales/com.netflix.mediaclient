package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ComposedModifier extends InspectorValueInfo implements Modifier.Element {
    private final InterfaceC8612dsa<Modifier, Composer, Integer, Modifier> factory;

    public final InterfaceC8612dsa<Modifier, Composer, Integer, Modifier> getFactory() {
        return this.factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComposedModifier(drM<? super InspectorInfo, dpR> drm, InterfaceC8612dsa<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> interfaceC8612dsa) {
        super(drm);
        this.factory = interfaceC8612dsa;
    }
}
