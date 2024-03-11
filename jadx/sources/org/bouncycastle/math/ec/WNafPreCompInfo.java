package org.bouncycastle.math.ec;

/* loaded from: classes6.dex */
public class WNafPreCompInfo implements PreCompInfo {
    volatile int promotionCountdown = 4;
    protected int confWidth = -1;
    protected ECPoint[] preComp = null;
    protected ECPoint[] preCompNeg = null;
    protected ECPoint twice = null;
    protected int width = -1;

    public int getConfWidth() {
        return this.confWidth;
    }

    public ECPoint[] getPreComp() {
        return this.preComp;
    }

    public ECPoint[] getPreCompNeg() {
        return this.preCompNeg;
    }

    public ECPoint getTwice() {
        return this.twice;
    }

    public int getWidth() {
        return this.width;
    }

    public void setConfWidth(int i) {
        this.confWidth = i;
    }

    public void setPreComp(ECPoint[] eCPointArr) {
        this.preComp = eCPointArr;
    }

    public void setPreCompNeg(ECPoint[] eCPointArr) {
        this.preCompNeg = eCPointArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPromotionCountdown(int i) {
        this.promotionCountdown = i;
    }

    public void setTwice(ECPoint eCPoint) {
        this.twice = eCPoint;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
