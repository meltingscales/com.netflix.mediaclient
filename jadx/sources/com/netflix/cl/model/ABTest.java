package com.netflix.cl.model;

/* loaded from: classes2.dex */
public final class ABTest {
    int cell;
    String testId;

    public int getCell() {
        return this.cell;
    }

    public String getTestId() {
        return this.testId;
    }

    public ABTest(String str, int i) {
        this.testId = str;
        this.cell = i;
    }

    public ABTest(int i, int i2) {
        this(String.valueOf(i), i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ABTest) {
            ABTest aBTest = (ABTest) obj;
            return this.testId.equals(aBTest.getTestId()) && this.cell == aBTest.getCell();
        }
        return false;
    }

    public int hashCode() {
        return (Integer.parseInt(this.testId) * 100) + this.cell;
    }
}
