package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class CoreTextFieldKt {
    public static final boolean isWindowFocusedBehindFlag(WindowInfo windowInfo) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:256:0x041d, code lost:
        if (r9 == null) goto L158;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0389 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0672 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:318:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012f  */
    /* JADX WARN: Type inference failed for: r0v31, types: [androidx.compose.ui.Modifier] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CoreTextField(final androidx.compose.ui.text.input.TextFieldValue r47, final o.drM<? super androidx.compose.ui.text.input.TextFieldValue, o.dpR> r48, androidx.compose.ui.Modifier r49, androidx.compose.ui.text.TextStyle r50, androidx.compose.ui.text.input.VisualTransformation r51, o.drM<? super androidx.compose.ui.text.TextLayoutResult, o.dpR> r52, androidx.compose.foundation.interaction.MutableInteractionSource r53, androidx.compose.ui.graphics.Brush r54, boolean r55, int r56, int r57, androidx.compose.ui.text.input.ImeOptions r58, androidx.compose.foundation.text.KeyboardActions r59, boolean r60, boolean r61, o.InterfaceC8612dsa<? super o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r62, androidx.compose.runtime.Composer r63, final int r64, final int r65, final int r66) {
        /*
            Method dump skipped, instructions count: 1986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(androidx.compose.ui.text.input.TextFieldValue, o.drM, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.input.VisualTransformation, o.drM, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, boolean, int, int, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.text.KeyboardActions, boolean, boolean, o.dsa, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CoreTextFieldRootBox(final Modifier modifier, final TextFieldSelectionManager textFieldSelectionManager, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-20551815);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-20551815, i, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:746)");
        }
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        drO<ComposeUiNode> constructor = companion.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
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
        Updater.m1013setimpl(m1009constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-1985516685);
        drx.invoke(startRestartGroup, Integer.valueOf(((((i >> 3) & 112) | 8) >> 3) & 14));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextFieldRootBox$2
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

                public final void invoke(Composer composer2, int i2) {
                    CoreTextFieldKt.CoreTextFieldRootBox(Modifier.this, textFieldSelectionManager, drx, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final Modifier previewKeyEventToDeselectOnBack(Modifier modifier, final TextFieldState textFieldState, final TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new drM<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$previewKeyEventToDeselectOnBack$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m412invokeZmokQxo(keyEvent.m1649unboximpl());
            }

            /* renamed from: invoke-ZmokQxo  reason: not valid java name */
            public final Boolean m412invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z;
                if (TextFieldState.this.getHandleState() == HandleState.Selection && KeyEventHelpers_androidKt.m414cancelsTextSelectionZmokQxo(keyEvent)) {
                    z = true;
                    TextFieldSelectionManager.m538deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tapToFocus(TextFieldState textFieldState, FocusRequester focusRequester, boolean z) {
        SoftwareKeyboardController keyboardController;
        if (!textFieldState.getHasFocus()) {
            focusRequester.requestFocus();
        } else if (!z || (keyboardController = textFieldState.getKeyboardController()) == null) {
        } else {
            keyboardController.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startInputSession(TextInputService textInputService, TextFieldState textFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        textFieldState.setInputSession(TextFieldDelegate.Companion.onFocus$foundation_release(textInputService, textFieldValue, textFieldState.getProcessor(), imeOptions, textFieldState.getOnValueChange(), textFieldState.getOnImeActionPerformed()));
        notifyFocusedRect(textFieldState, textFieldValue, offsetMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endInputSession(TextFieldState textFieldState) {
        TextInputSession inputSession = textFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.Companion.onBlur$foundation_release(inputSession, textFieldState.getProcessor(), textFieldState.getOnValueChange());
        }
        textFieldState.setInputSession(null);
    }

    public static final Object bringSelectionEndIntoView(BringIntoViewRequester bringIntoViewRequester, TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Rect rect;
        Object e;
        int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m2154getMaximpl(textFieldValue.m2302getSelectiond9O1mEE()));
        if (originalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed);
        } else if (originalToTransformed != 0) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed - 1);
        } else {
            rect = new Rect(0.0f, 0.0f, 1.0f, IntSize.m2546getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
        }
        Object bringIntoView = bringIntoViewRequester.bringIntoView(rect, interfaceC8585dra);
        e = C8586drb.e();
        return bringIntoView == e ? bringIntoView : dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
        if ((!(r2 != null ? r2.isLayoutResultStale() : true)) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SelectionToolbarAndHandles(final androidx.compose.foundation.text.selection.TextFieldSelectionManager r7, final boolean r8, androidx.compose.runtime.Composer r9, final int r10) {
        /*
            r0 = 626339208(0x25552d88, float:1.8490232E-16)
            androidx.compose.runtime.Composer r9 = r9.startRestartGroup(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L13
            r1 = -1
            java.lang.String r2 = "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1082)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r10, r1, r2)
        L13:
            if (r8 == 0) goto Lcd
            androidx.compose.foundation.text.TextFieldState r0 = r7.getState$foundation_release()
            r1 = 1
            if (r0 == 0) goto L38
            androidx.compose.foundation.text.TextLayoutResultProxy r0 = r0.getLayoutResult()
            if (r0 == 0) goto L38
            androidx.compose.ui.text.TextLayoutResult r0 = r0.getValue()
            if (r0 == 0) goto L38
            androidx.compose.foundation.text.TextFieldState r2 = r7.getState$foundation_release()
            if (r2 == 0) goto L33
            boolean r2 = r2.isLayoutResultStale()
            goto L34
        L33:
            r2 = r1
        L34:
            r2 = r2 ^ r1
            if (r2 == 0) goto L38
            goto L39
        L38:
            r0 = 0
        L39:
            if (r0 != 0) goto L3d
            goto Ld0
        L3d:
            androidx.compose.ui.text.input.TextFieldValue r2 = r7.getValue$foundation_release()
            long r2 = r2.m2302getSelectiond9O1mEE()
            boolean r2 = androidx.compose.ui.text.TextRange.m2151getCollapsedimpl(r2)
            r3 = 0
            if (r2 != 0) goto Laa
            androidx.compose.ui.text.input.OffsetMapping r2 = r7.getOffsetMapping$foundation_release()
            androidx.compose.ui.text.input.TextFieldValue r4 = r7.getValue$foundation_release()
            long r4 = r4.m2302getSelectiond9O1mEE()
            int r4 = androidx.compose.ui.text.TextRange.m2157getStartimpl(r4)
            int r2 = r2.originalToTransformed(r4)
            androidx.compose.ui.text.input.OffsetMapping r4 = r7.getOffsetMapping$foundation_release()
            androidx.compose.ui.text.input.TextFieldValue r5 = r7.getValue$foundation_release()
            long r5 = r5.m2302getSelectiond9O1mEE()
            int r5 = androidx.compose.ui.text.TextRange.m2152getEndimpl(r5)
            int r4 = r4.originalToTransformed(r5)
            androidx.compose.ui.text.style.ResolvedTextDirection r2 = r0.getBidiRunDirection(r2)
            int r4 = r4 - r1
            int r4 = java.lang.Math.max(r4, r3)
            androidx.compose.ui.text.style.ResolvedTextDirection r0 = r0.getBidiRunDirection(r4)
            r4 = -498386751(0xffffffffe24b38c1, float:-9.3719465E20)
            r9.startReplaceableGroup(r4)
            androidx.compose.foundation.text.TextFieldState r4 = r7.getState$foundation_release()
            r5 = 518(0x206, float:7.26E-43)
            if (r4 == 0) goto L98
            boolean r4 = r4.getShowSelectionHandleStart()
            if (r4 != r1) goto L98
            androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.TextFieldSelectionHandle(r1, r2, r7, r9, r5)
        L98:
            r9.endReplaceableGroup()
            androidx.compose.foundation.text.TextFieldState r2 = r7.getState$foundation_release()
            if (r2 == 0) goto Laa
            boolean r2 = r2.getShowSelectionHandleEnd()
            if (r2 != r1) goto Laa
            androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.TextFieldSelectionHandle(r3, r0, r7, r9, r5)
        Laa:
            androidx.compose.foundation.text.TextFieldState r0 = r7.getState$foundation_release()
            if (r0 == 0) goto Ld0
            boolean r1 = r7.isTextChanged$foundation_release()
            if (r1 == 0) goto Lb9
            r0.setShowFloatingToolbar(r3)
        Lb9:
            boolean r1 = r0.getHasFocus()
            if (r1 == 0) goto Ld0
            boolean r0 = r0.getShowFloatingToolbar()
            if (r0 == 0) goto Lc9
            r7.showSelectionToolbar$foundation_release()
            goto Ld0
        Lc9:
            r7.hideSelectionToolbar$foundation_release()
            goto Ld0
        Lcd:
            r7.hideSelectionToolbar$foundation_release()
        Ld0:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto Ld9
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Ld9:
            androidx.compose.runtime.ScopeUpdateScope r9 = r9.endRestartGroup()
            if (r9 == 0) goto Le7
            androidx.compose.foundation.text.CoreTextFieldKt$SelectionToolbarAndHandles$2 r0 = new androidx.compose.foundation.text.CoreTextFieldKt$SelectionToolbarAndHandles$2
            r0.<init>()
            r9.updateScope(r0)
        Le7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.SelectionToolbarAndHandles(androidx.compose.foundation.text.selection.TextFieldSelectionManager, boolean, androidx.compose.runtime.Composer, int):void");
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionManager textFieldSelectionManager, Composer composer, final int i) {
        AnnotatedString transformedText$foundation_release;
        Composer startRestartGroup = composer.startRestartGroup(-1436003720);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1436003720, i, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1125)");
        }
        TextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
        if (state$foundation_release != null && state$foundation_release.getShowCursorHandle() && (transformedText$foundation_release = textFieldSelectionManager.getTransformedText$foundation_release()) != null && transformedText$foundation_release.length() > 0) {
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(textFieldSelectionManager);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = textFieldSelectionManager.cursorDragObserver$foundation_release();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
            final long m543getCursorPositiontuRUvjQ$foundation_release = textFieldSelectionManager.m543getCursorPositiontuRUvjQ$foundation_release((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity()));
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, textDragObserver, new CoreTextFieldKt$TextFieldCursorHandle$1(textDragObserver, textFieldSelectionManager, null));
            startRestartGroup.startReplaceableGroup(-272875135);
            boolean changed2 = startRestartGroup.changed(m543getCursorPositiontuRUvjQ$foundation_release);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new drM<SemanticsPropertyReceiver, dpR>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* bridge */ /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return dpR.c;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        semanticsPropertyReceiver.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(Handle.Cursor, m543getCursorPositiontuRUvjQ$foundation_release, SelectionHandleAnchor.Middle, true, null));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            AndroidCursorHandle_androidKt.m402CursorHandleULxng0E(m543getCursorPositiontuRUvjQ$foundation_release, SemanticsModifierKt.semantics$default(pointerInput, false, (drM) rememberedValue2, 1, null), null, startRestartGroup, 384);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$3
                /* JADX INFO: Access modifiers changed from: package-private */
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
                    CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyFocusedRect(TextFieldState textFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
            if (layoutResult == null) {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                return;
            }
            TextInputSession inputSession = textFieldState.getInputSession();
            if (inputSession == null) {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                return;
            }
            LayoutCoordinates layoutCoordinates = textFieldState.getLayoutCoordinates();
            if (layoutCoordinates == null) {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                return;
            }
            TextFieldDelegate.Companion.notifyFocusedRect$foundation_release(textFieldValue, textFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, textFieldState.getHasFocus(), offsetMapping);
            dpR dpr = dpR.c;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CoreTextField$lambda$8(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
