package androidx.compose.ui.text.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.emoji2.text.EmojiCompat;
import o.C8632dsu;

/* loaded from: classes.dex */
final class DefaultImpl implements EmojiCompatStatusDelegate {
    private State<Boolean> loadState;

    public DefaultImpl() {
        this.loadState = EmojiCompat.isConfigured() ? getFontLoadState() : null;
    }

    @Override // androidx.compose.ui.text.platform.EmojiCompatStatusDelegate
    public State<Boolean> getFontLoaded() {
        ImmutableBool immutableBool;
        State<Boolean> state = this.loadState;
        if (state != null) {
            C8632dsu.d(state);
            return state;
        } else if (EmojiCompat.isConfigured()) {
            State<Boolean> fontLoadState = getFontLoadState();
            this.loadState = fontLoadState;
            C8632dsu.d(fontLoadState);
            return fontLoadState;
        } else {
            immutableBool = EmojiCompatStatus_androidKt.Falsey;
            return immutableBool;
        }
    }

    private final State<Boolean> getFontLoadState() {
        final MutableState mutableStateOf$default;
        EmojiCompat emojiCompat = EmojiCompat.get();
        if (emojiCompat.getLoadState() != 1) {
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            emojiCompat.registerInitCallback(new EmojiCompat.InitCallback() { // from class: androidx.compose.ui.text.platform.DefaultImpl$getFontLoadState$initCallback$1
                @Override // androidx.emoji2.text.EmojiCompat.InitCallback
                public void onInitialized() {
                    mutableStateOf$default.setValue(Boolean.TRUE);
                    this.loadState = new ImmutableBool(true);
                }

                @Override // androidx.emoji2.text.EmojiCompat.InitCallback
                public void onFailed(Throwable th) {
                    ImmutableBool immutableBool;
                    DefaultImpl defaultImpl = this;
                    immutableBool = EmojiCompatStatus_androidKt.Falsey;
                    defaultImpl.loadState = immutableBool;
                }
            });
            return mutableStateOf$default;
        }
        return new ImmutableBool(true);
    }
}
