fun main(args: Array<String>) {
    cityWeather()
}

fun printMessage() {
    println("Use the val keyword when the value doesn't change. ");
    println("Use the var keyword when the value can change.");
    println("When you define a function, you define the parameters that can be passed to it. ");
    println("When you call a function, you pass arguments for the parameters.");
}

fun fixPrintCompilerError() {
    println("New chat message from a friend")
}

fun discountMessage() {
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    println(offer)
}

fun stringConcatenation() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

fun messageFormatting() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

fun basicMathOperation() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

private fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber;
}

fun emailSender() {
    val firstUserEmailId = "user_one@gmail.com"

    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

private fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId";
}

fun pedometer() {
    val steps = 4000
    val caloriesBurned = mapStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}

private fun mapStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedforEachStep = 0.04
    return numberOfSteps * caloriesBurnedforEachStep
}

fun compareTimes() {
    println("Today time vs YesterdayTime ${compareScreenTimeMinutes(300, 250)}");
    println("Today time vs YesterdayTime ${compareScreenTimeMinutes(300, 300)}");
    println("Today time vs YesterdayTime ${compareScreenTimeMinutes(200, 220)}");
}

private fun compareScreenTimeMinutes(todayTime: Int, yesterdayTime: Int): Boolean {
    return todayTime > yesterdayTime;
}

fun cityWeather() {
    val weatherInfo = listOf(
        "Ankara,27,31,82",
        "Tokyo,32,36,10",
        "Cape Town,59,64,2",
        "Guatemala City,50,55,7"
    )
    for (weather in weatherInfo) {
        val info = weather.split(",")
        printWeatherInfo(
            info[0],
            info[1],
            info[2],
            info[3]
        )
    }
}

private fun printWeatherInfo(city: String, minTemp: String, maxTemp: String, rain: String) {
    println("City: $city")
    println("Low temperature: $minTemp, High temperature: $maxTemp")
    println("Chance of rain: $rain%")
    println()
}
