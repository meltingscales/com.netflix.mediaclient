package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.List;
import kotlin.jvm.internal.Ref;
import o.C8566dqi;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;
import org.chromium.net.ConnectionSubtype;

/* loaded from: classes.dex */
public final class TextFieldKeyInput {
    private final boolean editable;
    private final int imeAction;
    private final DeadKeyCombiner keyCombiner;
    private final KeyMapping keyMapping;
    private final OffsetMapping offsetMapping;
    private final drM<TextFieldValue, dpR> onValueChange;
    private final TextPreparedSelectionState preparedSelectionState;
    private final TextFieldSelectionManager selectionManager;
    private final boolean singleLine;
    private final TextFieldState state;
    private final UndoManager undoManager;
    private final TextFieldValue value;

    public /* synthetic */ TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, drM drm, int i, C8627dsp c8627dsp) {
        this(textFieldState, textFieldSelectionManager, textFieldValue, z, z2, textPreparedSelectionState, offsetMapping, undoManager, deadKeyCombiner, keyMapping, drm, i);
    }

    public final TextFieldSelectionManager getSelectionManager() {
        return this.selectionManager;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final TextFieldState getState() {
        return this.state;
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, drM<? super TextFieldValue, dpR> drm, int i) {
        this.state = textFieldState;
        this.selectionManager = textFieldSelectionManager;
        this.value = textFieldValue;
        this.editable = z;
        this.singleLine = z2;
        this.preparedSelectionState = textPreparedSelectionState;
        this.offsetMapping = offsetMapping;
        this.undoManager = undoManager;
        this.keyCombiner = deadKeyCombiner;
        this.keyMapping = keyMapping;
        this.onValueChange = drm;
        this.imeAction = i;
    }

    public /* synthetic */ TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, drM drm, int i, int i2, C8627dsp c8627dsp) {
        this(textFieldState, textFieldSelectionManager, (i2 & 4) != 0 ? new TextFieldValue((String) null, 0L, (TextRange) null, 7, (C8627dsp) null) : textFieldValue, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? false : z2, textPreparedSelectionState, (i2 & 64) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, (i2 & 128) != 0 ? null : undoManager, deadKeyCombiner, (i2 & 512) != 0 ? KeyMapping_androidKt.getPlatformDefaultKeyMapping() : keyMapping, (i2 & 1024) != 0 ? new drM<TextFieldValue, dpR>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput.1
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldValue textFieldValue2) {
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(TextFieldValue textFieldValue2) {
                invoke2(textFieldValue2);
                return dpR.c;
            }
        } : drm, i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(List<? extends EditCommand> list) {
        List<? extends EditCommand> n;
        EditProcessor processor = this.state.getProcessor();
        n = C8576dqs.n(list);
        n.add(0, new FinishComposingTextCommand());
        this.onValueChange.invoke(processor.apply(n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(EditCommand editCommand) {
        List<? extends EditCommand> e;
        e = C8566dqi.e(editCommand);
        apply(e);
    }

    /* renamed from: typedCommand-ZmokQxo  reason: not valid java name */
    private final CommitTextCommand m461typedCommandZmokQxo(KeyEvent keyEvent) {
        Integer m413consumeZmokQxo;
        if (TextFieldKeyInput_androidKt.m465isTypedEventZmokQxo(keyEvent) && (m413consumeZmokQxo = this.keyCombiner.m413consumeZmokQxo(keyEvent)) != null) {
            return new CommitTextCommand(StringHelpers_jvmKt.appendCodePointX(new StringBuilder(), m413consumeZmokQxo.intValue()).toString(), 1);
        }
        return null;
    }

    /* renamed from: process-ZmokQxo  reason: not valid java name */
    public final boolean m462processZmokQxo(KeyEvent keyEvent) {
        final KeyCommand mo415mapZmokQxo;
        CommitTextCommand m461typedCommandZmokQxo = m461typedCommandZmokQxo(keyEvent);
        if (m461typedCommandZmokQxo != null) {
            if (this.editable) {
                apply(m461typedCommandZmokQxo);
                this.preparedSelectionState.resetCachedX();
                return true;
            }
            return false;
        } else if (KeyEventType.m1652equalsimpl0(KeyEvent_androidKt.m1660getTypeZmokQxo(keyEvent), KeyEventType.Companion.m1656getKeyDownCS__XNY()) && (mo415mapZmokQxo = this.keyMapping.mo415mapZmokQxo(keyEvent)) != null && (!mo415mapZmokQxo.getEditsText() || this.editable)) {
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.a = true;
            commandExecutionContext(new drM<TextFieldPreparedSelection, dpR>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2

                /* loaded from: classes.dex */
                public final /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[KeyCommand.values().length];
                        try {
                            iArr[KeyCommand.COPY.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[KeyCommand.PASTE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[KeyCommand.CUT.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        try {
                            iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
                        } catch (NoSuchFieldError unused8) {
                        }
                        try {
                            iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
                        } catch (NoSuchFieldError unused9) {
                        }
                        try {
                            iArr[KeyCommand.UP.ordinal()] = 10;
                        } catch (NoSuchFieldError unused10) {
                        }
                        try {
                            iArr[KeyCommand.DOWN.ordinal()] = 11;
                        } catch (NoSuchFieldError unused11) {
                        }
                        try {
                            iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
                        } catch (NoSuchFieldError unused12) {
                        }
                        try {
                            iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
                        } catch (NoSuchFieldError unused13) {
                        }
                        try {
                            iArr[KeyCommand.LINE_START.ordinal()] = 14;
                        } catch (NoSuchFieldError unused14) {
                        }
                        try {
                            iArr[KeyCommand.LINE_END.ordinal()] = 15;
                        } catch (NoSuchFieldError unused15) {
                        }
                        try {
                            iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
                        } catch (NoSuchFieldError unused16) {
                        }
                        try {
                            iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
                        } catch (NoSuchFieldError unused17) {
                        }
                        try {
                            iArr[KeyCommand.HOME.ordinal()] = 18;
                        } catch (NoSuchFieldError unused18) {
                        }
                        try {
                            iArr[KeyCommand.END.ordinal()] = 19;
                        } catch (NoSuchFieldError unused19) {
                        }
                        try {
                            iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
                        } catch (NoSuchFieldError unused20) {
                        }
                        try {
                            iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
                        } catch (NoSuchFieldError unused21) {
                        }
                        try {
                            iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
                        } catch (NoSuchFieldError unused22) {
                        }
                        try {
                            iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
                        } catch (NoSuchFieldError unused23) {
                        }
                        try {
                            iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
                        } catch (NoSuchFieldError unused24) {
                        }
                        try {
                            iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
                        } catch (NoSuchFieldError unused25) {
                        }
                        try {
                            iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
                        } catch (NoSuchFieldError unused26) {
                        }
                        try {
                            iArr[KeyCommand.TAB.ordinal()] = 27;
                        } catch (NoSuchFieldError unused27) {
                        }
                        try {
                            iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
                        } catch (NoSuchFieldError unused28) {
                        }
                        try {
                            iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
                        } catch (NoSuchFieldError unused29) {
                        }
                        try {
                            iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
                        } catch (NoSuchFieldError unused30) {
                        }
                        try {
                            iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
                        } catch (NoSuchFieldError unused31) {
                        }
                        try {
                            iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
                        } catch (NoSuchFieldError unused32) {
                        }
                        try {
                            iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
                        } catch (NoSuchFieldError unused33) {
                        }
                        try {
                            iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
                        } catch (NoSuchFieldError unused34) {
                        }
                        try {
                            iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
                        } catch (NoSuchFieldError unused35) {
                        }
                        try {
                            iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
                        } catch (NoSuchFieldError unused36) {
                        }
                        try {
                            iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
                        } catch (NoSuchFieldError unused37) {
                        }
                        try {
                            iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
                        } catch (NoSuchFieldError unused38) {
                        }
                        try {
                            iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
                        } catch (NoSuchFieldError unused39) {
                        }
                        try {
                            iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
                        } catch (NoSuchFieldError unused40) {
                        }
                        try {
                            iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
                        } catch (NoSuchFieldError unused41) {
                        }
                        try {
                            iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
                        } catch (NoSuchFieldError unused42) {
                        }
                        try {
                            iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
                        } catch (NoSuchFieldError unused43) {
                        }
                        try {
                            iArr[KeyCommand.SELECT_END.ordinal()] = 44;
                        } catch (NoSuchFieldError unused44) {
                        }
                        try {
                            iArr[KeyCommand.DESELECT.ordinal()] = 45;
                        } catch (NoSuchFieldError unused45) {
                        }
                        try {
                            iArr[KeyCommand.UNDO.ordinal()] = 46;
                        } catch (NoSuchFieldError unused46) {
                        }
                        try {
                            iArr[KeyCommand.REDO.ordinal()] = 47;
                        } catch (NoSuchFieldError unused47) {
                        }
                        try {
                            iArr[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
                        } catch (NoSuchFieldError unused48) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
                    invoke2(textFieldPreparedSelection);
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(TextFieldPreparedSelection textFieldPreparedSelection) {
                    int i;
                    TextFieldValue undo;
                    drM drm;
                    TextFieldValue redo;
                    drM drm2;
                    switch (WhenMappings.$EnumSwitchMapping$0[KeyCommand.this.ordinal()]) {
                        case 1:
                            this.getSelectionManager().copy$foundation_release(false);
                            return;
                        case 2:
                            this.getSelectionManager().paste$foundation_release();
                            return;
                        case 3:
                            this.getSelectionManager().cut$foundation_release();
                            return;
                        case 4:
                            textFieldPreparedSelection.collapseLeftOr(new drM<TextFieldPreparedSelection, dpR>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.1
                                @Override // o.drM
                                public /* bridge */ /* synthetic */ dpR invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                    invoke2(textFieldPreparedSelection2);
                                    return dpR.c;
                                }

                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                public final void invoke2(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                    textFieldPreparedSelection2.moveCursorLeft();
                                }
                            });
                            return;
                        case 5:
                            textFieldPreparedSelection.collapseRightOr(new drM<TextFieldPreparedSelection, dpR>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.2
                                @Override // o.drM
                                public /* bridge */ /* synthetic */ dpR invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                    invoke2(textFieldPreparedSelection2);
                                    return dpR.c;
                                }

                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                public final void invoke2(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                    textFieldPreparedSelection2.moveCursorRight();
                                }
                            });
                            return;
                        case 6:
                            textFieldPreparedSelection.moveCursorLeftByWord();
                            return;
                        case 7:
                            textFieldPreparedSelection.moveCursorRightByWord();
                            return;
                        case 8:
                            textFieldPreparedSelection.moveCursorPrevByParagraph();
                            return;
                        case 9:
                            textFieldPreparedSelection.moveCursorNextByParagraph();
                            return;
                        case 10:
                            textFieldPreparedSelection.moveCursorUpByLine();
                            return;
                        case 11:
                            textFieldPreparedSelection.moveCursorDownByLine();
                            return;
                        case 12:
                            textFieldPreparedSelection.moveCursorUpByPage();
                            return;
                        case 13:
                            textFieldPreparedSelection.moveCursorDownByPage();
                            return;
                        case 14:
                            textFieldPreparedSelection.moveCursorToLineStart();
                            return;
                        case 15:
                            textFieldPreparedSelection.moveCursorToLineEnd();
                            return;
                        case 16:
                            textFieldPreparedSelection.moveCursorToLineLeftSide();
                            return;
                        case 17:
                            textFieldPreparedSelection.moveCursorToLineRightSide();
                            return;
                        case 18:
                            textFieldPreparedSelection.moveCursorToHome();
                            return;
                        case 19:
                            textFieldPreparedSelection.moveCursorToEnd();
                            return;
                        case 20:
                            List<EditCommand> deleteIfSelectedOr = textFieldPreparedSelection.deleteIfSelectedOr(new drM<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.3
                                @Override // o.drM
                                public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                    return new DeleteSurroundingTextCommand(TextRange.m2152getEndimpl(textFieldPreparedSelection2.m519getSelectiond9O1mEE()) - textFieldPreparedSelection2.getPrecedingCharacterIndex(), 0);
                                }
                            });
                            if (deleteIfSelectedOr != null) {
                                this.apply(deleteIfSelectedOr);
                                return;
                            }
                            return;
                        case 21:
                            List<EditCommand> deleteIfSelectedOr2 = textFieldPreparedSelection.deleteIfSelectedOr(new drM<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.4
                                @Override // o.drM
                                public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                    int nextCharacterIndex = textFieldPreparedSelection2.getNextCharacterIndex();
                                    if (nextCharacterIndex != -1) {
                                        return new DeleteSurroundingTextCommand(0, nextCharacterIndex - TextRange.m2152getEndimpl(textFieldPreparedSelection2.m519getSelectiond9O1mEE()));
                                    }
                                    return null;
                                }
                            });
                            if (deleteIfSelectedOr2 != null) {
                                this.apply(deleteIfSelectedOr2);
                                return;
                            }
                            return;
                        case 22:
                            List<EditCommand> deleteIfSelectedOr3 = textFieldPreparedSelection.deleteIfSelectedOr(new drM<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.5
                                @Override // o.drM
                                public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                    Integer previousWordOffset = textFieldPreparedSelection2.getPreviousWordOffset();
                                    if (previousWordOffset != null) {
                                        return new DeleteSurroundingTextCommand(TextRange.m2152getEndimpl(textFieldPreparedSelection2.m519getSelectiond9O1mEE()) - previousWordOffset.intValue(), 0);
                                    }
                                    return null;
                                }
                            });
                            if (deleteIfSelectedOr3 != null) {
                                this.apply(deleteIfSelectedOr3);
                                return;
                            }
                            return;
                        case 23:
                            List<EditCommand> deleteIfSelectedOr4 = textFieldPreparedSelection.deleteIfSelectedOr(new drM<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.6
                                @Override // o.drM
                                public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                    Integer nextWordOffset = textFieldPreparedSelection2.getNextWordOffset();
                                    if (nextWordOffset != null) {
                                        return new DeleteSurroundingTextCommand(0, nextWordOffset.intValue() - TextRange.m2152getEndimpl(textFieldPreparedSelection2.m519getSelectiond9O1mEE()));
                                    }
                                    return null;
                                }
                            });
                            if (deleteIfSelectedOr4 != null) {
                                this.apply(deleteIfSelectedOr4);
                                return;
                            }
                            return;
                        case 24:
                            List<EditCommand> deleteIfSelectedOr5 = textFieldPreparedSelection.deleteIfSelectedOr(new drM<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.7
                                @Override // o.drM
                                public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                    Integer lineStartByOffset = textFieldPreparedSelection2.getLineStartByOffset();
                                    if (lineStartByOffset != null) {
                                        return new DeleteSurroundingTextCommand(TextRange.m2152getEndimpl(textFieldPreparedSelection2.m519getSelectiond9O1mEE()) - lineStartByOffset.intValue(), 0);
                                    }
                                    return null;
                                }
                            });
                            if (deleteIfSelectedOr5 != null) {
                                this.apply(deleteIfSelectedOr5);
                                return;
                            }
                            return;
                        case 25:
                            List<EditCommand> deleteIfSelectedOr6 = textFieldPreparedSelection.deleteIfSelectedOr(new drM<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.8
                                @Override // o.drM
                                public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                    Integer lineEndByOffset = textFieldPreparedSelection2.getLineEndByOffset();
                                    if (lineEndByOffset != null) {
                                        return new DeleteSurroundingTextCommand(0, lineEndByOffset.intValue() - TextRange.m2152getEndimpl(textFieldPreparedSelection2.m519getSelectiond9O1mEE()));
                                    }
                                    return null;
                                }
                            });
                            if (deleteIfSelectedOr6 != null) {
                                this.apply(deleteIfSelectedOr6);
                                return;
                            }
                            return;
                        case 26:
                            if (!this.getSingleLine()) {
                                this.apply(new CommitTextCommand("\n", 1));
                                return;
                            }
                            drM<ImeAction, dpR> onImeActionPerformed = this.getState().getOnImeActionPerformed();
                            i = this.imeAction;
                            onImeActionPerformed.invoke(ImeAction.m2253boximpl(i));
                            return;
                        case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                            if (!this.getSingleLine()) {
                                this.apply(new CommitTextCommand("\t", 1));
                                return;
                            } else {
                                booleanRef.a = false;
                                return;
                            }
                        case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                            textFieldPreparedSelection.selectAll();
                            return;
                        case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                            textFieldPreparedSelection.moveCursorLeft().selectMovement();
                            return;
                        case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                            textFieldPreparedSelection.moveCursorRight().selectMovement();
                            return;
                        case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                            textFieldPreparedSelection.moveCursorLeftByWord().selectMovement();
                            return;
                        case 32:
                            textFieldPreparedSelection.moveCursorRightByWord().selectMovement();
                            return;
                        case 33:
                            textFieldPreparedSelection.moveCursorPrevByParagraph().selectMovement();
                            return;
                        case 34:
                            textFieldPreparedSelection.moveCursorNextByParagraph().selectMovement();
                            return;
                        case 35:
                            textFieldPreparedSelection.moveCursorToLineStart().selectMovement();
                            return;
                        case 36:
                            textFieldPreparedSelection.moveCursorToLineEnd().selectMovement();
                            return;
                        case 37:
                            textFieldPreparedSelection.moveCursorToLineLeftSide().selectMovement();
                            return;
                        case 38:
                            textFieldPreparedSelection.moveCursorToLineRightSide().selectMovement();
                            return;
                        case 39:
                            textFieldPreparedSelection.moveCursorUpByLine().selectMovement();
                            return;
                        case JSONzip.substringLimit /* 40 */:
                            textFieldPreparedSelection.moveCursorDownByLine().selectMovement();
                            return;
                        case 41:
                            textFieldPreparedSelection.moveCursorUpByPage().selectMovement();
                            return;
                        case 42:
                            textFieldPreparedSelection.moveCursorDownByPage().selectMovement();
                            return;
                        case 43:
                            textFieldPreparedSelection.moveCursorToHome().selectMovement();
                            return;
                        case 44:
                            textFieldPreparedSelection.moveCursorToEnd().selectMovement();
                            return;
                        case 45:
                            textFieldPreparedSelection.deselect();
                            return;
                        case 46:
                            UndoManager undoManager = this.getUndoManager();
                            if (undoManager != null) {
                                undoManager.makeSnapshot(textFieldPreparedSelection.getValue());
                            }
                            UndoManager undoManager2 = this.getUndoManager();
                            if (undoManager2 == null || (undo = undoManager2.undo()) == null) {
                                return;
                            }
                            drm = this.onValueChange;
                            drm.invoke(undo);
                            return;
                        case 47:
                            UndoManager undoManager3 = this.getUndoManager();
                            if (undoManager3 == null || (redo = undoManager3.redo()) == null) {
                                return;
                            }
                            drm2 = this.onValueChange;
                            drm2.invoke(redo);
                            return;
                        case 48:
                            KeyEventHelpers_androidKt.showCharacterPalette();
                            return;
                        default:
                            return;
                    }
                }
            });
            UndoManager undoManager = this.undoManager;
            if (undoManager != null) {
                undoManager.forceNextSnapshot();
            }
            return booleanRef.a;
        } else {
            return false;
        }
    }

    private final void commandExecutionContext(drM<? super TextFieldPreparedSelection, dpR> drm) {
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(this.value, this.offsetMapping, this.state.getLayoutResult(), this.preparedSelectionState);
        drm.invoke(textFieldPreparedSelection);
        if (TextRange.m2150equalsimpl0(textFieldPreparedSelection.m519getSelectiond9O1mEE(), this.value.m2302getSelectiond9O1mEE()) && C8632dsu.c(textFieldPreparedSelection.getAnnotatedString(), this.value.getAnnotatedString())) {
            return;
        }
        this.onValueChange.invoke(textFieldPreparedSelection.getValue());
    }
}
