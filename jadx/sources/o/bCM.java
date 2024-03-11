package o;

import android.annotation.SuppressLint;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;
import java.util.List;
import o.C1020Ln;
import o.C1291Wa;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.InterfaceC8613dsb;
import o.bBX;
import o.bCM;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes4.dex */
public final class bCM {
    public static final void d(@SuppressLint({"ComposeUnstableCollections"}) final List<C1291Wa> list, final drO<dpR> dro, final drM<? super C1291Wa, dpR> drm, Modifier modifier, Composer composer, final int i, final int i2) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) drm, "");
        Composer startRestartGroup = composer.startRestartGroup(717975904);
        Modifier.Companion companion = (i2 & 8) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(717975904, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.SeasonPicker (SeasonPicker.kt:29)");
        }
        final Modifier modifier2 = companion;
        LazyDslKt.LazyColumn(BackgroundKt.m110backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), LA.c(Token.Color.K.c, startRestartGroup, 6), null, 2, null), null, null, false, Arrangement.INSTANCE.getSpaceEvenly(), Alignment.Companion.getCenterHorizontally(), null, false, new drM<LazyListScope, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.SeasonPickerKt$SeasonPicker$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(LazyListScope lazyListScope) {
                d(lazyListScope);
                return dpR.c;
            }

            public final void d(LazyListScope lazyListScope) {
                C8632dsu.c((Object) lazyListScope, "");
                final List<C1291Wa> list2 = list;
                final drM<C1291Wa, dpR> drm2 = drm;
                final SeasonPickerKt$SeasonPicker$1$invoke$$inlined$items$default$1 seasonPickerKt$SeasonPicker$1$invoke$$inlined$items$default$1 = new drM() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.SeasonPickerKt$SeasonPicker$1$invoke$$inlined$items$default$1
                    @Override // o.drM
                    /* renamed from: a */
                    public final Void invoke(C1291Wa c1291Wa) {
                        return null;
                    }
                };
                lazyListScope.items(list2.size(), null, new drM<Integer, Object>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.SeasonPickerKt$SeasonPicker$1$invoke$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ Object invoke(Integer num) {
                        return a(num.intValue());
                    }

                    public final Object a(int i3) {
                        return drM.this.invoke(list2.get(i3));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new InterfaceC8613dsb<LazyItemScope, Integer, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.SeasonPickerKt$SeasonPicker$1$invoke$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // o.InterfaceC8613dsb
                    public /* synthetic */ dpR invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                        c(lazyItemScope, num.intValue(), composer2, num2.intValue());
                        return dpR.c;
                    }

                    public final void c(LazyItemScope lazyItemScope, int i3, Composer composer2, int i4) {
                        int i5;
                        if ((i4 & 14) == 0) {
                            i5 = i4 | (composer2.changed(lazyItemScope) ? 4 : 2);
                        } else {
                            i5 = i4;
                        }
                        if ((i4 & 112) == 0) {
                            i5 |= composer2.changed(i3) ? 32 : 16;
                        }
                        if ((i5 & 731) == 146 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                        }
                        final C1291Wa c1291Wa = (C1291Wa) list2.get(i3);
                        String e = c1291Wa.e();
                        int m2458getEllipsisgIe3tQ8 = TextOverflow.Companion.m2458getEllipsisgIe3tQ8();
                        Modifier.Companion companion2 = Modifier.Companion;
                        final drM drm3 = drm2;
                        C1020Ln.c(e, ClickableKt.m130clickableXHw0xAI$default(companion2, false, null, null, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.SeasonPickerKt$SeasonPicker$1$1$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            public final void e() {
                                drm3.invoke(c1291Wa);
                            }

                            @Override // o.drO
                            public /* synthetic */ dpR invoke() {
                                e();
                                return dpR.c;
                            }
                        }, 7, null), (Token.Color) null, (Theme) null, (Token.Typography) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m2458getEllipsisgIe3tQ8, false, 0, 2, (drM<? super TextLayoutResult, dpR>) null, composer2, 805306368, 384, 11772);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                final drO<dpR> dro2 = dro;
                LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(914761804, true, new InterfaceC8612dsa<LazyItemScope, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.SeasonPickerKt$SeasonPicker$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // o.InterfaceC8612dsa
                    public /* synthetic */ dpR invoke(LazyItemScope lazyItemScope, Composer composer2, Integer num) {
                        a(lazyItemScope, composer2, num.intValue());
                        return dpR.c;
                    }

                    public final void a(LazyItemScope lazyItemScope, Composer composer2, int i3) {
                        C8632dsu.c((Object) lazyItemScope, "");
                        if ((i3 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(914761804, i3, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.SeasonPicker.<anonymous>.<anonymous> (SeasonPicker.kt:46)");
                        }
                        bBX.d(dro2, null, composer2, 0, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
            }
        }, startRestartGroup, 221184, 206);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.SeasonPickerKt$SeasonPicker$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void e(Composer composer2, int i3) {
                    bCM.d(list, dro, drm, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    e(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
