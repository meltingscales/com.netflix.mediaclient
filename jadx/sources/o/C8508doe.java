package o;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Objects;

/* renamed from: o.doe  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8508doe extends Charset {
    public static final C8508doe e = new C8508doe();

    /* renamed from: o.doe$d */
    /* loaded from: classes6.dex */
    static class d extends CharsetDecoder {
        private d(Charset charset) {
            super(charset, 1.0f, 1.0f);
        }

        private CoderResult d(ByteBuffer byteBuffer, CharBuffer charBuffer) {
            CoderResult coderResult;
            int position = byteBuffer.position();
            while (true) {
                try {
                    if (!byteBuffer.hasRemaining()) {
                        coderResult = CoderResult.UNDERFLOW;
                        break;
                    }
                    byte b = byteBuffer.get();
                    if (!charBuffer.hasRemaining()) {
                        coderResult = CoderResult.OVERFLOW;
                        break;
                    }
                    charBuffer.put((char) (b & 255));
                    position++;
                } finally {
                    ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(position);
                }
            }
            return coderResult;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0, types: [java.nio.Buffer, java.nio.ByteBuffer] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v6, types: [java.nio.CharBuffer] */
        /* JADX WARN: Type inference failed for: r9v7, types: [java.nio.ByteBuffer] */
        private CoderResult e(ByteBuffer byteBuffer, CharBuffer charBuffer) {
            CoderResult coderResult;
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int arrayOffset2 = byteBuffer.arrayOffset() + byteBuffer.limit();
            if (arrayOffset > arrayOffset2) {
                arrayOffset = arrayOffset2;
            }
            char[] array2 = charBuffer.array();
            int arrayOffset3 = charBuffer.arrayOffset() + charBuffer.position();
            int arrayOffset4 = charBuffer.arrayOffset() + charBuffer.limit();
            if (arrayOffset3 > arrayOffset4) {
                arrayOffset3 = arrayOffset4;
            }
            while (true) {
                if (arrayOffset >= arrayOffset2) {
                    coderResult = CoderResult.UNDERFLOW;
                    break;
                }
                try {
                    byte b = array[arrayOffset];
                    if (arrayOffset3 >= arrayOffset4) {
                        coderResult = CoderResult.OVERFLOW;
                        break;
                    }
                    int i = arrayOffset3 + 1;
                    try {
                        array2[arrayOffset3] = (char) (b & 255);
                        arrayOffset++;
                        arrayOffset3 = i;
                    } catch (Throwable th) {
                        th = th;
                        arrayOffset3 = i;
                        ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(arrayOffset - byteBuffer.arrayOffset());
                        CharBuffer charBuffer2 = (CharBuffer) charBuffer.position(arrayOffset3 - charBuffer.arrayOffset());
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            arrayOffset -= byteBuffer.arrayOffset();
            ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.position(arrayOffset);
            arrayOffset3 -= charBuffer.arrayOffset();
            byteBuffer = (CharBuffer) charBuffer.position(arrayOffset3);
            return coderResult;
        }

        @Override // java.nio.charset.CharsetDecoder
        protected CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
            return (byteBuffer.hasArray() && charBuffer.hasArray()) ? e(byteBuffer, charBuffer) : d(byteBuffer, charBuffer);
        }
    }

    /* renamed from: o.doe$e */
    /* loaded from: classes6.dex */
    static class e extends CharsetEncoder {
        private final C8512doi e;

        private e(Charset charset) {
            super(charset, 1.0f, 1.0f);
            this.e = new C8512doi();
        }

        private static int a(char[] cArr, int i, byte[] bArr, int i2, int i3) {
            int i4 = 0;
            while (i4 < i3) {
                char c = cArr[i];
                if (c > 255) {
                    break;
                }
                bArr[i2] = (byte) c;
                i4++;
                i++;
                i2++;
            }
            return i4;
        }

        private static int b(char[] cArr, int i, byte[] bArr, int i2, int i3) {
            if (i3 <= 0) {
                return 0;
            }
            d(cArr, i, bArr, i2, i3);
            return a(cArr, i, bArr, i2, i3);
        }

        private CoderResult b(CharBuffer charBuffer, ByteBuffer byteBuffer) {
            char[] array = charBuffer.array();
            int arrayOffset = charBuffer.arrayOffset();
            int position = charBuffer.position() + arrayOffset;
            int limit = charBuffer.limit() + arrayOffset;
            if (position > limit) {
                position = limit;
            }
            byte[] array2 = byteBuffer.array();
            int arrayOffset2 = byteBuffer.arrayOffset();
            int position2 = byteBuffer.position() + arrayOffset2;
            int limit2 = byteBuffer.limit() + arrayOffset2;
            if (position2 > limit2) {
                position2 = limit2;
            }
            int i = limit2 - position2;
            int i2 = limit - position;
            if (i >= i2) {
                i = i2;
            }
            try {
                int b = b(array, position, array2, position2, i);
                int i3 = position + b;
                int i4 = position2 + b;
                CoderResult e = b != i ? this.e.c(array[i3], array, i3, limit) < 0 ? this.e.e() : this.e.b() : i < i2 ? CoderResult.OVERFLOW : CoderResult.UNDERFLOW;
                CharBuffer charBuffer2 = (CharBuffer) charBuffer.position(i3 - arrayOffset);
                ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(i4 - arrayOffset2);
                return e;
            } catch (Throwable th) {
                CharBuffer charBuffer3 = (CharBuffer) charBuffer.position(position - arrayOffset);
                ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.position(position2 - arrayOffset2);
                throw th;
            }
        }

        private CoderResult c(CharBuffer charBuffer, ByteBuffer byteBuffer) {
            CoderResult coderResult;
            int position = charBuffer.position();
            while (true) {
                try {
                    if (!charBuffer.hasRemaining()) {
                        coderResult = CoderResult.UNDERFLOW;
                        break;
                    }
                    char c = charBuffer.get();
                    if (c > 255) {
                        coderResult = this.e.e(c, charBuffer) < 0 ? this.e.e() : this.e.b();
                    } else if (!byteBuffer.hasRemaining()) {
                        coderResult = CoderResult.OVERFLOW;
                        break;
                    } else {
                        byteBuffer.put((byte) c);
                        position++;
                    }
                } finally {
                    CharBuffer charBuffer2 = (CharBuffer) charBuffer.position(position);
                }
            }
            return coderResult;
        }

        private static void d(char[] cArr, int i, byte[] bArr, int i2, int i3) {
            Objects.requireNonNull(cArr);
            Objects.requireNonNull(bArr);
            if (i < 0 || i >= cArr.length) {
                throw new ArrayIndexOutOfBoundsException(i);
            }
            if (i2 < 0 || i2 >= bArr.length) {
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            int i4 = (i + i3) - 1;
            if (i4 < 0 || i4 >= cArr.length) {
                throw new ArrayIndexOutOfBoundsException(i4);
            }
            int i5 = (i2 + i3) - 1;
            if (i5 < 0 || i5 >= bArr.length) {
                throw new ArrayIndexOutOfBoundsException(i5);
            }
        }

        @Override // java.nio.charset.CharsetEncoder
        public boolean canEncode(char c) {
            return c <= 255;
        }

        @Override // java.nio.charset.CharsetEncoder
        protected CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
            return (charBuffer.hasArray() && byteBuffer.hasArray()) ? b(charBuffer, byteBuffer) : c(charBuffer, byteBuffer);
        }

        @Override // java.nio.charset.CharsetEncoder
        public boolean isLegalReplacement(byte[] bArr) {
            return true;
        }
    }

    public C8508doe() {
        super("ISO-8859-1", AbstractC8511doh.d());
    }

    @Override // java.nio.charset.Charset
    public boolean contains(Charset charset) {
        return charset instanceof C8508doe;
    }

    @Override // java.nio.charset.Charset
    public CharsetDecoder newDecoder() {
        return new d(this);
    }

    @Override // java.nio.charset.Charset
    public CharsetEncoder newEncoder() {
        return new e(this);
    }
}
