package ch_12_annotations_and_reflection.target_using_point;

public class CertificateTestDrive {
    public static void main(String[] args) {
        CertificateManager certManager = new CertificateManager();

        // вызов метода для get()-свойства certificete, аннотированного @get:JvmName("obtainCertificate")
        String certificate = certManager.obtainCertificate();
        // вызов метода для set()-свойства certificete, аннотированного @get:JvmName("putCertificate")
        certManager.putCertificate("-----BEGIN CERTIFICATE-----");
    }
}
