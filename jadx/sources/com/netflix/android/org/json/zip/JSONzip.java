package com.netflix.android.org.json.zip;

import com.netflix.ale.AleCryptoBouncyCastle;
import org.linphone.core.Privacy;

/* loaded from: classes5.dex */
public abstract class JSONzip implements None, PostMortem {
    public static final long int14 = 16384;
    public static final long int4 = 16;
    public static final long int7 = 128;
    public static final int maxSubstringLength = 10;
    public static final int minSubstringLength = 3;
    public static final boolean probe = false;
    public static final int substringLimit = 40;
    public static final int zipArrayString = 6;
    public static final int zipArrayValue = 7;
    public static final int zipEmptyArray = 1;
    public static final int zipEmptyObject = 0;
    public static final int zipFalse = 3;
    public static final int zipNull = 4;
    public static final int zipObject = 5;
    public static final int zipTrue = 2;
    protected final Huff namehuff;
    protected final MapKeep namekeep;
    protected final MapKeep stringkeep;
    protected final Huff substringhuff;
    protected final TrieKeep substringkeep;
    protected final MapKeep values;
    public static final int end = 256;
    public static final int[] twos = {1, 2, 4, 8, 16, 32, 64, 128, end, 512, 1024, 2048, 4096, 8192, 16384, Privacy.DEFAULT, AleCryptoBouncyCastle.MAX_RANDOM_BYTES};
    public static final byte[] bcd = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 46, 45, 43, 69};
    public static final int endOfNumber = 14;

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONzip() {
        Huff huff = new Huff(257);
        this.namehuff = huff;
        this.namekeep = new MapKeep(9);
        this.stringkeep = new MapKeep(11);
        Huff huff2 = new Huff(257);
        this.substringhuff = huff2;
        this.substringkeep = new TrieKeep(12);
        this.values = new MapKeep(10);
        huff.tick(32, 125);
        huff.tick(97, 122);
        huff.tick(end);
        huff.tick(end);
        huff2.tick(32, 125);
        huff2.tick(97, 122);
        huff2.tick(end);
        huff2.tick(end);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void begin() {
        this.namehuff.generate();
        this.substringhuff.generate();
    }

    static void log() {
        log("\n");
    }

    static void log(int i) {
        log(i + " ");
    }

    static void log(int i, int i2) {
        log(i + ":" + i2 + " ");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void log(String str) {
        System.out.print(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void logchar(int i, int i2) {
        if (i > 32 && i <= 125) {
            log("'" + ((char) i) + "':" + i2 + " ");
            return;
        }
        log(i, i2);
    }

    @Override // com.netflix.android.org.json.zip.PostMortem
    public boolean postMortem(PostMortem postMortem) {
        JSONzip jSONzip = (JSONzip) postMortem;
        return this.namehuff.postMortem(jSONzip.namehuff) && this.namekeep.postMortem(jSONzip.namekeep) && this.stringkeep.postMortem(jSONzip.stringkeep) && this.substringhuff.postMortem(jSONzip.substringhuff) && this.substringkeep.postMortem(jSONzip.substringkeep) && this.values.postMortem(jSONzip.values);
    }
}
