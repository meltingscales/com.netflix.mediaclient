package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.drM;

/* loaded from: classes.dex */
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping;

    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }

    public static final KeyMapping commonKeyMapping(final drM<? super KeyEvent, Boolean> drm) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo415mapZmokQxo(android.view.KeyEvent keyEvent) {
                if (drm.invoke(KeyEvent.m1644boximpl(keyEvent)).booleanValue() && KeyEvent_androidKt.m1664isShiftPressedZmokQxo(keyEvent)) {
                    if (Key.m1628equalsimpl0(KeyEvent_androidKt.m1659getKeyZmokQxo(keyEvent), MappedKeys.INSTANCE.m445getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                } else if (drm.invoke(KeyEvent.m1644boximpl(keyEvent)).booleanValue()) {
                    long m1659getKeyZmokQxo = KeyEvent_androidKt.m1659getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m1628equalsimpl0(m1659getKeyZmokQxo, mappedKeys.m425getCEK5gGoQ()) || Key.m1628equalsimpl0(m1659getKeyZmokQxo, mappedKeys.m435getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m1628equalsimpl0(m1659getKeyZmokQxo, mappedKeys.m442getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m1628equalsimpl0(m1659getKeyZmokQxo, mappedKeys.m443getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m1628equalsimpl0(m1659getKeyZmokQxo, mappedKeys.m422getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m1628equalsimpl0(m1659getKeyZmokQxo, mappedKeys.m444getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m1628equalsimpl0(m1659getKeyZmokQxo, mappedKeys.m445getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                } else if (!KeyEvent_androidKt.m1663isCtrlPressedZmokQxo(keyEvent)) {
                    if (KeyEvent_androidKt.m1664isShiftPressedZmokQxo(keyEvent)) {
                        long m1659getKeyZmokQxo2 = KeyEvent_androidKt.m1659getKeyZmokQxo(keyEvent);
                        MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo2, mappedKeys2.m430getDirectionLeftEK5gGoQ())) {
                            return KeyCommand.SELECT_LEFT_CHAR;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo2, mappedKeys2.m431getDirectionRightEK5gGoQ())) {
                            return KeyCommand.SELECT_RIGHT_CHAR;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo2, mappedKeys2.m432getDirectionUpEK5gGoQ())) {
                            return KeyCommand.SELECT_UP;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo2, mappedKeys2.m429getDirectionDownEK5gGoQ())) {
                            return KeyCommand.SELECT_DOWN;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo2, mappedKeys2.m439getPageUpEK5gGoQ())) {
                            return KeyCommand.SELECT_PAGE_UP;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo2, mappedKeys2.m438getPageDownEK5gGoQ())) {
                            return KeyCommand.SELECT_PAGE_DOWN;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo2, mappedKeys2.m437getMoveHomeEK5gGoQ())) {
                            return KeyCommand.SELECT_LINE_START;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo2, mappedKeys2.m436getMoveEndEK5gGoQ())) {
                            return KeyCommand.SELECT_LINE_END;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo2, mappedKeys2.m435getInsertEK5gGoQ())) {
                            return KeyCommand.PASTE;
                        }
                    } else {
                        long m1659getKeyZmokQxo3 = KeyEvent_androidKt.m1659getKeyZmokQxo(keyEvent);
                        MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo3, mappedKeys3.m430getDirectionLeftEK5gGoQ())) {
                            return KeyCommand.LEFT_CHAR;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo3, mappedKeys3.m431getDirectionRightEK5gGoQ())) {
                            return KeyCommand.RIGHT_CHAR;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo3, mappedKeys3.m432getDirectionUpEK5gGoQ())) {
                            return KeyCommand.UP;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo3, mappedKeys3.m429getDirectionDownEK5gGoQ())) {
                            return KeyCommand.DOWN;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo3, mappedKeys3.m439getPageUpEK5gGoQ())) {
                            return KeyCommand.PAGE_UP;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo3, mappedKeys3.m438getPageDownEK5gGoQ())) {
                            return KeyCommand.PAGE_DOWN;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo3, mappedKeys3.m437getMoveHomeEK5gGoQ())) {
                            return KeyCommand.LINE_START;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo3, mappedKeys3.m436getMoveEndEK5gGoQ())) {
                            return KeyCommand.LINE_END;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo3, mappedKeys3.m433getEnterEK5gGoQ())) {
                            return KeyCommand.NEW_LINE;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo3, mappedKeys3.m424getBackspaceEK5gGoQ())) {
                            return KeyCommand.DELETE_PREV_CHAR;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo3, mappedKeys3.m428getDeleteEK5gGoQ())) {
                            return KeyCommand.DELETE_NEXT_CHAR;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo3, mappedKeys3.m440getPasteEK5gGoQ())) {
                            return KeyCommand.PASTE;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo3, mappedKeys3.m427getCutEK5gGoQ())) {
                            return KeyCommand.CUT;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo3, mappedKeys3.m426getCopyEK5gGoQ())) {
                            return KeyCommand.COPY;
                        }
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo3, mappedKeys3.m441getTabEK5gGoQ())) {
                            return KeyCommand.TAB;
                        }
                    }
                }
                return null;
            }
        };
    }

    static {
        final KeyMapping commonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
            public Object get(Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m1663isCtrlPressedZmokQxo(((KeyEvent) obj).m1649unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo415mapZmokQxo(android.view.KeyEvent keyEvent) {
                KeyCommand keyCommand;
                if (KeyEvent_androidKt.m1664isShiftPressedZmokQxo(keyEvent) && KeyEvent_androidKt.m1663isCtrlPressedZmokQxo(keyEvent)) {
                    long m1659getKeyZmokQxo = KeyEvent_androidKt.m1659getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m1628equalsimpl0(m1659getKeyZmokQxo, mappedKeys.m430getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m1628equalsimpl0(m1659getKeyZmokQxo, mappedKeys.m431getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m1628equalsimpl0(m1659getKeyZmokQxo, mappedKeys.m432getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else {
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo, mappedKeys.m429getDirectionDownEK5gGoQ())) {
                            keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                        }
                        keyCommand = null;
                    }
                } else if (KeyEvent_androidKt.m1663isCtrlPressedZmokQxo(keyEvent)) {
                    long m1659getKeyZmokQxo2 = KeyEvent_androidKt.m1659getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m1628equalsimpl0(m1659getKeyZmokQxo2, mappedKeys2.m430getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m1628equalsimpl0(m1659getKeyZmokQxo2, mappedKeys2.m431getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m1628equalsimpl0(m1659getKeyZmokQxo2, mappedKeys2.m432getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m1628equalsimpl0(m1659getKeyZmokQxo2, mappedKeys2.m429getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m1628equalsimpl0(m1659getKeyZmokQxo2, mappedKeys2.m434getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m1628equalsimpl0(m1659getKeyZmokQxo2, mappedKeys2.m428getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m1628equalsimpl0(m1659getKeyZmokQxo2, mappedKeys2.m424getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else {
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo2, mappedKeys2.m423getBackslashEK5gGoQ())) {
                            keyCommand = KeyCommand.DESELECT;
                        }
                        keyCommand = null;
                    }
                } else if (KeyEvent_androidKt.m1664isShiftPressedZmokQxo(keyEvent)) {
                    long m1659getKeyZmokQxo3 = KeyEvent_androidKt.m1659getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m1628equalsimpl0(m1659getKeyZmokQxo3, mappedKeys3.m437getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_LEFT;
                    } else {
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo3, mappedKeys3.m436getMoveEndEK5gGoQ())) {
                            keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                        }
                        keyCommand = null;
                    }
                } else {
                    if (KeyEvent_androidKt.m1662isAltPressedZmokQxo(keyEvent)) {
                        long m1659getKeyZmokQxo4 = KeyEvent_androidKt.m1659getKeyZmokQxo(keyEvent);
                        MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo4, mappedKeys4.m424getBackspaceEK5gGoQ())) {
                            keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                        } else if (Key.m1628equalsimpl0(m1659getKeyZmokQxo4, mappedKeys4.m428getDeleteEK5gGoQ())) {
                            keyCommand = KeyCommand.DELETE_TO_LINE_END;
                        }
                    }
                    keyCommand = null;
                }
                return keyCommand == null ? KeyMapping.this.mo415mapZmokQxo(keyEvent) : keyCommand;
            }
        };
    }
}
