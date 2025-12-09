package ch_05_lambdas.functional_interfaces

// функциональный интерфейс
fun interface Receptionist {
    fun reception(client: Client)
}

// Дата-класс
data class Client (val name: String)

// функция, определённая с помощью функционального интерфейса
fun greetTheGuests(receptionManager: Receptionist) {
    receptionManager.reception(Client("Mike"))
}


// функция, определённая с помощью функциональных типов Котлин
fun greetTheGuestsFunctional(receptionManager: (Client) -> Unit) {
    receptionManager(Client("Jesika"))
}