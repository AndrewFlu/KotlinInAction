package ch_13_dsl.invoke

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*

class VatResolver(val vat: Vat) {
    operator fun invoke(salary_net: Int): Int {
        return salary_net - (salary_net / 100 * vat.value)
    }
}

enum class Vat(val value: Int) {
    vat_13(13),
    vat_15(15),
    vat_18(18),
    vat_20(20),
}

fun main() {
    val salary = 120_000
    val vatResolver_13 = VatResolver(Vat.vat_13)
    val vatResolver_18 = VatResolver(Vat.vat_18)


// Настройка формата с пробелом в качестве разделителя
    val symbols = DecimalFormatSymbols(Locale.getDefault()).apply {
        groupingSeparator = ' '
    }
    val formatter = DecimalFormat("#,###", symbols)
    println(formatter.format(salary))

    printSalaryAndVatData(formatter, salary, vatResolver_13)
    printSalaryAndVatData(formatter, salary, vatResolver_18)
}

private fun printSalaryAndVatData(
    formatter: DecimalFormat,
    salary: Int,
    vatResolver: VatResolver
) {
    println(
        "ЗП (до налога): ${formatter.format(salary)} руб, " +
                "ЗП после налога ${formatter.format(vatResolver.vat.value)}%: " +
                "${formatter.format(vatResolver.invoke(salary))} руб."
    )
}