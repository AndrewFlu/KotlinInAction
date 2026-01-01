package ch_10_higher_order_functions.refactoring_by_lambdas

data class SiteVisit(val path: String, val duration: Double, val os: OS)

enum class OS {
    WINDOWS,
    MAC_OS,
    LINUX,
    IOS,
    ANDROID,
}

val log = listOf(
    SiteVisit("/", 30.0, OS.WINDOWS),
    SiteVisit("/", 22.0, OS.MAC_OS),
    SiteVisit("/", 12.0, OS.MAC_OS),
    SiteVisit("/login", 12.0, OS.WINDOWS),
    SiteVisit("/signup", 8.0, OS.IOS),
    SiteVisit("/", 16.3, OS.ANDROID)
)

fun windowsSessionDurationAverage() =
    log.filter { it.os == OS.WINDOWS }
        .map(SiteVisit::duration)
        .average()

fun List<SiteVisit>.averageDurationFor(os: OS) =
    filter { it.os == os }
        .map(SiteVisit::duration)
        .average()

fun List<SiteVisit>.averageDurationFor(predicate: ((SiteVisit) -> Boolean)) =
    filter(predicate).map(SiteVisit::duration).average()

fun main() {
    println("Средняя продолжительность посещений с машин Windows: ${windowsSessionDurationAverage()}")
    println("Средняя продолжительность посещений с машин Mac OS: ${log.averageDurationFor(OS.MAC_OS)}")

    val averageMobileDuration = log.filter { it.os in setOf(OS.IOS, OS.ANDROID) }.map(SiteVisit::duration).average()
    println("Средняя продолжительность посещений с мобильных устройств: ${averageMobileDuration}")


    println(
        "Средняя продолжительность посещения страницы регистрации: " +
                "${log.averageDurationFor { siteVisit -> siteVisit.path == "/signup" }}"
    )

    println("Средняя продолжительность посещения главной страницы сайта пользователей Mac OS: " +
            "${log.averageDurationFor { it.os == OS.MAC_OS && it.path == "/" }}"
    )
}