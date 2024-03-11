package com.netflix.mediaclient.ui.login;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.discrete.Closed;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.hawkins.consumer.component.button.HawkinsButtonType;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.ui.R;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.AbstractC6316cax;
import o.C1013Lg;
import o.C1020Ln;
import o.C1333Xq;
import o.C6283caQ;
import o.C8126deW;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.KF;
import o.LA;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class OneTimePasscodeChoiceFragmentAb54131 extends AbstractC6316cax {
    public static final b a = new b(null);
    public static final int b = 8;
    public String c;
    private Long d;
    public String e;
    @Inject
    public C6283caQ loginOtpDelegate;

    public final void a(String str) {
        C8632dsu.c((Object) str, "");
        this.e = str;
    }

    public final void c(String str) {
        C8632dsu.c((Object) str, "");
        this.c = str;
    }

    public final C6283caQ b() {
        C6283caQ c6283caQ = this.loginOtpDelegate;
        if (c6283caQ != null) {
            return c6283caQ;
        }
        C8632dsu.d("");
        return null;
    }

    public final String g() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        C8632dsu.d("");
        return null;
    }

    public final String i() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("modeArgumentKey") : null;
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        c(string);
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("userLoginIdKey") : null;
        if (string2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        a(string2);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ViewParent parent = requireView().getParent();
        C8632dsu.d(parent);
        BottomSheetBehavior from = BottomSheetBehavior.from((View) parent);
        C8632dsu.a(from, "");
        from.setState(3);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.d = Logger.INSTANCE.startSession(new Presentation(AppView.loginOptions, null));
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.DisposeOnLifecycleDestroyed(viewLifecycleOwner));
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(154562111, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePasscodeChoiceFragmentAb54131$onCreateView$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return dpR.c;
            }

            public final void b(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(154562111, i, -1, "com.netflix.mediaclient.ui.login.OneTimePasscodeChoiceFragmentAb54131.onCreateView.<anonymous>.<anonymous> (OneTimePasscodeChoiceFragmentAb54131.kt:76)");
                    }
                    Modifier m110backgroundbw27NRU$default = BackgroundKt.m110backgroundbw27NRU$default(Modifier.Companion, LA.e(Token.Color.A.e), null, 2, null);
                    final OneTimePasscodeChoiceFragmentAb54131 oneTimePasscodeChoiceFragmentAb54131 = OneTimePasscodeChoiceFragmentAb54131.this;
                    composer.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    drO<ComposeUiNode> constructor = companion.getConstructor();
                    InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m110backgroundbw27NRU$default);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer m1009constructorimpl = Updater.m1009constructorimpl(composer);
                    Updater.m1013setimpl(m1009constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    C1013Lg.a(null, null, "", TextAlign.Companion.m2417getCentere0LSkKk(), 0, 0, true, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePasscodeChoiceFragmentAb54131$onCreateView$1$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(0);
                        }

                        @Override // o.drO
                        public /* synthetic */ dpR invoke() {
                            d();
                            return dpR.c;
                        }

                        public final void d() {
                            OneTimePasscodeChoiceFragmentAb54131.this.dismiss();
                        }
                    }, ComposableLambdaKt.composableLambda(composer, -377314440, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePasscodeChoiceFragmentAb54131$onCreateView$1$1$1$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(2);
                        }

                        public final void a(Composer composer2, int i2) {
                            if ((i2 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-377314440, i2, -1, "com.netflix.mediaclient.ui.login.OneTimePasscodeChoiceFragmentAb54131.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OneTimePasscodeChoiceFragmentAb54131.kt:85)");
                            }
                            OneTimePasscodeChoiceFragmentAb54131.this.b(null, composer2, 64, 1);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // o.drX
                        public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                            a(composer2, num.intValue());
                            return dpR.c;
                        }
                    }), composer, 102236544, 51);
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Logger.INSTANCE.endSession(this.d);
        b().c();
        super.onDestroyView();
    }

    public final void b(Modifier modifier, Composer composer, final int i, final int i2) {
        String c;
        Composer startRestartGroup = composer.startRestartGroup(-279408863);
        Modifier.Companion companion = (i2 & 1) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-279408863, i, -1, "com.netflix.mediaclient.ui.login.OneTimePasscodeChoiceFragmentAb54131.LoginOptions (OneTimePasscodeChoiceFragmentAb54131.kt:100)");
        }
        startRestartGroup.startReplaceableGroup(-1736427078);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        drO<ComposeUiNode> constructor = companion2.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
        Updater.m1013setimpl(m1009constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        String string = getString(R.o.av);
        TextAlign.Companion companion3 = TextAlign.Companion;
        int m2417getCentere0LSkKk = companion3.m2417getCentere0LSkKk();
        Token.Typography.C0686af c0686af = Token.Typography.C0686af.d;
        C8632dsu.d((Object) string);
        final Modifier modifier2 = companion;
        C1020Ln.c(string, (Modifier) null, (Token.Color) null, (Theme) null, (Token.Typography) c0686af, 0L, (TextDecoration) null, TextAlign.m2410boximpl(m2417getCentere0LSkKk), 0L, 0, false, 0, 0, (drM<? super TextLayoutResult, dpR>) null, startRestartGroup, 24576, 0, 16238);
        Modifier.Companion companion4 = Modifier.Companion;
        SpacerKt.Spacer(SizeKt.m288height3ABfNKs(companion4, Dp.m2492constructorimpl(16)), startRestartGroup, 6);
        if (C8126deW.b(i())) {
            c = C1333Xq.d(R.o.as).d(SignupConstants.Field.PHONE_NUMBER, i()).c();
        } else {
            c = C1333Xq.d(R.o.ar).d(SignupConstants.Field.EMAIL, i()).c();
        }
        String str = c;
        int m2417getCentere0LSkKk2 = companion3.m2417getCentere0LSkKk();
        Token.Typography.C0694g c0694g = Token.Typography.C0694g.e;
        Token.Color.C0499df c0499df = Token.Color.C0499df.d;
        C8632dsu.d((Object) str);
        C1020Ln.c(str, (Modifier) null, (Token.Color) c0499df, (Theme) null, (Token.Typography) c0694g, 0L, (TextDecoration) null, TextAlign.m2410boximpl(m2417getCentere0LSkKk2), 0L, 0, false, 0, 0, (drM<? super TextLayoutResult, dpR>) null, startRestartGroup, 24960, 0, 16234);
        SpacerKt.Spacer(SizeKt.m288height3ABfNKs(companion4, Dp.m2492constructorimpl(36)), startRestartGroup, 6);
        Modifier testTag = TestTagKt.testTag(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), "send_code");
        String string2 = getString(R.o.lm);
        HawkinsButtonType hawkinsButtonType = HawkinsButtonType.c;
        boolean c2 = c(mutableState);
        C8632dsu.d((Object) string2);
        KF.a(hawkinsButtonType, string2, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePasscodeChoiceFragmentAb54131$LoginOptions$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                c();
                return dpR.c;
            }

            public final void c() {
                OneTimePasscodeChoiceFragmentAb54131.c(mutableState, true);
                C6283caQ b2 = OneTimePasscodeChoiceFragmentAb54131.this.b();
                String g = OneTimePasscodeChoiceFragmentAb54131.this.g();
                final OneTimePasscodeChoiceFragmentAb54131 oneTimePasscodeChoiceFragmentAb54131 = OneTimePasscodeChoiceFragmentAb54131.this;
                final MutableState<Boolean> mutableState2 = mutableState;
                drM<StatusCode, dpR> drm = new drM<StatusCode, dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePasscodeChoiceFragmentAb54131$LoginOptions$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(StatusCode statusCode) {
                        a(statusCode);
                        return dpR.c;
                    }

                    public final void a(StatusCode statusCode) {
                        C8632dsu.c((Object) statusCode, "");
                        OneTimePasscodeChoiceFragmentAb54131.c(mutableState2, false);
                        C6283caQ.e(OneTimePasscodeChoiceFragmentAb54131.this.b(), statusCode, null, 2, null);
                        OneTimePasscodeChoiceFragmentAb54131.this.j();
                    }
                };
                final OneTimePasscodeChoiceFragmentAb54131 oneTimePasscodeChoiceFragmentAb541312 = OneTimePasscodeChoiceFragmentAb54131.this;
                final MutableState<Boolean> mutableState3 = mutableState;
                C6283caQ.e(b2, g, null, null, null, drm, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePasscodeChoiceFragmentAb54131$LoginOptions$1$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        a();
                        return dpR.c;
                    }

                    public final void a() {
                        OneTimePasscodeChoiceFragmentAb54131.c(mutableState3, false);
                        OneTimePasscodeChoiceFragmentAb54131.this.j();
                    }
                }, 14, null);
            }
        }, testTag, null, null, !c2, startRestartGroup, 3078, 48);
        SpacerKt.Spacer(SizeKt.m288height3ABfNKs(companion4, Dp.m2492constructorimpl(12)), startRestartGroup, 6);
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
        String string3 = getString(R.o.gC);
        HawkinsButtonType hawkinsButtonType2 = HawkinsButtonType.d;
        boolean c3 = c(mutableState);
        C8632dsu.d((Object) string3);
        KF.a(hawkinsButtonType2, string3, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePasscodeChoiceFragmentAb54131$LoginOptions$1$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                b();
                return dpR.c;
            }

            public final void b() {
                OneTimePasscodeChoiceFragmentAb54131.c(mutableState, true);
                C6283caQ b2 = OneTimePasscodeChoiceFragmentAb54131.this.b();
                String g = OneTimePasscodeChoiceFragmentAb54131.this.g();
                final OneTimePasscodeChoiceFragmentAb54131 oneTimePasscodeChoiceFragmentAb54131 = OneTimePasscodeChoiceFragmentAb54131.this;
                final MutableState<Boolean> mutableState2 = mutableState;
                C6283caQ.c(b2, g, null, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePasscodeChoiceFragmentAb54131$LoginOptions$1$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        a();
                        return dpR.c;
                    }

                    public final void a() {
                        OneTimePasscodeChoiceFragmentAb54131.c(mutableState2, false);
                        OneTimePasscodeChoiceFragmentAb54131.this.j();
                    }
                }, 2, null);
            }
        }, fillMaxWidth$default, null, null, !c3, startRestartGroup, 3078, 48);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePasscodeChoiceFragmentAb54131$LoginOptions$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void c(Composer composer2, int i3) {
                    OneTimePasscodeChoiceFragmentAb54131.this.b(modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
    public final void j() {
        Logger.INSTANCE.logEvent(new Closed(AppView.loginOptions, null, CommandValue.DismissCommand, null));
        dismiss();
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    private static final boolean c(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }
}
