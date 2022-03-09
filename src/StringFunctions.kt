import android.view.View

class StringFunctions {
	/* Check an Email Address string looks to be in the correct format. Usage: MyApp.stringFunctions.IsValidEmail("user@domain.com") - returns Boolean */
    fun IsValidEmail(testStr:String) : Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(testStr).matches()
    }
}