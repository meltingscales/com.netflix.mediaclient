package com.netflix.ale;

import o.C8545dpo;
import o.C8632dsu;
import o.C8674dui;

/* loaded from: classes5.dex */
public final class AleUtilImpl implements AleUtil {
    @Override // com.netflix.ale.AleUtil
    public byte[] stringToUtf8Bytes(String str) {
        C8632dsu.c((Object) str, "");
        byte[] bytes = str.getBytes(C8674dui.i);
        C8632dsu.a(bytes, "");
        return bytes;
    }

    @Override // com.netflix.ale.AleUtil
    public String utf8BytesToString(byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        return new String(bArr, C8674dui.i);
    }

    @Override // com.netflix.ale.AleUtil
    public String bytesToBase64Url(byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        byte[] e = C8545dpo.b().c().e(bArr);
        C8632dsu.a(e, "");
        return new String(e, C8674dui.i);
    }

    @Override // com.netflix.ale.AleUtil
    public byte[] base64ToBytes(String str) {
        C8632dsu.c((Object) str, "");
        byte[] a = C8545dpo.c().a(str);
        C8632dsu.a(a, "");
        return a;
    }
}
