package com.google.protobuf;

import com.fasterxml.jackson.core.JsonFactory;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MessageLiteToString {
    private static final char[] INDENT_BUFFER;

    static {
        char[] cArr = new char[80];
        INDENT_BUFFER = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String toString(MessageLite messageLite, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        reflectivePrintWithIndent(messageLite, sb, 0);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x016e, code lost:
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void reflectivePrintWithIndent(com.google.protobuf.MessageLite r16, java.lang.StringBuilder r17, int r18) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageLiteToString.reflectivePrintWithIndent(com.google.protobuf.MessageLite, java.lang.StringBuilder, int):void");
    }

    private static boolean isDefaultValue(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        } else if (obj instanceof Float) {
            return Float.floatToRawIntBits(((Float) obj).floatValue()) == 0;
        } else if (obj instanceof Double) {
            return Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0;
        } else if (obj instanceof String) {
            return obj.equals("");
        } else {
            if (obj instanceof ByteString) {
                return obj.equals(ByteString.EMPTY);
            }
            return obj instanceof MessageLite ? obj == ((MessageLite) obj).getDefaultInstanceForType() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void printField(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                printField(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                printField(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            indent(i, sb);
            sb.append(pascalCaseToSnakeCase(str));
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(TextFormatEscaper.escapeText((String) obj));
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else if (obj instanceof ByteString) {
                sb.append(": \"");
                sb.append(TextFormatEscaper.escapeBytes((ByteString) obj));
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else if (obj instanceof GeneratedMessageLite) {
                sb.append(" {");
                reflectivePrintWithIndent((GeneratedMessageLite) obj, sb, i + 2);
                sb.append("\n");
                indent(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i2 = i + 2;
                printField(sb, i2, SignupConstants.Error.DEBUG_FIELD_KEY, entry2.getKey());
                printField(sb, i2, "value", entry2.getValue());
                sb.append("\n");
                indent(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    private static void indent(int i, StringBuilder sb) {
        while (i > 0) {
            char[] cArr = INDENT_BUFFER;
            int length = i > cArr.length ? cArr.length : i;
            sb.append(cArr, 0, length);
            i -= length;
        }
    }

    private static String pascalCaseToSnakeCase(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
