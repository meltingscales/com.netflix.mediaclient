package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: classes6.dex */
public class SICBlockCipher extends StreamBlockCipher implements CTRModeCipher {
    private byte[] IV;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    private byte[] counter;
    private byte[] counterOut;

    public SICBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.counter = new byte[blockSize];
        this.counterOut = new byte[blockSize];
        this.byteCount = 0;
    }

    private void checkLastIncrement() {
        byte[] bArr = this.IV;
        if (bArr.length < this.blockSize && this.counter[bArr.length - 1] != bArr[bArr.length - 1]) {
            throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
        }
    }

    private void incrementCounter() {
        byte b;
        int length = this.counter.length;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b = (byte) (bArr[length] + 1);
            bArr[length] = b;
        } while (b == 0);
    }

    public static CTRModeCipher newInstance(BlockCipher blockCipher) {
        return new SICBlockCipher(blockCipher);
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b) {
        int i = this.byteCount;
        if (i == 0) {
            checkLastIncrement();
            this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
            byte[] bArr = this.counterOut;
            int i2 = this.byteCount;
            this.byteCount = i2 + 1;
            return (byte) (b ^ bArr[i2]);
        }
        byte[] bArr2 = this.counterOut;
        int i3 = i + 1;
        this.byteCount = i3;
        byte b2 = (byte) (b ^ bArr2[i]);
        if (i3 == this.counter.length) {
            this.byteCount = 0;
            incrementCounter();
        }
        return b2;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] clone = Arrays.clone(parametersWithIV.getIV());
        this.IV = clone;
        int i = this.blockSize;
        if (i < clone.length) {
            throw new IllegalArgumentException("CTR/SIC mode requires IV no greater than: " + this.blockSize + " bytes.");
        }
        int i2 = i / 2;
        if (8 <= i2) {
            i2 = 8;
        }
        if (i - clone.length <= i2) {
            if (parametersWithIV.getParameters() != null) {
                this.cipher.init(true, parametersWithIV.getParameters());
            }
            reset();
            return;
        }
        throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.blockSize - i2) + " bytes.");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.byteCount != 0) {
            processBytes(bArr, i, this.blockSize, bArr2, i2);
        } else {
            int i3 = this.blockSize;
            if (i + i3 > bArr.length) {
                throw new DataLengthException("input buffer too small");
            }
            if (i3 + i2 > bArr2.length) {
                throw new OutputLengthException("output buffer too short");
            }
            this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
            for (int i4 = 0; i4 < this.blockSize; i4++) {
                bArr2[i2 + i4] = (byte) (bArr[i + i4] ^ this.counterOut[i4]);
            }
            incrementCounter();
        }
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte b;
        if (i + i2 <= bArr.length) {
            if (i3 + i2 <= bArr2.length) {
                for (int i4 = 0; i4 < i2; i4++) {
                    int i5 = this.byteCount;
                    if (i5 == 0) {
                        checkLastIncrement();
                        this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
                        byte b2 = bArr[i + i4];
                        byte[] bArr3 = this.counterOut;
                        int i6 = this.byteCount;
                        this.byteCount = i6 + 1;
                        b = (byte) (b2 ^ bArr3[i6]);
                    } else {
                        byte b3 = bArr[i + i4];
                        byte[] bArr4 = this.counterOut;
                        int i7 = i5 + 1;
                        this.byteCount = i7;
                        b = (byte) (bArr4[i5] ^ b3);
                        if (i7 == this.counter.length) {
                            this.byteCount = 0;
                            incrementCounter();
                        }
                    }
                    bArr2[i3 + i4] = b;
                }
                return i2;
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new DataLengthException("input buffer too small");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        Arrays.fill(this.counter, (byte) 0);
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.counter, 0, bArr.length);
        this.cipher.reset();
        this.byteCount = 0;
    }
}
