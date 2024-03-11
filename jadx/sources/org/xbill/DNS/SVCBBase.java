package org.xbill.DNS;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Supplier;
import o.C8545dpo;
import org.xbill.DNS.SVCBBase;

/* loaded from: classes5.dex */
abstract class SVCBBase extends Record {
    private static final ParameterMnemonic parameters;
    protected final Map<Integer, ParameterBase> svcParams = new TreeMap();
    protected int svcPriority;
    protected Name targetName;

    /* loaded from: classes5.dex */
    public static abstract class ParameterBase {
        public abstract void fromWire(byte[] bArr);

        public abstract String toString();

        public abstract byte[] toWire();
    }

    public ParameterBase getSvcParamValue(int i) {
        return this.svcParams.get(Integer.valueOf(i));
    }

    /* loaded from: classes5.dex */
    static class ParameterMnemonic extends Mnemonic {
        private HashMap<Integer, Supplier<ParameterBase>> factories;

        public ParameterMnemonic() {
            super("SVCB/HTTPS Parameters", 3);
            setPrefix(SignupConstants.Error.DEBUG_FIELD_KEY);
            setNumericAllowed(true);
            setMaximum(65535);
            this.factories = new HashMap<>();
        }

        public void add(int i, String str, Supplier<ParameterBase> supplier) {
            super.add(i, str);
            this.factories.put(Integer.valueOf(i), supplier);
        }

        public Supplier<ParameterBase> getFactory(int i) {
            return this.factories.get(Integer.valueOf(i));
        }
    }

