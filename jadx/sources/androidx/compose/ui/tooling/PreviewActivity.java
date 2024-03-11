package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.FloatingActionButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import java.util.Arrays;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drO;
import o.drX;
import o.duD;

/* loaded from: classes5.dex */
public final class PreviewActivity extends ComponentActivity {
    private final String TAG = "PreviewActivity";

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            Log.d(this.TAG, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        setComposableContent(stringExtra);
    }

    private final void setComposableContent(String str) {
        final String h;
        final String f;
        String str2 = this.TAG;
        Log.d(str2, "PreviewActivity has composable " + str);
        h = duD.h(str, '.', null, 2, null);
        f = duD.f(str, '.', (String) null, 2, (Object) null);
        String stringExtra = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra != null) {
            setParameterizedContent(h, f, stringExtra);
            return;
        }
        String str3 = this.TAG;
        Log.d(str3, "Previewing '" + f + "' without a parameter provider.");
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-840626948, true, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setComposableContent$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return dpR.c;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840626948, i, -1, "androidx.compose.ui.tooling.PreviewActivity.setComposableContent.<anonymous> (PreviewActivity.android.kt:76)");
                    }
                    ComposableInvoker.INSTANCE.invokeComposable(h, f, composer, new Object[0]);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 1, null);
    }

    private final void setParameterizedContent(final String str, final String str2, String str3) {
        String str4 = this.TAG;
        Log.d(str4, "Previewing '" + str2 + "' with parameter provider: '" + str3 + '\'');
        final Object[] previewProviderParameters = PreviewUtils_androidKt.getPreviewProviderParameters(PreviewUtils_androidKt.asPreviewProviderClass(str3), getIntent().getIntExtra("parameterProviderIndex", -1));
        if (previewProviderParameters.length > 1) {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-861939235, true, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-861939235, i, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:109)");
                    }
                    composer.startReplaceableGroup(-492369756);
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    final MutableIntState mutableIntState = (MutableIntState) rememberedValue;
                    final Object[] objArr = previewProviderParameters;
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 958604965, true, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // o.drX
                        public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return dpR.c;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(958604965, i2, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:123)");
                                }
                                drX<Composer, Integer, dpR> m2460getLambda1$ui_tooling_release = ComposableSingletons$PreviewActivity_androidKt.INSTANCE.m2460getLambda1$ui_tooling_release();
                                final MutableIntState mutableIntState2 = MutableIntState.this;
                                final Object[] objArr2 = objArr;
                                FloatingActionButtonKt.m608ExtendedFloatingActionButtonwqdebIU(m2460getLambda1$ui_tooling_release, new drO<dpR>() { // from class: androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // o.drO
                                    public /* bridge */ /* synthetic */ dpR invoke() {
                                        invoke2();
                                        return dpR.c;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        MutableIntState mutableIntState3 = MutableIntState.this;
                                        mutableIntState3.setIntValue((mutableIntState3.getIntValue() + 1) % objArr2.length);
                                    }
                                }, null, null, null, null, 0L, 0L, null, composer2, 6, 508);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    });
                    final String str5 = str;
                    final String str6 = str2;
                    final Object[] objArr2 = previewProviderParameters;
                    ScaffoldKt.m628Scaffold27mzLpw(null, null, null, null, null, composableLambda, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composer, 57310875, true, new InterfaceC8612dsa<PaddingValues, Composer, Integer, dpR>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // o.InterfaceC8612dsa
                        public /* synthetic */ dpR invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                            invoke(paddingValues, composer2, num.intValue());
                            return dpR.c;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer2, int i2) {
                            if ((i2 & 14) == 0) {
                                i2 |= composer2.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i2 & 91) != 18 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(57310875, i2, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:113)");
                                }
                                Modifier padding = PaddingKt.padding(Modifier.Companion, paddingValues);
                                String str7 = str5;
                                String str8 = str6;
                                Object[] objArr3 = objArr2;
                                MutableIntState mutableIntState2 = mutableIntState;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                                drO<ComposeUiNode> constructor = companion.getConstructor();
                                InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(padding);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer m1009constructorimpl = Updater.m1009constructorimpl(composer2);
                                Updater.m1013setimpl(m1009constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                ComposableInvoker.INSTANCE.invokeComposable(str7, str8, composer2, objArr3[mutableIntState2.getIntValue()]);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composer, 196608, 12582912, 131039);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 1, null);
        } else {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1901447514, true, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1901447514, i, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:134)");
                        }
                        ComposableInvoker composableInvoker = ComposableInvoker.INSTANCE;
                        String str5 = str;
                        String str6 = str2;
                        Object[] objArr = previewProviderParameters;
                        composableInvoker.invokeComposable(str5, str6, composer, Arrays.copyOf(objArr, objArr.length));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            }), 1, null);
        }
    }
}
