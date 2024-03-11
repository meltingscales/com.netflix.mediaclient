package androidx.media3.extractor.text.webvtt;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.LegacySubtitleUtil;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class WebvttParser implements SubtitleParser {
    private final ParsableByteArray parsableWebvttData = new ParsableByteArray();
    private final WebvttCssParser cssParser = new WebvttCssParser();

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        WebvttCueInfo parseCue;
        this.parsableWebvttData.reset(bArr, i2 + i);
        this.parsableWebvttData.setPosition(i);
        ArrayList arrayList = new ArrayList();
        try {
            WebvttParserUtil.validateWebvttHeaderLine(this.parsableWebvttData);
            do {
            } while (!TextUtils.isEmpty(this.parsableWebvttData.readLine()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int nextEvent = getNextEvent(this.parsableWebvttData);
                if (nextEvent == 0) {
                    LegacySubtitleUtil.toCuesWithTiming(new WebvttSubtitle(arrayList2), outputOptions, consumer);
                    return;
                } else if (nextEvent == 1) {
                    skipComment(this.parsableWebvttData);
                } else if (nextEvent == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.parsableWebvttData.readLine();
                    arrayList.addAll(this.cssParser.parseBlock(this.parsableWebvttData));
                } else if (nextEvent == 3 && (parseCue = WebvttCueParser.parseCue(this.parsableWebvttData, arrayList)) != null) {
                    arrayList2.add(parseCue);
                }
            }
        } catch (ParserException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static int getNextEvent(ParsableByteArray parsableByteArray) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = parsableByteArray.getPosition();
            String readLine = parsableByteArray.readLine();
            if (readLine == null) {
                i = 0;
            } else if ("STYLE".equals(readLine)) {
                i = 2;
            } else {
                i = readLine.startsWith("NOTE") ? 1 : 3;
            }
        }
        parsableByteArray.setPosition(i2);
        return i;
    }

    private static void skipComment(ParsableByteArray parsableByteArray) {
        do {
        } while (!TextUtils.isEmpty(parsableByteArray.readLine()));
    }
}
