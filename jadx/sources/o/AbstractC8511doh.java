package o;

import java.nio.charset.spi.CharsetProvider;

/* renamed from: o.doh  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8511doh extends CharsetProvider {
    static String[] b = {"sjis", "shift_jis", "shift-jis", "ms_kanji", "x-sjis", "csShiftJIS"};
    static String[] c = {"MS932", "windows-932", "csWindows31J"};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] d() {
        return new String[]{"iso-ir-100", "ISO_8859-1", "latin1", "l1", "IBM819", "cp819", "csISOLatin1", "819", "IBM-819", "ISO8859_1", "ISO_8859-1:1987", "ISO_8859_1", "8859_1", "ISO8859-1"};
    }
}
