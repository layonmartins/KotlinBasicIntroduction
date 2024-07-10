import java.util.Base64
import java.security.KeyFactory
import java.security.spec.PKCS8EncodedKeySpec
import java.security.spec.X509EncodedKeySpec
import javax.crypto.Cipher
import java.nio.charset.StandardCharsets

val msisdn = "19983202012"
var publicKeyBase64String =
    "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAu6fYv6vxHT9jGjGWvR1msa9EYY8wLzXBde9YRz+VpJ0YaL3nbjcS9852QSb8yNeft+XT2O8q2UBcAiV7OrFco8By3pgQXfpAYXWDClb2aIknreczELBDGNxnsaiFpDBB2PyCQ1HW6ZdoD9B0rbJcie8VzbgOaC79lYhhIQeQ+OE61dsXnbaJMlZrVfAo3nVJ7N/tbMN5kYKo6Kks98tdSyELyASYnGJvRlVG2eEcnex86Mv3npUNXqLfkFWOGCYBma4HjvYVvI0ncGEwr+u61hdD4EYt89U5iDiErUGpypuOynXlYEsVxOfl0Z1IL+OqzBVdZa9XSWeIhD/LOdODvQIDAQAB"
var privateKeyBase64String =
    "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDy7W9LHxAi7pKaoAVj2t0hEyKlsE5+qdgeHuDb2yRfmYfZyqW6cnFi0fhex8Uyk05q7rh5nVCrzB48HkERGGetYmAdfwlGh96giaQVuNSJoohNkR4k2RGgcmG97BFUBqY4YeHQEvRtCeALKdotFDSFsZrFVV7a3rPlh5XgpVTOkSYyPr2m8iwv/Ddjul2E47cwOzNu2PSqbyU/vimK/SOik80naFbjiDs0xNpaU1JJPzbXU+1sIoZHIbU31Whp0SH50ee5P4xA3N9SM+nKEPvJduInX3zJ8ugn5Uy9mt5bqo6vLVp6prPPeGPSpf67J4NKcxj9kCPorOCFC1kV9Ll9AgMBAAECggEAM2TKG+F5f3prp6zdFxARolKzDMys/p0eLNkphznoixUnKYt23mgh1t9HJX4sGRQTDgptGsWOcJohd2SLLXu1S3g5j2P16WcLUXltLm9I/8lT/t0JvI/z67bnOM/9poI1nk4PAP9RmNPzA0mab9kLd5FohgEWrUVaV+AEdF9l/sFLBopErBPmC6JQpo8BpILClNVb4zVCnwhrqMsV8pxdYqetEcLKAzmn4lMwYI2vp0IBFnSR7NHwJJFnZeQ2UrBKJxL6jxGmOrYHvzEgjG0OM9naopGZUzANOX0AsQuNjSwNMU7mcbFETIJHUS5FQvl8MVHDQlvVxjceJjL1ZRhJYQKBgQD7tZ3Q0VLRTdgUBC1pdQieNDdidcp7c47t8kdlqq9WaTq7cphV+OCGoU6shBat0IZuEz3upXQNQkjc3qDWLjwwhBFHbfayIBaCDzaYSeghG6W3x4jgsNAZDxhbkuYg/kpuQqS1Ae3H2jcDdLccTj8FUGplhMHBP1cPS8yTliApmQKBgQD3EX8YefU1jusZLv9LsykMxNinN0IZ75rfMIkyXnFKAHEFkUp1m3hcvolGrOU2dy1bp7akL4osdXdDyJq6K/M9lE664Ynuab0kdorr9U0Mz08r9FaHVJUS1JdbXpWsMtLouwo6xuv0qJoGLnO0X04YVlqFkZntammougvf2JwlhQKBgQDRg+gcA9CyxeABMUT3jeIhhYdAXpmvTo3/Q/boCj4uaCLqGkXw8ds6VRSehsg13+e1wjB/75p82tq5dlpcTVnubE/RrBd3RzxVAALKmmItBM1Y/y7REHv3D9iPiOQjPGeKBdEBldxtyRaXutQcLIlKjBgz7mA00dtOsSJVCtY0qQKBgE8OECbazzVF97/lI9crCpWFXvWSXtpBqsKDm0K8qW9OWNu5M6QSDR9P8EjnBai51Y+gSHacp4+2PmU4CRpM+dXYYKC3jhT1TIogTC9YHEFfDCw6UH2Y+OI/l/aqeyXQVWAWiR1pjRKJ6E7WCjvKywhKiUh34FLxW8GbVjVX8A6pAoGBAJHGu94c6qA603Su5dYWZ2X1PwuFAKCpSi6N2YuajMTK/LkUxQThBAq6iTrgvaII9jLR36ux6OHqzOZkTFxXE7xn0Iw20vz8Ry3z8Tt3Td5kj7jBcRfljWGI9ljGAoXlCKy1SXm/cMi0QKZDRcmnoP4cc01uv1Af6zycPy3ShCdm"

fun main() {
    println("msisdn -> $msisdn")
    val msisdnEncrypt = encryptWithPublicKey(msisdn, publicKeyBase64String)
    println("msisdnEncrypt -> $msisdnEncrypt")
    //val msisdnDecrypt = decryptWithPrivateKey(msisdnEncrypt, privateKeyBase64String)
    //println("msisdnDecrypt -> $msisdnDecrypt")
}

fun encryptWithPublicKey(msisdn: String, publicKeyBase64String: String): String {
    val publicKeyBytes: ByteArray = Base64.getDecoder().decode(publicKeyBase64String)
    val specPublica = X509EncodedKeySpec(publicKeyBytes)
    val keyFactory = KeyFactory.getInstance("RSA")
    val publicKey = keyFactory.generatePublic(specPublica)
    val cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding")
    cipher.init(Cipher.ENCRYPT_MODE, publicKey)
    val bytesCriptografados = cipher.doFinal(msisdn.toByteArray(StandardCharsets.UTF_8))
    return Base64.getEncoder().encodeToString(bytesCriptografados)
}

fun decryptWithPrivateKey(msisdnEncrypt: String?, privateKeyBase64: String): String {
    val privateKeyBytes = Base64.getDecoder().decode(privateKeyBase64)
    val privateSpec = PKCS8EncodedKeySpec(privateKeyBytes)
    val keyFactory = KeyFactory.getInstance("RSA")
    val privateKey = keyFactory.generatePrivate(privateSpec)
    val cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding")
    cipher.init(Cipher.DECRYPT_MODE, privateKey)
    val msisdnDescriptedBase64 = Base64.getDecoder().decode(msisdnEncrypt)
    val bytesDescriptedBase64 = cipher.doFinal(msisdnDescriptedBase64)
    return String(bytesDescriptedBase64, StandardCharsets.UTF_8)
}