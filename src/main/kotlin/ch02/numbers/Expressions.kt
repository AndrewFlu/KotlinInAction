package ch02.numbers

interface Expression

class Number(val value: Int) : Expression
class Summarized(val left: Expression, val right: Expression) : Expression