package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.text.TextStyle;
import o.dpR;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class TextKt {
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new drO<TextStyle>() { // from class: androidx.compose.material.TextKt$LocalTextStyle$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drO
        public final TextStyle invoke() {
            return TypographyKt.getDefaultTextStyle();
        }
    });

    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    /* JADX WARN: Removed duplicated region for block: B:304:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:555:? A[RETURN, SYNTHETIC] */
    /* renamed from: Text--4IGK_g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m696Text4IGK_g(final java.lang.String r68, androidx.compose.ui.Modifier r69, long r70, long r72, androidx.compose.ui.text.font.FontStyle r74, androidx.compose.ui.text.font.FontWeight r75, androidx.compose.ui.text.font.FontFamily r76, long r77, androidx.compose.ui.text.style.TextDecoration r79, androidx.compose.ui.text.style.TextAlign r80, long r81, int r83, boolean r84, int r85, int r86, o.drM<? super androidx.compose.ui.text.TextLayoutResult, o.dpR> r87, androidx.compose.ui.text.TextStyle r88, androidx.compose.runtime.Composer r89, final int r90, final int r91, final int r92) {
        /*
            Method dump skipped, instructions count: 1157
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m696Text4IGK_g(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, o.drM, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:497:? A[RETURN, SYNTHETIC] */
    /* renamed from: Text-fLXpl1I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m698TextfLXpl1I(final java.lang.String r54, androidx.compose.ui.Modifier r55, long r56, long r58, androidx.compose.ui.text.font.FontStyle r60, androidx.compose.ui.text.font.FontWeight r61, androidx.compose.ui.text.font.FontFamily r62, long r63, androidx.compose.ui.text.style.TextDecoration r65, androidx.compose.ui.text.style.TextAlign r66, long r67, int r69, boolean r70, int r71, o.drM r72, androidx.compose.ui.text.TextStyle r73, androidx.compose.runtime.Composer r74, final int r75, final int r76, final int r77) {
        /*
            Method dump skipped, instructions count: 983
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m698TextfLXpl1I(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, o.drM, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:313:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:573:? A[RETURN, SYNTHETIC] */
    /* renamed from: Text-IbK3jfQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m697TextIbK3jfQ(final androidx.compose.ui.text.AnnotatedString r71, androidx.compose.ui.Modifier r72, long r73, long r75, androidx.compose.ui.text.font.FontStyle r77, androidx.compose.ui.text.font.FontWeight r78, androidx.compose.ui.text.font.FontFamily r79, long r80, androidx.compose.ui.text.style.TextDecoration r82, androidx.compose.ui.text.style.TextAlign r83, long r84, int r86, boolean r87, int r88, int r89, java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r90, o.drM<? super androidx.compose.ui.text.TextLayoutResult, o.dpR> r91, androidx.compose.ui.text.TextStyle r92, androidx.compose.runtime.Composer r93, final int r94, final int r95, final int r96) {
        /*
            Method dump skipped, instructions count: 1195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m697TextIbK3jfQ(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, java.util.Map, o.drM, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void ProvideTextStyle(final TextStyle textStyle, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1772272796);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(textStyle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(drx) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1772272796, i2, -1, "androidx.compose.material.ProvideTextStyle (Text.kt:393)");
            }
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal.provides(((TextStyle) startRestartGroup.consume(providableCompositionLocal)).merge(textStyle)), drx, startRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material.TextKt$ProvideTextStyle$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i3) {
                    TextKt.ProvideTextStyle(TextStyle.this, drx, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
