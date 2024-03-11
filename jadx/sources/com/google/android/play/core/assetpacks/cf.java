package com.google.android.play.core.assetpacks;

import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class cf {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("ExtractChunkTaskHandler");
    private final byte[] b = new byte[8192];
    private final bh c;
    private final co d;
    private final eb e;
    private final com.google.android.play.core.assetpacks.internal.aq f;
    private final com.google.android.play.core.assetpacks.internal.aq g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cf(bh bhVar, com.google.android.play.core.assetpacks.internal.aq aqVar, com.google.android.play.core.assetpacks.internal.aq aqVar2, co coVar, eb ebVar) {
        this.c = bhVar;
        this.f = aqVar;
        this.g = aqVar2;
        this.d = coVar;
        this.e = ebVar;
    }

    private final File b(ce ceVar) {
        File p = this.c.p(ceVar.l, ceVar.a, ceVar.b, ceVar.d);
        if (!p.exists()) {
            p.mkdirs();
        }
        return p;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:4|5|(1:7)(2:113|114)|8|9|(2:11|(12:13|(1:(1:(2:17|(1:19)(2:83|84))(2:85|86))(2:87|(10:89|(7:22|(4:23|(2:27|(1:36)(4:31|(1:33)|34|35))|37|(1:39)(1:63))|41|42|(1:44)|45|(2:47|(1:49)(2:50|(1:52)(3:53|(2:55|(1:57)(2:59|60))(1:62)|58))))|64|65|(2:77|78)|67|68|69|70|(2:72|73)(1:74))(2:90|91)))(2:92|(4:94|(4:95|(1:97)|98|(1:101)(1:107))|104|(1:106))(2:108|109))|20|(0)|64|65|(0)|67|68|69|70|(0)(0))(2:110|111))|112|(0)|64|65|(0)|67|68|69|70|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02e0, code lost:
        com.google.android.play.core.assetpacks.cf.a.e("Could not close file for chunk %s of slice %s of pack %s.", java.lang.Integer.valueOf(r23.f), r23.d, r23.l);
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x028c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0177 A[Catch: all -> 0x0324, TryCatch #2 {IOException -> 0x0342, blocks: (B:5:0x002b, B:90:0x0283, B:8:0x0036, B:11:0x003d, B:13:0x0042, B:15:0x0051, B:19:0x005b, B:52:0x0177, B:53:0x0180, B:55:0x018a, B:57:0x0190, B:59:0x0196, B:61:0x019c, B:63:0x01c0, B:64:0x01cc, B:65:0x01d0, B:66:0x01d7, B:68:0x01dd, B:70:0x01e3, B:72:0x01e9, B:73:0x01f9, B:75:0x01ff, B:77:0x0205, B:78:0x0218, B:80:0x021e, B:81:0x022d, B:83:0x0233, B:89:0x0274, B:86:0x025b, B:87:0x0262, B:88:0x0263, B:22:0x0073, B:23:0x007c, B:24:0x007d, B:25:0x0096, B:26:0x0097, B:28:0x00be, B:29:0x00ca, B:30:0x00d3, B:31:0x00d4, B:33:0x00f2, B:34:0x0104, B:36:0x0117, B:37:0x011c, B:42:0x012a, B:44:0x0133, B:46:0x014a, B:47:0x0153, B:48:0x0154, B:49:0x0173), top: B:120:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.play.core.assetpacks.ce r23) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.cf.a(com.google.android.play.core.assetpacks.ce):void");
    }
}
