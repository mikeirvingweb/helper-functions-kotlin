import android.view.View

class KeyboardFunctions {
	/* Give Focus to Edit Text and Fire up Keyboard - Usage: MyApp.keyboardFunctions.GiveFocusAndKeyboardToEditText(myEditText) */
	fun GiveFocusAndKeyboardToEditText(inEditText : EditText) {
        inEditText.setFocusableInTouchMode(true);
        inEditText.requestFocus();

        val inputMethodManager = this
            .getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.showSoftInput(inEditText, InputMethodManager.SHOW_IMPLICIT)
    }

	/* Hide the keyboard / remove focus from active EditText - Usage: MyApp.keyboardFunctions.HideKeyboard(myEditText) */
    fun HideKeyboard(inEditText : EditText) {
        val imm = this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(inEditText.windowToken, 0)

        // revisit - clear flashing cursor on unfocus
        inEditText.clearFocus();
        inEditText.setFocusableInTouchMode(false);
        inEditText.setFocusableInTouchMode(true);
    }
}