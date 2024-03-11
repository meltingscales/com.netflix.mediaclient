package o;

import android.net.Uri;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import o.C0890Gn;
import o.FO;
import o.dpR;

/* renamed from: o.Gn  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0890Gn {
    public static final void e(final FO fo, Modifier modifier, Composer composer, final int i, final int i2) {
        String uri;
        Modifier m300width3ABfNKs;
        C8632dsu.c((Object) fo, "");
        Composer startRestartGroup = composer.startRestartGroup(-816342856);
        final Modifier.Companion companion = (i2 & 2) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-816342856, i, -1, "com.netflix.clcs.ui.ClcsImage (ClcsImage.kt:18)");
        }
        FR<FO.b> a = fo.a();
        startRestartGroup.startReplaceableGroup(1016830523);
        FO.b e = a == null ? null : a.e(startRestartGroup, 8);
        startRestartGroup.endReplaceableGroup();
        if (e == null && (e = fo.e()) == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.clcs.ui.ClcsImageKt$ClcsImage$properties$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void e(Composer composer2, int i3) {
                        C0890Gn.e(FO.this, companion, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }

                    @Override // o.drX
                    public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                        e(composer2, num.intValue());
                        return dpR.c;
                    }
                });
                return;
            }
            return;
        }
        Uri d = e.d();
        if (d == null || (uri = d.toString()) == null) {
            final Modifier modifier2 = companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
            if (endRestartGroup2 != null) {
                endRestartGroup2.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.clcs.ui.ClcsImageKt$ClcsImage$url$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(Composer composer2, int i3) {
                        C0890Gn.e(FO.this, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }

                    @Override // o.drX
                    public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                        a(composer2, num.intValue());
                        return dpR.c;
                    }
                });
                return;
            }
            return;
        }
        String c = fo.c();
        ContentScale crop = ContentScale.Companion.getCrop();
        if (e.e() != null && e.a() != null) {
            m300width3ABfNKs = AspectRatioKt.aspectRatio$default(SizeKt.m290heightInVpY3zN4$default(SizeKt.m302widthInVpY3zN4$default(companion, 0.0f, androidx.compose.ui.unit.Dp.m2492constructorimpl(e.e().intValue()), 1, null), 0.0f, androidx.compose.ui.unit.Dp.m2492constructorimpl(e.a().intValue()), 1, null), e.e().intValue() / e.a().intValue(), false, 2, null);
        } else if (e.a() != null) {
            m300width3ABfNKs = SizeKt.m288height3ABfNKs(companion, androidx.compose.ui.unit.Dp.m2492constructorimpl(e.a().intValue()));
        } else {
            m300width3ABfNKs = e.e() != null ? SizeKt.m300width3ABfNKs(companion, androidx.compose.ui.unit.Dp.m2492constructorimpl(e.e().intValue())) : companion;
        }
        Modifier modifier3 = m300width3ABfNKs;
        final Modifier modifier4 = companion;
        KM.d(uri, c, modifier3, null, null, null, null, crop, 0.0f, null, 0, startRestartGroup, 12582912, 0, 1912);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup3 = startRestartGroup.endRestartGroup();
        if (endRestartGroup3 != null) {
            endRestartGroup3.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.clcs.ui.ClcsImageKt$ClcsImage$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void d(Composer composer2, int i3) {
                    C0890Gn.e(FO.this, modifier4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    d(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
