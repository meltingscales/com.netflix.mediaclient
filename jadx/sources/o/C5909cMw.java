package o;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.mediaclient.servicemgr.interface_.NotificationTypes;
import o.C5909cMw;
import o.C5950cOj;
import o.C8632dsu;
import o.LA;
import o.dpR;

/* renamed from: o.cMw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5909cMw {
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(androidx.compose.ui.Modifier r20, java.lang.String r21, o.drO<o.dpR> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5909cMw.d(androidx.compose.ui.Modifier, java.lang.String, o.drO, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final boolean z, final C5950cOj c5950cOj, final String str, final drO<dpR> dro, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1827805015);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(c5950cOj) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(str) ? JSONzip.end : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(dro) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1827805015, i2, -1, "com.netflix.mediaclient.ui.profiles.Notification (MyNetflixNotificationsManager.kt:368)");
            }
            float dimensionResource = PrimitiveResources_androidKt.dimensionResource(com.netflix.mediaclient.ui.R.b.v, startRestartGroup, 0);
            NotificationSummaryItem d = c5950cOj.d();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier.Companion companion = Modifier.Companion;
            String header = d.header();
            if (header == null) {
                header = "";
            }
            Modifier m277paddingqDBjuR0$default = PaddingKt.m277paddingqDBjuR0$default(ClickableKt.m130clickableXHw0xAI$default(companion, false, header, null, dro, 5, null), dimensionResource, 0.0f, dimensionResource, PrimitiveResources_androidKt.dimensionResource(com.netflix.mediaclient.ui.R.b.x, startRestartGroup, 0), 2, null);
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            drO<ComposeUiNode> constructor = companion2.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m277paddingqDBjuR0$default);
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
            Updater.m1013setimpl(m1009constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f = 12;
            Modifier m288height3ABfNKs = SizeKt.m288height3ABfNKs(SizeKt.m300width3ABfNKs(companion, androidx.compose.ui.unit.Dp.m2492constructorimpl(f)), androidx.compose.ui.unit.Dp.m2492constructorimpl(f));
            startRestartGroup.startReplaceableGroup(1842275034);
            boolean z2 = (i2 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new drM<DrawScope, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixNotificationsManagerKt$Notification$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(DrawScope drawScope) {
                        e(drawScope);
                        return dpR.c;
                    }

                    public final void e(DrawScope drawScope) {
                        C8632dsu.c((Object) drawScope, "");
                        if (z) {
                            return;
                        }
                        DrawScope.m1547drawCircleVaOC9Bg$default(drawScope, LA.e(Token.Color.gX.b), drawScope.mo193toPx0680j_4(Dp.m2492constructorimpl(2)), 0L, 0.0f, null, null, 0, 124, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(m288height3ABfNKs, (drM) rememberedValue, startRestartGroup, 6);
            d(c5950cOj, startRestartGroup, (i2 >> 3) & 14);
            b(d.header(), d.body(), str, startRestartGroup, i2 & 896, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixNotificationsManagerKt$Notification$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(Composer composer2, int i3) {
                    C5909cMw.b(z, c5950cOj, str, dro, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    b(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r46, java.lang.String r47, java.lang.String r48, androidx.compose.runtime.Composer r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5909cMw.b(java.lang.String, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final C5950cOj c5950cOj, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(690828827);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(c5950cOj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(690828827, i2, -1, "com.netflix.mediaclient.ui.profiles.NotificationImage (MyNetflixNotificationsManager.kt:432)");
            }
            NotificationSummaryItem d = c5950cOj.d();
            if (d.getNotificationType() == NotificationTypes.MULTI_TITLE_ALERT) {
                startRestartGroup.startReplaceableGroup(-1815537187);
                String imageUrl = d.imageUrl();
                b(imageUrl != null ? imageUrl : "", startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
                composer2 = startRestartGroup;
            } else {
                startRestartGroup.startReplaceableGroup(-1815537107);
                String imageUrl2 = d.imageUrl();
                composer2 = startRestartGroup;
                KM.d(imageUrl2 == null ? "" : imageUrl2, null, SizeKt.m288height3ABfNKs(SizeKt.m300width3ABfNKs(ClipKt.clip(Modifier.Companion, RoundedCornerShapeKt.m399RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m2492constructorimpl(4))), androidx.compose.ui.unit.Dp.m2492constructorimpl(128)), androidx.compose.ui.unit.Dp.m2492constructorimpl(72)), null, null, null, null, null, 0.0f, null, 0, startRestartGroup, 48, 0, 2040);
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixNotificationsManagerKt$NotificationImage$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(Composer composer3, int i3) {
                    C5909cMw.d(C5950cOj.this, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                    a(composer3, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-744155567);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-744155567, i2, -1, "com.netflix.mediaclient.ui.profiles.MultiTitleNotificationImage (MyNetflixNotificationsManager.kt:449)");
            }
            startRestartGroup.startReplaceableGroup(733328855);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
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
            Updater.m1013setimpl(m1009constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            CanvasKt.Canvas(SizeKt.m288height3ABfNKs(SizeKt.m300width3ABfNKs(companion, androidx.compose.ui.unit.Dp.m2492constructorimpl(128)), androidx.compose.ui.unit.Dp.m2492constructorimpl(72)), new drM<DrawScope, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixNotificationsManagerKt$MultiTitleNotificationImage$1$1
                @Override // o.drM
                public /* synthetic */ dpR invoke(DrawScope drawScope) {
                    d(drawScope);
                    return dpR.c;
                }

                public final void d(DrawScope drawScope) {
                    C8632dsu.c((Object) drawScope, "");
                    float f = 4;
                    float f2 = 112;
                    float f3 = 62;
                    float f4 = 16;
                    DrawScope.m1559drawRoundRectuAw5IA$default(drawScope, LA.e(Token.Color.C0508dp.c), OffsetKt.Offset(drawScope.mo193toPx0680j_4(Dp.m2492constructorimpl(f4)), drawScope.mo193toPx0680j_4(Dp.m2492constructorimpl(f4))), androidx.compose.ui.geometry.SizeKt.Size(drawScope.mo193toPx0680j_4(Dp.m2492constructorimpl(f2)), drawScope.mo193toPx0680j_4(Dp.m2492constructorimpl(f3))), CornerRadiusKt.CornerRadius$default(drawScope.mo193toPx0680j_4(Dp.m2492constructorimpl(f)), 0.0f, 2, null), null, 0.0f, null, 0, 240, null);
                    float f5 = 8;
                    DrawScope.m1559drawRoundRectuAw5IA$default(drawScope, LA.e(Token.Color.Cdo.e), OffsetKt.Offset(drawScope.mo193toPx0680j_4(Dp.m2492constructorimpl(f5)), drawScope.mo193toPx0680j_4(Dp.m2492constructorimpl(f5))), androidx.compose.ui.geometry.SizeKt.Size(drawScope.mo193toPx0680j_4(Dp.m2492constructorimpl(f2)), drawScope.mo193toPx0680j_4(Dp.m2492constructorimpl(f3))), CornerRadiusKt.CornerRadius$default(drawScope.mo193toPx0680j_4(Dp.m2492constructorimpl(f)), 0.0f, 2, null), null, 0.0f, null, 0, 240, null);
                }
            }, startRestartGroup, 54);
            composer2 = startRestartGroup;
            KM.d(str, null, SizeKt.m288height3ABfNKs(SizeKt.m300width3ABfNKs(ClipKt.clip(companion, RoundedCornerShapeKt.m399RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m2492constructorimpl(4))), androidx.compose.ui.unit.Dp.m2492constructorimpl(112)), androidx.compose.ui.unit.Dp.m2492constructorimpl(62)), null, null, null, null, null, 0.0f, null, 0, startRestartGroup, (i2 & 14) | 48, 0, 2040);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixNotificationsManagerKt$MultiTitleNotificationImage$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(Composer composer3, int i3) {
                    C5909cMw.b(str, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                    b(composer3, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
