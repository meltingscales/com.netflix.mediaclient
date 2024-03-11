package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class WebvttParserUtil {
    private static final Pattern COMMENT = Pattern.compile("^NOTE([ \t].*)?$");

    public static void validateWebvttHeaderLine(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        if (isWebvttHeaderLine(parsableByteArray)) {
            return;
        }
        parsableByteArray.setPosition(position);
        throw ParserException.createForMalformedContainer("Expected WEBVTT. Got " + parsableByteArray.readLine(), null);
    }

    public static boolean isWebvttHeaderLine(ParsableByteArray parsableByteArray) {
        String readLine = parsableByteArray.readLine();
        return readLine != null && readLine.startsWith("WEBVTT");
    }

    public static long parseTimestampUs(String str) {
        String[] splitAtFirst = Util.splitAtFirst(str, "\\.");
        long j = 0;
        for (String str2 : Util.split(splitAtFirst[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (splitAtFirst.length == 2) {
            j2 += Long.parseLong(splitAtFirst[1]);
        }
        return j2 * 1000;
    }

    public static float parsePercentage(String str) {
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
    }
}
