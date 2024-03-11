package org.xbill.DNS;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class SetResponse {
    private List<RRset> data;
    private int type;
    private static final SetResponse unknown = new SetResponse(0);
    private static final SetResponse nxdomain = new SetResponse(1);
    private static final SetResponse nxrrset = new SetResponse(2);

    public List<RRset> answers() {
        if (this.type != 6) {
            return null;
        }
        return this.data;
    }

    public boolean isCNAME() {
        return this.type == 4;
    }

    public boolean isDNAME() {
        return this.type == 5;
    }

    public boolean isDelegation() {
        return this.type == 3;
    }

    public boolean isNXDOMAIN() {
        return this.type == 1;
    }

    public boolean isNXRRSET() {
        return this.type == 2;
    }

    public boolean isSuccessful() {
        return this.type == 6;
    }

    private SetResponse() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SetResponse(int i, RRset rRset) {
        if (i < 0 || i > 6) {
            throw new IllegalArgumentException("invalid type");
        }
        this.type = i;
        ArrayList arrayList = new ArrayList();
        this.data = arrayList;
        arrayList.add(rRset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SetResponse(int i) {
        if (i < 0 || i > 6) {
            throw new IllegalArgumentException("invalid type");
        }
        this.type = i;
        this.data = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SetResponse ofType(int i) {
        switch (i) {
            case 0:
                return unknown;
            case 1:
                return nxdomain;
            case 2:
                return nxrrset;
            case 3:
            case 4:
            case 5:
            case 6:
                SetResponse setResponse = new SetResponse();
                setResponse.type = i;
                setResponse.data = null;
                return setResponse;
            default:
                throw new IllegalArgumentException("invalid type");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addRRset(RRset rRset) {
        if (this.data == null) {
            this.data = new ArrayList();
        }
        this.data.add(rRset);
    }

    public CNAMERecord getCNAME() {
        return (CNAMERecord) this.data.get(0).first();
    }

    public DNAMERecord getDNAME() {
        return (DNAMERecord) this.data.get(0).first();
    }

    public String toString() {
        switch (this.type) {
            case 0:
                return "unknown";
            case 1:
                return "NXDOMAIN";
            case 2:
                return "NXRRSET";
            case 3:
                return "delegation: " + this.data.get(0);
            case 4:
                return "CNAME: " + this.data.get(0);
            case 5:
                return "DNAME: " + this.data.get(0);
            case 6:
                return "successful";
            default:
                throw new IllegalStateException();
        }
    }
}
