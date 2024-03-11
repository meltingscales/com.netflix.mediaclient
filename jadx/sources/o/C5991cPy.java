package o;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.Fragment;
import androidx.savedstate.SavedStateRegistry;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesScreenKt$BlockedTitlesScreen$1$2;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C1020Ln;
import o.C5989cPw;
import o.C5991cPy;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8737dwr;
import o.C9935zP;
import o.InterfaceC5278bvj;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.InterfaceC8613dsb;
import o.KH;
import o.KU;
import o.cPA;
import o.cPI;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import o.duS;
import o.dwU;

/* renamed from: o.cPy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5991cPy {
    public static final void e(final C9935zP c9935zP, final Context context, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final cPI cpi, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        C8632dsu.c((Object) str5, "");
        C8632dsu.c((Object) str6, "");
        C8632dsu.c((Object) str7, "");
        C8632dsu.c((Object) str8, "");
        C8632dsu.c((Object) cpi, "");
        Composer startRestartGroup = composer.startRestartGroup(-423160632);
        Modifier modifier2 = (i3 & 2048) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-423160632, i, i2, "com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesScreen (BlockedTitlesScreen.kt:61)");
        }
        Modifier m273padding3ABfNKs = PaddingKt.m273padding3ABfNKs(modifier2, androidx.compose.ui.unit.Dp.m2492constructorimpl(12));
        startRestartGroup.startReplaceableGroup(-483455358);
        final Modifier modifier3 = modifier2;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        drO<ComposeUiNode> constructor = companion.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m273padding3ABfNKs);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m1009constructorimpl = Updater.m1009constructorimpl(startRestartGroup);
        Updater.m1013setimpl(m1009constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(403151030);
        ComponentActivity d = C8983gx.d((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        if (d == null) {
            throw new IllegalStateException("LocalContext is not a ComponentActivity!".toString());
        }
        startRestartGroup.startReplaceableGroup(512170640);
        ComponentActivity d2 = C8983gx.d((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        if (d2 == null) {
            throw new IllegalStateException("Composable is not hosted in a ComponentActivity!".toString());
        }
        SavedStateRegistry savedStateRegistry = d.getSavedStateRegistry();
        InterfaceC8660dtv a = dsA.a(C5989cPw.class);
        View view = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
        Object[] objArr = {d, d2, d, savedStateRegistry};
        startRestartGroup.startReplaceableGroup(-568225417);
        boolean z = false;
        for (int i4 = 0; i4 < 4; i4++) {
            z |= startRestartGroup.changed(objArr[i4]);
        }
        C8916fj rememberedValue = startRestartGroup.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            Fragment fragment = d instanceof Fragment ? (Fragment) d : null;
            if (fragment != null) {
                Bundle arguments = fragment.getArguments();
                rememberedValue = new C8925fs(d2, arguments != null ? arguments.get("mavericks:arg") : null, fragment, null, null, 24, null);
            } else {
                Bundle extras = d2.getIntent().getExtras();
                rememberedValue = new C8916fj(d2, extras != null ? extras.get("mavericks:arg") : null, d, savedStateRegistry);
            }
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        AbstractC8979gt abstractC8979gt = (AbstractC8979gt) rememberedValue;
        startRestartGroup.startReplaceableGroup(511388516);
        boolean changed = startRestartGroup.changed(a);
        boolean changed2 = startRestartGroup.changed(abstractC8979gt);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if ((changed | changed2) || rememberedValue2 == Composer.Companion.getEmpty()) {
            C8903fW c8903fW = C8903fW.c;
            Class e = drI.e(a);
            String name = drI.e(a).getName();
            C8632dsu.a(name, "");
            rememberedValue2 = C8903fW.e(c8903fW, e, cPA.class, abstractC8979gt, name, false, null, 48, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        final C5989cPw c5989cPw = (C5989cPw) ((AbstractC8899fS) rememberedValue2);
        State a2 = C8983gx.a(c5989cPw, new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesScreenKt$BlockedTitlesScreen$1$searchResults$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
            public Object get(Object obj) {
                return ((cPA) obj).d();
            }
        }, startRestartGroup, 72);
        State a3 = C8983gx.a(c5989cPw, new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesScreenKt$BlockedTitlesScreen$1$userBlockedTitles$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
            public Object get(Object obj) {
                return ((cPA) obj).a();
            }
        }, startRestartGroup, 72);
        int i5 = i >> 6;
        C1020Ln.c(str, (Modifier) null, (Token.Color) Token.Color.C0499df.d, (Theme) null, (Token.Typography) Token.Typography.C0690c.e, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (drM<? super TextLayoutResult, dpR>) null, startRestartGroup, (i5 & 14) | 24960, 0, 16362);
        Modifier.Companion companion2 = Modifier.Companion;
        SpacerKt.Spacer(SizeKt.m288height3ABfNKs(companion2, androidx.compose.ui.unit.Dp.m2492constructorimpl(16)), startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(1958007494);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        Composer.Companion companion3 = Composer.Companion;
        if (rememberedValue3 == companion3.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        final MutableState mutableState = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1958007555);
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == companion3.getEmpty()) {
            rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState2 = (MutableState) rememberedValue4;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1958007614);
        Object rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == companion3.getEmpty()) {
            rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue5);
        }
        final MutableState mutableState3 = (MutableState) rememberedValue5;
        startRestartGroup.endReplaceableGroup();
        String a4 = a(mutableState);
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(1958007767);
        Object rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == companion3.getEmpty()) {
            rememberedValue6 = new drM<String, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesScreenKt$BlockedTitlesScreen$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(String str9) {
                    a(str9);
                    return dpR.c;
                }

                public final void a(String str9) {
                    C8632dsu.c((Object) str9, "");
                    C5991cPy.d(mutableState, str9);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue6);
        }
        startRestartGroup.endReplaceableGroup();
        int i6 = i >> 9;
        KR.e(str2, a4, (drM) rememberedValue6, fillMaxWidth$default, false, null, null, null, null, null, null, null, null, null, null, startRestartGroup, (i6 & 14) | 3456, 0, 32752);
        EffectsKt.LaunchedEffect(a(mutableState), new BlockedTitlesScreenKt$BlockedTitlesScreen$1$2(c5989cPw, c9935zP, context, cpi, mutableState, mutableState2, null), startRestartGroup, 64);
        SpacerKt.Spacer(SizeKt.m288height3ABfNKs(companion2, androidx.compose.ui.unit.Dp.m2492constructorimpl(24)), startRestartGroup, 6);
        if (a(mutableState).length() > 0) {
            startRestartGroup.startReplaceableGroup(1958008899);
            final SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) startRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            d(str4, duO.a(c(a2)), e(mutableState2), new drM<InterfaceC5278bvj, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesScreenKt$BlockedTitlesScreen$1$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(InterfaceC5278bvj interfaceC5278bvj) {
                    b(interfaceC5278bvj);
                    return dpR.c;
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesScreenKt$BlockedTitlesScreen$1$3$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                    final /* synthetic */ cPI a;
                    final /* synthetic */ MutableState<String> b;
                    final /* synthetic */ InterfaceC5278bvj c;
                    final /* synthetic */ C5989cPw d;
                    final /* synthetic */ String e;
                    int j;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(C5989cPw c5989cPw, String str, InterfaceC5278bvj interfaceC5278bvj, cPI cpi, MutableState<String> mutableState, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                        super(2, interfaceC8585dra);
                        this.d = c5989cPw;
                        this.e = str;
                        this.c = interfaceC5278bvj;
                        this.a = cpi;
                        this.b = mutableState;
                    }

                    @Override // o.drX
                    /* renamed from: c */
                    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                        return new AnonymousClass1(this.d, this.e, this.c, this.a, this.b, interfaceC8585dra);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object e;
                        e = C8586drb.e();
                        int i = this.j;
                        if (i == 0) {
                            C8556dpz.d(obj);
                            C5991cPy.d(this.b, "");
                            this.d.f();
                            C5989cPw c5989cPw = this.d;
                            String str = this.e;
                            InterfaceC5278bvj interfaceC5278bvj = this.c;
                            this.j = 1;
                            if (c5989cPw.d(str, interfaceC5278bvj, this) == e) {
                                return e;
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            C8556dpz.d(obj);
                        }
                        this.a.a();
                        return dpR.c;
                    }
                }

                public final void b(InterfaceC5278bvj interfaceC5278bvj) {
                    C8632dsu.c((Object) interfaceC5278bvj, "");
                    SoftwareKeyboardController softwareKeyboardController2 = SoftwareKeyboardController.this;
                    if (softwareKeyboardController2 != null) {
                        softwareKeyboardController2.hide();
                    }
                    C8737dwr.c(c5989cPw.e(), null, null, new AnonymousClass1(c5989cPw, str8, interfaceC5278bvj, cpi, mutableState, null), 3, null);
                }
            }, null, startRestartGroup, ((i >> 15) & 14) | 64, 16);
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(1958009534);
            duS a5 = duO.a(b(a3));
            boolean b = b((MutableState<Boolean>) mutableState3);
            startRestartGroup.startReplaceableGroup(1958009828);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == companion3.getEmpty()) {
                rememberedValue7 = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesScreenKt$BlockedTitlesScreen$1$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        d();
                        return dpR.c;
                    }

                    public final void d() {
                        boolean b2;
                        MutableState<Boolean> mutableState4 = mutableState3;
                        b2 = C5991cPy.b((MutableState<Boolean>) mutableState4);
                        C5991cPy.e(mutableState4, !b2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            startRestartGroup.endReplaceableGroup();
            e(a5, str3, str5, b, (drO) rememberedValue7, str6, str7, new drM<String, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesScreenKt$BlockedTitlesScreen$1$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(String str9) {
                    c(str9);
                    return dpR.c;
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesScreenKt$BlockedTitlesScreen$1$5$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                    final /* synthetic */ C5989cPw a;
                    final /* synthetic */ cPI b;
                    int c;
                    final /* synthetic */ String d;
                    final /* synthetic */ String e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(C5989cPw c5989cPw, String str, String str2, cPI cpi, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                        super(2, interfaceC8585dra);
                        this.a = c5989cPw;
                        this.d = str;
                        this.e = str2;
                        this.b = cpi;
                    }

                    @Override // o.drX
                    /* renamed from: b */
                    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                        return new AnonymousClass1(this.a, this.d, this.e, this.b, interfaceC8585dra);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object e;
                        e = C8586drb.e();
                        int i = this.c;
                        if (i == 0) {
                            C8556dpz.d(obj);
                            C5989cPw c5989cPw = this.a;
                            String str = this.d;
                            String str2 = this.e;
                            this.c = 1;
                            if (c5989cPw.b(str, str2, this) == e) {
                                return e;
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            C8556dpz.d(obj);
                        }
                        this.b.b();
                        return dpR.c;
                    }
                }

                public final void c(String str9) {
                    C8632dsu.c((Object) str9, "");
                    C8737dwr.c(C5989cPw.this.e(), null, null, new AnonymousClass1(C5989cPw.this, str8, str9, cpi, null), 3, null);
                }
            }, null, startRestartGroup, (i6 & 112) | 24576 | ((i >> 12) & 896) | (i5 & 458752) | (i5 & 3670016), JSONzip.end);
            startRestartGroup.endReplaceableGroup();
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesScreenKt$BlockedTitlesScreen$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(Composer composer2, int i7) {
                    C5991cPy.e(C9935zP.this, context, str, str2, str3, str4, str5, str6, str7, str8, cpi, modifier3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    a(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final String str, final duS<? extends InterfaceC5278bvj> dus, final boolean z, final drM<? super InterfaceC5278bvj, dpR> drm, Modifier modifier, Composer composer, final int i, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(-63031625);
        final Modifier.Companion companion = (i2 & 16) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-63031625, i, -1, "com.netflix.mediaclient.ui.profileviewingrestrictions.impl.SearchResults (BlockedTitlesScreen.kt:164)");
        }
        CrossfadeKt.Crossfade(Boolean.valueOf(z), (Modifier) null, (FiniteAnimationSpec<Float>) null, "SearchResultsAnimation", ComposableLambdaKt.composableLambda(startRestartGroup, -953154314, true, new InterfaceC8612dsa<Boolean, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesScreenKt$SearchResults$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(Boolean bool, Composer composer2, Integer num) {
                c(bool.booleanValue(), composer2, num.intValue());
                return dpR.c;
            }

            public final void c(boolean z2, Composer composer2, int i3) {
                int i4;
                if ((i3 & 14) == 0) {
                    i4 = i3 | (composer2.changed(z2) ? 4 : 2);
                } else {
                    i4 = i3;
                }
                if ((i4 & 91) != 18 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-953154314, i4, -1, "com.netflix.mediaclient.ui.profileviewingrestrictions.impl.SearchResults.<anonymous> (BlockedTitlesScreen.kt:166)");
                    }
                    if (z2) {
                        composer2.startReplaceableGroup(-27230839);
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.this, 0.0f, 1, null);
                        Alignment center = Alignment.Companion.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        drO<ComposeUiNode> constructor = companion2.getConstructor();
                        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
                        Updater.m1013setimpl(m1009constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        KU.c(null, null, null, 0.0f, composer2, 0, 15);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    } else if (dus.isEmpty()) {
                        composer2.startReplaceableGroup(-27230609);
                        Modifier modifier2 = Modifier.this;
                        String str2 = str;
                        composer2.startReplaceableGroup(-483455358);
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                        drO<ComposeUiNode> constructor2 = companion3.getConstructor();
                        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier2);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer m1009constructorimpl2 = Updater.m1009constructorimpl(composer2);
                        Updater.m1013setimpl(m1009constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m1013setimpl(m1009constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (m1009constructorimpl2.getInserting() || !C8632dsu.c(m1009constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m1009constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m1009constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        modifierMaterializerOf2.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        C1020Ln.c(str2, (Modifier) null, (Token.Color) null, (Theme) null, (Token.Typography) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (drM<? super TextLayoutResult, dpR>) null, composer2, 0, 0, 16382);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(-27230486);
                        KH.e(null, null, null, null, composer2, 0, 15);
                        Modifier modifier3 = Modifier.this;
                        final duS<InterfaceC5278bvj> dus2 = dus;
                        final drM<InterfaceC5278bvj, dpR> drm2 = drm;
                        LazyDslKt.LazyColumn(modifier3, null, null, false, null, null, null, false, new drM<LazyListScope, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesScreenKt$SearchResults$1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* synthetic */ dpR invoke(LazyListScope lazyListScope) {
                                b(lazyListScope);
                                return dpR.c;
                            }

                            public final void b(LazyListScope lazyListScope) {
                                C8632dsu.c((Object) lazyListScope, "");
                                int size = dus2.size();
                                final drM<InterfaceC5278bvj, dpR> drm3 = drm2;
                                final duS<InterfaceC5278bvj> dus3 = dus2;
                                LazyListScope.items$default(lazyListScope, size, null, null, ComposableLambdaKt.composableLambdaInstance(-1205015113, true, new InterfaceC8613dsb<LazyItemScope, Integer, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesScreenKt.SearchResults.1.3.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(4);
                                    }

                                    @Override // o.InterfaceC8613dsb
                                    public /* synthetic */ dpR invoke(LazyItemScope lazyItemScope, Integer num, Composer composer3, Integer num2) {
                                        e(lazyItemScope, num.intValue(), composer3, num2.intValue());
                                        return dpR.c;
                                    }

                                    public final void e(LazyItemScope lazyItemScope, final int i5, Composer composer3, int i6) {
                                        int i7;
                                        C8632dsu.c((Object) lazyItemScope, "");
                                        if ((i6 & 112) == 0) {
                                            i7 = i6 | (composer3.changed(i5) ? 32 : 16);
                                        } else {
                                            i7 = i6;
                                        }
                                        if ((i7 & 721) != 144 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1205015113, i7, -1, "com.netflix.mediaclient.ui.profileviewingrestrictions.impl.SearchResults.<anonymous>.<anonymous>.<anonymous> (BlockedTitlesScreen.kt:182)");
                                            }
                                            Modifier m273padding3ABfNKs = PaddingKt.m273padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m2492constructorimpl(12));
                                            final drM<InterfaceC5278bvj, dpR> drm4 = drm3;
                                            final duS<InterfaceC5278bvj> dus4 = dus3;
                                            Modifier m130clickableXHw0xAI$default = ClickableKt.m130clickableXHw0xAI$default(m273padding3ABfNKs, false, null, null, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesScreenKt.SearchResults.1.3.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(0);
                                                }

                                                @Override // o.drO
                                                public /* synthetic */ dpR invoke() {
                                                    d();
                                                    return dpR.c;
                                                }

                                                public final void d() {
                                                    drm4.invoke(dus4.get(i5));
                                                }
                                            }, 7, null);
                                            duS<InterfaceC5278bvj> dus5 = dus3;
                                            composer3.startReplaceableGroup(693286680);
                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer3, 0);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                                            drO<ComposeUiNode> constructor3 = companion4.getConstructor();
                                            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m130clickableXHw0xAI$default);
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor3);
                                            } else {
                                                composer3.useNode();
                                            }
                                            Composer m1009constructorimpl3 = Updater.m1009constructorimpl(composer3);
                                            Updater.m1013setimpl(m1009constructorimpl3, rowMeasurePolicy, companion4.getSetMeasurePolicy());
                                            Updater.m1013setimpl(m1009constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                                            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                                            if (m1009constructorimpl3.getInserting() || !C8632dsu.c(m1009constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                m1009constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                m1009constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            modifierMaterializerOf3.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            String title = dus5.get(i5).getTitle();
                                            C8632dsu.a(title, "");
                                            C1020Ln.c(title, (Modifier) null, (Token.Color) null, (Theme) null, (Token.Typography) Token.Typography.C0694g.e, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (drM<? super TextLayoutResult, dpR>) null, composer3, 24576, 0, 16366);
                                            composer3.endReplaceableGroup();
                                            composer3.endNode();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            KH.e(null, null, null, null, composer3, 0, 15);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), 6, null);
                            }
                        }, composer2, 0, 254);
                        composer2.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, ((i >> 6) & 14) | 27648, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesScreenKt$SearchResults$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void c(Composer composer2, int i3) {
                    C5991cPy.d(str, dus, z, drm, companion, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    c(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final o.duS<o.C5987cPu> r35, final java.lang.String r36, final java.lang.String r37, final boolean r38, final o.drO<o.dpR> r39, final java.lang.String r40, final java.lang.String r41, final o.drM<? super java.lang.String, o.dpR> r42, androidx.compose.ui.Modifier r43, androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 1111
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5991cPy.e(o.duS, java.lang.String, java.lang.String, boolean, o.drO, java.lang.String, java.lang.String, o.drM, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final List<InterfaceC5278bvj> c(State<? extends List<? extends InterfaceC5278bvj>> state) {
        return (List) state.getValue();
    }

    private static final List<C5987cPu> b(State<? extends List<C5987cPu>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(MutableState<String> mutableState, String str) {
        mutableState.setValue(str);
    }

    private static final boolean e(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }
}
