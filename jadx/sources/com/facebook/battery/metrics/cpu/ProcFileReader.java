package com.facebook.battery.metrics.cpu;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
class ProcFileReader {
    private final byte[] mBuffer;
    private int mBufferSize;
    private char mChar;
    private RandomAccessFile mFile;
    private boolean mIsValid;
    private final String mPath;
    private int mPosition;
    private char mPrev;
    private boolean mRewound;

    public boolean isValid() {
        return this.mIsValid;
    }

    public ProcFileReader(String str) {
        this(str, 512);
    }

    public ProcFileReader(String str, int i) {
        this.mPosition = -1;
        this.mIsValid = true;
        this.mRewound = false;
        this.mPath = str;
        this.mBuffer = new byte[i];
    }

    public ProcFileReader start() {
        return reset();
    }

    public ProcFileReader reset() {
        this.mIsValid = true;
        RandomAccessFile randomAccessFile = this.mFile;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.seek(0L);
            } catch (IOException unused) {
                close();
            }
        }
        if (this.mFile == null) {
            try {
                this.mFile = new RandomAccessFile(this.mPath, "r");
            } catch (IOException unused2) {
                this.mIsValid = false;
                close();
            }
        }
        if (this.mIsValid) {
            this.mPosition = -1;
            this.mBufferSize = 0;
            this.mChar = (char) 0;
            this.mPrev = (char) 0;
            this.mRewound = false;
        }
        return this;
    }

    public boolean hasNext() {
        RandomAccessFile randomAccessFile;
        int i;
        int i2;
        if (!this.mIsValid || (randomAccessFile = this.mFile) == null || (i = this.mPosition) > (i2 = this.mBufferSize - 1)) {
            return false;
        }
        if (i < i2) {
            return true;
        }
        try {
            this.mBufferSize = randomAccessFile.read(this.mBuffer);
            this.mPosition = -1;
        } catch (IOException unused) {
            this.mIsValid = false;
            close();
        }
        return hasNext();
    }

    private void next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.mPosition + 1;
        this.mPosition = i;
        this.mPrev = this.mChar;
        this.mChar = (char) this.mBuffer[i];
        this.mRewound = false;
    }

    private void rewind() {
        if (this.mRewound) {
            throw new ParseException("Can only rewind one step!");
        }
        this.mPosition--;
        this.mChar = this.mPrev;
        this.mRewound = true;
    }

    public long readNumber() {
        long j = 0;
        boolean z = true;
        while (true) {
            if (!hasNext()) {
                break;
            }
            next();
            if (Character.isDigit(this.mChar)) {
                j = (j * 10) + (this.mChar - '0');
                z = false;
            } else if (z) {
                throw new ParseException("Couldn't read number!");
            } else {
                rewind();
            }
        }
        return j;
    }

    public void skipSpaces() {
        skipPast(' ');
    }

    public void skipLines() {
        skipPast('\n');
    }

    public void skipPast(char c) {
        boolean z = false;
        while (hasNext()) {
            next();
            if (this.mChar == c) {
                z = true;
            } else if (z) {
                rewind();
                return;
            }
        }
    }

    public void close() {
        RandomAccessFile randomAccessFile = this.mFile;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.mFile = null;
                throw th;
            }
            this.mFile = null;
        }
    }

    /* loaded from: classes2.dex */
    public static class ParseException extends RuntimeException {
        public ParseException(String str) {
            super(str);
        }
    }
}
