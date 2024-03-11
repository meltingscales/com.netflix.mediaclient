package androidx.compose.foundation.text;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class TextFieldScrollKt {

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ Rect access$getCursorRectInScroller(Density density, int i, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z, int i2) {
        return getCursorRectInScroller(density, i, transformedText, textLayoutResult, z, i2);
    }

    public static final Modifier textFieldScroll(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, drO<TextLayoutResultProxy> dro) {
        Modifier verticalScrollLayoutModifier;
        Orientation orientation = textFieldScrollerPosition.getOrientation();
        int m468getOffsetToFollow5zctL8 = textFieldScrollerPosition.m468getOffsetToFollow5zctL8(textFieldValue.m2302getSelectiond9O1mEE());
        textFieldScrollerPosition.m469setPreviousSelection5zctL8(textFieldValue.m2302getSelectiond9O1mEE());
        TransformedText filterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation, textFieldValue.getAnnotatedString());
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(textFieldScrollerPosition, m468getOffsetToFollow5zctL8, filterWithValidation, dro);
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(textFieldScrollerPosition, m468getOffsetToFollow5zctL8, filterWithValidation, dro);
        }
        return ClipKt.clipToBounds(modifier).then(verticalScrollLayoutModifier);
    }

    public static final Rect getCursorRectInScroller(Density density, int i, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z, int i2) {
        Rect zero;
        float left;
        float left2;
        if (textLayoutResult == null || (zero = textLayoutResult.getCursorRect(transformedText.getOffsetMapping().originalToTransformed(i))) == null) {
            zero = Rect.Companion.getZero();
        }
        Rect rect = zero;
        int mo187roundToPx0680j_4 = density.mo187roundToPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
        if (z) {
            left = (i2 - rect.getLeft()) - mo187roundToPx0680j_4;
        } else {
            left = rect.getLeft();
        }
        float f = left;
        if (z) {
            left2 = i2 - rect.getLeft();
        } else {
            left2 = rect.getLeft() + mo187roundToPx0680j_4;
        }
        return Rect.copy$default(rect, f, 0.0f, left2, 0.0f, 10, null);
    }

    public static final Modifier textFieldScrollable(Modifier modifier, final TextFieldScrollerPosition textFieldScrollerPosition, final MutableInteractionSource mutableInteractionSource, final boolean z) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                inspectorInfo.setName("textFieldScrollable");
                inspectorInfo.getProperties().set("scrollerPosition", TextFieldScrollerPosition.this);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC8612dsa<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.startReplaceableGroup(805428266);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(805428266, i, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:68)");
                }
                boolean z2 = TextFieldScrollerPosition.this.getOrientation() == Orientation.Vertical || !(composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl);
                composer.startReplaceableGroup(1235672980);
                boolean changed = composer.changed(TextFieldScrollerPosition.this);
                final TextFieldScrollerPosition textFieldScrollerPosition2 = TextFieldScrollerPosition.this;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new drM<Float, Float>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* synthetic */ Float invoke(Float f) {
                            return invoke(f.floatValue());
                        }

                        public final Float invoke(float f) {
                            float offset = TextFieldScrollerPosition.this.getOffset() + f;
                            if (offset > TextFieldScrollerPosition.this.getMaximum()) {
                                f = TextFieldScrollerPosition.this.getMaximum() - TextFieldScrollerPosition.this.getOffset();
                            } else if (offset < 0.0f) {
                                f = -TextFieldScrollerPosition.this.getOffset();
                            }
                            TextFieldScrollerPosition textFieldScrollerPosition3 = TextFieldScrollerPosition.this;
                            textFieldScrollerPosition3.setOffset(textFieldScrollerPosition3.getOffset() + f);
                            return Float.valueOf(f);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                final ScrollableState rememberScrollableState = ScrollableStateKt.rememberScrollableState((drM) rememberedValue, composer, 0);
                final TextFieldScrollerPosition textFieldScrollerPosition3 = TextFieldScrollerPosition.this;
                composer.startReplaceableGroup(511388516);
                boolean changed2 = composer.changed(rememberScrollableState);
                boolean changed3 = composer.changed(textFieldScrollerPosition3);
                Object rememberedValue2 = composer.rememberedValue();
                if ((changed2 | changed3) || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new ScrollableState(textFieldScrollerPosition3) { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1
                        private final State canScrollBackward$delegate;
                        private final State canScrollForward$delegate;

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public float dispatchRawDelta(float f) {
                            return ScrollableState.this.dispatchRawDelta(f);
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean isScrollInProgress() {
                            return ScrollableState.this.isScrollInProgress();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public Object scroll(MutatePriority mutatePriority, drX<? super ScrollScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                            return ScrollableState.this.scroll(mutatePriority, drx, interfaceC8585dra);
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.canScrollForward$delegate = SnapshotStateKt.derivedStateOf(new drO<Boolean>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollForward$2
                                /* JADX INFO: Access modifiers changed from: package-private */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // o.drO
                                public final Boolean invoke() {
                                    return Boolean.valueOf(TextFieldScrollerPosition.this.getOffset() < TextFieldScrollerPosition.this.getMaximum());
                                }
                            });
                            this.canScrollBackward$delegate = SnapshotStateKt.derivedStateOf(new drO<Boolean>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollBackward$2
                                /* JADX INFO: Access modifiers changed from: package-private */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // o.drO
                                public final Boolean invoke() {
                                    return Boolean.valueOf(TextFieldScrollerPosition.this.getOffset() > 0.0f);
                                }
                            });
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean getCanScrollForward() {
                            return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean getCanScrollBackward() {
                            return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                Modifier scrollable$default = ScrollableKt.scrollable$default(Modifier.Companion, (TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1) rememberedValue2, TextFieldScrollerPosition.this.getOrientation(), z && TextFieldScrollerPosition.this.getMaximum() != 0.0f, z2, null, mutableInteractionSource, 16, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return scrollable$default;
            }
        });
    }
}
