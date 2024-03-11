package androidx.media3.extractor.text.webvtt;

import android.text.TextUtils;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ColorParser;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class WebvttCssParser {
    private static final Pattern VOICE_NAME_PATTERN = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern FONT_SIZE_PATTERN = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final ParsableByteArray styleInput = new ParsableByteArray();
    private final StringBuilder stringBuilder = new StringBuilder();

    public List<WebvttCssStyle> parseBlock(ParsableByteArray parsableByteArray) {
        this.stringBuilder.setLength(0);
        int position = parsableByteArray.getPosition();
        skipStyleBlock(parsableByteArray);
        this.styleInput.reset(parsableByteArray.getData(), parsableByteArray.getPosition());
        this.styleInput.setPosition(position);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String parseSelector = parseSelector(this.styleInput, this.stringBuilder);
            if (parseSelector == null || !"{".equals(parseNextToken(this.styleInput, this.stringBuilder))) {
                return arrayList;
            }
            WebvttCssStyle webvttCssStyle = new WebvttCssStyle();
            applySelectorToStyle(webvttCssStyle, parseSelector);
            String str = null;
            boolean z = false;
            while (!z) {
                int position2 = this.styleInput.getPosition();
                String parseNextToken = parseNextToken(this.styleInput, this.stringBuilder);
                boolean z2 = parseNextToken == null || "}".equals(parseNextToken);
                if (!z2) {
                    this.styleInput.setPosition(position2);
                    parseStyleDeclaration(this.styleInput, webvttCssStyle, this.stringBuilder);
                }
                str = parseNextToken;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(webvttCssStyle);
            }
        }
    }

    private static String parseSelector(ParsableByteArray parsableByteArray, StringBuilder sb) {
        skipWhitespaceAndComments(parsableByteArray);
        if (parsableByteArray.bytesLeft() >= 5 && "::cue".equals(parsableByteArray.readString(5))) {
            int position = parsableByteArray.getPosition();
            String parseNextToken = parseNextToken(parsableByteArray, sb);
            if (parseNextToken == null) {
                return null;
            }
            if ("{".equals(parseNextToken)) {
                parsableByteArray.setPosition(position);
                return "";
            }
            String readCueTarget = "(".equals(parseNextToken) ? readCueTarget(parsableByteArray) : null;
            if (")".equals(parseNextToken(parsableByteArray, sb))) {
                return readCueTarget;
            }
            return null;
        }
        return null;
    }

    private static String readCueTarget(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        boolean z = false;
        while (position < limit && !z) {
            z = ((char) parsableByteArray.getData()[position]) == ')';
            position++;
        }
        return parsableByteArray.readString((position - 1) - parsableByteArray.getPosition()).trim();
    }

    private static void parseStyleDeclaration(ParsableByteArray parsableByteArray, WebvttCssStyle webvttCssStyle, StringBuilder sb) {
        skipWhitespaceAndComments(parsableByteArray);
        String parseIdentifier = parseIdentifier(parsableByteArray, sb);
        if (!"".equals(parseIdentifier) && ":".equals(parseNextToken(parsableByteArray, sb))) {
            skipWhitespaceAndComments(parsableByteArray);
            String parsePropertyValue = parsePropertyValue(parsableByteArray, sb);
            if (parsePropertyValue == null || "".equals(parsePropertyValue)) {
                return;
            }
            int position = parsableByteArray.getPosition();
            String parseNextToken = parseNextToken(parsableByteArray, sb);
            if (!";".equals(parseNextToken)) {
                if (!"}".equals(parseNextToken)) {
                    return;
                }
                parsableByteArray.setPosition(position);
            }
            if ("color".equals(parseIdentifier)) {
                webvttCssStyle.setFontColor(ColorParser.parseCssColor(parsePropertyValue));
            } else if ("background-color".equals(parseIdentifier)) {
                webvttCssStyle.setBackgroundColor(ColorParser.parseCssColor(parsePropertyValue));
            } else {
                boolean z = true;
                if ("ruby-position".equals(parseIdentifier)) {
                    if ("over".equals(parsePropertyValue)) {
                        webvttCssStyle.setRubyPosition(1);
                    } else if ("under".equals(parsePropertyValue)) {
                        webvttCssStyle.setRubyPosition(2);
                    }
                } else if ("text-combine-upright".equals(parseIdentifier)) {
                    if (!"all".equals(parsePropertyValue) && !parsePropertyValue.startsWith("digits")) {
                        z = false;
                    }
                    webvttCssStyle.setCombineUpright(z);
                } else if ("text-decoration".equals(parseIdentifier)) {
                    if ("underline".equals(parsePropertyValue)) {
                        webvttCssStyle.setUnderline(true);
                    }
                } else if ("font-family".equals(parseIdentifier)) {
                    webvttCssStyle.setFontFamily(parsePropertyValue);
                } else if ("font-weight".equals(parseIdentifier)) {
                    if ("bold".equals(parsePropertyValue)) {
                        webvttCssStyle.setBold(true);
                    }
                } else if ("font-style".equals(parseIdentifier)) {
                    if ("italic".equals(parsePropertyValue)) {
                        webvttCssStyle.setItalic(true);
                    }
                } else if ("font-size".equals(parseIdentifier)) {
                    parseFontSize(parsePropertyValue, webvttCssStyle);
                }
            }
        }
    }

    static void skipWhitespaceAndComments(ParsableByteArray parsableByteArray) {
        while (true) {
            for (boolean z = true; parsableByteArray.bytesLeft() > 0 && z; z = false) {
                if (!maybeSkipWhitespace(parsableByteArray) && !maybeSkipComment(parsableByteArray)) {
                }
            }
            return;
        }
    }

    static String parseNextToken(ParsableByteArray parsableByteArray, StringBuilder sb) {
        skipWhitespaceAndComments(parsableByteArray);
        if (parsableByteArray.bytesLeft() == 0) {
            return null;
        }
        String parseIdentifier = parseIdentifier(parsableByteArray, sb);
        if ("".equals(parseIdentifier)) {
            return "" + ((char) parsableByteArray.readUnsignedByte());
        }
        return parseIdentifier;
    }

    private static boolean maybeSkipWhitespace(ParsableByteArray parsableByteArray) {
        char peekCharAtPosition = peekCharAtPosition(parsableByteArray, parsableByteArray.getPosition());
        if (peekCharAtPosition == '\t' || peekCharAtPosition == '\n' || peekCharAtPosition == '\f' || peekCharAtPosition == '\r' || peekCharAtPosition == ' ') {
            parsableByteArray.skipBytes(1);
            return true;
        }
        return false;
    }

    static void skipStyleBlock(ParsableByteArray parsableByteArray) {
        do {
        } while (!TextUtils.isEmpty(parsableByteArray.readLine()));
    }

    private static char peekCharAtPosition(ParsableByteArray parsableByteArray, int i) {
        return (char) parsableByteArray.getData()[i];
    }

    private static String parsePropertyValue(ParsableByteArray parsableByteArray, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int position = parsableByteArray.getPosition();
            String parseNextToken = parseNextToken(parsableByteArray, sb);
            if (parseNextToken == null) {
                return null;
            }
            if ("}".equals(parseNextToken) || ";".equals(parseNextToken)) {
                parsableByteArray.setPosition(position);
                z = true;
            } else {
                sb2.append(parseNextToken);
            }
        }
        return sb2.toString();
    }

    private static boolean maybeSkipComment(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        int i = position + 2;
        if (i > limit || data[position] != 47 || data[position + 1] != 42) {
            return false;
        }
        while (true) {
            int i2 = i + 1;
            if (i2 < limit) {
                if (((char) data[i]) == '*' && ((char) data[i2]) == '/') {
                    i += 2;
                    limit = i;
                } else {
                    i = i2;
                }
            } else {
                parsableByteArray.skipBytes(limit - parsableByteArray.getPosition());
                return true;
            }
        }
    }

    private static String parseIdentifier(ParsableByteArray parsableByteArray, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        while (position < limit && !z) {
            char c = (char) parsableByteArray.getData()[position];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                position++;
                sb.append(c);
            }
        }
        parsableByteArray.skipBytes(position - parsableByteArray.getPosition());
        return sb.toString();
    }

    private static void parseFontSize(String str, WebvttCssStyle webvttCssStyle) {
        char c;
        Matcher matcher = FONT_SIZE_PATTERN.matcher(Ascii.toLowerCase(str));
        if (!matcher.matches()) {
            Log.w("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) Assertions.checkNotNull(matcher.group(2));
        str2.hashCode();
        int hashCode = str2.hashCode();
        if (hashCode == 37) {
            if (str2.equals("%")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 3240) {
            if (hashCode == 3592 && str2.equals("px")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str2.equals("em")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            webvttCssStyle.setFontSizeUnit(3);
        } else if (c == 1) {
            webvttCssStyle.setFontSizeUnit(2);
        } else if (c == 2) {
            webvttCssStyle.setFontSizeUnit(1);
        } else {
            throw new IllegalStateException();
        }
        webvttCssStyle.setFontSize(Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))));
    }

    private void applySelectorToStyle(WebvttCssStyle webvttCssStyle, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = VOICE_NAME_PATTERN.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                webvttCssStyle.setTargetVoice((String) Assertions.checkNotNull(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] split = Util.split(str, "\\.");
        String str2 = split[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            webvttCssStyle.setTargetTagName(str2.substring(0, indexOf2));
            webvttCssStyle.setTargetId(str2.substring(indexOf2 + 1));
        } else {
            webvttCssStyle.setTargetTagName(str2);
        }
        if (split.length > 1) {
            webvttCssStyle.setTargetClasses((String[]) Util.nullSafeArrayCopyOfRange(split, 1, split.length));
        }
    }
}
