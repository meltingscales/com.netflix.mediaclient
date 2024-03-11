package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class TextFieldKeyInputKt {
    /* renamed from: textFieldKeyInput-2WJ9YEU  reason: not valid java name */
    public static final Modifier m463textFieldKeyInput2WJ9YEU(Modifier modifier, final TextFieldState textFieldState, final TextFieldSelectionManager textFieldSelectionManager, final TextFieldValue textFieldValue, final drM<? super TextFieldValue, dpR> drm, final boolean z, final boolean z2, final OffsetMapping offsetMapping, final UndoManager undoManager, final int i) {
        return ComposedModifierKt.composed$default(modifier, null, new InterfaceC8612dsa<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$2
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

            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                composer.startReplaceableGroup(2057323757);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2057323757, i2, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:245)");
                }
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (rememberedValue == companion.getEmpty()) {
                    rememberedValue = new TextPreparedSelectionState();
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                TextPreparedSelectionState textPreparedSelectionState = (TextPreparedSelectionState) rememberedValue;
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue2 = composer.rememberedValue();
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = new DeadKeyCombiner();
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(Modifier.Companion, new AnonymousClass1(new TextFieldKeyInput(TextFieldState.this, textFieldSelectionManager, textFieldValue, z, z2, textPreparedSelectionState, offsetMapping, undoManager, (DeadKeyCombiner) rememberedValue2, null, drm, i, 512, null)));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return onKeyEvent;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$2$1  reason: invalid class name */
            /* loaded from: classes.dex */
            public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements drM<KeyEvent, Boolean> {
                AnonymousClass1(Object obj) {
                    super(1, obj, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                }

                @Override // o.drM
                public /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                    return m464invokeZmokQxo(keyEvent.m1649unboximpl());
                }

                /* renamed from: invoke-ZmokQxo  reason: not valid java name */
                public final Boolean m464invokeZmokQxo(android.view.KeyEvent keyEvent) {
                    return Boolean.valueOf(((TextFieldKeyInput) this.receiver).m462processZmokQxo(keyEvent));
                }
            }
        }, 1, null);
    }
}
