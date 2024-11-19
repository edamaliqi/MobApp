class CredentialsManager {
    fun isValidEmail(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun isValidPassword(password: String): Boolean {
        return password.length >= 6
    }

    fun login(email: String, password: String): Boolean {
        return email == "test@te.st" && password == "1234"
    }
}