    static {
        ParameterMnemonic parameterMnemonic = new ParameterMnemonic();
        parameters = parameterMnemonic;
        parameterMnemonic.add(0, "mandatory", new Supplier() { // from class: org.xbill.DNS.SVCBBase$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new SVCBBase.ParameterMandatory();
            }
        });
        parameterMnemonic.add(1, "alpn", new Supplier() { // from class: org.xbill.DNS.SVCBBase$$ExternalSyntheticLambda1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new SVCBBase.ParameterAlpn();
            }
        });
        parameterMnemonic.add(2, "no-default-alpn", new Supplier() { // from class: org.xbill.DNS.SVCBBase$$ExternalSyntheticLambda2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new SVCBBase.ParameterNoDefaultAlpn();
            }
        });
        parameterMnemonic.add(3, "port", new Supplier() { // from class: org.xbill.DNS.SVCBBase$$ExternalSyntheticLambda3
            @Override // java.util.function.Supplier
            public final Object get() {
                return new SVCBBase.ParameterPort();
            }
        });
        parameterMnemonic.add(4, "ipv4hint", new Supplier() { // from class: org.xbill.DNS.SVCBBase$$ExternalSyntheticLambda4
            @Override // java.util.function.Supplier
            public final Object get() {
                return new SVCBBase.ParameterIpv4Hint();
            }
        });
        parameterMnemonic.add(5, "echconfig", new Supplier() { // from class: org.xbill.DNS.SVCBBase$$ExternalSyntheticLambda5
            @Override // java.util.function.Supplier
            public final Object get() {
                return new SVCBBase.ParameterEchConfig();
            }
        });
        parameterMnemonic.add(6, "ipv6hint", new Supplier() { // from class: org.xbill.DNS.SVCBBase$$ExternalSyntheticLambda6
            @Override // java.util.function.Supplier
            public final Object get() {
                return new SVCBBase.ParameterIpv6Hint();
            }
        });
    }

    /* loaded from: classes5.dex */
    public static class ParameterMandatory extends ParameterBase {
        private final List<Integer> values = new ArrayList();

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public void fromWire(byte[] bArr) {
            this.values.clear();
            DNSInput dNSInput = new DNSInput(bArr);
            while (dNSInput.remaining() >= 2) {
                this.values.add(Integer.valueOf(dNSInput.readU16()));
            }
            if (dNSInput.remaining() > 0) {
                throw new WireParseException("Unexpected number of bytes in mandatory parameter");
            }
        }

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public byte[] toWire() {
            DNSOutput dNSOutput = new DNSOutput();
            for (Integer num : this.values) {
                dNSOutput.writeU16(num.intValue());
            }
            return dNSOutput.toByteArray();
        }

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Integer num : this.values) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(SVCBBase.parameters.getText(num.intValue()));
            }
            return sb.toString();
        }
    }

    /* loaded from: classes5.dex */
    public static class ParameterAlpn extends ParameterBase {
        private final List<byte[]> values = new ArrayList();

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public void fromWire(byte[] bArr) {
            this.values.clear();
            DNSInput dNSInput = new DNSInput(bArr);
            while (dNSInput.remaining() > 0) {
                this.values.add(dNSInput.readCountedString());
            }
        }

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public byte[] toWire() {
            DNSOutput dNSOutput = new DNSOutput();
            for (byte[] bArr : this.values) {
                dNSOutput.writeCountedString(bArr);
            }
            return dNSOutput.toByteArray();
        }

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (byte[] bArr : this.values) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(Record.byteArrayToString(bArr, false).replaceAll(",", "\\\\,"));
            }
            return sb.toString();
        }
    }

    /* loaded from: classes5.dex */
    public static class ParameterNoDefaultAlpn extends ParameterBase {
        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public String toString() {
            return "";
        }

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public byte[] toWire() {
            return new byte[0];
        }

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public void fromWire(byte[] bArr) {
            if (bArr.length > 0) {
                throw new WireParseException("No value can be specified for no-default-alpn");
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class ParameterPort extends ParameterBase {
        private int port;

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public void fromWire(byte[] bArr) {
            DNSInput dNSInput = new DNSInput(bArr);
            this.port = dNSInput.readU16();
            if (dNSInput.remaining() > 0) {
                throw new WireParseException("Unexpected number of bytes in port parameter");
            }
        }

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public byte[] toWire() {
            DNSOutput dNSOutput = new DNSOutput();
            dNSOutput.writeU16(this.port);
            return dNSOutput.toByteArray();
        }

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public String toString() {
            return Integer.toString(this.port);
        }
    }

    /* loaded from: classes5.dex */
    public static class ParameterIpv4Hint extends ParameterBase {
        private final List<byte[]> addresses = new ArrayList();

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public void fromWire(byte[] bArr) {
            this.addresses.clear();
            DNSInput dNSInput = new DNSInput(bArr);
            while (dNSInput.remaining() >= 4) {
                this.addresses.add(dNSInput.readByteArray(4));
            }
            if (dNSInput.remaining() > 0) {
                throw new WireParseException("Unexpected number of bytes in ipv4hint parameter");
            }
        }

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public byte[] toWire() {
            DNSOutput dNSOutput = new DNSOutput();
            for (byte[] bArr : this.addresses) {
                dNSOutput.writeByteArray(bArr);
            }
            return dNSOutput.toByteArray();
        }

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (byte[] bArr : this.addresses) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(Address.toDottedQuad(bArr));
            }
            return sb.toString();
        }
    }

    /* loaded from: classes5.dex */
    public static class ParameterEchConfig extends ParameterBase {
        private byte[] data;

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public void fromWire(byte[] bArr) {
            this.data = bArr;
        }

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public byte[] toWire() {
            return this.data;
        }

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public String toString() {
            return C8545dpo.d().d(this.data);
        }
    }

    /* loaded from: classes5.dex */
    public static class ParameterIpv6Hint extends ParameterBase {
        private final List<byte[]> addresses = new ArrayList();

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public void fromWire(byte[] bArr) {
            this.addresses.clear();
            DNSInput dNSInput = new DNSInput(bArr);
            while (dNSInput.remaining() >= 16) {
                this.addresses.add(dNSInput.readByteArray(16));
            }
            if (dNSInput.remaining() > 0) {
                throw new WireParseException("Unexpected number of bytes in ipv6hint parameter");
            }
        }

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public byte[] toWire() {
            DNSOutput dNSOutput = new DNSOutput();
            for (byte[] bArr : this.addresses) {
                dNSOutput.writeByteArray(bArr);
            }
            return dNSOutput.toByteArray();
        }

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (byte[] bArr : this.addresses) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                try {
                    sb.append(InetAddress.getByAddress(null, bArr).getHostAddress());
                } catch (UnknownHostException e) {
                    return e.getMessage();
                }
            }
            return sb.toString();
        }
    }

    /* loaded from: classes5.dex */
    public static class ParameterUnknown extends ParameterBase {
        private int key;
        private byte[] value = new byte[0];

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public void fromWire(byte[] bArr) {
            this.value = bArr;
        }

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public byte[] toWire() {
            return this.value;
        }

        public ParameterUnknown(int i) {
            this.key = i;
        }

        @Override // org.xbill.DNS.SVCBBase.ParameterBase
        public String toString() {
            return Record.byteArrayToString(this.value, false);
        }
    }

    protected boolean checkMandatoryParams() {
        ParameterMandatory parameterMandatory = (ParameterMandatory) getSvcParamValue(0);
        if (parameterMandatory != null) {
            for (Integer num : parameterMandatory.values) {
                if (getSvcParamValue(num.intValue()) == null) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override // org.xbill.DNS.Record
    protected void rrFromWire(DNSInput dNSInput) {
        ParameterBase parameterUnknown;
        this.svcPriority = dNSInput.readU16();
        this.targetName = new Name(dNSInput);
        this.svcParams.clear();
        while (dNSInput.remaining() >= 4) {
            int readU16 = dNSInput.readU16();
            byte[] readByteArray = dNSInput.readByteArray(dNSInput.readU16());
            Supplier<ParameterBase> factory = parameters.getFactory(readU16);
            if (factory != null) {
                parameterUnknown = factory.get();
            } else {
                parameterUnknown = new ParameterUnknown(readU16);
            }
            parameterUnknown.fromWire(readByteArray);
            this.svcParams.put(Integer.valueOf(readU16), parameterUnknown);
        }
        if (dNSInput.remaining() > 0) {
            throw new WireParseException("Record had unexpected number of bytes");
        }
        if (!checkMandatoryParams()) {
            throw new WireParseException("Not all mandatory SvcParams are specified");
        }
    }

    @Override // org.xbill.DNS.Record
    protected String rrToString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.svcPriority);
        sb.append(" ");
        sb.append(this.targetName);
        for (Integer num : this.svcParams.keySet()) {
            sb.append(" ");
            sb.append(parameters.getText(num.intValue()));
            String parameterBase = this.svcParams.get(num).toString();
            if (parameterBase != null && !parameterBase.isEmpty()) {
                sb.append("=");
                sb.append(parameterBase);
            }
        }
        return sb.toString();
    }

    @Override // org.xbill.DNS.Record
    protected void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeU16(this.svcPriority);
        this.targetName.toWire(dNSOutput, null, z);
        for (Integer num : this.svcParams.keySet()) {
            dNSOutput.writeU16(num.intValue());
            byte[] wire = this.svcParams.get(num).toWire();
            dNSOutput.writeU16(wire.length);
            dNSOutput.writeByteArray(wire);
        }
    }
}