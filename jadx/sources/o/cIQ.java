package o;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Token;
import o.LA;
import o.cIQ;
import o.dpR;

/* loaded from: classes4.dex */
public final class cIQ {
    public static final void e(final String str, final HawkinsIcon hawkinsIcon, Modifier modifier, drO<dpR> dro, Composer composer, final int i, final int i2) {
        int i3;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) hawkinsIcon, "");
        Composer startRestartGroup = composer.startRestartGroup(-512433407);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(hawkinsIcon) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? JSONzip.end : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(dro) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (i5 != 0) {
                dro = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.ButtonsKt$PlayerTopBarButton$1
                    public final void a() {
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        a();
                        return dpR.c;
                    }
                };
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-512433407, i3, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerTopBarButton (Buttons.kt:31)");
            }
            cIU ciu = cIU.d;
            IconButtonKt.IconButton(dro, SizeKt.m288height3ABfNKs(SizeKt.m300width3ABfNKs(modifier, ciu.b()), ciu.c()), false, null, ComposableLambdaKt.composableLambda(startRestartGroup, 979453413, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.ButtonsKt$PlayerTopBarButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    a(composer2, num.intValue());
                    return dpR.c;
                }

                public final void a(Composer composer2, int i6) {
                    if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(979453413, i6, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerTopBarButton.<anonymous> (Buttons.kt:39)");
                        }
                        IconKt.m610Iconww6aTOc(PainterResources_androidKt.painterResource(HawkinsIcon.this.i(), composer2, 0), str, (Modifier) null, LA.e(Token.Color.cW.c), composer2, 8, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, ((i3 >> 9) & 14) | 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final drO<dpR> dro2 = dro;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.ButtonsKt$PlayerTopBarButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void e(Composer composer2, int i6) {
                    cIQ.e(str, hawkinsIcon, modifier2, dro2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    e(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    public static final void b(final String str, final int i, Modifier modifier, drO<dpR> dro, Composer composer, final int i2, final int i3) {
        int i4;
        C8632dsu.c((Object) str, "");
        Composer startRestartGroup = composer.startRestartGroup(-980055412);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? JSONzip.end : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            i4 |= startRestartGroup.changedInstance(dro) ? 2048 : 1024;
        }
        if ((i4 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (i5 != 0) {
                modifier = Modifier.Companion;
            }
            if (i6 != 0) {
                dro = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.ButtonsKt$PlayerTopBarButton$4
                    public final void b() {
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        b();
                        return dpR.c;
                    }
                };
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-980055412, i4, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerTopBarButton (Buttons.kt:54)");
            }
            cIU ciu = cIU.d;
            IconButtonKt.IconButton(dro, SizeKt.m288height3ABfNKs(SizeKt.m300width3ABfNKs(modifier, ciu.b()), ciu.c()), false, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1904930448, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.ButtonsKt$PlayerTopBarButton$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    e(composer2, num.intValue());
                    return dpR.c;
                }

                public final void e(Composer composer2, int i7) {
                    if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1904930448, i7, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerTopBarButton.<anonymous> (Buttons.kt:62)");
                        }
                        IconKt.m610Iconww6aTOc(PainterResources_androidKt.painterResource(i, composer2, 0), str, (Modifier) null, LA.e(Token.Color.cW.c), composer2, 8, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, ((i4 >> 9) & 14) | 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final drO<dpR> dro2 = dro;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.ButtonsKt$PlayerTopBarButton$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void e(Composer composer2, int i7) {
                    cIQ.b(str, i, modifier2, dro2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    e(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    public static final void d(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1243673038);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1243673038, i3, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerTopBarSpacerButton (Buttons.kt:73)");
            }
            cIU ciu = cIU.d;
            SpacerKt.Spacer(SizeKt.m288height3ABfNKs(SizeKt.m300width3ABfNKs(modifier, ciu.b()), ciu.c()), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.ButtonsKt$PlayerTopBarSpacerButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void c(Composer composer2, int i5) {
                    cIQ.d(Modifier.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    c(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final java.lang.String r29, final java.lang.String r30, final com.netflix.hawkins.consumer.icons.HawkinsIcon r31, final boolean r32, androidx.compose.ui.Modifier r33, o.drO<o.dpR> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cIQ.c(java.lang.String, java.lang.String, com.netflix.hawkins.consumer.icons.HawkinsIcon, boolean, androidx.compose.ui.Modifier, o.drO, androidx.compose.runtime.Composer, int, int):void");
    }
}
