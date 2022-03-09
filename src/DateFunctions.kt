import java.time.LocalDateTime
import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatter
import java.util.*

class DateFunctions {
	/* Get just the date from a Date object, in dd/MM/yy format - returns String - Usage: MyApp.dateFunctions.ShortDateString(myDate) */
    fun ShortDateString(date: java.util.Date) : String {
        val pattern = "dd/MM/yy"
        val simpleDateFormat = SimpleDateFormat(pattern)
        return simpleDateFormat.format(date)
    }

	/* Get just the time from a Date, in HH:mm format - returns String - Usage: MyApp.dateFunctions.ShortTimeString(myDate) */
    fun ShortTimeString(date: java.util.Date) : String {
        val pattern = "HH:mm"
        val simpleDateFormat = SimpleDateFormat(pattern)
        return simpleDateFormat.format(date)
    }
}