package com.netflix.msl.io;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public enum MslEncodingSymbol {
    signaturealgorithm(0),
    encryptionalgorithm(1),
    hmackey(2),
    identity(3),
    signaturekey(4),
    encryptionkey(5),
    ciphertext(6),
    sha256(7),
    keyid(8),
    iv(9),
    sessiondata(10),
    renewalwindow(11),
    serialnumber(12),
    expiration(13),
    sequencenumber(14),
    tokendata(15),
    signature(16),
    servicetokens(17),
    useridtoken(18),
    handshake(19),
    sender(20),
    renewable(21),
    messageid(22),
    keyresponsedata(23),
    timestamp(24),
    mtserialnumber(25),
    encrypted(26),
    name(27),
    servicedata(28),
    userdata(29),
    scheme(30),
    keydata(31),
    mastertoken(32),
    headerdata(33),
    entityauthdata(34),
    authdata(35),
    capabilities(36),
    languages(37),
    compressionalgos(38),
    encoderformats(39),
    nonreplayable(40),
    nonreplayableid(41),
    keyrequestdata(42),
    uitserialnumber(43),
    compressionalgo(44),
    issuerdata(45),
    entityauthscheme(46),
    userauthdata(47),
    es(48),
    ke(49),
    keyrequest(50),
    mechanism(51),
    netflixidentity(52),
    publickey(53),
    profileguid(54),
    pin(55),
    securenetflixid(56),
    mdxauthdata(57),
    parametersid(58),
    keypairid(59),
    netflixid(60),
    cticket(61),
    data(62),
    endofmsg(63),
    payload(64),
    wrapdata(65),
    token(66),
    seqNumUpdateFailed(67),
    pubkeyid(68),
    password(69),
    email(70),
    internalcode(71),
    usermsg(72),
    errorcode(73),
    errormsg(74),
    errordata(75),
    cdmkeyresponse(76),
    encryptionkeyid(77),
    hmackeyid(78),
    x509chain(79),
    devtype(80),
    mgkid(81),
    CDMID(82),
    dmsRegister(83),
    passwordVersion(84),
    signoutCounter(85),
    auxinfo(86),
    entityidentity(87),
    sc(88),
    m(89),
    sf(90),
    pv(91),
    so(92),
    cp(93),
    requirements(94),
    pdi(95);
    
    private static final int aR = values().length;
    private static final Map<Integer, MslEncodingSymbol> aS;
    private static final Map<String, MslEncodingSymbol> aT;
    private static final Set<String> aY;
    private final int aW;

    int b() {
        return this.aW;
    }

    static {
        MslEncodingSymbol[] values;
        MslEncodingSymbol[] values2;
        HashMap hashMap = new HashMap(values().length);
        for (MslEncodingSymbol mslEncodingSymbol : values()) {
            hashMap.put(mslEncodingSymbol.name(), mslEncodingSymbol);
        }
        aT = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap(values().length);
        for (MslEncodingSymbol mslEncodingSymbol2 : values()) {
            hashMap2.put(Integer.valueOf(mslEncodingSymbol2.b()), mslEncodingSymbol2);
        }
        aS = Collections.unmodifiableMap(hashMap2);
        aY = new LinkedHashSet();
    }

    MslEncodingSymbol(int i) {
        this.aW = i;
    }

    public static Integer a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("MslSymbolTable lookup null key");
        }
        MslEncodingSymbol mslEncodingSymbol = aT.get(str);
        if (mslEncodingSymbol == null) {
            Set<String> set = aY;
            if (set.size() < 64) {
                set.add(str);
                return null;
            }
            return null;
        }
        return Integer.valueOf(mslEncodingSymbol.b());
    }

    public static String e(String str) {
        if (c(str)) {
            try {
                return d(Integer.valueOf(Integer.parseInt(str)).intValue());
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static String d(int i) {
        MslEncodingSymbol mslEncodingSymbol = aS.get(Integer.valueOf(i));
        if (mslEncodingSymbol == null) {
            return null;
        }
        return mslEncodingSymbol.name();
    }

    public static boolean b(String str) {
        return aT.containsKey(str);
    }

    private static boolean c(CharSequence charSequence) {
        if (a(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
}
