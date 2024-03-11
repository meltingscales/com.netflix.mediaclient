package com.google.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.DynamicMessage;
import com.google.protobuf.TextFormatParseInfoTree;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.lang.Character;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class TextFormat {
    private static final Logger logger = Logger.getLogger(TextFormat.class.getName());
    private static final Parser PARSER = Parser.newBuilder().build();

    /* loaded from: classes5.dex */
    public static class ParseException extends IOException {
        private static final long serialVersionUID = 3196188060225107702L;
    }

    /* loaded from: classes5.dex */
    public static class UnknownFieldParseException extends ParseException {
    }

    private static int digitValue(byte b) {
        return (48 > b || b > 57) ? (97 > b || b > 122) ? b - 55 : b - 87 : b - 48;
    }

    private static boolean isHex(byte b) {
        return (48 <= b && b <= 57) || (97 <= b && b <= 102) || (65 <= b && b <= 70);
    }

    private static boolean isOctal(byte b) {
        return 48 <= b && b <= 55;
    }

    private TextFormat() {
    }

    public static Printer printer() {
        return Printer.DEFAULT;
    }

    /* loaded from: classes2.dex */
    public static final class Printer {
        private static final Printer DEFAULT = new Printer(true, TypeRegistry.getEmptyTypeRegistry());
        private final boolean escapeNonAscii;
        private final TypeRegistry typeRegistry;

        private Printer(boolean z, TypeRegistry typeRegistry) {
            this.escapeNonAscii = z;
            this.typeRegistry = typeRegistry;
        }

        public void print(MessageOrBuilder messageOrBuilder, Appendable appendable) {
            print(messageOrBuilder, TextFormat.multiLineOutput(appendable));
        }

        public void print(UnknownFieldSet unknownFieldSet, Appendable appendable) {
            printUnknownFields(unknownFieldSet, TextFormat.multiLineOutput(appendable));
        }

        private void print(MessageOrBuilder messageOrBuilder, TextGenerator textGenerator) {
            if (messageOrBuilder.getDescriptorForType().getFullName().equals("google.protobuf.Any") && printAny(messageOrBuilder, textGenerator)) {
                return;
            }
            printMessage(messageOrBuilder, textGenerator);
        }

        private boolean printAny(MessageOrBuilder messageOrBuilder, TextGenerator textGenerator) {
            Descriptors.Descriptor descriptorForType = messageOrBuilder.getDescriptorForType();
            Descriptors.FieldDescriptor findFieldByNumber = descriptorForType.findFieldByNumber(1);
            Descriptors.FieldDescriptor findFieldByNumber2 = descriptorForType.findFieldByNumber(2);
            if (findFieldByNumber != null && findFieldByNumber.getType() == Descriptors.FieldDescriptor.Type.STRING && findFieldByNumber2 != null && findFieldByNumber2.getType() == Descriptors.FieldDescriptor.Type.BYTES) {
                String str = (String) messageOrBuilder.getField(findFieldByNumber);
                if (str.isEmpty()) {
                    return false;
                }
                Object field = messageOrBuilder.getField(findFieldByNumber2);
                try {
                    Descriptors.Descriptor descriptorForTypeUrl = this.typeRegistry.getDescriptorForTypeUrl(str);
                    if (descriptorForTypeUrl == null) {
                        return false;
                    }
                    DynamicMessage.Builder newBuilderForType = DynamicMessage.getDefaultInstance(descriptorForTypeUrl).newBuilderForType();
                    newBuilderForType.mergeFrom((ByteString) field);
                    textGenerator.print("[");
                    textGenerator.print(str);
                    textGenerator.print("] {");
                    textGenerator.eol();
                    textGenerator.indent();
                    print(newBuilderForType, textGenerator);
                    textGenerator.outdent();
                    textGenerator.print("}");
                    textGenerator.eol();
                    return true;
                } catch (InvalidProtocolBufferException unused) {
                }
            }
            return false;
        }

        private void printField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) {
            if (fieldDescriptor.isMapField()) {
                ArrayList<MapEntryAdapter> arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    arrayList.add(new MapEntryAdapter(obj2, fieldDescriptor));
                }
                Collections.sort(arrayList);
                for (MapEntryAdapter mapEntryAdapter : arrayList) {
                    printSingleField(fieldDescriptor, mapEntryAdapter.getEntry(), textGenerator);
                }
            } else if (fieldDescriptor.isRepeated()) {
                for (Object obj3 : (List) obj) {
                    printSingleField(fieldDescriptor, obj3, textGenerator);
                }
            } else {
                printSingleField(fieldDescriptor, obj, textGenerator);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public static class MapEntryAdapter implements Comparable<MapEntryAdapter> {
            private Object entry;
            private final Descriptors.FieldDescriptor.JavaType fieldType;
            private MapEntry mapEntry;

            Object getEntry() {
                MapEntry mapEntry = this.mapEntry;
                return mapEntry != null ? mapEntry : this.entry;
            }

            MapEntryAdapter(Object obj, Descriptors.FieldDescriptor fieldDescriptor) {
                if (obj instanceof MapEntry) {
                    this.mapEntry = (MapEntry) obj;
                } else {
                    this.entry = obj;
                }
                this.fieldType = extractFieldType(fieldDescriptor);
            }

            private static Descriptors.FieldDescriptor.JavaType extractFieldType(Descriptors.FieldDescriptor fieldDescriptor) {
                return fieldDescriptor.getMessageType().getFields().get(0).getJavaType();
            }

            Object getKey() {
                MapEntry mapEntry = this.mapEntry;
                if (mapEntry != null) {
                    return mapEntry.getKey();
                }
                return null;
            }

            @Override // java.lang.Comparable
            public int compareTo(MapEntryAdapter mapEntryAdapter) {
                if (getKey() == null || mapEntryAdapter.getKey() == null) {
                    TextFormat.logger.info("Invalid key for map field.");
                    return -1;
                }
                int i = AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[this.fieldType.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return 0;
                            }
                            String str = (String) getKey();
                            String str2 = (String) mapEntryAdapter.getKey();
                            if (str == null && str2 == null) {
                                return 0;
                            }
                            if (str != null || str2 == null) {
                                if (str == null || str2 != null) {
                                    return str.compareTo(str2);
                                }
                                return 1;
                            }
                            return -1;
                        }
                        return Integer.valueOf(((Integer) getKey()).intValue()).compareTo(Integer.valueOf(((Integer) mapEntryAdapter.getKey()).intValue()));
                    }
                    return Long.valueOf(((Long) getKey()).longValue()).compareTo(Long.valueOf(((Long) mapEntryAdapter.getKey()).longValue()));
                }
                return Boolean.valueOf(((Boolean) getKey()).booleanValue()).compareTo(Boolean.valueOf(((Boolean) mapEntryAdapter.getKey()).booleanValue()));
            }
        }

        private void printFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) {
            String replace;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[fieldDescriptor.getType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    textGenerator.print(((Integer) obj).toString());
                    return;
                case 4:
                case 5:
                case 6:
                    textGenerator.print(((Long) obj).toString());
                    return;
                case 7:
                    textGenerator.print(((Boolean) obj).toString());
                    return;
                case 8:
                    textGenerator.print(((Float) obj).toString());
                    return;
                case 9:
                    textGenerator.print(((Double) obj).toString());
                    return;
                case 10:
                case 11:
                    textGenerator.print(TextFormat.unsignedToString(((Integer) obj).intValue()));
                    return;
                case 12:
                case 13:
                    textGenerator.print(TextFormat.unsignedToString(((Long) obj).longValue()));
                    return;
                case 14:
                    textGenerator.print("\"");
                    if (this.escapeNonAscii) {
                        replace = TextFormatEscaper.escapeText((String) obj);
                    } else {
                        replace = TextFormat.escapeDoubleQuotesAndBackslashes((String) obj).replace("\n", "\\n");
                    }
                    textGenerator.print(replace);
                    textGenerator.print("\"");
                    return;
                case 15:
                    textGenerator.print("\"");
                    if (obj instanceof ByteString) {
                        textGenerator.print(TextFormat.escapeBytes((ByteString) obj));
                    } else {
                        textGenerator.print(TextFormat.escapeBytes((byte[]) obj));
                    }
                    textGenerator.print("\"");
                    return;
                case 16:
                    textGenerator.print(((Descriptors.EnumValueDescriptor) obj).getName());
                    return;
                case 17:
                case 18:
                    print((MessageOrBuilder) obj, textGenerator);
                    return;
                default:
                    return;
            }
        }

        public String printToString(MessageOrBuilder messageOrBuilder) {
            try {
                StringBuilder sb = new StringBuilder();
                print(messageOrBuilder, sb);
                return sb.toString();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public String printToString(UnknownFieldSet unknownFieldSet) {
            try {
                StringBuilder sb = new StringBuilder();
                print(unknownFieldSet, sb);
                return sb.toString();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        private static void printUnknownFieldValue(int i, Object obj, TextGenerator textGenerator) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                textGenerator.print(TextFormat.unsignedToString(((Long) obj).longValue()));
            } else if (tagWireType == 1) {
                textGenerator.print(String.format(null, "0x%016x", (Long) obj));
            } else if (tagWireType != 2) {
                if (tagWireType == 3) {
                    printUnknownFields((UnknownFieldSet) obj, textGenerator);
                } else if (tagWireType == 5) {
                    textGenerator.print(String.format(null, "0x%08x", (Integer) obj));
                } else {
                    throw new IllegalArgumentException("Bad tag: " + i);
                }
            } else {
                try {
                    UnknownFieldSet parseFrom = UnknownFieldSet.parseFrom((ByteString) obj);
                    textGenerator.print("{");
                    textGenerator.eol();
                    textGenerator.indent();
                    printUnknownFields(parseFrom, textGenerator);
                    textGenerator.outdent();
                    textGenerator.print("}");
                } catch (InvalidProtocolBufferException unused) {
                    textGenerator.print("\"");
                    textGenerator.print(TextFormat.escapeBytes((ByteString) obj));
                    textGenerator.print("\"");
                }
            }
        }

        private void printMessage(MessageOrBuilder messageOrBuilder, TextGenerator textGenerator) {
            for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : messageOrBuilder.getAllFields().entrySet()) {
                printField(entry.getKey(), entry.getValue(), textGenerator);
            }
            printUnknownFields(messageOrBuilder.getUnknownFields(), textGenerator);
        }

        private void printSingleField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) {
            if (fieldDescriptor.isExtension()) {
                textGenerator.print("[");
                if (fieldDescriptor.getContainingType().getOptions().getMessageSetWireFormat() && fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && fieldDescriptor.isOptional() && fieldDescriptor.getExtensionScope() == fieldDescriptor.getMessageType()) {
                    textGenerator.print(fieldDescriptor.getMessageType().getFullName());
                } else {
                    textGenerator.print(fieldDescriptor.getFullName());
                }
                textGenerator.print("]");
            } else if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP) {
                textGenerator.print(fieldDescriptor.getMessageType().getName());
            } else {
                textGenerator.print(fieldDescriptor.getName());
            }
            Descriptors.FieldDescriptor.JavaType javaType = fieldDescriptor.getJavaType();
            Descriptors.FieldDescriptor.JavaType javaType2 = Descriptors.FieldDescriptor.JavaType.MESSAGE;
            if (javaType == javaType2) {
                textGenerator.print(" {");
                textGenerator.eol();
                textGenerator.indent();
            } else {
                textGenerator.print(": ");
            }
            printFieldValue(fieldDescriptor, obj, textGenerator);
            if (fieldDescriptor.getJavaType() == javaType2) {
                textGenerator.outdent();
                textGenerator.print("}");
            }
            textGenerator.eol();
        }

        private static void printUnknownFields(UnknownFieldSet unknownFieldSet, TextGenerator textGenerator) {
            for (Map.Entry<Integer, UnknownFieldSet.Field> entry : unknownFieldSet.asMap().entrySet()) {
                int intValue = entry.getKey().intValue();
                UnknownFieldSet.Field value = entry.getValue();
                printUnknownField(intValue, 0, value.getVarintList(), textGenerator);
                printUnknownField(intValue, 5, value.getFixed32List(), textGenerator);
                printUnknownField(intValue, 1, value.getFixed64List(), textGenerator);
                printUnknownField(intValue, 2, value.getLengthDelimitedList(), textGenerator);
                for (UnknownFieldSet unknownFieldSet2 : value.getGroupList()) {
                    textGenerator.print(entry.getKey().toString());
                    textGenerator.print(" {");
                    textGenerator.eol();
                    textGenerator.indent();
                    printUnknownFields(unknownFieldSet2, textGenerator);
                    textGenerator.outdent();
                    textGenerator.print("}");
                    textGenerator.eol();
                }
            }
        }

        private static void printUnknownField(int i, int i2, List<?> list, TextGenerator textGenerator) {
            for (Object obj : list) {
                textGenerator.print(String.valueOf(i));
                textGenerator.print(": ");
                printUnknownFieldValue(i2, obj, textGenerator);
                textGenerator.eol();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.TextFormat$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type;

        static {
            int[] iArr = new int[Descriptors.FieldDescriptor.Type.values().length];
            $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type = iArr;
            try {
                iArr[Descriptors.FieldDescriptor.Type.INT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SINT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SFIXED32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.INT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SINT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SFIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.BOOL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.DOUBLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.FIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.UINT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.FIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.STRING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.ENUM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.GROUP.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[Descriptors.FieldDescriptor.JavaType.values().length];
            $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType = iArr2;
            try {
                iArr2[Descriptors.FieldDescriptor.JavaType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[Descriptors.FieldDescriptor.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[Descriptors.FieldDescriptor.JavaType.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[Descriptors.FieldDescriptor.JavaType.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    public static String unsignedToString(int i) {
        if (i >= 0) {
            return Integer.toString(i);
        }
        return Long.toString(i & 4294967295L);
    }

    public static String unsignedToString(long j) {
        if (j >= 0) {
            return Long.toString(j);
        }
        return BigInteger.valueOf(j & Long.MAX_VALUE).setBit(63).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TextGenerator multiLineOutput(Appendable appendable) {
        return new TextGenerator(appendable, false, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class TextGenerator {
        private boolean atStartOfLine;
        private final StringBuilder indent;
        private final Appendable output;
        private final boolean singleLineMode;

        /* synthetic */ TextGenerator(Appendable appendable, boolean z, AnonymousClass1 anonymousClass1) {
            this(appendable, z);
        }

        private TextGenerator(Appendable appendable, boolean z) {
            this.indent = new StringBuilder();
            this.atStartOfLine = false;
            this.output = appendable;
            this.singleLineMode = z;
        }

        public void indent() {
            this.indent.append("  ");
        }

        public void outdent() {
            int length = this.indent.length();
            if (length == 0) {
                throw new IllegalArgumentException(" Outdent() without matching Indent().");
            }
            this.indent.setLength(length - 2);
        }

        public void print(CharSequence charSequence) {
            if (this.atStartOfLine) {
                this.atStartOfLine = false;
                this.output.append(this.singleLineMode ? " " : this.indent);
            }
            this.output.append(charSequence);
        }

        public void eol() {
            if (!this.singleLineMode) {
                this.output.append("\n");
            }
            this.atStartOfLine = true;
        }
    }

    /* loaded from: classes2.dex */
    public static class Parser {
        private final boolean allowUnknownEnumValues;
        private final boolean allowUnknownExtensions;
        private final boolean allowUnknownFields;
        private TextFormatParseInfoTree.Builder parseInfoTreeBuilder;
        private final int recursionLimit;
        private final SingularOverwritePolicy singularOverwritePolicy;
        private final TypeRegistry typeRegistry;

        /* loaded from: classes2.dex */
        public enum SingularOverwritePolicy {
            ALLOW_SINGULAR_OVERWRITES,
            FORBID_SINGULAR_OVERWRITES
        }

        /* synthetic */ Parser(TypeRegistry typeRegistry, boolean z, boolean z2, boolean z3, SingularOverwritePolicy singularOverwritePolicy, TextFormatParseInfoTree.Builder builder, int i, AnonymousClass1 anonymousClass1) {
            this(typeRegistry, z, z2, z3, singularOverwritePolicy, builder, i);
        }

        private Parser(TypeRegistry typeRegistry, boolean z, boolean z2, boolean z3, SingularOverwritePolicy singularOverwritePolicy, TextFormatParseInfoTree.Builder builder, int i) {
            this.typeRegistry = typeRegistry;
            this.allowUnknownFields = z;
            this.allowUnknownEnumValues = z2;
            this.allowUnknownExtensions = z3;
            this.singularOverwritePolicy = singularOverwritePolicy;
            this.parseInfoTreeBuilder = builder;
            this.recursionLimit = i;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        /* loaded from: classes2.dex */
        public static class Builder {
            private boolean allowUnknownFields = false;
            private boolean allowUnknownEnumValues = false;
            private boolean allowUnknownExtensions = false;
            private SingularOverwritePolicy singularOverwritePolicy = SingularOverwritePolicy.ALLOW_SINGULAR_OVERWRITES;
            private TextFormatParseInfoTree.Builder parseInfoTreeBuilder = null;
            private TypeRegistry typeRegistry = TypeRegistry.getEmptyTypeRegistry();
            private int recursionLimit = 100;

            public Parser build() {
                return new Parser(this.typeRegistry, this.allowUnknownFields, this.allowUnknownEnumValues, this.allowUnknownExtensions, this.singularOverwritePolicy, this.parseInfoTreeBuilder, this.recursionLimit, null);
            }
        }
    }

    public static String escapeBytes(ByteString byteString) {
        return TextFormatEscaper.escapeBytes(byteString);
    }

    public static String escapeBytes(byte[] bArr) {
        return TextFormatEscaper.escapeBytes(bArr);
    }

    public static ByteString unescapeBytes(CharSequence charSequence) {
        int i;
        int i2;
        int i3;
        int length;
        ByteString copyFromUtf8 = ByteString.copyFromUtf8(charSequence.toString());
        int size = copyFromUtf8.size();
        byte[] bArr = new byte[size];
        int i4 = 0;
        int i5 = 0;
        while (i4 < copyFromUtf8.size()) {
            byte byteAt = copyFromUtf8.byteAt(i4);
            if (byteAt == 92) {
                int i6 = i4 + 1;
                if (i6 < copyFromUtf8.size()) {
                    byte byteAt2 = copyFromUtf8.byteAt(i6);
                    if (isOctal(byteAt2)) {
                        int digitValue = digitValue(byteAt2);
                        int i7 = i4 + 2;
                        if (i7 < copyFromUtf8.size() && isOctal(copyFromUtf8.byteAt(i7))) {
                            digitValue = (digitValue * 8) + digitValue(copyFromUtf8.byteAt(i7));
                            i6 = i7;
                        }
                        int i8 = i6 + 1;
                        if (i8 < copyFromUtf8.size() && isOctal(copyFromUtf8.byteAt(i8))) {
                            digitValue = (digitValue * 8) + digitValue(copyFromUtf8.byteAt(i8));
                            i6 = i8;
                        }
                        i = i5 + 1;
                        bArr[i5] = (byte) digitValue;
                    } else if (byteAt2 == 34) {
                        i = i5 + 1;
                        bArr[i5] = 34;
                    } else if (byteAt2 == 39) {
                        i = i5 + 1;
                        bArr[i5] = 39;
                    } else if (byteAt2 != 63) {
                        if (byteAt2 == 85) {
                            int i9 = i4 + 2;
                            i2 = i4 + 9;
                            if (i2 >= copyFromUtf8.size()) {
                                throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U' with too few hex chars");
                            }
                            int i10 = 0;
                            int i11 = i9;
                            while (true) {
                                if (i11 < i4 + 10) {
                                    byte byteAt3 = copyFromUtf8.byteAt(i11);
                                    if (!isHex(byteAt3)) {
                                        throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U' with too few hex chars");
                                    }
                                    i10 = (i10 << 4) | digitValue(byteAt3);
                                    i11++;
                                } else if (!Character.isValidCodePoint(i10)) {
                                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U" + copyFromUtf8.substring(i9, i3).toStringUtf8() + "' is not a valid code point value");
                                } else {
                                    Character.UnicodeBlock of = Character.UnicodeBlock.of(i10);
                                    if (of != null && (of.equals(Character.UnicodeBlock.LOW_SURROGATES) || of.equals(Character.UnicodeBlock.HIGH_SURROGATES) || of.equals(Character.UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES))) {
                                        throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U" + copyFromUtf8.substring(i9, i3).toStringUtf8() + "' refers to a surrogate code unit");
                                    }
                                    byte[] bytes = new String(new int[]{i10}, 0, 1).getBytes(Internal.UTF_8);
                                    System.arraycopy(bytes, 0, bArr, i5, bytes.length);
                                    length = bytes.length;
                                }
                            }
                        } else if (byteAt2 == 92) {
                            i = i5 + 1;
                            bArr[i5] = 92;
                        } else if (byteAt2 == 102) {
                            i = i5 + 1;
                            bArr[i5] = 12;
                        } else if (byteAt2 == 110) {
                            i = i5 + 1;
                            bArr[i5] = 10;
                        } else if (byteAt2 == 114) {
                            i = i5 + 1;
                            bArr[i5] = 13;
                        } else if (byteAt2 == 120) {
                            i6 = i4 + 2;
                            if (i6 < copyFromUtf8.size() && isHex(copyFromUtf8.byteAt(i6))) {
                                int digitValue2 = digitValue(copyFromUtf8.byteAt(i6));
                                int i12 = i4 + 3;
                                if (i12 < copyFromUtf8.size() && isHex(copyFromUtf8.byteAt(i12))) {
                                    digitValue2 = (digitValue2 * 16) + digitValue(copyFromUtf8.byteAt(i12));
                                    i6 = i12;
                                }
                                i = i5 + 1;
                                bArr[i5] = (byte) digitValue2;
                            } else {
                                throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\x' with no digits");
                            }
                        } else if (byteAt2 == 97) {
                            i = i5 + 1;
                            bArr[i5] = 7;
                        } else if (byteAt2 == 98) {
                            i = i5 + 1;
                            bArr[i5] = 8;
                        } else {
                            switch (byteAt2) {
                                case 116:
                                    i = i5 + 1;
                                    bArr[i5] = 9;
                                    break;
                                case 117:
                                    int i13 = i4 + 2;
                                    i2 = i4 + 5;
                                    if (i2 < copyFromUtf8.size() && isHex(copyFromUtf8.byteAt(i13))) {
                                        int i14 = i4 + 3;
                                        if (isHex(copyFromUtf8.byteAt(i14))) {
                                            int i15 = i4 + 4;
                                            if (isHex(copyFromUtf8.byteAt(i15)) && isHex(copyFromUtf8.byteAt(i2))) {
                                                char digitValue3 = (char) ((digitValue(copyFromUtf8.byteAt(i15)) << 4) | (digitValue(copyFromUtf8.byteAt(i13)) << 12) | (digitValue(copyFromUtf8.byteAt(i14)) << 8) | digitValue(copyFromUtf8.byteAt(i2)));
                                                if (digitValue3 >= 55296 && digitValue3 <= 57343) {
                                                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\u' refers to a surrogate");
                                                }
                                                byte[] bytes2 = Character.toString(digitValue3).getBytes(Internal.UTF_8);
                                                System.arraycopy(bytes2, 0, bArr, i5, bytes2.length);
                                                length = bytes2.length;
                                                break;
                                            }
                                        }
                                    }
                                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\u' with too few hex chars");
                                case 118:
                                    i = i5 + 1;
                                    bArr[i5] = 11;
                                    break;
                                default:
                                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\" + ((char) byteAt2) + '\'');
                            }
                        }
                        i5 += length;
                        i4 = i2;
                    } else {
                        i = i5 + 1;
                        bArr[i5] = 63;
                    }
                    i5 = i;
                    i4 = i6;
                } else {
                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\' at end of string.");
                }
            } else {
                bArr[i5] = byteAt;
                i5++;
            }
            i4++;
        }
        if (size == i5) {
            return ByteString.wrap(bArr);
        }
        return ByteString.copyFrom(bArr, 0, i5);
    }

    /* loaded from: classes2.dex */
    public static class InvalidEscapeSequenceException extends IOException {
        private static final long serialVersionUID = -8164033650142593304L;

        public InvalidEscapeSequenceException(String str) {
            super(str);
        }
    }

    public static String escapeDoubleQuotesAndBackslashes(String str) {
        return TextFormatEscaper.escapeDoubleQuotesAndBackslashes(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int parseInt32(String str) {
        return (int) parseInteger(str, true, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int parseUInt32(String str) {
        return (int) parseInteger(str, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long parseInt64(String str) {
        return parseInteger(str, true, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long parseUInt64(String str) {
        return parseInteger(str, false, true);
    }

    private static long parseInteger(String str, boolean z, boolean z2) {
        int i;
        int i2;
        int i3 = 0;
        if (str.startsWith("-", 0)) {
            if (!z) {
                throw new NumberFormatException("Number must be positive: " + str);
            }
            i3 = 1;
        }
        if (str.startsWith("0x", i3)) {
            i2 = i3 + 2;
            i = 16;
        } else {
            i = str.startsWith("0", i3) ? 8 : 10;
            i2 = i3;
        }
        String substring = str.substring(i2);
        if (substring.length() < 16) {
            long parseLong = Long.parseLong(substring, i);
            if (i3 != 0) {
                parseLong = -parseLong;
            }
            if (z2) {
                return parseLong;
            }
            if (z) {
                if (parseLong > 2147483647L || parseLong < -2147483648L) {
                    throw new NumberFormatException("Number out of range for 32-bit signed integer: " + str);
                }
                return parseLong;
            } else if (parseLong >= 4294967296L || parseLong < 0) {
                throw new NumberFormatException("Number out of range for 32-bit unsigned integer: " + str);
            } else {
                return parseLong;
            }
        }
        BigInteger bigInteger = new BigInteger(substring, i);
        if (i3 != 0) {
            bigInteger = bigInteger.negate();
        }
        if (z2) {
            if (z) {
                if (bigInteger.bitLength() > 63) {
                    throw new NumberFormatException("Number out of range for 64-bit signed integer: " + str);
                }
            } else if (bigInteger.bitLength() > 64) {
                throw new NumberFormatException("Number out of range for 64-bit unsigned integer: " + str);
            }
        } else if (z) {
            if (bigInteger.bitLength() > 31) {
                throw new NumberFormatException("Number out of range for 32-bit signed integer: " + str);
            }
        } else if (bigInteger.bitLength() > 32) {
            throw new NumberFormatException("Number out of range for 32-bit unsigned integer: " + str);
        }
        return bigInteger.longValue();
    }
}
