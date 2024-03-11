package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class Mp4WebvttParser implements SubtitleParser {
    private final ParsableByteArray parsableByteArray = new ParsableByteArray();

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        this.parsableByteArray.reset(bArr, i2 + i);
        this.parsableByteArray.setPosition(i);
        ArrayList arrayList = new ArrayList();
        while (this.parsableByteArray.bytesLeft() > 0) {
            Assertions.checkArgument(this.parsableByteArray.bytesLeft() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int readInt = this.parsableByteArray.readInt();
            if (this.parsableByteArray.readInt() == 1987343459) {
                arrayList.add(parseVttCueBox(this.parsableByteArray, readInt - 8));
            } else {
                this.parsableByteArray.skipBytes(readInt - 8);
            }
        }
        consumer.accept(new CuesWithTiming(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    private static Cue parseVttCueBox(ParsableByteArray parsableByteArray, int i) {
        CharSequence charSequence = null;
        Cue.Builder builder = null;
        while (i > 0) {
            Assertions.checkArgument(i >= 8, "Incomplete vtt cue box header found.");
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            int i2 = readInt - 8;
            String fromUtf8Bytes = Util.fromUtf8Bytes(parsableByteArray.getData(), parsableByteArray.getPosition(), i2);
            parsableByteArray.skipBytes(i2);
            i = (i - 8) - i2;
            if (readInt2 == 1937011815) {
                builder = WebvttCueParser.parseCueSettingsList(fromUtf8Bytes);
            } else if (readInt2 == 1885436268) {
                charSequence = WebvttCueParser.parseCueText(null, fromUtf8Bytes.trim(), Collections.emptyList());
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (builder != null) {
            return builder.setText(charSequence).build();
        }
        return WebvttCueParser.newCueForText(charSequence);
    }
}
