package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public final class WindowInsetsPaddingKt {
    private static final ProvidableModifierLocal<WindowInsets> ModifierLocalConsumedWindowInsets = ModifierLocalKt.modifierLocalOf(new drO<WindowInsets>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drO
        public final WindowInsets invoke() {
            return WindowInsetsKt.WindowInsets(0, 0, 0, 0);
        }
    });

    public static final ProvidableModifierLocal<WindowInsets> getModifierLocalConsumedWindowInsets() {
        return ModifierLocalConsumedWindowInsets;
    }

    public static final Modifier windowInsetsPadding(Modifier modifier, final WindowInsets windowInsets) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$windowInsetsPadding$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("windowInsetsPadding");
                inspectorInfo.getProperties().set("insets", WindowInsets.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC8612dsa<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$windowInsetsPadding$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.startReplaceableGroup(-1415685722);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1415685722, i, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.kt:61)");
                }
                WindowInsets windowInsets2 = WindowInsets.this;
                composer.startReplaceableGroup(1157296644);
                boolean changed = composer.changed(windowInsets2);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new InsetsPaddingModifier(windowInsets2);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return insetsPaddingModifier;
            }
        });
    }

    public static final Modifier onConsumedWindowInsetsChanged(Modifier modifier, final drM<? super WindowInsets, dpR> drm) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("onConsumedWindowInsetsChanged");
                inspectorInfo.getProperties().set("block", drM.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC8612dsa<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.startReplaceableGroup(-1608161351);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1608161351, i, -1, "androidx.compose.foundation.layout.onConsumedWindowInsetsChanged.<anonymous> (WindowInsetsPadding.kt:125)");
                }
                drM<WindowInsets, dpR> drm2 = drm;
                composer.startReplaceableGroup(1157296644);
                boolean changed = composer.changed(drm2);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new ConsumedInsetsModifier(drm2);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                ConsumedInsetsModifier consumedInsetsModifier = (ConsumedInsetsModifier) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return consumedInsetsModifier;
            }
        });
    }
}
