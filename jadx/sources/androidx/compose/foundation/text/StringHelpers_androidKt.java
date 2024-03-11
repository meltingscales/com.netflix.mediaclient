package androidx.compose.foundation.text;

import androidx.emoji2.text.EmojiCompat;

/* loaded from: classes.dex */
public final class StringHelpers_androidKt {
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r0.intValue() == (-1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int findPrecedingBreak(java.lang.String r3, int r4) {
        /*
            androidx.emoji2.text.EmojiCompat r0 = getEmojiCompatIfLoaded()
            if (r0 == 0) goto L1c
            int r1 = r4 + (-1)
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = r0.getEmojiStart(r3, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r0.intValue()
            r2 = -1
            if (r1 != r2) goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 == 0) goto L24
            int r3 = r0.intValue()
            return r3
        L24:
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            r0.setText(r3)
            int r3 = r0.preceding(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.StringHelpers_androidKt.findPrecedingBreak(java.lang.String, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r0.intValue() == (-1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int findFollowingBreak(java.lang.String r3, int r4) {
        /*
            androidx.emoji2.text.EmojiCompat r0 = getEmojiCompatIfLoaded()
            if (r0 == 0) goto L15
            int r0 = r0.getEmojiEnd(r3, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r0.intValue()
            r2 = -1
            if (r1 != r2) goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L1d
            int r3 = r0.intValue()
            return r3
        L1d:
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            r0.setText(r3)
            int r3 = r0.following(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.StringHelpers_androidKt.findFollowingBreak(java.lang.String, int):int");
    }

    private static final EmojiCompat getEmojiCompatIfLoaded() {
        if (EmojiCompat.isConfigured()) {
            EmojiCompat emojiCompat = EmojiCompat.get();
            if (emojiCompat.getLoadState() == 1) {
                return emojiCompat;
            }
        }
        return null;
    }
}
