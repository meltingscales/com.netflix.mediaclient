package androidx.media3.extractor.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class SubripParser implements SubtitleParser {
    private static final Pattern SUBRIP_TIMING_LINE = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern SUBRIP_TAG_PATTERN = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder textBuilder = new StringBuilder();
    private final ArrayList<String> tags = new ArrayList<>();
    private final ParsableByteArray parsableByteArray = new ParsableByteArray();

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        String str;
        Consumer<CuesWithTiming> consumer2;
        String str2;
        String str3;
        Consumer<CuesWithTiming> consumer3 = consumer;
        String str4 = "SubripParser";
        this.parsableByteArray.reset(bArr, i + i2);
        this.parsableByteArray.setPosition(i);
        Charset detectUtfCharset = detectUtfCharset(this.parsableByteArray);
        ArrayList<CuesWithTiming> arrayList = (outputOptions.startTimeUs == -9223372036854775807L || !outputOptions.outputAllCues) ? null : new ArrayList();
        while (true) {
            String readLine = this.parsableByteArray.readLine(detectUtfCharset);
            if (readLine == null) {
                break;
            }
            if (readLine.length() == 0) {
                str = str4;
                consumer2 = consumer3;
            } else {
                try {
                    Integer.parseInt(readLine);
                    String readLine2 = this.parsableByteArray.readLine(detectUtfCharset);
                    if (readLine2 == null) {
                        Log.w(str4, "Unexpected end");
                        break;
                    }
                    Matcher matcher = SUBRIP_TIMING_LINE.matcher(readLine2);
                    if (matcher.matches()) {
                        long parseTimecode = parseTimecode(matcher, 1);
                        long parseTimecode2 = parseTimecode(matcher, 6);
                        int i3 = 0;
                        this.textBuilder.setLength(0);
                        this.tags.clear();
                        String readLine3 = this.parsableByteArray.readLine(detectUtfCharset);
                        while (!TextUtils.isEmpty(readLine3)) {
                            if (this.textBuilder.length() > 0) {
                                this.textBuilder.append("<br>");
                            }
                            this.textBuilder.append(processLine(readLine3, this.tags));
                            readLine3 = this.parsableByteArray.readLine(detectUtfCharset);
                        }
                        Spanned fromHtml = Html.fromHtml(this.textBuilder.toString());
                        while (true) {
                            if (i3 >= this.tags.size()) {
                                str2 = str4;
                                str3 = null;
                                break;
                            }
                            str3 = this.tags.get(i3);
                            if (str3.matches("\\{\\\\an[1-9]\\}")) {
                                str2 = str4;
                                break;
                            }
                            i3++;
                        }
                        long j = outputOptions.startTimeUs;
                        if (j == -9223372036854775807L || parseTimecode >= j) {
                            consumer2 = consumer;
                            consumer2.accept(new CuesWithTiming(ImmutableList.of(buildCue(fromHtml, str3)), parseTimecode, parseTimecode2 - parseTimecode));
                        } else {
                            if (arrayList != null) {
                                arrayList.add(new CuesWithTiming(ImmutableList.of(buildCue(fromHtml, str3)), parseTimecode, parseTimecode2 - parseTimecode));
                            }
                            consumer2 = consumer;
                        }
                        str = str2;
                    } else {
                        String str5 = str4;
                        consumer2 = consumer3;
                        str = str5;
                        Log.w(str, "Skipping invalid timing: " + readLine2);
                    }
                } catch (NumberFormatException unused) {
                    str = str4;
                    consumer2 = consumer3;
                    Log.w(str, "Skipping invalid index: " + readLine);
                }
            }
            consumer3 = consumer2;
            str4 = str;
        }
        Consumer<CuesWithTiming> consumer4 = consumer3;
        if (arrayList != null) {
            for (CuesWithTiming cuesWithTiming : arrayList) {
                consumer4.accept(cuesWithTiming);
            }
        }
    }

    private Charset detectUtfCharset(ParsableByteArray parsableByteArray) {
        Charset readUtfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
        return readUtfCharsetFromBom != null ? readUtfCharsetFromBom : Charsets.UTF_8;
    }

    private String processLine(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = SUBRIP_TAG_PATTERN.matcher(trim);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i;
            int length = group.length();
            sb.replace(start, start + length, "");
            i += length;
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Cue buildCue(Spanned spanned, String str) {
        char c;
        char c2;
        Cue.Builder text = new Cue.Builder().setText(spanned);
        if (str == null) {
            return text.build();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1 || c == 2) {
            text.setPositionAnchor(0);
        } else if (c == 3 || c == 4 || c == 5) {
            text.setPositionAnchor(2);
        } else {
            text.setPositionAnchor(1);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0 || c2 == 1 || c2 == 2) {
            text.setLineAnchor(2);
        } else if (c2 == 3 || c2 == 4 || c2 == 5) {
            text.setLineAnchor(0);
        } else {
            text.setLineAnchor(1);
        }
        return text.setPosition(getFractionalPositionForAnchorType(text.getPositionAnchor())).setLine(getFractionalPositionForAnchorType(text.getLineAnchor()), 0).build();
    }

    private static long parseTimecode(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 3600000 : 0L) + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(i + 2))) * 60000) + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(i + 3))) * 1000);
        String group2 = matcher.group(i + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    public static float getFractionalPositionForAnchorType(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return 0.92f;
                }
                throw new IllegalArgumentException();
            }
            return 0.5f;
        }
        return 0.08f;
    }
}
