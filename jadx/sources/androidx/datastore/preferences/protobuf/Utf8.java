package androidx.datastore.preferences.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Utf8 {
    private static final Processor processor;

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    static {
        processor = (!UnsafeProcessor.isAvailable() || Android.isOnAndroidDevice()) ? new SafeProcessor() : new UnsafeProcessor();
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    public static boolean isValidUtf8(byte[] bArr, int i, int i2) {
        return processor.isValidUtf8(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return incompleteStateFor(b, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return incompleteStateFor(b, bArr[i]);
        }
        return incompleteStateFor(b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt >= 2048) {
                    i2 += encodedLengthGeneral(charSequence, i);
                    break;
                }
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i2 + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) < 65536) {
                        throw new UnpairedSurrogateException(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int encode(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return processor.encodeUtf8(charSequence, bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String decodeUtf8(byte[] bArr, int i, int i2) {
        return processor.decodeUtf8(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class Processor {
        abstract String decodeUtf8(byte[] bArr, int i, int i2);

        abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2);

        abstract int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3);

        Processor() {
        }

        final boolean isValidUtf8(byte[] bArr, int i, int i2) {
            return partialIsValidUtf8(0, bArr, i, i2) == 0;
        }
    }

    /* loaded from: classes2.dex */
    static final class SafeProcessor extends Processor {
        SafeProcessor() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
            if (r8[r9] > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0042, code lost:
            if (r8[r9] > (-65)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x007f, code lost:
            if (r8[r9] > (-65)) goto L51;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L85
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L18
                r7 = -62
                if (r0 < r7) goto L17
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L82
            L17:
                return r2
            L18:
                r4 = -16
                if (r0 >= r4) goto L45
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L30
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L2d
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r9)
                return r7
            L2d:
                r5 = r9
                r9 = r7
                r7 = r5
            L30:
                if (r7 > r3) goto L44
                r4 = -96
                if (r0 != r1) goto L38
                if (r7 < r4) goto L44
            L38:
                r1 = -19
                if (r0 != r1) goto L3e
                if (r7 >= r4) goto L44
            L3e:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L82
            L44:
                return r2
            L45:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5b
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L56
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r1)
                return r7
            L56:
                r9 = 0
                r5 = r9
                r9 = r7
                r7 = r5
                goto L5e
            L5b:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
            L5e:
                if (r7 != 0) goto L6e
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L6b
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$100(r0, r1, r9)
                return r7
            L6b:
                r5 = r9
                r9 = r7
                r7 = r5
            L6e:
                if (r1 > r3) goto L84
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L84
                if (r7 > r3) goto L84
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L82
                goto L84
            L82:
                r9 = r7
                goto L85
            L84:
                return r2
            L85:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.SafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        String decodeUtf8(byte[] bArr, int i, int i2) {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!DecodeUtil.isOneByte(b)) {
                    break;
                }
                i++;
                DecodeUtil.handleOneByte(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (DecodeUtil.isOneByte(b2)) {
                    DecodeUtil.handleOneByte(b2, cArr, i5);
                    i5++;
                    i = i6;
                    while (i < i3) {
                        byte b3 = bArr[i];
                        if (!DecodeUtil.isOneByte(b3)) {
                            break;
                        }
                        i++;
                        DecodeUtil.handleOneByte(b3, cArr, i5);
                        i5++;
                    }
                } else if (DecodeUtil.isTwoBytes(b2)) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    DecodeUtil.handleTwoBytes(b2, bArr[i6], cArr, i5);
                    i5++;
                } else if (DecodeUtil.isThreeBytes(b2)) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    DecodeUtil.handleThreeBytes(b2, bArr[i6], bArr[i + 2], cArr, i5);
                    i5++;
                    i += 3;
                } else if (i6 >= i3 - 2) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                } else {
                    DecodeUtil.handleFourBytes(b2, bArr[i6], bArr[i + 2], bArr[i + 3], cArr, i5);
                    i5 += 2;
                    i += 4;
                }
            }
            return new String(cArr, 0, i5);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
            return r10 + r0;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int encodeUtf8(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 255
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.SafeProcessor.encodeUtf8(java.lang.CharSequence, byte[], int, int):int");
        }

        private static int partialIsValidUtf8(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i, i2);
        }

        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i += 2;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    } else if (b >= -16) {
                        if (i3 >= i2 - 2) {
                            return Utf8.incompleteStateFor(bArr, i3, i2);
                        }
                        byte b2 = bArr[i3];
                        if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0 && bArr[i + 2] <= -65) {
                            i3 = i + 4;
                            if (bArr[i + 3] > -65) {
                            }
                        }
                        return -1;
                    } else if (i3 >= i2 - 1) {
                        return Utf8.incompleteStateFor(bArr, i3, i2);
                    } else {
                        byte b3 = bArr[i3];
                        if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                            i3 = i + 3;
                            if (bArr[i + 2] > -65) {
                            }
                        }
                        return -1;
                    }
                }
                i = i3;
            }
            return 0;
        }
    }

    /* loaded from: classes2.dex */
    static final class UnsafeProcessor extends Processor {
        UnsafeProcessor() {
        }

        static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0056, code lost:
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L56;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int partialIsValidUtf8(int r11, byte[] r12, int r13, int r14) {
            /*
                r10 = this;
                r0 = r13 | r14
                int r1 = r12.length
                int r1 = r1 - r14
                r0 = r0 | r1
                if (r0 < 0) goto La5
                long r0 = (long) r13
                long r13 = (long) r14
                if (r11 == 0) goto L9e
                int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
                if (r2 < 0) goto L10
                return r11
            L10:
                byte r2 = (byte) r11
                r3 = -32
                r4 = -1
                r5 = 1
                r7 = -65
                if (r2 >= r3) goto L29
                r11 = -62
                if (r2 < r11) goto L28
                byte r11 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r0)
                if (r11 <= r7) goto L25
                goto L28
            L25:
                long r0 = r0 + r5
                goto L9e
            L28:
                return r4
            L29:
                r8 = -16
                if (r2 >= r8) goto L5c
                int r11 = r11 >> 8
                int r11 = ~r11
                byte r11 = (byte) r11
                if (r11 != 0) goto L43
                long r8 = r0 + r5
                byte r11 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L42
                int r11 = androidx.datastore.preferences.protobuf.Utf8.access$000(r2, r11)
                return r11
            L42:
                r0 = r8
            L43:
                if (r11 > r7) goto L5b
                r8 = -96
                if (r2 != r3) goto L4b
                if (r11 < r8) goto L5b
            L4b:
                r3 = -19
                if (r2 != r3) goto L51
                if (r11 >= r8) goto L5b
            L51:
                long r5 = r5 + r0
                byte r11 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r0)
                if (r11 <= r7) goto L59
                goto L5b
            L59:
                r0 = r5
                goto L9e
            L5b:
                return r4
            L5c:
                int r3 = r11 >> 8
                int r3 = ~r3
                byte r3 = (byte) r3
                if (r3 != 0) goto L74
                long r8 = r0 + r5
                byte r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r0)
                int r11 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r11 < 0) goto L71
                int r11 = androidx.datastore.preferences.protobuf.Utf8.access$000(r2, r3)
                return r11
            L71:
                r11 = 0
                r0 = r8
                goto L77
            L74:
                int r11 = r11 >> 16
                byte r11 = (byte) r11
            L77:
                if (r11 != 0) goto L89
                long r8 = r0 + r5
                byte r11 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L88
                int r11 = androidx.datastore.preferences.protobuf.Utf8.access$100(r2, r3, r11)
                return r11
            L88:
                r0 = r8
            L89:
                if (r3 > r7) goto L9d
                int r2 = r2 << 28
                int r3 = r3 + 112
                int r2 = r2 + r3
                int r2 = r2 >> 30
                if (r2 != 0) goto L9d
                if (r11 > r7) goto L9d
                long r5 = r5 + r0
                byte r11 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r0)
                if (r11 <= r7) goto L59
            L9d:
                return r4
            L9e:
                long r13 = r13 - r0
                int r11 = (int) r13
                int r11 = partialIsValidUtf8(r12, r0, r11)
                return r11
            La5:
                int r11 = r12.length
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
                java.lang.Object[] r11 = new java.lang.Object[]{r11, r12, r13}
                java.lang.ArrayIndexOutOfBoundsException r12 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.String r13 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r11 = java.lang.String.format(r13, r11)
                r12.<init>(r11)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        String decodeUtf8(byte[] bArr, int i, int i2) {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = UnsafeUtil.getByte(bArr, i);
                if (!DecodeUtil.isOneByte(b)) {
                    break;
                }
                i++;
                DecodeUtil.handleOneByte(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = UnsafeUtil.getByte(bArr, i);
                if (DecodeUtil.isOneByte(b2)) {
                    DecodeUtil.handleOneByte(b2, cArr, i5);
                    i5++;
                    i = i6;
                    while (i < i3) {
                        byte b3 = UnsafeUtil.getByte(bArr, i);
                        if (!DecodeUtil.isOneByte(b3)) {
                            break;
                        }
                        i++;
                        DecodeUtil.handleOneByte(b3, cArr, i5);
                        i5++;
                    }
                } else if (DecodeUtil.isTwoBytes(b2)) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    DecodeUtil.handleTwoBytes(b2, UnsafeUtil.getByte(bArr, i6), cArr, i5);
                    i5++;
                } else if (DecodeUtil.isThreeBytes(b2)) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    DecodeUtil.handleThreeBytes(b2, UnsafeUtil.getByte(bArr, i6), UnsafeUtil.getByte(bArr, i + 2), cArr, i5);
                    i5++;
                    i += 3;
                } else if (i6 >= i3 - 2) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                } else {
                    DecodeUtil.handleFourBytes(b2, UnsafeUtil.getByte(bArr, i6), UnsafeUtil.getByte(bArr, i + 2), UnsafeUtil.getByte(bArr, i + 3), cArr, i5);
                    i5 += 2;
                    i += 4;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2) {
            long j;
            String str;
            String str2;
            long j2;
            int i3;
            char charAt;
            long j3 = i;
            long j4 = i2 + j3;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(bArr, j3, (byte) charAt);
                i4++;
                j3++;
            }
            if (i4 == length) {
                return (int) j3;
            }
            while (i4 < length) {
                char charAt2 = charSequence.charAt(i4);
                if (charAt2 >= 128 || j3 >= j4) {
                    if (charAt2 < 2048 && j3 <= j4 - 2) {
                        UnsafeUtil.putByte(bArr, j3, (byte) ((charAt2 >>> 6) | 960));
                        j2 = 2 + j3;
                        UnsafeUtil.putByte(bArr, j3 + j, (byte) ((charAt2 & '?') | 128));
                        str = str3;
                        str2 = str4;
                    } else if ((charAt2 >= 55296 && 57343 >= charAt2) || j3 > j4 - 3) {
                        str = str3;
                        str2 = str4;
                        if (j3 <= j4 - 4) {
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char charAt3 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    UnsafeUtil.putByte(bArr, j3, (byte) ((codePoint >>> 18) | 240));
                                    UnsafeUtil.putByte(bArr, j3 + j, (byte) (((codePoint >>> 12) & 63) | 128));
                                    UnsafeUtil.putByte(bArr, j3 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    UnsafeUtil.putByte(bArr, j3 + 3, (byte) ((codePoint & 63) | 128));
                                    j3 = 4 + j3;
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new UnpairedSurrogateException(i4 - 1, length);
                        } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                            throw new UnpairedSurrogateException(i4, length);
                        } else {
                            throw new ArrayIndexOutOfBoundsException(str2 + charAt2 + str + j3);
                        }
                    } else {
                        UnsafeUtil.putByte(bArr, j3, (byte) ((charAt2 >>> '\f') | 480));
                        str = str3;
                        str2 = str4;
                        UnsafeUtil.putByte(bArr, j3 + j, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j2 = j3 + 3;
                        UnsafeUtil.putByte(bArr, j3 + 2, (byte) ((charAt2 & '?') | 128));
                    }
                    j3 = j2;
                } else {
                    UnsafeUtil.putByte(bArr, j3, (byte) charAt2);
                    j3 += j;
                    str = str3;
                    str2 = str4;
                }
                i4++;
                str3 = str;
                str4 = str2;
                j = 1;
            }
            return (int) j3;
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            while (i2 < i) {
                if (UnsafeUtil.getByte(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j++;
            }
            return i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int partialIsValidUtf8(byte[] r10, long r11, int r13) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L39
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L38
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r0 <= r6) goto L36
                goto L38
            L36:
                long r11 = r11 + r2
                goto L7
            L38:
                return r5
            L39:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L47
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L47:
                int r13 = r13 + (-3)
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L55
                if (r0 < r7) goto L64
            L55:
                r4 = -19
                if (r1 != r4) goto L5b
                if (r0 >= r7) goto L64
            L5b:
                long r0 = r11 + r8
                long r11 = r11 + r2
                byte r11 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r11 <= r6) goto L90
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r0 > r6) goto L93
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L93
                long r2 = r2 + r11
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r2)
                if (r0 > r6) goto L93
                r0 = 3
                long r0 = r0 + r11
                long r11 = r11 + r8
                byte r11 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r11 <= r6) goto L90
                goto L93
            L90:
                r11 = r0
                goto L7
            L93:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(byte[], long, int):int");
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i, long j, int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(bArr, j), UnsafeUtil.getByte(bArr, j + 1));
                    }
                    throw new AssertionError();
                }
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(bArr, j));
            }
            return Utf8.incompleteStateFor(i);
        }
    }

    /* loaded from: classes2.dex */
    static class DecodeUtil {
        private static char highSurrogate(int i) {
            return (char) ((i >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b) {
            return b > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b) {
            return b >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b) {
            return b < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b) {
            return b < -32;
        }

        private static char lowSurrogate(int i) {
            return (char) ((i & 1023) + 56320);
        }

        private static int trailingByteValue(byte b) {
            return b & 63;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte b, byte b2, char[] cArr, int i) {
            if (b < -62 || isNotTrailingByte(b2)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & 31) << 6) | trailingByteValue(b2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte b, byte b2, byte b3, char[] cArr, int i) {
            if (isNotTrailingByte(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || isNotTrailingByte(b3)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & 15) << 12) | (trailingByteValue(b2) << 6) | trailingByteValue(b3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
            if (isNotTrailingByte(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || isNotTrailingByte(b3) || isNotTrailingByte(b4)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int trailingByteValue = ((b & 7) << 18) | (trailingByteValue(b2) << 12) | (trailingByteValue(b3) << 6) | trailingByteValue(b4);
            cArr[i] = highSurrogate(trailingByteValue);
            cArr[i + 1] = lowSurrogate(trailingByteValue);
        }
    }
}
