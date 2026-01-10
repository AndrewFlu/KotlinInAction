package ch_12_annotations_and_reflection.annotation_declaration


class CustomAnnotationTestDrive {
    @CustomName("Custom name for field")
    val kotlinName = "Kotlin"
}

fun main() {
    val testClass = CustomAnnotationTestDrive();
    println("kotlinName field contains value: [${testClass.kotlinName}]")
}
