package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.PlatformMagnifierFactory;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.netflix.android.org.json.zip.JSONzip;
import kotlin.jvm.internal.Lambda;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldSelectionManager_androidKt$textFieldMagnifier$1 extends Lambda implements InterfaceC8612dsa<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ TextFieldSelectionManager $manager;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$textFieldMagnifier$1(TextFieldSelectionManager textFieldSelectionManager) {
        super(3);
        this.$manager = textFieldSelectionManager;
    }

    @Override // o.InterfaceC8612dsa
    public /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        composer.startReplaceableGroup(1980580247);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1980580247, i, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:45)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m2542boximpl(IntSize.Companion.m2551getZeroYbymL2g()), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState = (MutableState) rememberedValue;
        final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
        drO<Offset> dro = new drO<Offset>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ Offset invoke() {
                return Offset.m1126boximpl(m546invokeF1C5BW0());
            }

            /* renamed from: invoke-F1C5BW0  reason: not valid java name */
            public final long m546invokeF1C5BW0() {
                return TextFieldSelectionManagerKt.m545calculateSelectionMagnifierCenterAndroidO0kMr_c(TextFieldSelectionManager.this, TextFieldSelectionManager_androidKt$textFieldMagnifier$1.invoke$lambda$1(mutableState));
            }
        };
        composer.startReplaceableGroup(-233457119);
        boolean changed = composer.changed(mutableState);
        boolean changed2 = composer.changed(density);
        Object rememberedValue2 = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new drM<drO<? extends Offset>, Modifier>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ Modifier invoke(drO<? extends Offset> dro2) {
                    return invoke2((drO<Offset>) dro2);
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Modifier invoke2(final drO<Offset> dro2) {
                    Modifier m145magnifierjPUL71Q;
                    Modifier.Companion companion2 = Modifier.Companion;
                    drM<Density, Offset> drm = new drM<Density, Offset>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* synthetic */ Offset invoke(Density density2) {
                            return Offset.m1126boximpl(m547invoketuRUvjQ(density2));
                        }

                        /* renamed from: invoke-tuRUvjQ  reason: not valid java name */
                        public final long m547invoketuRUvjQ(Density density2) {
                            return dro2.invoke().m1146unboximpl();
                        }
                    };
                    final Density density2 = Density.this;
                    final MutableState<IntSize> mutableState2 = mutableState;
                    m145magnifierjPUL71Q = Magnifier_androidKt.m145magnifierjPUL71Q(companion2, drm, (r23 & 2) != 0 ? null : null, (r23 & 4) != 0 ? null : new drM<DpSize, dpR>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(DpSize dpSize) {
                            m548invokeEaSLcWc(dpSize.m2522unboximpl());
                            return dpR.c;
                        }

                        /* renamed from: invoke-EaSLcWc  reason: not valid java name */
                        public final void m548invokeEaSLcWc(long j) {
                            MutableState<IntSize> mutableState3 = mutableState2;
                            Density density3 = Density.this;
                            TextFieldSelectionManager_androidKt$textFieldMagnifier$1.invoke$lambda$2(mutableState3, IntSizeKt.IntSize(density3.mo187roundToPx0680j_4(DpSize.m2519getWidthD9Ej5fM(j)), density3.mo187roundToPx0680j_4(DpSize.m2518getHeightD9Ej5fM(j))));
                        }
                    }, (r23 & 8) != 0 ? Float.NaN : 0.0f, (r23 & 16) != 0 ? false : true, (r23 & 32) != 0 ? DpSize.Companion.m2523getUnspecifiedMYxV2XQ() : 0L, (r23 & 64) != 0 ? Dp.Companion.m2501getUnspecifiedD9Ej5fM() : 0.0f, (r23 & 128) != 0 ? Dp.Companion.m2501getUnspecifiedD9Ej5fM() : 0.0f, (r23 & JSONzip.end) != 0, (r23 & 512) == 0 ? PlatformMagnifierFactory.Companion.getForCurrentPlatform() : null);
                    return m145magnifierjPUL71Q;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier animatedSelectionMagnifier = SelectionMagnifierKt.animatedSelectionMagnifier(modifier, dro, (drM) rememberedValue2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animatedSelectionMagnifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(MutableState<IntSize> mutableState, long j) {
        mutableState.setValue(IntSize.m2542boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invoke$lambda$1(MutableState<IntSize> mutableState) {
        return mutableState.getValue().m2550unboximpl();
    }
}
