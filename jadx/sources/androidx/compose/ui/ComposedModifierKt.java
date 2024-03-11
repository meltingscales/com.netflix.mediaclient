package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drX;
import o.dsH;

/* loaded from: classes.dex */
public final class ComposedModifierKt {
    public static /* synthetic */ Modifier composed$default(Modifier modifier, drM drm, InterfaceC8612dsa interfaceC8612dsa, int i, Object obj) {
        if ((i & 1) != 0) {
            drm = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, drm, interfaceC8612dsa);
    }

    public static final Modifier composed(Modifier modifier, drM<? super InspectorInfo, dpR> drm, InterfaceC8612dsa<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> interfaceC8612dsa) {
        return modifier.then(new ComposedModifier(drm, interfaceC8612dsa));
    }

    public static final Modifier materializeModifier(final Composer composer, Modifier modifier) {
        if (modifier.all(new drM<Modifier.Element, Boolean>() { // from class: androidx.compose.ui.ComposedModifierKt$materialize$1
            @Override // o.drM
            public final Boolean invoke(Modifier.Element element) {
                return Boolean.valueOf(!(element instanceof ComposedModifier));
            }
        })) {
            return modifier;
        }
        composer.startReplaceableGroup(1219399079);
        Modifier modifier2 = (Modifier) modifier.foldIn(Modifier.Companion, new drX<Modifier, Modifier.Element, Modifier>() { // from class: androidx.compose.ui.ComposedModifierKt$materialize$result$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public final Modifier invoke(Modifier modifier3, Modifier.Element element) {
                boolean z = element instanceof ComposedModifier;
                Modifier.Element element2 = element;
                if (z) {
                    InterfaceC8612dsa<Modifier, Composer, Integer, Modifier> factory = ((ComposedModifier) element).getFactory();
                    C8632dsu.d(factory);
                    element2 = ComposedModifierKt.materializeModifier(Composer.this, (Modifier) ((InterfaceC8612dsa) dsH.a(factory, 3)).invoke(Modifier.Companion, Composer.this, 0));
                }
                return modifier3.then(element2);
            }
        });
        composer.endReplaceableGroup();
        return modifier2;
    }

    public static final Modifier materializeWithCompositionLocalInjectionInternal(Composer composer, Modifier modifier) {
        return modifier == Modifier.Companion ? modifier : materializeModifier(composer, new CompositionLocalMapInjectionElement(composer.getCurrentCompositionLocalMap()).then(modifier));
    }
}
