import kotlinx.coroutines.*

val scope = CoroutineScope(Dispatchers.Default)
suspend fun main() = coroutineScope {
    val deferredResult = scope.async {
        println("Начало вычислений")
        delay(1000L)
        10
    }

    println("Корутина запущена")
    val result = deferredResult.await()
    println("Результат: $result")
}

/*
val scope = CoroutineScope(Dispatchers.Default)
suspend fun main() = coroutineScope {
    scope.launch {
        repeat(5) {
            println("Работаю в корутине")
            delay(1000L)
        }
    }

    repeat(5) {
        println("Работаю в main")
        delay(1000L)
    }
}

 */

/*
val scope = CoroutineScope(Dispatchers.Default)
suspend fun main() = coroutineScope {
    //launch { doWork() }
    //println("symbols")

    /*
    val a = async { loadA() }
    val b = async { loadB() }
    val c = a.await() + b.await()

     */

    /*
    val job = scope.launch {
        repeat(10){
            delay(1000L)
            println(it)
        }
    }
    job.cancel()

     */

    /*
    launch (Dispatchers.IO){
        println("start ${Thread.currentThread().name}")
    }
    Dispatchers.Unconfined
    println("end ${Thread.currentThread().name}")

     */
}

 */

suspend fun loadA(): Int {
    delay(1000L)
    return 10
}

suspend fun loadB(): Int {
    delay(1000L)
    return 20
}

suspend fun doWork() {
    for (i in 0..5) {
        delay(400L)
        println(i)
    }
}